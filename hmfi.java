public final class hmfi extends hmfj implements hmhh {
    private static final hmgz a;

    static {
        hmfi.a = hmgz.e(new byte[]{-97, 39});
    }

    public hmfi() {
        this.b = (int)0;
        this.c.e();
    }

    public final hmdk a() {
        hmgz hmgz0 = new hmgz(((byte)(((Byte)this.b))));
        return new hmdk(hmfi.a, hmgz0);
    }

    public final hmgz b() {
        return new hmgz(((byte)(((Byte)this.b))));
    }

    public final void c() {
        this.b = (byte)(byte)0x80;
        this.c.e();
    }

    @Override  // hmhh
    public final void g() {
        this.b = (int)0;
    }
}

