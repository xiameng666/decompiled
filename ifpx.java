final class ifpx {
    public final int a;
    private final iecl b;

    protected ifpx(idqg idqg0, int v) {
        this.b = ifpu.b(idqg0);
        this.a = v;
    }

    protected final byte[] a(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != this.a) {
            throw new IllegalArgumentException("wrong key length");
        }
        if(arr_b1.length == 0x20) {
            return this.b(3, arr_b, arr_b1);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public final byte[] b(int v, byte[] arr_b, byte[] arr_b1) {
        int v1 = this.a;
        byte[] arr_b2 = ifqy.j(v, v1);
        iecl iecl0 = this.b;
        iecl0.update(arr_b2, 0, arr_b2.length);
        iecl0.update(arr_b, 0, arr_b.length);
        iecl0.update(arr_b1, 0, arr_b1.length);
        byte[] arr_b3 = new byte[v1];
        if((iecl0 instanceof iedd)) {
            ((iedd)iecl0).b(arr_b3, 0, v1);
            return arr_b3;
        }
        iecl0.doFinal(arr_b3, 0);
        return arr_b3;
    }
}

