public final class igvt {
    public int a;
    public boolean b;
    public igvr c;
    private final byte[] d;
    private int e;

    public igvt(byte[] arr_b) {
        this.c = null;
        this.d = arr_b;
        this.a = 0;
        this.e = 7;
        this.b = false;
    }

    public final byte a(byte b) {
        if(this.b) {
            throw new igvu(2);
        }
        byte b1 = 0;
        for(int v = 0; v < b; ++v) {
            b1 = (byte)(((byte)(b1 + b1)) | this.b());
        }
        return b1;
    }

    public final int b() {
        if(this.b) {
            throw new igvu(2);
        }
        byte[] arr_b = this.d;
        int v = this.a;
        int v1 = this.e;
        int v2 = (arr_b[v] & 1 << v1) == 0 ? 0 : 1;
        igvr igvr0 = this.c;
        ++igvr0.c;
        igvr0.a = v;
        igvr0.b = v1;
        this.e = v1 - 1;
        if(v1 - 1 == -1) {
            this.e = 7;
            this.a = v + 1;
            if(v + 1 >= arr_b.length) {
                this.b = true;
            }
        }
        return v2;
    }

    public final int c(int v) {
        this.f();
        if(v > 0x20 || v <= 0) {
            throw new igvu(1);
        }
        if(this.b) {
            throw new igvu(2);
        }
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 + v2 | this.b();
        }
        return v2;
    }

    public final long d(long v) {
        this.f();
        if(v > 0x40L) {
            throw new igvu(1);
        }
        if(this.b) {
            throw new igvu(2);
        }
        long v2 = 0L;
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            v2 = v2 + v2 | ((long)this.b());
        }
        return v2;
    }

    public final igvv e() {
        return new igvv(this.a, this.e);
    }

    public final void f() {
        igvr igvr0 = new igvr(this.a, this.e);
        this.c = igvr0;
        igvr0.c = 0;
    }

    public final void g(igvv igvv0) {
        this.a = igvv0.a;
        this.e = igvv0.b;
        this.b = false;
    }

    final byte[] h(int v) {
        if(v <= 0) {
            throw new igvu(4);
        }
        byte[] arr_b = new byte[v];
        this.f();
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = this.a(8);
        }
        return arr_b;
    }

    public final void i(int v) {
        if(v <= 0) {
            throw new igvu(4);
        }
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = this.a(8);
        }
    }
}

