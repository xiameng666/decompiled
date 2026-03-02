import android.accounts.Account;
import com.google.android.gms.pay.GetTransactionsRequest;
import com.google.android.gms.pay.GoogleTransactionId;

public final class dopb implements azys {
    public final Account a;
    public final String b;
    public final String c;
    public final azts d;

    public dopb(azts azts0, Account account0, String s, String s1) {
        this.d = azts0;
        this.a = account0;
        this.b = s;
        this.c = s1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        GetTransactionsRequest getTransactionsRequest0 = new GetTransactionsRequest();
        getTransactionsRequest0.a = this.a;
        GoogleTransactionId googleTransactionId0 = new GoogleTransactionId();
        googleTransactionId0.a = this.b;
        googleTransactionId0.b = this.c;
        getTransactionsRequest0.b = googleTransactionId0;
        donm0.T(getTransactionsRequest0, new dosw(this.d, ((evqp)object1)), cclr.a(dota0.r));
    }
}

