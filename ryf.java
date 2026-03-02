import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;

public final class ryf implements AutoCloseable {
    public final rmz a;
    public final icck b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final sel e;
    private final ConcurrentHashMap f;
    private final ConcurrentHashMap g;
    private final ConcurrentHashMap h;
    private ibnn i;
    private final ConcurrentLinkedQueue j;

    public ryf(sel sel0, rmz rmz0, icck icck0) {
        ibuq.f(sel0, "onboardingChanges");
        super();
        this.e = sel0;
        this.a = rmz0;
        this.b = icck0;
        this.c = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap(ibpt.a);
        this.h = new ConcurrentHashMap(ibpt.a);
        this.i = this.n();
        this.j = new ConcurrentLinkedQueue();
    }

    public final rnv a(rrc rrc0) {
        ibuq.f(rrc0, "token");
        rra rra0 = rrc0.fk();
        rnv rnv0 = (rnv)this.f.get(rra0);
        return rnv0 == null ? new rnv() : rnv0;
    }

    public final rve b(rrc rrc0) {
        ibuq.f(rrc0, "token");
        rra rra0 = rrc0.fk();
        return (rve)this.g.get(rra0);
    }

    public final rxv c(ryv ryv0) {
        ibuq.f(ryv0, "token");
        ibuq.f(ryv0, "token");
        rra rra0 = ryv0.fk();
        icnl icnl0 = (icnl)this.c.get(rra0);
        rxv rxv0 = null;
        if(icnl0 != null) {
            rxv rxv1 = (rxv)icnl0.b();
            if(rxv1 != null) {
                rxv0 = rxv1;
            }
        }
        if(rxv0 == null) {
            sct.e("TaskStateManager", "[" + System.identityHashCode(this) + "] No state present for " + ryv0);
            return rxr.b(ryv0, new rnr("Task cannot be found."));
        }
        return rxv0;
    }

    @Override
    public final void close() {
        this.c.clear();
        ConcurrentHashMap concurrentHashMap0 = this.d;
        for(Object object0: concurrentHashMap0.entrySet()) {
            ichp.a(((icgv)((Map.Entry)object0).getValue()));
        }
        concurrentHashMap0.clear();
        this.g.clear();
        this.h.clear();
        this.i = this.n();
        this.j.clear();
    }

