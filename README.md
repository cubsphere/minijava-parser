# minijava-parser
AST construction, symbol table construction and type checking for minijava made with antlr.

The antlr grammar used to generate sources is located at src/main/antlr4/minijava.g4
The AST is built by the class ASTGenerator, which inherits from minijavaBaseListener. Its source file is src/main/java/minijava/ASTGenerator.java

The symbol table is built by the class BuildSymbolTableVisitor, which traverses the AST to build its symbol table. Its source file is src/main/java/br/ufpe/cin/if688/minijava/visitor/BuildSymbolTableVisitor.java
The type checking is performed by the class TypeCheckVisitor, which uses the symbol table and traverses the AST to find type errors. We took the liberty to also make it check for inheritance errors. Its source file is src/main/java/br/ufpe/cin/if688/minijava/visitor/TypeCheckVisitor.java
BuildSymbolTableVisitor and TypeCheckVisitor will attempt to continue traversing an AST even after encountering an error. This is done in an effort to find all errors at once rather than one by one. However, sometimes it isn't possible to continue, so there's no guarantee that they will find all errors.

The Main class reads all files from src/test/resources, parses them to generate ASTs, and visits them with a PrettyPrintVisitor, a BuildSymbolTableVisitor, and a TypeCheckVisitor. The files in this folder are valid minijava programs, so no error messages will be produced. It then repeats the process for src/test/resources/type-errors, which contains files with multiple type errors, which will be found and reported.

Made by lml and insbs