package com.cloudera;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/** Generates schema data as Java objects with random values. */
public class RandomData implements Iterable<Object> {
    private final Schema root;
    private final long seed;
    private final int count;

    public RandomData(Schema schema, int count) {
	this(schema, count, System.currentTimeMillis());
    }

    public RandomData(Schema schema, int count, long seed) {
	this.root = schema;
	this.seed = seed;
	this.count = count;
    }
  
    public Iterator<Object> iterator() {
	return new Iterator<Object>() {
	    private int n;
	    private Random random = new Random(seed);
	    public boolean hasNext() { return n < count; }
	    public Object next() {
		n++;
		return generate(root, random, 0);
	    }
	    public void remove() { throw new UnsupportedOperationException(); }
	};
    }
  
    @SuppressWarnings(value="unchecked")
    private static Object generate(Schema schema, Random random, int d) {
	switch (schema.getType()) {
	case RECORD:
	    GenericRecord record = new GenericData.Record(schema);
	    for (Schema.Field field : schema.getFields())
		record.put(field.name(), generate(field.schema(), random, d+1));
	    return record;
	case ENUM:
	    List<String> symbols = schema.getEnumSymbols();
      return new GenericData.EnumSymbol
	  (schema, symbols.get(random.nextInt(symbols.size())));
	case ARRAY:
	    int length = (random.nextInt(5)+2)-d;
      GenericArray<Object> array =
	  new GenericData.Array(length<=0?0:length, schema);
      for (int i = 0; i < length; i++)
	  array.add(generate(schema.getElementType(), random, d+1));
      return array;
	case MAP:
	    length = (random.nextInt(5)+2)-d;
	    Map<Object,Object> map = new HashMap<Object,Object>(length<=0?0:length);
	    for (int i = 0; i < length; i++) {
		map.put(randomUtf8(random, 40),
			generate(schema.getValueType(), random, d+1));
	    }
	    return map;
	case UNION:
	    List<Schema> types = schema.getTypes();
	    return generate(types.get(random.nextInt(types.size())), random, d);
	case FIXED:
	    byte[] bytes = new byte[schema.getFixedSize()];
	    random.nextBytes(bytes);
	    return new GenericData.Fixed(schema, bytes);
	case STRING:  return randomUtf8(random, 40);
	case BYTES:   return randomBytes(random, 40);
	case INT:     return random.nextInt();
	case LONG:    return random.nextLong();
	case FLOAT:   return random.nextFloat();
	case DOUBLE:  return random.nextDouble();
	case BOOLEAN: return random.nextBoolean();
	case NULL:    return null;
	default: throw new RuntimeException("Unknown type: "+schema);
	}
    }

    private static Utf8 randomUtf8(Random rand, int maxLength) {
	Utf8 utf8 = new Utf8().setLength(rand.nextInt(maxLength));
	for (int i = 0; i < utf8.getLength(); i++) {
	    utf8.getBytes()[i] = (byte)('a'+rand.nextInt('z'-'a'));
	}
	return utf8;
    }

    private static ByteBuffer randomBytes(Random rand, int maxLength) {
	ByteBuffer bytes = ByteBuffer.allocate(rand.nextInt(maxLength));
	bytes.limit(bytes.capacity());
	rand.nextBytes(bytes.array());
	return bytes;
    }
}