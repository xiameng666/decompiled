package com.google.android.gms.drivingmode;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import bhml;
import oij;

public class MasterSwitchPreference extends TwoTargetPreference {
    public SwitchCompat a;
    public boolean b;
    public CompoundButton.OnCheckedChangeListener c;
    private final boolean d;

    public MasterSwitchPreference(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = true;
    }

    @Override  // com.google.android.gms.drivingmode.TwoTargetPreference
    public final void a(oij oij0) {
        super.a(oij0);
        View view0 = oij0.D(0x1020018);
        if(view0 != null) {
            view0.setOnClickListener(new bhml(this));
        }
        SwitchCompat switchCompat0 = (SwitchCompat)oij0.D(0x7F0B2202);  // id:switch_widget
        this.a = switchCompat0;
        switchCompat0.setContentDescription(this.t());
        this.a.setChecked(this.b);
        this.a.setEnabled(this.d);
        this.a.setOnCheckedChangeListener(this.c);
    }

    @Override  // com.google.android.gms.drivingmode.TwoTargetPreference
    protected final int k() {
        return 0x7F0E01C2;  // layout:car_preference_widget_master_switch
    }

    public final void l(boolean z) {
        this.b = z;
        SwitchCompat switchCompat0 = this.a;
        if(switchCompat0 != null) {
            switchCompat0.setChecked(z);
        }
    }
}

