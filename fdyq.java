import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class fdyq implements ffmj {
    public final Map a;
    public final Object b;
    private boolean c;
    private final boolean d;
    private final fdye e;

    public fdyq(fdye fdye0, boolean z) {
        this.a = new HashMap();
        this.c = false;
        Object object0 = new Object();
        this.b = object0;
        synchronized(object0) {
            this.e = fdye0;
            this.d = z;
        }
    }

    public final fdxn a(String s) {
        fdyo fdyo0;
        synchronized(this.b) {
            this.d();
            fdyo0 = (fdyo)this.a.get(s);
            if(fdyo0 == null) {
                return null;
            }
        }
        return fdyo0.c;
    }

    public final fdyo b(String s) {
        fdyo fdyo0;
        synchronized(this.b) {
            this.d();
            fdyo0 = (fdyo)this.a.get(s);
            if(fdyo0 != null) {
                fdyo0 = fdyo0.b();
            }
        }
        return fdyo0;
    }

    public final Set c() {
        Set set0;
        synchronized(this.b) {
            this.d();
            set0 = new HashSet();
            for(Object object1: this.a.values()) {
                fdyo fdyo0 = (fdyo)object1;
                if(fdyo0.b > 0 && fdyo0.b < 0x7FFFFFFF) {
                    ((HashSet)set0).add(fdyo0.b());
                }
            }
        }
        return set0;
    }

    public final void d() {
        if(!this.c) {
            fdxn fdxn0 = this.h();
            fdyo fdyo0 = new fdyo(fdxn0, this.d);
            this.a.put(fdxn0.a, fdyo0);
            this.c = true;
        }
    }

    public final void f(String s) {
        synchronized(this.b) {
            batl.s(s);
            this.a.remove(s);
            this.j();
        }
    }

    public final void g(fdxn fdxn0, boolean z, Collection collection0) {
        synchronized(this.b) {
            if(Log.isLoggable("RouteMap", 3)) {
                Log.d("RouteMap", "updating the node peers, before: " + this.a.values());
            }
            this.d();
            fdyo fdyo0 = new fdyo(fdxn0, z);
            for(Object object1: collection0) {
                fdyo0.e.put(((fdyp)object1).a.a, ((fdyp)object1));
            }
            Map map0 = this.a;
            map0.put(fdxn0.a, fdyo0);
            this.j();
            if(Log.isLoggable("RouteMap", 3)) {
                Log.d("RouteMap", "updating the node peers, after: " + map0.values());
            }
        }
    }

    private final fdxn h() {
        return this.e.a();
    }

    private final void i(fdyo fdyo0, fdxn fdxn0, int v, boolean z) {
        boolean z2;
        fdyo0.b = v;
        fdyo0.c = fdxn0;
        fdyo0.d = z;
        Map map0 = fdyo0.e;
        for(Object object0: map0.values()) {
            fdxn fdxn1 = ((fdyp)object0).a;
            Map map1 = this.a;
            String s = fdxn1.a;
            fdyo fdyo1 = (fdyo)map1.get(s);
            boolean z1 = false;
            if(fdyo1 == null) {
                fdyo1 = new fdyo(fdxn1, false);
                fdyo1.b = 0x7FFFFFFF;
                fdyo1.g = true;
                map1.put(s, fdyo1);
            }
            if(!fdyo0.d) {
                fdyp fdyp0 = (fdyp)map0.get(fdyo1.a.a);
                fdyp fdyp1 = (fdyp)fdyo1.e.get(fdyo0.a.a);
                if((fdyp0 == null || !fdyp0.b) && (fdyp1 == null || !fdyp1.b)) {
                    z2 = false;
                    goto label_24;
                }
            }
            z2 = true;
        label_24:
            int v1 = fdyo1.b;
            if(1 + v < v1) {
                z1 = z2;
            }
            else if(1 + v != v1 || !fdyo1.d || z2) {
                continue;
            }
            if(fdyo0.b == 0) {
                fdxn0 = fdxn1;
            }
            this.i(fdyo1, fdxn0, 1 + v, z1);
        }
    }

    private final void j() {
        Map map0 = this.a;
        Iterator iterator0 = map0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            fdyo fdyo0 = (fdyo)((Map.Entry)object0).getValue();
            if(fdyo0.g) {
                iterator0.remove();
            }
            else {
                fdyo0.b = 0x7FFFFFFF;
                fdyo0.c = null;
            }
        }
        fdxn fdxn0 = this.h();
        String s = fdxn0.a;
        fdyo fdyo1 = (fdyo)map0.get(s);
        if(fdyo1 == null) {
            fdyo fdyo2 = new fdyo(fdxn0, this.d);
            map0.put(s, fdyo2);
            fdyo1 = fdyo2;
        }
        this.i(fdyo1, fdyo1.a, 0, false);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        synchronized(this.b) {
            this.d();
            bbpd0.println("RouteMap:");
            bbpd0.b();
            bbpd0.println("localNode: " + this.h());
            bbpd0.println("NodeInfos:");
            bbpd0.b();
            for(Object object1: this.a.values()) {
                bbpd0.println(((fdyo)object1).c(z1));
            }
            bbpd0.a();
            bbpd0.a();
        }
    }
}

