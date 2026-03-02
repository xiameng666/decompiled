import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.DropDownPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import com.android.settingslib.widget.FooterPreference;
import com.android.settingslib.widget.SettingsSpinnerPreference;
import com.google.android.gms.auth.proximity.multidevice.RestrictedSwitchPreference;
import com.google.android.gms.auth.proximity.multidevice.RestrictedSwitchPreferenceCompat;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public final class allq extends skp implements albi {
    private boolean aA;
    public String ag;
    public ArrayList ah;
    public boolean ai;
    public boolean aj;
    public alkl ak;
    alrs al;
    public albk am;
    alax an;
    bbpj ao;
    private boolean ap;
    private String aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    public static final baun d;

    static {
        allq.d = new baun("ProximityAuth", new String[]{"SettingsMaterialNextFragment"});
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.ak = new alkl(this.getContext());
        this.al = alrs.b(this, new alkx(this));
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            Object[] arr_object = {this.getClass().getSimpleName()};
            allq.d.f("%s was called with null args", arr_object);
            return;
        }
        String s1 = bundle1.getString("SELECTED_ACCOUNT");
        ArrayList arrayList0 = bundle1.getStringArrayList("AVAILABLE_GOOGLE_ACCOUNTS");
        this.ap = bundle1.getBoolean("BETTER_TOGETHER_ENABLED");
        String s2 = bundle1.getString("DEVICE_NAME", this.getString(0x7F1508BE));  // string:common_phone_lowercase "phone"
        gftb.check(s2);
        this.aq = s2;
        this.ai = "PHONE_HUB".equals(bundle1.getString("ORIGIN"));
        this.ar = bundle1.getBoolean("WIFI_SYNC_ENABLED");
        this.as = bundle1.getBoolean("WIFI_SYNC_SUPPORTED");
        this.at = bundle1.getBoolean("WIFI_SYNC_CONTROLLED_BY_TIDEPOOL");
        this.au = bundle1.getBoolean("EXO_AVAILABLE");
        if(!hpzc.c()) {
            this.av = bundle1.getBoolean("EXO_ENABLED");
        }
        this.aj = bundle1.getBoolean("EXO_ASSOCIATED");
        this.aw = bundle1.getBoolean("EXO_FORCE_UPDATE");
        this.ax = bundle1.getBoolean("HAS_CAMERA_ROLL_CLIENT_SUPPORT");
        this.ay = bundle1.getBoolean("CAMERA_ROLL_ENABLED");
        this.az = bundle1.getBoolean("NOTIFICATIONS_ENABLED");
        this.aA = bundle1.getBoolean("PERSONAL_PROFILE_SYNC_ENABLED");
        if(gfta.c(s1)) {
            allq.d.f("Args are missing a selected account", new Object[0]);
            return;
        }
        gftb.check(s1);
        this.ag = s1;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.ah = arrayList0;
            int v = arrayList0.indexOf(this.ag);
            if(v < 0) {
                allq.d.f("Selected account not in Google account list, notifying account changed", new Object[0]);
                this.K(((String)this.ah.get(0)));
                return;
            }
            if(this.O()) {
                this.H(0x7F1900FC, s);  // xml:settings_preferences_gm3_expressive
                Preference preference0 = this.iO("key_account_spinner_category");
                gftb.check(preference0);
                preference0.T(true);
                sks sks0 = new sks(this.getContext(), 6);
                sks0.addAll(this.ah);
                SettingsSpinnerPreference settingsSpinnerPreference0 = (SettingsSpinnerPreference)this.iO("key_account_spinner");
                gftb.check(settingsSpinnerPreference0);
                settingsSpinnerPreference0.k(sks0);
                settingsSpinnerPreference0.b = new alln(this);
                if(settingsSpinnerPreference0.c != v) {
                    settingsSpinnerPreference0.c = v;
                    settingsSpinnerPreference0.d();
                }
            }
            else {
                this.H(0x7F1900FB, s);  // xml:settings_material_next_preferences
                DropDownPreference dropDownPreference0 = (DropDownPreference)this.iO("key_account_spinner");
                gftb.check(dropDownPreference0);
                if(hpzm.a.f().D() && this.ah.size() < 2) {
                    dropDownPreference0.O(false);
                    dropDownPreference0.H(false);
                }
                String[] arr_s = (String[])this.ah.toArray(new String[0]);
                dropDownPreference0.e(arr_s);
                dropDownPreference0.h = arr_s;
                dropDownPreference0.f(v);
                dropDownPreference0.n = new alle(this);
            }
            if(this.ap) {
                if(this.O()) {
                    Preference preference1 = this.iO("key_device_permissions_category");
                    gftb.check(preference1);
                    preference1.T(true);
                }
                if(this.as) {
                    boolean z = this.ar;
                    alkl alkl0 = this.ak;
                    Objects.requireNonNull(alkl0);
                    this.Q("key_wifi_sync_switch", z, new allf(alkl0));
                }
                if(this.au && (hpzc.c() || this.av) && this.an != null) {
                    this.L();
                    alax alax0 = this.an;
                    gftb.check(alax0);
                    alax0.a(() -> if(this.au) {
                        alax alax0 = this.an;
                        if(alax0 != null) {
                            int v = alax0.c();
                            if(this.O()) {
                                RestrictedSwitchPreferenceCompat restrictedSwitchPreferenceCompat0 = (RestrictedSwitchPreferenceCompat)this.iO("key_apps_stream_switch");
                                gftb.check(restrictedSwitchPreferenceCompat0);
                                boolean z = restrictedSwitchPreferenceCompat0.d;
                                if(z != (v ^ 1)) {
                                    RestrictedSwitchPreferenceCompat.c.h("setDisabledByAdmin() disabledByAdmin from %s to %s", new Object[]{Boolean.valueOf(z), Boolean.valueOf(((boolean)(v ^ 1)))});
                                    restrictedSwitchPreferenceCompat0.d = v ^ 1;
                                    restrictedSwitchPreferenceCompat0.k(((boolean)v));
                                    restrictedSwitchPreferenceCompat0.d();
                                }
                                restrictedSwitchPreferenceCompat0.T(true);
                            }
                            else {
                                RestrictedSwitchPreference restrictedSwitchPreference0 = (RestrictedSwitchPreference)this.iO("key_apps_stream_switch");
                                gftb.check(restrictedSwitchPreference0);
                                boolean z1 = restrictedSwitchPreference0.d;
                                if(z1 != (v ^ 1)) {
                                    RestrictedSwitchPreference.c.h("setDisabledByAdmin() disabledByAdmin from %s to %s", new Object[]{Boolean.valueOf(z1), Boolean.valueOf(((boolean)(v ^ 1)))});
                                    restrictedSwitchPreference0.d = v ^ 1;
                                    restrictedSwitchPreference0.k(((boolean)v));
                                    restrictedSwitchPreference0.d();
                                }
                                restrictedSwitchPreference0.T(true);
                            }
                            if(this.am != null && v != 0) {
                                this.N(this.aj);
                                if(this.aw) {
                                    this.am.c(this.ag);
                                }
                            }
                        }
                    });
                }
                if(this.ax) {
                    this.Q("key_camera_roll_switch", this.ay, new allh(this));
                }
                if(hpzm.y() && bbqa.c()) {
                    this.Q("key_notifications_switch", this.az, new alli(this));
                }
                if(hpzm.s() && hpzm.A() && this.ao.h()) {
                    this.Q("key_personal_profile_sync_switch", this.aA, new allj(this));
                }
                Preference preference2 = this.iO("key_disconnect_button");
                gftb.check(preference2);
                preference2.o = new allk(this);
                if(this.at) {
                    Preference preference3 = this.iO("key_wifi_sync_tidepool_redirect");
                    gftb.check(preference3);
                    preference3.T(true);
                    preference3.H(true);
                    preference3.o = new allm(this);
                }
                Preference preference4 = this.iO("key_settings_top_intro");
                gftb.check(preference4);
                preference4.T(true);
                Preference preference5 = this.iO("key_disconnect_button");
                gftb.check(preference5);
                preference5.T(true);
                return;
            }
            if(this.O()) {
                Preference preference6 = this.iO("key_settings_top_disabled_intro");
                gftb.check(preference6);
                preference6.S(this.getString(0x7F150300, new Object[]{this.aq}));  // string:auth_proximity_settings_disabled_top_intro "Your %s isn\'t linked to a Chromebook. 
                                                                                   // Link devices to send text messages from your computer, use your phone\'s internet 
                                                                                   // connection, and unlock both devices more easily. Features may vary by device."
                preference6.T(true);
            }
            else {
                Preference preference7 = this.iO("key_disabled_title");
                gftb.check(preference7);
                preference7.S(this.getString(0x7F1502FF, new Object[]{this.aq}));  // string:auth_proximity_settings_disabled_title "Your %s isn\'t linked to a Chromebook"
                preference7.T(true);
                Preference preference8 = this.iO("key_disabled_description");
                gftb.check(preference8);
                preference8.T(true);
            }
            FooterPreference footerPreference0 = (FooterPreference)this.iO("key_disabled_learn_more");
            gftb.check(footerPreference0);
            footerPreference0.l(new alll(this));
            footerPreference0.J(null);
            footerPreference0.R(0x7F1502FE);  // string:auth_proximity_settings_disabled_learn_more "To link your devices, go to 
                                              // your Chromebook\'s settings."
            footerPreference0.T(true);
            return;
        }
        allq.d.f("Args had a missing or empty accounts list", new Object[0]);
    }

    public final void K(String s) {
        allq.d.h("Notifying parent of account name switch", new Object[0]);
        Bundle bundle0 = new Bundle();
        bundle0.putString("ACCOUNT_NAME", s);
        this.getParentFragmentManager().ae("SETTINGS_ACCOUNT_SPINNER_REQUEST", bundle0);
    }

    // Detected as a lambda impl.
    final void L() {
        if(this.au) {
            alax alax0 = this.an;
            if(alax0 != null) {
                int v = alax0.c();
                if(this.O()) {
                    RestrictedSwitchPreferenceCompat restrictedSwitchPreferenceCompat0 = (RestrictedSwitchPreferenceCompat)this.iO("key_apps_stream_switch");
                    gftb.check(restrictedSwitchPreferenceCompat0);
                    boolean z = restrictedSwitchPreferenceCompat0.d;
                    if(z != (v ^ 1)) {
                        RestrictedSwitchPreferenceCompat.c.h("setDisabledByAdmin() disabledByAdmin from %s to %s", new Object[]{Boolean.valueOf(z), Boolean.valueOf(((boolean)(v ^ 1)))});
                        restrictedSwitchPreferenceCompat0.d = v ^ 1;
                        restrictedSwitchPreferenceCompat0.k(((boolean)v));
                        restrictedSwitchPreferenceCompat0.d();
                    }
                    restrictedSwitchPreferenceCompat0.T(true);
                }
                else {
                    RestrictedSwitchPreference restrictedSwitchPreference0 = (RestrictedSwitchPreference)this.iO("key_apps_stream_switch");
                    gftb.check(restrictedSwitchPreference0);
                    boolean z1 = restrictedSwitchPreference0.d;
                    if(z1 != (v ^ 1)) {
                        RestrictedSwitchPreference.c.h("setDisabledByAdmin() disabledByAdmin from %s to %s", new Object[]{Boolean.valueOf(z1), Boolean.valueOf(((boolean)(v ^ 1)))});
                        restrictedSwitchPreference0.d = v ^ 1;
                        restrictedSwitchPreference0.k(((boolean)v));
                        restrictedSwitchPreference0.d();
                    }
                    restrictedSwitchPreference0.T(true);
                }
                if(this.am != null && v != 0) {
                    this.N(this.aj);
                    if(this.aw) {
                        this.am.c(this.ag);
                    }
                }
            }
        }
    }

    public final void M(Context context0, boolean z) {
        String s = this.ag;
        context0.startService(new Intent().setClassName(context0, "com.google.android.gms.auth.proximity.exo.ExoService").putExtra("com.google.android.gms.auth.proximity.exo.extra.EXTRA_ACCOUNT_ID", s).putExtra("com.google.android.gms.auth.proximity.exo.extra.EXTRA_ASSOCIATION_STATE", Boolean.valueOf(z)));
    }

    public final void N(boolean z) {
        allq.d.h("updateExoSettingToggle:%s", new Object[]{Boolean.valueOf(z)});
        if(this.O()) {
            RestrictedSwitchPreferenceCompat restrictedSwitchPreferenceCompat0 = (RestrictedSwitchPreferenceCompat)this.iO("key_apps_stream_switch");
            gftb.check(restrictedSwitchPreferenceCompat0);
            if(!restrictedSwitchPreferenceCompat0.d) {
                restrictedSwitchPreferenceCompat0.T(true);
                restrictedSwitchPreferenceCompat0.H(true);
                restrictedSwitchPreferenceCompat0.k(z);
                restrictedSwitchPreferenceCompat0.o = new alla(this, z, restrictedSwitchPreferenceCompat0);
            }
        }
        else {
            RestrictedSwitchPreference restrictedSwitchPreference0 = (RestrictedSwitchPreference)this.iO("key_apps_stream_switch");
            gftb.check(restrictedSwitchPreference0);
            if(!restrictedSwitchPreference0.d) {
                restrictedSwitchPreference0.T(true);
                restrictedSwitchPreference0.H(true);
                restrictedSwitchPreference0.k(z);
                restrictedSwitchPreference0.o = new allb(this, z, restrictedSwitchPreference0);
            }
        }
    }

    public final boolean O() {
        return hpzt.a.b().l() && sku.a(this.getContext());
    }

    public static final boolean P(String s) {
        try {
            return !gfta.c(((String)((glyq)alol.a(s).d()).u()));
        }
        catch(InterruptedException | ExecutionException exception0) {
            allq.d.n("Failed to get CDM association details from feature manager.", exception0, new Object[0]);
            return false;
        }
    }

    private final void Q(String s, boolean z, allp allp0) {
        if(this.O()) {
            SwitchPreferenceCompat switchPreferenceCompat0 = (SwitchPreferenceCompat)this.iO(s);
            gftb.check(switchPreferenceCompat0);
            switchPreferenceCompat0.T(true);
            switchPreferenceCompat0.H(true);
            switchPreferenceCompat0.k(z);
            switchPreferenceCompat0.o = new alky(this, allp0, switchPreferenceCompat0);
            return;
        }
        SwitchPreference switchPreference0 = (SwitchPreference)this.iO(s);
        gftb.check(switchPreference0);
        switchPreference0.T(true);
        switchPreference0.H(true);
        switchPreference0.k(z);
        switchPreference0.o = new alkz(this, allp0, switchPreference0);
    }

    @Override  // du
    public final Context getContext() {
        Context context0 = super.getContext();
        gftb.check(context0);
        return context0;
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        if(albt.c()) {
            this.am = new albk(this, this);
            this.an = new alax(context0);
        }
        if(this.ao == null) {
            this.ao = bbpj.a(this.getContext());
        }
    }

    @Override  // du
    public final void onDestroy() {
        alax alax0 = this.an;
        if(alax0 != null) {
            alax0.b();
            this.an = null;
        }
        super.onDestroy();
    }
}

