import android.content.Context;

public final class ebhm extends ibue implements ibtw {
    public ebhm(Object object0) {
        super(2, object0, ebgq.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;Lcom/google/android/gms/pay/service/operation/idcard/FetchTransactionHistoryOperation$OperationComponent;)Lcom/google/android/gms/pay/service/operation/idcard/FetchTransactionHistoryOperation;", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((Context)object0), "p0");
        ibuq.f(((ftcd)object1), "p1");
        ebgq ebgq0 = (ebgq)this.b;
        ibuq.f(((Context)object0), "context");
        ibuq.f(((ftcd)object1), "request");
        ftan ftan0 = ((ftcd)object1).c == 12 ? ((ftan)((ftcd)object1).d) : ftan.a;
        ibuq.e(ftan0, "getFetchTransactionHistoryRequest(...)");
        Object object2 = new ebgr(ftan0);
        new ebfv(ebhb.f(((Context)object0), ((ftcd)object1))).inject(object2);
        return object2;
    }
}

