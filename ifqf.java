final class ifqf {
    public final byte[][] a;

    protected ifqf(ifqe ifqe0, byte[][] arr2_b) {
        if(ifqy.e(arr2_b)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if(arr2_b.length != ifqe0.b) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        int v = 0;
        while(v < arr2_b.length) {
            if(arr2_b[v].length != ifqe0.a) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
            ++v;
            continue;
        }
        this.a = ifqy.k(arr2_b);
    }
}

