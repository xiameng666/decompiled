import java.nio.ByteBuffer;

final class auar {
    public final byte[] a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    private final ByteBuffer[] f;
    private final ByteBuffer[] g;

    public auar(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("invalid capacity 0; must be > 0");
        }
        this.a = new byte[v];
        this.f = new ByteBuffer[1];
        this.g = new ByteBuffer[2];
        this.d = -1;
        this.e = true;
    }

    public final byte a() {
        byte b = this.a[this.b];
        this.d(1);
        return b;
    }

    final int b() {
        if(this.e) {
            return 0;
        }
        return this.b >= this.c ? this.a.length - this.b + this.c : this.c - this.b;
    }

    final int c() {
        if(this.e) {
            return this.a.length;
        }
        return this.c >= this.b ? this.a.length - this.c + this.b : this.b - this.c;
    }

    public final void d(int v) {
        int v1 = this.b + v;
        this.b = v1;
        if(v1 >= this.a.length) {
            v1 -= this.a.length;
            this.b = v1;
        }
        if(v1 == this.c) {
            if(this.d == -1) {
                this.f();
                return;
            }
            this.e = true;
        }
    }

    public final void e(int v) {
        int v1 = this.c + v;
        this.c = v1;
        if(v1 >= this.a.length) {
            this.c = v1 - this.a.length;
        }
        this.e = false;
        this.d = -1;
    }

    final void f() {
        this.c = 0;
        this.b = 0;
        this.d = -1;
        this.e = true;
    }

    public final void g(byte b) {
        this.a[this.c] = b;
        this.e(1);
    }

    final boolean h() {
        return !this.e && this.b == this.c;
    }

    final ByteBuffer[] i() {
        if(this.e) {
            return null;
        }
        if(this.h()) {
            int v = this.b;
            if(v == 0) {
                this.f[0] = ByteBuffer.wrap(this.a, 0, this.a.length);
                return this.f;
            }
            this.g[0] = ByteBuffer.wrap(this.a, v, this.a.length - v);
            this.g[1] = ByteBuffer.wrap(this.a, 0, this.c);
            return this.g;
        }
        int v1 = this.b;
        int v2 = this.c;
        if(v1 < v2) {
            this.f[0] = ByteBuffer.wrap(this.a, v1, v2 - v1);
            return this.f;
        }
        if(v2 == 0) {
            this.f[0] = ByteBuffer.wrap(this.a, v1, this.a.length - v1);
            return this.f;
        }
        this.g[0] = ByteBuffer.wrap(this.a, v1, this.a.length - v1);
        this.g[1] = ByteBuffer.wrap(this.a, 0, this.c);
        return this.g;
    }

    final ByteBuffer[] j() {
        if(!this.h()) {
            if(this.e) {
                int v = this.b;
                if(v == 0) {
                    this.f[0] = ByteBuffer.wrap(this.a, 0, this.a.length);
                    return this.f;
                }
                this.g[0] = ByteBuffer.wrap(this.a, v, this.a.length - v);
                this.g[1] = ByteBuffer.wrap(this.a, 0, this.c);
                return this.g;
            }
            int v1 = this.c;
            int v2 = this.b;
            if(v1 < v2) {
                this.f[0] = ByteBuffer.wrap(this.a, v1, v2 - v1);
                return this.f;
            }
            if(v2 == 0) {
                this.f[0] = ByteBuffer.wrap(this.a, v1, this.a.length - v1);
                return this.f;
            }
            this.g[0] = ByteBuffer.wrap(this.a, v1, this.a.length - v1);
            this.g[1] = ByteBuffer.wrap(this.a, 0, this.b);
            return this.g;
        }
        return null;
    }
}

