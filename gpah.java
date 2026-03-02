import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class gpah implements gozx, gpcs {
    private static final gpew a;
    private final Map b;
    private final Map c;
    private final Map d;
    private final List e;
    private Set f;
    private final gpap g;
    private final AtomicReference h;

    static {
        gpah.a = new gpac();
    }

    public gpah(Iterable iterable0, Collection collection0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = new HashSet();
        this.h = new AtomicReference();
        gpap gpap0 = new gpap();
        this.g = gpap0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(gozv.e(gpap0, gpap.class, new Class[]{gpdx.class, gpdw.class}));
        arrayList0.add(gozv.e(this, gpcs.class, new Class[0]));
        for(Object object0: collection0) {
            gozv gozv0 = (gozv)object0;
            if(gozv0 != null) {
                arrayList0.add(gozv0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: iterable0) {
            arrayList1.add(object1);
        }
        this.e = arrayList1;
        ArrayList arrayList2 = new ArrayList();
        synchronized(this) {
            Iterator iterator2 = arrayList1.iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                gpew gpew0 = (gpew)object2;
                try {
                    ComponentRegistrar componentRegistrar0 = (ComponentRegistrar)gpew0.a();
                    if(componentRegistrar0 == null) {
                        continue;
                    }
                    arrayList0.addAll(componentRegistrar0.getComponents());
                    iterator2.remove();
                }
                catch(gpaq gpaq0) {
                    iterator2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", gpaq0);
                }
            }
            Iterator iterator3 = arrayList0.iterator();
            while(iterator3.hasNext()) {
                Object object3 = iterator3.next();
                Object[] arr_object = ((gozv)object3).a.toArray();
                int v2 = 0;
            label_47:
                if(v2 >= arr_object.length) {
                    continue;
                }
                Object object4 = arr_object[v2];
                if(object4.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                    if(this.f.contains(object4.toString())) {
                        iterator3.remove();
                        continue;
                    }
                    this.f.add(object4.toString());
                }
                ++v2;
                goto label_47;
            }
            if(this.b.isEmpty()) {
                gpak.a(arrayList0);
            }
            else {
                ArrayList arrayList3 = new ArrayList(this.b.keySet());
                arrayList3.addAll(arrayList0);
                gpak.a(arrayList3);
            }
            for(Object object5: arrayList0) {
                gpar gpar0 = new gpar(new gpad(this, ((gozv)object5)));
                this.b.put(((gozv)object5), gpar0);
            }
            ArrayList arrayList4 = new ArrayList();
            for(Object object6: arrayList0) {
                gozv gozv1 = (gozv)object6;
                if(gozv1.f()) {
                    gpew gpew1 = (gpew)this.b.get(gozv1);
                    for(Object object7: gozv1.a) {
                        gpay gpay0 = (gpay)object7;
                        if(this.c.containsKey(gpay0)) {
                            arrayList4.add(new gpae(((gpav)(((gpew)this.c.get(gpay0)))), gpew1));
                        }
                        else {
                            this.c.put(gpay0, gpew1);
                        }
                    }
                }
            }
            arrayList2.addAll(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            HashMap hashMap0 = new HashMap();
            for(Object object8: this.b.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object8;
                gozv gozv2 = (gozv)map$Entry0.getKey();
                if(!gozv2.f()) {
                    gpew gpew2 = (gpew)map$Entry0.getValue();
                    for(Object object9: gozv2.a) {
                        gpay gpay1 = (gpay)object9;
                        if(!hashMap0.containsKey(gpay1)) {
                            hashMap0.put(gpay1, new HashSet());
                        }
                        ((Set)hashMap0.get(gpay1)).add(gpew2);
                    }
                }
            }
            for(Object object10: hashMap0.entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object10;
                Object object11 = map$Entry1.getKey();
                if(this.d.containsKey(object11)) {
                    Object object12 = map$Entry1.getKey();
                    gpas gpas1 = (gpas)this.d.get(object12);
                    for(Object object13: ((Set)map$Entry1.getValue())) {
                        arrayList5.add(new gpaf(gpas1, ((gpew)object13)));
                    }
                }
                else {
                    gpay gpay2 = (gpay)map$Entry1.getKey();
                    gpas gpas0 = gpas.b(((Collection)map$Entry1.getValue()));
                    this.d.put(gpay2, gpas0);
                }
            }
            arrayList2.addAll(arrayList5);
            for(Object object14: this.b.keySet()) {
                gozv gozv3 = (gozv)object14;
                for(Object object15: gozv3.b) {
                    gpal gpal0 = (gpal)object15;
                    if(gpal0.b() && !this.d.containsKey(gpal0.a)) {
                        gpas gpas2 = gpas.b(Collections.EMPTY_SET);
                        this.d.put(gpal0.a, gpas2);
                        continue;
                    }
                    if(this.c.containsKey(gpal0.a)) {
                        continue;
                    }
                    if(gpal0.b == 1) {
                        throw new gpat(String.format("Unsatisfied dependency for component %s: %s", gozv3, gpal0.a));
                    }
                    if(gpal0.b()) {
                        continue;
                    }
                    gpav gpav0 = new gpav(gpav.a);
                    this.c.put(gpal0.a, gpav0);
                    continue;
                }
            }
        }
        int v3 = arrayList2.size();
        for(int v = 0; v < v3; ++v) {
            ((Runnable)arrayList2.get(v)).run();
        }
        Boolean boolean0 = (Boolean)this.h.get();
        if(boolean0 != null) {
            this.g(this.b, boolean0.booleanValue());
        }
    }

    @Override  // gozx
    public final gpew a(gpay gpay0) {
        gpew gpew0;
        synchronized(this) {
            gpew0 = (gpew)this.c.get(gpay0);
        }
        return gpew0;
    }

    @Override  // gozx
    public final gpew b(Class class0) {
        return this.a(new gpay(gpax.class, class0));
    }

    @Override  // gozx
    public final gpew c(gpay gpay0) {
        synchronized(this) {
            gpew gpew0 = (gpas)this.d.get(gpay0);
            if(gpew0 != null) {
                return gpew0;
            }
        }
        return gpah.a;
    }

    @Override  // gozx
    public final Object d(gpay gpay0) {
        throw null;
    }

    @Override  // gozx
    public final Object e(Class class0) {
        return gozw.b(this, class0);
    }

    public final void f() {
        HashMap hashMap0;
        Boolean boolean0 = Boolean.valueOf(true);
        do {
            AtomicReference atomicReference0 = this.h;
            if(atomicReference0.compareAndSet(null, boolean0)) {
                synchronized(this) {
                    hashMap0 = new HashMap(this.b);
                }
                this.g(hashMap0, true);
                return;
            }
        }
        while(atomicReference0.get() == null);
    }

    private final void g(Map map0, boolean z) {
        for(Object object0: map0.entrySet()) {
            gozv gozv0 = (gozv)((Map.Entry)object0).getKey();
            gpew gpew0 = (gpew)((Map.Entry)object0).getValue();
            switch(gozv0.c) {
                case 1: {
                    gpew0.a();
                    break;
                }
                case 2: {
                    if(z) {
                        gpew0.a();
                        break;
                    }
                }
            }
        }
        gpap gpap0 = this.g;
        synchronized(gpap0) {
            Queue queue0 = gpap0.a;
            if(queue0 == null) {
                queue0 = null;
            }
            else {
                gpap0.a = null;
            }
            if(queue0 != null) {
                for(Object object1: queue0) {
                    gpdu gpdu0 = (gpdu)object1;
                    gpdu0.getClass();
                    synchronized(gpap0) {
                        Queue queue1 = gpap0.a;
                        if(queue1 == null) {
                            goto label_35;
                        }
                        else {
                            queue1.add(gpdu0);
                            continue;
                        }
                        break;
                    }
                    continue;
                label_35:
                    for(Object object2: gpap0.a()) {
                        ((Executor)((Map.Entry)object2).getValue()).execute(new gpao(((Map.Entry)object2)));
                    }
                }
            }
        }
    }
}

