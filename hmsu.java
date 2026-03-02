public class hmsu {
    public final byte[] b;

    public hmsu(byte[] arr_b) {
        this.b = arr_b;
    }

    public boolean a(hmsr hmsr0) {
        int v = hmsr0.b();
        return this.b.length > v && (this.b[v] >>> hmsr0.a() - 1 & 1) == 1;
    }

    public final boolean b(hmsr hmsr0) {
        return !this.a(hmsr0);
    }

    public final byte[] c() {
        return hmsi.o(this.b);
    }
}

