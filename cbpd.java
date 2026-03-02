import android.content.ComponentName;
import android.os.IBinder;

public final class cbpd extends clil {
    final icbi a;

    public cbpd(icbi icbi0) {
        this.a = icbi0;
        super("app_download");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ibuq.f(componentName0, "name");
        ibuq.f(iBinder0, "service");
        ibns ibns0 = new ibns(iBinder0, this);
        this.a.w(ibns0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
    }
}

