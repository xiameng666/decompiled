import j..util.Objects;

public final class fdvo implements jqv {
    public final fdvu a;
    public final String b;
    public final long c;

    public fdvo(fdvu fdvu0, String s, long v) {
        this.a = fdvu0;
        this.b = s;
        this.c = v;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        synchronized(this.a.k) {
            fdvm fdvm0 = new fdvm(jqt0);
            Objects.requireNonNull(jqt0);
            fdvn fdvn0 = new fdvn(jqt0);
            this.a.w = new feua(this.b, this.c, fdvm0, fdvn0);
        }
        return "Tracking sequence IDs for data sync progression";
    }
}

