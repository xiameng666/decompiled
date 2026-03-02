import android.content.Context;

public final class ebhg extends ibue implements ibtw {
    public ebhg(Object object0) {
        super(2, object0, ebgs.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;Lcom/google/android/gms/pay/service/operation/idcard/GetBrowserInfoOperation$OperationComponent;)Lcom/google/android/gms/pay/service/operation/idcard/GetBrowserInfoOperation;", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((Context)object0), "p0");
        ibuq.f(((ftcd)object1), "p1");
        ebgs ebgs0 = (ebgs)this.b;
        ibuq.f(((Context)object0), "context");
        ibuq.f(((ftcd)object1), "request");
        Object object2 = new ebgt((((ftcd)object1).c == 17 ? ((ftba)((ftcd)object1).d) : ftba.a).c);
        new ebfw(ebhb.f(((Context)object0), ((ftcd)object1))).inject(object2);
        return object2;
    }
}

