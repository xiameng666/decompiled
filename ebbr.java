import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.Gp3SupportInfo;

public final class ebbr extends ebav {
    private final donp a;
    private final Gp3SupportInfo b;

    public ebbr(Gp3SupportInfo gp3SupportInfo0, String s, donp donp0, azug azug0) {
        super("SetGp3SupportInfo", s, azug0);
        this.b = gp3SupportInfo0;
        this.a = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        Account account0 = this.b.a;
        String s = account0 == null ? "" : account0.name;
        new edmh(dlnj.a(), dmgy.a(), easm.a()).d(new edme(s));
        this.a.x(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.x(status0);
    }
}

