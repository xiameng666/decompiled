enum cymw {
    IN_USE("InUse"),
    MOST_RECENTLY_IN_USE("MostRecentlyInUse"),
    NOT_IN_USE("NotInUse");

    private final String e;

    private cymw(String s1) {
        this.e = s1;
    }

    @Override
    public final String toString() {
        return this.e;
    }
}

