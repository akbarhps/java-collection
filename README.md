# [Java Collection](https://akbarhps.github.io/java-collection/)

A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others
do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it
provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass
collections around and manipulate them where maximum generality is desired.  
[Official Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)

Sumber Tutorial:
[Youtube](https://www.youtube.com/watch?v=_JEMfq4k2O4) |
[Slide](https://docs.google.com/presentation/d/1IybRjjqE2hIrrq2aLbZ1qw_7o6vhgg27dVZVc4gQF9g/edit#slide=id.p)

## Pengenalan Collection

- Collection adalah hal umum yang biasa dimiliki di bahasa pemrograman, seperti PHP, Python, Ruby, dan lain-lain
- Collection atau kadang disebut container, adalah object yang mengumpulkan atau berisikan data-data mirip
  seperti `Array`
- Java telah menyediakan class-class collection yang sudah bisa langsung kita gunakan, tanpa tambahan library
- Semua class collection di Java adalah `Generic Class`, sehingga kita bisa menggunakan Java Collection dengan tipe data
  apapun

## Java Collection

- `Interfaces`, ini adalah kontrak representasi dari collection. Semua collection di Java memiliki kontrak interface,
  sehingga jika kita mau, kita juga bisa membuat implementasinya sendiri
- `Implementation`, tidak perlu khawatir, kita juga bisa menggunakan implementasi yang sudah dibuat oleh Java, semua
  interface collection sudah ada implementasi class nya di Java.
- `Algorithms`, Java juga sudah menyediakan algoritma-algoritma yang umum digunakan di collection, seperti pencarian dan
  pengurutan data

## Java Collection Interface

![Java Collection Interface UML](https://user-images.githubusercontent.com/69947442/127849630-3ef8e9a7-52b0-470a-a1f0-1292fbd2a414.png)

## Iterable Interface

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

## Iterator Interface

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

## Collection Interface

- Selain `Iterable Interface`, parent class semua collection di Java adalah `Collection`
- `Iterable Interface` digunakan sebagai kontrak untuk melakukan iterasi data secara `sequential`
- `Collection` merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus dan mengecek isi data
  collection
- Tidak ada direct implementation untuk Collection, karena collection dibagi lagi menjadi `List, Set dan Queue`

![Method-method di Collection](https://user-images.githubusercontent.com/69947442/127854781-0bfa0654-b770-4de1-87b6-de1cd5deeff9.png)

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