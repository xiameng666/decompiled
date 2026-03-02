final class jgh {
    public int a;
    public char[] b;
    public int c;
    public int d;

    public jgh(char[] arr_c, int v, int v1) {
        this.a = arr_c.length;
        this.b = arr_c;
        this.c = v;
        this.d = v1;
    }

    public final int a() {
        return this.d - this.c;
    }

    public final int b() {
        return this.a - this.a();
    }

    @Override
    public final String toString() {
        return "";
    }
}

