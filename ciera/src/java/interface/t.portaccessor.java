T_b("    ");
T_b("private ");
T_b(self->name);
T_b(" ");
T_b(self->name);
T_b(";");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(self->name);
T_b(" ");
T_b(self->name);
T_b("() {");
T_b("\n");
T_b("        ");
T_b("if ( null == ");
T_b(self->name);
T_b(" ) ");
T_b(self->name);
T_b(" = new ");
T_b(self->name);
T_b("( this );");
T_b("\n");
T_b("        ");
T_b("return ");
T_b(self->name);
T_b(";");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
