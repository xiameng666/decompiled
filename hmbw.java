public final class hmbw extends hmbg {
    public static final hmgz a;
    public hmgz b;
    public hmgz c;
    private static final hmgz d;
    private static final hmgz e;

    static {
        hmbw.d = new hmgz(0x77);
        hmbw.a = new hmgz((byte)0x82);
        hmbw.e = new hmgz(-108);
    }

    @Override  // hmbg
    public final void a(hmdj hmdj0) {
        try {
            hmdk hmdk0 = new hmdk(hmbw.a, this.b);
            hmdj0.b(hmdk0);
            hmdk hmdk1 = new hmdk(hmbw.e, this.c);
            hmdj0.b(hmdk1);
            hmgz hmgz0 = hmbw.d;
            hmdk[] arr_hmdk = {hmdk0, hmdk1};
            int v = 0;
            for(int v1 = 0; v1 < 2; ++v1) {
                v += arr_hmdk[v1].a();
            }
            hmgz hmgz1 = new hmgz(v);
            int v2 = 0;
            for(int v3 = 0; v3 < 2; ++v3) {
                hmdk hmdk2 = arr_hmdk[v3];
                hmgz1.n(v2, hmdk2.d().a);
                v2 += hmdk2.a();
            }
            super.d(new hmdk(hmgz0, hmgz1));
        }
        catch(hmdm | hmdn | hmdl exception0) {
            hmhe.a().b(exception0, "Cannot parse TLV Object while building GPO Response", new Object[0]);
            throw new hmfm(hmfl.as);
        }
    }

    @Override
    public final String toString() {
        this.getClass();
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        hmgz hmgz0 = this.b;
        if(hmgz0 != null) {
            hmgz0.i();
        }
        hmbb0.e();
        hmgz hmgz1 = this.c;
        if(hmgz1 != null) {
            hmgz1.i();
        }
        hmbb0.e();
        return "GetProcessingOptionsResponseApdu";
    }
}

