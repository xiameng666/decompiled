import android.accounts.Account;
import com.google.android.gms.pay.GetSortOrderRequest;
import com.google.android.gms.pay.SortOrderInfo;

public final class doqg implements azys {
    public final Account a;
    public final int b;
    public final azts c;

    public doqg(azts azts0, Account account0, int v) {
        this.c = azts0;
        this.a = account0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        GetSortOrderRequest getSortOrderRequest0 = new GetSortOrderRequest();
        getSortOrderRequest0.b = this.a;
        SortOrderInfo sortOrderInfo0 = new SortOrderInfo();
        sortOrderInfo0.a = this.b;
        getSortOrderRequest0.a = sortOrderInfo0;
        donm0.S(getSortOrderRequest0, new dorx(this.c, ((evqp)object1)), cclr.a(dota0.r));
    }
}

