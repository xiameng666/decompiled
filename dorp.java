import android.accounts.Account;
import com.google.android.gms.pay.SaveCardCentricRequest;

public final class dorp implements azys {
    public final Account a;
    public final byte[] b;

    public dorp(Account account0, byte[] arr_b) {
        this.a = account0;
        this.b = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        SaveCardCentricRequest saveCardCentricRequest0 = new SaveCardCentricRequest();
        saveCardCentricRequest0.a = this.a;
        saveCardCentricRequest0.b = this.b;
        donm0.ay(saveCardCentricRequest0, new dosm(((evqp)object1)), cclr.a(dota0.r));
    }
}

