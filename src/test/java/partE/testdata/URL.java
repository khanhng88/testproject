package partE.testdata;

public enum URL {

    LOGIN_PAGE("/login");


    private final String path;

    URL(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
