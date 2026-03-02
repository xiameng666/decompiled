public final class hmfk extends hmfj implements hmhh {
    private static final hmgz a;

    static {
        hmfk.a = hmgz.e(new byte[]{-33, 75});
    }

    public hmfk() {
        this.b = new hmgz(3);
        hmbb hmbb0 = this.c;
        ((hmgz)this.b).h();
        hmbb0.e();
    }

    public final hmdk a() {
        hmgz hmgz0 = hmgz.d(((hmgz)this.b));
        return new hmdk(hmfk.a, hmgz0);
    }

    public final hmgz b() {
        return (hmgz)this.b;
    }

    public final void c(byte b) {
        hmgz hmgz0 = (hmgz)this.b;
        hmgz0.m(1, ((byte)(b | hmgz0.a(1))));
    }

    @Override  // hmhh
    public final void g() {
        hmhg.a(((hmhh)this.b));
    }
}

