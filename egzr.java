import android.content.Context;
import com.google.android.gms.people.cpg.model.GroupContactOrder;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class egzr implements Closeable {
    public final aet a;
    private boolean b;

    public egzr(Context context0) {
        this.b = false;
        aet aet0 = null;
        if(hwyi.z()) {
            try {
                aet0 = (aet)egcb.a(context0).get();
            }
            catch(InterruptedException | ExecutionException exception0) {
                egig.c("FSA2_CpgSessionManager", "Failed to get AppSearchSession", exception0);
            }
        }
        this.a = aet0;
        if(aet0 != null) {
            boolean z = egci.a(context0, aet0);
            this.b = z;
            if(z) {
                return;
            }
        }
        egig.b("FSA2_CpgSessionManager", "Failed to initialize schema");
    }

    public final Map a(ggfp ggfp0) {
        if(!this.b()) {
            return ggnf.a;
        }
        aet aet0 = this.a;
        if(aet0 == null) {
            egig.b("FSA2_CpgSessionManager", "appSearchSession is null, CPG is unavailable");
            return ggnf.a;
        }
        return egcb.c(aet0, ggfp0);
    }

    public final boolean b() {
        if(!hwyi.z()) {
            return false;
        }
        if(this.a == null) {
            egig.k("FSA2_CpgSessionManager", "AppSearchSession is null, CPG is unavailable");
            return false;
        }
        if(!this.b) {
            egig.k("FSA2_CpgSessionManager", "CpgSessionManager used with schema unavailable/uninitialized");
            return false;
        }
        return true;
    }

    public final boolean c() {
        if(this.b()) {
            aet aet0 = this.a;
            if(aet0 == null) {
                egig.b("FSA2_CpgSessionManager", "appSearchSession is null, CPG flush is unavailable");
                return false;
            }
            try {
                aet0.g().get();
                return true;
            }
            catch(InterruptedException | ExecutionException exception0) {
                egig.c("FSA2_CpgSessionManager", "failure while attempting to flush CPG", exception0);
                return false;
            }
        }
        return true;
    }

    @Override
    public final void close() {
        if(hwyi.z()) {
            aet aet0 = this.a;
            if(aet0 != null) {
                aet0.close();
                return;
            }
            egig.b("FSA2_CpgSessionManager", "close called on CpgSessionManager with null AppSearchSession");
        }
    }

    public final boolean d(Set set0) {
        if(!this.b()) {
            egig.k("FSA2_CpgSessionManager", "CPG is disabled, cannot remove groupContactOrders from CPG");
            return true;
        }
        aet aet0 = this.a;
        if(aet0 == null) {
            egig.b("FSA2_CpgSessionManager", "appSearchSession is null, CPG is unavailable");
            return false;
        }
        return egcb.g(aet0, set0);
    }

    public final boolean e(Set set0, ehim ehim0) {
        ehim ehim1;
        if(!set0.isEmpty()) {
            ggfn ggfn0 = new ggfn();
            for(Object object0: set0) {
                ggfn0.i(String.valueOf(((Long)object0)));
            }
            Set set1 = this.a(ggfn0.h()).keySet();
            egig.h("FSA2_CpgSessionManager", "Removing present GroupContactOrders: requested: %s removing: %s", set0.size(), set1.size());
            if(set1.isEmpty()) {
                return true;
            }
            boolean z = this.d(set1);
            if(ehim0 == null) {
                return z;
            }
            if(z) {
                ehim1 = ehim0;
            }
            else {
                ehim1 = ehim0;
                ehim1.h(girk.d, gjgi.h, true, 2, set1.size());
            }
            ehim1.h(girk.d, gjgi.h, true, 1, set1.size());
            return z;
        }
        return true;
    }

    public final boolean f(Set set0) {
        if(!this.b()) {
            return true;
        }
        aet aet0 = this.a;
        if(aet0 == null) {
            egig.b("FSA2_CpgSessionManager", "appSearchSession is null, CPG is unavailable");
            return false;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: set0) {
            hashMap0.put(((GroupContactOrder)object0).b, ((GroupContactOrder)object0));
        }
        return egcb.h(aet0, hashMap0, true);
    }
}

