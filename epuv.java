import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import com.google.android.gms.common.api.Status;

final class epuv extends bxoi {
    private final Account a;
    private final int b;
    private final boolean c;
    private final String d;
    private final epuy f;

    public epuv(epvc epvc0, Account account0, int v, boolean z, epuy epuy0) {
        super(44, "SaveDefaultAccount");
        this.a = account0;
        this.b = v;
        this.c = z;
        batl.q(epvc0.c);
        this.d = epvc0.c;
        this.f = epuy0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        CharSequence charSequence0;
        String s1;
        String s = this.d;
        Account account0 = this.a;
        bbmn.k(context0, s, account0);
        this.f.d.a(s, this.b);
        if(this.c) {
            try {
                s1 = account0.name;
                charSequence0 = null;
                charSequence0 = bbsr.b(context0).g(s);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(charSequence0 == null) {
                charSequence0 = "App";
            }
            String s2 = context0.getString(0x7F152E14, new Object[]{charSequence0, s1});  // string:signin_cross_client_auth_toast_text "Welcome back to %1$s. You\'re signed 
                                                                                          // in with Google as %2$s."
            new clht(Looper.getMainLooper()).post(new epux(context0, s2));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
    }
}

