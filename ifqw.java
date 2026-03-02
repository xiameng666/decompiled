public final class ifqw extends ifqi implements iftu {
    public final ifqs c;
    public final byte[] d;
    public final byte[] e;
    private final int f;

    public ifqw(ifqv ifqv0) {
        super(false, ifqv0.a.e);
        ifqs ifqs0 = ifqv0.a;
        this.c = ifqs0;
        if(ifqs0 == null) {
            throw new NullPointerException("params == null");
        }
        int v = ifqs0.f;
        byte[] arr_b = ifqv0.d;
        if(arr_b != null) {
            if(arr_b.length == v + v) {
                this.f = 0;
                this.d = ifqy.h(arr_b, 0, v);
                this.e = ifqy.h(arr_b, v, v);
                return;
            }
            if(arr_b.length != v + 4 + v) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.f = ifua.a(arr_b, 0);
            this.d = ifqy.h(arr_b, 4, v);
            this.e = ifqy.h(arr_b, v + 4, v);
            return;
        }
        ifqr ifqr0 = ifqs0.b;
        this.f = ifqr0 == null ? 0 : ((ifpt)ifqr0).b;
        byte[] arr_b1 = ifqv0.b;
        if(arr_b1 == null) {
            this.d = new byte[v];
        }
        else {
            if(arr_b1.length != v) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.d = arr_b1;
        }
        byte[] arr_b2 = ifqv0.c;
        if(arr_b2 != null) {
            if(arr_b2.length != v) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.e = arr_b2;
            return;
        }
        this.e = new byte[v];
    }

    public final byte[] a() {
        byte[] arr_b;
        int v = this.c.f;
        int v1 = this.f;
        int v2 = 0;
        if(v1 == 0) {
            arr_b = new byte[v + v];
        }
        else {
            arr_b = new byte[v + 4 + v];
            ifua.f(v1, arr_b, 0);
            v2 = 4;
        }
        ifqy.d(arr_b, this.d, v2);
        ifqy.d(arr_b, this.e, v2 + v);
        return arr_b;
    }

    @Override  // iftu
    public final byte[] u() {
        return this.a();
    }
}

