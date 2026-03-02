import com.google.android.gms.wallet.IsReadyToPayRequest;

final class dlqd extends ibsl implements ibtw {
    int a;
    final dlqf b;

    public dlqd(dlqf dlqf0, ibrl ibrl0) {
        this.b = dlqf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlqd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlqd(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            fawm fawm0 = IsReadyToPayRequest.a();
            batl.t(dlqf.b, "isReadyToPayRequestJson cannot be null!");
            fawm0.a.f = dlqf.b;
            azzc azzc0 = new azzc();
            azzc0.d = 23705;
            azzc0.a = new faxi(fawm0.a);
            azzd azzd0 = azzc0.a();
            evql evql0 = this.b.i.iG(azzd0);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            ((ggtj)dlqf.a.i()).B("Error while issuing IsReadyToPayRequest", throwable0);
        }
        return ibom.a;
    }
}

