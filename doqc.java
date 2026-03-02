import android.accounts.Account;
import com.google.android.gms.pay.GetLinkedValuablesRequest;

public final class doqc implements azys {
    public final Account a;
    public final String b;
    public final gfsx c;

    public doqc(Account account0, String s, gfsx gfsx0) {
        this.a = account0;
        this.b = s;
        this.c = gfsx0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        GetLinkedValuablesRequest getLinkedValuablesRequest0 = new GetLinkedValuablesRequest();
        getLinkedValuablesRequest0.a = this.a;
        getLinkedValuablesRequest0.b = this.b;
        gfsx gfsx0 = this.c;
        if(gfsx0.i()) {
            getLinkedValuablesRequest0.c = (int)(((Integer)gfsx0.d()));
        }
        ((donm)((dota)object0).H()).E(getLinkedValuablesRequest0, new dosm(((evqp)object1)), cclr.a(((dota)object0).r));
    }
}

