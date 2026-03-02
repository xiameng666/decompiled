import android.accounts.Account;
import com.google.android.gms.pay.GetBulletinsRequest;
import com.google.android.gms.pay.IntentSource;

public final class dopj implements azys {
    public final Account a;
    public final int b;
    public final IntentSource c;
    public final boolean d;
    public final int e;

    public dopj(Account account0, int v, IntentSource intentSource0, boolean z, int v1) {
        this.a = account0;
        this.b = v;
        this.c = intentSource0;
        this.d = z;
        this.e = v1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        GetBulletinsRequest getBulletinsRequest0 = new GetBulletinsRequest();
        getBulletinsRequest0.a = this.a;
        getBulletinsRequest0.c = this.b;
        getBulletinsRequest0.e = this.c;
        getBulletinsRequest0.b = this.d;
        getBulletinsRequest0.f = this.e;
        donm0.W(getBulletinsRequest0, new dosm(((evqp)object1)), cclr.a(dota0.r));
    }
}

