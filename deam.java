import java.util.List;

public final class deam implements icih {
    final icih a;

    public deam(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        deal deal0;
        if((ibrl0 instanceof deal)) {
            deal0 = (deal)ibrl0;
            int v = deal0.b;
            if((v & 0x80000000) == 0) {
                deal0 = new deal(this, ibrl0);
            }
            else {
                deal0.b = v - 0x80000000;
            }
        }
        else {
            deal0 = new deal(this, ibrl0);
        }
        Object object1 = deal0.a;
        Object object2 = ibrx.a;
        switch(deal0.b) {
            case 0: {
                ibnx.b(object1);
                ibuq.c(((List)object0));
                debd debd0 = new debd(((List)object0));
                deal0.b = 1;
                return this.a.a(debd0, deal0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

