import android.hardware.camera2.CameraDevice.StateCallback;
import java.util.ArrayList;

public final class apk implements jqv {
    public final aqi a;

    public apk(aqi aqi0) {
        this.a = aqi0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        aqi aqi0;
        try {
            aqi0 = this.a;
            ArrayList arrayList0 = new ArrayList(aqi0.a.b().a().c);
            arrayList0.add(aqi0.u.f);
            arrayList0.add(new apt(aqi0, jqt0));
            CameraDevice.StateCallback cameraDevice$StateCallback0 = asw.a(arrayList0);
            aqi0.b.c(aqi0.h.a, aqi0.c, cameraDevice$StateCallback0);
        }
        catch(awl | RuntimeException exception0) {
            aqi0.O();
            jqt0.c(exception0);
        }
        return "configAndCloseTask";
    }
}

