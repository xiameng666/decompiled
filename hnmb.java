public final class hnmb {
    public final hnms a;

    public hnmb(hnms hnms0) {
        this.a = hnms0;
    }

    public final byte[] a() {
        return hnne.c(String.format("%04X", ((int)this.a.d)));
    }

    public final byte[] b() {
        byte[] arr_b = this.a.c;
        return arr_b == null ? this.a.b : arr_b;
    }
}

