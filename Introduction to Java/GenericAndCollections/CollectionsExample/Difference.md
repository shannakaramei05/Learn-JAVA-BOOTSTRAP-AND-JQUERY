EXAMPLE WE INSERT VALUE TO EACH COLLEECTIONS

1. HASH MAP
   hmap1.put(14, "George");
   hmap1.put(33, "Paul");
   hmap1.put(16, "Jane");
   hmap1.put(7, "Brian");
   hmap1.put(19, "Jack");

-- output when we print each value --
Value : Jane || Key : 16
Value : Paul || Key : 33
Value : Jack || Key : 19
Value : Brian || Key : 7
Value : George || Key : 14

==> the top outputl (Jane,16) is the last we insert. and the first we insert (George,14) in the botton.

2. HahsTable
   hashTable.put("key1", "Adam");
   hashTable.put("key2", "Brian");
   hashTable.put("key3", "Charles");
   hashTable.put("key4", "Dean");
   hashTable.put("key5", "Peter");

-- output when we print each value --
key is key5 & value is Peter
key is key4 & value is Dean
key is key3 & value is Charles
key is key2 & value is Brian
key is key1 & value is Adam

=> it differences with the Hashtable, the first key-value we insert will going to the top

3. LinkedHasMap
   lihaMap.put(21, "Abe");
   lihaMap.put(23, "Drown");
   lihaMap.put(1, "Jack");
   lihaMap.put(3, "Karen");
   lihaMap.put(100, "Lin");

-- output when we print each value --
The Key: 21 and value is: Abe
The Key: 23 and value is: Drown
The Key: 1 and value is: Jack
The Key: 3 and value is: Karen
The Key: 100 and value is: Lin

=> print the output like we insert

4. TreeMap
   trmap.put(1, "Object 1");
   trmap.put(17, "Object 2");
   trmap.put(50, "Object 3");
   trmap.put(7, "Object 4");
   trmap.put(3, "Object 5");

-- output when we print each value --

Key is: 1 and Value is: Object 1
Key is: 3 and Value is: Object 5
Key is: 7 and Value is: Object 4
Key is: 17 and Value is: Object 2
Key is: 50 and Value is: Object 3

=>it will print sorted by key
