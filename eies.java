import android.content.Context;
import java.util.HashMap;
import java.util.TreeSet;

public final class eies {
    public static volatile eies a;
    private final HashMap b;
    private final eijg c;

    public eies(Context context0) {
        this.b = new HashMap();
        this.c = eijg.a(context0);
    }

    public final eiex a(String s) {
        gwhi gwhi0 = this.c.d(s);
        if(gwhi0 != null && (gwhi0.b & 8) != 0) {
            this.f(s, gwhi0.f, Integer.valueOf((gwhi0.d == null ? gwgx.a : gwhi0.d).h), Integer.valueOf((gwhi0.d == null ? gwgx.a : gwhi0.d).i), Integer.valueOf((gwhi0.d == null ? gwgx.a : gwhi0.d).d));
            return (eiex)this.b.get(s);
        }
        return (eiex)this.b.get(s);
    }

    public final Long b(String s) {
        eiex eiex0 = this.a(s);
        return eiex0 == null ? null : eiex0.g;
    }

    public final void c(String s, gwmq gwmq0) {
        eiex eiex1;
        synchronized(this) {
            eiex eiex0 = this.a(s);
            if(eiex0 == null) {
                TreeSet treeSet0 = new TreeSet(new eiew());
                treeSet0.add(gwmq0);
                eiev eiev1 = eiex.a();
                eiev1.d(s);
                eiev1.g(treeSet0);
                eiex1 = eiev1.a();
            }
            else {
                eiex0.f.add(gwmq0);
                eiev eiev0 = new eiev(eiex0);
                eiev0.g(eiex0.f);
                eiex1 = eiev0.a();
            }
            this.h(s, eiex1);
        }
    }

    public final void d(String s, long v) {
        eiex eiex1;
        synchronized(this) {
            eiex eiex0 = this.a(s);
            if(eiex0 == null) {
                eiev eiev1 = eiex.a();
                eiev1.d(s);
                eiev1.f(v);
                eiex1 = eiev1.a();
            }
            else {
                eiev eiev0 = new eiev(eiex0);
                eiev0.f(v);
                eiev0.g(new TreeSet(new eiew()));
                eiex1 = eiev0.a();
            }
            this.h(s, eiex1);
        }
    }

    public final void e(String s, long v) {
        eiex eiex1;
        synchronized(this) {
            eiex eiex0 = this.a(s);
            if(eiex0 == null) {
                eiev eiev1 = eiex.a();
                eiev1.d(s);
                eiev1.e(v);
                eiex1 = eiev1.a();
            }
            else {
                if(eiex0.g != null && ((long)eiex0.g) >= v) {
                    return;
                }
                eiev eiev0 = new eiev(eiex0);
                eiev0.e(v);
                eiex1 = eiev0.a();
            }
            this.h(s, eiex1);
        }
    }

    public final void f(String s, long v, Integer integer0, Integer integer1, Integer integer2) {
        eiev eiev0;
        synchronized(this) {
            eiex eiex0 = (eiex)this.b.get(s);
            if(eiex0 == null) {
                eiev0 = eiex.a();
                eiev0.d(s);
            }
            else {
                if(eiex0.c != null && ((long)eiex0.c) >= v) {
                    return;
                }
                eiev0 = new eiev(eiex0);
            }
            eiev0.c(v);
            eiev0.b = integer2;
            eiev0.a = integer1;
            if(integer0 != null) {
                eiev0.b(integer0.intValue());
            }
            this.h(s, eiev0.a());
        }
    }

    public final int g(String s) {
        synchronized(this) {
            eiex eiex0 = this.a(s);
            if(eiex0 == null) {
                return 1;
            }
            Long long0 = eiex0.e;
            if(long0 != null && System.currentTimeMillis() - ((long)long0) <= hrtd.x()) {
                TreeSet treeSet0 = eiex0.f;
                if(treeSet0.isEmpty() && System.currentTimeMillis() - ((long)long0) <= hrtd.y()) {
                    return 2;
                }
                for(Object object0: treeSet0) {
                    gwmq gwmq0 = (gwmq)object0;
                    if((gwmq0.b & 4) != 0 && gwmq0.e != 0) {
                        return 3;
                    }
                    switch((gwmp.b(gwmq0.d) == null ? gwmp.a : gwmp.b(gwmq0.d)).ordinal()) {
                        case 3: 
                        case 5: {
                            goto label_25;
                        }
                        case 2: 
                        case 6: {
                            return 3;
                        }
                    }
                    continue;
                label_25:
                    long v1 = System.currentTimeMillis() - gwmq0.c;
                    long v2 = hrtd.E();
                    return Long.compare(v1, v2 + 3000L) > 0 ? 1 : 4;
                }
                long v3 = hrtd.y();
                return Long.compare(System.currentTimeMillis() - ((long)long0), v3) <= 0 ? 2 : 3;
            }
        }
        return 1;
    }

    private final void h(String s, eiex eiex0) {
        synchronized(this) {
            this.b.put(s, eiex0);
        }
    }
}

