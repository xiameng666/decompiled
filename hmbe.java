public abstract class hmbe implements hmhh {
    protected hmbb a;
    public final byte[] b;

    public hmbe(byte[] arr_b) {
        if(arr_b == null || arr_b.length < 4) {
            throw new hmfn(hmfl.R);
        }
        this.b = arr_b;
        this.a = hmhe.a();
        this.f();
    }

    public final byte a() {
        return this.b[0];
    }

    public final byte b() {
        return this.b[4];
    }

    public final byte c() {
        return this.b[this.b.length - 1];
    }

    public final byte d() {
        return this.b[2];
    }

    public final byte e() {
        return this.b[3];
    }

    protected abstract void f();

    @Override  // hmhh
    public void g() {
        hmhg.b(this.b);
    }

    public final byte[] h() {
        int v = this.b() & 0xFF;
        byte[] arr_b = new byte[v];
        System.arraycopy(this.b, 5, arr_b, 0, v);
        return arr_b;
    }

    @Override
    public final String toString() {
        hmbb hmbb0 = this.a;
        hmgz.e(this.b).i();
        hmbb0.e();
        return "CommandApdu";
    }
}

