package com.google.android.gms.multidevice.featuresettings.callswitching;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.android.settingslib.widget.IllustrationPreference;
import csxk;
import ctaf;
import ctai;
import ctak;
import cume;
import ibuk;
import ibuq;
import icbb;
import lpt;

public final class CallSwitchingLandingFragment extends ctak {
    public csxk d;

    static {
        cume.a(new ibuk(CallSwitchingLandingFragment.class));
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.H(0x7F190024, s);  // xml:call_switching_preference
        CallSwitchingLandingFragment.M("call_switching_main_switch");
        TwoStatePreference twoStatePreference0 = this.L();
        if(twoStatePreference0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        twoStatePreference0.n = new ctaf(this);
        IllustrationPreference illustrationPreference0 = (IllustrationPreference)this.iO("call_switching_illustration");
        if(illustrationPreference0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Drawable drawable0 = this.getResources().getDrawable(0x7F080293, illustrationPreference0.j.getTheme());  // drawable:call_casting_illustration
        if(drawable0 != illustrationPreference0.a) {
            illustrationPreference0.k();
            illustrationPreference0.a = drawable0;
            illustrationPreference0.d();
        }
        icbb.b(lpt.a(this), null, null, new ctai(this, null), 3);
    }

    public final csxk K() {
        csxk csxk0 = this.d;
        if(csxk0 != null) {
            return csxk0;
        }
        ibuq.j("settingsManager");
        return null;
    }

    public final TwoStatePreference L() {
        Preference preference0 = this.iO("call_switching_main_switch");
        return (preference0 instanceof TwoStatePreference) ? ((TwoStatePreference)preference0) : null;
    }

    public static final void M(String s) {
        if(ibuq.m(s, "call_switching_main_switch")) {
            return;
        }
        throw new IllegalArgumentException("Invalid preference key: " + s);
    }

    @Override  // ohv
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        ibuq.e(view0, "onCreateView(...)");
        return view0;
    }
}

