import android.app.backup.BackupObserver;
import j..util.Objects;

final class asfn extends BackupObserver {
    final asfp a;

    public asfn(asfp asfp0) {
        Objects.requireNonNull(asfp0);
        this.a = asfp0;
        super();
    }

    public final void backupFinished(int v) {
        this.a.g.q(Integer.valueOf(v));
    }

    public final void onResult(String s, int v) {
        ghyy ghyy0;
        if(!"@pm@".equals(s)) {
            asfp.a.h("Backup done for %s, success: %d", new Object[]{s, v});
            asfp asfp0 = this.a;
            if(v == -1005) {
                ghyy0 = ghyy.i;
            }
            else {
                switch(v) {
                    case -2003: {
                        ghyy0 = ghyy.e;
                        break;
                    }
                    case -2002: {
                        ghyy0 = ghyy.d;
                        break;
                    }
                    case -2001: {
                        ghyy0 = ghyy.c;
                        break;
                    }
                    case -1003: {
                        ghyy0 = ghyy.h;
                        break;
                    }
                    case -1002: {
                        ghyy0 = ghyy.g;
                        break;
                    }
                    case -1000: {
                        ghyy0 = ghyy.f;
                        break;
                    }
                    case 0: {
                        ghyy0 = ghyy.b;
                        break;
                    }
                    default: {
                        ghyy0 = ghyy.a;
                    }
                }
            }
            asfu.a.j("Logging backup result for package: %s, backupObserverResult: %s", new Object[]{s, ghyy0});
            asft asft0 = asfp0.f.a(s);
            asft0.a = ghyy0;
            asfp0.f.b.put(s, asft0);
            asgb asgb0 = asfp0.d;
            int v1 = asgb0.a;
            if(v1 > 0) {
                int v2 = asgb0.b;
                if(v2 < v1) {
                    asgb0.b = v2 + 1;
                    asfv asfv0 = asfp0.c;
                    if(hqil.r()) {
                        int v3 = asgb0.a();
                        asfv0.b.setProgress(asgb0.c, v3, false);
                    }
                    else {
                        asfv0.b.setProgress(asgb0.a, asgb0.b, false);
                    }
                    asfv0.c();
                    if(hqil.r()) {
                        asfp0.e.d(asgb0);
                    }
                    asfp0.e.f(v1, v2);
                }
            }
        }
    }
}

