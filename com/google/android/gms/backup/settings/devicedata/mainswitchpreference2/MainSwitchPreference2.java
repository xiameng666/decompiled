package com.google.android.gms.backup.settings.devicedata.mainswitchpreference2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import androidx.preference.TwoStatePreference;
import aslg;
import java.util.ArrayList;
import java.util.List;
import oij;
import sjy;

public class MainSwitchPreference2 extends TwoStatePreference implements CompoundButton.OnCheckedChangeListener, sjy {
    private final List c;

    public MainSwitchPreference2(Context context0) {
        this(context0, null);
    }

    public MainSwitchPreference2(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MainSwitchPreference2(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public MainSwitchPreference2(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.c = new ArrayList();
        this.C = 0x7F0E0186;  // layout:backup_settingslib_expressive_main_switch_layout
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        super.a(oij0);
        oij0.v = false;
        oij0.w = false;
        MainSwitchBar2 mainSwitchBar20 = (MainSwitchBar2)oij0.a.findViewById(0x7F0B1FF0);  // id:settingslib_main_switch_bar
        mainSwitchBar20.d(this.t());
        mainSwitchBar20.c(this.m());
        mainSwitchBar20.setOnClickListener(new aslg(this));
        mainSwitchBar20.a.clear();
        mainSwitchBar20.b(this.a);
        mainSwitchBar20.a(this);
        mainSwitchBar20.setVisibility(0);
        mainSwitchBar20.d.setOnCheckedChangeListener(mainSwitchBar20);
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        super.k(z);
        for(Object object0: this.c) {
            ((CompoundButton.OnCheckedChangeListener)object0).onCheckedChanged(compoundButton0, z);
        }
    }
}

