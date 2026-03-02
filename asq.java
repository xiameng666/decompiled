import android.content.Context;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

public final class asq implements bng {
    final ats a;

    public asq(Context context0) {
        this.a = ats.d(context0);
    }

    @Override  // bng
    public final bjt a(bne bne0, int v) {
        int v1 = 3;
        blb blb0 = blb.a();
        blt blt0 = new blt();
        blt0.q(avv.a(bne0, v));
        bmb bmb0 = blt0.a();
        blb0.c(bnc.o, bmb0);
        blb0.c(bnc.q, asp.a);
        bjm bjm0 = new bjm();
        switch(bne0.ordinal()) {
            case 0: {
                v1 = v == 2 ? 5 : 2;
                break;
            }
            case 3: {
                if(axv.a(PreviewUnderExposureQuirk.class) != null) {
                    v1 = 1;
                }
                break;
            }
            default: {
                v1 = 1;
            }
        }
        bjm0.b = v1;
        bjo bjo0 = bjm0.b();
        blb0.c(bnc.p, bjo0);
        bjr bjr0 = bnc.r;
        aqm aqm0 = bne0 == bne.a ? auj.b : aqm.a;
        blb0.c(bjr0, aqm0);
        if(bne0 == bne.b) {
            Size size0 = this.a.b();
            blb0.c(bko.M, size0);
        }
        int v2 = this.a.c(true).getRotation();
        blb0.c(bko.H, Integer.valueOf(v2));
        if(bne0 == bne.d || bne0 == bne.e) {
            blb0.c(bnc.w, Boolean.valueOf(true));
        }
        return blf.f(blb0);
    }
}

