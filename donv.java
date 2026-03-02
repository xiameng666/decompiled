import android.accounts.Account;
import com.google.android.gms.pay.DeleteCardCentricProductRequest;

public final class donv implements azys {
    public final Account a;
    public final String b;
    public final int c;

    public donv(Account account0, String s, int v) {
        this.a = account0;
        this.b = s;
        this.c = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        DeleteCardCentricProductRequest deleteCardCentricProductRequest0 = new DeleteCardCentricProductRequest();
        deleteCardCentricProductRequest0.a = this.a;
        deleteCardCentricProductRequest0.b = this.b;
        deleteCardCentricProductRequest0.c = this.c;
        donm0.f(deleteCardCentricProductRequest0, new dosn(((evqp)object1)), cclr.a(dota0.r));
    }
}

