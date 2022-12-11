Collection Interface :

1. List : This Collection interface represents list of things.
2. Set : This collection interface represents unique things.
3. Map : This collection interface represents things with a unique ID.
4. Queue : This collection interface represents things arraged by the order in which they are to be processed.

--- <<interface>> ---

1. <<interface>>SET
   <- Hash set <- LinkedHasSet
   <- <<interface>> SortedSet <- <<interfae>> NavigableSet <- TreeSet
2. <<interface>>List
   <-ArrayList>
   <-Vector>
3. <<interface>>Queue
   <-LinkedList>
   <-PriorityQueue>

LIST of Collections Classes

1. Map
   --Implements--

   - HashMap
   - Hashtable
   - TreeMap
   - LinkedHashMap

2. Set
   --Implements--

   - HashSet
   - LinkedHashSet
   - TreeSet

3. List
   --Implements--

   - ArrayList
   - Vector
   - LinkedList

4. Queue
   --Implements--

   - PriorityQueue

5. Utilities
   --Implements--

   - Collections
   - Arrays
