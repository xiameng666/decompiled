import com.google.android.gms.pay.GetOutstandingPurchaseOrderIdResponse;
import com.google.android.gms.wallet.PaymentData;
import j..util.Objects;

final class dxsl extends ibsl implements ibtw {
    int a;
    final dxst b;

    public dxsl(dxst dxst0, ibrl ibrl0) {
        this.b = dxst0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxsl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxsl(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                dxst dxst0 = this.b;
                dxst0.m();
                if(!dxst.I(dxst0.h) && !dxsy.j(dxst0.h) && !dxst.o(dxst0.h)) {
                    this.a = 2;
                    object0 = dxst0.A(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    break;
                }
                PaymentData paymentData0 = dxst0.i;
                if(paymentData0 == null) {
                    throw new IllegalStateException("Payment data is null");
                }
                Object object2 = Objects.requireNonNull(paymentData0);
                ibuq.e(object2, "requireNonNull(...)");
                long v = dxst0.l.nextLong();
                this.a = 1;
                return dxst0.G(((PaymentData)object2), v, this) != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        if(((GetOutstandingPurchaseOrderIdResponse)object0) == null) {
            dxmi.q(this.b, null, null, hagu.q, 3);
            return ibom.a;
        }
        dxst dxst1 = this.b;
        PaymentData paymentData1 = dxst1.i;
        if(paymentData1 == null) {
            throw new IllegalStateException("Payment data is null");
        }
        Object object3 = Objects.requireNonNull(paymentData1);
        ibuq.e(object3, "requireNonNull(...)");
        long v1 = ((GetOutstandingPurchaseOrderIdResponse)object0).a;
        this.a = 3;
        return dxst1.F(((PaymentData)object3), v1, this) == object1 ? object1 : ibom.a;
    }
}

