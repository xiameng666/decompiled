import j..util.Objects;

final class ehwg implements gmbg {
    final String a;
    final ehwi b;

    public ehwg(ehwi ehwi0, String s) {
        this.a = s;
        Objects.requireNonNull(ehwi0);
        this.b = ehwi0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        String s = eice.c(this.a);
        eica.a(this.b.g, "Failed to read data from tag : " + s + " " + throwable0.getMessage());
        synchronized(this.b.b) {
            gmcd gmcd0 = (gmcd)this.b.b.remove(this.a);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        gwhg gwhg0 = (gwhg)object0;
        synchronized(this.b.b) {
            gmcd gmcd0 = (gmcd)this.b.b.remove(this.a);
        }
    }
}

