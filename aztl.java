public final class aztl {
    public boolean a;
    public bbdq b;
    public azud c;
    public int d;
    public int e;
    public hfkb f;
    public boolean g;
    public boolean h;
    public byte i;

    public final void a(int v) {
        this.d = v;
        this.i = (byte)(this.i | 4);
    }

    public final void b(int v) {
        this.e = v;
        this.i = (byte)(this.i | 8);
    }

    public final void c(boolean z) {
        this.g = z;
        this.i = (byte)(this.i | 16);
    }

    public final void d(boolean z) {
        this.h = z;
        this.i = (byte)(this.i | 0x20);
    }

    public final void e(bbdq bbdq0) {
        if(bbdq0 == null) {
            throw new NullPointerException("Null processingProductId");
        }
        this.b = bbdq0;
    }

    public final void f(hfkb hfkb0) {
        if(hfkb0 == null) {
            throw new NullPointerException("Null processingPurpose");
        }
        this.f = hfkb0;
    }
}

