public final class fmfv {
    private gfsx a;
    private gfsx b;
    private gfsx c;
    private gfsx d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private gfsx i;
    private int j;
    private byte k;

    public fmfv() {
        throw null;
    }

    public fmfv(byte[] arr_b) {
        this.a = gfqx.a;
        this.b = gfqx.a;
        this.c = gfqx.a;
        this.d = gfqx.a;
        this.i = gfqx.a;
    }

    public final fmfw a() {
        if(this.k != 0x1F) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.k & 1) == 0) {
                stringBuilder0.append(" timeToLiveSec");
            }
            if((this.k & 2) == 0) {
                stringBuilder0.append(" hideSnippetInConversationList");
            }
            if((this.k & 4) == 0) {
                stringBuilder0.append(" hideDismissButton");
            }
            if((this.k & 8) == 0) {
                stringBuilder0.append(" dismissibleByTappingOutside");
            }
            if((this.k & 16) == 0) {
                stringBuilder0.append(" overlayStyle");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new fmfw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b(fmbi fmbi0) {
        this.a = gfsx.m(fmbi0);
    }

    public final void c(boolean z) {
        this.h = z;
        this.k = (byte)(this.k | 8);
    }

    public final void d(ByteString hfsf0) {
        this.b = gfsx.m(hfsf0);
    }

    public final void e(String s) {
        this.d = gfsx.m(s);
    }

    public final void f(int v) {
        this.i = gfsx.m(Integer.valueOf(v));
    }

    public final void g(boolean z) {
        this.g = z;
        this.k = (byte)(this.k | 4);
    }

    public final void h(boolean z) {
        this.f = z;
        this.k = (byte)(this.k | 2);
    }

    public final void i(fmfh fmfh0) {
        this.c = gfsx.m(fmfh0);
    }

    public final void j(int v) {
        this.j = v;
        this.k = (byte)(this.k | 16);
    }

    public final void k(int v) {
        this.e = v;
        this.k = (byte)(this.k | 1);
    }
}

