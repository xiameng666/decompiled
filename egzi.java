import android.accounts.Account;
import android.os.SystemClock;
import j..time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class egzi {
    public static final egzi a;
    private final Map b;
    private final Set c;

    static {
        egzi.a = new egzi();
    }

    private egzi() {
        this.b = new HashMap();
        this.c = new HashSet();
    }

    public final egzh a(Account account0) {
        egzh egzh1;
        synchronized(this) {
            Map map0 = this.b;
            if(map0.containsKey(account0.name)) {
                return (egzh)map0.get(account0.name);
            }
            egzh1 = this.g(account0);
        }
        return egzh1;
    }

    public final egzh b(Account account0, Runnable runnable0) {
        egzh egzh1;
        synchronized(this) {
            if(this.h(account0)) {
                egzh egzh0 = this.a(account0);
                egzh0.d(SystemClock.elapsedRealtime(), runnable0);
                return egzh0;
            }
            egzh1 = new egzh(this);
        }
        return egzh1;
    }

    public final gmcd c(Account account0) {
        synchronized(this) {
            egzh egzh0 = this.a(account0);
            if(egzh0.b()) {
                return jqy.a(new egzg(egzh0));
            }
        }
        return gmbx.a;
    }

    public final Duration d(Account account0) {
        Duration duration0;
        synchronized(this) {
            duration0 = this.a(account0).a();
        }
        return duration0;
    }

    public final void e(Account account0) {
        synchronized(this) {
            this.c.add(account0.name);
        }
    }

    public final boolean f(Account account0) {
        synchronized(this) {
            egzh egzh0 = this.a(account0);
            if(egzh0.b()) {
                if(!egzh0.c()) {
                    return false;
                }
                egig.k("FSA2_SyncLock", "Sync timed out, cancelling existing sync and reassigning lock");
                if(hxbk.e()) {
                    Runnable runnable0 = egzh0.b;
                    if(runnable0 == null) {
                        egig.k("FSA2_SyncLock", "Expired lock with null expire lock function");
                    }
                    else {
                        egig.e("FSA2_SyncLock", "calling lock expire function");
                        runnable0.run();
                    }
                }
                this.g(account0);
            }
        }
        return true;
    }

    private final egzh g(Account account0) {
        egzh egzh0;
        synchronized(this) {
            egzh0 = new egzh(this);
            this.b.put(account0.name, egzh0);
        }
        return egzh0;
    }

    private final boolean h(Account account0) {
        synchronized(this) {
            if(this.f(account0) && !this.c.contains(account0.name)) {
                return true;
            }
        }
        return false;
    }
}

