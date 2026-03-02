import android.content.Context;
import android.media.Image.Plane;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

final class hbte implements hbta {
    private fauk a;
    private boolean b;
    private final Context c;
    private final BarcodeDetectorOptions d;
    private final hbqy e;

    public hbte(Context context0, hbrq hbrq0, hbqy hbqy0) {
        BarcodeDetectorOptions barcodeDetectorOptions0 = new BarcodeDetectorOptions();
        this.d = barcodeDetectorOptions0;
        this.c = context0;
        barcodeDetectorOptions0.a = hbrq0.a;
        this.e = hbqy0;
    }

    @Override  // hbta
    public final List a(hbtp hbtp0) {
        Barcode[] arr_barcode;
        if(this.a == null) {
            this.c();
        }
        fauk fauk0 = this.a;
        if(fauk0 != null) {
            FrameMetadataParcel frameMetadataParcel0 = new FrameMetadataParcel(hbtp0.d, hbtp0.e, 0, 0L, hbts.a(hbtp0.f));
            try {
                int v = hbtp0.g;
                switch(v) {
                    case -1: {
                        arr_barcode = fauk0.c(new ObjectWrapper(hbtp0.a), frameMetadataParcel0);
                        break;
                    }
                    case 17: {
                        arr_barcode = fauk0.b(new ObjectWrapper(hbtp0.b), frameMetadataParcel0);
                        break;
                    }
                    case 35: {
                        Image.Plane[] arr_image$Plane = hbtp0.b();
                        batl.s(arr_image$Plane);
                        frameMetadataParcel0.a = arr_image$Plane[0].getRowStride();
                        arr_barcode = fauk0.b(new ObjectWrapper(arr_image$Plane[0].getBuffer()), frameMetadataParcel0);
                        break;
                    }
                    case 842094169: {
                        ByteBuffer byteBuffer0 = hbtp0.b;
                        batl.s(byteBuffer0);
                        arr_barcode = fauk0.b(new ObjectWrapper(hbtt.b(byteBuffer0, false)), frameMetadataParcel0);
                        break;
                    }
                    default: {
                        throw new havd("Unsupported image format: " + v, 3);
                    }
                }
                List list0 = new ArrayList();
                for(int v1 = 0; v1 < arr_barcode.length; ++v1) {
                    list0.add(new hbsn(new hbtd(arr_barcode[v1])));
                }
                return list0;
            }
            catch(RemoteException remoteException0) {
                throw new havd("Failed to detect with legacy barcode detector", remoteException0);
            }
        }
        throw new havd("Error initializing the legacy barcode scanner.", 14);
    }

    @Override  // hbta
    public final void b() {
        fauk fauk0 = this.a;
        if(fauk0 != null) {
            try {
                fauk0.a();
            }
            catch(RemoteException remoteException0) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", remoteException0);
            }
            this.a = null;
        }
    }

    @Override  // hbta
    public final boolean c() {
        if(this.a == null) {
            try {
                Context context0 = this.c;
                fauk fauk0 = faum.asInterface(bjia.f(context0, bjia.a, "com.google.android.gms.vision.dynamite").e("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).newBarcodeDetector(new ObjectWrapper(context0), this.d);
                this.a = fauk0;
                if(fauk0 == null && !this.b) {
                    hawq.a(context0, "barcode");
                    this.b = true;
                    hbsq.c(this.e, hbkn.B);
                    throw new havd("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
                hbsq.c(this.e, hbkn.a);
                return false;
            }
            catch(RemoteException remoteException0) {
                throw new havd("Failed to create legacy barcode detector.", remoteException0);
            }
            catch(bjhw bjhw0) {
                throw new havd("Failed to load deprecated vision dynamite module.", bjhw0);
            }
        }
        return false;
    }
}

