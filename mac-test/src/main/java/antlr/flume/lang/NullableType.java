/**
 * Licensed to Odiago, Inc. under one or more contributor license
 * agreements.  See the NOTICE.txt file distributed with this work for
 * additional information regarding copyright ownership.  Odiago, Inc.
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package antlr.flume.lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Represents a nullable instance of a type (e.g. "INT" vs. "INT NOT NULL").
 */
public class NullableType extends Type {
  
  /** the type of the non-null type being wrapped. */
  private Type mType;

  /**
   * Constructor used by Type's static initializer to create singleton
   * instances for primitive types.
   */
  protected NullableType(TypeName name) {
    super(TypeName.NULLABLE);
    mType = new Type(name);
  }

  /** Primary constructor; allows this to wrap any type, including
   * complex types (e.g., PRECISE(n), LIST(t), etc.).
   */
  public NullableType(Type type) {
    super(TypeName.NULLABLE);
    mType = type;
    assert null != mType;

    // This is an illegal configuration and will cause Avro to fail
    // (Cannot nest unions directly.)
    assert !(mType instanceof NullableType);
  }

  /** Return the inner type that we're making nullable. */
  public Type getInnerType() {
    return mType;
  }

  @Override
  public NullableType asNullable() {
    return this; // Already nullable.
  }

  @Override
  public boolean isNullable() {
    return true;
  }

  @Override
  public boolean isNumeric() {
    return mType.isNumeric();
  }

  @Override
  public boolean isComparable() {
    return mType.isComparable();
  }

  @Override
  public boolean isConcrete() {
    return mType.isConcrete();
  }

  @Override
  public boolean isScalar() {
    return mType.isScalar();
  }

  @Override
  public boolean isPrimitive() {
    return mType.isPrimitive();
  }

  @Override
  /** 
   * @return the TypeName of the non-null type being wrapped.
   */
  public TypeName getPrimitiveTypeName() {
    return mType.getPrimitiveTypeName();
  }

  @Override
  public Schema getAvroSchema() {
    // Our schema is a union of our ordinary type, or null.
    Schema subSchema = mType.getAvroSchema();
    if (subSchema.equals(Schema.create(Schema.Type.NULL))) {
      return subSchema; // 'NULL' -> NULL schema; use directly.
    } else {
      // Make a union of subSchema and null.
      List<Schema> unionTypes = new ArrayList<Schema>();
      unionTypes.add(mType.getAvroSchema());
      unionTypes.add(Schema.create(Schema.Type.NULL));
      return Schema.createUnion(unionTypes);
    }
  }

  /** {@inheritDoc} */
  @Override
  public Type replaceUniversal(Map<Type, Type> universalMapping) throws TypeCheckException {
    return new NullableType(mType.replaceUniversal(universalMapping));
  }

  @Override
  public String toString() {
    return mType.toString(true);
  }

  @Override
  public int hashCode() {
    // Return a different position than its basic type counterpart.
    return 3 * mType.hashCode() + 7;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    } else if (other == null) {
      return false;
    } else if (!other.getClass().equals(getClass())) {
      return false;
    }

    NullableType otherType = (NullableType) other;
    if (mType.equals(otherType.mType)) {
      return true;
    }

    return false;
  }

  /** {@inheritDoc} */
  @Override
  public Object coerceValue(Type valType, Object val) {
    if (null == val) {
      return null;
    } else if (valType.equals(mType)) {
      // We're converting from FOO NOT NULL to FOO; just return
      // the same entry.
      return val;
    } else {
      // Factor out 'Nullable' nature from both sides and recurse.
      Type trueValType = valType;
      if (valType instanceof NullableType) {
        trueValType = ((NullableType) valType).getInnerType();
      }
      return mType.coerceValue(trueValType, val);
    }
  }
}
