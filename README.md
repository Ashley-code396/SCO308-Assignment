# SCO308-Assignment

Small collection of standalone Java console programs demonstrating classic
algorithms and math exercises.

## Contents
- `src/BubbleSort.java` - bubble sort with per-pass swap output.
- `src/SelectionSort.java` - selection sort with pass-by-pass array state.
- `src/MergeSort.java` - merge sort implementation and demo run.
- `src/GCD_Euclid.java` - Euclidean algorithm for GCD from user input.
- `src/Fibonacci100.java` - prints the first 100 Fibonacci numbers.
- `src/QuadraticEquation.java` - solves a quadratic equation from user input.

## How to run
Each file has its own `main` method. Compile and run a specific class, for
example:

```bash
javac src/MergeSort.java
java -cp src MergeSort
```

Programs that read input (`GCD_Euclid`, `QuadraticEquation`) will prompt in the
terminal.
