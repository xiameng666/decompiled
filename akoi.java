import android.content.pm.PackageInstaller.SessionCallback;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageInstaller;
import android.util.Log;
import j..util.Objects;
import java.util.function.Consumer;

final class akoi extends PackageInstaller.SessionCallback {
    final PackageInstaller a;
    final Consumer b;
    final akou c;
    private int d;

    public akoi(akou akou0, PackageInstaller packageInstaller0, Consumer consumer0) {
        this.a = packageInstaller0;
        this.b = consumer0;
        Objects.requireNonNull(akou0);
        this.c = akou0;
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
        PackageInstaller.SessionInfo packageInstaller$SessionInfo0 = this.a.getSessionInfo(v);
        if(packageInstaller$SessionInfo0 != null && "com.android.vending".equals(packageInstaller$SessionInfo0.getAppPackageName())) {
            this.d = v;
            Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] Phonesky installation session starts. session: " + v);
        }
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onFinished(int v, boolean z) {
        if(this.d != v) {
            return;
        }
        akot akot0 = this.c.a;
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallViewModel] Phonesky installation finished. " + akot0.b + " -> " + aknv.a(this.c.a()) + ". Success: " + z);
        if(z) {
            akou.f(akot0.d, Integer.valueOf(-1), this.b);
            return;
        }
        akou.f(akot0.d, Integer.valueOf(-2), this.b);
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onProgressChanged(int v, float f) {
        PackageInstaller.SessionInfo packageInstaller$SessionInfo0 = this.a.getSessionInfo(v);
        if(packageInstaller$SessionInfo0 != null && "com.android.vending".equals(packageInstaller$SessionInfo0.getAppPackageName())) {
            this.c.a.d.b(Integer.valueOf(((int)(f * 100.0f))));
        }
    }
}

