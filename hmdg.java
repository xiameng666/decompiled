public class hmdg {
    protected byte[] a;
    protected byte[] b;
    protected byte[] c;
    protected byte[] d;
    protected byte[] e;

    public hmdg() {
    }

    public hmdg(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
    }

    public final hmdf a() {
        this.c();
        return this.b();
    }

    protected hmdf b() {
        hmgz hmgz0 = hmgz.e(this.a);
        try {
            hmgz0.o(0, this.a, 0, 18);
            hmgz0.n(2, this.b);
            hmgz hmgz1 = hmgz.e(new byte[]{0, 0, 0, 0, 0, 0, 0, -1});
            hmgz1.o(1, this.c, 0, 5);
            hmgz0.o(10, hmgz1.a, 0, hmgz1.b());
            return new hmdf(hmgz0);
        }
        catch(hmdl hmdl0) {
            throw new hmdd("Issuer Application Data components have incorrect length: " + hmdl0.getMessage());
        }
    }

    protected void c() {
        byte[] arr_b = this.a;
        if(arr_b != null) {
            byte[] arr_b1 = this.b;
            if(arr_b1 != null && this.c != null) {
                if(arr_b.length != 18) {
                    throw new hmdd("Issuer Application Data in Card Profile has incorrect length: " + arr_b.length);
                }
                if(arr_b1.length == 6) {
                    return;
                }
                throw new hmdd("Card Verification Result has incorrect length: " + arr_b1.length);
            }
        }
        throw new hmdd("Issuer Application Data input is invalid (null)");
    }
}

