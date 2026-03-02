import android.app.backup.BackupObserver;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import j..util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class asfp {
    public static final baun a;
    public final aqjk b;
    public final asfv c;
    public final asgb d;
    public final asgc e;
    public final asfu f;
    public gmcu g;
    public Optional h;
    private final asfr i;

    static {
        asfp.a = aqql.a("BackupNowBackupAgentsRunner");
    }

    public asfp(aqjk aqjk0, asfr asfr0, asfu asfu0, asfv asfv0, asgb asgb0, asgc asgc0) {
        this.h = Optional.empty();
        this.b = aqjk0;
        this.i = asfr0;
        this.c = asfv0;
        this.d = asgb0;
        this.f = asfu0;
        this.e = asgc0;
    }

    public final int a(gged_interceptors gged0) {
        int v4;
        if(!gged0.isEmpty()) {
            asfr asfr0 = this.i;
            Optional optional0 = asfr0.a();
            if(optional0.isPresent()) {
                return (int)(((Integer)optional0.get()));
            }
            try {
                bbll bbll0 = new bbll(1, 10);
                asfm asfm0 = new asfm(this);
                asfr0.h = bbll0;
                long v1 = hqii.a.e().b();
                asfr.a.j("Will check backup constraints every %d seconds", new Object[]{v1});
                bbll0.a(new asfq(asfr0, asfm0), v1, v1, TimeUnit.SECONDS);
                asfn asfn0 = new asfn(this);
                ggdy ggdy0 = new ggdy();
                int v2 = gged0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    ggdy0.i(((PackageInfo)gged0.get(v3)).packageName);
                }
                v4 = this.b(asfn0, ggdy0.h());
            }
            finally {
                this.i.b();
            }
            return v4;
        }
        return 29005;
    }

    private final int b(BackupObserver backupObserver0, gged_interceptors gged0) {
        this.g = new gmcu();
        baun baun0 = asfp.a;
        baun0.h("Requesting backup for packages: %s", new Object[]{gged0});
        if(Build.VERSION.SDK_INT >= 34 && hqii.a.e().v()) {
            aqjk aqjk0 = this.b;
            String[] arr_s = (String[])gged0.toArray(new String[0]);
            if(aqjk0.g()) {
                aqjk0.a.requestBackup(arr_s, backupObserver0);
            }
        }
        else {
            String[] arr_s1 = (String[])gged0.toArray(new String[0]);
            asfo asfo0 = new asfo(this);
            this.b.a(arr_s1, backupObserver0, asfo0, 0);
        }
        long v = ((ggna)gged0).c <= 1 ? hqii.a.e().a() : hqii.a.e().k();
        try {
            int v1 = (int)(((Integer)this.g.v(v, TimeUnit.SECONDS)));
            if(v1 == 0) {
                return 29000;
            }
            switch(v1) {
                case -2003: {
                    if(this.h.isPresent()) {
                        baun0.m("Backup cancelled due to lost constraints.", new Object[0]);
                        return (int)(((Integer)this.h.get()));
                    }
                    baun0.m("Backup cancelled for unknown reason.", new Object[0]);
                    return 29001;
                }
                case -1000: {
                    baun0.m("Transport error.", new Object[0]);
                    return 29003;
                }
                default: {
                    baun0.m("Error in backup manager.", new Object[0]);
                    return 29001;
                }
            }
        }
        catch(ExecutionException executionException0) {
            asfp.a.n("ExecutionException while requesting backup.", executionException0, new Object[0]);
            return 29001;
        }
        catch(TimeoutException unused_ex) {
            if(((ggna)gged0).c > 1) {
                asfp.a.m("The backup session has timed out, cancelling remaining backups.", new Object[0]);
                this.b.e();
                return 29012;
            }
            asfp.a.m("Request for package backup has timed out.", new Object[0]);
            return 29004;
        }
        catch(InterruptedException interruptedException0) {
            asfp.a.n("InterruptedException while requesting backup.", interruptedException0, new Object[0]);
            return 29001;
        }
    }
}

