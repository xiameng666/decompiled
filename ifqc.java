final class ifqc {
    public final ifqe a;
    public final ifpx b;
    public byte[] c;
    private byte[] d;

    public ifqc(ifqe ifqe0) {
        this.a = ifqe0;
        this.b = new ifpx(ifqe0.c, ifqe0.a);
        this.d = new byte[ifqe0.a];
        this.c = new byte[ifqe0.a];
    }

    final ifqf a(ifqb ifqb0) {
        ifqe ifqe0 = this.a;
        int v = ifqe0.b;
        byte[][] arr2_b = new byte[v][];
        int v1 = 0;
        while(v1 < v) {
            ifqa ifqa0 = new ifqa();
            ifqa0.e = ifqb0.d;
            ifqa0.f = ifqb0.e;
            ifqa0.a = ifqb0.a;
            ifqa0.b = v1;
            ifqa0.c = ifqb0.c;
            ifqa0.g = ifqb0.f;
            ifqb0 = new ifqb(ifqa0);
            if(v1 >= v) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byte[] arr_b = this.d;
            byte[] arr_b1 = ifqy.j(v1, 0x20);
            arr2_b[v1] = this.d(this.b.a(arr_b, arr_b1), 15, ifqb0);
            ++v1;
            continue;
        }
        return new ifqf(ifqe0, arr2_b);
    }

    final void b(byte[] arr_b, byte[] arr_b1) {
        int v = this.a.a;
        if(arr_b.length != v) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if(arr_b1.length != v) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.d = arr_b;
        this.c = arr_b1;
    }

    protected final byte[] c(byte[] arr_b, ifqb ifqb0) {
        ifqa ifqa0 = new ifqa();
        ifqa0.e = ifqb0.d;
        ifqa0.f = ifqb0.e;
        ifqa0.a = ifqb0.a;
        byte[] arr_b1 = new ifqb(ifqa0).a();
        return this.b.a(arr_b, arr_b1);
    }

    private final byte[] d(byte[] arr_b, int v, ifqb ifqb0) {
        int v1 = this.a.a;
        if(arr_b.length != v1) {
            throw new IllegalArgumentException(a.f(v1, "startHash needs to be ", "bytes"));
        }
        ifqb0.a();
        if(v > 15) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if(v == 0) {
            return arr_b;
        }
        byte[] arr_b1 = this.d(arr_b, v - 1, ifqb0);
        ifqa ifqa0 = new ifqa();
        ifqa0.e = ifqb0.d;
        ifqa0.f = ifqb0.e;
        ifqa0.a = ifqb0.a;
        ifqa0.b = ifqb0.b;
        ifqa0.c = v - 1;
        ifqa0.g = 0;
        ifqb ifqb1 = new ifqb(ifqa0);
        ifpx ifpx0 = this.b;
        byte[] arr_b2 = ifpx0.a(this.c, ifqb1.a());
        ifqa ifqa1 = new ifqa();
        ifqa1.e = ifqb1.d;
        ifqa1.f = ifqb1.e;
        ifqa1.a = ifqb1.a;
        ifqa1.b = ifqb1.b;
        ifqa1.c = ifqb1.c;
        ifqa1.g = 1;
        ifqb ifqb2 = new ifqb(ifqa1);
        byte[] arr_b3 = ifpx0.a(this.c, ifqb2.a());
        byte[] arr_b4 = new byte[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b4[v2] = (byte)(arr_b1[v2] ^ arr_b3[v2]);
        }
        int v3 = ifpx0.a;
        if(arr_b2.length != v3) {
            throw new IllegalArgumentException("wrong key length");
        }
        if(v1 == v3) {
            return ifpx0.b(0, arr_b2, arr_b4);
        }
        throw new IllegalArgumentException("wrong in length");
    }
}

