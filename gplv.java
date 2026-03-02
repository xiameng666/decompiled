import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

final class gplv extends iapa {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public iapk d;
    public iaof_metadata e;
    private final gged_interceptors g;
    private final Queue h;
    private final Set i;
    private int j;
    private boolean k;
    private boolean l;
    private iaof_metadata m;

    public gplv(iaku iaku0, gged_interceptors gged0, Set set0) {
        super(iaku0);
        this.a = new LinkedHashMap();
        this.h = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.g = gged0;
        this.j = ((ggna)gged0).c;
        this.i = set0;
    }

    @Override  // iapa
    public final void a(iapk iapk0, iaof_metadata iaof0) {
        this.d = iapk0;
        this.e = iaof0;
        this.l = true;
        this.h();
    }

    @Override  // iapa
    public final void b(iaof_metadata iaof0) {
        this.m = iaof0;
        gftb.check(iaof0);
        for(Object object0: ggia.g(this.g.b(0, this.j))) {
            --this.j;
            for(Object object1: ggia.g(((List)object0))) {
                gpkv gpkv0 = (gpkv)object1;
                if(this.i.contains(gpkv0)) {
                    goto label_11;
                }
                continue;
                try {
                label_11:
                    gpkv0.f();
                }
                catch(Throwable throwable0) {
                    this.d = iapk.d(throwable0);
                    this.e = new iaof_metadata();
                    this.f();
                    return;
                }
            }
            if(this.g()) {
                return;
            }
        }
        this.f.b(this.m);
        this.k = true;
        this.e();
    }

    @Override  // iapa
    public final void c(Object object0) {
        this.h.add(new gplu(this, object0, this.g.size()));
        this.e();
    }

    public final void e() {
        if(this.k) {
            Queue queue0 = this.h;
            Iterator iterator0 = queue0.iterator();
        alab1:
            while(true) {
                if(!iterator0.hasNext()) {
                    while(!queue0.isEmpty()) {
                        gplu gplu0 = (gplu)queue0.peek();
                        if(!gplu0.a() || gplu0.c != 0) {
                            break;
                        }
                        Object object0 = ((gplu)queue0.poll()).a;
                        this.f.c(object0);
                    }
                    this.h();
                    return;
                }
                Object object1 = iterator0.next();
                gplu gplu1 = (gplu)object1;
                for(Object object2: ggia.g(this.g.b(0, gplu1.c))) {
                    for(Object object3: ggia.g(((List)object2))) {
                        gpkv gpkv0 = (gpkv)object3;
                        if(this.i.contains(gpkv0)) {
                            gftb.z(gplu1.a, "Response message cannot be null");
                            try {
                                gpkv0.g();
                            }
                            catch(Throwable throwable0) {
                                this.d = iapk.d(throwable0);
                                this.e = new iaof_metadata();
                                this.f();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if(!gplu1.a()) {
                        break alab1;
                    }
                    --gplu1.c;
                }
            }
        }
    }

    public final void f() {
        for(Object object0: ggia.g(this.g)) {
            for(Object object1: ggia.g(((List)object0))) {
                gpkv gpkv0 = (gpkv)object1;
                gpks gpks0 = new gpks(this.d, this.e);
                if(this.i.contains(gpkv0)) {
                    goto label_9;
                }
                continue;
                try {
                label_9:
                    gpkv0.c(gpks0);
                }
                catch(Throwable throwable0) {
                    this.d = iapk.d(throwable0);
                    this.e = new iaof_metadata();
                }
            }
        }
        if(this.b.isEmpty()) {
            this.f.a(this.d, this.e);
        }
    }

    public final boolean g() {
        return !this.a.isEmpty();
    }

    private final void h() {
        if(!this.g() && this.h.isEmpty() && this.l && !this.c) {
            this.f();
        }
    }
}

