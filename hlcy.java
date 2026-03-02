public enum hlcy {
    DEFAULT,
    DETAILED;

    public final String c;

    private hlcy() {
        this.c = "com.google.fitness.activity." + this.name();
    }
}

