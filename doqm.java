import android.accounts.Account;
import com.google.android.gms.pay.FetchMode;
import com.google.android.gms.pay.GetPaymentMethodsRequest;

public final class doqm implements azys {
    public final Account a;
    public final int b;

    public doqm(Account account0, int v) {
        this.a = account0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        GetPaymentMethodsRequest getPaymentMethodsRequest0 = new GetPaymentMethodsRequest();
        getPaymentMethodsRequest0.a = this.a;
        FetchMode fetchMode0 = new FetchMode();
        fetchMode0.a = this.b;
        getPaymentMethodsRequest0.b = fetchMode0;
        donm0.M(getPaymentMethodsRequest0, new dosm(((evqp)object1)), cclr.a(dota0.r));
    }
}

