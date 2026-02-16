# SCO308-Assignment

Small collection of standalone Java console programs demonstrating classic
algorithms and math exercises.

## Contents
- `src/algorithms/BubbleSort.java` - bubble sort with per-pass swap output.
- `src/algorithms/SelectionSort.java` - selection sort with pass-by-pass array state.
- `src/algorithms/MergeSort.java` - merge sort implementation and demo run.
- `src/algorithms/GCD_Euclid.java` - Euclidean algorithm for GCD from user input.
- `src/algorithms/Fibonacci100.java` - prints the first 100 Fibonacci numbers.
- `src/algorithms/QuadraticEquation.java` - solves a quadratic equation from user input.

## Algorithms
- Bubble sort: repeatedly swaps adjacent out-of-order elements, bubbling the
  largest value to the end each pass.
- Selection sort: repeatedly selects the smallest remaining element and swaps it
  into the next position.
- Merge sort: divides the array, recursively sorts halves, then merges sorted
  halves into a single ordered array.
- Euclidean GCD: applies repeated remainder operations until the remainder is
  zero, leaving the greatest common divisor.
- Fibonacci sequence: iteratively generates the first 100 terms by summing the
  previous two values.
- Quadratic equation: computes roots via the quadratic formula and reports real
  solutions based on the discriminant.

## Project structure
```
.
├── README.md
├── src
│   └── algorithms
│       ├── BubbleSort.java
│       ├── SelectionSort.java
│       ├── MergeSort.java
│       ├── GCD_Euclid.java
│       ├── Fibonacci100.java
│       └── QuadraticEquation.java
└── out
```

## How to run
Each file has its own `main` method and is in the `algorithms` package. Compile
and run a specific class, for example:

```bash
javac src/algorithms/MergeSort.java
java -cp src algorithms.MergeSort
```

Programs that read input (`GCD_Euclid`, `QuadraticEquation`) will prompt in the
terminal.

