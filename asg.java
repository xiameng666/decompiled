import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;

final class asg {
    public static CaptureRequest a(bjo bjo0, CameraDevice cameraDevice0, Map map0, boolean z, ayr ayr0) {
        CaptureRequest.Builder captureRequest$Builder0;
        if(cameraDevice0 != null) {
            List list0 = bjo0.e();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                Surface surface0 = (Surface)map0.get(((bka)object0));
                if(surface0 == null) {
                    throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
                }
                arrayList0.add(surface0);
                continue;
            }
            if(!arrayList0.isEmpty()) {
                bhv bhv0 = bjo0.k;
                int v = bjo0.f;
                int v1 = 5;
                if(v != 5) {
                label_21:
                    int v2 = 1;
                    bcs.h("Camera2CaptureRequestBuilder");
                    if(v == 5) {
                        if(!z) {
                            v2 = 2;
                        }
                        captureRequest$Builder0 = cameraDevice0.createCaptureRequest(v2);
                    }
                    else {
                        captureRequest$Builder0 = cameraDevice0.createCaptureRequest(v);
                    }
                    v1 = v;
                }
                else if(bhv0 != null && (bhv0.b() instanceof TotalCaptureResult)) {
                    bcs.h("Camera2CaptureRequestBuilder");
                    captureRequest$Builder0 = cameraDevice0.createReprocessCaptureRequest(((TotalCaptureResult)bhv0.b()));
                }
                else {
                    v = 5;
                    goto label_21;
                }
                asg.e(captureRequest$Builder0, v1, ayr0);
                asg.c(bjo0, captureRequest$Builder0);
                Integer integer0 = asg.b(bjo0);
                if(integer0 != null) {
                    captureRequest$Builder0.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, integer0);
                }
                Objects.toString(integer0);
                bcs.h("Camera2CaptureRequestBuilder");
                bjt bjt0 = bjo0.e;
                bjr bjr0 = bjo.a;
                if(bjt0.s(bjr0)) {
                    captureRequest$Builder0.set(CaptureRequest.JPEG_ORIENTATION, ((Integer)bjt0.l(bjr0)));
                }
                bjr bjr1 = bjo.b;
                if(bjt0.s(bjr1)) {
                    captureRequest$Builder0.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer)bjt0.l(bjr1)).byteValue()));
                }
                asg.d(captureRequest$Builder0, bjt0);
                for(Object object1: arrayList0) {
                    captureRequest$Builder0.addTarget(((Surface)object1));
                }
                captureRequest$Builder0.setTag(bjo0.j);
                return captureRequest$Builder0.build();
            }
        }
        return null;
    }

    static Integer b(bjo bjo0) {
        if(bjo0.b() != 1 && bjo0.c() != 1) {
            if(bjo0.b() == 2) {
                return (int)2;
            }
            return bjo0.c() == 2 ? ((int)1) : null;
        }
        return (int)0;
    }

    public static void c(bjo bjo0, CaptureRequest.Builder captureRequest$Builder0) {
        Range range0 = bjo0.d();
        if(!range0.equals(bmi.a)) {
            captureRequest$Builder0.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range0);
        }
        Objects.toString(range0);
        bcs.h("Camera2CaptureRequestBuilder");
    }

    public static void d(CaptureRequest.Builder captureRequest$Builder0, bjt bjt0) {
        azi azi0 = azh.a(bjt0).b();
        for(Object object0: blq.f(azi0)) {
            bjr bjr0 = (bjr)object0;
            Object object1 = bjr0.b;
            try {
                captureRequest$Builder0.set(((CaptureRequest.Key)object1), blq.b(azi0, bjr0));
            }
            catch(IllegalArgumentException unused_ex) {
                Objects.toString(object1);
                bcs.a("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + object1);
            }
        }
    }

    public static void e(CaptureRequest.Builder captureRequest$Builder0, int v, ayr ayr0) {
        Map map0;
        switch(v) {
            case 3: {
                if(ayr0.a) {
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(1));
                    map0 = DesugarCollections.unmodifiableMap(hashMap0);
                }
                else {
                    map0 = Collections.EMPTY_MAP;
                }
                break;
            }
            case 4: {
                if(ayr0.b) {
                    HashMap hashMap1 = new HashMap();
                    hashMap1.put(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(2));
                    map0 = DesugarCollections.unmodifiableMap(hashMap1);
                }
                else {
                    map0 = Collections.EMPTY_MAP;
                }
                break;
            }
            default: {
                map0 = Collections.EMPTY_MAP;
            }
        }
        for(Object object0: map0.entrySet()) {
            captureRequest$Builder0.set(((CaptureRequest.Key)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
    }
}

