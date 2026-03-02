import android.util.Base64;

final class esrc implements esse {
    private final hmhd a;
    private final hmgr b;

    public esrc(hmgr hmgr0) {
        this.b = hmgr0;
        this.a = new hmhd(hmgr0.a());
    }

    @Override  // esse
    public final int a() {
        return this.a.c;
    }

    @Override  // esse
    public final int b() {
        return this.a.a + 2000;
    }

    @Override  // esse
    public final String c() {
        return new String(this.b.b());
    }

    @Override  // esse
    public final String d() {
        return null;
    }

    @Override  // esse
    public final String e() {
        return hmgz.e(this.b.b).i();
    }

    @Override  // esse
    public final byte[] f() {
        return Base64.decode(this.b.a, 2);
    }

    @Override  // esse
    public final byte[] g(byte[] arr_b) {
        return new byte[0];
    }
}

