import android.content.pm.PackageInstaller.SessionCallback;
import android.content.pm.PackageInstaller.SessionInfo;

public final class cbov extends PackageInstaller.SessionCallback {
    final cbpb a;
    final ichm b;

    public cbov(ichm ichm0, cbpb cbpb0) {
        this.b = ichm0;
        this.a = cbpb0;
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
        if(z) {
            this.onProgressChanged(v, 1.0f);
        }
    }

    @Override  // android.content.pm.PackageInstaller$SessionCallback
    public final void onProgressChanged(int v, float f) {
        PackageInstaller.SessionInfo packageInstaller$SessionInfo0 = this.a.e.getSessionInfo(v);
        if(ibuq.m((packageInstaller$SessionInfo0 == null ? null : packageInstaller$SessionInfo0.getAppPackageName()), this.a.d) && !icha.c(this.b.b(Float.valueOf(f)))) {
            ((ggtj)cbpb.b.j()).x("Sending progress to UI failed");
        }
    }
}

