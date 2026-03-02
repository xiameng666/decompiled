import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.Gp3SupportInfo;

@cmcs(a = cmcr.c)
public final class eazg extends ebav {
    private final donp a;

    public eazg(String s, donp donp0, azug azug0) {
        super("GetGp3SupportInfo", s, azug0);
        this.a = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        String s = new edmh(dlnj.a(), dmgy.a(), easm.a()).a().h;
        Account account0 = TextUtils.isEmpty(s) ? null : new Account(s, "com.google");
        Gp3SupportInfo gp3SupportInfo0 = new Gp3SupportInfo();
        gp3SupportInfo0.a = account0;
        this.a.g(Status.b, gp3SupportInfo0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.g(status0, null);
    }
}

