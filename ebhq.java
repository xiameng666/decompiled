import android.content.Context;

public final class ebhq extends ibue implements ibtw {
    public ebhq(Object object0) {
        super(2, object0, ebgy.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;Lcom/google/android/gms/pay/service/operation/idcard/GetRpInfoOperation$OperationComponent;)Lcom/google/android/gms/pay/service/operation/idcard/GetRpInfoOperation;", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((Context)object0), "p0");
        ibuq.f(((ftcd)object1), "p1");
        ebgy ebgy0 = (ebgy)this.b;
        ibuq.f(((Context)object0), "context");
        ibuq.f(((ftcd)object1), "request");
        Object object2 = new ebgz((((ftcd)object1).c == 16 ? ((ftbn)((ftcd)object1).d) : ftbn.a).c);
        new ebfz(ebhb.f(((Context)object0), ((ftcd)object1))).inject(object2);
        return object2;
    }
}

