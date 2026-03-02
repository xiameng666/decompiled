import android.accounts.Account;
import android.text.TextUtils;

public final class egsg implements lqj {
    public final egsq a;

    public egsg(egsq egsq0) {
        this.a = egsq0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        String s = ((fntm)object0).c;
        Account account0 = egxj.a(s);
        egsq egsq0 = this.a;
        egsq0.b = account0;
        if(egsq0.b != null) {
            egsq0.z(true);
            if(egsq0.at) {
                egsq0.ah.c(true);
            }
            else {
                egsq0.ag.setChecked(true);
            }
            egsq0.d.l(((fntm)object0));
            egsq0.aj.setText(s);
            String s1 = ((fntm)object0).b;
            if(TextUtils.isEmpty(s1)) {
                egsq0.ak.setVisibility(8);
            }
            else {
                egsq0.ak.setVisibility(0);
                egsq0.ak.setText(s1);
            }
        }
        egsq0.ai.setVisibility(0);
    }
}

