import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.ViewFopListRequest;

public final class ebce extends ebav {
    private final ViewFopListRequest a;
    private final donp b;

    public ebce(ViewFopListRequest viewFopListRequest0, String s, donp donp0, azug azug0) {
        super("ViewFopList", s, azug0);
        this.a = viewFopListRequest0;
        this.b = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        Account account0 = this.a.a;
        if(account0 == null) {
            throw new cjuh(10, "account is null");
        }
        PendingIntent pendingIntent0 = fqaw.a(context0, account0.name.hashCode(), dlnf.J(context0, account0), 0x4C000000);
        this.b.p(Status.b, pendingIntent0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.p(status0, null);
    }
}

