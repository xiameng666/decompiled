public enum bndy {
    NON_USER_ACTION(0),
    POSSIBLE_USER_ACTION(1),
    EXPLICIT_USER_ACTION(2);

    public final int d;

    private bndy(int v1) {
        this.d = v1;
    }
}

