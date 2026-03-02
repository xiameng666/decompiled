public final class hmcv implements hmhh {
    public static final hmgz a;
    public final byte[] b;

    static {
        hmcv.a = hmgz.e(new byte[]{0x5F, 36});
    }

    public hmcv(byte[] arr_b) {
        String s;
        this.b = arr_b;
        if(arr_b != null && (arr_b.length == 2 || arr_b.length == 3)) {
            return;
        }
        if(arr_b == null) {
            s = "null";
        }
        else {
            hmgz.e(arr_b);
            s = "MChipByteArray";
        }
        throw new hmfq(hmfl.B, "Invalid Expiration Date in DSRP profile data: " + s);
    }

    public final hmhd a() {
        byte[] arr_b = this.b;
        int v = 1;
        int v1 = (int)hmgv.a(new byte[]{arr_b[0]});
        int v2 = (int)hmgv.a(new byte[]{arr_b[1]});
        if(arr_b.length == 3) {
            v = (int)hmgv.a(new byte[]{arr_b[2]});
        }
        return new hmhd(v1, v2, v);
    }

    @Override  // hmhh
    public final void g() {
        hmhg.b(this.b);
    }
}

