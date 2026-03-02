import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;

@ibnh
public final class bpcx {
    public final bpkq a;
    public final Object b;
    public final List c;
    public int d;

    public bpcx(bpkq bpkq0) {
        bboh.b("RecentSightingsColl", bbcu.eD);
        this.b = new Object();
        this.a = bpkq0;
        this.c = new ArrayList();
        this.d = 0;
    }

    public final void a(long v, gfsx gfsx0, boolean z) {
        synchronized(this.b) {
            long v2 = v - hsxv.s();
            ListIterator listIterator0 = this.c.listIterator();
            while(listIterator0.hasNext()) {
                bpcw bpcw0 = (bpcw)listIterator0.next();
                if(bpcw0.a >= v2 || ((long)(((Long)gfsx0.f(Long.valueOf(0x7FFFFFFFFFFFFFFFL))))) <= bpcw0.a) {
                    break;
                }
                listIterator0.remove();
                this.d -= bpcw0.b.size();
                this.d(bpcw0.b, z);
            }
        }
    }

    public final void b(bpko bpko0, long v, gfsx gfsx0, boolean z) {
        bpcw bpcw0;
        Object object0 = this.b;
        synchronized(object0) {
            this.a(v, gfsx0, z);
            __monitor_enter(object0);
        }
        try {
            ListIterator listIterator0 = this.c.listIterator(this.c.size());
            while(listIterator0.hasPrevious()) {
                bpcw0 = (bpcw)listIterator0.previous();
                int v1 = Long.compare(bpcw0.a, v);
                if(v1 == 0) {
                    goto label_17;
                }
                if(v1 < 0) {
                    listIterator0.next();
                    break;
                }
            }
            bpcw0 = new bpcw(v);
            listIterator0.add(bpcw0);
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
    label_17:
        __monitor_exit(object0);
        try {
            gftb.checkTrue(Long.compare(bpko0.f, v) == 0);
            if(bpcw0.b.add(bpko0)) {
                ++this.d;
                if(bpko0.d()) {
                    hadw hadw0 = bpkq.b(bpko0.e, z);
                    this.a.c(hadx.j, bpko0, hadw0);
                }
            }
            else if(!bpko0.d()) {
                hadw hadw1 = bpkq.b(bpko0.e, z);
                this.a.c(hadx.q, bpko0, hadw1);
            }
            synchronized(this.b) {
                int v4 = this.d - ((int)hsxv.t());
                if(v4 > 0) {
                    ListIterator listIterator1 = this.c.listIterator();
                label_35:
                    while(v4 > 0) {
                        gftb.q(listIterator1.hasNext());
                        SortedSet sortedSet0 = ((bpcw)listIterator1.next()).b;
                        if(sortedSet0.size() <= v4) {
                            listIterator1.remove();
                            v4 -= sortedSet0.size();
                            this.d(sortedSet0, z);
                        }
                        else {
                            Iterator iterator0 = sortedSet0.iterator();
                            for(int v2 = 0; true; ++v2) {
                                if(v2 >= v4) {
                                    break label_35;
                                }
                                Object object2 = iterator0.next();
                                this.c(((bpko)object2), z);
                                iterator0.remove();
                            }
                        }
                    }
                    this.d = (int)hsxv.t();
                }
            }
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
    }

    private final void c(bpko bpko0, boolean z) {
        hadw hadw0 = bpkq.b(bpko0.e, z);
        this.a.c((bpko0.d() ? hadx.d : hadx.c), bpko0, hadw0);
    }

    private final void d(Iterable iterable0, boolean z) {
        if(hsxo.h() && ccze.b(cijq.v())) {
            for(Object object0: iterable0) {
                this.c(((bpko)object0), z);
            }
        }
    }
}

