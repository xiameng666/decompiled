import android.app.backup.RestoreSession;

public final class fcrt {
    public static final baun a;
    public final aqjk b;

    static {
        fcrt.a = new fcgf(new String[]{"SystemRestoreHelper"});
    }

    public fcrt(aqjk aqjk0) {
        this.b = aqjk0;
    }

    public static void a(RestoreSession restoreSession0, jqt jqt0, boolean z) {
        restoreSession0.endRestoreSession();
        jqt0.b(Boolean.valueOf(z));
    }
}

