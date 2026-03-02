package com.google.android.gms.threadnetwork.settings;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.SwitchPreferenceCompat;
import hzaa;
import ibuq;
import oij;

public final class SyncCredentialsToCloudSwitchPreference extends SwitchPreferenceCompat {
    public SyncCredentialsToCloudSwitchPreference(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
    }

    public SyncCredentialsToCloudSwitchPreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
    }

    @Override  // androidx.preference.SwitchPreferenceCompat
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        super.a(oij0);
        View view0 = oij0.D(0x1020010);
        if(view0 != null && (view0 instanceof TextView)) {
            ((TextView)view0).setText(Html.fromHtml(oij0.a.getContext().getString(0x7F153008, new Object[]{hzaa.j()})));  // string:sync_credentials_to_cloud_switch_subtitle "Saving credentials to the Google 
                                                                                                                          // cloud simplifies device setup and management on your Thread network. <a href=%1$s>Learn 
                                                                                                                          // more</a>"
            ((TextView)view0).setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}

