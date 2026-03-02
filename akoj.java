import android.content.pm.PackageInstaller.SessionCallback;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageInstaller;
import android.util.Log;
import j..util.Objects;
import java.util.function.Consumer;

final class akoj extends PackageInstaller.SessionCallback {
    final PackageInstaller a;
    final String b;
    final Consumer c;
    final akou d;

    public akoj(akou akou0, PackageInstaller packageInstaller0, String s, Consumer consumer0) {
        this.a = packageInstaller0;
        this.b = s;
        this.c = consumer0;
        Objects.requireNonNull(akou0);
        this.d = akou0;
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
        PackageInstaller.SessionInfo packageInstaller$SessionInfo0 = this.a.getSessionInfo(v);
        if(packageInstaller$SessionInfo0 == null) {
            Log.i("Auth", a.f(v, "[AuthManaged, PhoneskyDpcInstallViewModel] Session {", "} returned null"));
            return;
        }
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] Session finished " + packageInstaller$SessionInfo0.getAppPackageName() + " " + z);
        String s = packageInstaller$SessionInfo0.getAppPackageName();
        if(this.b.equals(s)) {
            if(z) {
                this.c.accept(akrp.d);
                return;
            }
            this.c.accept(akrp.f);
        }
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onProgressChanged(int v, float f) {
        PackageInstaller.SessionInfo packageInstaller$SessionInfo0 = this.a.getSessionInfo(v);
        if(packageInstaller$SessionInfo0 != null) {
            String s = packageInstaller$SessionInfo0.getAppPackageName();
            if(this.b.equals(s)) {
                this.d.b.e.b(Integer.valueOf(((int)(f * 100.0f))));
            }
        }
    }
}

