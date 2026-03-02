public final class hmdf extends hmfj implements hmhh {
    private static final hmgz a;

    static {
        hmdf.a = hmgz.e(new byte[]{-97, 16});
    }

    public hmdf(hmgz hmgz0) {
        this.b = hmgz0;
    }

    public final byte a() {
        return ((hmgz)this.b).a(1);
    }

    public final byte b() {
        return ((hmgz)this.b).a(0);
    }

    public final hmdk c() {
        hmgz hmgz0 = hmgz.d(((hmgz)this.b));
        return new hmdk(hmdf.a, hmgz0);
    }

    @Override  // hmhh
    public final void g() {
    }
}

