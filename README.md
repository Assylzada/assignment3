# assignment3
# 🧠 Custom Hash Table Implementation in Java

## 📌 Project Overview

This project implements a custom **Hash Table** data structure in Java using **separate chaining** with linked lists to handle collisions. It also includes a custom class `MyTestingClass` as a key type with a manually tuned `hashCode()` function to ensure uniform distribution across buckets.

---

## 📁 Files

| File Name            | Description                                                  |
|----------------------|--------------------------------------------------------------|
| `MyHashTable.java`   | Core hash table class implementing put, get, remove, etc.     |
| `MyTestingClass.java`| Custom key class with manually implemented `hashCode()`       |

---

## 🛠️ Features

- **Generic Hash Table** using separate chaining.
- **Custom `hashCode()`** method avoiding Java’s default hashing utilities.
- Insertion of **10,000 random elements** with `MyTestingClass` keys.
- Bucket distribution printed to evaluate **hash function uniformity**.
- Methods: `put`, `get`, `remove`, `contains`, `getKey`, `size`, and `printBucketSizes`.

---

## 🧪 Custom Key Class

### `MyTestingClass`

```java
public class MyTestingClass {
    private int id;
    private String name;

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + id;
        for (int i = 0; i < name.length(); i++) {
            hash = 31 * hash + name.charAt(i);
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id && name.equals(other.name);
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
# 🌲 Binary Search Tree (BST) Implementation in Java

## 📌 Project Overview

This project implements a **non-recursive Binary Search Tree (BST)** in Java. The tree supports generic keys and values, with basic operations like insert (`put`), search (`get`), and delete (`delete`). It also includes an **in-order iterator** to traverse elements in sorted order.

---

## 📁 Files

| File Name | Description                              |
|-----------|------------------------------------------|
| `BST.java`| Main class implementing a generic BST    |

---

## 🛠️ Features

- Generic types for keys (`K`) and values (`V`)
- Supports:
  - `put(K key, V value)` for insertion
  - `get(K key)` for retrieval
  - `delete(K key)` for node removal
  - `size()` to get number of nodes
- In-order traversal using a custom `Iterator`
- Each iteration returns an `Entry<K, V>` object with both key and value

---

## 🧩 Entry Class

The `Entry<K, V>` class is used during iteration to expose both the key and the value:

```java
public static class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

