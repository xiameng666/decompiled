import android.content.Context;

public final class ebhh implements ebhd, ibum {
    final ebfi a;

    public ebhh(ebfi ebfi0) {
        this.a = ebfi0;
        super();
    }

    @Override  // ebhd
    public final ebhb a(Context context0, ftcd ftcd0) {
        ibuq.f(context0, "p0");
        ibuq.f(ftcd0, "p1");
        ibuq.f(context0, "context");
        ibuq.f(ftcd0, "request");
        fsxg fsxg0 = ftcd0.c == 5 ? ((fsxg)ftcd0.d) : fsxg.a;
        ibuq.e(fsxg0, "getCancelNotificationRequest(...)");
        return new ebfj(context0, fsxg0);
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(2, this.a, ebfi.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;)Lcom/google/android/gms/pay/service/operation/idcard/CancelNotificationOperation;", 0);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof ebhd) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }
}

