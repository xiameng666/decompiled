import android.app.Notification;
import com.google.android.chimera.Service;

public final class argl {
    public final bayn a;
    private final Service b;

    public argl(Service service0) {
        this.b = service0;
        this.a = bayn.f(service0);
    }

    final void a() {
        this.b.stopForeground(true);
    }

    final void b(Notification notification0) {
        this.b.startForeground(1, notification0);
    }
}

