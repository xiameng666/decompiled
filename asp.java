import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;

final class asp implements blw {
    static final asp a;

    static {
        asp.a = new asp();
    }

    @Override  // blw
    public final void a(Size size0, bnc bnc0, blt blt0) {
        bmb bmb0 = bnc0.w();
        bjt bjt0 = blf.b;
        int v = bmb.e().b();
        if(bmb0 != null) {
            v = bmb0.b();
            blt0.c(bmb0.c);
            blt0.e(bmb0.d);
            blt0.d(bmb0.f());
            bjt0 = bmb0.d();
        }
        blt0.o(bjt0);
        if((bnc0 instanceof bli) && ((PreviewPixelHDRnetQuirk)axv.a(PreviewPixelHDRnetQuirk.class)) != null) {
            Rational rational0 = new Rational(size0.getWidth(), size0.getHeight());
            if(!ayh.a.equals(rational0)) {
                ans ans0 = new ans();
                ans0.d(CaptureRequest.TONEMAP_MODE, Integer.valueOf(2));
                blt0.h(ans0.a());
            }
        }
        ant ant0 = new ant(bnc0);
        blt0.q(ant0.a(v));
        asv asv0 = new asv();
        bjt bjt1 = ant0.g;
        blt0.g(((CameraDevice.StateCallback)bjt1.m(ant.c, asv0)));
        ast ast0 = new ast();
        blt0.k(((CameraCaptureSession.StateCallback)bjt1.m(ant.d, ast0)));
        blt0.f(new ata(ant0.b(new aql())));
        int v1 = bnc0.c();
        if(v1 != 0) {
            blt0.b.l(v1);
        }
        blt0.p(bnc0.b());
        blb blb0 = blb.a();
        String s = ant0.e();
        blb0.c(ant.f, s);
        blb0.c(ant.b, ((Long)bjt1.m(ant.b, Long.valueOf(-1L))));
        blt0.h(blb0);
        blt0.h(ant0.c());
    }
}

