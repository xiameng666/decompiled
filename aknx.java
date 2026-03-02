import android.content.pm.PackageInstaller.SessionCallback;
import android.content.pm.PackageInstaller.SessionInfo;
import j..util.Objects;

final class aknx extends PackageInstaller.SessionCallback {
    final aknz a;

    public aknx(aknz aknz0) {
        Objects.requireNonNull(aknz0);
        this.a = aknz0;
        super();
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onActiveChanged(int v, boolean z) {
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onBadgingChanged(int v) {
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onCreated(int v) {
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onFinished(int v, boolean z) {
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onProgressChanged(int v, float f) {
        aknz aknz0 = this.a;
        PackageInstaller.SessionInfo packageInstaller$SessionInfo0 = aknz0.e.getSessionInfo(v);
        if(packageInstaller$SessionInfo0 != null) {
            String s = packageInstaller$SessionInfo0.getAppPackageName();
            if(aknz0.d.equals(s)) {
                aknz0.a(Integer.valueOf(((int)(f * 100.0f))));
            }
        }
    }
}

