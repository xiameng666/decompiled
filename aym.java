import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

public final class aym {
    public final List a;
    private final boolean b;

    public aym(boolean z) {
        this.a = DesugarCollections.synchronizedList(new ArrayList());
        this.b = z;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback cameraCaptureSession$CaptureCallback0) {
        if(this.b) {
            CameraCaptureSession.CaptureCallback[] arr_cameraCaptureSession$CaptureCallback = new CameraCaptureSession.CaptureCallback[2];
            ayl ayl0 = new ayl();
            this.a.add(ayl0.a);
            ayi ayi0 = new ayi(this, ayl0, ayl0.a);
            Executor executor0 = bol.a();
            ayl0.a.hB(ayi0, executor0);
            arr_cameraCaptureSession$CaptureCallback[0] = ayl0;
            arr_cameraCaptureSession$CaptureCallback[1] = cameraCaptureSession$CaptureCallback0;
            return new aqk(Arrays.asList(arr_cameraCaptureSession$CaptureCallback));
        }
        return cameraCaptureSession$CaptureCallback0;
    }

    public final gmcd b() {
        return this.a.isEmpty() ? bpt.b(null) : bpt.d(bpt.f(bpt.e(new ArrayList(this.a)), new ayj(), bol.a()));
    }

    public final void c() {
        LinkedList linkedList0 = new LinkedList(this.a);
        while(!linkedList0.isEmpty()) {
            ((gmcd)Objects.requireNonNull(((gmcd)linkedList0.poll()))).cancel(true);
        }
    }
}

