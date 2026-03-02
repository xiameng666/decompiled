import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public final class acby extends cjtm {
    private static final bboh a;
    private final baqr b;
    private final acbk c;
    private final acbo d;

    static {
        acby.a = bboh.b("AppInvite", bbcu.aK);
    }

    public acby(baqr baqr0, acbk acbk0, acbo acbo0) {
        super(106, "AppInviteGetSuggestedInvitees");
        this.b = baqr0;
        this.c = acbk0;
        this.d = acbo0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if(hour.f()) {
            ((ggtj)acby.a.i()).x("AppInviteGetSuggestedInviteesOperationDisabled");
            acbo acbo0 = this.d;
            if(acbo0 != null) {
                ArrayList arrayList0 = new ArrayList();
                acbo0.b(Status.f, arrayList0);
            }
        }
        else {
            ArrayList arrayList1 = this.c.c(this.b);
            Status status0 = arrayList1 == null ? Status.d : Status.b;
            acbo acbo1 = this.d;
            if(acbo1 != null) {
                acbo1.b(status0, arrayList1);
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        acbo acbo0 = this.d;
        if(acbo0 != null) {
            acbo0.b(status0, null);
        }
    }
}

