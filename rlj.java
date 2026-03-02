import android.content.Context;
import android.os.PersistableBundle;
import j..time.Duration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class rlj extends rtn {
    public static final long a;
    private boolean g;
    private final Map i;
    private final Map j;

    static {
        rom.f(rod.f("com.android.onboarding"), "OrchestratedTaskPendingCallback");
        rom.f(rod.f("com.android.onboarding"), "OrchestratedTaskPendingOrchestratedCallback");
        rlj.a = ibzy.h(500, ibzz.c);
    }

    public rlj() {
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
    }

    protected final rla a(sdg sdg0, rlk rlk0, ibzw ibzw0, ibtw ibtw0, ibtx ibtx0) {
        ibuq.f(rlk0, "contract");
        rlg rlg0 = new rlg(ibtx0, null);
        ibuq.f(rlk0, "contract");
        if(this.g) {
            throw new IllegalStateException("Registering for task result should only be done at task initialisation time.");
        }
        ron ron0 = new ron(rlk0);
        Map map0 = this.j;
        if(map0.containsKey(ron0)) {
            throw new IllegalStateException(a.i(rlk0, "Task result handler for ", " is already registered"));
        }
        ibuq.f(rlk0, "contract");
        rlb rlb0 = new rlb(rlk0);
        rld rld0 = new rld(rlk0);
        rlc rlc0 = new rlc();
        rla rla0 = new rlf(this, sdg0, rlk0.b, rlb0, rld0, ibzw0, rlc0, rlg0, ibtw0);
        map0.put(ron0, rla0);
        return rla0;
    }

    @Override  // rve
    public final Object d(Context context0, PersistableBundle persistableBundle0, Duration duration0, ibrl ibrl0) {
        this.g = true;
        this.b = new WeakReference(context0);
        rmk rmk0 = rmg.d(persistableBundle0);
        if((rmk0 instanceof rmh)) {
            String s = a.U(this, "OrchestratedTask(", ")");
            Objects.toString(((rmh)rmk0).a);
            sct.c(s, "executeTask#RegularInput: " + ((rmh)rmk0).a);
            return rve.p(this, context0, ((rmh)rmk0).a, duration0, ibrl0);
        }
        if((rmk0 instanceof rmf)) {
            sct.c(a.U(this, "OrchestratedTask(", ")"), "executeTask#ActivityCallbackInput");
            PersistableBundle persistableBundle1 = ((rmf)rmk0).a;
            rnv rnv0 = (rnv)sdn.a(persistableBundle1, "ci.KEY_METADATA_STORE", rnv.a);
            if(rnv0 != null) {
                this.f.e(rnv0);
            }
            ron ron0 = rmf.b(persistableBundle1).o();
            rkz rkz0 = (rkz)this.i.get(ron0);
            if(rkz0 != null) {
                sct.c(a.U(this, "OrchestratedTask(", ")"), "Executing activity callback from " + rmf.b(persistableBundle1).m());
                Object object0 = rve.B(this, new rlh(rkz0, persistableBundle1, null), ibrl0);
                return object0 != ibrx.a ? ((rxv)object0) : object0;
            }
            String s1 = rmf.b(persistableBundle1).m();
            sct.a(a.U(this, "OrchestratedTask(", ")"), "No callback handler found for " + s1);
            rnw.c(("No callback handler found for " + s1));
            return this.z(new rnw("No callback handler found for " + s1));
        }
        if((rmk0 instanceof rmi)) {
            sct.c(a.U(this, "OrchestratedTask(", ")"), "executeTask#TaskCallbackInput");
            PersistableBundle persistableBundle2 = ((rmi)rmk0).a;
            rnv rnv1 = (rnv)sdn.a(persistableBundle2, "ci.KEY_METADATA_STORE", rnv.a);
            if(rnv1 != null) {
                this.f.e(rnv1);
            }
            ron ron1 = rmi.b(persistableBundle2).o();
            rlf rlf0 = (rlf)this.j.get(ron1);
            if(rlf0 != null) {
                sct.c(a.U(this, "OrchestratedTask(", ")"), "Executing task callback from " + rmi.b(persistableBundle2).m());
                Object object1 = rve.B(this, new rli(rlf0, persistableBundle2, null), ibrl0);
                return object1 != ibrx.a ? ((rxv)object1) : object1;
            }
            String s2 = "No callback handler found for " + rmi.b(persistableBundle2).m();
            rnw.c(s2);
            return this.z(new rnw(s2));
        }
        if(!(rmk0 instanceof rmj)) {
            throw new ibnq();
        }
        sct.a(a.U(this, "OrchestratedTask(", ")"), "executeTask#UnknownInput(Unknown orchestrated input type " + rmj.b(((rmj)rmk0).a) + ")");
        String s3 = "Unknown orchestrated input type " + rmj.b(((rmj)rmk0).a);
        rnw.c(s3);
        return this.z(new rnw(s3));
    }

    protected final rla e(sdg sdg0, rjr rjr0, ibzw ibzw0, ibtx ibtx0) {
        ibuq.f(rjr0, "contract");
        if(this.g) {
            throw new IllegalStateException("Registering for activity result should only be done at task initialisation time.");
        }
        ron ron0 = new ron(rjr0);
        Map map0 = this.i;
        if(map0.containsKey(ron0)) {
            throw new IllegalStateException(a.i(rjr0, "Activity result handler for ", " is already registered."));
        }
        rla rla0 = new rkz(this, sdg0, rjr0, ibzw0, ibtx0);
        map0.put(ron0, rla0);
        return rla0;
    }
}

