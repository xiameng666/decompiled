import android.view.View;

public final class bgng implements keg {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final boolean e;

    public bgng(boolean z, boolean z1, boolean z2, float f, boolean z3) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = f;
        this.e = z3;
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        ibuq.f(view0, "v");
        boolean z = true;
        jxn jxn0 = kgq0.f((hsas.a.b().e() ? 0x28F : 647));
        int v = 0;
        if(view0.getLayoutDirection() != 1) {
            z = false;
        }
        bgnb bgnb0 = new bgnb((z ? jxn0.d : jxn0.b), jxn0.c, (z ? jxn0.b : jxn0.d), jxn0.e);
        int v1 = bgnh.c(0.0f);
        int v2 = this.a ? 0 : bgnb0.a;
        int v3 = bgnh.c(0.0f);
        int v4 = this.b ? 0 : bgnb0.b;
        int v5 = bgnh.c(0.0f);
        int v6 = this.c ? 0 : bgnb0.c;
        int v7 = bgnh.c(this.d);
        if(!this.e) {
            v = bgnb0.d;
        }
        view0.setPaddingRelative(v1 + v2, v3 + v4, v5 + v6, v7 + v);
        return kgq0;
    }
}

