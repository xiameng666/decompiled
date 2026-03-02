import java.util.SortedMap;

public final class auet extends ibsl implements ibtw {
    int a;
    final String b;
    final auez c;

    public auet(String s, auez auez0, ibrl ibrl0) {
        this.b = s;
        this.c = auez0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((auet)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new auet(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                String s = this.b;
                if(s.length() == 0) {
                    this.a = 1;
                    object0 = this.c.e.b(this);
                    return object0 == object1 ? object1 : ((SortedMap)object0);
                }
                aues aues0 = new aues(s);
                this.a = 2;
                object0 = this.c.e.c(aues0, this);
                return object0 == object1 ? object1 : ((SortedMap)object0);
            }
            case 1: {
                return (SortedMap)object0;
            }
            default: {
                return (SortedMap)object0;
            }
        }
    }
}

