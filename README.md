# minijava-parser
AST construction for minijava made with antlr.

The antlr grammar used to generate sources is located at src/main/antlr4/minijava.g4
The task is accomplished by the class ASTGenerator, which inherits from minijavaBaseListener. Its source file is src/main/java/minijava/ASTGenerator.java

The Main class reads all files from src/test/resources, parses them to generate ASTs, and visits them with a PrettyPrintVisitor.

Made by lml and insbs