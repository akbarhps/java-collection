# Java Collection

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
- Semua class collection di Java adalah `Generic Class`, sehingga kita bisa menggunakan Java Collection dengan tipe data apapun


## Java Collection

- `Interfaces`, ini adalah kontrak representasi dari collection. Semua collection di Java memiliki kontrak interface, sehingga jika kita mau, kita juga bisa membuat implementasinya sendiri
- `Implementation`, tidak perlu khawatir, kita juga bisa menggunakan implementasi yang sudah dibuat oleh Java, semua interface collection sudah ada implementasi class nya di Java.
- `Algorithms`, Java juga sudah menyediakan algoritma-algoritma yang umum digunakan di collection, seperti pencarian dan pengurutan data


## Java Collection Interface

![Java Collection Interface UML](https://user-images.githubusercontent.com/69947442/127849630-3ef8e9a7-52b0-470a-a1f0-1292fbd2a414.png)