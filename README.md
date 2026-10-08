# Java-practice

A collection of small Java practice programs covering core language features: enums, generics with sorting (`Comparable` / `Comparator`), inner classes, lambdas with `forEach`, and the Stream API. Each file is a standalone program with its own `main` method, written while learning these topics.

## What's inside

| Folder | Topic | Files |
| --- | --- | --- |
| `Hello/` | Basic warm-up: `getClass()` and `getClass().getName()` on a `String` | `World.java` |
| `Enums/` | Enum basics, `values()` and `ordinal()`, enum constructors/fields/methods, enums in `switch` | `En_1` - `En_3` |
| `Generics/` | Sorting lists with `Collections.sort`, implementing `Comparable`, custom `Comparator` classes, comparators as lambdas, ascending/descending order | `Gen_1` - `Gen_7` |
| `InnerClasses/` | Creating inner class instances from static and instance contexts and from other classes, variable access from inner classes, `Outer.this` for shadowed fields | `IC_1` - `IC_5` |
| `forEach/` | `Iterable.forEach` with an anonymous `Consumer` class and with lambdas | `forEach_1.java` |
| `Stream/` | Streams: single-use streams, `filter` / `map` / `reduce`, chained pipelines, `parallelStream` | `Str_1` - `Str_4` |
| `Practice/` | Empty scratch file (`main` does nothing) | `Pr_1.java` |

There is no build tool (no Maven or Gradle); each folder name matches the Java package declared in its files.

## Prerequisites

- JDK 16 or newer (`InnerClasses/IC_4.java` declares a `static` field inside an inner class, which requires Java 16+)

## How to run

Run commands from the repository root so the package names line up with the folders. Compile a file (or a folder) with `javac`, then run the class by its fully qualified name.

```bash
# Compile and run a single program
javac Stream/Str_3.java
java Stream.Str_3

# Compile a whole folder, then run any class in it
javac Enums/*.java
java Enums.En_2

javac InnerClasses/*.java
java InnerClasses.IC_5
```

The commands are the same on Windows (Command Prompt or PowerShell), Linux and macOS; on Windows you may use `\` instead of `/` in file paths.

Compiling puts `.class` files next to the sources. With Java 11+ you can also run a single-file program directly without compiling, as long as it doesn't depend on other files, e.g. `java Stream/Str_3.java`.

## Notes

Some files demonstrate errors on purpose:

- `Generics/Gen_2.java` does not compile: `Student` does not implement `Comparable`, so `Collections.sort(al)` is rejected. `Gen_3` shows the fix. Because of this, compile the `Generics` files one at a time (e.g. `javac Generics/Gen_3.java`) instead of `javac Generics/*.java`.
- `Stream/Str_1.java` throws an `IllegalStateException` at runtime because it calls `forEach` on the same stream twice, showing that a stream can only be consumed once.
- `InnerClasses/IC_5.java` imports `InnerClasses.Outer4.Inner4` from `IC_4.java`, so compile both together (e.g. `javac InnerClasses/*.java`).
