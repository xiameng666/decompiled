import android.content.Context;

public final class ebhj extends ibue implements ibtw {
    public ebhj(Object object0) {
        super(2, object0, ebfq.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;Lcom/google/android/gms/pay/service/operation/idcard/ClearTransactionHistoryOperation$OperationComponent;)Lcom/google/android/gms/pay/service/operation/idcard/ClearTransactionHistoryOperation;", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((Context)object0), "p0");
        ibuq.f(((ftcd)object1), "p1");
        ebfq ebfq0 = (ebfq)this.b;
        ibuq.f(((Context)object0), "context");
        ibuq.f(((ftcd)object1), "request");
        fsxn fsxn0 = ((ftcd)object1).c == 14 ? ((fsxn)((ftcd)object1).d) : fsxn.a;
        ibuq.e(fsxn0, "getClearTransactionHistoryRequest(...)");
        Object object2 = new ebfr(fsxn0);
        new ebfu(ebhb.f(((Context)object0), ((ftcd)object1))).inject(object2);
        return object2;
    }
}

