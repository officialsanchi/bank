package reflection;

public class Problem {
    private String name;
    private Types types;


    public Problem(String name, Types types) {
        this.name = name;
        this.types = types;
    }
    public String getName() {
        return name;
    }
    public Types getTypes() {
        return types;


    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTypes(Types types) {
        this.types = types;

    }
}

