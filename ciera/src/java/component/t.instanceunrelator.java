T_b("    ");
T_b("public void ");
T_b(name);
T_b("( ");
T_b(link_parameter_list);
T_b(" ) throws XtumlException {");
T_b("\n");
T_b("        ");
T_b("if ( ");
T_b(link_parameter_null_check);
T_b(" ) throw new BadArgumentException( \"Null instances passed.\" );");
T_b("\n");
T_b("        ");
T_b("if ( ");
T_b(link_parameter_empty_check);
T_b(" ) throw new EmptyInstanceException( \"Cannot relate empty instances.\" );");
T_b("\n");
T_b("        ");
T_b("// TODO check cardinality");
T_b("\n");
T_b("        ");
T_b("if ( !removeRelationship( ((");
T_b(relationship_set_cast);
T_b(")getRelationshipSet( ");
T_b(rel_num);
T_b(" )).getByInstanceIds( ");
T_b(link_parameter_ids);
T_b(" ) ) ) throw new ModelIntegrityException( \"Instances are not related.\" );");
T_b("\n");
T_b("        ");
T_b("// TODO propagate referentials?");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");