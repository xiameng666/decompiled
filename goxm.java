import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.ResetPasswordResponse;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import java.util.List;
import java.util.Locale;

public final class goxm {
    public final adsz a;
    public final goxn b;
    public final Context c;
    private final String d;
    private final String e;

    public goxm() {
        throw null;
    }

    public goxm(Context context0, goxn goxn0, String s, goxi goxi0) {
        batl.s(context0);
        this.c = context0;
        this.b = goxn0;
        batl.q(s);
        this.d = s;
        this.e = String.format("Android/%s/%s", "GmsCore", (goxi0.a == -1 ? Integer.toString(goxi0.b) : String.format("X%s", Integer.toString(goxi0.a))));
        Bundle bundle0 = new Bundle();
        adsy.a(goxn0.a, bundle0);
        this.a = new adsz(bundle0);
    }

    public final ProxyRequest a(String s, byte[] arr_b, String s1) {
        goxn goxn0 = this.b;
        boolean z = this.c.getSharedPreferences(String.format("com.google.firebase.auth.internal.proxyApiHelper.%s", goxn0.a), 0).getBoolean("com.google.firebase.auth.internal.FIREBASE_UI_BIT", false);
        Boolean.valueOf(z).getClass();
        String s2 = z ? this.e + "/FirebaseUI-Android" : this.e + "/FirebaseCore-Android";
        aide aide0 = new aide(s);
        aide0.c = arr_b;
        aide0.a = 1;
        aide0.b("X-Android-Package", goxn0.a);
        Locale locale0 = Locale.getDefault();
        StringBuilder stringBuilder0 = new StringBuilder();
        goxj.a(stringBuilder0, locale0);
        if(!locale0.equals(Locale.US)) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append(", ");
            }
            goxj.a(stringBuilder0, Locale.US);
        }
        aide0.b("Accept-Language", stringBuilder0.toString());
        aide0.b("X-Client-Version", s2);
        aide0.b("X-Android-Cert", goxn0.b);
        aide0.b("X-Firebase-Locale", s1);
        aide0.b("Content-Type", "application/x-protobuf");
        return aide0.a();
    }

    public final evql b(goxo goxo0, goxb goxb0, String s, String s1) {
        return this.c(goxo0, goxb0, s, s1, null);
    }

    public final evql c(goxo goxo0, goxb goxb0, String s, String s1, String s2) {
        Parser hfvs0 = goxb0.a();
        gotn gotn0 = new gotn(this, goxb0);
        return goxm.d(this.c, this.a, this.a(this.e(s, s1), goxo0.a().toBytesArray(), s2), hfvs0).e(gotn0);
    }

    public static evql d(Context context0, adsz adsz0, ProxyRequest proxyRequest0, Parser hfvs0) {
        return new azts(context0, adsz0).jv(proxyRequest0).e(new gotp(proxyRequest0, hfvs0));
    }

    public final String e(String s, String s1) {
        return String.format("%s/%s?alt=proto&key=%s", s, s1, this.d);
    }

    public final void f(goxz goxz0, goxl goxl0) {
        this.b(goxz0, new GetTokenResponse(), hsyg.d(), "token").z(new gotm(this, goxl0));
    }

    public final void g(goya goya0, goxl goxl0) {
        this.b(goya0, new GetAccountInfoResponse(), hsyg.c(), "getAccountInfo").z(new gotx(this, goxl0));
    }

    public final void h(goye goye0, goxl goxl0) {
        String s = goye0.c == null ? null : goye0.c.h;
        this.c(goye0, new goyf(), hsyg.c(), "getOobConfirmationCode", s).z(new gote(this, goxl0));
    }

    public final void i(goyl goyl0, goxl goxl0) {
        this.b(goyl0, new ResetPasswordResponse(), hsyg.c(), "resetPassword").z(new gotu(this, goxl0));
    }

    public final void j(goyp goyp0, goxl goxl0) {
        this.b(goyp0, new goyq(), hsyg.c(), "setAccountInfo").z(new gotc(this, goxl0));
    }

    public final void k(goyr goyr0, goxl goxl0) {
        this.b(goyr0, new goys(), hsyg.c(), "signupNewUser").z(new gots(this, goxl0));
    }

    public final void l(Context context0, VerifyAssertionRequest verifyAssertionRequest0, goxl goxl0) {
        this.b(verifyAssertionRequest0, new goyz(), hsyg.c(), "verifyAssertion").z(new gotr(this, context0, goxl0));
    }

    public final void m(Context context0, goze goze0, goxl goxl0) {
        this.b(goze0, new gozf(), hsyg.c(), "verifyPhoneNumber").z(new gotw(this, context0, goxl0, goze0));
    }

    public static void n(Context context0, List list0, String s) {
        for(Object object0: list0) {
            MfaInfo mfaInfo0 = (MfaInfo)object0;
            if(!TextUtils.isEmpty(mfaInfo0.e)) {
                goss.a.g(context0, s, mfaInfo0.b, mfaInfo0.e);
            }
        }
    }
}

