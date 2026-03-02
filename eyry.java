import java.util.List;

final class eyry extends ibsl implements ibtw {
    int a;
    final eysa b;
    final eyed c;
    final eysx d;

    public eyry(eysa eysa0, eyed eyed0, eysx eysx0, ibrl ibrl0) {
        this.b = eysa0;
        this.c = eyed0;
        this.d = eysx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyry)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyry(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        eybs eybs0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                icig icig0 = this.b.c.p();
                this.a = 1;
                object0 = icll.a(icig0, this);
                if(object0 != object1) {
                    goto label_10;
                }
                return object1;
            }
            case 1: {
            label_10:
                exwv exwv0 = (exwv)ibpo.T(((List)object0));
                if(exwv0 == null) {
                    eybs0 = null;
                }
                else {
                    this.a = 2;
                    object0 = this.b.e(exwv0, this);
                    if(object0 != object1) {
                        eybs0 = (eybs)object0;
                        break;
                    }
                    return object1;
                }
                break;
            }
            default: {
                eybs0 = (eybs)object0;
            }
        }
        List list0 = this.b.j();
        eyqq eyqq0 = this.b.a(list0, this.c, this.d, eybs0);
        this.b.j.g(eyqq0);
        return ibom.a;
    }
}

