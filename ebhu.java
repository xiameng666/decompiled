import android.content.Context;

public final class ebhu extends ibue implements ibtw {
    public ebhu(Object object0) {
        super(2, object0, ebiq.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;Lcom/google/android/gms/pay/service/operation/idcard/SyncRpConfigOperation$OperationComponent;)Lcom/google/android/gms/pay/service/operation/idcard/SyncRpConfigOperation;", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((Context)object0), "p0");
        ibuq.f(((ftcd)object1), "p1");
        ebiq ebiq0 = (ebiq)this.b;
        ibuq.f(((Context)object0), "context");
        ibuq.f(((ftcd)object1), "request");
        if(!hwfk.az()) {
            return null;
        }
        Object object2 = new ebir();
        new ebgj(ebhb.f(((Context)object0), ((ftcd)object1))).inject(object2);
        return object2;
    }
}

