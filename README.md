# Java Intensive Course in ITI

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![ITI](https://img.shields.io/badge/ITI-Intensive_Code_Camp-red?style=for-the-badge)
![Structure](https://img.shields.io/badge/Architecture-MVC_Pattern-blue?style=for-the-badge)

> **A comprehensive collection of backend engineering labs and projects completed during the Information Technology Institute (ITI) Intensive Code Camp.**

## About The Project

This repository documents my progression from core syntax to building scalable, architected applications. It focuses heavily on **Backend Development** concepts including Data Structures, Advanced OOP, Java 8 Streams, and Exception Handling.

## Featured Projects

### 1. Library Management System (Lab7)
A tiered-architecture application simulating a real-world library system.
* **Key Concepts:** Generics, Custom Exceptions, Polymorphism, Service Layer Pattern.
* **Architecture:**
    * `model`: Entity classes (`Book`, `Magazine`) inheriting from base `LibraryItem`.
    * `service`: Business logic using `Map` for O(1) lookup performance.
    * `exception`: Custom error handling (`ClientNotFoundException`).
* **Code Highlight:** Generic methods for item management.
    ```java
    // From Lab7_LibraryManagementSystem/service/Library.java
    public <T extends LibraryItem> void addItem(T item){
        if(library.containsKey(item.getId())){
            System.out.println("Item Already exist!");
        } else {
            library.put(item.getId(), item);
        }
    }
    ```

### 2. World Data Analysis (Lab5)
A data processing engine that analyzes real-world datasets (`Cities.txt`, `Countries.txt`) using the Functional Programming approach.
* **Key Concepts:** Stream API, Lambdas, `Optional`, DAO Pattern.
* **Capabilities:**
    * Extracting highest populated cities per continent.
    * Complex grouping and mapping of data objects.
* **Code Highlight:**
    ```java
    // From Exercise2.java - Grouping cities by continent with max population
    Map<String, Optional<City>> citiesByContinent = allCountries.stream()
            .collect(Collectors.groupingBy(
                    Country::getContinent,
                    Collectors.flatMapping(country -> country.getCities().stream(),
                            Collectors.maxBy(Comparator.comparing(City::getPopulation))
                    )
    ));
    ```

### 3. In-Memory Dictionary (Lab6)
A text processing tool utilizing specific Data Structures for optimized sorting and retrieval.
* **Key Concepts:** `TreeMap`, `TreeSet`, Nested Collections.
* **Logic:** Automatically groups words by their first letter and keeps them sorted alphabetically without manual sorting algorithms.

---

## Technical Syllabus

| Module | Topic | Lab Location | Key Skills Demonstrated |
| :--- | :--- | :--- | :--- |
| **OOP Architecture** | Inheritance & Encapsulation | `CourseSystem` | Class design, Object relationships |
| **Core Logic** | Arrays & Regex | `Lab1`, `Lab2` | `IpChecker` (Regex), `MaxMinGetter` |
| **Functional Java** | Functional Interfaces | `Lab3` | Custom `TriFunction`, Lambda expressions |
| **Advanced OOP** | Generics & Exceptions | `Lab4` | Abstract Classes (`Shape`), Custom Exceptions |
| **Data Engineering** | Streams API | `Lab5` | `Collectors`, `Filter`, `Map`, `Reduce` |
| **Data Structures** | Collections Framework | `Lab6` | `TreeMap` vs `HashMap`, `Set` uniqueness |
| **System Design** | Application Architecture | `Lab7` | Separation of Concerns, Loose Coupling |

## Technologies Used
* **Language:** Java SE
* **IDE:** IntelliJ IDEA
* **OS:** Fedora Linux
* **Concepts:** OOP, Functional Programming, Data Structures & Algorithms.

## How to Run
1.  **Clone the repo:**
    ```bash
    git clone [https://github.com/HashimAbdulaziz/ITI_JavaCourseLabs.git](https://github.com/HashimAbdulaziz/ITI_JavaCourseLabs.git)
    ```
2.  **Navigate to the project:**
    ```bash
    cd ITI_JavaCourseLabs
    ```
3.  **Run a specific Lab (e.g., Library App):**
    Open the project in IntelliJ IDEA and run:
    `src/Lab7_LibraryManagementSystem/app/LibraryApp.java`

## Contact
**Hashim Abdulaziz**
* **Role:** Electronics Engineer & Backend Developer
* [GitHub Profile](https://github.com/HashimAbdulaziz)
* [LinkedIn](https://www.linkedin.com/in/hashim-abdulaziz-095b68281/)
