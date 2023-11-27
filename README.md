# Programming Appetizer (44-242: Data Structures)

## 5 pts

A Pythagorean triple are three integers a, b, and c such that a<sup>2</sup> + b<sup>2</sup> = c<sup>2</sup>.

Your task is to write a program that takes an integer c and determines if it is part of a Pythagorean triple; that is that there is some values of a and b that satisfy the Pythagorean requirement.
Note that both a and b must be greater than 0, and less than c.

If c is part of a Pythagorean triple, your program must print `true`; otherwise, it must print `false` (note: the "tests" require that these be lower case).
In the sample I/O below I've printed what a and b would be to satisfy the requirement; you are not required to do this
### Sample I/O

Run 1:
```text
Enter a number: 10
true: 6 8
```

Run 2:
```text
Enter a number: 15
true: 9 12
```

Run 3
```text
Enter a number: 42
false
```
### Rubric

| Criteria | Total Points |
| --- | --- |
| Source file comment headers | 1 |
| Coding style (clean and consistent) | 1 |
| Correctness (tests) | 3 |
