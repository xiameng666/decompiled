import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;

public abstract class gani extends du {
    private static clht a;
    public final bzt ag;
    public gbgr ah;
    public gbfq ai;
    public boolean aj;
    public boolean ak;
    public int al;
    public int am;
    public final clht an;
    public gamy ao;
    private gaoc ap;
    private int aq;
    private gaoj ar;
    private int b;
    public static final WeakHashMap c;
    public final ArrayList d;

    static {
        gani.c = new WeakHashMap();
    }

    public gani() {
        this.d = new ArrayList();
        this.ag = new bzt(2);
        this.b = 0;
        this.aj = false;
        this.ak = false;
        this.aq = 0;
        this.an = new clht(Looper.getMainLooper());
    }

    protected abstract void A(AsyncTask arg1);

    protected abstract gamy B(Context arg1);

    protected abstract gaoj C(gaoc arg1);

    public static clht D() {
        if(gani.a == null) {
            gani.a = new clht(Looper.getMainLooper());
        }
        return gani.a;
    }

    public static gani E(xob xob0) {
        gani gani0 = (gani)xob0.getSupportFragmentManager().h("ActionExecutorFragment");
        return gani0 == null ? ((gani)gani.c.get(xob0)) : gani0;
    }

    protected static gani F(xob xob0) {
        gani gani0 = gani.E(xob0);
        gavr.b(gani0, "BE_AEF_01", null, gavs.a, "Activity has no ActionExecutorFragment!");
        return gani0;
    }

    public final gbfq G() {
        gbfq gbfq0 = this.ai;
        gavr.b(gbfq0, "BE_AEF_07", null, gavs.a, "ActionRepository cannot be null");
        return gbfq0;
    }

    public final gbgr H() {
        gbgr gbgr0 = this.ah;
        gavr.b(gbgr0, "BE_AEF_11", null, gavs.a, "SessionRepository cannot be null");
        return gbgr0;
    }

    public final void I() {
        gavs.c(this.ak, "BE_AEF_04", null, "Fragment must be resumed!");
    }

