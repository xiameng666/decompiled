import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;
import java.util.List;

final class gowb implements goxl {
    final goxl a;
    final GetTokenResponse b;
    final String c;
    final goxa d;
    final gowc e;

    public gowb(gowc gowc0, goxl goxl0, GetTokenResponse getTokenResponse0, String s, goxa goxa0) {
        this.a = goxl0;
        this.b = getTokenResponse0;
        this.c = s;
        this.d = goxa0;
        Objects.requireNonNull(gowc0);
        this.e = gowc0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.d.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        List list0 = ((GetAccountInfoResponse)object0).c();
        if(list0 != null && !list0.isEmpty()) {
            GetAccountInfoUser getAccountInfoUser0 = (GetAccountInfoUser)list0.get(0);
            goyp goyp0 = new goyp();
            goyp0.d(this.b.b);
            batl.q(this.c);
            goyp0.e.a.add(this.c);
            this.e.c.f(this.d, this.b, getAccountInfoUser0, goyp0, this.a);
            return;
        }
        this.a.a("No users.");
    }
}

