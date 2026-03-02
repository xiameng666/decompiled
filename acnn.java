import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class acnn implements acnl {
    public static final bboh a;
    public final cjtn b;
    public final int c;
    public final String d;
    public final Account e;
    public final Account f;
    public final String[] g;
    public final boolean h;

    static {
        acnn.a = bboh.b("ValidateServiceOp", bbcu.h);
    }

    public acnn(cjtn cjtn0, int v, String s, Account account0, Account account1, String[] arr_s, boolean z) {
        this.b = cjtn0;
        this.c = v;
        this.d = s;
        batl.t(account0, "RequestedAccount cannot be null.");
        this.e = account0;
        this.f = account1;
        this.g = arr_s;
        this.h = z;
    }

    public static Bundle a(Context context0, Intent intent0) {
        Bundle bundle0 = new Bundle();
        if(intent0 != null) {
            bundle0.putParcelable("pendingIntent", cjok.a(context0, 0, intent0, 0xA000000));
        }
        return bundle0;
    }

    public final void b(Context context0, int v, Intent intent0) {
        Bundle bundle0 = acnn.a(context0, intent0);
        this.b.b(v, null, bundle0);
    }
}

