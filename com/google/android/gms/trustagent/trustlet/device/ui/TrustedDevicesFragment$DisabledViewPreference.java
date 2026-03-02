package com.google.android.gms.trustagent.trustlet.device.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import oij;

public final class TrustedDevicesFragment.DisabledViewPreference extends Preference {
    public boolean a;

    public TrustedDevicesFragment.DisabledViewPreference(Context context0) {
        super(context0);
        this.a = true;
        this.C = 0x7F0E07F9;  // layout:preference_material
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        super.a(oij0);
        boolean z = this.Z() && this.a;
        this.k(oij0.a, z);
    }

    final void k(View view0, boolean z) {
        view0.setEnabled(z);
        if((view0 instanceof ViewGroup)) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                this.k(((ViewGroup)view0).getChildAt(v), z);
            }
        }
    }
}

