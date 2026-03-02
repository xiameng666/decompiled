import android.hardware.camera2.CameraCaptureSession.StateCallback;
import java.util.List;
import java.util.concurrent.Executor;

public final class axr {
    public final axq a;

    public axr(int v, List list0, Executor executor0, CameraCaptureSession.StateCallback cameraCaptureSession$StateCallback0) {
        this.a = new axq(v, list0, executor0, cameraCaptureSession$StateCallback0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof axr) ? this.a.equals(((axr)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

