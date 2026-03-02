import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.io.IOException;
import java.util.Locale;

public final class gapt implements gamu {
    private final Context a;

    public gapt(Context context0) {
        this.a = context0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        Account account0 = gano0.f().a;
        String s = gano0.a.getStringExtra("extra_auth_scope");
        String s1 = null;
        try {
            s1 = acsf.a(this.a, account0, String.format(Locale.US, "weblogin:service=%s&continue=null", s), null);
        }
        catch(acse | IOException unused_ex) {
        }
        if(!TextUtils.isEmpty(s1)) {
            Intent intent0 = ganp.e(0);
            intent0.putExtra("extra_web_login_url", s1);
            return new ganp(intent0);
        }
        return ganp.j();
    }

    public static gano b(WidgetConfig widgetConfig0, String s) {
        gftb.b(((boolean)(TextUtils.isEmpty(s) ^ 1)), "A valid authScope is required.");
        Intent intent0 = gano.b("LoadWebLoginUrlAction", widgetConfig0);
        intent0.putExtra("extra_auth_scope", s);
        return new gano(intent0);
    }

    public static String c(ganp ganp0) {
        gftb.b(ganp0.b() == 0, "A successful ActionResponse is required when try to get a web login URL.");
        String s = ganp0.a.getStringExtra("extra_web_login_url");
        gftb.z(s, "A successful ActionResponse must contain a non-null web login URL.");
        return s;
    }
}

