public final class dvoh extends fgxh {
    static final byte[] a;
    public final byte[] b;
    public final byte[] c;

    static {
        dvoh.a = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public dvoh(byte[] arr_b, short v) {
        this.b = arr_b;
        if(v < 2) {
            this.c = dvoh.a;
            return;
        }
        this.c = new byte[0];
    }

    @Override  // fgxh
    public final fgxe a() {
        return fgxe.c;
    }

    @Override  // fgxh
    public final fgxg b() {
        return fgxg.o;
    }

    @Override  // fgxh
    public final byte[] c() {
        return fgyg.ar;
    }

    @Override  // fgxh
    public final byte[] d() {
        return new byte[0];
    }

    @Override  // fgxh
    public final byte[] e() {
        return this.c;
    }

    @Override  // fgxh
    public final byte[] f() {
        return this.b;
    }
}

