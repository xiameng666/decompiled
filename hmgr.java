public final class hmgr {
    public final byte[] a;
    public final byte[] b;
    private final String c;
    private final hmhd d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;

    public hmgr(String s, hmhd hmhd0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, byte[] arr_b4) {
        this.c = s;
        this.d = hmhd0;
        this.a = arr_b;
        this.e = arr_b1;
        this.f = arr_b2;
        this.g = arr_b3;
        this.b = arr_b4;
    }

    public final byte[] a() {
        return new hmgz(this.d.a()).a;
    }

    public final byte[] b() {
        return this.c.getBytes();
    }

    @Override
    public final String toString() {
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        hmbb0.e();
        hmbb0.e();
        hmbb0.e();
        hmgz.e(this.a).i();
        hmbb0.e();
        hmgz.e(this.e).i();
        hmbb0.e();
        hmgz.e(this.f).i();
        hmbb0.e();
        hmbb0.e();
        hmgz.e(this.g).i();
        hmbb0.e();
        hmbb0.e();
        hmbb0.e();
        hmbb0.e();
        return "DsrpOutputData";
    }
}

