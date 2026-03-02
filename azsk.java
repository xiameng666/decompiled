import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public final class azsk {
    public final gged_interceptors a;
    public final boolean b;
    public final boolean c;
    public final Bundle d;
    public final Account e;
    public final boolean f;
    public final String g;
    public final String h;
    public final int i;
    public final boolean j;
    public final gfsx k;
    public final ArrayList l;
    public final String m;
    public final boolean n;
    public final boolean o;
    private final Intent p;
    private final gfsx q;
    private final int r;

    public azsk(Intent intent0, int v) {
        this.p = intent0;
        this.r = v;
        String[] arr_s = intent0.getStringArrayExtra("allowableAccountTypes");
        this.a = arr_s == null ? null : gged_interceptors.k(arr_s);
        this.b = intent0.getBooleanExtra("alwaysPromptForAccount", false);
        this.c = intent0.getBooleanExtra("setGmsCoreAccount", false);
        this.d = intent0.getBundleExtra("addAccountOptions");
        this.e = (Account)intent0.getParcelableExtra("selectedAccount");
        this.f = intent0.getBooleanExtra("selectedAccountIsNotClickable", false);
        this.g = intent0.getStringExtra("descriptionTextOverride");
        String s = intent0.getStringExtra("realClientPackage");
        gftb.check(s);
        this.h = s;
        this.l = intent0.getParcelableArrayListExtra("allowableAccounts");
        this.m = intent0.getStringExtra("hostedDomainFilter");
        switch(v - 1) {
            case 0: {
                gfsx gfsx0 = gfqx.a;
                Bundle bundle0 = intent0.getBundleExtra("first_party_options_bundle");
                if(bundle0 == null) {
                    this.q = gfsx0;
                    this.n = false;
                    this.o = false;
                }
                else {
                    this.q = gfsx.m(new bxid(new Bundle(bundle0)));
                    this.n = bundle0.getBoolean("exclude_add_account");
                    this.o = bundle0.getBoolean("exclude_manage_accounts");
                }
                this.j = this.q.i() && ((bxid)this.q.d()).a.getBoolean("should_show_consent", false);
                this.k = this.q.i() ? gfsx.l(((bxid)this.q.d()).a.getString("title")) : gfsx0;
                if(this.q.i() && ((bxid)this.q.d()).a().i()) {
                    gfsx0 = ((bxid)this.q.d()).a();
                }
                else if(intent0.hasExtra("overrideTheme")) {
                    gfsx0 = gfsx.m(Integer.valueOf(intent0.getIntExtra("overrideTheme", 0)));
                }
                if(!gfsx0.i()) {
                    this.i = 0;
                    return;
                }
                int v1 = (int)(((Integer)gfsx0.d()));
                if(v1 != 1) {
                    switch(v1) {
                        case 1000: {
                            this.i = 0x7F1602D5;  // style:CommonAccount.Theme.AlertDialog.GoogleMaterial2
                            return;
                        }
                        case 1001: {
                            this.i = 0x7F1602D1;  // style:CommonAccount.Theme.AlertDialog.DayNight.GoogleMaterial2
                            return;
                        }
                        case 1002: {
                            this.i = 0x7F1602D6;  // style:CommonAccount.Theme.AlertDialog.Light.GoogleMaterial3
                            return;
                        }
                        case 1003: {
                            this.i = 0x7F1602D0;  // style:CommonAccount.Theme.AlertDialog.Dark.GoogleMaterial3
                            return;
                        }
                        case 1004: {
                            this.i = 0x7F1602D3;  // style:CommonAccount.Theme.AlertDialog.DayNight.GoogleMaterial3
                            return;
                        }
                        default: {
                            this.i = 0x7F1602D8;  // style:CommonAccount.Theme.AlertDialog.SmallerFont
                            return;
                        }
                    }
                }
                this.i = 0x7F1602D7;  // style:CommonAccount.Theme.AlertDialog.Light.SmallerFont
                return;
            }
            case 1: {
                this.i = 0x7F1602DA;  // style:CommonAccount.WearableBlackTheme
                this.k = gfqx.a;
                this.q = gfqx.a;
                this.j = false;
                this.n = false;
                this.o = false;
                return;
            }
            default: {
                this.i = 0x7F1602D8;  // style:CommonAccount.Theme.AlertDialog.SmallerFont
                this.k = gfqx.a;
                this.q = gfqx.a;
                this.j = false;
                this.n = false;
                this.o = false;
            }
        }
    }

    public final int a() {
        if(this.r == 2) {
            return 0;
        }
        switch(this.p.getIntExtra("overrideCustomTheme", 0)) {
            case 1: {
                return 0x7F0E01EF;  // layout:common_account_account_picker_game
            }
            case 2: {
                if(this.k.i()) {
                    switch(this.i) {
                        case 0x7F1602D3: {  // style:CommonAccount.Theme.AlertDialog.DayNight.GoogleMaterial3
                            return 0x7F0E01EE;  // layout:common_account_account_picker_first_party_aligned_with_one_google
                        }
                        case 0x7F1602D0:   // style:CommonAccount.Theme.AlertDialog.Dark.GoogleMaterial3
                        case 0x7F1602D1:   // style:CommonAccount.Theme.AlertDialog.DayNight.GoogleMaterial2
                        case 0x7F1602D6: {  // style:CommonAccount.Theme.AlertDialog.Light.GoogleMaterial3
                            return 0x7F0E01EE;  // layout:common_account_account_picker_first_party_aligned_with_one_google
                        }
                        default: {
                            return 0x7F0E01ED;  // layout:common_account_account_picker_first_party
                        }
                    }
                }
                return 0x7F0E01F0;  // layout:common_account_account_picker_generic
            }
            default: {
                return 0;
            }
        }
    }

    public final gfsx b() {
        gfsx gfsx0 = this.q;
        return gfsx0.i() ? gfsx.l(((bxid)gfsx0.d()).a.getString("privacy_policy_url")) : gfqx.a;
    }

    public final gfsx c() {
        gfsx gfsx0 = this.q;
        return gfsx0.i() ? gfsx.l(((bxid)gfsx0.d()).a.getString("terms_of_service_url")) : gfqx.a;
    }
}

