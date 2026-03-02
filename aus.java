import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class aus implements bpa {
    public final auy a;
    public final bmb b;
    public final CameraDevice c;
    public final avp d;

    public aus(auy auy0, bmb bmb0, CameraDevice cameraDevice0, avp avp0) {
        this.a = auy0;
        this.b = bmb0;
        this.c = cameraDevice0;
        this.d = avp0;
    }

    @Override  // bpa
    public final gmcd a(Object object0) {
        blg blg3;
        bcs.h("ProcessingCaptureSession");
        auy auy0 = this.a;
        if(auy0.k == 5) {
            return new bpu(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        bmb bmb0 = this.b;
        bka bka0 = null;
        if(((List)object0).contains(null)) {
            return new bpu(new bjy("Surface closed", ((bka)bmb0.g().get(((List)object0).indexOf(null)))));
        }
        blg blg0 = null;
        blg blg1 = null;
        blg blg2 = null;
        for(int v = 0; v < bmb0.g().size(); ++v) {
            bka bka1 = (bka)bmb0.g().get(v);
            if(auy.b(bka1) || auy.f(bka1)) {
                blg0 = new blg(((Surface)bka1.b().get()), bka1.l, bka1.m);
            }
            else if(Objects.equals(bka1.n, bce.class)) {
                blg1 = new blg(((Surface)bka1.b().get()), bka1.l, bka1.m);
            }
            else if(Objects.equals(bka1.n, bbh.class)) {
                blg2 = new blg(((Surface)bka1.b().get()), bka1.l, bka1.m);
            }
        }
        bly bly0 = bmb0.b;
        if(bly0 == null) {
            blg3 = null;
        }
        else {
            bka0 = bly0.a;
            blg3 = new blg(((Surface)bka0.b().get()), bka0.l, bka0.m);
        }
        try {
            auy0.k = 2;
            ArrayList arrayList0 = new ArrayList(auy0.e);
            if(bka0 != null) {
                arrayList0.add(bka0);
            }
            bke.b(arrayList0);
        }
        catch(bjy bjy0) {
            return new bpu(bjy0);
        }
        bcs.d("ProcessingCaptureSession", "== initSession (id=" + auy0.j + ")");
        try {
            new blh(blg0, blg1, blg2, blg3);
            auy0.h = auy0.b.e();
        }
        catch(Throwable throwable0) {
            bcs.b("ProcessingCaptureSession", "initSession failed", throwable0);
            bke.a(auy0.e);
            if(bka0 != null) {
                bka0.e();
            }
            throw throwable0;
        }
        ((bka)auy0.h.g().get(0)).c().hB(new auu(auy0, bka0), bol.a());
        for(Object object1: auy0.h.g()) {
            auy.a.add(((bka)object1));
            ((bka)object1).c().hB(new auv(((bka)object1)), auy0.c);
        }
        bma bma0 = new bma();
        bma0.s(bmb0);
        bma0.a.clear();
        bma0.b.a.clear();
        bma0.s(auy0.h);
        kay.b(bma0.t(), "Cannot transform the SessionConfig");
        bmb bmb1 = bma0.a();
        gmcd gmcd0 = auy0.d.m(bmb1, this.c, this.d);
        bpt.j(gmcd0, new auw(auy0), auy0.c);
        return gmcd0;
    }
}

