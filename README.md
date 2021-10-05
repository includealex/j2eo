# J2EO: Java to EO Translator

<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px"  alt="eolang icon"/>

---

[![Gradle Build](https://github.com/polystat/j2eo/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/polystat/j2eo/actions/workflows/gradle-build.yml)

This is a translator of Java to [EOLANG](https://www.eolang.org).

---

## Motivation

This project is a part of Polystat project, the goal of which is to statically analyze different languages using EOLANG,
the implementation of phi-calculus. In order to do that, the first step is to convert source language into EO. This
particular repository contains translator from Java to EO.

---

## Decisions

**Q**: Why do we implement yet another Java parser?

**A**: Publicly available parsers only support older versions of Java, while we aim to support the latest version (
currently 16). Thus, we had to create our own parser.

---

**Q**: Why do we implement EO AST?

**A**: Working with AST instead of raw strings allows utilization of Java compiler's type checking to minimize amount of
bugs in our code. It is also much easier to work with abstraction layer than with strings.

---

## Usage

> ⚠️ NOTE: for now, the entire pipeline is not available. Project is Work In Progress.

```shell
java -jar j2eo.jar <source package directory> -o <output directory>
```

---

## How does it work?

- First, the Java source code files are parsed recursively.
- Then, for each file, translator converts Java AST to EO AST.
- Then, EO AST is printed out as a source code to output directory in the same directory structure.

## What's inside?

The Java parser is implemented using the Bison tool that generates bottom-up parser using a language grammar definition. The Java grammar based on the latest (16th and 17th) versions of the Java Language Specification was developed for that.
The parser generated by Bison is equipped by semantic actions that generate the abstract syntax tree (AST). The AST contains all information sufficient for the further EOLang generation.