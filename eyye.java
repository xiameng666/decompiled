import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.ExplanationFragment;

public final class eyye extends ibsl implements ibtw {
    int a;
    final ExplanationFragment b;

    public eyye(ExplanationFragment explanationFragment0, ibrl ibrl0) {
        this.b = explanationFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyye)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyye(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eyzb eyzb0 = this.b.D();
            this.a = 1;
            object0 = eyzb0.g(this);
            if(object0 == object1) {
                return object1;
            }
        }
        ExplanationFragment explanationFragment0 = this.b;
        ((ggtj)explanationFragment0.B().h()).B("Deeplink device state: %s", ((eyyy)object0));
        switch(((eyyy)object0).ordinal()) {
            case 0: {
                ((nry)explanationFragment0.E().a(explanationFragment0)).i(0x7F0B0AD5);  // id:action_explanation_to_discoveredDeviceList
                return ibom.a;
            }
            case 1: {
                eyuf.b(explanationFragment0, new eyyd(explanationFragment0), null);
                return ibom.a;
            }
            case 2: {
                return ibom.a;
            }
            case 3: {
                eyuf.a(explanationFragment0, new eyyc());
                return ibom.a;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

