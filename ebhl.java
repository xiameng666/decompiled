import android.content.Context;

public final class ebhl implements ebhd, ibum {
    final ebgm a;

    public ebhl(ebgm ebgm0) {
        this.a = ebgm0;
        super();
    }

    @Override  // ebhd
    public final ebhb a(Context context0, ftcd ftcd0) {
        ibuq.f(context0, "p0");
        ibuq.f(ftcd0, "p1");
        ibuq.f(context0, "context");
        ibuq.f(ftcd0, "request");
        String s = ftcd0.e;
        ibuq.e(s, "getAccountName(...)");
        return new ebgn(context0, s);
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(2, this.a, ebgm.class, "newInstance", "newInstance(Landroid/content/Context;Lcom/google/android/libraries/tapandpay/proto/IdCardOperationRequest;)Lcom/google/android/gms/pay/service/operation/idcard/DeviceLockRemovalOperation;", 0);
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

