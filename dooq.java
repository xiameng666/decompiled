import android.accounts.Account;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.RecordBulletinInteractionsRequest;

public final class dooq implements azys {
    public final Account a;
    public final byte[] b;
    public final azts c;

    public dooq(azts azts0, Account account0, byte[] arr_b) {
        this.c = azts0;
        this.a = account0;
        this.b = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        RecordBulletinInteractionsRequest recordBulletinInteractionsRequest0 = new RecordBulletinInteractionsRequest();
        recordBulletinInteractionsRequest0.a = this.a;
        ProtoSafeParcelable protoSafeParcelable0 = new ProtoSafeParcelable();
        protoSafeParcelable0.a = this.b;
        recordBulletinInteractionsRequest0.b = protoSafeParcelable0;
        donm0.ap(recordBulletinInteractionsRequest0, new dosu(this.c, ((evqp)object1)), cclr.a(dota0.r));
    }
}

