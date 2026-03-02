package com.google.android.gms.auth.proximity.multidevice;

import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.SwitchPreference;
import baun;
import oij;

public class RestrictedSwitchPreference extends SwitchPreference {
    public static final baun c;
    public boolean d;

    static {
        RestrictedSwitchPreference.c = new baun("ProximityAuth", new String[]{"RestrictedSwitchPreference"});
    }

    public RestrictedSwitchPreference(Context context0) {
        this(context0, null);
    }

    public RestrictedSwitchPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x101036D);
    }

    public RestrictedSwitchPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public RestrictedSwitchPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.d = false;
        this.C = 0x7F0E08B2;  // layout:restricted_switch_preference
    }

    @Override  // androidx.preference.Preference
    public final void F() {
        if(this.d) {
            Intent intent0 = new Intent("android.settings.SHOW_ADMIN_SUPPORT_DETAILS");
            intent0.putExtra("android.intent.extra.USER_ID", UserHandle.myUserId());
            intent0.putExtra("android.app.extra.RESTRICTION", 1);
            intent0.setFlags(0x10000000);
            this.j.startActivity(intent0);
            return;
        }
        super.F();
    }

    @Override  // androidx.preference.SwitchPreference
    public final void a(oij oij0) {
        super.a(oij0);
        View view0 = oij0.D(0x1020040);
        if(view0 != null) {
            View view1 = view0.getRootView();
            view1.setFilterTouchesWhenObscured(true);
            view1.setAllowClickWhenDisabled(true);
        }
        TextView textView0 = (TextView)oij0.D(0x7F0B0B33);  // id:additional_summary
        if(textView0 != null) {
            if(this.d) {
                textView0.setText("Disabled by admin");
                textView0.setVisibility(0);
                return;
            }
            textView0.setVisibility(8);
        }
    }

    @Override  // androidx.preference.TwoStatePreference
    public final void k(boolean z) {
        if(z && this.d) {
            return;
        }
        super.k(z);
    }
}

