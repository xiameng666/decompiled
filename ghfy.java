public abstract class ghfy {
    private static final char[] a;
    public static final int b;

    static {
        ghfy.a = "0123456789abcdef".toCharArray();
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract boolean d(ghfy arg1);

    public abstract byte[] e();

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghfy) && this.b() == ((ghfy)object0).b() && this.d(((ghfy)object0));
    }

    public byte[] f() {
        return this.e();
    }

    public abstract void g(byte[] arg1, int arg2);

    public static ghfy h(String s) {
        boolean z = true;
        gftb.f(s.length() >= 2, "input string (%s) must have at least 2 characters", s);
        if(s.length() % 2 != 0) {
            z = false;
        }
        gftb.f(z, "input string (%s) must have an even number of characters", s);
        byte[] arr_b = new byte[s.length() / 2];
        for(int v = 0; v < s.length(); v += 2) {
            arr_b[v / 2] = (byte)((ghfy.j(s.charAt(v)) << 4) + ghfy.j(s.charAt(v + 1)));
        }
        return new ghfv(arr_b);
    }

    @Override
    public final int hashCode() {
        if(this.b() >= 0x20) {
            return this.a();
        }
        byte[] arr_b = this.f();
        int v = arr_b[0] & 0xFF;
        for(int v1 = 1; v1 < arr_b.length; ++v1) {
            v |= (arr_b[v1] & 0xFF) << v1 * 8;
        }
        return v;
    }

    public final void i(byte[] arr_b, int v) {
        int v1 = Math.min(v, this.b() / 8);
        gftb.p(0, v1, arr_b.length);
        this.g(arr_b, v1);
    }

    private static int j(char c) {
        if(c >= 0x30 && c <= 57) {
            return c - 0x30;
        }
        if(c >= 97 && c <= 102) {
            return c - 87;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c);
    }

    @Override
    public final String toString() {
        byte[] arr_b = this.f();
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length + arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            stringBuilder0.append(ghfy.a[v1 >> 4 & 15]);
            stringBuilder0.append(ghfy.a[v1 & 15]);
        }
        return stringBuilder0.toString();
    }
}

