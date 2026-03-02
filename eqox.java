import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.directtransfer.AccountPickerOptions;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import java.util.ArrayList;

final class eqox implements eqpa {
    private final eqoy a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final String f;
    private final String g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final AccountPickerOptions k;
    private final UiCustomization l;
    private final int m;

    public eqox(eqoy eqoy0, String s, String s1, String s2, String s3, String s4, String s5, boolean z, boolean z1, boolean z2, AccountPickerOptions accountPickerOptions0, UiCustomization uiCustomization0, int v) {
        int v1;
        this.a = eqoy0;
        this.b = s;
        this.c = s1;
        this.f = s4;
        this.g = s5;
        this.d = s3;
        this.h = z;
        this.i = z1;
        this.j = z2;
        this.k = accountPickerOptions0;
        this.l = uiCustomization0;
        this.m = v;
        if("deviceIconPhone".equals(s2)) {
            v1 = 0x7F080BEB;
            this.e = v1;
            return;
        }
        if("deviceIconWatch".equals(s2)) {
            if(v != 2 && !gaec.t(eqoy0)) {
                v1 = 0x7F080E2F;
                this.e = v1;
                return;
            }
            v1 = 0x7F080F23;  // drawable:smartdevice_watch_icon_bc25
            this.e = v1;
            return;
        }
        if("deviceIconTv".equals(s2)) {
            v1 = 0x7F080C4F;
            this.e = v1;
            return;
        }
        if(!"deviceIconGoogleG".equals(s2)) {
            throw new IllegalArgumentException("Unknown device icon type (should be one of BootstrapConfigurations.DeviceIcon: " + s2);
        }
        v1 = 0x7F080491;  // drawable:googleg_standard_color_32_vd
        this.e = v1;
    }

    @Override  // eqpa
    public final du a(int v, Bundle bundle0) {
        int v2;
        du du0;
        ArrayList arrayList0 = bundle0 == null ? new ArrayList() : bundle0.getParcelableArrayList("extraAccountChallengeData");
        int v1 = 0;
        switch(v) {
            case 1: {
                if(bundle0 == null) {
                    v1 = 1;
                }
                erls erls0 = new erls();
                erls0.e(this.c);
                erls0.b(this.b);
                erls0.c(this.d);
                erls0.a = this.e;
                if(this.j) {
                    erls0.d(this.b(0x7F1507EB), 2003);  // string:common_back "Back"
                }
                else if(hyjt.a.b().a()) {
                    erls0.d(this.b(0x7F1507F2), 2002);  // string:common_cancel "Cancel"
                }
                du0 = erls0.a();
                v2 = v1;
                goto label_49;
            }
            case 2: {
                if(bundle0 == null) {
                    v1 = 1;
                }
                eqpr eqpr0 = new eqpr();
                eqpr0.a = this.e;
                eqpr0.b = this.c;
                eqpr0.c = this.b;
                eqpr0.f(this.b(0x7F1507F2), 2002);  // string:common_cancel "Cancel"
                eqpr0.e(this.b(0x7F152E29), 2001);  // string:smartdevice_action_copy "Copy"
                eqpr0.f = this.l;
                if(this.j) {
                    eqpr0.f(this.b(0x7F1507EB), 2003);  // string:common_back "Back"
                }
                du0 = eqpr0.a();
                v2 = v1;
                goto label_49;
            }
            case 3: {
                v2 = bundle0 == null ? 1 : 0;
                if(arrayList0 != null) {
                    v1 = arrayList0.size();
                }
                String s = TextUtils.isEmpty(this.f) ? this.a.getResources().getQuantityString(0x7F130096, v1) : this.f;  // plurals:smartdevice_d2d_copying_accounts
                if(this.a.q) {
                    du0 = eriu.b(null, null, s, this.g, this.e, true, true, this.i, this.l, this.m);
                    goto label_49;
                }
                boolean z = hygx.e() ? this.h : true;
                du0 = eriu.b(null, null, s, this.g, this.e, z, false, false, this.l, this.m);
                goto label_49;
            }
            case 4: {
                v2 = bundle0 == null ? 1 : 0;
                if(bundle0 == null || arrayList0 == null) {
                    throw new IllegalArgumentException("Argument and accounts shouldn\'t be null in STATE_ACCOUNT_CHALLENGE. ");
                }
                String s1 = bundle0.getString("extraRestoreAccount");
                bundle0.remove("extraAccountChallengeData");
                bundle0.remove("extraRestoreAccount");
                boolean z1 = hygx.e() ? this.h : true;
                du0 = eriu.b(arrayList0, s1, this.f, this.g, this.e, z1, false, false, this.l, this.m);
            label_49:
                if(1 != v2) {
                    Bundle bundle1 = du0.getArguments();
                    if(bundle1 == null) {
                        bundle1 = new Bundle();
                    }
                    bundle1.putAll(bundle0);
                    du0.setArguments(bundle1);
                }
                return du0;
            }
            case 6: {
                return erph.a(this.a.getContainerActivity(), 1);
            }
            case 8: {
                ArrayList arrayList1 = ggia.b(eqck.t(this.a));
                batl.v(arrayList1.size(), "Accounts list cannot be empty");
                int v3 = this.e;
                AccountPickerOptions accountPickerOptions0 = this.k;
                if(hygx.h() && accountPickerOptions0 != null && accountPickerOptions0.h) {
                    v1 = 1;
                }
                return eqqg.a(accountPickerOptions0, v3, arrayList1, ((boolean)v1), this.l);
            }
            default: {
                throw new IllegalStateException("Illegal state: an unknown fragment was started: " + v);
            }
        }
    }

    private final String b(int v) {
        return this.a.getString(v);
    }
}

