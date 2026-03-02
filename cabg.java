import android.accounts.Account;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

public final class cabg implements evqf {
    final boolean a;
    final OptInChimeraActivity b;

    public cabg(OptInChimeraActivity optInChimeraActivity0, boolean z) {
        this.a = z;
        Objects.requireNonNull(optInChimeraActivity0);
        this.b = optInChimeraActivity0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Account[] arr_account = ((OptInInfo)object0) == null ? null : ((OptInInfo)object0).c;
        if(arr_account != null && arr_account.length != 0) {
            if(!this.a) {
                OptInChimeraActivity optInChimeraActivity0 = this.b;
                if(optInChimeraActivity0.o.g(0x7F0B0FEE) != null) {  // id:content_wrapper
                    cabx cabx0 = optInChimeraActivity0.n;
                    cabx0.d.setAlpha(1.0f);
                    cabx0.c.setVisibility(0);
                    cabx0.f = 2;
                    return;
                }
            }
            if(((OptInInfo)object0).a != 1) {
                String s = this.b.getIntent().getStringExtra("defaultAccount");
                boolean z = this.b.getIntent().getBooleanExtra("lastChance", false);
                cabp cabp0 = new cabp();
                Bundle bundle0 = new Bundle();
                bundle0.putString("defaultAccount", s);
                bundle0.putBoolean("lastChance", z);
                bundle0.putParcelableArrayList("eligibleAccounts", new ArrayList(Arrays.asList(arr_account)));
                cabp0.setArguments(bundle0);
                this.b.p(cabp0);
                return;
            }
            OptInChimeraActivity optInChimeraActivity1 = this.b;
            if(bzvh.b(optInChimeraActivity1)) {
                if(optInChimeraActivity1.getIntent().getBooleanExtra("downloadSupervisorShowPrompt", false)) {
                    cabs cabs0 = new cabs();
                    Bundle bundle1 = new Bundle();
                    bundle1.putParcelable("browserIntent", null);
                    cabs0.setArguments(bundle1);
                    optInChimeraActivity1.p(cabs0);
                    return;
                }
                optInChimeraActivity1.a();
                return;
            }
            optInChimeraActivity1.g();
            return;
        }
        Log.w("OptInChimeraActivity", String.format("No accounts found. Showing error."));
        this.b.m(1);
    }
}

