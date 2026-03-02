public class bcrc extends Exception {
    public final gmfx a;
    public final boolean b;

    public bcrc(gmfx gmfx0, boolean z) {
        this.a = gmfx0;
        this.b = z;
    }

    public bcrc(String s, gmfx gmfx0, boolean z) {
        super(s);
        this.a = gmfx0;
        this.b = z;
    }

    public bcrc(String s, gmfx gmfx0, boolean z, Throwable throwable0) {
        super(s, throwable0);
        this.a = gmfx0;
        this.b = z;
    }

    public bcrc(Throwable throwable0, gmfx gmfx0) {
        super(throwable0);
        this.b = false;
        this.a = gmfx0;
    }
}

