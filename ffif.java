import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.GetAppThemeResponse;
import j..util.Objects;

final class ffif extends ffee {
    final AppTheme c;
    final fdiy d;
    final fflv e;

    public ffif(fflv fflv0, AppTheme appTheme0, fdiy fdiy0) {
        this.c = appTheme0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getCanonicalAppTheme");
    }

    @Override  // ffee
    public final void a() {
        batl.s(this.e.B);
        AppTheme appTheme0 = fcfw.a(fcfw.b(this.c));
        try {
            GetAppThemeResponse getAppThemeResponse0 = new GetAppThemeResponse(0, appTheme0);
            this.d.d(getAppThemeResponse0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WearableService", "getCanonicalAppTheme exception", remoteException0);
        }
    }
}

