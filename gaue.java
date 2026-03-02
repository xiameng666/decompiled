import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.chimera.android.Activity;
import java.util.ArrayList;
import java.util.List;

public final class gaue extends gats {
    CameraDevice k;
    CameraCaptureSession l;
    CaptureRequest.Builder m;
    public int n;
    public int o;
    public final gcon p;
    private CameraManager q;
    private CameraCharacteristics r;
    private ImageReader s;
    private hcur t;
    private gcjz u;
    private boolean v;
    private final boolean w;

    public gaue(Activity activity0, gaug gaug0, ibnf ibnf0) {
        super(activity0, gaug0, ibnf0);
        gaxl.a();
        this.w = hziq.a.c().l();
        gaxl.a();
        this.p = new gcon();
    }

    @Override  // gcjy
    public final int a() {
        return this.o;
    }

    @Override  // gcjy
    public final boolean c() {
        return this.n == 4;
    }

    @Override  // gats
    public final int d() {
        return this.v ? this.o : -this.o;
    }

    @Override  // gats
    public final ibnf g(float f, float[] arr_f) {
        gcjz gcjz0 = this.u;
        return this.o % 180 == 0 ? new gaty(gaue.e(gcjz0.a, gcjz0.b, f, arr_f)) : new gaty(gaue.e(gcjz0.b, gcjz0.a, f, arr_f));
    }

    @Override  // gats
    protected final void m() {
        this.q();
        CameraDevice cameraDevice0 = this.k;
        if(cameraDevice0 != null) {
            cameraDevice0.close();
        }
    }

    @Override  // gcjy
    public final gcjz nd() {
        return this.u;
    }

    @Override  // gcjx
    public final void ne() {
    }

    @Override  // gats
    public final void o(hcur hcur0) {
        synchronized(this) {
            if(this.s()) {
                ibnf ibnf0 = this.i;
                gavs.g(this.b, "BE_CMV2I_04", ((gaym)ibnf0.get()));
                this.t = hcur0;
                if(this.j) {
                    CaptureRequest.Builder captureRequest$Builder0 = this.m;
                    gavs.g(captureRequest$Builder0, "BE_CMV2I_05", ((gaym)ibnf0.get()));
                    this.y(captureRequest$Builder0);
                    this.w(captureRequest$Builder0.build());
                }
            }
        }
    }

    @Override  // gats
    public final void p(gbml gbml0, gatr gatr0) {
        ImageReader imageReader0;
        if(gatr0 == null) {
            imageReader0 = null;
        }
        else {
            int v = this.u.a;
            int v1 = this.u.b;
            gaxl.a();
            imageReader0 = ImageReader.newInstance(v, v1, 35, ((int)hvun.b()));
            gatz gatz0 = new gatz(this, gatr0);
            Handler handler0 = this.g;
            gavs.g(handler0, "BE_CMV2I_03", ((gaym)this.i.get()));
            imageReader0.setOnImageAvailableListener(gatz0, handler0);
        }
        gbml0.i();
        if(this.o % 180 == 0) {
            gbml0.k(this.u.a, this.u.b);
        }
        else {
            gbml0.k(this.u.b, this.u.a);
        }
        if(this.d == null) {
            this.d = new SurfaceView(this.a);
            gbml0.l(this.d);
        }
        SurfaceHolder surfaceHolder0 = this.d.getHolder();
        surfaceHolder0.setFixedSize(this.u.a, this.u.b);
        if(surfaceHolder0.getSurface() != null && surfaceHolder0.getSurface().isValid()) {
            this.x(surfaceHolder0, imageReader0);
            return;
        }
        surfaceHolder0.addCallback(new gauc(this, surfaceHolder0, imageReader0));
    }

    @Override  // gats
    protected final void q() {
        CameraCaptureSession cameraCaptureSession0 = this.l;
        if(cameraCaptureSession0 != null) {
            cameraCaptureSession0.close();
            this.l = null;
            this.m = null;
            this.j = false;
        }
    }