    public final void J(Bundle bundle0) {
        this.ak = false;
        bzt bzt0 = this.ag;
        int v = bzt0.c();
        for(int v1 = 0; v1 < v; ++v1) {
            ganf ganf0 = ((gang)bzt0.e(v1)).g;
            if(ganf0 != null) {
                ganf0.a = null;
            }
        }
        bundle0.putInt("nextExecutionId", this.al);
        bundle0.putInt("executionIdShouldCancelled", this.am);
        bundle0.putInt("resolvableIntentExecutionId", this.aq);
        ArrayList arrayList0 = new ArrayList();
        int v2 = bzt0.c();
        for(int v3 = 0; v3 < v2; ++v3) {
            gang gang0 = (gang)bzt0.e(v3);
            Bundle bundle1 = new Bundle();
            bundle1.putInt("executionId", gang0.a);
            gano gano0 = gang0.c;
            if(gano0 != null) {
                bundle1.putParcelable("request", gano0.a);
            }
            ganp ganp0 = gang0.b;
            if(ganp0 != null) {
                bundle1.putParcelable("response", ganp0.a);
            }
            switch(gang0.e) {
                case 3: {
                    bundle1.putInt("state", 3);
                    break;
                }
                case 4: {
                    ganp ganp1 = gang0.b;
                    if(ganp1 != null) {
                        bundle1.putParcelable("response", ganp1.a);
                    }
                    bundle1.putInt("state", gang0.e);
                    break;
                }
                default: {
                    bundle1.putInt("state", 1);
                }
            }
            arrayList0.add(bundle1);
        }
        bundle0.putInt("executionIdWaitingForExternalExecutionResult", this.b);
        bundle0.putParcelableArrayList("executions", arrayList0);
        gaxl.a();
        if(hzkv.c() && this.ah != null) {
            gaxl.a();
            if(!hzkp.c()) {
                try {
                    this.H().g("aefSavedStateKey", bundle0);
                    ArrayList arrayList1 = new ArrayList();
                    int v4 = bzt0.c();
                    for(int v5 = 0; v5 < v4; ++v5) {
                        gang gang1 = (gang)bzt0.e(v5);
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("request", gang1.c.a);
                        String s = gang1.c.g();
                        arrayList1.add(new gbfk(gang1.a, s, gang1.e, bundle2, null));
                    }
                    gbfq gbfq0 = this.G();
                    ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList1, 10));
                    for(Object object0: arrayList1) {
                        arrayList2.add(((gbfk)object0).a(gbfq0.a));
                    }
                    Map map0 = gbfq0.a();
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(arrayList2, 10)), 16));
                    for(Object object1: arrayList2) {
                        linkedHashMap0.put(((gbks)object1).b, object1);
                    }
                    map0.putAll(linkedHashMap0);
                    gbfq0.b(new gbfo(arrayList2, null));
                }
                catch(ExecutionException | InterruptedException exception0) {
                    gavr.f("BE_AEF_10", null, gavs.a, "Session Storage fails", exception0);
                }
                gaxl.a();
                if(hzkv.d()) {
                    bundle0.remove("nextExecutionId");
                    bundle0.remove("executionIdShouldCancelled");
                    bundle0.remove("resolvableIntentExecutionId");
                    bundle0.remove("executions");
                    bundle0.remove("executionIdWaitingForExternalExecutionResult");
                }
            }
        }
    }

    public final void K(ganp ganp0) {
        gavs.c(this.b != 0, "BE_AEF_02", null, "No pending execution to deliver results to");
        gang gang0 = (gang)bzu.a(this.ag, this.b);
        gavr.b(gang0, "BE_AEF_03", null, gavs.a, "Cannot return result without valid execution.");
        this.b = 0;
        gang0.b = ganp0;
        this.L();
    }

    final void L() {
        if(this.ak) {
            ArrayList arrayList0 = new ArrayList();
            bzt bzt0 = this.ag;
            int v = bzt0.c();
            for(int v2 = 0; v2 < v; ++v2) {
                gang gang0 = (gang)bzt0.e(v2);
                int v3 = gang0.e;
                if(v3 != 1) {
                    switch(v3) {
                        case 2: {
                            gaxl.a();
                            if(hzkv.e()) {
                                ganp ganp0 = gang0.d.b;
                                if(ganp0 != null) {
                                    if(this.Q(ganp0, gang0.a)) {
                                        this.P(gang0, ganp0);
                                    }
                                    else {
                                        gang0.b = ganp0;
                                        gang0.e = 4;
                                        ganv ganv0 = gang0.f;
                                        if(ganv0 != null) {
                                            arrayList0.add(ganv0);
                                        }
                                    }
                                }
                            }
                            else {
                                ganf ganf0 = gang0.g;
                                if(ganf0.d) {
                                    ganp ganp1 = ganf0.b;
                                    if(this.Q(ganp1, gang0.a)) {
                                        this.P(gang0, ganp1);
                                    }
                                    else {
                                        gang0.b = ganp1;
                                        gang0.e = 4;
                                        ganv ganv1 = gang0.f;
                                        if(ganv1 != null) {
                                            arrayList0.add(ganv1);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        case 3: {
                            if(this.b != gang0.a) {
                                gang0.e = 4;
                                ganv ganv2 = gang0.f;
                                if(ganv2 != null) {
                                    arrayList0.add(ganv2);
                                }
                            }
                        }
                    }
                }
                else if(gang0.f != null) {
                    if(!this.N(gang0.c)) {
                        gaxl.a();
                        if(hzkv.e()) {
                            gang0.d = new gank(this);
                            gamy gamy0 = this.ao;
                            gano gano0 = gang0.c;
                            ibuq.f(gano0, "actionRequest");
                            if(gamy0.a.b(gano0)) {
                                this.z(new ganh(gang0.c, this.ao, gang0.d));
                            }
                            else {
                                this.z(new gane(this.ar, gang0.c, gang0.a, gang0.d, this.aj));
                            }
                            gang0.e = 2;
                        }
                        else {
                            ganf ganf1 = new ganf();
                            ganf1.c = gang0.c;
                            ganf1.e = (long)gang0.c.a();
                            ganf1.f = this.ao;
                            ganf1.a = this;
                            gang0.g = ganf1;
                            gang0.e = 2;
                            this.A(gang0.g);
                        }
                    }
                    else if(this.b == 0) {
                        this.b = gang0.a;
                        gang0.e = 3;
                        this.M(gang0.c);
                    }
                }
            }
            gaxl.a();
            ganb ganb0 = new ganb(this);
            this.an.post(ganb0);
            int v4 = arrayList0.size();
            for(int v1 = 0; v1 < v4; ++v1) {
                ((ganv)arrayList0.get(v1)).g();
            }
        }
    }

    protected void M(gano gano0) {
        throw null;
    }

    protected boolean N(gano gano0) {
        throw null;
    }

    public final void O(gang gang0) {
        gang0.f = null;
        bzu.b(this.ag, gang0.a);
    }

    private final void P(gang gang0, ganp ganp0) {
        gavs.c(this.b == 0, "BE_AEF_08", null, "PendingExecution already in progress so unable to resolve intent.");
        Intent intent0 = (Intent)ganp0.a.getParcelableExtra("extraResolvableIntent");
        this.b = gang0.a;
        gavs.g(intent0, "BE_AEF_09", null);
        this.startActivityForResult(intent0, 1001);
    }

    private final boolean Q(ganp ganp0, int v) {
        return ganp0 != null && ganp0.b() == 5 && this.aq != v;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        switch(v) {
            case 1000: {
                this.K(garc.f(v1, intent0));
                return;
            }
            case 1001: {
                int v2 = this.b;
                this.aq = v2;
                if(v1 == -1) {
                    gang gang0 = (gang)bzu.a(this.ag, v2);
                    if(gang0 != null) {
                        gang0.e = 1;
                        this.L();
                    }
                }
                else {
                    this.K(garc.f(v1, intent0));
                }
            }
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        gani.c.remove(context0);
    }

    @Override  // du
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
        label_17:
            this.al = 1;
            this.am = -1;
            gaxl.a();
            if(hzkv.c() && this.ah != null && this.ai != null && this.aj) {
                Bundle bundle1 = this.H().a();
                if(bundle1 != null) {
                    this.al = bundle1.getInt("nextExecutionId");
                    this.b = bundle1.getInt("executionIdWaitingForExternalExecutionResult");
                    this.aq = bundle1.getInt("resolvableIntentExecutionId");
                }
                Collection collection0 = this.G().a().values();
                ArrayList arrayList1 = new ArrayList(ibpo.q(collection0, 10));
                for(Object object0: collection0) {
                    arrayList1.add(gbfm.a(((gbks)object0)));
                }
                for(Object object1: arrayList1) {
                    gang gang1 = new gang(((gbfk)object1));
                    this.ag.h(gang1.a, gang1);
                }
            }
        }
        else {
            gaxl.a();
            if(!hzkv.d()) {
                this.al = bundle0.getInt("nextExecutionId", -1);
                this.am = bundle0.getInt("executionIdShouldCancelled", -1);
                this.aq = bundle0.getInt("resolvableIntentExecutionId", 0);
                ArrayList arrayList0 = gcur.d(bundle0);
                int v1 = arrayList0.size();
                for(int v = 0; v < v1; ++v) {
                    gang gang0 = new gang(((Bundle)arrayList0.get(v)));
                    this.ag.h(gang0.a, gang0);
                }
                this.b = bundle0.getInt("executionIdWaitingForExternalExecutionResult");
                goto label_39;
            }
            goto label_17;
        }
    label_39:
        this.setRetainInstance(true);
        this.ao = this.B(this.requireContext().getApplicationContext());
        gaxl.a();
        if(hzkv.e()) {
            gaoc gaoc0 = this.y();
            this.ap = gaoc0;
            bbic bbic0 = bbic.a();
            Intent intent0 = new Intent("com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService").setClassName("com.google.android.gms", "com.google.android.gms.wallet.service.PaymentService");
            bbic0.e(gaoc0.c.a, "ActionPaymentsServiceConnectionBinder", intent0, gaoc0.b, 1);
            this.ar = this.C(this.ap);
        }
    }

    @Override  // du
    public void onDestroy() {
        super.onDestroy();
        gaxl.a();
        if(hzkv.e()) {
            gaob gaob0 = this.ap.b;
            Context context0 = this.ap.c.a;
            bbic.a().c(context0, gaob0);
        }
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        gaxl.a();
        if(hzkv.c()) {
            this.J(new Bundle());
        }
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.ak = true;
        bzt bzt0 = this.ag;
        int v = bzt0.c();
        for(int v2 = 0; v2 < v; ++v2) {
            gang gang0 = (gang)bzt0.e(v2);
            gaxl.a();
            if(hzkv.e() && gang0.d == null) {
                gang0.d = new gank(this);
            }
            else {
                ganf ganf0 = gang0.g;
                if(ganf0 != null) {
                    ganf0.a = this;
                }
            }
        }
        ArrayList arrayList0 = this.d;
        int v3 = arrayList0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((Runnable)arrayList0.get(v1)).run();
        }
        arrayList0.clear();
        this.L();
    }

    @Override  // du
    public void onSaveInstanceState(Bundle bundle0) {
        this.J(bundle0);
    }

    protected abstract gaoc y();

    protected abstract void z(Runnable arg1);
}

