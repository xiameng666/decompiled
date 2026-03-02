import com.google.android.gms.cast.CastDevice;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public final class atze {
    public final avij a;
    public final long b;
    public final nob c;
    public final CastDevice d;
    public final long e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public boolean j;
    public boolean k;
    public String l;
    public final int m;
    private static final AtomicLong n;
    private final List o;

    static {
        atze.n = new AtomicLong(aurf.b());
    }

    public atze(int v, nob nob0, CastDevice castDevice0) {
        this.f = DesugarCollections.synchronizedList(new ArrayList());
        this.o = DesugarCollections.synchronizedList(new ArrayList());
        this.g = DesugarCollections.synchronizedList(new ArrayList());
        this.h = DesugarCollections.synchronizedList(new ArrayList());
        this.i = DesugarCollections.synchronizedList(new ArrayList());
        this.m = v;
        this.c = nob0;
        this.d = castDevice0;
        this.a = avij.e();
        this.e = System.currentTimeMillis();
        this.b = atze.n.getAndIncrement();
    }

    public final void a(auos auos0) {
        auos0.f = this.e;
        this.o.add(auos0);
    }

    public final void b() {
        List list0 = this.g;
        if(!list0.isEmpty()) {
            List list1 = this.o;
            if(!list1.isEmpty()) {
                ((atzj)gggq.p(list0)).e.addAll(list1);
                list1.clear();
            }
        }
        List list2 = this.h;
        if(!list2.isEmpty()) {
            if(list0.isEmpty()) {
                this.i.addAll(list2);
            }
            else {
                ((atzj)gggq.p(list0)).f.addAll(list2);
            }
            list2.clear();
        }
    }

    public final void c(auou auou0) {
        auou0.d = this.e;
        this.f.add(auou0);
        String s = auou0.c;
        if(s != null) {
            this.l = s;
        }
    }

    public final void d(atzj atzj0) {
        atzj0.d = this.e;
        this.b();
        this.g.add(atzj0);
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        switch(this.m) {
            case 2: {
                return String.format(locale0, "type: %s, appId: %s", "ROUTE_CONTROLLER_TYPE_CAST_ROUTE_CONTROLLER", this.l);
            }
            case 3: {
                return String.format(locale0, "type: %s, appId: %s", "ROUTE_CONTROLLER_TYPE_CAST_DYNAMIC_GROUP_ROUTE_CONTROLLER", this.l);
            }
            case 4: {
                return String.format(locale0, "type: %s, appId: %s", "ROUTE_CONTROLLER_TYPE_MIRRORING_ROUTE_CONTROLLER", this.l);
            }
            default: {
                return String.format(locale0, "type: %s, appId: %s", "ROUTE_CONTROLLER_TYPE_REMOTE_DISPLAY_ROUTE_CONTROLLER", this.l);
            }
        }
    }
}

