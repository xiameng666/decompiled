import android.app.backup.RestoreSession;

public final class fcrq implements jqv {
    public final fcrt a;
    public final RestoreSession b;
    public final long c;

    public fcrq(fcrt fcrt0, RestoreSession restoreSession0, long v) {
        this.a = fcrt0;
        this.b = restoreSession0;
        this.c = v;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        RestoreSession restoreSession0 = this.b;
        int v = restoreSession0.getAvailableRestoreSets(new fcrs(this.a, restoreSession0, jqt0, this.c));
        if(v != 0) {
            fcrt.a.m("RestoreSession#getAvailableRestoreSets error code: %d", new Object[]{v});
            fcrt.a(restoreSession0, jqt0, false);
        }
        return "SystemRestoreHelper#restore future";
    }
}

