import java.util.List;
import java.util.Objects;

final class rtj extends ibsl implements ibtw {
    int a;
    final rtm b;

    public rtj(rtm rtm0, ibrl ibrl0) {
        this.b = rtm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rtj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rtj(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            rtm rtm0 = this.b;
            if(!rtm0.e.b(0x18CE5D55L)) {
                return ibom.a;
            }
            rtm0.d.clear();
            this.a = 1;
            object0 = rtm0.b.c("TaskExecutionHistoryBundle", rsw.a, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((rsw)object0) != null) {
            List list0 = ((rsw)object0).b;
            if(list0 != null) {
                this.b.d.addAll(list0);
            }
        }
        Objects.toString(this.b.d);
        sct.d("OTMBase", "Restored task execution history: " + this.b.d.toString());
        return ibom.a;
    }
}

