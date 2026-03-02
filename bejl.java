import java.util.List;

public final class bejl extends ibsl implements ibtw {
    int a;
    final bejm b;
    final String c;
    final List d;

    public bejl(bejm bejm0, String s, List list0, ibrl ibrl0) {
        this.b = bejm0;
        this.c = s;
        this.d = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bejl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bejl(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                object0 = this.b.b(this.c, this.d, this);
                if(object0 != object1) {
                    goto label_8;
                }
                break;
            }
            case 1: {
            label_8:
                this.b.a.e("account_name_key", ((String)object0));
                this.b.c.l(((String)object0));
                this.a = 2;
                if(this.b.c(((String)object0), this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                return ibom.a;
            }
        }
        return object1;
    }
}

