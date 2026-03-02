package com.google.android.location.ui.widget;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;
import fxra;
import fxup;
import fxyx;
import fxzu;

public class DeviceSwitch extends LinearLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public RemoteDevice a;
    public CompoundButton b;
    public ProgressBar c;
    public TextView d;
    public TextView e;
    public LocationHistorySettingsChimeraActivity f;

    public DeviceSwitch(Context context0) {
        super(context0);
    }

    public DeviceSwitch(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public DeviceSwitch(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public DeviceSwitch(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    private final void a(boolean z) {
        this.setOnClickListener(null);
        this.b.setOnCheckedChangeListener(null);
        this.postDelayed(new fxzu(this), 300L);
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity0 = this.f;
        if(locationHistorySettingsChimeraActivity0 != null) {
            RemoteDevice remoteDevice0 = this.a;
            if(locationHistorySettingsChimeraActivity0.k == null) {
                Log.w("GCoreFlp", "Device switch changed but no preference service");
                return;
            }
            if(locationHistorySettingsChimeraActivity0.p == remoteDevice0.a) {
                try {
                    String s = fxup.a();
                    locationHistorySettingsChimeraActivity0.k.e(locationHistorySettingsChimeraActivity0.l, locationHistorySettingsChimeraActivity0.u(), z, s);
                }
                catch(RemoteException remoteException0) {
                    Log.wtf("GCoreFlp", "Pref service failed for this device", remoteException0);
                }
                locationHistorySettingsChimeraActivity0.w(z);
                locationHistorySettingsChimeraActivity0.A();
                fxra.f("UlrUiChangedDeviceSettingForThis", z);
                return;
            }
            fxra.f("UlrUiChangedDeviceSettingForRemote", z);
            new fxyx(locationHistorySettingsChimeraActivity0, remoteDevice0, z).execute(new Void[0]);
        }
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.a(this.b.isChecked());
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a(((boolean)(this.b.isChecked() ^ 1)));
    }
}

