import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class czvk {
    public final List a;
    public final Map b;
    public final List c;
    public final Map d;
    public final Map e;
    public final ScheduledExecutorService f;
    public final AtomicBoolean g;
    private final czvd h;
    private final Map i;
    private final Map j;

    public czvk() {
        czvd czvd0 = new czvd();
        ScheduledExecutorService scheduledExecutorService0 = cuui.f();
        super();
        this.a = new ArrayList();
        this.b = new bxd();
        this.c = new ArrayList();
        this.d = new bxd();
        this.e = new bxd();
        this.i = new bxd();
        this.j = new bxd();
        this.g = new AtomicBoolean(false);
        this.h = czvd0;
        this.f = scheduledExecutorService0;
    }

    public final czvj a(czvg czvg0) {
        czvj czvj1;
        czvj czvj0;
        Iterator iterator0;
        while(!this.g.get()) {
            synchronized(this) {
                iterator0 = this.c().iterator();
            label_3:
                if(iterator0.hasNext()) {
                    goto label_78;
                }
                for(Object object0: this.c()) {
                    czvg czvg1 = (czvg)object0;
                    if(this.h.a(czvg0, czvg1)) {
                        this.j(czvg0, czvg1);
                        czkq.a.d().j("%s Incoming operation %s was registered as DEFERRED by %s", "[MMD_V3]:", czvg0.k(), czvg1.k());
                    }
                }
                if(!this.e.containsKey(czvg0)) {
                    long v = Thread.currentThread().getId();
                    Map map0 = this.b;
                    for(Object object1: map0.entrySet()) {
                        if(((long)(((Long)((Map.Entry)object1).getValue()))) == v) {
                            throw new IllegalStateException(String.format("Error! MediumOperations cannot be registered in the start() method of another MediumOperation. Registering MediumOperation %s was attempted in same thread id %d", czvg0, v));
                        }
                    }
                    for(Object object2: this.c()) {
                        czvg czvg2 = (czvg)object2;
                        if(!czvd.d(((czvc)this.h.a.get(czvg0.n)).c, czvg2.n)) {
                            continue;
                        }
                        List list0 = (List)this.i.get(czvg2);
                        if(list0 == null) {
                            continue;
                        }
                        list0.add(czvg0);
                        czkq.a.d().j("%s Incoming operation %s is about to WAIT ON %s", "[MMD_V3]:", czvg0.k(), czvg2.k());
                        goto label_40;
                    }
                    Iterator iterator4 = map0.keySet().iterator();
                    while(true) {
                        if(!iterator4.hasNext()) {
                            goto label_68;
                        }
                        Object object3 = iterator4.next();
                        czvg czvg3 = (czvg)object3;
                        if(!this.h.c(czvg3, czvg0) && !this.h.a(czvg3, czvg0) && !this.h.b(czvg3, czvg0)) {
                            continue;
                        }
                        List list1 = (List)this.j.get(czvg3);
                        if(list1 == null) {
                            continue;
                        }
                        list1.add(czvg0);
                        czkq.a.d().j("%s Incoming operation %s is about to WAIT ON %s because inverter checking.", "[MMD_V3]:", czvg0.k(), czvg3.k());
                        goto label_40;
                    }
                }
                this.i(czvg0);
                return czvj.d;
            }
        label_40:
            synchronized(czvg0) {
                try {
                    czvg0.wait();
                    czkq.a.d().i("%s Waiting incoming operation %s has been signalled.", "[MMD_V3]:", czvg0.k());
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    synchronized(this) {
                        for(Object object4: this.i.values()) {
                            ((List)object4).remove(czvg0);
                        }
                        for(Object object5: this.j.values()) {
                            ((List)object5).remove(czvg0);
                        }
                    }
                    return czvj.c;
                }
            }
            continue;
        label_68:
            this.a.add(czvg0);
            this.i(czvg0);
            ArrayList arrayList0 = new ArrayList();
            this.j.put(czvg0, arrayList0);
            czkq.a.d().i("%s Operation %s has passed all it\'s pre-start checks and is ready to run.", "[MMD_V3]:", czvg0.k());
            break;
        label_78:
            Object object6 = iterator0.next();
            czvg czvg4 = (czvg)object6;
            if(!this.h.b(czvg0, czvg4)) {
                goto label_3;
            }
            czkq.a.d().j("%s Incoming operation %s was DENIED by %s", "[MMD_V3]:", czvg0.k(), czvg4.k());
            return czvj.c;
        }
        if(this.g.get()) {
            czkq.a.d().i("%s Operation %s failed to register because the manager has been shutdown.", "[MMD_V3]:", czvg0.k());
            return czvj.c;
        }
        synchronized(this) {
            for(Object object7: this.e.keySet()) {
                this.n(((czvg)object7), czvg0);
            }
            List list2 = this.h(this.c, czvg0);
            this.c.removeAll(list2);
            for(Object object8: this.h(this.d.keySet(), czvg0)) {
                this.k(((czvg)object8));
            }
            this.a.remove(czvg0);
            this.b.put(czvg0, Long.valueOf(Thread.currentThread().getId()));
        }
        try {
            if(!this.o(czvg0, 0)) {
                synchronized(this) {
                    this.l(czvg0, String.format("Failure to start operation %s in parallel", czvg0.k()), false);
                    czvj0 = czvj.c;
                }
                goto label_119;
            }
            goto label_128;
        }
        catch(Throwable throwable2) {
            goto label_132;
        }
    label_119:
        synchronized(this) {
            this.b.remove(czvg0);
            czvk.m(this.g(czvg0), czvg0.k());
        }
        return czvj0;
        try {
        label_128:
            czkq.a.d().i("%s Operation %s success to register in parallel", "[MMD_V3]:", czvg0.k());
            czvj1 = czvj.b;
        }
        catch(Throwable throwable2) {
        label_132:
            synchronized(this) {
                this.b.remove(czvg0);
                czvk.m(this.g(czvg0), czvg0.k());
            }
            throw throwable2;
        }
        synchronized(this) {
            this.b.remove(czvg0);
            czvk.m(this.g(czvg0), czvg0.k());
        }
        return czvj1;
    }

    public static String b(Collection collection0) {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        boolean z = false;
        for(Object object0: collection0) {
            if(z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((czvg)object0).k());
            z = true;
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public final List c() {
        List list0 = new ArrayList();
        list0.addAll(this.a);
        list0.addAll(this.b.keySet());
        list0.addAll(this.c);
        list0.addAll(this.d.keySet());
        list0.addAll(this.e.keySet());
        return list0;
    }

    // Detected as a lambda impl.
    public final void d(czvg czvg0) {
        synchronized(this) {
            czvi czvi0 = (czvi)this.d.remove(czvg0);
            int v1 = czvi0 == null ? 0 : czvi0.a;
            czkq.a.d().j("%s About to start retry attempt %d for operation %s.", "[MMD_V3]:", Integer.valueOf(v1), czvg0.k());
            this.o(czvg0, v1);
        }
    }

    public final void e(czvg czvg0) {
        synchronized(this) {
            if(czvg0 == null) {
                czkq.a.e().h("%s Null operation cannot be unregistered.", "[MMD_V3]:");
                return;
            }
            if(this.c.remove(czvg0) || this.e.remove(czvg0) != null) {
                czvg0.m(3);
            }
            else if(this.d.containsKey(czvg0)) {
                this.k(czvg0);
                czvg0.m(3);
            }
            else if(!this.a.remove(czvg0) && this.b.remove(czvg0) == null) {
                czkq.a.e().i("%s Can\'t stop %s because it was never registered successfully.", "[MMD_V3]:", czvg0.k());
            }
            else {
                czkq.a.e().i("%s Can\'t stop %s but calling stop to notify the operation.", "[MMD_V3]:", czvg0.k());
                czvg0.m(3);
            }
            this.l(czvg0, String.format("Unregistering operation %s", czvg0.k()), false);
            czkq.a.d().i("%s Operation %s has been unregistered.", "[MMD_V3]:", czvg0.k());
        }
    }

    public static boolean f(czvj czvj0) {
        switch(czvj0.ordinal()) {
            case 0: 
            case 2: {
                return false;
            }
            case 1: 
            case 3: {
                return true;
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
    }

    private final List g(czvg czvg0) {
        List list0 = (List)this.j.remove(czvg0);
        return list0 == null ? new ArrayList() : list0;
    }

    private final List h(Collection collection0, czvg czvg0) {
        List list0 = new ArrayList();
        for(Object object0: collection0) {
            czvg czvg1 = (czvg)object0;
            if(this.n(czvg1, czvg0)) {
                czvg1.m(2);
                list0.add(czvg1);
            }
        }
        return list0;
    }

    private final void i(czvg czvg0) {
        ArrayList arrayList0 = new ArrayList();
        this.i.put(czvg0, arrayList0);
    }

    private final void j(czvg czvg0, czvg czvg1) {
        Map map0 = this.e;
        if(!map0.containsKey(czvg0)) {
            map0.put(czvg0, new ArrayList());
        }
        ((List)map0.get(czvg0)).add(czvg1);
    }

    private final void k(czvg czvg0) {
        czvi czvi0 = (czvi)this.d.remove(czvg0);
        if(czvi0 != null) {
            czvi0.b.b();
        }
    }

    private final void l(czvg czvg0, String s, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        Map map0 = this.e;
        for(Object object0: map0.keySet()) {
            czvg czvg1 = (czvg)object0;
            List list0 = (List)map0.get(czvg1);
            if(!z) {
            }
            else if(this.h.c(czvg1, czvg0)) {
                continue;
            }
            list0.remove(czvg0);
            if(list0.isEmpty()) {
                arrayList0.add(czvg1);
            }
        }
        for(Object object1: arrayList0) {
            map0.remove(((czvg)object1));
            czkq.a.d().j("%s %s has unblocked paused operation %s.", "[MMD_V3]:", s, ((czvg)object1).k());
            this.o(((czvg)object1), 0);
        }
        List list1 = (List)this.i.remove(czvg0);
        if(list1 == null) {
            list1 = new ArrayList();
        }
        czvk.m(list1, czvg0.k());
        czvk.m(this.g(czvg0), czvg0.k());
    }

    private static void m(List list0, String s) {
        for(Object object0: list0) {
            synchronized(((czvg)object0)) {
                czkq.a.d().j("%s Unregistered operation %s is signalling its completion to waiting operation %s.", "[MMD_V3]:", s, ((czvg)object0).k());
                ((czvg)object0).notify();
            }
        }
    }

    private final boolean n(czvg czvg0, czvg czvg1) {
        if(this.h.c(czvg0, czvg1)) {
            this.j(czvg0, czvg1);
            czkq.a.d().j("%s Incoming operation %s has PAUSED registered operation %s.", "[MMD_V3]:", czvg1.k(), czvg0.k());
            return true;
        }
        return false;
    }

    private final boolean o(czvg czvg0, int v) {
        if(this.g.get()) {
            czkq.a.e().j("%s Operation %s failed to start on retry attempt %d because the manager has been shutdown.", "[MMD_V3]:", czvg0.k(), Integer.valueOf(v));
            return false;
        }
        String s = czvg0.k();
        czvf czvf0 = czvg0.j();
        synchronized(this) {
            switch(czvf0.ordinal()) {
                case 1: {
                    break;
                }
                case 0: 
                case 2: {
                    czkq.a.d().j("%s Operation %s failed to start on retry attempt %d.", "[MMD_V3]:", czvg0.k(), Integer.valueOf(v));
                    return false;
                }
                case 3: {
                    czvh czvh0 = () -> synchronized(this) {
                        czvi czvi0 = (czvi)this.d.remove(czvg0);
                        int v1 = czvi0 == null ? 0 : czvi0.a;
                        czkq.a.d().j("%s About to start retry attempt %d for operation %s.", "[MMD_V3]:", Integer.valueOf(v1), czvg0.k());
                        this.o(czvg0, v1);
                    };
                    long v2 = (long)Math.min(((double)hvog.a.bk().bI()) * Math.pow(hvog.a.bk().b(), v), hvog.a.bk().bH());
                    czvi czvi0 = new czvi(v + 1, cumn.d(czkq.a, czvh0, v2, this.f));
                    this.d.put(czvg0, czvi0);
                    czkq.a.d().j("%s Operation %s failed to start but was added to the needsRetry list for retry attempt %s.", "[MMD_V3]:", czvg0.k(), Integer.valueOf(v + 1));
                    return true;
                }
                case 4: {
                    czkq.a.d().j("%s Operation %s has changed from type %s", "[MMD_V3]:", czvg0.k(), s);
                    this.l(czvg0, String.format("Completion of Phase 1 (%s) of operation %s", s, czvg0.k()), true);
                    this.i(czvg0);
                    break;
                }
                default: {
                    throw new AssertionError(String.format("%s Unknown start state %s for operation %s on retry attempt %d", "[MMD_V3]:", czvf0, czvg0.k(), v));
                }
            }
            this.c.add(czvg0);
            czkq.a.d().i("%s Operation %s was successfully started and added to the running list.", "[MMD_V3]:", czvg0.k());
        }
        return true;
    }
}

