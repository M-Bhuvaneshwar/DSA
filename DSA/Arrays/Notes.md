Here are **notes on the basics of Arrays in Java** — clear, structured, and easy to revise 👇

---

# 🧩 **Arrays in Java — Basics Notes**

---

## 🔹 What is an Array?

An **array** is a **collection of elements of the same data type** stored in **contiguous memory locations**.

It helps store multiple values in a single variable instead of declaring separate variables.

### Example:

```java
int[] marks = {85, 90, 75, 60, 95};
```

---

## 🔹 Why Use Arrays?

* To store multiple values under one name
* To access elements easily using index
* To perform operations like sorting, searching, etc. efficiently

---

## 🔹 Key Points

| Property        | Description                              |
| --------------- | ---------------------------------------- |
| **Type**        | Homogeneous — same data type             |
| **Size**        | Fixed after creation                     |
| **Indexing**    | Starts from 0                            |
| **Memory**      | Elements are stored in continuous memory |
| **Access Time** | Fast (direct index access)               |

---

## 🔹 Declaring an Array

### 1️⃣ Declaration

```java
int[] arr;   // preferred
// or
int arr[];
```

### 2️⃣ Allocation

```java
arr = new int[5];   // creates array of size 5
```

### 3️⃣ Initialization

```java
arr[0] = 10;
arr[1] = 20;
```

Or do all together:

```java
int[] arr = {10, 20, 30, 40, 50};
```

---

## 🔹 Accessing Elements

Use index:

```java
System.out.println(arr[2]);  // prints 30
```

---

## 🔹 Traversing an Array

### Using for loop:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Using enhanced for-each loop:

```java
for (int num : arr) {
    System.out.println(num);
}
```

---

## 🔹 Taking Input in Array

```java
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
```

---

## 🔹 Array Properties

| Property          | Example                           | Meaning                    |
| ----------------- | --------------------------------- | -------------------------- |
| `arr.length`      | `System.out.println(arr.length);` | Returns number of elements |
| `arr[i]`          | `arr[0]`                          | Access element at index 0  |
| `arr[i] = value;` | `arr[2] = 99;`                    | Modify element             |

---

## 🔹 Memory Representation

```
Index:  0   1   2   3   4
Value:  10  20  30  40  50
```

Each index directly points to a memory address (contiguous).

---

## 🔹 Advantages

✅ Fast access using index

✅ Simple to use

✅ Best for fixed-size collections

---

## 🔹 Limitations

❌ Fixed size (can’t grow or shrink)

❌ Only same type elements allowed

❌ Insertion and deletion are costly

---

## 🧠 Common Array Operations

| Operation | Description                      |
| --------- | -------------------------------- |
| Traversal | Visit each element               |
| Insertion | Add element at specific position |
| Deletion  | Remove element                   |
| Searching | Linear or Binary search          |
| Sorting   | Arrange in order                 |

---

Would you like me to give you **“Advanced Array Notes”** next (covering multi-dimensional arrays, jagged arrays, and common algorithms like sorting/searching)?
