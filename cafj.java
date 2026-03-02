import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;

public final class cafj extends clso {
    public static final bboh a;
    public final Context b;
    public final cltr c;
    public final icig d;
    public final List e;
    public final icnj f;
    public final clsk g;
    public final icnl h;
    public final icnl i;
    public final icnl j;
    public final icnl k;
    private final gra l;
    private final caje m;

    static {
        cafj.a = cajd.a("cafj");
    }

    public cafj(Context context0, clsk clsk0, cmhi cmhi0, caje caje0) {
        ibuq.f(clsk0, "selectedAccountRepository");
        ibuq.f(cmhi0, "gmsCoreMetrics");
        super();
        this.b = context0;
        this.g = clsk0;
        this.m = caje0;
        cltr cltr0 = new cltr(lsc.a(this));
        this.c = cltr0;
        this.d = cltr0.b;
        new ParcelableSnapshotMutableState(null, gul.a);
        Boolean boolean0 = Boolean.valueOf(false);
        new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.l = new ParcelableSnapshotMutableState(boolean0, gul.a);
        new ParcelableSnapshotMutableState(null, gul.a);
        this.e = caiz.a(context0);
        this.h = icnm.a(null);
        this.i = icnm.a(null);
        this.j = icnm.a(null);
        icnl icnl0 = icnm.a(caie.a);
        this.k = icnl0;
        this.f = new icmp(icnl0);
    }

    public final caie a() {
        boolean z = ((Boolean)this.l.a()).booleanValue();
        cafd cafd0 = new cafd(this);
        Account account0 = (Account)this.i.b();
        cafe cafe0 = new cafe(this);
        return new caie(z, cafd0, account0, this.m, cafe0, 30);
    }

    @Override  // eopt
    public final void e(Bundle bundle0) {
        String s = bundle0 == null ? null : bundle0.getString("extra.accountName");
        icbb.b(lsc.a(this), null, null, new cafg(this, null), 3);
        icbb.b(lsc.a(this), null, null, new cafh(s, this, null), 3);
    }
}

