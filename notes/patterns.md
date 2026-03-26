# Problem-Solving Patterns (Simple Guide)

This file helps me choose a good approach for many coding problems across LeetCode and HackerRank.

## 1. Brute Force First
Use this to get a correct answer quickly.
Then improve time or space.

- Good for: first draft, small input
- Risk: can be too slow

Example: `Two Sum` with two loops  
- Time: $O(n^2)$  
- Space: $O(1)$

---

## 2. Hash Map / Hash Set
Store values for fast lookup.

- Use when: you need fast search, count, or "have I seen this?"
- Common cost:  
  - Time: $O(1)$ average per operation  
  - Space: $O(n)$

Example ideas:
- Pair sum / complement lookup
- Contains Duplicate
- Frequency counter (characters, numbers)

---

## 3. Two Pointers
Use two indexes, usually from left and right.

- Use when: array/string is sorted, or you need pairs/subarrays
- Often better than nested loops

Common forms:
- `left++` / `right--`
- Fast/slow pointers

Example ideas:
- Pair search in sorted arrays
- Valid Palindrome
- Remove duplicates in sorted array

---

## 4. Sliding Window
Keep a window that moves over an array/string.

- Use when: question asks for "longest", "shortest", "max", "min", "sum" in a subarray/substring
- Can reduce $O(n^2)$ to $O(n)$

Common forms:
- Fixed size window
- Dynamic size window

Example ideas:
- Maximum average subarray
- Longest substring without repeating characters

---

## 5. Binary Search
Search in a sorted space by cutting in half.

- Use when: sorted array or monotonic condition
- Time: $O(\log n)$

Example ideas:
- Find target in sorted array
- First bad version
- Search insert position

---

## 6. Prefix Sum
Precompute cumulative sums.

- Use when: many range sum queries
- Build once, answer fast

Costs:
- Build: $O(n)$
- Query: $O(1)$

Example ideas:
- Range Sum Query
- Subarray sum checks

---

## 7. Recursion + Backtracking
Try choices, go deeper, undo choice.

- Use when: generate combinations/permutations/subsets
- Can be expensive (often exponential)

Example ideas:
- Subsets
- Permutations
- Combination Sum

---

## 8. Dynamic Programming (DP)
Break problem into smaller subproblems and reuse results.

- Use when: overlapping subproblems + optimal substructure
- Start with:
  1. Define state
  2. Write transition
  3. Set base case
  4. Choose top-down or bottom-up

Example ideas:
- Climbing Stairs
- House Robber
- Coin Change

---

## 9. Greedy
Take the best local choice each step.

- Use when: local best gives global best
- Must justify why it works

Example ideas:
- Best Time to Buy and Sell Stock II
- Assign Cookies
- Jump Game (variant)

---

## 10. Intervals
Sort intervals and merge/check overlap.

- Use when: ranges like `[start, end]`
- Typical steps:
  1. Sort by start
  2. Compare with previous
  3. Merge or push new interval

Example ideas:
- Merge Intervals
- Insert Interval
- Meeting Rooms

---

## Pattern Selection Checklist

Before coding, ask:

- Is brute force too slow?
- Do I need fast lookup? -> Hash
- Is data sorted? -> Two pointers / Binary search
- Need best subarray/substring? -> Sliding window
- Many range queries? -> Prefix sum
- Need all combinations? -> Backtracking
- Repeated subproblems? -> DP
- Working with ranges? -> Intervals

Add these checks too:

- Are constraints large (for example $n \ge 10^5$)? -> avoid $O(n^2)$
- Do I need original order preserved?
- Can preprocessing (sort/prefix map) make repeated work cheaper?

---

## Mini Workflow for Every Problem

1. Understand input/output and constraints.
2. Write brute force solution.
3. Estimate Big-O.
4. Choose a pattern to optimize.
5. Test with edge cases:
   - empty input
   - one element
   - duplicates
   - negative values
   - large input
6. Write final clean solution + complexity.

---

## By Input Type (quick mapping)

- Array, unsorted:
  - Try hash map/set, prefix sum, sliding window
- Array, sorted:
  - Try two pointers, binary search
- String:
  - Try sliding window, frequency map, two pointers
- Matrix/Grid:
  - Try DFS/BFS, visited set, direction vectors
- Tree:
  - Try DFS recursion/stack, BFS queue, preorder/inorder/postorder
- Graph:
  - Try BFS/DFS, topological sort, union-find, shortest path
- Intervals:
  - Sort and merge/sweep

---

## Constraint-to-Complexity Rule of Thumb

- $n \le 20$ -> exponential/backtracking can be acceptable
- $n \le 10^2$ -> $O(n^2)$ is often acceptable
- $n \le 10^5$ -> target $O(n)$ or $O(n \log n)$
- Very large input + multiple queries -> preprocess (prefix sums, indexing, caching)

---

## Testing Checklist (before submit)

- Empty input / minimum size
- Single element
- Duplicates
- Negative numbers / zeros
- Already sorted / reverse sorted
- Large random case for performance
- Edge constraints from statement

---

## Repo Notes

- Keep each solved problem with:
  - final approach summary
  - time and space complexity
  - key edge cases tested
- Prefer consistent naming and folder structure by platform and difficulty.

---

## Repo Notes

Current example in this repo:
- `leetcode/easy/TwoSum.java`
  - Brute force: $O(n^2)$
  - Hash map: $O(n)$ average