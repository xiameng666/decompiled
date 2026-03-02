import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class asn extends bhh {
    public final awt a;
    public final Executor b;
    public CameraManager.AvailabilityCallback c;

    public asn(List list0, awt awt0, Executor executor0) {
        ibuq.f(list0, "initialCameraIds");
        super(list0);
        this.a = awt0;
        this.b = executor0;
    }

    @Override  // bld
    public final gmcd a() {
        return jqy.a(new asl(this));
    }

    public static final void b(asn asn0, jqt jqt0) {
        try {
            String[] arr_s = asn0.a.f();
            ibuq.e(arr_s, "getCameraIdList(...)");
            ArrayList arrayList0 = new ArrayList(arr_s.length);
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                ibuq.c(s);
                arrayList0.add(azx.a(s));
            }
            ibpo.aK(arrayList0, null, null, null, null, 0x3F);
            asn0.super.d(arrayList0, null);
            jqt0.b(arrayList0);
        }
        catch(awl awl0) {
            Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", awl0);
            baf baf0 = new baf(awl0);
            asn0.super.d(null, baf0);
            jqt0.c(baf0);
        }
    }

    @Override  // bhh
    public final void c() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        CameraManager.AvailabilityCallback cameraManager$AvailabilityCallback0 = this.c;
        if(cameraManager$AvailabilityCallback0 != null) {
            try {
                try {
                    this.a.e(cameraManager$AvailabilityCallback0);
                }
                catch(Exception exception0) {
                    Log.w("Camera2PresenceSrc", "Failed to unregister system availability callback.", exception0);
                }
                this.c = null;
            }
            catch(Throwable throwable0) {
                this.c = null;
                throw throwable0;
            }
        }
    }
}

