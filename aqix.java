import android.app.backup.RestoreObserver;
import android.app.backup.RestoreSession;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import j..util.Collection.-EL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aqix extends cjtm {
    public static final aqql a;
    public final azxs b;
    public final long c;
    public RestoreSession d;
    public gmcu e;
    public gmcu f;
    private final aqjk g;
    private final String h;
    private final RestoreObserver i;

    static {
        aqix.a = new aqql(new String[]{"RequestGmsModuleRestore"});
    }

    public aqix(aqjk aqjk0, azxs azxs0, long v, String s, azug azug0) {
        super(201, "RequestGmsModuleRestore", azug0);
        this.i = new aqiw(this);
        gftb.check(azxs0);
        this.b = azxs0;
        this.g = aqjk0;
        this.c = v;
        gftb.check(s);
        this.h = s;
    }

    private final List b() {
        aqix.a.j("Waiting for the restore sets", new Object[0]);
        try {
            return (List)this.e.v(hqjw.a.b().e(), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
            this.j(Status.c);
            Thread.currentThread().interrupt();
            return ggna.a;
        }
        catch(ExecutionException unused_ex) {
            this.j(Status.d);
            return ggna.a;
        }
        catch(TimeoutException unused_ex) {
            this.j(Status.e);
            return ggna.a;
        }
    }

    private final void c() {
        aqix.a.j("Waiting for the restore to finish", new Object[0]);
        try {
            if(!((Boolean)this.f.v(hqjw.a.b().d(), TimeUnit.MILLISECONDS)).booleanValue()) {
                this.j(Status.d);
            }
        }
        catch(InterruptedException unused_ex) {
            this.j(Status.c);
            Thread.currentThread().interrupt();
        }
        catch(ExecutionException unused_ex) {
            this.j(Status.d);
        }
        catch(TimeoutException unused_ex) {
            this.j(Status.e);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.h;
        aqql aqql0 = aqix.a;
        aqql0.j("Requesting restore of a gms module %s.", new Object[]{s});
        this.f = new gmcu();
        this.e = new gmcu();
        RestoreSession restoreSession0 = this.g.c();
        this.d = restoreSession0;
        if(restoreSession0 == null) {
            aqql0.f("Couldn\'t start restore session.", new Object[0]);
            this.j(Status.d);
            return;
        }
        if(restoreSession0.getAvailableRestoreSets(this.i) != 0) {
            aqql0.f("Error getting restore sets from backup manager.", new Object[0]);
            this.j(Status.d);
            return;
        }
        if(!Collection.-EL.stream(this.b()).anyMatch(new aqiv(this))) {
            aqql0.m("Restore set is not found among the available restore sets.", new Object[0]);
            this.j(Status.d);
            return;
        }
        if(hqjw.d()) {
            frce frce0 = new frce(context0);
            frce0.d("backup");
            frce0.e("OnDemandRestoreGmsModuleProtoDataStore.pb");
            Uri uri0 = frce0.a();
            frie frie0 = frif.a();
            frie0.f(uri0);
            frie0.e(((MessageLite)aqhm.a));
            frif frif0 = frie0.a();
            frli frli0 = cjtb.a.a(frif0);
            try {
                ((glyq)frli0.b(new aqjp(s), gmap.a)).u();
                aqql0.j("Successfully set on-demand restore information.", new Object[0]);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                aqix.a.g("Unable to set on-demand restore information.", interruptedException0, new Object[0]);
                this.j(Status.d);
                return;
            }
            catch(ExecutionException executionException0) {
                aqix.a.g("Unable to set on-demand restore information.", executionException0, new Object[0]);
                this.j(Status.d);
                return;
            }
        }
        aqql0.j("Requesting restore of %s", new Object[]{((long)this.c)});
        RestoreSession restoreSession1 = this.d;
        ggoh ggoh0 = new ggoh("com.google.android.gms");
        int v = restoreSession1.restorePackages(this.c, this.i, ggoh0);
        if(v == 0) {
            aqql0.j("Restore is requested successfully.", new Object[0]);
            if(!hqjw.c()) {
                this.b.a(Status.b);
            }
        }
        else {
            aqql0.j("Restore request failed with code %d", new Object[]{v});
            this.j(new Status(29031));
        }
        this.c();
    }

    @Override  // cjtm
    public final void j(Status status0) {
        String s = status0.b();
        aqix.a.f("Failure, status=%s message=%s", new Object[]{((int)status0.i), s});
        RestoreSession restoreSession0 = this.d;
        if(restoreSession0 != null) {
            restoreSession0.endRestoreSession();
        }
        this.b.a(status0);
        if(!this.e.isDone()) {
            this.e.q(null);
        }
        if(!this.f.isDone()) {
            this.f.q(Boolean.valueOf(false));
        }
    }
}

