import android.content.Context;

public final class ebhf extends ibue implements ibtw {
    public ebhf(Object object0) {
        super(2, object0, ebfg.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;Lcom/google/android/gms/pay/service/operation/idcard/AddTransactionHistoryEntryOperation$OperationComponent;)Lcom/google/android/gms/pay/service/operation/idcard/AddTransactionHistoryEntryOperation;", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((Context)object0), "p0");
        ibuq.f(((ftcd)object1), "p1");
        ebfg ebfg0 = (ebfg)this.b;
        ibuq.f(((Context)object0), "context");
        ibuq.f(((ftcd)object1), "request");
        fswt fswt0 = ((ftcd)object1).c == 13 ? ((fswt)((ftcd)object1).d) : fswt.a;
        ibuq.e(fswt0, "getAddTransactionHistoryEntryRequest(...)");
        Object object2 = new ebfh(fswt0);
        new ebfs(ebhb.f(((Context)object0), ((ftcd)object1))).inject(object2);
        return object2;
    }
}

