import android.graphics.Rect;
import android.hardware.Camera.Area;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.android.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gatx extends gats {
    Camera k;
    public final AtomicBoolean l;
    public static final int m;
    private static final gged_interceptors n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;

    static {
        gatx.n = gged_interceptors.l(new Camera.Area(new Rect(-100, -100, 100, 100), 1000));
    }

    public gatx(Activity activity0, gaug gaug0, ibnf ibnf0) {
        super(activity0, gaug0, ibnf0);
        this.l = new AtomicBoolean();
    }

    @Override  // gcjy
    public final int a() {
        return this.r;
    }

    @Override  // gcjy
    public final boolean c() {
        return this.q;
    }

    @Override  // gats
    public final int d() {
        return this.o ? this.r : -this.r;
    }

    @Override  // gats
    public final ibnf g(float f, float[] arr_f) {
        gavs.g(this.k, "BE_CMV1I_10", ((gaym)this.i.get()));
        Camera.Size camera$Size0 = this.k.getParameters().getPreviewSize();
        return this.r % 180 == 0 ? new gatt(gatx.e(camera$Size0.width, camera$Size0.height, f, arr_f)) : new gatt(gatx.e(camera$Size0.height, camera$Size0.width, f, arr_f));
    }

    @Override  // gats
    protected final void m() {
        Camera camera0 = this.k;
        if(camera0 != null) {
            camera0.stopPreview();
            this.k.release();
            this.k = null;
            this.j = false;
        }
    }

    @Override  // gcjy
    public final gcjz nd() {
        gavs.g(this.k, "BE_CMV1I_11", ((gaym)this.i.get()));
        Camera.Size camera$Size0 = this.k.getParameters().getPreviewSize();
        return new gcjz(camera$Size0.width, camera$Size0.height, true);
    }

    @Override  // gcjx
    public final void ne() {
        if(this.l.compareAndSet(false, true)) {
            Camera camera0 = this.k;
            ibnf ibnf0 = this.i;
            gavs.g(camera0, "BE_CMV1I_13", ((gaym)ibnf0.get()));
            Handler handler0 = this.g;
            gavs.g(handler0, "BE_CMV1I_12", ((gaym)ibnf0.get()));
            handler0.post(new gatv(this, camera0));
        }
    }

    @Override  // gats
    public final void o(hcur hcur0) {
        String s;
        Camera camera0 = this.k;
        gavs.g(camera0, "BE_CMV1I_08", ((gaym)this.i.get()));
        Camera.Parameters camera$Parameters0 = camera0.getParameters();
        switch(hcur0.ordinal()) {
            case 2: {
                s = "auto";
                break;
            }
            case 3: {
                s = "on";
                break;
            }
            default: {
                s = "off";
            }
        }
        camera$Parameters0.setFlashMode(s);
        camera0.setParameters(camera$Parameters0);
    }

    @Override  // gats
    public final void p(gbml gbml0, gatr gatr0) {
        Camera camera0 = this.k;
        gavs.g(camera0, "BE_CMV1I_06", ((gaym)this.i.get()));
        Camera.Size camera$Size0 = camera0.getParameters().getPreviewSize();
        if(this.r % 180 == 0) {
            gbml0.k(camera$Size0.width, camera$Size0.height);
        }
        else {
            gbml0.k(camera$Size0.height, camera$Size0.width);
        }
        if(this.d == null) {
            gbmm gbmm0 = new gbmm(this.a, camera0);
            gbmm0.getHolder().addCallback(gbmm0);
            this.d = gbmm0;
            gbml0.l(this.d);
        }
        gbml0.i();
        if(gatr0 != null) {
            camera0.setPreviewCallbackWithBuffer(new gauk(camera0, this.r, gatr0));
        }
        camera0.startPreview();
        this.j = true;
    }

    @Override  // gats
    protected final void q() {
        gavs.g(this.k, "BE_CMV1I_07", ((gaym)this.i.get()));
        this.k.stopPreview();
    }

    @Override  // gats
    public final boolean s() {
        return this.k != null && this.p;
    }

    @Override  // gats
    public final void u(gbsf gbsf0, boolean z) {
        gavs.g(this.k, "BE_CMV1I_09", ((gaym)this.i.get()));
        if(!z) {
            this.k.setPreviewCallbackWithBuffer(null);
        }
        try {
            this.k.takePicture(null, null, new gatw(z, gbsf0));
        }
        catch(RuntimeException runtimeException0) {
            Log.e("CameraManagerV1Impl", "takePicture failed", runtimeException0);
        }
    }

    @Override  // gats
    protected final void v(int v) {
        int v4;
        synchronized(this) {
            int v2 = Camera.getNumberOfCameras();
            boolean z = false;
            gavs.c(v2 > 0, "BE_CMV1I_01", ((gaym)this.i.get()), "No cameras found");
            Camera.CameraInfo camera$CameraInfo0 = new Camera.CameraInfo();
            for(int v3 = 0; v3 < v2; ++v3) {
                Camera.getCameraInfo(v3, camera$CameraInfo0);
                if(camera$CameraInfo0.facing == (v == 3 ? 1 : 0)) {
                    try {
                        this.k = Camera.open(v3);
                    }
                    catch(RuntimeException unused_ex) {
                        gavs.g(this.b, "BE_CMV1I_02", ((gaym)this.i.get()));
                        this.i(this.b, false);
                        this.b = null;
                        return;
                    }
                    break;
                }
            }
            if(this.k == null) {
                try {
                    this.k = Camera.open(0);
                }
                catch(RuntimeException unused_ex) {
                    gavs.g(this.b, "BE_CMV1I_03", ((gaym)this.i.get()));
                    this.i(this.b, false);
                    this.b = null;
                    return;
                }
                Camera.getCameraInfo(0, camera$CameraInfo0);
            }
            this.o = camera$CameraInfo0.facing == 1;
            switch(this.a.getWindowManager().getDefaultDisplay().getRotation()) {
                case 1: {
                    v4 = 90;
                    break;
                }
                case 2: {
                    v4 = 180;
                    break;
                }
                case 3: {
                    v4 = 270;
                    break;
                }
                default: {
                    v4 = 0;
                }
            }
            this.r = camera$CameraInfo0.facing == 1 ? (360 - (camera$CameraInfo0.orientation + v4) % 360) % 360 : (camera$CameraInfo0.orientation - v4 + 360) % 360;
            ibnf ibnf0 = this.i;
            gavs.g(this.k, "BE_CMV1I_04", ((gaym)ibnf0.get()));
            this.k.setDisplayOrientation(this.r);
            Camera camera0 = this.k;
            gavs.g(camera0, "BE_CMV1I_14", ((gaym)ibnf0.get()));
            gatq gatq0 = this.b;
            gavs.g(gatq0, "BE_CMV1I_15", ((gaym)ibnf0.get()));
            Camera.Parameters camera$Parameters0 = camera0.getParameters();
            Pair pair0 = gatq0.b(gatx.w(camera$Parameters0.getSupportedPreviewSizes()), gatx.w(camera$Parameters0.getSupportedPictureSizes()));
            camera$Parameters0.setPreviewSize(((gcjz)pair0.first).a, ((gcjz)pair0.first).b);
            camera$Parameters0.setPictureSize(((gcjz)pair0.second).a, ((gcjz)pair0.second).b);
            this.q = false;
            if(gatq0.nB() && camera$Parameters0.getSupportedFocusModes().contains("auto")) {
                camera$Parameters0.setFocusAreas(gatx.n);
                camera$Parameters0.setFocusMode("auto");
            }
            else if(camera$Parameters0.getSupportedFocusModes().contains("continuous-picture")) {
                camera$Parameters0.setFocusMode("continuous-picture");
                this.q = true;
            }
            camera0.setParameters(camera$Parameters0);
            List list0 = camera$Parameters0.getSupportedFlashModes();
            if(list0 != null && list0.contains("on")) {
                z = true;
            }
            this.p = z;
            gavs.g(this.b, "BE_CMV1I_05", ((gaym)ibnf0.get()));
            this.i(this.b, true);
        }
    }

    private static List w(List list0) {
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            list1.add(new gcjz(((Camera.Size)object0).width, ((Camera.Size)object0).height, true));
        }
        return list1;
    }
}

