public abstract class igve {
    public final byte[] a;

    public igve() {
        byte[] arr_b = new byte[5];
        this.a = arr_b;
        this.a(arr_b);
    }

    public igve(byte[] arr_b, int v) {
        byte[] arr_b1 = new byte[5];
        this.a = arr_b1;
        System.arraycopy(arr_b, v, arr_b1, 0, 5);
        this.a(arr_b1);
    }

    public abstract void a(byte[] arg1);
}

