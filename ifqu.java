import java.io.IOException;

public final class ifqu extends ifqi implements iftu {
    public final ifqs c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile ifpp h;

    public ifqu(ifqt ifqt0) {
        super(true, ifqt0.a.e);
        ifqs ifqs0 = ifqt0.a;
        this.c = ifqs0;
        int v = ifqs0.f;
        byte[] arr_b = ifqt0.d;
        if(arr_b == null) {
            this.d = new byte[v];
        }
        else {
            if(arr_b.length != v) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = arr_b;
        }
        byte[] arr_b1 = ifqt0.e;
        if(arr_b1 == null) {
            this.e = new byte[v];
        }
        else {
            if(arr_b1.length != v) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = arr_b1;
        }
        byte[] arr_b2 = ifqt0.f;
        if(arr_b2 == null) {
            this.f = new byte[v];
        }
        else {
            if(arr_b2.length != v) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = arr_b2;
        }
        byte[] arr_b3 = ifqt0.g;
        if(arr_b3 == null) {
            this.g = new byte[v];
        }
        else {
            if(arr_b3.length != v) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = arr_b3;
        }
        ifpp ifpp0 = ifqt0.h;
        if(ifpp0 == null) {
            int v1 = ifqt0.b;
            int v2 = 1 << ifqs0.c;
            this.h = v1 < v2 - 2 && arr_b2 != null && arr_b != null ? new ifpp(ifqs0, arr_b2, arr_b, new ifqb(new ifqa()), v1) : new ifpp(ifqs0, v2 - 1, v1);
        }
        else {
            this.h = ifpp0;
        }
        if(ifqt0.c >= 0 && ifqt0.c != this.h.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] arr_b;
        byte[] arr_b1;
        synchronized(this) {
            int v1 = this.c.f + 4;
            int v2 = v1 + this.c.f;
            int v3 = v2 + this.c.f;
            arr_b = new byte[this.c.f + v3];
            ifua.f(this.h.a, arr_b, 0);
            ifqy.d(arr_b, this.d, 4);
            ifqy.d(arr_b, this.e, v1);
            ifqy.d(arr_b, this.f, v2);
            ifqy.d(arr_b, this.g, v3);
            try {
                arr_b1 = ifqy.i(this.h);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(a.ac(iOException0, "error serializing bds state: "));
            }
        }
        return iftq.m(arr_b, arr_b1);
    }

    @Override  // iftu
    public final byte[] u() {
        synchronized(this) {
        }
        return this.a();
    }
}

