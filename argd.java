public final class argd implements arlh {
    public final argf a;
    public final arnb b;
    public final Boolean c;

    public argd(argf argf0, arnb arnb0, Boolean boolean0) {
        this.a = argf0;
        this.b = arnb0;
        this.c = boolean0;
    }

    @Override  // arlh
    public final arlk a(arlj arlj0) {
        bblp bblp0 = new bblp(1, 9);
        arpe arpe0 = new arpe(this.a.b, this.a.c, this.b, this.a.h);
        return new arpn(arlj0, this.a.c, bblp0, this.a.h, arpe0, this.c.booleanValue());
    }
}

