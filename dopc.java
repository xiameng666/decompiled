import android.accounts.Account;
import com.google.android.gms.pay.GetCardCentricBundleRequest;

public final class dopc implements azys {
    public final Account a;
    public final byte[] b;

    public dopc(Account account0, byte[] arr_b) {
        this.a = account0;
        this.b = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        GetCardCentricBundleRequest getCardCentricBundleRequest0 = new GetCardCentricBundleRequest();
        getCardCentricBundleRequest0.a = this.a;
        getCardCentricBundleRequest0.b = this.b;
        donm0.p(getCardCentricBundleRequest0, new dosm(((evqp)object1)), cclr.a(dota0.r));
    }
}

