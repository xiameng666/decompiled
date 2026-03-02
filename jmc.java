import java.util.List;

public final class jmc extends kfx {
    final jmw a;

    public jmc(jmw jmw0) {
        this.a = jmw0;
        super(1);
    }

    @Override  // kfx
    public final kfw b(kga kga0, kfw kfw0) {
        ihy ihy0 = this.a.w.r();
        if(ihy0.t()) {
            long v = jlg.b(hzl.a(ihy0));
            int v1 = jlf.a(v);
            int v2 = 0;
            if(v1 < 0) {
                v1 = 0;
            }
            int v3 = jlf.b(v) >= 0 ? jlf.b(v) : 0;
            long v4 = hzl.g(ihy0).g();
            long v5 = jlg.b(ihy0.j(0xFFFFFFFFL & ((long)Float.floatToRawIntBits(((int)(ihy0.c & 0xFFFFFFFFL)))) | ((long)Float.floatToRawIntBits(((int)(ihy0.c >> 0x20)))) << 0x20));
            int v6 = ((int)(v4 >> 0x20)) - jlf.a(v5) >= 0 ? ((int)(v4 >> 0x20)) - jlf.a(v5) : 0;
            int v7 = ((int)(v4 & 0xFFFFFFFFL)) - jlf.b(v5);
            if(v7 >= 0) {
                v2 = v7;
            }
            return v1 == 0 && v3 == 0 && v6 == 0 && v2 == 0 ? kfw0 : new kfw(jmw.m(kfw0.a, v1, v3, v6, v2), jmw.m(kfw0.b, v1, v3, v6, v2));
        }
        return kfw0;
    }

    @Override  // kfx
    public final kgq c(kgq kgq0, List list0) {
        return this.a.k(kgq0);
    }
}

