# [Java Collection](https://akbarhps.github.io/java-collection/)

A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others
do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it
provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass
collections around and manipulate them where maximum generality is desired.  
[Official Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)

Sumber Tutorial:
[Youtube](https://www.youtube.com/watch?v=_JEMfq4k2O4) |
[Slide](https://docs.google.com/presentation/d/1IybRjjqE2hIrrq2aLbZ1qw_7o6vhgg27dVZVc4gQF9g/edit#slide=id.p)

## <span name="daftar-isi">Daftar Isi</span>

- [Pengenalan Collection](#pengenalan-collection)
- [Java Collection Interface](#java-collection-interface)
- [Iterable Interface](#iterable-interface)
- [Iterator Interface](#iterator-interface)
- [Collection Interface](#collection-interface)
- [ArrayList Class](#arraylist-class)
- [LinkedList Class](#linkedlist-class)
- [Immutable List](#immutable-list)
- [Set Interface](#set-interface)
- [Immutable Set](#immutable-set)
- [SortedSet Interface](#sortedset-interface)
- [Navigable Set](#navigable-set)
- [Queue Interface](#queue-interface)
- [Deque Interface](#deque-interface)

## <span name="pengenalan-collection" href="#daftar-isi">Pengenalan Collection</span>

---

- Collection adalah hal umum yang biasa dimiliki di bahasa pemrograman, seperti PHP, Python, Ruby, dan lain-lain
- Collection atau kadang disebut container, adalah object yang mengumpulkan atau berisikan data-data mirip
  seperti `Array`
- Java telah menyediakan class-class collection yang sudah bisa langsung kita gunakan, tanpa tambahan library
- Semua class collection di Java adalah `Generic Class`, sehingga kita bisa menggunakan Java Collection dengan tipe data
  apapun

## <span name="java-collection" href="#daftar-isi">Java Collection</span>

---

- `Interfaces`, ini adalah kontrak representasi dari collection. Semua collection di Java memiliki kontrak interface,
  sehingga jika kita mau, kita juga bisa membuat implementasinya sendiri
- `Implementation`, tidak perlu khawatir, kita juga bisa menggunakan implementasi yang sudah dibuat oleh Java, semua
  interface collection sudah ada implementasi class nya di Java.
- `Algorithms`, Java juga sudah menyediakan algoritma-algoritma yang umum digunakan di collection, seperti pencarian dan
  pengurutan data

## <span name="java-collection-interface" href="#daftar-isi">Java Collection Interface</span>

---

### Java Collection Interface UML

![Java Collection Interface UML](https://user-images.githubusercontent.com/69947442/127863095-d904bc42-e779-46ff-ba25-1fa2252e9866.png)

## <span name="iterable-interface" href="#daftar-isi">Iterable Interface</span>

---

- Iterable adalah parent untuk semua collection di Java, kecuali Map
- Iterable sendiri sangat sederhana, hanya digunakan agar mendukung `for-each loop`
- Karena semua collection pasti implement iterable, secara otomatis maka semua collection di Java mendukung
  perulangan `for-each`

Contoh:

```java
public class Main {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Akbar", "Hasadi", "Putra", "Siregar");

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
// Output: Akbar Hasadi Putra Siregar
```

## <span name="iterator-interface" href="#daftar-isi">Iterator Interface</span>

---

- Sebenarnya `for-each` di Iterable bisa terjadi karena ada method `iterator()` yang mengembalikan object `Iterator`
- `Iterator` adalah interface yang mendefinisikan cara kita mengakses element di collection secara `sequential`
- `For-each` sendiri muncul sejak `Java 5`, sebelum `Java 5` untuk melakukan iterasi pada collection biasanya dilakukan
  secara manual dengan menggunakan `Iterator Object`

Contoh:

```java
public class Main {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Akbar", "Hasadi", "Putra", "Siregar");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // Output: Akbar Hasadi Putra Siregar 
    }
}
```

Documentation:

- `boolean hasNext();`

```java
/**
 * Returns {@code true} if the iteration has more elements.
 * (In other words, returns {@code true} if {@link #next} would
 * return an element rather than throwing an exception.)
 *
 * @return {@code true} if the iteration has more elements
 */
```

- `E next();`

```java
/**
 * Returns the next element in the iteration.
 *
 * @return the next element in the iteration
 * @throws NoSuchElementException if the iteration has no more elements
 */
```

## <span name="collection-interface" href="#daftar-isi">Collection Interface</span>

---

- Selain `Iterable Interface`, parent class semua collection di Java adalah `Collection`
- `Iterable Interface` digunakan sebagai kontrak untuk melakukan iterasi data secara `sequential`
- `Collection` merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus dan mengecek isi data
  collection
- Tidak ada direct implementation untuk Collection, karena collection dibagi lagi menjadi `List, Set dan Queue`

### Method-method di Collection

![Method-method di Collection](https://user-images.githubusercontent.com/69947442/127863092-ac8bc94d-f03d-4136-abe4-3750754c6037.png)

Contoh:

```java
public class Main {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        // Menambah data
        names.add("Akbar");
        names.addAll(List.of("Hasadi", "Putra", "Siregar", "Ganteng", "Banget"));

        System.out.println(names);
        // Output: [Akbar, Hasadi, Putra, Siregar, Ganteng, Banget]

        // Menghapus data
        names.remove("Hasadi");
        names.removeAll(List.of("Putra", "Siregar"));

        System.out.println(names);
        // Output: [Akbar, Ganteng, Banget]

        // Mengecek data
        System.out.println(names.contains("Kejelekan"));
        // Output: false

        System.out.println(
                names.containsAll(List.of("Akbar", "Ganteng", "Banget"))
        );
        // Output: true

        // Ukuran data
        System.out.println(names.size());
    }
}
```

## <span name="list-interface" href="#daftar-isi">List Interface</span>

---

- List adalah struktur data collection yang memiliki sifat sebagai berikut:
    - `Element` di list bisa duplikat
    - Data list berurut sesuai dengan posisi input (kita juga bisa mengatur urutan posisi ketika menginput data)
    - List memiliki `index`, untuk mengakses `element` pada list kita menggunakan `index`

### Method-method di List

![Method-method di List](https://user-images.githubusercontent.com/69947442/127863087-f6f272fc-713c-4e70-adc8-fe045332d87d.png)

### Implementasi List

![Implementasi List](https://user-images.githubusercontent.com/69947442/127863083-2667d142-d54d-4eee-9446-f174f2aded9f.png)

## <span name="arraylist-class" href="#daftar-isi">ArrayList Class</span>

---

- `ArrayList` adalah implementasi dari List menggunakan Array
- Default kapasitas array di ArrayList adalah 10
- Ketika kita memasukkan data dan array sudah penuh, maka secara otomatis ArrayList akan membuat array baru dengan
  kapasitas baru (setahu saye 2 kali lipat kapasitas lama), kemudian meng-copy isi dari array sebelumnya ke array baru

Contoh:

```java
public class Main {
    public static void main(String[] args) {
        // inisialisasi dan menbambah data
        List<String> names = new ArrayList<>(
                List.of("Akbar", "Hasadi", "Putra", "Siregar")
        );

        // mengakses data pada index 0
        System.out.println(names.get(0));
        // output: Akbar

        // mengedit data pada index 1
        names.set(1, "Ganteng");
        System.out.println(names);
        // output: [Akbar, Ganteng, Putra, Siregar]

        // menghapus data
        names.removeAll(List.of("Putra", "Siregar"));
        System.out.println(names);
        // output: [Akbar, Ganteng]
    }
}
```

## <span name="linkedlist-class" href="#daftar-isi">LinkedList Class</span>

---

- `LinkedList` adalah implementasi List dengan struktur data `Double LinkedList`

### Double LinkedList

![Double LinkedList](https://user-images.githubusercontent.com/69947442/127863079-98ff3ab3-9956-4ae4-9217-6f188b402d1f.png)

Contoh:

```java
public class Main {
    public static void main(String[] args) {
        // inisialisasi dan menbambah data
        List<String> names = new LinkedList<>(
                List.of("Akbar", "Hasadi", "Putra", "Siregar")
        );

        // mengakses data pada index 0
        System.out.println(names.get(0));
        // output: Akbar

        // mengedit data pada index 1
        names.set(1, "Ganteng");
        System.out.println(names);
        // output: [Akbar, Ganteng, Putra, Siregar]

        // menghapus data
        names.removeAll(List.of("Putra", "Siregar"));
        System.out.println(names);
        // output: [Akbar, Ganteng]
    }
}
``` 

### ArrayList vs LinkedList

---

|Operasi|ArrayList|LinkedList|
|-------|---------|----------|
|`add`|Cepat jika kapasitas Array masih cukup, lambat jika sudah penuh|Cepat karena hanya menambah node di akhir|
|`get`|Cepat karena tinggal gunakan index|Lambat karena harus di cek dari node awal sampai ketemu indexnya|
|`set`|Cepat karena tinggal gunakan index|Lambat karena harus di cek dari node awal sampai ketemu nodenya|
|`remove`|Lambat karena harus menggeser data di belakang yang di hapus|Lambat karena ada kemungkinan node yang dihapus di akhir array, jadi harus mengakses seluruh node|

## <span name="immutable-list" href="#daftar-isi">Immutable List</span>

---

- Secara default, List di java bersifat `Mutable`
- Di Java mendukung pembuatan `Immutable List`
- Element pada `Immutable` tidak dapat ditambah atau dihapus

Contoh:

```java
public class Main {
    // Person.getHobbies()
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public static void main(String[] args) {
        Person akbar = new Person("Akbar");
        akbar.addHobby("Menggarai Orang");
        akbar.addHobby("Gabut");

        doSomethingWithHobbies(akbar.getHobbies());
        System.out.println(akbar);
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        // hobbies.add("Mantul");
        // Error Exception: Exception in thread "main" java.lang.UnsupportedOperationException
    }
}
```

Documentation:

- `boolean add(E e);`

```java
/**
 * Appends the specified element to the end of this list (optional
 * operation).
 *
 * <p>Lists that support this operation may place limitations on what
 * elements may be added to this list.  In particular, some
 * lists will refuse to add null elements, and others will impose
 * restrictions on the type of elements that may be added.  List
 * classes should clearly specify in their documentation any restrictions
 * on what elements may be added.
 *
 * @param e element to be appended to this list
 * @return {@code true} (as specified by {@link Collection#add})
 * @throws UnsupportedOperationException if the {@code add} operation
 *         is not supported by this list
 * @throws ClassCastException if the class of the specified element
 *         prevents it from being added to this list
 * @throws NullPointerException if the specified element is null and this
 *         list does not permit null elements
 * @throws IllegalArgumentException if some property of this element
 *         prevents it from being added to this list
 */
```

### Membuat Immutable List

|Method|Keterangan|
|------|----------|
|`Collections.emptyList()`|Membuat immutable list kosong|
|`Collections.singletonList(e)`|Membuat immutable list berisi 1 element|
|`Collections.unmodifiableList(list)`|Mengubah mutable list menjadi immutable list|
|`List.of(e..)`|Membuat immutable list dari beberapa element|

Contoh:

```java
public class ImmutableList {
    public static void main(String[] args) {
        List<Integer> empty = Collections.emptyList();
        List<Integer> single = Collections.singletonList(1);
        List<Integer> list = List.of(1, 2, 3);
        List<Integer> modifiableList = new ArrayList<>(list);
        List<Integer> unmodifiableList = Collections.unmodifiableList(modifiableList);
    }
}
```

## <span name="set-interface" href="#daftar-isi">Set Interface</span>

- Set adalah salah satu collection yang berisikan element `unik`, data duplikat akan di timpa
- Set `tidak memiliki index`, karena ketika kita memasukkan data kedalam set, set akan secara otomatis `mengurut` data
  tersebut
- Method pada set sama seperti method yang ada di `Collection` dan `Iterable`
- Karena set tidak memiliki index, maka untuk mengambil data hanya bisa dilakukan dengan cara `iterasi` satu per satu

### Implementasi Set

![Implementasi Set](https://user-images.githubusercontent.com/69947442/127940862-89c4ed8f-570f-46ec-9d35-b07fa13af4e8.png)

### HashSet vs LinkedHashSet

|HashSet|LinkedHashSet|
|-------|-------------|
|Menggunakan hash table untuk menyimpan datanya|Menggunakan hash table untuk menyimpan datanya|
|Menggunakan method `hashCode()` untuk membedakan data|Menggunakan method `hashCode()` untuk membedakan data|
|Terurut sesuai dengan `value`|Terurut sesuai dengan `index` input|

Contoh:

```java
public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(
                List.of(5, 1, 3, 9, 6, 8, 5)
        );
        System.out.println(hashSet);
        // output: [1, 3, 5, 6, 8, 9]

        Set<Integer> linkedHashSet = new LinkedHashSet<>(
                List.of(5, 1, 3, 9, 6, 8, 5)
        );
        System.out.println(linkedHashet);
        // output: [5, 1, 3, 9, 6, 8]
    }
}
```

### Enum Set

- EnumSet adalah `Set` yang elemen datanya harus `Enum`
- Karena data `Enum` itu unik, sehingga sangat cocok menggunakan `Set` dibandingkan `List`

Contoh:

```java
public class MyEnumSet {
    public enum Gender {
        MALE, FEMALE, NOT_MENTIONED
    }

    public static void main(String[] args) {
        Set<Gender> genders = EnumSet.allOf(Gender.class);
        System.out.println(genders);
        // output: [MALE, FEMALE, NOT_MENTIONED]
    }
}
```

## <span name="immutable-set" href="#daftar-isi">Immutable Set</span>

- Sama seperti list, Java juga mendukung pembuatan `Immutable Set`
- Cara pembuatan `Immutable Set` mirip dengan pembuatan `Immutable List`

### Membuat Immutable Set

|Method|Keterangan|
|------|----------|
|`Collections.emptySet()`|Membuat immutable set kosong|
|`Collections.singleton(e)`|Membuat immutable set berisi 1 element|
|`Collections.unmodifiableSet(list)`|Mengubah mutable set menjadi immutable list|
|`Set.of(e..)`|Membuat immutable set dari beberapa element|

## <span name="sortedset-interface" href="#daftar-isi">SortedSet Interface</span>

- SortedSet adalah turunan dari Set, namun di SortedSet elemen-elemen yang dimasukkan akan diurutkan secara `natural`
- Jika elemen yang dimasukkan merupakan turunan dari `Comparable`, maka secara otomatis akan diurutkan berdasarkan
  method `Comparable`
- Kita juga bisa menggunakan `Comparator` pada SortedSet

Contoh:

```java
public class MySortedSet {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(
//                Comparator.comparing(Person::getName)
                new PersonComparator()
        );
        people.addAll(
                Set.of(
                        new Person("Akbar"),
                        new Person("Hasadi"),
                        new Person("Putra"),
                        new Person("Siregar")
                )
        );
        System.out.println(people);
    }
}
```

Documentation:

- `boolean addAll(Collection<? extends E> c);`

```java
/**
 * Adds all of the elements in the specified collection to this set if
 * they're not already present (optional operation).  If the specified
 * collection is also a set, the {@code addAll} operation effectively
 * modifies this set so that its value is the <i>union</i> of the two
 * sets.  The behavior of this operation is undefined if the specified
 * collection is modified while the operation is in progress.
 *
 * @param  c collection containing elements to be added to this set
 * @return {@code true} if this set changed as a result of the call
 *
 * @throws UnsupportedOperationException if the {@code addAll} operation
 *         is not supported by this set
 * @throws ClassCastException if the class of an element of the
 *         specified collection prevents it from being added to this set
 * @throws NullPointerException if the specified collection contains one
 *         or more null elements and this set does not permit null
 *         elements, or if the specified collection is null
 * @throws IllegalArgumentException if some property of an element of the
 *         specified collection prevents it from being added to this set
 * @see #add(Object)
 */
```

### Membuat Immutable SortedSet

|Method|Keterangan|
|---|---|
|`Collections.emptySortedSet()`|Membuat immutable sorted set kosong|
|`Collections.unmodifiableSortedSet()`|Mengubah mutable sorted set menjadi immutable|

## <span name="navigable-set" href="#daftar-isi">Navigable Set</span>

- NavigableSet adalah `turunan` dari SortedSet
- NavigableSet `menambah method-method untuk melakukan navigasi pencarian elemen`, seperti mencari elemen yang lebih
  besar dari, kurang dari, membalikkan urutan set, dan lainnya

### Method-method di Navigableset

![Method-method di Navigableset](https://user-images.githubusercontent.com/69947442/127952283-49bd1bc5-8921-4d0f-9319-537db6920744.png)

### Implementasi NavigableSet

![Implementasi NavigableSet](https://user-images.githubusercontent.com/69947442/127952276-76cc68ee-18d4-41eb-864d-e6f4747fe14c.png)

Contoh:

```java
public class MyNavigableSet {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>(
                Set.of("Akbar", "Hasadi", "Putra", "Siregar")
        );
        System.out.println(names);
        // output: [Akbar, Hasadi, Putra, Siregar]

        System.out.println(names.descendingSet());
        // output: [Siregar, Putra, Hasadi, Akbar]

        System.out.println(names.higher("Akbar"));
        // output: Hasadi

        names.pollFirst();
        System.out.println(names);
        // output: [Hasadi, Putra, Siregar]

        System.out.println(names.headSet("Putra", true));
        // output: [Hasadi, Putra]

        System.out.println(names.tailSet("Putra", false));
        // output: [Siregar]
    }
}
```

### Membuat Immutable NavigableSet

|Method|Keterangan|
|---|---|
|`Collections.emptyNavigableSet()`|Membuat immutable navigable set kosong|
|`Collections.unmodifiableNavigableSet()`|Mengubah mutable navigable set menjadi immutable|

## <span name="queue-interface" href="#daftar-isi">Queue Interface</span>

- Queue adalah implementasi dari Antrian
- Queue bersifat `FIFO (First In First Out)`

### Method-method di Queue Interface

![Method-method di Queue Interface](https://user-images.githubusercontent.com/69947442/127953666-e50a283b-0734-4fcf-af26-0caa71b16992.png)

### Implementasi Queue

![iq](https://user-images.githubusercontent.com/69947442/127953658-ff1ecbab-326d-41ce-8d0f-b6e8f9c5463f.png)

### ArrayDeque vs LinkedList vs PriorityQueue

|Implementasi|Cara Implementasi|
|---|---|
|`ArrayDeque`|Menggunakan `Array` sebagai implementasi queue nya|
|`LinkedList`|Menggunakan `Double LinkedList` sebagai implementasi queue nya|
|`PriorityQueue`|Mengunakan `Array` sebagai implementasi queue nya, namun diurutkan menggunakan `Comparable` atau `Comparator`

Contoh:

```java
public class MyArrayDeque {
    public static void main(String[] args) {
        Queue<String> arrayDeque = new ArrayDeque<>(
                List.of("Hasadi", "Siregar", "Akbar", "Putra")
        );
        Queue<String> linkedListQueue = new LinkedList<>(
                List.of("Hasadi", "Siregar", "Akbar", "Putra")
        );
        Queue<String> priorityQueue = new PriorityQueue<>(
                List.of("Hasadi", "Siregar", "Akbar", "Putra")
        );

        System.out.println(arrayDeque);
        // output: [Hasadi, Siregar, Akbar, Putra]
        System.out.println(linkedListQueue);
        // output: [Hasadi, Siregar, Akbar, Putra]
        System.out.println(priorityQueue);
        // output: [Akbar, Hasadi, Putra, Siregar]

        // menghapus elemen pertama dan return nilainya
        System.out.println(arrayDeque.poll());
        // output: Hasadi
        System.out.println(linkedListQueue.poll());
        // output: Hasadi
        System.out.println(priorityQueue.poll());
        // output: Akbar

        System.out.println(arrayDeque.size());
        System.out.println(linkedListQueue.size());
        System.out.println(priorityQueue.size());
        // output: 3
    }
}
```

## <span name="deque-interface" href="#daftar-isi">Deque Interface</span>

- Deque singkatan dari `Double Ended Queue`, artinya queue yang bisa beroperasi dari depan dan belakang
- Jika pada queue, operasi yang didukun ada `FIFO`, pada Deque juga mendukung operasi `LIFO (Last In First Out)`
- Deque adalah implementasi dari Stack (Tumpukan)

### Method-method di Deque

![Method-method di Deque](https://user-images.githubusercontent.com/69947442/127956539-461e1c76-24d3-4d4b-8474-783f9f859825.png)

### Implementasi Deque

![Implementasi Deque](https://user-images.githubusercontent.com/69947442/127956534-0d72cff9-d1ed-4dc9-9b1b-9190cda28735.png)

Contoh:

```java
public class MyDeque {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>(
                List.of("Hasadi", "Putra", "Siregar")
        );
        stack.offerFirst("Akbar");

        System.out.println(stack);
        // output: [Akbar, Hasadi, Siregar, Putra]

        System.out.println(stack.pollLast());
        // output: Akbar

        System.out.println(stack.pollFirst());
        // output: Hasadi

        System.out.println(stack.size());
        // output: 2
    }
}
```

## <span name="map-interface">Map Interface</span>

- Map adalah struktur data collection yang berisikan mapping antara `key` dan `value`
- Dimana key di map itu harus `unik`, tidak boleh duplikat, dan satu key cuma boleh mapping ke satu value
- Map sebenarnya mirip dengan Array, cuma bedanya kita bisa merubah indexing dengan tipe data sesuai dengan keinginan
  kita

### Method-method di Map

![Method-method di Map](https://user-images.githubusercontent.com/69947442/128002023-23a15623-bc8f-45f7-8690-ce4926a3df12.png)

### Implementasi Map

![Implementasi Map](https://user-images.githubusercontent.com/69947442/128002017-5571f353-8e9c-47fa-8987-1f7bbd2a2a1d.png)

## HashMap

- HashMap adalah implementasi Map yang melakukan distribusi key menggunakan method `hashCode()`
- Karena HashMap sangat bergantung dengan method `hashCode()`, jadi pastikan kita harus membuat method `hashCode()`
  seunik mungkin, karena jika tidak, maka pendistribusian key nya tidak optimal sehingga proses get data di Map akan
  semakin lambat
- Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method `equals()`

Contoh:

```java
public class MyHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Akbar");
        map.put("lastName", "Putra");
        System.out.println(map);
        // output: {firstName=Akbar, lastName=Putra}
    }
}
```

## WeakHashMap

- WeakHashMap sama seperti HashMap
- Bedanya WeakHashMap menggunakan weak key, dimana jika key tidak lagi digunakan, maka secara otomatis akan dihapus
  oleh `Garbage Collector`

Contoh:

```java
public class MyWeakHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer> weakHashmap = new WeakHashMap<>();
        for (int i = 1; i <= 1_000_000; i++) {
            weakHashmap.put(i, i);
        }
        System.out.println(weakHashmap.size());
        // output:790440
        System.gc(); // run garbage collector
        System.out.println(weakHashmap.size());
        // output: 127
    }
}
```

## IndentityHashMap

- IdentityHashMap sama seperti HashMap
- Bedanya adalah IdentityHashMap menggunakan `Reference Equality (Operator ==)` untuk mengecek kesamaan datanya
- `Reference Equality (Operator ==)` mengecek lokasi memory dari variable

Contoh:

```java
public class MyIdentityHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();
        String value = "Akbar";
        String key = "firstName";

        String first = "first";
        String name = "Name";
        String key2 = first + name;

        map.put(key, value);
        map.put(key, value);
        map.put(key2, value);
        System.out.println(map);
        // output: {firstName=Akbar, firstName=Akbar}

        System.out.println(key.equals(key2));
        // output: true -> isi kedua String sama
        System.out.println(key == key2);
        // output: false -> lokasi memory kedua String berbeda
    }
}
```

## LinkedHashMap

- LinkedHashMap adalah implementasi Map dengan menggunakan `Double LinkedList`
- Data di LinkedHashMap akan lebih terprediksi karena datanya akan disimpan berurutan dalam `LinkedList` sesuai urutan
  kita menyimpan data
- Proses get data di LinkedHashMap lebih lambat karena harus melakukan `iterasi` 1 per 1

Contoh:

```java
public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("firstName", "Akbar");
        map.put("lastName", "Putra");
        System.out.println(map);
        // output: {firstName=Akbar, lastName=Putra}
    }
}
```

## EnumMap

- EnumMap adalah implementasi Map dimana key nya adalah enum
- Algoritma pendistribusian key dioptimalkan untuk enum, sehingga lebih optimal dibandingkan menggunakan
  method `hashCode()`

Contoh:

```java
public class MyEnumMap {
    public enum Membership {
        FREE, FREEMIUM, PREMIUM, VIP
    }

    public static void main(String[] args) {
        EnumMap<Membership, String> membershipType = new EnumMap<>(Membership.class);
        membershipType.put(Membership.FREE, "Gratis");
        membershipType.put(Membership.FREEMIUM, "Gratis + Donasi Saweria");
        membershipType.put(Membership.PREMIUM, "Berbayar");
        membershipType.put(Membership.VIP, "Berbayar + Donasi Saweria");
        System.out.println(membershipType);
        // output: {FREE=Gratis, FREEMIUM=Gratis + Donasi Saweria, PREMIUM=Berbayar, VIP=Berbayar + Donasi Saweria}
    }
}
```