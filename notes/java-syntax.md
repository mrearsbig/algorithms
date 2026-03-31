# Java Syntax & Best Practices (Algorithms)

## 1. Loop Control
- `break`    -> exits the loop entirely
- `continue` -> skips current iteration and moves to the next
- `return`   -> exits the method and returns a value

## 2. Variable Naming
- Prefer descriptive names: `left/right` over `i/j` for pointers.
- Name variables by meaning: `numStr` (String), `indexByValue` (Map), `isValid` (boolean).
- `i, j` are fine in short/simple loops; avoid them in complex logic.
- Add inline comments only when the variable purpose is not obvious.

```java
int left = 0;          // left pointer in two-pointer scan
int bestLength = 0;    // longest valid window seen so far
```

## 3. String Concatenation in Loops
```java
// Avoid this in loops: total cost usually becomes O(n^2)
String result = "";
for (char c : chars) {
    result += c;
}

// Prefer StringBuilder: append is amortized O(1), total O(n)
StringBuilder sb = new StringBuilder();
for (char c : chars) {
    sb.append(c);
}
return sb.toString();
```

## 4. HashMap - Core Operations
Average time for `put/get/remove/containsKey` is O(1).

```java
Map<Integer, Integer> map = new HashMap<>();

map.put(key, value);                // insert/update
Integer val = map.get(key);         // may return null
boolean exists = map.containsKey(key);
int safeVal = map.getOrDefault(key, 0);
map.putIfAbsent(key, value);
map.remove(key);
int size = map.size();
boolean empty = map.isEmpty();

// Common pattern: value -> index
map.put(nums[i], i);
```

## 5. HashSet - Core Operations
Average time for `add/contains/remove` is O(1).

```java
Set<Integer> seen = new HashSet<>();

seen.add(x);
boolean exists = seen.contains(x);
seen.remove(x);
int size = seen.size();
boolean empty = seen.isEmpty();
```

## 6. Two Pointers Pattern
```java
int left = 0;
int right = nums.length - 1;

while (left < right) {
    // evaluate condition with nums[left] and nums[right]
    left++;
    right--;
}
```

## 7. Extracting Digits (Math)
```java
int lastDigit = x % 10;   // extract last digit
x = x / 10;               // remove last digit

// Reverse integer pattern
int reverse = 0;
while (x != 0) {
    int digit = x % 10;

    // Overflow guard (LeetCode Reverse Integer style)
    if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
        return 0;
    }

    reverse = reverse * 10 + digit;
    x /= 10;
}
```

## 8. Lookahead in Loops
```java
// Safe next index access
if (i < s.length() - 1) {
    char nextChar = s.charAt(i + 1);
}

// If using map.get(), avoid null unboxing issues
if (i < s.length() - 1) {
    int current = values.getOrDefault(s.charAt(i), 0);
    int next = values.getOrDefault(s.charAt(i + 1), 0);
    if (current < next) {
        // subtract
    }
}
```

## 9. Comment Standards
```java
// 1) Prefer adding approach + complexity for non-trivial methods
// Approach: Sliding Window | Time: O(n) | Space: O(k)

// 2) Comment non-obvious intent, not obvious syntax
int reverse = 0; // stores reversed value being built digit by digit

// 3) Explain decisions and edge cases
// Subtract current when it is smaller than next (e.g., IV = 4)
```

## 10. Type Conversions
```java
Integer.toString(x);       // int -> String
Integer.parseInt(str);     // String -> int
s.charAt(i);               // String -> char
String.valueOf(c);         // char -> String

int digit = c - '0';               // char digit -> int digit
char ch = (char) ('0' + digit);    // int digit -> char digit
```