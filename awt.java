import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.hardware.camera2.CameraManager;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class awt {
    public final awx a;
    private final Map b;

    public awt(awx awx0) {
        this.b = new ArrayMap(4);
        this.a = awx0;
    }

    public final CameraManager a() {
        return this.a.a;
    }

    public final awp b(String s) {
        awp awp0;
        Map map0 = this.b;
        synchronized(map0) {
            awp0 = (awp)map0.get(s);
            if(awp0 == null) {
                try {
                    awp0 = new awp(this.a.a(s), s);
                    map0.put(s, awp0);
                }
                catch(AssertionError assertionError0) {
                    throw new awl(assertionError0.getMessage(), assertionError0);
                }
            }
        }
        return awp0;
    }

    public final void c(String s, Executor executor0, CameraDevice.StateCallback cameraDevice$StateCallback0) {
        this.a.b(s, executor0, cameraDevice$StateCallback0);
    }

    public final void d(Executor executor0, CameraManager.AvailabilityCallback cameraManager$AvailabilityCallback0) {
        ((awu)this.a).a.registerAvailabilityCallback(executor0, cameraManager$AvailabilityCallback0);
    }

    public final void e(CameraManager.AvailabilityCallback cameraManager$AvailabilityCallback0) {
        ((awu)this.a).a.unregisterAvailabilityCallback(cameraManager$AvailabilityCallback0);
    }

    public final String[] f() {
        return this.a.d();
    }
}

