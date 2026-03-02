import java.io.IOException;

public final class ifqm extends ifqj implements iftu {
    public final ifqk c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile long h;
    private volatile ifpq i;

    public ifqm(ifql ifql0) {
        super(true, ifql0.a.b());
        ifqk ifqk0 = ifql0.a;
        this.c = ifqk0;
        int v = ifqk0.a();
        this.h = ifql0.b;
        byte[] arr_b = ifql0.d;
        if(arr_b == null) {
            this.d = new byte[v];
        }
        else {
            if(arr_b.length != v) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = arr_b;
        }
        byte[] arr_b1 = ifql0.e;
        if(arr_b1 == null) {
            this.e = new byte[v];
        }
        else {
            if(arr_b1.length != v) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = arr_b1;
        }
        byte[] arr_b2 = ifql0.f;
        if(arr_b2 == null) {
            this.f = new byte[v];
        }
        else {
            if(arr_b2.length != v) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = arr_b2;
        }
        byte[] arr_b3 = ifql0.g;
        if(arr_b3 == null) {
            this.g = new byte[v];
        }
        else {
            if(arr_b3.length != v) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = arr_b3;
        }
        ifpq ifpq0 = ifql0.h;
        if(ifpq0 != null) {
            this.i = ifpq0;
        }
        else if(ifqy.f(ifqk0.d, ifql0.b) && arr_b2 != null && arr_b != null) {
            this.i = new ifpq(ifqk0, ifql0.b, arr_b2, arr_b);
        }
        else {
            this.i = new ifpq(ifql0.c + 1L);
        }
        if(ifql0.c >= 0L && ifql0.c != this.i.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] arr_b1;
        synchronized(this) {
            int v1 = this.c.a();
            int v2 = (this.c.d + 7) / 8;
            int v3 = v2 + v1;
            int v4 = v3 + v1;
            int v5 = v4 + v1;
            byte[] arr_b = new byte[v1 + v5];
            ifqy.d(arr_b, ifqy.j(this.h, v2), 0);
            ifqy.d(arr_b, this.d, v2);
            ifqy.d(arr_b, this.e, v3);
            ifqy.d(arr_b, this.f, v4);
            ifqy.d(arr_b, this.g, v5);
            try {
                arr_b1 = iftq.m(arr_b, ifqy.i(this.i));
            }
            catch(IOException iOException0) {
                throw new IllegalStateException(a.ac(iOException0, "error serializing bds state: "), iOException0);
            }
        }
        return arr_b1;
    }

    @Override  // iftu
    public final byte[] u() {
        synchronized(this) {
        }
        return this.a();
    }
}

