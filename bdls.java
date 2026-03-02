import android.net.Uri.Builder;
import android.net.Uri;
import java.util.Locale;

final class bdls extends ibuo implements ibth {
    public bdls(Object object0) {
        super(0, object0, bdmg.class, "openHelpLink", "openHelpLink()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        bxox bxox0 = ((bdmg)this.e).i;
        bgob bgob0 = ((bdmg)this.e).e;
        Uri.Builder uri$Builder0 = Uri.parse("https://support.google.com/chrome/?p=credential_exchange_android").buildUpon().appendQueryParameter("co", "GENIE.Platform=Android");
        Locale locale0 = jyw.a(bgob0.a.a.getResources().getConfiguration()).g(0);
        String s = locale0 == null ? null : jzd.b(new Locale[]{locale0}).f();
        if(s != null) {
            uri$Builder0.appendQueryParameter("hl", s);
        }
        Uri uri0 = uri$Builder0.build();
        ibuq.e(uri0, "build(...)");
        bxox0.l(uri0);
        return ibom.a;
    }
}

