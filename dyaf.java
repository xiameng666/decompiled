import android.accounts.Account;
import android.content.Context;
import android.net.Uri;

public final class dyaf {
    private final Context a;
    private final frii b;

    public dyaf(Context context0, frii frii0) {
        this.a = context0;
        this.b = frii0;
    }

    public final frli a(Account account0) {
        frce frce0 = new frce(this.a);
        frce0.c(account0);
        frce0.d("pay");
        frce0.e("pix_kyc_status_action_state.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dxfm.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        return this.b.a(frif0);
    }
}

