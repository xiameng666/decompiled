import android.accounts.Account;
import com.google.android.gms.common.api.ApiMetadata;

public final class aleu implements azys {
    public final gqus a;
    public final boolean b;
    public final Account c;

    public aleu(gqus gqus0, boolean z, Account account0) {
        this.a = gqus0;
        this.b = z;
        this.c = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        alhr alhr0 = (alhr)object0;
        aley aley0 = new aley(((evqp)object1));
        alhu alhu0 = (alhu)alhr0.H();
        String s = this.c.name;
        ApiMetadata apiMetadata0 = cclr.a(alhr0.r);
        alhu0.e(aley0, this.a.name(), this.b, s, apiMetadata0);
    }
}

