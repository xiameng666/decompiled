public final class hmgi extends hmgk {
    public final hmgc a;
    public hmgh b;
    private final hmbb c;
    private hmhc d;

    public hmgi(hmgf hmgf0) {
        this.b = hmgh.a;
        this.a = (hmgc)hmgf0;
        this.c = hmhe.a();
        this.d = new hmhc(2000, new hmgg(this));
    }

    @Override  // hmgk
    public final hmgf a() {
        return this.a;
    }

    @Override  // hmgk
    public final void b() {
        hmhc hmhc0 = this.d;
        if(hmhc0 != null) {
            hmhc0.a();
            this.d = null;
        }
    }

    public final void c(hmgh hmgh0) {
        this.b = hmgh0;
        this.c.c("Set engine state: %s", new Object[]{hmgh0.toString()});
    }

    @Override  // hmgk
    public final boolean d() {
        return true;
    }

    public final byte[] e(byte[] arr_b) {
        hmhc hmhc0 = this.d;
        if(hmhc0 != null) {
            hmhc0.a();
        }
        hmbg hmbg0 = hmbd.a(arr_b, new hmbf(this.a, this)).a();
        hmhc hmhc1 = this.d;
        if(hmhc1 != null) {
            hmhc1.b();
        }
        return hmbg0.b();
    }
}

