import android.accounts.Account;
import com.google.android.gms.pay.ClearBulletinInteractionForDevRequest;

public final class dooe implements azys {
    public final Account a;
    public final azts b;

    public dooe(azts azts0, Account account0) {
        this.b = azts0;
        this.a = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        ClearBulletinInteractionForDevRequest clearBulletinInteractionForDevRequest0 = new ClearBulletinInteractionForDevRequest();
        clearBulletinInteractionForDevRequest0.a = this.a;
        donm0.c(clearBulletinInteractionForDevRequest0, new dosk(this.b, ((evqp)object1)), cclr.a(dota0.r));
    }
}

