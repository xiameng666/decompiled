import android.content.Context;

public final class ebhr extends ibue implements ibtw {
    public ebhr(Object object0) {
        super(2, object0, ebik.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;Lcom/google/android/gms/pay/service/operation/idcard/SyncCredmanRegistryOperation$OperationComponent;)Lcom/google/android/gms/pay/service/operation/idcard/SyncCredmanRegistryOperation;", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Context context0 = (Context)object0;
        ftcd ftcd0 = (ftcd)object1;
        ibuq.f(context0, "p0");
        ibuq.f(ftcd0, "p1");
        ebik ebik0 = (ebik)this.b;
        ibuq.f(context0, "context");
        ibuq.f(ftcd0, "request");
        Object object2 = new ebim();
        new ebgh(ebhb.f(context0, ftcd0), dpst.a(ebhb.f(context0, ftcd0))).inject(object2);
        return object2;
    }
}

