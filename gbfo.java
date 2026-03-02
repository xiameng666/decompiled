import java.util.Arrays;
import java.util.List;

public final class gbfo extends ibsl implements ibtw {
    int a;
    final List b;
    private Object c;

    public gbfo(List list0, ibrl ibrl0) {
        this.b = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbfo)this.c(((gbkj)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new gbfo(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            gbkj gbkj0 = (gbkj)this.c;
            gbks[] arr_gbks = (gbks[])this.b.toArray(new gbks[0]);
            gbks[] arr_gbks1 = (gbks[])Arrays.copyOf(arr_gbks, arr_gbks.length);
            this.a = 1;
            if(gbkj0.b(arr_gbks1, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

