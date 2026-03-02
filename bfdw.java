import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class bfdw extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    Object i;
    int j;
    final bfdz k;
    final String l;

    public bfdw(bfdz bfdz0, String s, ibrl ibrl0) {
        this.k = bfdz0;
        this.l = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bfdw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bfdw(this.k, this.l, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object24;
        Object object23;
        Object object22;
        Object object12;
        Object object11;
        Object object10;
        Object object9;
        Object object8;
        Object object7;
        Object object6;
        Object object5;
        becv becv0;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.j) {
            case 0: {
                ibnx.b(object0);
                object2 = new bdcd(((beav)this.k.c).b.a(this.l), ((beav)this.k.c).a);
                evql evql0 = ((bdcd)object2).c();
                this.a = object2;
                this.j = 1;
                object3 = ictn.b(evql0, this);
                if(object3 == object1) {
                    return object1;
                }
                goto label_16;
            }
            case 1: {
                Object object4 = this.a;
                ibnx.b(object0);
                object2 = object4;
                object3 = object0;
            label_16:
                bfdz bfdz0 = this.k;
                String s = this.l;
                Account account0 = new Account(s, "com.google");
                bdbr bdbr0 = new bdbr(ayss.j(bfdz0.e.a.a, account0));
                bdcd bdcd0 = bfdz0.d.a(s);
                if(bdim.a(s)) {
                    cedi cedi0 = cedi.v();
                    ibuq.e(cedi0, "get(...)");
                    becv0 = new becv(cedi0);
                }
                else {
                    cede cede0 = cede.v();
                    ibuq.e(cede0, "get(...)");
                    becv0 = new becs(s, cede0);
                }
                becz becz0 = new becz(becv0);
                ibuq.c(((gged_interceptors)object3));
                object5 = new ArrayList();
                object6 = bfdz0;
                object7 = s;
                object8 = bdbr0;
                object9 = bdcd0;
                object10 = becz0;
                object11 = ((gged_interceptors)object3).iterator();
                object12 = object2;
                goto label_63;
            }
            case 2: {
                Object object13 = this.i;
                Object object14 = this.h;
                Object object15 = this.g;
                Object object16 = this.f;
                Object object17 = this.e;
                Object object18 = this.d;
                Object object19 = this.c;
                Object object20 = this.b;
                Object object21 = this.a;
                ibnx.b(object0);
                object6 = object17;
                object10 = object18;
                object9 = object19;
                object8 = object20;
                object22 = object21;
                object11 = object14;
                object5 = object15;
                object7 = object16;
                object23 = object13;
                object24 = object0;
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        while(true) {
            if(((Boolean)object24).booleanValue()) {
                ((Collection)object5).add(object23);
            }
            object12 = object22;
        label_63:
            if(!((Iterator)object11).hasNext()) {
                break;
            }
            Object object25 = ((Iterator)object11).next();
            ibuq.c(((hepk)object25));
            this.a = object12;
            this.b = object8;
            this.c = object9;
            this.d = object10;
            this.e = object6;
            this.f = object7;
            this.g = object5;
            this.h = object11;
            this.i = object25;
            this.j = 2;
            object22 = object12;
            object24 = ((bfdz)object6).b(((String)object7), ((hepk)object25), ((bdbr)object8), ((bdcd)object9), ((becz)object10), this);
            if(object24 == object1) {
                return object1;
            }
            object23 = object25;
        }
        if(!((Collection)object5).isEmpty()) {
            evql evql1 = ((bdcd)object12).b(ggdx.a(((Collection)object5)));
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = 3;
            if(ictn.b(evql1, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

