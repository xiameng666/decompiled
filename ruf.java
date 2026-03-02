import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.UserHandle;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Supplier;

public final class ruf implements AutoCloseable, sag {
    public final ConcurrentHashMap a;
    private final ibnn b;
    private final sel c;

    public ruf(Supplier supplier0, sel sel0) {
        this.c = sel0;
        this.b = new ibnz(new rtw(supplier0));
        this.a = new ConcurrentHashMap();
    }

    @Override  // sag
    public final Object b(ryh ryh0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        rxn rxn0 = this.d(ryh0);
        sct.c("DefaultCrossProcessTaskManager", "startTask#token " + rqy.a(ryh0) + " prepared service: " + rxn0);
        Object object0 = rxn0.a(ryh0, new rtv(ryh0), false, new rue(ryh0, persistableBundle0, null), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override
    public final void close() {
        ConcurrentHashMap concurrentHashMap0 = this.a;
        synchronized(concurrentHashMap0) {
            Collection collection0 = concurrentHashMap0.values();
            ibuq.e(collection0, "<get-values>(...)");
            concurrentHashMap0.clear();
            for(Object object0: collection0) {
                ibuq.e(object0, "next(...)");
                ((rxn)object0).close();
            }
        }
    }

    private final rxn d(ryh ryh0) {
        rxn rxn1;
        rxn rxn0;
        Object object0 = ryh0.a.get();
        ibuq.e(object0, "get(...)");
        Intent intent0 = (Intent)object0;
        ConcurrentHashMap concurrentHashMap0 = this.a;
        ron ron0 = ryh0.o();
        synchronized(concurrentHashMap0) {
            rxn0 = (rxn)concurrentHashMap0.get(ron0);
            if(rxn0 == null) {
                boolean z = false;
                sct.c("DefaultCrossProcessTaskManager", "prepareService#Existing service is null for " + ron0);
                rud rud0 = new rud(this, ron0);
                Object object1 = this.b.a();
                ibuq.e(object1, "getValue(...)");
                int v = ryh0.d;
                ibuq.f(((Context)object1), "context");
                ibuq.f(intent0, "intent");
                ibuq.f(ryh0, "targetComponent");
                Context context0 = ((Context)object1).getApplicationContext();
                ibuq.c(context0);
                roe roe0 = ryh0.fi();
                rxn1 = new rxn(context0, rud0, this.c, roe0);
                if(v == Process.myUserHandle().getIdentifier()) {
                    try {
                        sct.c("DefaultCrossProcessTaskManager", "Binding service: " + intent0);
                        z = context0.bindService(intent0, rxn1, 1);
                    }
                    catch(Exception exception1) {
                        Objects.toString(intent0);
                        sct.f("DefaultCrossProcessTaskManager", "Failed to bind service: " + intent0, exception1);
                    }
                }
                else {
                    try {
                        sct.d("DefaultCrossProcessTaskManager", "Binding cross-user: " + intent0 + " from user " + Process.myUserHandle().getIdentifier() + " to user " + v);
                        z = context0.bindServiceAsUser(intent0, rxn1, 1, UserHandle.of(v));
                    }
                    catch(Exception exception0) {
                        sct.f("DefaultCrossProcessTaskManager", "Failed to bind cross-user: " + intent0 + " from user " + Process.myUserHandle().getIdentifier() + " to user " + v, exception0);
                    }
                }
                if(!z) {
                    Objects.toString(intent0);
                    sct.a("DefaultCrossProcessTaskManager", "Failed to bind service: " + intent0);
                    scp.a(rxn1, context0);
                    throw new sar(rqz.f(rom.f(ryh0, "UNKNOWN"), -1L), new IllegalStateException("Failed to bind to the task service."), null);
                }
                Objects.toString(intent0);
                sct.d("DefaultCrossProcessTaskManager", "Bound service: " + intent0);
                sct.c("DefaultCrossProcessTaskManager", a.m(ron0, rxn1, "Adding service ", " to serviceRegistry. ComponentRef="));
                this.a.put(ron0, rxn1);
                return rxn1;
            }
            sct.c("DefaultCrossProcessTaskManager", a.m(ron0, rxn0, "prepareService#Returning existing service ", " for "));
            return rxn0;
        }
        return rxn1;
    }

    @Override  // sag
    public final Object ff(ryh ryh0, ibrl ibrl0) {
        rtx rtx0;
        if((ibrl0 instanceof rtx)) {
            rtx0 = (rtx)ibrl0;
            int v = rtx0.c;
            if((v & 0x80000000) == 0) {
                rtx0 = new rtx(this, ibrl0);
            }
            else {
                rtx0.c = v - 0x80000000;
            }
        }
        else {
            rtx0 = new rtx(this, ibrl0);
        }
        Object object0 = rtx0.a;
        Object object1 = ibrx.a;
        switch(rtx0.c) {
            case 0: {
                ibnx.b(object0);
                rxn rxn0 = this.d(ryh0);
                rtu rtu0 = new rtu(ryh0);
                rty rty0 = new rty(ryh0, null);
                rtx0.c = 1;
                object0 = rxn.b(rxn0, ryh0, rtu0, rty0, rtx0);
                return object0 == object1 ? object1 : ((rxp)object0);
            }
            case 1: {
                ibnx.b(object0);
                return (rxp)object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // sag
    public final icig fg(ryh ryh0) {
        ibuq.f(ryh0, "token");
        return new icht(new ruc(this.d(ryh0), ryh0, null));
    }
}

