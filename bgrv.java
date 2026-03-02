import java.io.PrintWriter;

public final class bgrv implements bgrt {
    private static final bboh a;
    private final ccmg b;
    private final fxmv c;

    static {
        bgrv.a = bgrz.a("Log");
    }

    public bgrv(ccmg ccmg0) {
        this.c = new fxmv(0xFA, new bgru());
        this.b = ccmg0;
    }

    @Override  // bgrt
    public final void a(PrintWriter printWriter0) {
        this.c.c(printWriter0);
    }

    @Override  // bgrt
    public final void b(hguc hguc0, hgug hgug0, int v) {
        bbdg bbdg0;
        if(hguc0 != null && hgug0 != null) {
            if((hguc0.c == null ? hgtu.a : hguc0.c).c.startsWith("test-")) {
                return;
            }
            bgrz.b(hguc0);
            ccmg ccmg0 = this.b;
            switch(v) {
                case 1: {
                    bbdg0 = bbdg.vv;
                    break;
                }
                case 2: {
                    bbdg0 = bbdg.vw;
                    break;
                }
                case 3: {
                    bbdg0 = bbdg.vx;
                    break;
                }
                case 4: {
                    bbdg0 = bbdg.vy;
                    break;
                }
                default: {
                    bbdg0 = bbdg.vz;
                }
            }
            ccmg0.a(bbdg0);
            hgtu hgtu0 = hguc0.c == null ? hgtu.a : hguc0.c;
            long v1 = hgug0.g;
            hgto hgto0 = hgto.b(hguc0.e) == null ? hgto.i : hgto.b(hguc0.e);
            String s = hgug0.i;
            String s1 = hgug0.j;
            hgue hgue0 = hguc0.m == null ? hgue.a : hguc0.m;
            cczb cczb0 = cedu.v().b(((gful_cronetEngineProvider)new bgrr(hgtu0, v1, hgto0, s, s1, hgue0, v)));
            cczb0.c = (int)0x30;
            cczb0.a();
            Object[] arr_object = {bgrz.b(hguc0), v};
            this.c.f(2, "%s:%d", arr_object);
            return;
        }
        ((ggtj)bgrv.a.j()).x("incomplete i logging data");
    }

    @Override  // bgrt
    public final void c(hguc hguc0, hgug hgug0, int v) {
        if(hguc0 != null && hgug0 != null) {
            if((hguc0.c == null ? hgtu.a : hguc0.c).c.startsWith("test-")) {
                return;
            }
            bgrz.b(hguc0);
            hgtu hgtu0 = hguc0.c == null ? hgtu.a : hguc0.c;
            long v1 = hgug0.g;
            hgto hgto0 = hgto.b(hguc0.e) == null ? hgto.i : hgto.b(hguc0.e);
            String s = hgug0.i;
            String s1 = hgug0.j;
            hgue hgue0 = hguc0.m == null ? hgue.a : hguc0.m;
            cczb cczb0 = cedu.v().b(((gful_cronetEngineProvider)new bgrq(hgtu0, v1, hgto0, s, s1, hgue0, v)));
            cczb0.c = (int)0x30;
            cczb0.a();
            Object[] arr_object = {bgrz.b(hguc0), v};
            this.c.f(1, "%s:%d", arr_object);
            return;
        }
        ((ggtj)bgrv.a.j()).x("incomplete r logging data");
    }

    @Override  // bgrt
    public final void d(boolean z) {
        this.b.a((z ? bbdg.vt : bbdg.vu));
        bgry.a(4, (z ? 2 : 3), 1);
    }

    @Override  // bgrt
    public final void e(boolean z) {
        bgry.a(3, (z ? 2 : 3), 1);
    }

    @Override  // bgrt
    public final void f() {
        bgry.a(7, 1, 1);
    }

    @Override  // bgrt
    public final void g() {
        bgry.a(2, 1, 1);
        this.b.a(bbdg.vs);
    }

    @Override  // bgrt
    public final void h() {
        bgry.a(8, 1, 1);
    }

    @Override  // bgrt
    public final void i() {
    }

    @Override  // bgrt
    public final void j(int v) {
        bgry.a(5, 1, v);
    }

    @Override  // bgrt
    public final void k(int v) {
        bgry.a(6, 1, v);
    }

    @Override  // fxpo
    public final void l(int v, int v1, int v2, int v3, int v4, long v5, int v6, String s) {
        fxng.a(v, v1, v2, v3, v4, v5, v6, s);
    }
}

