public final class hmgq implements hmhu {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public int g;

    @Override  // hmhu
    public final byte[] a() {
        return this.a;
    }

    @Override  // hmhu
    public final byte[] b() {
        return this.e;
    }

    @Override  // hmhu
    public final byte[] c() {
        return this.b;
    }

    @Override  // hmhu
    public final byte[] d() {
        return this.f;
    }

    @Override  // hmhu
    public final byte[] e() {
        return this.d;
    }

    @Override  // hmhu
    public final byte[] f() {
        return this.c;
    }

    @Override  // hmhu
    public final int g() {
        return this.g;
    }

    @Override
    public final String toString() {
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        hmgz.e(this.a).i();
        hmbb0.e();
        hmgz.e(this.b).i();
        hmbb0.e();
        hmbb0.e();
        hmgz.e(this.c).i();
        hmbb0.e();
        hmbb0.e();
        new hmhd(this.d).a();
        hmbb0.e();
        byte[] arr_b = this.e;
        if(arr_b != null) {
            hmgz.e(arr_b).i();
        }
        hmbb0.e();
        byte[] arr_b1 = this.f;
        if(arr_b1 != null) {
            hmgz.e(arr_b1);
        }
        hmbb0.e();
        hmbb0.e();
        return "DsrpInputData";
    }
}

