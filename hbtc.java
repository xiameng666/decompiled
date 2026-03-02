import android.content.Context;
import android.media.Image.Plane;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeScannerOptionsParcel;
import com.google.mlkit.vision.common.aidls.ImageMetadataParcel;
import java.util.ArrayList;
import java.util.List;

final class hbtc implements hbta {
    private static final gged_interceptors a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final Context e;
    private final hbrq f;
    private final hbqy g;
    private hbsd h;

    static {
        hbtc.a = gged_interceptors.m("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");
    }

    public hbtc(Context context0, hbrq hbrq0, hbqy hbqy0) {
        this.e = context0;
        this.f = hbrq0;
        this.g = hbqy0;
    }

    @Override  // hbta
    public final List a(hbtp hbtp0) {
        int v2;
        if(this.h == null) {
            this.c();
        }
        hbsd hbsd0 = this.h;
        batl.s(hbsd0);
        if(!this.b) {
            try {
                hbsd0.a();
                this.b = true;
            }
            catch(RemoteException remoteException0) {
                throw new havd("Failed to init barcode scanner.", remoteException0);
            }
        }
        int v = hbtp0.d;
        int v1 = hbtp0.g;
        if(v1 == 35) {
            Image.Plane[] arr_image$Plane = hbtp0.b();
            batl.s(arr_image$Plane);
            v = arr_image$Plane[0].getRowStride();
            v2 = 35;
        }
        else {
            v2 = v1;
        }
        int v3 = hbts.a(hbtp0.f);
        long v4 = SystemClock.elapsedRealtime();
        ImageMetadataParcel imageMetadataParcel0 = new ImageMetadataParcel(v2, v, hbtp0.e, v3, v4);
        bjgw bjgw0 = hbtu.a.b(hbtp0);
        try {
            Parcel parcel0 = hbsd0.jo();
            wbz.h(parcel0, bjgw0);
            wbz.f(parcel0, imageMetadataParcel0);
            Parcel parcel1 = hbsd0.hM(3, parcel0);
            ArrayList arrayList0 = parcel1.createTypedArrayList(BarcodeParcel.CREATOR);
            parcel1.recycle();
        }
        catch(RemoteException remoteException1) {
            throw new havd("Failed to run barcode scanner.", remoteException1);
        }
        List list0 = new ArrayList();
        for(Object object0: arrayList0) {
            list0.add(new hbsn(new hbtb(((BarcodeParcel)object0))));
        }
        return list0;
    }

    @Override  // hbta
    public final void b() {
        hbsd hbsd0 = this.h;
        if(hbsd0 != null) {
            try {
                hbsd0.b();
            }
            catch(RemoteException remoteException0) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", remoteException0);
            }
            this.h = null;
            this.b = false;
        }
    }

    @Override  // hbta
    public final boolean c() {
        if(this.h != null) {
            return this.c;
        }
        if(hbtc.d(this.e)) {
            try {
                this.c = true;
                this.h = this.e(bjia.b, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            }
            catch(bjhw bjhw0) {
                throw new havd("Failed to load the bundled barcode module.", bjhw0);
            }
            catch(RemoteException remoteException0) {
                throw new havd("Failed to create thick barcode scanner.", remoteException0);
            }
        }
        else {
            this.c = false;
            Context context0 = this.e;
            gged_interceptors gged0 = hbtc.a;
            if(azqk.a(context0) < 221500000) {
                try {
                    ggqk ggqk0 = gged0.E();
                    while(true) {
                        if(!ggqk0.hasNext()) {
                            goto label_27;
                        }
                        Object object0 = ggqk0.next();
                        bjia.f(context0, bjia.a, ((String)object0));
                    }
                }
                catch(bjhw unused_ex) {
                }
            label_21:
                if(!this.d) {
                    gged_interceptors gged1 = gged_interceptors.m("barcode", "tflite_dynamite");
                    hawq.b(this.e, gged1);
                    this.d = true;
                }
                hbsq.c(this.g, hbkn.B);
                throw new havd("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            else if(!hawq.d(context0, hawq.e(hawq.w, gged0))) {
                goto label_21;
            }
            try {
            label_27:
                this.h = this.e(bjia.a, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            }
            catch(bjhw | RemoteException exception0) {
                hbsq.c(this.g, hbkn.C);
                throw new havd("Failed to create thin barcode scanner.", exception0);
            }
        }
        hbsq.c(this.g, hbkn.a);
        return this.c;
    }

    static boolean d(Context context0) {
        return bjia.a(context0, "com.google.mlkit.dynamite.barcode") > 0;
    }

    final hbsd e(bjhz bjhz0, String s, String s1) {
        Context context0 = this.e;
        IBinder iBinder0 = bjia.f(context0, bjhz0, s).e(s1);
        if(iBinder0 == null) {
            return null.a(new ObjectWrapper(context0), new BarcodeScannerOptionsParcel(this.f.a, false));
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return (iInterface0 instanceof hbse) ? ((hbse)iInterface0).a(new ObjectWrapper(context0), new BarcodeScannerOptionsParcel(this.f.a, false)) : new hbse(iBinder0).a(new ObjectWrapper(context0), new BarcodeScannerOptionsParcel(this.f.a, false));
    }
}

