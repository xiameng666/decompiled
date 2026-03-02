import java.io.IOException;

public final class ggzx extends ggzy {
    public ggzx(ggxl ggxl0, ggxt ggxt0) {
        super(ggxl0, ggxt0);
    }

    public ggzx(ggzv ggzv0, ggzv ggzv1) {
        super(ggzv0, ggzv1);
    }

    @Override  // ggzy
    public final ggxl a() {
        return this.a;
    }

    @Override  // ggzy
    public final ggxt b() {
        return this.b;
    }

    static ggzx c(ggxe ggxe0) {
        int v = ggxe0.a();
        if(v != 1) {
            throw new IOException("Unsupported S2LatLngRect encoding version " + v);
        }
        ggxl ggxl0 = new ggxl(ggxe0.b(), ggxe0.b());
        ggxt ggxt0 = new ggxt(ggxe0.b(), ggxe0.b());
        if(ggzx.s(ggxl0, ggxt0)) {
            return new ggzx(ggxl0, ggxt0);
        }
        throw new IOException("Decoded lat and lng intervals do not form a valid S2LatLngRect.");
    }

    public static ggzx d() {
        return new ggzx(new ggxl(1.0, 0.0), ggxt.c());
    }

    public final ggzx e(ggzv ggzv0) {
        double f = ggzv0.e().c;
        ggxl ggxl0 = this.a.b(f);
        ggxl ggxl1 = new ggxl(-1.570796, 1.570796);
        ggxl ggxl2 = new ggxl(Math.max(ggxl0.a, ggxl1.a), Math.min(ggxl0.b, ggxl1.b));
        double f1 = ggzv0.g().c;
        ggxt ggxt0 = new ggxt(this.b);
        if((f1 >= 0.0)) {
            if(!ggxt0.m()) {
                if(!(ggxt0.a() + (f1 + f1) + 4.440892E-16 >= 6.283185)) {
                    goto label_15;
                }
                ggxt0.i();
                return new ggzx(ggxl2, ggxt0);
            }
        }
        else if(!ggxt0.n()) {
            if((ggxt0.a() + (f1 + f1) - 4.440892E-16 <= 0.0)) {
                ggxt0.h();
                return new ggzx(ggxl2, ggxt0);
            }
        label_15:
            ggxt0.g(ggxf.b(ggxt0.a - f1), ggxf.b(ggxt0.b + f1), false);
            if((ggxt0.a <= -3.141593)) {
                ggxt0.a = 3.141593;
            }
        }
        return new ggzx(ggxl2, ggxt0);
    }

    public static ggzx g() {
        return new ggzx(new ggxl(-1.570796, 1.570796), ggxt.e());
    }

    public final ggzx i() {
        ggxl ggxl0 = this.a;
        if(ggxl0.a != -1.570796) {
            return ggxl0.b == 1.570796 ? new ggzx(ggxl0, ggxt.e()) : this;
        }
        return new ggzx(ggxl0, ggxt.e());
    }
}

