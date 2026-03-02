public final class szt implements esse {
    private final byte[] a;
    private final szp b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;

    public szt(byte[] arr_b, szp szp0, String s, int v, int v1, String s1) {
        this.a = arr_b;
        this.b = szp0;
        this.c = s;
        this.d = v;
        this.e = v1;
        this.f = s1;
    }

    @Override  // esse
    public final int a() {
        return this.d;
    }

    @Override  // esse
    public final int b() {
        return this.e;
    }

    @Override  // esse
    public final String c() {
        return this.c;
    }

    @Override  // esse
    public final String d() {
        return null;
    }

    @Override  // esse
    public final String e() {
        return this.f;
    }

    @Override  // esse
    public final byte[] f() {
        return this.a;
    }

    @Override  // esse
    public final byte[] g(byte[] arr_b) {
        return this.b.b;
    }
}

