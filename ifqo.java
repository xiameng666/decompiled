public final class ifqo extends ifqj implements iftu {
    public final ifqk c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public ifqo(ifqn ifqn0) {
        super(false, ifqn0.a.b());
        ifqk ifqk0 = ifqn0.a;
        this.c = ifqk0;
        if(ifqk0 == null) {
            throw new NullPointerException("params == null");
        }
        int v = ifqk0.a();
        byte[] arr_b = ifqn0.d;
        if(arr_b != null) {
            if(arr_b.length == v + v) {
                this.d = 0;
                this.e = ifqy.h(arr_b, 0, v);
                this.f = ifqy.h(arr_b, v, v);
                return;
            }
            if(arr_b.length != v + 4 + v) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.d = ifua.a(arr_b, 0);
            this.e = ifqy.h(arr_b, 4, v);
            this.f = ifqy.h(arr_b, v + 4, v);
            return;
        }
        ifqr ifqr0 = ifqk0.b;
        this.d = ifqr0 == null ? 0 : ((ifps)ifqr0).b;
        byte[] arr_b1 = ifqn0.b;
        if(arr_b1 == null) {
            this.e = new byte[v];
        }
        else {
            if(arr_b1.length != v) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.e = arr_b1;
        }
        byte[] arr_b2 = ifqn0.c;
        if(arr_b2 != null) {
            if(arr_b2.length != v) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f = arr_b2;
            return;
        }
        this.f = new byte[v];
    }

    public final byte[] a() {
        return ifqy.g(this.f);
    }

    public final byte[] b() {
        return ifqy.g(this.e);
    }

    public final byte[] c() {
        byte[] arr_b;
        int v = this.d;
        int v1 = this.c.a();
        int v2 = 0;
        if(v == 0) {
            arr_b = new byte[v1 + v1];
        }
        else {
            arr_b = new byte[v1 + 4 + v1];
            ifua.f(v, arr_b, 0);
            v2 = 4;
        }
        ifqy.d(arr_b, this.e, v2);
        ifqy.d(arr_b, this.f, v2 + v1);
        return arr_b;
    }

    @Override  // iftu
    public final byte[] u() {
        return this.c();
    }
}

