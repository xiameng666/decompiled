import j..util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

final class uec implements ubk, uct {
    private final ucs a;
    private final ucu b;
    private int c;
    private int d;
    private uay e;
    private List f;
    private int g;
    private volatile uhn h;
    private File i;
    private ued j;

    public uec(ucu ucu0, ucs ucs0) {
        this.d = -1;
        this.b = ucu0;
        this.a = ucs0;
    }

    @Override  // uct
    public final void a() {
        uhn uhn0 = this.h;
        if(uhn0 != null) {
            uhn0.c.d();
        }
    }

    @Override  // uct
    public final boolean b() {
        List list1;
        ucu ucu0 = this.b;
        List list0 = ucu0.d();
        boolean z = false;
        if(!list0.isEmpty()) {
            txt txt0 = ucu0.c.a();
            Class class0 = ucu0.d.getClass();
            Class class1 = ucu0.g;
            Class class2 = ucu0.j;
            uol uol0 = txt0.f;
            uqn uqn0 = (uqn)uol0.a.getAndSet(null);
            if(uqn0 == null) {
                uqn0 = new uqn(class0, class1, class2);
            }
            else {
                uqn0.a(class0, class1, class2);
            }
            synchronized(uol0.b) {
                list1 = (List)uol0.b.get(uqn0);
            }
            uol0.a.set(uqn0);
            if(list1 == null) {
                list1 = new ArrayList();
                for(Object object0: txt0.a.a(class0)) {
                    for(Object object1: txt0.c.b(((Class)object0), class1)) {
                        Class class3 = (Class)object1;
                        if(!txt0.e.b(class3, class2).isEmpty() && !list1.contains(class3)) {
                            list1.add(class3);
                        }
                    }
                }
                List list2 = DesugarCollections.unmodifiableList(list1);
                synchronized(txt0.f.b) {
                    txt0.f.b.put(new uqn(class0, class1, class2), list2);
                }
            }
            if(!list1.isEmpty()) {
                while(true) {
                    if(this.f != null && this.d()) {
                        this.h = null;
                        while(!z && this.d()) {
                            int v2 = this.g;
                            this.g = v2 + 1;
                            uho uho0 = (uho)this.f.get(v2);
                            ucu ucu1 = this.b;
                            this.h = uho0.a(this.i, ucu1.e, ucu1.f, ucu1.h);
                            if(this.h != null && ucu1.g(this.h.c.a())) {
                                this.h.c.g(ucu1.n, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int v3 = this.d + 1;
                    this.d = v3;
                    if(v3 >= list1.size()) {
                        int v4 = this.c + 1;
                        this.c = v4;
                        if(v4 >= list0.size()) {
                            return false;
                        }
                        this.d = 0;
                    }
                    uay uay0 = (uay)list0.get(this.c);
                    Class class4 = (Class)list1.get(this.d);
                    ucu ucu2 = this.b;
                    ubg ubg0 = ucu2.a(class4);
                    this.j = new ued(ucu2.h(), uay0, ucu2.m, ucu2.e, ucu2.f, ubg0, class4, ucu2.h);
                    File file0 = ucu2.c().a(this.j);
                    this.i = file0;
                    if(file0 != null) {
                        this.e = uay0;
                        this.f = ucu2.f(file0);
                        this.g = 0;
                    }
                }
            }
            ucu ucu3 = this.b;
            if(File.class.equals(ucu3.j)) {
                return false;
            }
            String s = String.valueOf(ucu3.d.getClass());
            throw new IllegalStateException(a.Y(ucu3.j, s, "Failed to find any load path from ", " to "));
        }
        return false;
    }

    @Override  // ubk
    public final void c(Object object0) {
        this.a.d(this.e, object0, this.h.c, uag.d, this.j);
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    @Override  // ubk
    public final void f(Exception exception0) {
        this.a.c(this.j, exception0, this.h.c, uag.d);
    }
}

