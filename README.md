# [Java Collection](https://akbarhps.github.io/java-collection/)

A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others
do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it
provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass
collections around and manipulate them where maximum generality is desired.  
[Official Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)

Sumber Tutorial:
[Youtube](https://www.youtube.com/watch?v=_JEMfq4k2O4) |
[Slide](https://docs.google.com/presentation/d/1IybRjjqE2hIrrq2aLbZ1qw_7o6vhgg27dVZVc4gQF9g/edit#slide=id.p)

## <a name="daftar-isi">Daftar Isi</a>

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

## <a name="pengenalan-collection" href="#daftar-isi">Pengenalan Collection</a>

---

- Collection adalah hal umum yang biasa dimiliki di bahasa pemrograman, seperti PHP, Python, Ruby, dan lain-lain
- Collection atau kadang disebut container, adalah object yang mengumpulkan atau berisikan data-data mirip
  seperti `Array`
- Java telah menyediakan class-class collection yang sudah bisa langsung kita gunakan, tanpa tambahan library
- Semua class collection di Java adalah `Generic Class`, sehingga kita bisa menggunakan Java Collection dengan tipe data
  apapun

## <a name="java-collection" href="#daftar-isi">Java Collection</a>

---

- `Interfaces`, ini adalah kontrak representasi dari collection. Semua collection di Java memiliki kontrak interface,
  sehingga jika kita mau, kita juga bisa membuat implementasinya sendiri
- `Implementation`, tidak perlu khawatir, kita juga bisa menggunakan implementasi yang sudah dibuat oleh Java, semua
  interface collection sudah ada implementasi class nya di Java.
- `Algorithms`, Java juga sudah menyediakan algoritma-algoritma yang umum digunakan di collection, seperti pencarian dan
  pengurutan data

## <a name="java-collection-interface" href="#daftar-isi">Java Collection Interface</a>

---

### Java Collection Interface UML

![Java Collection Interface UML](https://user-images.githubusercontent.com/69947442/127863095-d904bc42-e779-46ff-ba25-1fa2252e9866.png)

## <a name="iterable-interface" href="#daftar-isi">Iterable Interface</a>

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

## <a name="iterator-interface" href="#daftar-isi">Iterator Interface</a>

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

- `hasNext()`

```java
 /**
 * Returns {@code true} if the iteration has more elements.
 * (In other words, returns {@code true} if {@link #next} would
 * return an element rather than throwing an exception.)
 *
 * @return {@code true} if the iteration has more elements
 */
```

- `next()`;

```java
 /**
 * Returns the next element in the iteration.
 *
 * @return the next element in the iteration
 * @throws NoSuchElementException if the iteration has no more elements
 */
```

## <a name="collection-interface" href="#daftar-isi">Collection Interface</a>

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

## <a name="list-interface" href="#daftar-isi">List Interface</a>

---

- List adalah struktur data collection yang memiliki sifat sebagai berikut:
    - `Element` di list bisa duplikat
    - Data list berurut sesuai dengan posisi input (kita juga bisa mengatur urutan posisi ketika menginput data)
    - List memiliki `index`, untuk mengakses `element` pada list kita menggunakan `index`

### Method-method di List

![Method-method di List](https://user-images.githubusercontent.com/69947442/127863087-f6f272fc-713c-4e70-adc8-fe045332d87d.png)

### Implementasi List

![Implementasi List](https://user-images.githubusercontent.com/69947442/127863083-2667d142-d54d-4eee-9446-f174f2aded9f.png)

## <a name="arraylist-class" href="#daftar-isi">ArrayList Class</a>

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

## <a name="linkedlist-class" href="#daftar-isi">LinkedList Class</a>

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

## <a name="immutable-list" href="#daftar-isi">Immutable List</a>

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

- `add(e)`

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

## <a name="set-interface" href="#daftar-isi">Set Interface</a>

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

## Immutable Set

- Sama seperti list, Java juga mendukung pembuatan `Immutable Set`
- Cara pembuatan `Immutable Set` mirip dengan pembuatan `Immutable List`

### Membuat Immutable List

|Method|Keterangan|
|------|----------|
|`Collections.emptySet()`|Membuat immutable set kosong|
|`Collections.singleton(e)`|Membuat immutable set berisi 1 element|
|`Collections.unmodifiableSet(list)`|Mengubah mutable set menjadi immutable list|
|`Set.of(e..)`|Membuat immutable set dari beberapa element|

## SortedSet Interface

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

- `addAll`

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

## NavigableSet Interface

- NavigableSet adalah `turunan` dari SortedSet
- NavigableSet `menambah method-method untuk melakukan navigasi pencarian elemen`, seperti mencari elemen yang lebih besar
  dari, kurang dari, membalikkan urutan set, dan lainnya
  
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