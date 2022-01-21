public abstract class User {

    // to write the names to all participants
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person {"
                + "Name='" + name + '\''
                + '}';
    }

}
