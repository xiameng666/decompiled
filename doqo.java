import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.SyncTransactionsRequest;

public final class doqo implements azys {
    public final SyncTransactionsRequest a;
    public final azts b;

    public doqo(azts azts0, SyncTransactionsRequest syncTransactionsRequest0) {
        this.b = azts0;
        this.a = syncTransactionsRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dost dost0 = new dost(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.aP(this.a, dost0, apiMetadata0);
    }
}