    public final Object d(ibrl ibrl0) {
        rxz rxz0;
        if((ibrl0 instanceof rxz)) {
            rxz0 = (rxz)ibrl0;
            int v = rxz0.c;
            if((v & 0x80000000) == 0) {
                rxz0 = new rxz(this, ibrl0);
            }
            else {
                rxz0.c = v - 0x80000000;
            }
        }
        else {
            rxz0 = new rxz(this, ibrl0);
        }
        Object object0 = rxz0.a;
        Object object1 = ibrx.a;
        switch(rxz0.c) {
            case 0: {
                ibnx.b(object0);
                if(!this.e.b(0x18CE5D55L)) {
                    return ibom.a;
                }
                Objects.toString(this.j);
                sct.c("TaskStateManager", "Attempting to flush: " + this.j);
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            ConcurrentLinkedQueue concurrentLinkedQueue0 = this.j;
            if(concurrentLinkedQueue0.isEmpty()) {
                break;
            }
            iccs iccs0 = (iccs)concurrentLinkedQueue0.poll();
            if(iccs0 != null) {
                if(iccs0.y()) {
                    Objects.toString(iccs0);
                    sct.c("TaskStateManager", "Flushing disk write: " + iccs0.toString());
                    rxz0.c = 1;
                    if(iccs0.n(rxz0) != object1) {
                        continue;
                    }
                    return object1;
                }
                Objects.toString(iccs0);
                sct.c("TaskStateManager", "Not flushing inactive disk write: " + iccs0.toString());
            }
        }
        return ibom.a;
    }

    public final Object e(ibrl ibrl0) {
        Object object3;
        ryb ryb0;
        if((ibrl0 instanceof ryb)) {
            ryb0 = (ryb)ibrl0;
            int v = ryb0.d;
            if((v & 0x80000000) == 0) {
                ryb0 = new ryb(this, ibrl0);
            }
            else {
                ryb0.d = v - 0x80000000;
            }
        }
        else {
            ryb0 = new ryb(this, ibrl0);
        }
        Object object0 = ryb0.b;
        Object object1 = ibrx.a;
        switch(ryb0.d) {
            case 0: {
                ibnx.b(object0);
                if(!this.e.b(0x18CE5D55L)) {
                    return ibom.a;
                }
                ryb0.d = 1;
                if(this.f(ryb0) != object1) {
                    goto label_20;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_20:
                sct.c("TaskStateManager", "Persisting task states");
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(this.c.size()));
                for(Object object2: this.c.entrySet()) {
                    linkedHashMap0.put(((Map.Entry)object2).getKey(), ((rxv)((icnl)((Map.Entry)object2).getValue()).b()));
                }
                Map map0 = ibpz.q(linkedHashMap0);
                ryb0.a = map0;
                ryb0.d = 2;
                if(this.a.e("task_states", map0, sds.a, ryb0) != object1) {
                    object3 = map0;
                    break;
                }
                return object1;
            }
            case 2: {
                object3 = ryb0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Objects.toString(object3);
        sct.c("TaskStateManager", "Persisted task states: " + object3);
        return ibom.a;
    }

    public final Object f(ibrl ibrl0) {
        if(this.e.b(0x18CE5D55L)) {
            Object object0 = ((iccs)this.i.a()).n(ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    public final iced g(rrc rrc0) {
        ibuq.f(rrc0, "token");
        rra rra0 = rrc0.fk();
        return (iced)this.h.get(rra0);
    }

    public final void h(rrc rrc0, iced iced0) {
        ibuq.f(rrc0, "token");
        rra rra0 = rrc0.fk();
        this.h.put(rra0, iced0);
    }

    public final void i(rrc rrc0, rve rve0) {
        ibuq.f(rrc0, "token");
        ibuq.f(rve0, "task");
        rra rra0 = rrc0.fk();
        this.g.put(rra0, rve0);
    }

    public final void j(rrc rrc0) {
        ibuq.f(rrc0, "token");
        rrb rrb0 = new rrb(rrc0);
        icgv icgv0 = (icgv)this.d.remove(rrb0);
        if(icgv0 != null) {
            ichp.a(icgv0);
        }
    }

    public final void k(rrc rrc0) {
        ibuq.f(rrc0, "token");
        rra rra0 = rrc0.fk();
        icgv icgv0 = icgx.a(0x7FFFFFFF, 0, new rxx(rrc0), 2);
        icgv0.d(new rxy(rrc0));
        this.d.put(rra0, icgv0);
    }

    public final void l(ryv ryv0, rxv rxv0) {
        ibuq.f(ryv0, "token");
        ibuq.f(rxv0, "state");
        sct.c("TaskStateManager", "[" + System.identityHashCode(this) + "] Writing state " + rxv0 + " for " + ryv0);
        ConcurrentHashMap concurrentHashMap0 = this.c;
        rra rra0 = ryv0.fk();
        Object object0 = concurrentHashMap0.get(rra0);
        if(object0 == null) {
            object0 = icnm.a(rxv0);
            Object object1 = concurrentHashMap0.putIfAbsent(rra0, object0);
            if(object1 != null) {
                object0 = object1;
            }
        }
        ((icnl)object0).g(rxv0);
        if(this.e.b(0x18CE5D55L)) {
            rye rye0 = new rye(this, null);
            iccs iccs0 = icbb.a(this.b, null, null, rye0, 3);
            this.j.add(iccs0);
        }
    }

    public final void m(rrc rrc0, rnv rnv0) {
        rra rra0 = rrc0.fk();
        this.f.put(rra0, rnv0);
    }

    private final ibnn n() {
        return new ibnz(new rxw(this));
    }
}

