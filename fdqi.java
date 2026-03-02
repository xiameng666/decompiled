public enum fdqi {
    STATIC("s", "+", "+#"),
    DYNAMIC("d", "-", "-#");

    public final String c;
    public final String d;
    public final String e;

    private fdqi(String s1, String s2, String s3) {
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }
}

