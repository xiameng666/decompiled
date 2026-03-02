import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public final class cabp extends cacb {
    public String a;
    private TextView ai;
    private View aj;
    private boolean ak;
    public bztw b;
    public ArrayList c;

    public cabp() {
        this.ak = false;
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.c = this.getArguments().getParcelableArrayList("eligibleAccounts");
        if(bundle0 != null) {
            this.a = bundle0.getString("authAccount");
        }
        else if(this.a == null) {
            String s = this.getArguments().getString("defaultAccount");
            this.a = ((Account)this.c.get(0)).name;
            if(!TextUtils.isEmpty(s)) {
                ArrayList arrayList0 = this.c;
                int v = arrayList0.size();
                int v1 = 0;
                while(v1 < v) {
                    boolean z = TextUtils.equals(((Account)arrayList0.get(v1)).name, s);
                    ++v1;
                    if(z) {
                        this.a = s;
                        break;
                    }
                }
            }
        }
        this.b = new bztw(this.getContext());
        TextView textView0 = (TextView)this.aj.findViewById(0x7F0B0A87);  // id:account_picker
        this.ai = textView0;
        textView0.setPaintFlags(textView0.getPaintFlags() | 8);
        this.ai.setOnClickListener(new cabi(this));
        this.z();
        boolean z1 = this.getArguments().getBoolean("lastChance", false);
        this.d.r(0x7F151B1D, new cabj(this));  // string:opt_in_confirm "Yes, I\'m in"
        this.d.q((z1 ? 0x7F1508A3 : 0x7F1508A4), new cabm(this, z1));  // string:common_no_thanks "No thanks"
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0 && v1 == -1) {
            this.ah.l("OptInFragment.accountChosen");
            this.a = intent0.getStringExtra("authAccount");
            this.z();
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E097C, viewGroup0, false);  // layout:setup_opt_in_fragment
        this.aj = view0;
        ((TextView)view0.findViewById(0x7F0B10E6)).setText(0x7F151B1F);  // id:description
        TextView textView0 = (TextView)this.aj.findViewById(0x7F0B0B77);  // id:agreement
        textView0.setText(Html.fromHtml(this.getResources().getString(0x7F151B1C, new Object[]{cabc.a("https://play.google.com/about/play-terms.html", "Play Terms of Service"), cabc.a("https://support.google.com/googleplay/?p=instant_apps", "Learn more")})));  // string:opt_in_agreement "By continuing, you accept the %1$s. %2$s"
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        return this.aj;
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        if(!this.ak) {
            this.ah.l("OptInFragment.noSelection");
        }
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        this.ak = true;
        String s = this.a;
        if(s != null) {
            bundle0.putString("authAccount", s);
        }
    }

    static void y(cabp cabp0) {
        cabp0.ak = true;
    }

    private final void z() {
        Resources resources0 = this.getResources();
        String s = this.a;
        if(s == null) {
            this.ai.setText("Create an account");
            return;
        }
        this.ai.setText(s);
        String s1 = resources0.getString(0x7F151B1A, new Object[]{this.a});  // string:opt_in_account_content_description "Select account. Currently selected: %1$s"
        this.ai.setContentDescription(s1);
    }
}

