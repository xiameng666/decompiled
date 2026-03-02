import android.accounts.Account;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.UpdateClosedLoopBundleRequest;

public final class doot implements azys {
    public final Account a;
    public final String b;
    public final long c;
    public final ProtoSafeParcelable d;
    public final long e;
    public final long f;
    public final ProtoSafeParcelable g;
    public final azts h;

    public doot(azts azts0, Account account0, String s, long v, ProtoSafeParcelable protoSafeParcelable0, long v1, long v2, ProtoSafeParcelable protoSafeParcelable1) {
        this.h = azts0;
        this.a = account0;
        this.b = s;
        this.c = v;
        this.d = protoSafeParcelable0;
        this.e = v1;
        this.f = v2;
        this.g = protoSafeParcelable1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        UpdateClosedLoopBundleRequest updateClosedLoopBundleRequest0 = new UpdateClosedLoopBundleRequest();
        updateClosedLoopBundleRequest0.a = this.a;
        updateClosedLoopBundleRequest0.b = this.b;
        updateClosedLoopBundleRequest0.c = this.c;
        updateClosedLoopBundleRequest0.d = this.d.a;
        updateClosedLoopBundleRequest0.e = this.e;
        updateClosedLoopBundleRequest0.f = this.f;
        updateClosedLoopBundleRequest0.g = this.g.a;
        donm0.aV(updateClosedLoopBundleRequest0, new dose(this.h, ((evqp)object1)), cclr.a(dota0.r));
    }
}

