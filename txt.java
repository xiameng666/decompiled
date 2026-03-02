import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class txt {
    public final uhs a;
    public final uoi b;
    public final uon c;
    public final uop d;
    public final unc e;
    public final uol f;
    public final uok g;
    public final kav h;
    private final ubq i;
    private final uoj j;

    public txt() {
        this.f = new uol();
        this.g = new uok();
        uqv uqv0 = new uqv(new kax(20), new uqs(), new uqt());
        this.h = uqv0;
        this.a = new uhs(uqv0);
        this.b = new uoi();
        this.c = new uon();
        this.d = new uop();
        this.i = new ubq();
        this.e = new unc();
        this.j = new uoj();
        List list0 = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList0 = new ArrayList(list0.size());
        arrayList0.add("legacy_prepend_all");
        for(Object object0: list0) {
            arrayList0.add(((String)object0));
        }
        arrayList0.add("legacy_append");
        this.c.d(arrayList0);
    }

    public final ubn a(Object object0) {
        return this.i.a(object0);
    }

    public final List b() {
        List list0 = this.j.a();
        if(!list0.isEmpty()) {
            return list0;
        }
        throw new txp();
    }

    public final List c(Object object0) {
        Class class0 = object0.getClass();
        List list0 = this.a.b(class0);
        if(list0.isEmpty()) {
            throw new txq(object0);
        }
        int v = list0.size();
        List list1 = Collections.EMPTY_LIST;
        boolean z = true;
        for(int v1 = 0; v1 < v; ++v1) {
            uho uho0 = (uho)list0.get(v1);
            if(uho0.b(object0)) {
                if(z) {
                    list1 = new ArrayList(v - v1);
                }
                list1.add(uho0);
                z = false;
            }
        }
        if(!list1.isEmpty()) {
            return list1;
        }
        throw new txq(object0, list0);
    }

    public final void d(Class class0, uai uai0) {
        this.b.b(class0, uai0);
    }

    public final void e(Class class0, ubf ubf0) {
        this.d.b(class0, ubf0);
    }

    public final void f(Class class0, Class class1, ube ube0) {
        this.h("legacy_append", class0, class1, ube0);
    }

    public final void g(Class class0, Class class1, uhp uhp0) {
        this.a.c(class0, class1, uhp0);
    }

    public final void h(String s, Class class0, Class class1, ube ube0) {
        this.c.c(s, ube0, class0, class1);
    }

    public final void i(uak uak0) {
        this.j.b(uak0);
    }

    public final void j(ubm ubm0) {
        this.i.b(ubm0);
    }

    public final void k(Class class0, Class class1, una una0) {
        this.e.c(class0, class1, una0);
    }
}