    @Override  // gats
    public final boolean s() {
        Boolean boolean0 = this.r == null ? null : ((Boolean)this.r.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
        gaxl.a();
        return hziq.a.c().o() && boolean0 != null && boolean0.booleanValue();
    }

    @Override  // gats
    public final void u(gbsf gbsf0, boolean z) {
        ImageReader imageReader0 = this.s;
        ibnf ibnf0 = this.i;
        gavs.g(imageReader0, "BE_CMV2I_06", ((gaym)ibnf0.get()));
        gaua gaua0 = new gaua(gbsf0);
        Handler handler0 = this.g;
        gavs.g(handler0, "BE_CMV2I_07", ((gaym)ibnf0.get()));
        imageReader0.setOnImageAvailableListener(gaua0, handler0);
        try {
            CameraCaptureSession cameraCaptureSession0 = this.l;
            if(cameraCaptureSession0 == null) {
                gatq gatq0 = this.b;
                if(gatq0 != null) {
                    gatq0.ng();
                }
                return;
            }
            gavs.g(cameraCaptureSession0, "BE_CMV2I_08", ((gaym)ibnf0.get()));
            CameraDevice cameraDevice0 = this.k;
            gavs.g(cameraDevice0, "BE_CMV2I_09", ((gaym)ibnf0.get()));
            CaptureRequest.Builder captureRequest$Builder0 = cameraDevice0.createCaptureRequest(2);
            ImageReader imageReader1 = this.s;
            gavs.g(imageReader1, "BE_CMV2I_10", ((gaym)ibnf0.get()));
            captureRequest$Builder0.addTarget(imageReader1.getSurface());
            if(z) {
                SurfaceView surfaceView0 = this.d;
                if(surfaceView0 != null) {
                    captureRequest$Builder0.addTarget(surfaceView0.getHolder().getSurface());
                }
            }
            else {
                boolean z1 = this.w;
                if(!z1) {
                    captureRequest$Builder0.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                    if(this.n == 4) {
                        captureRequest$Builder0.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
                    }
                }
                cameraCaptureSession0.stopRepeating();
                if(!z1) {
                    cameraCaptureSession0.abortCaptures();
                }
            }
            cameraCaptureSession0.capture(captureRequest$Builder0.build(), null, this.g);
        }
        catch(CameraAccessException cameraAccessException0) {
            Log.e("CameraManagerV2Impl", "Error taking picture", cameraAccessException0);
        }
    }

    @Override  // gats
    protected final void v(int v) {
        int v4;
        CameraCharacteristics cameraCharacteristics0;
        String[] arr_s;
        synchronized(this) {
            gatq gatq0 = this.b;
            ibnf ibnf0 = this.i;
            gavs.g(gatq0, "BE_CMV2I_01", ((gaym)ibnf0.get()));
            CameraManager cameraManager0 = this.q;
            int v2 = 0;
            if(cameraManager0 == null) {
                cameraManager0 = (CameraManager)this.a.getSystemService("camera");
                this.q = cameraManager0;
                if(cameraManager0 == null) {
                    Log.e("CameraManagerV2Impl", "Couldn\'t access camera manager");
                    this.i(gatq0, false);
                    return;
                }
            }
            gavs.g(cameraManager0, "BE_CMV2I_02", ((gaym)ibnf0.get()));
            try {
                arr_s = cameraManager0.getCameraIdList();
            }
            catch(CameraAccessException unused_ex) {
                Log.e("CameraManagerV2Impl", "Couldn\'t access camera list");
                this.i(gatq0, false);
                return;
            }
            String s = null;
            int v3 = 0;
            while(v3 < arr_s.length) {
                String s1 = arr_s[v3];
                try {
                    cameraCharacteristics0 = cameraManager0.getCameraCharacteristics(s1);
                }
                catch(CameraAccessException unused_ex) {
                    ++v3;
                    continue;
                }
                int[] arr_v = (int[])cameraCharacteristics0.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if(arr_v != null && glwy.k(arr_v, 0)) {
                    Integer integer0 = (Integer)cameraCharacteristics0.get(CameraCharacteristics.LENS_FACING);
                    if(integer0 != null && ((int)integer0) == (v == 3 ? 0 : 1)) {
                        this.r = cameraCharacteristics0;
                        s = s1;
                    }
                    else {
                        if(s == null) {
                            this.r = cameraCharacteristics0;
                            s = s1;
                        }
                        ++v3;
                        continue;
                    }
                    break;
                }
                ++v3;
            }
            if(s == null) {
                Log.e("CameraManagerV2Impl", "Couldn\'t find usable camera");
                this.i(gatq0, false);
                return;
            }
            try {
                cameraManager0.openCamera(s, new gaub(this, gatq0), this.g);
            }
            catch(CameraAccessException unused_ex) {
                Log.e("CameraManagerV2Impl", "Couldn\'t open camera");
                this.i(gatq0, false);
                return;
            }
            CameraCharacteristics cameraCharacteristics1 = this.r;
            ibnf ibnf1 = this.i;
            gavs.g(cameraCharacteristics1, "BE_CMV2I_11", ((gaym)ibnf1.get()));
            Integer integer1 = (Integer)cameraCharacteristics1.get(CameraCharacteristics.LENS_FACING);
            gavs.g(integer1, "BE_CMV2I_12", ((gaym)ibnf1.get()));
            boolean z = ((int)integer1) == 0;
            this.v = z;
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
            Integer integer2 = (Integer)cameraCharacteristics1.get(CameraCharacteristics.SENSOR_ORIENTATION);
            gavs.g(integer2, "BE_CMV2I_20", ((gaym)ibnf1.get()));
            int v5 = (int)integer2;
            this.o = z ? (360 - (v5 + v4) % 360) % 360 : (v5 - v4 + 360) % 360;
            StreamConfigurationMap streamConfigurationMap0 = (StreamConfigurationMap)cameraCharacteristics1.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            gavs.g(streamConfigurationMap0, "BE_CMV2I_13", ((gaym)ibnf1.get()));
            gatq gatq1 = this.b;
            gavs.g(gatq1, "BE_CMV2I_14", ((gaym)ibnf1.get()));
            Pair pair0 = gatq1.b(gaue.z(streamConfigurationMap0.getOutputSizes(35), ((int)hziq.a.c().h())), gaue.z(streamConfigurationMap0.getOutputSizes(0x100), 0x7FFFFFFF));
            this.u = (gcjz)pair0.first;
            this.s = ImageReader.newInstance(((gcjz)pair0.second).a, ((gcjz)pair0.second).b, 0x100, 1);
            int[] arr_v1 = (int[])cameraCharacteristics1.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            gavs.g(arr_v1, "BE_CMV2I_15", ((gaym)ibnf1.get()));
            if(glwy.k(arr_v1, 4)) {
                v2 = 4;
            }
            this.n = v2;
        }
    }

    public final void w(CaptureRequest captureRequest0) {
        try {
            gavs.g(this.l, "BE_CMV2I_19", ((gaym)this.i.get()));
            gftb.check(this.l);
            this.l.setRepeatingRequest(captureRequest0, null, this.g);
        }
        catch(CameraAccessException unused_ex) {
            Log.e("CameraManagerV2Impl", "Couldn\'t commit CaptureRequest parameters.");
            gatq gatq0 = this.b;
            if(gatq0 != null) {
                gatq0.ng();
            }
        }
    }

    public final void x(SurfaceHolder surfaceHolder0, ImageReader imageReader0) {
        ArrayList arrayList0 = new ArrayList(3);
        arrayList0.add(surfaceHolder0.getSurface());
        if(imageReader0 != null) {
            arrayList0.add(imageReader0.getSurface());
        }
        ImageReader imageReader1 = this.s;
        ibnf ibnf0 = this.i;
        gavs.g(imageReader1, "BE_CMV2I_16", ((gaym)ibnf0.get()));
        arrayList0.add(imageReader1.getSurface());
        try {
            CameraDevice cameraDevice0 = this.k;
            gavs.g(cameraDevice0, "BE_CMV2I_17", ((gaym)ibnf0.get()));
            cameraDevice0.createCaptureSession(arrayList0, new gaud(this, surfaceHolder0, imageReader0), this.g);
        }
        catch(CameraAccessException unused_ex) {
            Log.e("CameraManagerV2Impl", "Couldn\'t start camera preview");
            gatq gatq0 = this.b;
            gavs.g(gatq0, "BE_CMV2I_18", ((gaym)this.i.get()));
            gatq0.ng();
        }
    }

    public final void y(CaptureRequest.Builder captureRequest$Builder0) {
        if(this.s()) {
            captureRequest$Builder0.set(CaptureRequest.FLASH_MODE, Integer.valueOf((this.t == hcur.d ? 2 : 0)));
        }
    }

    private static List z(Size[] arr_size, int v) {
        List list0 = new ArrayList(arr_size.length);
        for(int v1 = 0; v1 < arr_size.length; ++v1) {
            Size size0 = arr_size[v1];
            if(size0.getWidth() <= v) {
                list0.add(new gcjz(size0.getWidth(), size0.getHeight(), true));
            }
        }
        return list0;
    }
}

