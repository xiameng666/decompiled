import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import j..util.Objects;

final class aufu extends clil {
    final aufx a;

    public aufu(aufx aufx0) {
        Objects.requireNonNull(aufx0);
        this.a = aufx0;
        super("CastAuthContentServiceClient");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        aufx.a.c("CastAuthService connected.", new Object[0]);
        this.a.c = new Messenger(iBinder0);
        this.a.e();
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        aufx.a.c("CastAuthService disconnected.", new Object[0]);
        this.a.c = null;
    }
}

