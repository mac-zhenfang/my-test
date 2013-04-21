function reduce(key, values) {
	 var sum=0;
     for(var i in values) sum += values[i];
	 return sum;
}