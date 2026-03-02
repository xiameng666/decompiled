import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class ucu {
    public final List a;
    public final List b;
    public txj c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public ubc h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public uay m;
    public txn n;
    public udf o;
    public boolean p;
    public boolean q;
    public udk r;

    public ucu() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    final ubg a(Class class0) {
        ubg ubg0 = (ubg)this.i.get(class0);
        if(ubg0 == null) {
            for(Object object0: this.i.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((Class)map$Entry0.getKey()).isAssignableFrom(class0)) {
                    ubg0 = (ubg)map$Entry0.getValue();
                    break;
                }
            }
        }
        if(ubg0 == null) {
            if(this.i.isEmpty() && this.p) {
                throw new IllegalArgumentException(a.O(class0, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
            }
            return uji.b;
        }
        return ubg0;
    }

    final udy b(Class class0) {
        udy udy1;
        Class class7;
        Class class6;
        Class class5;
        Class class1 = class0;
        txt txt0 = this.c.a();
        uok uok0 = txt0.g;
        Class class2 = this.g;
        Class class3 = this.j;
        udy udy0 = null;
        uqn uqn0 = (uqn)uok0.c.getAndSet(null);
        if(uqn0 == null) {
            uqn0 = new uqn();
        }
        uqn0.a(class1, class2, class3);
        synchronized(uok0.b) {
            udy1 = (udy)uok0.b.get(uqn0);
        }
        uok0.c.set(uqn0);
        uok uok1 = txt0.g;
        udy udy2 = uok.a;
        if(udy2.equals(udy1)) {
            return null;
        }
        if(udy1 == null) {
            ArrayList arrayList0 = new ArrayList();
            uon uon0 = txt0.c;
            for(Object object0: uon0.b(class1, class2)) {
                Class class4 = (Class)object0;
                unc unc0 = txt0.e;
                for(Object object1: unc0.b(class4, class3)) {
                    arrayList0.add(new ucz(class1, class4, ((Class)object1), uon0.a(class1, class4), unc0.a(class4, ((Class)object1)), txt0.h));
                    class1 = class0;
                    unc0 = unc0;
                }
                class1 = class0;
            }
            if(arrayList0.isEmpty()) {
                class5 = class0;
                class6 = class2;
                class7 = class3;
            }
            else {
                class5 = class0;
                class6 = class2;
                class7 = class3;
                udy0 = new udy(class5, class6, class7, arrayList0, txt0.h);
            }
            bxd bxd0 = uok1.b;
            synchronized(bxd0) {
                uqn uqn1 = new uqn(class5, class6, class7);
                if(udy0 != null) {
                    udy2 = udy0;
                }
                bxd0.put(uqn1, udy2);
            }
            return udy0;
        }
        return udy1;
    }

    final ufa c() {
        return this.r.a();
    }

    final List d() {
        if(!this.l) {
            this.l = true;
            List list0 = this.b;
            list0.clear();
            List list1 = this.e();
            int v = list1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                uhn uhn0 = (uhn)list1.get(v1);
                uay uay0 = uhn0.a;
                if(!list0.contains(uay0)) {
                    list0.add(uay0);
                }
                for(int v2 = 0; true; ++v2) {
                    List list2 = uhn0.b;
                    if(v2 >= list2.size()) {
                        break;
                    }
                    if(!list0.contains(list2.get(v2))) {
                        list0.add(((uay)list2.get(v2)));
                    }
                }
            }
        }
        return this.b;
    }

    final List e() {
        if(!this.k) {
            this.k = true;
            List list0 = this.a;
            list0.clear();
            List list1 = this.c.a().c(this.d);
            int v = list1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                uhn uhn0 = ((uho)list1.get(v1)).a(this.d, this.e, this.f, this.h);
                if(uhn0 != null) {
                    list0.add(uhn0);
                }
            }
        }
        return this.a;
    }

    final List f(File file0) {
        return this.c.a().c(file0);
    }

    final boolean g(Class class0) {
        return this.b(class0) != null;
    }

    final ues h() {
        return this.c.h;
    }
}

