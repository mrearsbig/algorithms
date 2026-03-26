# Big-O Cheatsheet

## What is Big-O?
Big-O tells us how an algorithm grows when input size $n$ gets bigger.

- **Time**: how many steps the code does.
- **Space**: how much extra memory it uses.
- We usually look at the **worst case**.

---

## Growth order (best to worst)

| Complexity | Name | Easy idea |
|---|---|---|
| $O(1)$ | Constant | Same time, even if $n$ grows |
| $O(\log n)$ | Logarithmic | Cut the problem in half each step |
| $O(n)$ | Linear | Go through items one time |
| $O(n \log n)$ | Linear-log | Fast sorting style |
| $O(n^2)$ | Quadratic | Two loops |
| $O(n^3)$ | Cubic | Three loops |
| $O(2^n)$ | Exponential | Try many combinations |
| $O(n!)$ | Factorial | Try all permutations |

---

## Fast rules to find complexity

1. One loop over array -> $O(n)$
2. Two nested loops -> $O(n^2)$
3. Loop with `n /= 2` -> $O(\log n)$
4. Outer loop + binary search -> $O(n \log n)$
5. Hash map operations (`get`, `put`, `contains`) are usually $O(1)$
6. Ignore constants and small terms:
   - $O(3n + 10)$ -> $O(n)$
   - $O(n^2 + n)$ -> $O(n^2)$

---

## Common operations in Java

### Arrays / Strings
- Access by index: $O(1)$
- Full scan: $O(n)$
- Search in unsorted array: $O(n)$
- Binary search in sorted array: $O(\log n)$

### HashMap / HashSet
- Insert / search / delete (average): $O(1)$
- Extra space: $O(n)$

### Sorting
- `Arrays.sort(int[])`: usually $O(n \log n)$

---

## Example from this repo: Two Sum

File: `leetcode/easy/TwoSum.java`

### Brute force
- Check all pairs with two loops.
- Time: $O(n^2)$
- Space: $O(1)$

### HashMap solution
- One loop + map for complement.
- Time: $O(n)$ (average)
- Space: $O(n)$

### Trade-off
We use more memory to get faster time.

---

## Quick checklist

- How many times do I scan input?
- Do I have nested loops?
- Can I use a hash map to be faster?
- Is the array sorted?
- Is my final solution better than brute force?

---

## Useful notation

- **$O(f(n))$**: upper bound
- **$\Theta(f(n))$**: tight bound
- **$\Omega(f(n))$**: lower bound

For daily practice, focus on **time Big-O** and **space Big-O**.
