import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.GetTransactionsRequest;

public final class doqe implements azys {
    public final GetTransactionsRequest a;
    public final azts b;

    public doqe(azts azts0, GetTransactionsRequest getTransactionsRequest0) {
        this.b = azts0;
        this.a = getTransactionsRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dosv dosv0 = new dosv(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.F(this.a, dosv0, apiMetadata0);
    }
}

