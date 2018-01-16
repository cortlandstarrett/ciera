package ${package};

${imports}

public class ${name} extends ${extends} {
    
    private Map<String, Class<?>> classes;
    private Map<Integer, Class<?>> relationships;

    public ${name}() {
        super(${port_initializers});
        setClasses();
        setRelationships();
    }
    
    // selections
${selects}

    // ports
${ports}

    // component initialization function
    @Override
    public void initialize() throws XtumlException {
${init}
    }

    @Override
    public Map<String, Class<?>> getClasses() {
        return classes;
    }

    @Override
    public Map<Integer, Class<?>> getRelationships() {
        return relationships;
    }

    private void setClasses() {
        classes = new HashMap<>();
${classes}\
    }

    private void setRelationships() {
        relationships = new HashMap<>();
${relationships}\
    }

}
