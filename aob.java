import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice.CameraDeviceSetup;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Size;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public final class aob implements bes {
    public final Context a;
    public final String b;
    public final awt c;
    public final ibnn d;
    private static final aoa f;
    private final ibnn g;
    private final ibnn h;
    private final ibnn i;
    private final ibnn j;

    static {
        aob.f = new aoa();
    }

    public aob(Context context0, String s, awt awt0) {
        ibuq.f(context0, "context");
        ibuq.f(s, "cameraId");
        super();
        this.a = context0;
        this.b = s;
        this.c = awt0;
        this.g = new ibnz(new anu(this));
        this.h = new ibnz(new anv(this));
        this.d = new ibnz(new anw(this));
        this.i = new ibnz(new anx(this));
        this.j = new ibnz(new any(this));
    }

    @Override  // bes
    public final boolean a(bmb bmb0) {
        long v;
        anz anz0;
        OutputConfiguration outputConfiguration0;
        SessionConfiguration sessionConfiguration0;
        List list0 = bmb0.a;
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        Iterator iterator0 = list0.iterator();
        while(true) {
            sessionConfiguration0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            bly bly0 = (bly)object0;
            if(((Boolean)this.j.a()).booleanValue()) {
                ibuq.c(bly0);
                bka bka0 = bly0.a;
                Class class0 = bka0.n;
                Objects.toString(bka0.n);
                bcs.h("FeatureCombinationQueryImpl");
                if(class0 == null) {
                    outputConfiguration0 = new OutputConfiguration(bka0.m, bka0.l);
                }
                else {
                    Size size0 = bka0.l;
                    if(size0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    outputConfiguration0 = new OutputConfiguration(size0, class0);
                }
                anz0 = new anz(outputConfiguration0, null);
            }
            else {
                ibuq.c(bly0);
                bka bka1 = bly0.a;
                Class class1 = bka1.n;
                if(ibuq.m(class1, MediaCodec.class)) {
                    v = 0x10000L;
                }
                else if(ibuq.m(class1, SurfaceHolder.class)) {
                    v = 0x800L;
                }
                else {
                    v = ibuq.m(class1, SurfaceTexture.class) ? 0x100L : 0L;
                }
                Objects.toString(bka1.n);
                bcs.h("FeatureCombinationQueryImpl");
                ImageReader imageReader0 = ImageReader.newInstance(bka1.l.getWidth(), bka1.l.getHeight(), bka1.m, 1, v);
                ibuq.e(imageReader0, "newInstance(...)");
                anz0 = new anz(new OutputConfiguration(imageReader0.getSurface()), imageReader0);
            }
            if(bly0.a.n != null) {
                OutputConfiguration outputConfiguration1 = anz0.a;
                DynamicRangeProfiles dynamicRangeProfiles0 = aas..ExternalSyntheticApiModelOutline0.m(this.i.a());
                if(dynamicRangeProfiles0 != null) {
                    Long long0 = axa.b(bly0.e, dynamicRangeProfiles0);
                    if(long0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    outputConfiguration1.setDynamicRangeProfile(long0.longValue());
                }
            }
            arrayList0.add(anz0);
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(((anz)object1).a);
        }
        SessionConfiguration sessionConfiguration1 = new SessionConfiguration(0, arrayList1, bol.a(), aob.f);
        CameraDevice.CameraDeviceSetup cameraDevice$CameraDeviceSetup0 = aho..ExternalSyntheticApiModelOutline0.m(this.h.a());
        if(cameraDevice$CameraDeviceSetup0 != null) {
            CaptureRequest.Builder captureRequest$Builder0 = cameraDevice$CameraDeviceSetup0.createCaptureRequest(bmb0.b());
            captureRequest$Builder0.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, bmb0.c());
            if(bmb0.g.b() == 2) {
                captureRequest$Builder0.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(2));
            }
            sessionConfiguration1.setSessionParameters(captureRequest$Builder0.build());
            sessionConfiguration0 = sessionConfiguration1;
        }
        if(sessionConfiguration0 == null) {
            return false;
        }
        int v1 = ((but)this.g.a()).a(sessionConfiguration0).a;
        Objects.toString(bmb0.c());
        bmb0.g.b();
        int v2 = 0;
        for(Object object2: list0) {
            if(v2 < 0) {
                ibpo.m();
            }
            Objects.toString(((bly)object2).a.l);
            Objects.toString(((bly)object2).e);
            Objects.toString(((bly)object2).a.n);
            ++v2;
        }
        bcs.h("FeatureCombinationQueryImpl");
        for(Object object3: arrayList0) {
            AutoCloseable autoCloseable0 = (AutoCloseable)object3;
            if((autoCloseable0 instanceof AutoCloseable)) {
                autoCloseable0.close();
            }
            else {
                if(!(autoCloseable0 instanceof ExecutorService)) {
                    if((autoCloseable0 instanceof TypedArray)) {
                        ((TypedArray)autoCloseable0).recycle();
                    }
                    else if((autoCloseable0 instanceof MediaMetadataRetriever)) {
                        ((MediaMetadataRetriever)autoCloseable0).release();
                    }
                    else if((autoCloseable0 instanceof MediaDrm)) {
                        ((MediaDrm)autoCloseable0).release();
                    }
                    else if((autoCloseable0 instanceof DrmManagerClient)) {
                        ((DrmManagerClient)autoCloseable0).release();
                    }
                    else {
                        if(!(autoCloseable0 instanceof ContentProviderClient)) {
                            throw new IllegalArgumentException();
                        }
                        ((ContentProviderClient)autoCloseable0).release();
                    }
                    continue;
                }
                ExecutorService executorService0 = (ExecutorService)autoCloseable0;
                if(executorService0 != ForkJoinPool.commonPool() && !executorService0.isTerminated()) {
                    executorService0.shutdown();
                    boolean z1 = false;
                    for(boolean z = false; !z; z = executorService0.awaitTermination(1L, TimeUnit.DAYS)) {
                        try {
                        }
                        catch(InterruptedException unused_ex) {
                            if(!z1) {
                                executorService0.shutdownNow();
                            }
                            z1 = true;
                        }
                    }
                    if(z1) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        return v1 == 1;
    }
}

