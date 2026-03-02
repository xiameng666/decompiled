final class wx {
    int a;
    int b;
    int c;
    int d;
    int e;

    public wx() {
        this.a = 0;
    }

    final void a(int v) {
        this.a |= v;
    }

    final void b() {
        this.a = 0;
    }

    final void c(int v, int v1, int v2, int v3) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    final boolean d() {
        int v = this.a;
        if((v & 7) != 0 && (wx.e(this.d, this.b) & v) == 0) {
            return false;
        }
        if((v & 0x70) != 0 && (wx.e(this.d, this.c) << 4 & v) == 0) {
            return false;
        }
        return (v & 0x700) == 0 || (wx.e(this.e, this.b) << 8 & v) != 0 ? (v & 0x7000) == 0 || (wx.e(this.e, this.c) << 12 & v) != 0 : false;
    }

    static final int e(int v, int v1) {
        if(v > v1) {
            return 1;
        }
        return v == v1 ? 2 : 4;
    }
}

