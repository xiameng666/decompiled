import android.text.format.Time;
import j..util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

public final class fdwc implements ffmj {
    private final Deque a;
    private final Map b;
    private final String c;

    public fdwc() {
        this.a = new ArrayDeque();
        this.b = DesugarCollections.synchronizedSortedMap(new TreeMap());
        this.c = TimeZone.getDefault().getID();
    }

    public final void a(String s) {
        fdwb fdwb0 = fdwb.a(s);
        this.b.put(fdwb0, Long.valueOf(System.currentTimeMillis()));
    }

    public final void b(String s) {
        this.c(s, "");
    }

    public final void c(String s, String s1) {
        fdwb fdwb0 = fdwb.a(s);
        Long long0 = (Long)this.b.remove(fdwb0);
        if(long0 == null) {
            return;
        }
        this.g(s, long0, s1);
    }

    public final void d() {
        Map map0 = this.b;
        synchronized(map0) {
            long v1 = Thread.currentThread().getId();
            Iterator iterator0 = map0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((fdwb)map$Entry0.getKey()).b == v1) {
                    this.g(((fdwb)map$Entry0.getKey()).a, ((Long)map$Entry0.getValue()), "force end");
                    iterator0.remove();
                }
            }
        }
    }

    private final String f(long v) {
        Time time0 = new Time(this.c);
        time0.set(v);
        return time0.format("%Y-%m-%d %H:%M:%S");
    }

    private final void g(String s, Long long0, String s1) {
        Deque deque0 = this.a;
        synchronized(deque0) {
            deque0.addLast(new fdvy(s, ((long)long0), System.currentTimeMillis(), s1));
            while(deque0.size() > 300) {
                deque0.removeFirst();
            }
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        int v2;
        bbpd0.b();
        bbpd0.printf("      %19s: %6s %-15s %s\n", new Object[]{"Start Time", "ms", "Event", "additional info"});
        Map map0 = this.b;
        synchronized(map0) {
            long v1 = System.currentTimeMillis();
            v2 = 1;
            for(Object object0: map0.entrySet()) {
                long v3 = (long)(((Long)((Map.Entry)object0).getValue()));
                bbpd0.printf("%3d - %19s: %6d %-15s %s\n", new Object[]{v2, this.f(v3), ((long)(v1 - v3)), ((fdwb)((Map.Entry)object0).getKey()).a, "IN PROGRESS"});
                ++v2;
            }
        }
        Deque deque0 = this.a;
        synchronized(deque0) {
            Iterator iterator1 = deque0.descendingIterator();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                bbpd0.printf("%3d - %19s: %6d %-15s %s\n", new Object[]{v2, this.f(((fdvy)object1).b), ((long)(((fdvy)object1).c - ((fdvy)object1).b)), ((fdvy)object1).a, ((fdvy)object1).d});
                ++v2;
            }
        }
        bbpd0.a();
    }
}

