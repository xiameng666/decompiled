public final class hmdh extends hmdg {
    public hmdh(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, byte[] arr_b4) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
        this.d = arr_b3;
        this.e = arr_b4;
    }

    @Override  // hmdg
    protected final hmdf b() {
        hmgz hmgz0 = hmgz.e(this.a);
        try {
            hmgz0.o(0, this.a, 0, 18);
            hmgz0.n(2, this.b);
            byte[] arr_b = this.d;
            if(arr_b != null) {
                hmgz0.n(8, arr_b);
            }
            hmgz hmgz1 = hmgz.e(new byte[]{0, 0, 0, 0, 0, 0, 0, -1});
            hmgz1.o(1, this.c, 0, 5);
            hmgz0.o(10, hmgz1.a, 0, hmgz1.b());
            byte[] arr_b1 = this.e;
            if(arr_b1 != null) {
                hmgz0.s(arr_b1);
                return new hmdf(hmgz0);
            }
        }
        catch(hmdl hmdl0) {
            throw new hmdd("Issuer Application Data components have incorrect length: " + hmdl0.getMessage());
        }
        return new hmdf(hmgz0);
    }

    @Override  // hmdg
    protected final void c() {
        super.c();
        byte[] arr_b = this.d;
        if(arr_b != null && arr_b.length != 2) {
            throw new hmdd("CdCvm Information has incorrect length: " + arr_b.length);
        }
    }
}

