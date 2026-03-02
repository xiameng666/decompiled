import android.accounts.Account;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.ReversePurchaseRequest;

public final class dopi implements azys {
    public final Account a;
    public final int b;
    public final long c;
    public final byte[] d;
    public final azts e;

    public dopi(azts azts0, Account account0, int v, long v1, byte[] arr_b) {
        this.e = azts0;
        this.a = account0;
        this.b = v;
        this.c = v1;
        this.d = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        ReversePurchaseRequest reversePurchaseRequest0 = new ReversePurchaseRequest();
        reversePurchaseRequest0.a = this.a;
        reversePurchaseRequest0.b = this.b;
        reversePurchaseRequest0.c = this.c;
        ProtoSafeParcelable protoSafeParcelable0 = new ProtoSafeParcelable();
        protoSafeParcelable0.a = this.d;
        reversePurchaseRequest0.e = protoSafeParcelable0;
        donm0.ax(reversePurchaseRequest0, new dosa(this.e, ((evqp)object1)), cclr.a(dota0.r));
    }
}

