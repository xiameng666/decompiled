import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.vision.common.aidls.ImageMetadataParcel;
import com.google.mlkit.vision.docscan.detect.aidls.DocumentDetectionParcel;
import com.google.mlkit.vision.docscan.detect.aidls.DocumentDetectionResultParcel;
import com.google.mlkit.vision.docscan.detect.aidls.DocumentDetectorOptionsParcel;
import com.google.mlkit.vision.docscan.detect.aidls.DocumentPresenceParcel;
import java.util.Iterator;
import java.util.List;

public final class hbvg extends havz {
    public final ggdy d;
    public static final int e;
    private static final Feature[] f;
    private final hawd g;
    private final hbuw h;
    private final hbqy i;
    private boolean j;
    private boolean k;
    private hbui l;

    static {
        hbvg.f = new Feature[]{hawq.q};
    }

    public hbvg(hawd hawd0, hbuw hbuw0, hbqy hbqy0) {
        this.k = true;
        batl.t(hawd0, "MlKitContext can not be null");
        batl.t(hbuw0, "DocumentDetectorOptions can not be null");
        this.g = hawd0;
        this.h = hbuw0;
        this.i = hbqy0;
        this.d = new ggdy();
        int[] arr_v = hbuw0.a;
        for(int v = 0; v < arr_v.length; ++v) {
            hbiy hbiy0 = hbiy.b(arr_v[v]);
            this.d.i(hbiy0);
        }
    }

    @Override  // havz
    public final Object a(hbtp hbtp0) {
        return this.e(hbtp0);
    }

    @Override  // hawl
    public final void c() {
        wbx wbx0;
        hbui hbui0;
        Context context0 = this.g.a();
        long v = SystemClock.elapsedRealtime();
        Feature[] arr_feature = hbvg.f;
        if(!hawq.d(context0, arr_feature)) {
            if(!this.j) {
                hawq.c(context0, arr_feature);
                this.j = true;
            }
            this.g(hbkn.B, v);
            throw new havd("Waiting for the optional module to be downloaded. Please wait.", 14);
        }
        try {
            IBinder iBinder0 = bjia.f(context0, bjia.a, "com.google.android.gms.mlkit_docscan_detect").e("com.google.android.gms.mlkit.docscan.detect.DocumentDetectorCreator");
            hbui0 = null;
            if(iBinder0 == null) {
                wbx0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.mlkit.vision.docscan.detect.aidls.IDocumentDetectorCreator");
                wbx0 = (iInterface0 instanceof hbuj) ? ((hbuj)iInterface0) : new hbuj(iBinder0);
            }
            DocumentDetectorOptionsParcel documentDetectorOptionsParcel0 = new DocumentDetectorOptionsParcel(this.h.a);
            ObjectWrapper objectWrapper0 = new ObjectWrapper(context0);
            Parcel parcel0 = wbx0.jo();
            wbz.h(parcel0, objectWrapper0);
            wbz.f(parcel0, documentDetectorOptionsParcel0);
            Parcel parcel1 = wbx0.hM(1, parcel0);
            IBinder iBinder1 = parcel1.readStrongBinder();
            if(iBinder1 != null) {
                IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.mlkit.vision.docscan.detect.aidls.IDocumentDetector");
                hbui0 = (iInterface1 instanceof hbui) ? ((hbui)iInterface1) : new hbui(iBinder1);
            }
            parcel1.recycle();
            this.l = hbui0;
        }
        catch(Exception exception0) {
            this.g(hbkn.H, v);
            throw new havd("Failed to load module", exception0);
        }
        try {
            hbui0.jp(1, hbui0.jo());
        }
        catch(Exception exception1) {
            this.g(hbkn.C, v);
            throw new havd("Failed to init module", exception1);
        }
        this.g(hbkn.a, v);
    }

    @Override  // hawl
    public final void d() {
        synchronized(this) {
            try {
                hbui hbui0 = this.l;
                if(hbui0 != null) {
                    hbui0.jp(2, hbui0.jo());
                    this.l = null;
                }
                this.f(hbkn.a);
                this.k = true;
            }
            catch(RemoteException unused_ex) {
                this.f(hbkn.E);
                Log.e("DocumentDetector", "Failed to release document detector");
            }
        }
    }

