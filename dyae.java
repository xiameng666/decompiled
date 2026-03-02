import android.accounts.Account;
import android.content.Context;
import android.net.Uri;

public final class dyae {
    private final Context a;
    private final frii b;

    public dyae(Context context0, frii frii0) {
        this.a = context0;
        this.b = frii0;
    }

    public final frli a(Account account0) {
        ibuq.f(account0, "account");
        frce frce0 = new frce(this.a);
        frce0.c(account0);
        frce0.d("pix_invite_status");
        frce0.e("pix_invite_status.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dxfk.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        frie0.e(((MessageLite)(((dxfk)hftv0))));
        if(hwfk.p()) {
            frie0.h(new frjp(cjtd.a));
        }
        frif frif0 = frie0.a();
        frli frli0 = this.b.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        return frli0;
    }
}

