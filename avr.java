import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class avr implements bpa {
    public final avs a;
    public final CameraDevice b;
    public final axr c;
    public final List d;

    public avr(avs avs0, CameraDevice cameraDevice0, axr axr0, List list0) {
        this.a = avs0;
        this.b = cameraDevice0;
        this.c = axr0;
        this.d = list0;
    }

    @Override  // bpa
    public final gmcd a(Object object0) {
        gmcd gmcd0;
        List list0 = (List)object0;
        CameraDevice cameraDevice0 = this.b;
        axr axr0 = this.c;
        avs avs0 = this.a;
        List list1 = this.d;
        if(avs0.p.a) {
            for(Object object1: avs0.b.a()) {
                ((avp)object1).m();
            }
        }
        avs0.v("start openCaptureSession");
        synchronized(avs0.a) {
            if(avs0.k) {
                return new bpu(new CancellationException("Opener is disabled"));
            }
            synchronized(avs0.b.b) {
                avs0.b.e.add(avs0);
            }
            avs0.g = jqy.a(new avl(avs0, list1, new awq(cameraDevice0), axr0));
            bpt.j(avs0.g, new avn(avs0), bol.a());
            gmcd0 = bpt.d(avs0.g);
        }
        return gmcd0;
    }
}

