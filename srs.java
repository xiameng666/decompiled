public enum srs {
    GET(new ssy(0xFF6E)),
    PUT(new ssy(0xFF6F));

    public final ssy c;

    private srs(ssy ssy0) {
        this.c = ssy0;
    }
}

