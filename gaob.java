import android.content.ComponentName;
import android.os.IBinder;

public final class gaob extends clil {
    final gaoc a;

    public gaob(gaoc gaoc0) {
        this.a = gaoc0;
        super("wallet");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ibuq.f(componentName0, "componentName");
        ibuq.f(iBinder0, "serviceMessenger");
        this.a.a.c(iBinder0);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ibuq.f(componentName0, "name");
        IllegalStateException illegalStateException0 = new IllegalStateException("Service Connection Has been disconnected.");
        this.a.a.d(illegalStateException0);
    }
}

