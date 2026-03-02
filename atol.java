import android.app.ActivityManager.OnUidImportanceListener;

public final class atol implements ibth {
    public final ator a;
    public final ActivityManager.OnUidImportanceListener b;

    public atol(ator ator0, ActivityManager.OnUidImportanceListener activityManager$OnUidImportanceListener0) {
        this.a = ator0;
        this.b = activityManager$OnUidImportanceListener0;
    }

    @Override  // ibth
    public final Object a() {
        try {
            this.a.b.removeOnUidImportanceListener(this.b);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(ator.a.i(), "Error removing OnUidImportanceListener", illegalArgumentException0);
        }
        catch(IllegalStateException illegalStateException0) {
            a.ae(ator.a.i(), "Error removing OnUidImportanceListener", illegalStateException0);
        }
        catch(SecurityException securityException0) {
            a.ae(ator.a.i(), "Error removing OnUidImportanceListener", securityException0);
        }
        return ibom.a;
    }
}

