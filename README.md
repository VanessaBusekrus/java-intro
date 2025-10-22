# Java Intro - Repository of small Java examples

This repository contains small Java example programs used for learning and practice. Each example lives in its own folder and contains the source file(s) necessary to compile and run the example.

## Repository structure

- `CodeWithMosh/` - Examples and exercises from the "Java Programming Masterclass" (compiled `.class` files may be present).
- `FizzBuzz/` - A simple FizzBuzz example (`Main.java`).
- `HelloWorld/` - A basic "Hello, World!" example (`Main.java`).
- `MortgageCalculator/` - A small mortgage calculator example (`Main.java`).

> Note: Some directories may contain `.class` files (compiled bytecode). Source `.java` files are the authoritative source; recompile if needed.

## Requirements

- Java JDK 8 or newer installed (OpenJDK or Oracle JDK).
- `javac` and `java` on your PATH.

You can check your Java version with:

```bash
java -version
javac -version
```

## How to compile and run

Each sample has its own `Main.java`. You can compile and run them individually from the repository root.

Compile an example (from repository root):

```bash
# compile
javac FizzBuzz/Main.java

# run
java -cp . FizzBuzz.Main
```

Or compile and run HelloWorld:

```bash
javac HelloWorld/Main.java
java -cp . HelloWorld.Main
```

If the folder contains multiple `.java` files or uses packages, compile the entire folder:

```bash
javac -d out $(find HelloWorld -name "*.java")
java -cp out HelloWorld.Main
```

## Quick commands

From repository root, compile and run FizzBuzz:

```bash
javac FizzBuzz/Main.java && java -cp . FizzBuzz.Main
```

Recompile all `.java` files under the repo (simple approach):

```bash
find . -name "*.java" -print | xargs javac
```

## Acknowledgement
This code is derived from the [Java Full Course For Beginners by Programming with Mosh](https://www.youtube.com/watch?v=eIrMbAQSU34&t=31s).
