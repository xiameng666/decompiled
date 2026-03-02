import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.android.settingslib.widget.BannerMessagePreference;
import com.android.settingslib.widget.FooterPreference;
import com.google.android.gms.trustagent.activeunlock.primary.ui.enrolleddevice.EnrolledDevicePreference;
import dagger.android.HasAndroidInjector;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class eyqp extends skp {
    public eyet ag;
    public eyzy ah;
    public ibts ai;
    public final acp aj;
    public BannerMessagePreference ak;
    public final Set al;
    public final eyqk am;
    private eyep an;
    private final ibnn ao;
    private PreferenceCategory ap;
    private boolean aq;
    public eyec d;

    public eyqp() {
        ibuk ibuk0 = new ibuk(eysa.class);
        eyqm eyqm0 = new eyqm(this);
        eyqn eyqn0 = new eyqn(this);
        this.ao = new lsd(ibuk0, eyqm0, new eyqo(this), eyqn0);
        this.aj = this.registerForActivityResult(new adt(), new eyqi(this));
        this.al = new LinkedHashSet();
        this.am = new eyqk(this);
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.H(0x7F19009F, s);  // xml:enrolled_device_list_preferences
        Preference preference0 = this.iO("enrolled_devices_list_category");
        if(preference0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.ap = (PreferenceCategory)preference0;
        Preference preference1 = this.iO("enrolled_devices_list_preferences_warning");
        if(preference1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.ak = (BannerMessagePreference)preference1;
        Preference preference2 = this.iO("enrolled_devices_list_preferences_footer");
        if(preference2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((FooterPreference)preference2).ah(this.getString(0x7F150F01));  // string:enrolled_devices_learn_more "Learn more about Watch Unlock"
        ((FooterPreference)preference2).l(new eyqj(this));
    }

    public final eysa K() {
        return (eysa)this.ao.a();
    }

    public final void L() {
        PreferenceCategory preferenceCategory0 = this.ap;
        PreferenceCategory preferenceCategory1 = null;
        if(preferenceCategory0 == null) {
            ibuq.j("enrolledDevicesCategory");
            preferenceCategory0 = null;
        }
        preferenceCategory0.ah();
        eyqq eyqq0 = (eyqq)this.K().i.b();
        List list0 = eyqq0.a;
        int v = 0;
        if(list0.isEmpty() && !eyqq0.e) {
            PreferenceCategory preferenceCategory2 = this.ap;
            if(preferenceCategory2 == null) {
                ibuq.j("enrolledDevicesCategory");
            }
            else {
                preferenceCategory1 = preferenceCategory2;
            }
            preferenceCategory1.T(false);
            return;
        }
        PreferenceCategory preferenceCategory3 = this.ap;
        if(preferenceCategory3 == null) {
            ibuq.j("enrolledDevicesCategory");
            preferenceCategory3 = null;
        }
        preferenceCategory3.T(true);
        for(Object object0: list0) {
            Context context0 = this.getContext();
            if(context0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            EnrolledDevicePreference enrolledDevicePreference0 = new EnrolledDevicePreference(context0);
            enrolledDevicePreference0.S(((eyqt)object0).a);
            enrolledDevicePreference0.a = ((eyqt)object0).b;
            enrolledDevicePreference0.b = ((eyqt)object0).d;
            enrolledDevicePreference0.c = new eyqg(v, this);
            PreferenceCategory preferenceCategory4 = this.ap;
            if(preferenceCategory4 == null) {
                ibuq.j("enrolledDevicesCategory");
                preferenceCategory4 = null;
            }
            preferenceCategory4.am(enrolledDevicePreference0);
            ++v;
            continue;
        }
        if(eyqq0.e) {
            Context context1 = this.getContext();
            if(context1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Preference preference0 = new Preference(context1);
            preference0.R(0x7F150EFD);  // string:enrolled_devices_add_device "Add a watch"
            preference0.I(0x7F080AE5);  // drawable:quantum_gm_ic_add_vd_theme_24
            preference0.o = new eyqh(this);
            PreferenceCategory preferenceCategory5 = this.ap;
            if(preferenceCategory5 == null) {
                ibuq.j("enrolledDevicesCategory");
            }
            else {
                preferenceCategory1 = preferenceCategory5;
            }
            preferenceCategory1.am(preference0);
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        ((HasAndroidInjector)context0).androidInjector().inject(this);
        super.onAttach(context0);
        eyep eyep0 = null;
        if(homc.m()) {
            eyet eyet0 = this.ag;
            if(eyet0 == null) {
                ibuq.j("enrollmentFlowMetricsLogger");
            }
            else {
                eyep0 = eyet0;
            }
            eyep0 = ((eyet)eyep0).a(eyeq.c);
        }
        this.an = eyep0;
        if(sku.a(context0)) {
            ((xob)context0).setTheme(0x7F160D5D);  // style:Theme.SubSettingsBase.Expressive
        }
    }

    @Override  // ohv
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        Preference preference0 = this.iO("enrolled_devices_list_preferences_intro");
        if(preference0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if(ezae.a() - 1 == 0) {
            preference0.R(0x7F150EFF);  // string:enrolled_devices_description_unlock_intent "You can use your watch to unlock 
                                        // this phone when you swipe up on the lock screen or tap a notification"
        }
        else {
            preference0.R(0x7F150EFE);  // string:enrolled_devices_description_biometric_failure "Unlock this phone with your 
                                        // watch when your face or fingerprint isn\'t recognized. Your watch needs to be unlocked, 
                                        // on your wrist, and close to this phone."
        }
        this.L();
        lox.c(this.K().i, null, 3).g(this, new eyql(new eyqd(this)));
        ibuq.e(view0, "also(...)");
        return view0;
    }

    @Override  // ohv
    public final void onStart() {
        super.onStart();
        eyep eyep0 = this.an;
        if(eyep0 != null) {
            eyep0.b();
        }
    }

    @Override  // ohv
    public final void onStop() {
        super.onStop();
        eyep eyep0 = this.an;
        if(eyep0 != null) {
            eyep0.c();
        }
    }

    @Override  // skp
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        if(holo.e() && this.aq) {
            this.K().o();
        }
        this.aq = true;
    }
}

