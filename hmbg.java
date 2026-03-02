public class hmbg {
    private hmgz a;

    protected hmbg() {
    }

    public hmbg(char c) {
        this.a = new hmgz(c);
    }

    public void a(hmdj hmdj0) {
    }

    public final byte[] b() {
        return this.a.a;
    }

    protected final void c(hmgz hmgz0) {
        this.a = hmgz0;
        int v = hmgz0.a.length;
        hmgz0.l(v + 2);
        byte[] arr_b = hmgz0.a;
        arr_b[v] = (byte)0x90;
        arr_b[v + 1] = 0;
    }

    protected final void d(hmdk hmdk0) {
        this.c(hmdk0.d());
    }
}

