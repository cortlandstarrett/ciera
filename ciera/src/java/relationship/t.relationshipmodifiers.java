T_b("    ");
T_b("public void relate_");
T_b(self->name);
T_b("( ");
T_b(self->form_name);
T_b(" form, ");
T_b(self->part_name);
T_b(" part ) throws XtumlException {");
T_b("\n");
T_b("        ");
T_b("if ( null == form || null == part ) throw new BadArgumentException( \"Null instances passed.\" );");
T_b("\n");
T_b("        ");
T_b("if ( form instanceof IEmptyInstance || part instanceof IEmptyInstance ) throw new EmptyInstanceException( \"Cannot relate empty instances.\" );");
T_b("\n");
T_b(cardinality_check);
T_b("\n");
T_b("        ");
T_b("if ( ");
T_b(self->name);
T_b("_extent.add( new Relationship( form.getInstanceId(), part.getInstanceId() ) ) ) {");
T_b("\n");
T_b(attribute_propagations);
T_b("\n");
T_b("        ");
T_b("}");
T_b("\n");
T_b("        ");
T_b("else throw new ModelIntegrityException( \"Instances could not be related.\" );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("public void unrelate_");
T_b(self->name);
T_b("( ");
T_b(self->form_name);
T_b(" form, ");
T_b(self->part_name);
T_b(" part ) throws XtumlException {");
T_b("\n");
T_b("        ");
T_b("if ( null == form || null == part ) throw new BadArgumentException( \"Null instances passed.\" );");
T_b("\n");
T_b("        ");
T_b("if ( form instanceof IEmptyInstance || part instanceof IEmptyInstance ) throw new EmptyInstanceException( \"Cannot unrelate empty instances.\" );");
T_b("\n");
T_b("        ");
T_b("if ( !");
T_b(self->name);
T_b("_extent.remove( ");
T_b(self->name);
T_b("_extent.get( form.getInstanceId(), part.getInstanceId() ) ) ) throw new ModelIntegrityException( \"Instances could not be unrelated.\" );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
