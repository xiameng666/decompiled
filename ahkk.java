import android.accounts.Account;
import android.app.AlertDialog.Builder;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

public final class ahkk implements View.OnClickListener {
    public final CredentialsSettingsChimeraActivity a;
    public final String b;

    public ahkk(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity0, String s) {
        this.a = credentialsSettingsChimeraActivity0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        kau kau0 = this.a.a(this.b);
        CharSequence charSequence0 = (CharSequence)kau0.a;
        Drawable drawable0 = (Drawable)kau0.b;
        Account account0 = this.a.q;
        batl.s(account0);
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(this.a).setMessage(Html.fromHtml(String.format("Do you want to be able to save passwords for %1$s?", charSequence0))).setPositiveButton(0x104000A, new ahke(this.a, this.b, account0)).setNegativeButton(0x1040000, null);
        if(drawable0 != null) {
            alertDialog$Builder0.setIcon(drawable0);
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            alertDialog$Builder0.setTitle(charSequence0);
        }
        alertDialog$Builder0.show();
        aggh.a().c(CredentialsSettingsChimeraActivity.r(506));
    }
}

