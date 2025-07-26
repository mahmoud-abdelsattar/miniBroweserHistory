# Browser History Design (LeetCode 1472 Clone)

This project is a simple implementation of a browser history mechanism using a doubly linked list.
It simulates the behavior of visiting web pages, navigating back, and moving forward through your history,
similar to how a web browser operates.

## 💡 Problem Overview

You have a browser with one tab where you start on the homepage. You can:

- Visit a new URL.
- Go back in history by a certain number of steps.
- Move forward in history by a certain number of steps.

### Class: `DesignBrowserHistory1472`

#### Constructor

```java
DesignBrowserHistory1472(String homepage)
```

Initializes the browser history with the homepage.

#### Methods

```java
void visit(String url)
```
Visits a new URL from the current page and clears all forward history.

```java
String back(int steps)
```
Moves `steps` backward in history. Returns the resulting page URL.

```java
String forward(int steps)
```
Moves `steps` forward in history. Returns the resulting page URL.

## 📦 Sample Execution

```java
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
```

### ✅ Output:

```
[null, null, null, null, "facebook.com", "google.com", "facebook.com", null, "linkedin.com", "google.com", "leetcode.com"]
```

## 🛠 Technologies

- Java
- LeetCode-style logic
- Doubly Linked List

## 🧪 How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Compile and run the Java file:
   ```bash
   javac src/leet/DesignBrowserHistory1472.java
   java -cp src leet.DesignBrowserHistory1472
   ```

## 📁 File Structure

```
DesignBrowserHistory1472/
├── README.md
└── src/
    └── leet/
        └── DesignBrowserHistory1472.java
```

## ⚠️ Note

- This mimics LeetCode’s [Design Browser History (Problem 1472)](https://leetcode.com/problems/design-browser-history/) with custom input/output logic.
