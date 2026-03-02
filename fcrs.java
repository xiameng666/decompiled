import android.app.backup.RestoreObserver;
import android.app.backup.RestoreSession;
import android.app.backup.RestoreSet;
import j..util.DesugarArrays;
import j..util.Objects;
import j..util.stream.Stream;

final class fcrs extends RestoreObserver {
    final RestoreSession a;
    final jqt b;
    final long c;
    public static final int d;

    public fcrs(fcrt fcrt0, RestoreSession restoreSession0, jqt jqt0, long v) {
        this.a = restoreSession0;
        this.b = jqt0;
        this.c = v;
        Objects.requireNonNull(fcrt0);
        super();
    }

    @Override  // android.app.backup.RestoreObserver
    public final void onUpdate(int v, String s) {
        fcrt.a.j("onUpdate: %d = %s", new Object[]{v, s});
    }

    @Override  // android.app.backup.RestoreObserver
    public final void restoreFinished(int v) {
        boolean z = false;
        if(v == 0) {
            fcrt.a.j("restoreFinished success", new Object[0]);
        }
        else {
            fcrt.a.m("restoreFinished error: %d", new Object[]{v});
        }
        RestoreSession restoreSession0 = this.a;
        jqt jqt0 = this.b;
        if(v == 0) {
            z = true;
        }
        fcrt.a(restoreSession0, jqt0, z);
    }

    public final void restoreSetsAvailable(RestoreSet[] arr_restoreSet) {
        if(arr_restoreSet != null && arr_restoreSet.length != 0) {
            baun baun0 = fcrt.a;
            baun0.j("Found %d available restore sets.", new Object[]{((int)arr_restoreSet.length)});
            Stream stream0 = DesugarArrays.stream(arr_restoreSet);
            long v = this.c;
            if(stream0.noneMatch(new fcrr(v))) {
                baun0.m("No restore set matching ancestral android id found.", new Object[0]);
                fcrt.a(this.a, this.b, false);
                return;
            }
            RestoreSession restoreSession0 = this.a;
            int v1 = restoreSession0.restoreAll(v, this);
            if(v1 != 0) {
                baun0.m("RestoreSession#restoreAll error code: %d", new Object[]{v1});
                fcrt.a(restoreSession0, this.b, false);
            }
            return;
        }
        fcrt.a.m("No restore sets found.", new Object[0]);
        fcrt.a(this.a, this.b, false);
    }

    @Override  // android.app.backup.RestoreObserver
    public final void restoreStarting(int v) {
        fcrt.a.j("restoreStarting: %d packages", new Object[]{v});
    }
}

