import android.accounts.Account;
import com.google.android.gms.pay.ValidateCardCentricRequest;

public final class doob implements azys {
    public final Account a;
    public final byte[] b;

    public doob(Account account0, byte[] arr_b) {
        this.a = account0;
        this.b = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        ValidateCardCentricRequest validateCardCentricRequest0 = new ValidateCardCentricRequest();
        validateCardCentricRequest0.a = this.a;
        validateCardCentricRequest0.b = this.b;
        donm0.aZ(validateCardCentricRequest0, new dosm(((evqp)object1)), cclr.a(dota0.r));
    }
}

