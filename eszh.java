import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.Locale;

public final class eszh implements View.OnClickListener {
    public final eszq a;

    public eszh(eszq eszq0) {
        this.a = eszq0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eszq eszq0 = this.a;
        xob xob0 = (xob)eszq0.getContext();
        if(xob0 != null) {
            int v = view0.getId();
            if(v == 0x7F0B07FA) {  // id:SettingsItem
                String s = eszq0.c;
                String s1 = eszq0.d;
                Intent intent0 = new Intent().setClassName(xob0, "com.google.android.gms.tapandpay.settings.NotificationSettingsActivity");
                bauc.l(new AccountInfo(s1, s, 0), intent0, "extra_account_info");
                eszq0.startActivity(intent0);
                return;
            }
            if(v == 0x7F0B06BE) {  // id:PrivacyTermsItem
                eszq0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Uri.parse(hyvf.a.b().a()).buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).build().toString())));
            }
        }
    }
}

