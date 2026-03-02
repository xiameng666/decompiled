import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.vision.docscan.crop.aidls.DocumentCropperOptionsParcel;

public final class hbur extends hawl {
    public static final int d;
    private static final Feature[] e;
    private final hawd f;
    private final hbqy g;
    private boolean h;
    private hbuc i;

    static {
        hbur.e = new Feature[]{hawq.r};
    }

    public hbur(hawd hawd0, hbuo hbuo0, hbqy hbqy0) {
        batl.t(hawd0, "MlKitContext can not be null");
        batl.t(hbuo0, "DocumentCropperOptions can not be null");
        this.f = hawd0;
        this.g = hbqy0;
    }

    private final void a(hbkn hbkn0, long v) {
        hbuq hbuq0 = new hbuq(hbkn0, v);
        this.g.c(hbuq0, hbko.du);
    }

    @Override  // hawl
    public final void c() {
        wbx wbx0;
        hbuc hbuc0;
        Context context0 = this.f.a();
        long v = SystemClock.elapsedRealtime();
        Feature[] arr_feature = hbur.e;
        if(!hawq.d(context0, arr_feature)) {
            if(!this.h) {
                hawq.c(context0, arr_feature);
                this.h = true;
            }
            this.a(hbkn.B, v);
            throw new havd("Waiting for the optional module to be downloaded. Please wait.", 14);
        }
        try {
            IBinder iBinder0 = bjia.f(context0, bjia.a, "com.google.android.gms.mlkit_docscan_crop").e("com.google.android.gms.mlkit.docscan.crop.DocumentCropperCreator");
            hbuc0 = null;
            if(iBinder0 == null) {
                wbx0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.mlkit.vision.docscan.crop.aidls.IDocumentCropperCreator");
                wbx0 = (iInterface0 instanceof hbud) ? ((hbud)iInterface0) : new hbud(iBinder0);
            }
            ObjectWrapper objectWrapper0 = new ObjectWrapper(context0);
            DocumentCropperOptionsParcel documentCropperOptionsParcel0 = new DocumentCropperOptionsParcel();
            Parcel parcel0 = wbx0.jo();
            wbz.h(parcel0, objectWrapper0);
            wbz.f(parcel0, documentCropperOptionsParcel0);
            Parcel parcel1 = wbx0.hM(1, parcel0);
            IBinder iBinder1 = parcel1.readStrongBinder();
            if(iBinder1 != null) {
                IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.mlkit.vision.docscan.crop.aidls.IDocumentCropper");
                hbuc0 = (iInterface1 instanceof hbuc) ? ((hbuc)iInterface1) : new hbuc(iBinder1);
            }
            parcel1.recycle();
            this.i = hbuc0;
        }
        catch(Exception exception0) {
            this.a(hbkn.H, v);
            throw new havd("Failed to load module", exception0);
        }
        try {
            hbuc0.jp(1, hbuc0.jo());
        }
        catch(Exception exception1) {
            this.a(hbkn.C, v);
            throw new havd("Failed to init module", exception1);
        }
        this.a(hbkn.a, v);
    }

    @Override  // hawl
    public final void d() {
        synchronized(this) {
            throw null;
        }
    }
}

