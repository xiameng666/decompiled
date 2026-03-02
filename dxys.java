import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.util.concurrent.Executor;

public final class dxys {
    private final Context a;
    private final frii b;

    public dxys(Context context0, frii frii0) {
        this.a = context0;
        this.b = frii0;
    }

    public final frli a(Account account0) {
        frce frce0 = new frce(this.a);
        frce0.c(account0);
        frce0.d("pay");
        frce0.e("pass_templates_dismissed_storage.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ftaj.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        return this.b.a(frif0);
    }

    public static gmcd b(frli frli0, String s) {
        return dxys.c(frli0, s, new dxyj());
    }

    public static gmcd c(frli frli0, String s, gfsi gfsi0) {
        return s.isEmpty() ? gmbu.i(Boolean.valueOf(false)) : glzd.f(frli0.a(), new dxyo(gfsi0, s), gmap.a);
    }

    public static void d(gmcd gmcd0, View view0, Executor executor0) {
        if(view0 == null) {
            return;
        }
        view0.setVisibility(8);
        glzd.f(gmcd0, new dxym(view0), executor0);
    }

    public static void e(frli frli0, String s) {
        dxyp dxyp0 = new dxyp();
        if(s.isEmpty()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftak.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftak ftak0 = (ftak)hftp0.b_message;
        s.getClass();
        ftak0.b = s;
        frli0.b(new dxyi(dxyp0, ((ftak)hftp0.N_build())), gmap.a);
    }
}

