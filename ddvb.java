import android.content.Context;
import com.google.android.gms.nearby.sharing.main.MainChimeraActivity;
import j..util.Objects;

final class ddvb implements acl {
    final ddvc a;

    public ddvb(ddvc ddvc0) {
        Objects.requireNonNull(ddvc0);
        this.a = ddvc0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        ddvc ddvc0 = this.a;
        if(!ddvc0.f) {
            ddvc0.f = true;
            ((ddva)ddvc0.h()).e(((MainChimeraActivity)ddvc0));
        }
    }
}

