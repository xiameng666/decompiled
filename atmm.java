import android.content.Context;
import com.google.android.gms.backup.transport.postd2dapptransfer.PostD2dAppTransferInfoDatabase;
import j..util.Optional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class atmm implements atmd {
    public final baun a;
    public final atlp b;
    private static final Optional c;

    static {
        atmm.c = Optional.empty();
    }

    public atmm(Context context0) {
        this.a = aqql.a("PostD2dAppTransferRecordsRoom");
        omd omd0 = cctd.a(context0, PostD2dAppTransferInfoDatabase.class, "backup_d2d_restore_app_info.db");
        omd0.f();
        this.b = ((PostD2dAppTransferInfoDatabase)omd0.a()).u();
    }

    @Override  // atmd
    public final long a(String s) {
        return (long)this.b.a(s).b;
    }

    @Override  // atmd
    public final gged_interceptors b(Set set0) {
        atlt atlt0 = new atlt(a.aF(((HashSet)set0), "SELECT pkg FROM PostD2dAppDataCleanupInfo WHERE (appState = \'RESTORED\' OR appState = \'FIRST_OPENED\') AND pkg NOT IN ("), set0);
        return gged_interceptors.i(((List)oqj.b(((atly)this.b).a, true, false, atlt0)));
    }

    @Override  // atmd
    public final gged_interceptors c() {
        atlr atlr0 = new atlr();
        return gged_interceptors.i(((List)oqj.b(((atly)this.b).a, true, false, atlr0)));
    }

    @Override  // atmd
    public final void d(String s, long v) {
        atln atln0 = new atln(this.b.a(s));
        atln0.b(2);
        atln0.c(Long.valueOf(v));
        atlo atlo0 = atln0.a();
        this.b.b(atlo0);
    }

    @Override  // atmd
    public final void e(String s, boolean z) {
        if(!z) {
            throw new IllegalStateException("App without data should not be recorded in ROOM database: " + s);
        }
        Void void0 = (Void)oqj.b(((atly)this.b).a, false, true, new atls(((atly)this.b), new atlo[]{atlo.a(s, Long.valueOf(0L), 1)}));
    }

    @Override  // atmd
    public final boolean f(String s) {
        return true;
    }

    @Override  // atmd
    public final boolean g(String s) {
        return this.b.a(s) != null;
    }

    @Override  // atmd
    public final int h(String s) {
        return this.b.a(s).c;
    }

    @Override  // atmd
    public final void i(String s, int v) {
        atln atln0 = new atln(this.b.a(s));
        atln0.b(v);
        atlo atlo0 = atln0.a();
        this.b.b(atlo0);
    }

    public static atmm j(Context context0) {
        atml atml0 = new atml(context0);
        return (atmm)atmm.c.orElseGet(atml0);
    }
}

