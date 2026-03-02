import android.hardware.camera2.CameraDevice.StateCallback;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

final class atp {
    final Executor a;
    final Object b;
    final Set c;
    final Set d;
    final Set e;
    public final CameraDevice.StateCallback f;

    public atp(Executor executor0) {
        this.b = new Object();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f = new ato(this);
        this.a = executor0;
    }

    final List a() {
        synchronized(this.b) {
        }
        return new ArrayList(this.c);
    }

    final List b() {
        synchronized(this.b) {
        }
        return new ArrayList(this.e);
    }

    final List c() {
        List list0;
        synchronized(this.b) {
            list0 = new ArrayList();
            list0.addAll(this.a());
            list0.addAll(this.b());
        }
        return list0;
    }

    public final void d(avp avp0) {
        for(Object object0: this.c()) {
            if(((avp)object0) == avp0) {
                break;
            }
            ((avp)object0).o();
        }
    }

    final void e(avp avp0) {
        this.d(avp0);
        synchronized(this.b) {
            this.e.remove(avp0);
        }
    }
}

