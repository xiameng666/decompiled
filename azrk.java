import android.accounts.Account;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;
import java.util.List;

public final class azrk implements lqj {
    public final azrl a;

    public azrk(azrl azrl0) {
        this.a = azrl0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        String s;
        bxiy bxiy0;
        AccountPickerChimeraActivity accountPickerChimeraActivity0 = this.a.b;
        azsj azsj0 = accountPickerChimeraActivity0.l;
        if(azsj0 != null) {
            ArrayList arrayList0 = ((List)object0) == null ? new ArrayList() : new ArrayList(((List)object0));
            TextView textView0 = (TextView)accountPickerChimeraActivity0.findViewById(0x7F0B1FA0);  // id:selected_account_name
            Bitmap bitmap0 = null;
            if(accountPickerChimeraActivity0.l() && accountPickerChimeraActivity0.n != null) {
                bblp bblp0 = new bblp(0x7FFFFFFF, 9);
                azrm azrm0 = new azrm();
                accountPickerChimeraActivity0.o = new fngs(accountPickerChimeraActivity0, bblp0, azrm0, azrm0);
                bxiy0 = (bxiy)gggq.c(arrayList0, new azrf(accountPickerChimeraActivity0)).g();
                if(bxiy0 == null) {
                    AccountPickerChimeraActivity.j.m("The selected account is not part of the accounts\' list.", new Object[0]);
                    View view0 = accountPickerChimeraActivity0.s;
                    if(view0 != null) {
                        view0.setVisibility(8);
                    }
                    TextView textView1 = accountPickerChimeraActivity0.p;
                    if(textView1 != null) {
                        textView1.setVisibility(0);
                    }
                    accountPickerChimeraActivity0.a();
                    accountPickerChimeraActivity0.g();
                    s = null;
                }
                else {
                    arrayList0.remove(bxiy0);
                    s = bxiy0.d;
                    TextView textView2 = accountPickerChimeraActivity0.p;
                    if(textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    ImageView imageView0 = accountPickerChimeraActivity0.r;
                    if(imageView0 != null) {
                        imageView0.setVisibility(8);
                    }
                    TextView textView3 = accountPickerChimeraActivity0.q;
                    if(textView3 != null) {
                        textView3.setVisibility(8);
                    }
                }
            }
            else {
                bxiy0 = null;
                s = null;
            }
            if(accountPickerChimeraActivity0.p == null) {
                arrayList0.add(0, new bxiy(null, accountPickerChimeraActivity0.getString(0x7F1507C2, new Object[]{accountPickerChimeraActivity0.k}), 1, null));  // string:common_account_account_chip_subtitle "to continue to %1$s"
            }
            accountPickerChimeraActivity0.getApplicationContext();
            if(!accountPickerChimeraActivity0.t.n && bbmn.l(accountPickerChimeraActivity0)) {
                arrayList0.add(new bxiy(null, null, 2, null));
            }
            if(accountPickerChimeraActivity0.l()) {
                if(accountPickerChimeraActivity0.x && !accountPickerChimeraActivity0.t.o) {
                    arrayList0.add(new bxiy(null, null, 3, null));
                }
                Account account0 = accountPickerChimeraActivity0.n;
                if(accountPickerChimeraActivity0.s != null && account0 != null && accountPickerChimeraActivity0.x) {
                    if(hyex.e()) {
                        TextView textView4 = (TextView)accountPickerChimeraActivity0.findViewById(0x7F0B1F9F);  // id:selected_account_email
                        String s1 = TextUtils.isEmpty(s) ? account0.name : s;
                        if(bxic.f(s1)) {
                            textView0.setVisibility(8);
                        }
                        else {
                            textView0.setVisibility(0);
                            textView0.setText(s1);
                        }
                        if(bxiy0 != null && !s1.equals(account0.name) && bxiy0.f) {
                            textView4.setVisibility(0);
                            textView4.setText(account0.name);
                        }
                        else {
                            textView4.setVisibility(8);
                        }
                    }
                    else {
                        textView0.setText((TextUtils.isEmpty(s) ? account0.name : s));
                    }
                    AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)accountPickerChimeraActivity0.findViewById(0x7F0B0A83);  // id:account_particle_disc
                    accountParticleDisc0.h(accountPickerChimeraActivity0.o, new azrm());
                    accountParticleDisc0.l(bxiy0);
                }
                String s2 = "";
                if(s != null && accountPickerChimeraActivity0.x && accountPickerChimeraActivity0.s == null) {
                    if(TextUtils.isEmpty(s)) {
                        s = accountPickerChimeraActivity0.n == null ? "" : accountPickerChimeraActivity0.n.name;
                    }
                    String s3 = accountPickerChimeraActivity0.n == null ? "" : accountPickerChimeraActivity0.n.name;
                    Account account1 = accountPickerChimeraActivity0.n;
                    if(account1 != null) {
                        s2 = account1.type;
                    }
                    bxiy bxiy1 = new bxiy(s, s3, 4, s2);
                    if(bxiy0 != null) {
                        bitmap0 = bxiy0.e;
                    }
                    bxiy1.e = bitmap0;
                    arrayList0.add(0, bxiy1);
                }
            }
            azsj0.e = arrayList0;
            azsj0.q();
        }
    }
}

