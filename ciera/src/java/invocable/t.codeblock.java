if ( multiline ) {
T_b("{");
T_b("\n");
T_b(statements);
T_b("\n");
T_b("}");
} else {
T_b(statements);
T_b("\n");
}