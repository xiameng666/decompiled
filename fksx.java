public final class fksx implements glzn {
    public final fktl a;
    public final long b;
    public final fkjn c;
    public final fkjt d;

    public fksx(fktl fktl0, long v, fkjn fkjn0, fkjt fkjt0) {
        this.a = fktl0;
        this.b = v;
        this.c = fkjn0;
        this.d = fkjt0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        gmcd gmcd0 = this.a.b(this.b, this.c.c, this.d);
        gmcd gmcd1 = this.a.b(this.c.b, this.c.c, this.a.c);
        return gmbu.b(new gmcd[]{gmcd0, gmcd1}).a(new fksu(gmcd0, gmcd1), this.a.e);
    }
}

