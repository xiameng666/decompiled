import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

final class auy implements atl {
    public static final List a;
    public final bmc b;
    final Executor c;
    public final atk d;
    public List e;
    public bmb f;
    public aso g;
    public bmb h;
    public volatile List i;
    public int j;
    public int k;
    private static int l;
    private final ScheduledExecutorService m;
    private azi n;
    private azi o;

    static {
        auy.a = new ArrayList();
        auy.l = 0;
    }

    public auy(bmc bmc0, axc axc0, Executor executor0, ScheduledExecutorService scheduledExecutorService0, aze aze0) {
        this.e = new ArrayList();
        this.i = null;
        this.n = new azh().b();
        this.o = new azh().b();
        boolean z = false;
        this.j = 0;
        blj blj0 = axv.a(CaptureSessionShouldUseMrirQuirk.class);
        blp blp0 = new blp(Collections.EMPTY_LIST);
        if(blj0 != null) {
            z = true;
        }
        this.d = new atk(axc0, blp0, z, aze0);
        this.b = bmc0;
        this.c = executor0;
        this.m = scheduledExecutorService0;
        this.k = 1;
        int v = auy.l;
        auy.l = v + 1;
        this.j = v;
        bcs.h("ProcessingCaptureSession");
    }

    @Override  // atl
    public final bmb a() {
        return this.f;
    }

    public static boolean b(bka bka0) {
        return Objects.equals(bka0.n, bdf.class);
    }

    @Override  // atl
    public final List c() {
        return this.i == null ? Collections.EMPTY_LIST : this.i;
    }

    @Override  // atl
    public final void d() {
        bcs.h("ProcessingCaptureSession");
        if(this.i != null) {
            for(Object object0: this.i) {
                bjo bjo0 = (bjo)object0;
                for(Object object1: bjo0.h) {
                    ((bhl)object1).a(bjo0.a());
                }
            }
            this.i = null;
        }
    }

    @Override  // atl
    public final void e() {
        java.util.Objects.toString(aux.a(this.k));
        bcs.h("ProcessingCaptureSession");
        if(this.k == 3) {
            bcs.h("ProcessingCaptureSession");
            this.b.b();
            aso aso0 = this.g;
            if(aso0 != null) {
                synchronized(aso0.a) {
                    aso0.b = true;
                    aso0.c = null;
                }
            }
            this.k = 4;
        }
        this.d.e();
    }

    public static boolean f(bka bka0) {
        return Objects.equals(bka0.n, bud.class);
    }

    @Override  // atl
    public final void g(List list0) {
        if(!list0.isEmpty()) {
            java.util.Objects.toString(aux.a(this.k));
            bcs.h("ProcessingCaptureSession");
            int v = this.k - 1;
            if(this.k == 0) {
                throw null;
            }
            switch(v) {
                case 0: 
                case 1: {
                    goto label_11;
                }
                case 2: {
                    goto label_17;
                }
            }
            if(v == 3 || v == 4) {
                java.util.Objects.toString(aux.a(this.k));
                bcs.h("ProcessingCaptureSession");
                auy.h(list0);
                return;
            label_11:
                if(this.i != null) {
                    auy.h(list0);
                    bcs.h("ProcessingCaptureSession");
                    return;
                }
                this.i = list0;
                return;
            label_17:
                Iterator iterator0 = list0.iterator();
            label_18:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    bjo bjo0 = (bjo)object0;
                    if(bjo0.f != 2 && bjo0.f != 4) {
                        bcs.h("ProcessingCaptureSession");
                        for(Object object1: blq.f(azh.a(bjo0.e).b())) {
                            CaptureRequest.Key captureRequest$Key0 = CaptureRequest.CONTROL_AF_TRIGGER;
                            CaptureRequest.Key captureRequest$Key1 = (CaptureRequest.Key)((bjr)object1).b;
                            if(captureRequest$Key1.equals(captureRequest$Key0) || captureRequest$Key1.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                                bjo0.a();
                                this.b.j();
                                continue label_18;
                            }
                        }
                        auy.h(Arrays.asList(new bjo[]{bjo0}));
                    }
                    else {
                        bjt bjt0 = bjo0.e;
                        azh azh0 = azh.a(bjt0);
                        bjr bjr0 = bjo.a;
                        if(bjt0.s(bjr0)) {
                            azh0.c(CaptureRequest.JPEG_ORIENTATION, ((Integer)bjt0.l(bjr0)));
                        }
                        bjr bjr1 = bjo.b;
                        if(bjt0.s(bjr1)) {
                            azh0.c(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer)bjt0.l(bjr1)).byteValue()));
                        }
                        azi azi0 = azh0.b();
                        this.o = azi0;
                        this.l(this.n, azi0);
                        bjo0.a();
                        this.b.h();
                    }
                }
            }
        }
    }

    private static void h(List list0) {
        for(Object object0: list0) {
            bjo bjo0 = (bjo)object0;
            for(Object object1: bjo0.h) {
                ((bhl)object1).a(bjo0.a());
            }
        }
    }

    @Override  // atl
    public final void i(bmb bmb0) {
        bcs.h("ProcessingCaptureSession");
        this.f = bmb0;
        if(bmb0 != null) {
            aso aso0 = this.g;
            if(aso0 != null) {
                synchronized(aso0.a) {
                    aso0.c = bmb0;
                }
            }
            if(this.k == 3) {
                azh azh0 = azh.a(bmb0.d());
                bjo bjo0 = bmb0.g;
                Integer integer0 = asg.b(bjo0);
                if(integer0 != null) {
                    azh0.c(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, integer0);
                }
                azi azi0 = azh0.b();
                this.n = azi0;
                this.l(azi0, this.o);
                for(Object object0: bjo0.e()) {
                    if(auy.b(((bka)object0)) || auy.f(((bka)object0))) {
                        this.b.i();
                        return;
                    }
                }
                this.b.c();
            }
        }
    }

    @Override  // atl
    public final void j(Map map0) {
    }

    @Override  // atl
    public final boolean k() {
        return this.d.k();
    }

    private final void l(azi azi0, azi azi1) {
        ans ans0 = new ans();
        ans0.b(azi0);
        ans0.b(azi1);
        ans0.a();
        this.b.g();
    }

    @Override  // atl
    public final gmcd m(bmb bmb0, CameraDevice cameraDevice0, avp avp0) {
        int v = this.k;
        int v1 = this.k;
        java.util.Objects.toString(aux.a(v1));
        kay.b(v == 1, "Invalid state state:" + aux.a(v1));
        kay.b(((boolean)(bmb0.g().isEmpty() ^ 1)), "SessionConfig contains no surfaces");
        bcs.h("ProcessingCaptureSession");
        List list0 = bmb0.g();
        this.e = list0;
        return bpt.f(bpt.g(bpf.a(bke.c(list0, this.c, this.m)), new aus(this, bmb0, cameraDevice0, avp0), this.c), new aut(this), this.c);
    }

    @Override  // atl
    public final gmcd p() {
        java.util.Objects.toString(aux.a(this.k));
        bcs.h("ProcessingCaptureSession");
        gmcd gmcd0 = this.d.p();
        int v = this.k - 1;
        if(this.k == 0) {
            throw null;
        }
        if(v == 1 || v == 3) {
            gmcd0.hB(new aur(this), bol.a());
        }
        this.k = 5;
        return gmcd0;
    }
}

