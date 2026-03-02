import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

public final class rxn implements ServiceConnection, AutoCloseable {
    private final rof a;
    private final WeakReference b;
    private final rud c;
    private final sel d;
    private final icnl e;

    public rxn(Context context0, rud rud0, sel sel0, rof rof0) {
        this.c = rud0;
        this.d = sel0;
        this.a = rof0;
        this.b = new WeakReference(context0.getApplicationContext());
        this.e = icnm.a(null);
    }

    public final Object a(rrc rrc0, ibts ibts0, boolean z, ibtw ibtw0, ibrl ibrl0) {
        Object object1;
        Object object0;
        rxm rxm0;
        if((ibrl0 instanceof rxm)) {
            rxm0 = (rxm)ibrl0;
            int v = rxm0.f;
            if((v & 0x80000000) == 0) {
                rxm0 = new rxm(this, ibrl0);
            }
            else {
                rxm0.f = v - 0x80000000;
            }
        }
        else {
            rxm0 = new rxm(this, ibrl0);
        }
        try {
            object0 = rxm0.d;
            object1 = ibrx.a;
            switch(rxm0.f) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_23;
                }
                case 2: {
                    goto label_36;
                }
            }
        }
        catch(DeadObjectException deadObjectException0) {
            goto label_42;
        }
        catch(sbw sbw0) {
            goto label_48;
        }
        catch(Throwable throwable0) {
            goto label_51;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            icls icls0 = new icls(this.e);
            rxm0.g = (ryh)rrc0;
            rxm0.a = ibts0;
            rxm0.b = ibtw0;
            rxm0.c = z;
            rxm0.f = 1;
            object0 = icll.a(icls0, rxm0);
            if(object0 == object1) {
                return object1;
            }
            goto label_28;
        label_23:
            z = rxm0.c;
            ibtw0 = rxm0.b;
            ibts0 = rxm0.a;
            rrc0 = rxm0.g;
            ibnx.b(object0);
        label_28:
            rxm0.g = (ryh)rrc0;
            rxm0.a = ibts0;
            rxm0.b = null;
            rxm0.c = z;
            rxm0.f = 2;
            object0 = ibtw0.a(((sah)object0), rxm0);
            if(object0 == object1) {
                return object1;
            }
            goto label_54;
        }
        catch(DeadObjectException deadObjectException0) {
            goto label_42;
        }
        catch(sbw sbw0) {
            goto label_48;
        }
        catch(Throwable throwable0) {
            goto label_51;
        }
        return object1;
        try {
            try {
            label_36:
                z = rxm0.c;
                ibts0 = rxm0.a;
                rrc0 = rxm0.g;
                ibnx.b(object0);
            }
            catch(DeadObjectException deadObjectException0) {
            label_42:
                sct.f("DefaultCrossProcessTaskManager", "Task service died!", deadObjectException0);
                this.close();
                sar sar0 = new sar(rrc0, deadObjectException0, "Task execution failed because the task service died.");
                ibts0.a(sar0);
                throw sar0;
            }
            catch(sbw sbw0) {
            label_48:
                ibts0.a(sbw0);
                throw sbw0;
            }
        }
        catch(Throwable throwable0) {
        label_51:
            if(z && (this.d.b(0x1983DBBFL) && this.d.a(((roe)this.a).a, 0x1983DBBFL))) {
                this.close();
            }
            throw throwable0;
        }
    label_54:
        if(z && (this.d.b(0x1983DBBFL) && this.d.a(((roe)this.a).a, 0x1983DBBFL))) {
            this.close();
        }
        return object0;
    }

    public static Object b(rxn rxn0, rrc rrc0, ibts ibts0, ibtw ibtw0, ibrl ibrl0) {
        return rxn0.a(rrc0, ibts0, true, ibtw0, ibrl0);
    }

    @Override
    public final void close() {
        sct.d("DefaultCrossProcessTaskManager", "Closing service connection: " + this.toString());
        Context context0 = (Context)this.b.get();
        if(context0 != null) {
            scp.a(this, context0);
        }
        this.e.g(null);
        this.c.a.a.remove(this.c.b);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        Object object0;
        saq saq0;
        int v;
        ruq ruq0;
        ibuq.f(iBinder0, "service");
        sct.d("DefaultCrossProcessTaskManager", a.m(this, componentName0, "Service connected: ", " instance="));
        sel sel0 = this.d;
        if(sel0.b(0x198D389DL)) {
            rof rof0 = this.a;
            if(sel0.a(((roe)rof0).a, 0x199A39C6L)) {
                ibuq.f(iBinder0, "binder");
                if(iBinder0 == null) {
                    ruq0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.onboarding.tasks.IOnboardingTaskManagerService");
                    ruq0 = (iInterface0 instanceof ruq) ? ((ruq)iInterface0) : new ruo(iBinder0);
                }
                try {
                    v = ruq0.a();
                }
                catch(RemoteException remoteException0) {
                    sct.f("OnboardingTaskServiceClient", "Failed to check server version - assuming version 0.", remoteException0);
                    v = 0;
                }
                sct.c("OnboardingTaskServiceClient", a.f(v, "Server version ", "."));
                if(v == 0) {
                    sct.c("OnboardingTaskServiceClientCompat", "Client initialised for " + roc.b(rof0) + ".");
                    ibuq.c(ruq0);
                    saq0 = new saq(rof0, sel0, ruq0);
                }
                else {
                    sct.c("OnboardingTaskServiceClient", "Client initialised for " + roc.b(rof0) + ".");
                    ibuq.c(ruq0);
                    saq0 = new sbe(rof0, ruq0);
                }
            }
            else {
                goto label_30;
            }
        }
        else {
        label_30:
            rof rof1 = this.a;
            ibuq.f(iBinder0, "binder");
            sct.c("OnboardingTaskServiceClientCompat", "Client initialised for " + roc.b(rof1) + ".");
            if(iBinder0 == null) {
                object0 = null;
            }
            else {
                IInterface iInterface1 = iBinder0.queryLocalInterface("com.android.onboarding.tasks.IOnboardingTaskManagerService");
                object0 = (iInterface1 instanceof ruq) ? ((ruq)iInterface1) : new ruo(iBinder0);
            }
            ibuq.e(object0, "asInterface(...)");
            saq0 = new saq(rof1, sel0, ((ruq)object0));
        }
        this.e.h(null, saq0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        sct.d("DefaultCrossProcessTaskManager", a.m(this, componentName0, "Service disconnected: ", " instance="));
        this.e.g(null);
        this.c.a.a.remove(this.c.b);
    }
}

