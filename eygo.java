import java.util.List;
import java.util.Set;

public final class eygo extends ibsl implements ibtw {
    int a;
    final eygq b;
    final exjx c;
    final exjo d;

    public eygo(eygq eygq0, exjx exjx0, exjo exjo0, ibrl ibrl0) {
        this.b = eygq0;
        this.c = exjx0;
        this.d = exjo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eygo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eygo(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        gzym gzym0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = this.b.b.p();
            this.a = 1;
            object0 = icll.a(icig0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(!((List)object0).isEmpty()) {
            eygq eygq0 = this.b;
            gzyz gzyz0 = gzyz.b;
            gzyj gzyj0 = this.c == null ? null : this.c.e();
            exjo exjo0 = this.d;
            if(exjo0 == null) {
                gzym0 = gzym.b;
            }
            else {
                gzym0 = exjo0.a();
                if(gzym0 == null) {
                    gzym0 = gzym.b;
                }
            }
            eyfl eyfl0 = eygq0.a;
            eyfl.i(eyfl0, gzyz0, null, gzyj0, gzym0, 316);
            Set set0 = ibpo.ay(eygq0.e);
            eygq0.e.clear();
            for(Object object2: set0) {
                exjx exjx0 = ((eygn)object2).a;
                gzyj gzyj1 = exjx0 == null ? null : exjx0.e();
                eyfl.i(eyfl0, gzyz.G, ((eygn)object2).b, gzyj1, null, 444);
            }
        }
        return ibom.a;
    }
}