    public final hbuu e(hbtp hbtp0) {
        Throwable throwable2;
        hbtp hbtp1;
        hbvg hbvg0;
        hbuu hbuu0;
        Float float4;
        Float float3;
        Integer integer1;
        List list2;
        Iterator iterator0;
        Float float0;
        Integer integer0;
        DocumentDetectionResultParcel documentDetectionResultParcel0;
        long v;
        __monitor_enter(this);
        try {
            batl.t(hbtp0, "Input image can not be null");
            v = SystemClock.elapsedRealtime();
            int v1 = hbts.a(hbtp0.f);
            long v2 = SystemClock.elapsedRealtime();
            ImageMetadataParcel imageMetadataParcel0 = new ImageMetadataParcel(hbtp0.g, hbtp0.d, hbtp0.e, v1, v2);
            bjgw bjgw0 = hbtu.a.b(hbtp0);
            try {
                hbui hbui0 = this.l;
                batl.s(hbui0);
                Parcel parcel0 = hbui0.jo();
                wbz.h(parcel0, bjgw0);
                wbz.f(parcel0, imageMetadataParcel0);
                Parcel parcel1 = hbui0.hM(3, parcel0);
                documentDetectionResultParcel0 = (DocumentDetectionResultParcel)wbz.a(parcel1, DocumentDetectionResultParcel.CREATOR);
                parcel1.recycle();
                integer0 = null;
                float0 = null;
                iterator0 = documentDetectionResultParcel0.a.iterator();
            label_18:
                while(iterator0.hasNext()) {
                    goto label_50;
                }
            }
            catch(RemoteException remoteException0) {
                goto label_56;
            }
        }
        catch(Throwable throwable0) {
            hbvg0 = this;
            goto label_66;
        }
        List list0 = documentDetectionResultParcel0.b;
        if(list0.isEmpty()) {
            list2 = null;
            float4 = null;
            integer1 = null;
            float3 = null;
        }
        else {
            try {
                DocumentDetectionParcel documentDetectionParcel0 = (DocumentDetectionParcel)list0.get(0);
                List list1 = documentDetectionParcel0.a;
                Float float1 = documentDetectionParcel0.b;
                Float float2 = documentDetectionParcel0.d;
                if(float2 != null) {
                    integer0 = documentDetectionParcel0.c == null ? ((int)0) : new Integer[]{((int)1), ((int)2), ((int)3), ((int)4)}[((int)documentDetectionParcel0.c) / 90];
                }
                list2 = list1;
                integer1 = integer0;
                float3 = float2;
                float4 = float1;
            }
            catch(RemoteException remoteException0) {
                goto label_56;
            }
            catch(Throwable throwable1) {
                goto label_61;
            }
        }
        try {
            hbuu0 = new hbuu(float0, list2, float4, integer1, float3);
            hbvg0 = this;
            hbtp1 = hbtp0;
            goto label_43;
        }
        catch(RemoteException remoteException0) {
            goto label_56;
        }
        catch(Throwable throwable0) {
        }
        try {
            hbvg0 = this;
            goto label_66;
            try {
            label_43:
                hbvg0.h(hbkn.a, v, this.k, hbtp1, hbuu0);
                hbvg0.k = false;
                goto label_48;
            }
            catch(RemoteException remoteException0) {
            }
        }
        catch(Throwable throwable0) {
            goto label_66;
        }
        goto label_58;
    label_48:
        __monitor_exit(hbvg0);
        return hbuu0;
        try {
        label_50:
            Object object0 = iterator0.next();
            DocumentPresenceParcel documentPresenceParcel0 = (DocumentPresenceParcel)object0;
            if(documentPresenceParcel0.a != 1) {
                goto label_18;
            }
            float0 = (float)documentPresenceParcel0.b;
            goto label_18;
        }
        catch(RemoteException remoteException0) {
        }
        catch(Throwable throwable1) {
            goto label_61;
        }
    label_56:
        hbvg0 = this;
        hbtp1 = hbtp0;
        try {
        label_58:
            hbvg0.h(hbkn.D, v, hbvg0.k, hbtp1, null);
            throw new havd("Failed to run document detector.", remoteException0);
        label_61:
            throwable2 = throwable1;
            hbvg0 = this;
            while(true) {
                __monitor_exit(hbvg0);
                break;
            label_66:
                throwable2 = throwable0;
            }
        }
        catch(Throwable throwable0) {
            goto label_66;
        }
        throw throwable2;
    }

    private final void f(hbkn hbkn0) {
        hbvf hbvf0 = new hbvf(hbkn0);
        this.i.c(hbvf0, hbko.ds);
    }

    private final void g(hbkn hbkn0, long v) {
        hbve hbve0 = new hbve(this, hbkn0, v);
        this.i.c(hbve0, hbko.dq);
    }

    private final void h(hbkn hbkn0, long v, boolean z, hbtp hbtp0, hbuu hbuu0) {
        long v1 = SystemClock.elapsedRealtime() - v;
        hbvc hbvc0 = new hbvc(this, v1, hbkn0, z, hbtp0, hbuu0);
        hbqy hbqy0 = this.i;
        hbqy0.c(hbvc0, hbko.dr);
        haxl haxl0 = new haxl();
        haxl0.a = hbkn0;
        haxl0.b = Boolean.valueOf(z);
        hbix hbix0 = new hbix();
        hbix0.a = this.d.h();
        haxl0.c = new hbiz(hbix0);
        if(hbuu0 != null) {
            Float float0 = hbuu0.a;
            if(float0 != null) {
                haxl0.d = float0;
            }
            Float float1 = hbuu0.c;
            if(float1 != null) {
                haxl0.e = float1;
            }
            Float float2 = hbuu0.e;
            if(float2 != null) {
                haxl0.g = float2;
            }
            Integer integer0 = hbuu0.d;
            if(integer0 != null && ((int)integer0) != 0) {
                haxl0.f = hbux.a(integer0.intValue());
            }
        }
        hbvd hbvd0 = new hbvd();
        hbqy0.d(new haxm(haxl0), v1, hbko.br, hbvd0);
    }
}

