import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import j..util.Objects;
import java.io.File;
import java.io.FileNotFoundException;

final class ffir extends ffee {
    final Asset c;
    final fdiy d;
    final fflv e;

    public ffir(fflv fflv0, String s, Asset asset0, fdiy fdiy0) {
        this.c = asset0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        ParcelFileDescriptor parcelFileDescriptor0;
        try {
            fdvl fdvl0 = this.e.h;
            String s = this.c.b;
            File file0 = fdvl0.V(fdvl0.c.getReadableDatabase(), this.e.e, s) ? fdvl0.s.a(s) : null;
            if(file0 == null) {
                parcelFileDescriptor0 = null;
            }
            else {
                try {
                    parcelFileDescriptor0 = ParcelFileDescriptor.open(file0, 0x10000000);
                }
                catch(FileNotFoundException unused_ex) {
                    Log.w("WearableService", a.ab(file0, "Fail to open asset file "));
                    parcelFileDescriptor0 = null;
                }
            }
            if(parcelFileDescriptor0 == null) {
                Log.w("WearableService", "getFdForAsset: unable to provide asset: " + this.c);
                GetFdForAssetResponse getFdForAssetResponse0 = new GetFdForAssetResponse(4005, null);
                this.d.G(getFdForAssetResponse0);
                return;
            }
            try {
                GetFdForAssetResponse getFdForAssetResponse1 = new GetFdForAssetResponse(0, parcelFileDescriptor0);
                this.d.G(getFdForAssetResponse1);
            }
            catch(Throwable throwable0) {
                parcelFileDescriptor0.close();
                throw throwable0;
            }
            if(ffme.b(this.d)) {
                parcelFileDescriptor0.close();
            }
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getFdForAsset: exception during processing: " + this.c, exception0);
            GetFdForAssetResponse getFdForAssetResponse2 = new GetFdForAssetResponse(8, null);
            this.d.G(getFdForAssetResponse2);
        }
    }
}

