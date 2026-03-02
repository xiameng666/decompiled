package com.android.settingslib.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.preference.TwoStatePreference;
import java.util.ArrayList;
import java.util.List;
import oij;
import sjy;
import skk;
import skl;
import sku;

public class MainSwitchPreference extends TwoStatePreference implements sjy, skl {
    private final List c;

    public MainSwitchPreference(Context context0) {
        this(context0, null);
    }

    public MainSwitchPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MainSwitchPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public MainSwitchPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.c = new ArrayList();
        this.C = sku.a(context0) ? 0x7F0E095C : 0x7F0E096F;  // layout:settingslib_expressive_main_switch_layout
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        super.a(oij0);
        oij0.v = false;
        oij0.w = false;
        MainSwitchBar mainSwitchBar0 = (MainSwitchBar)oij0.a.findViewById(0x7F0B1FF0);  // id:settingslib_main_switch_bar
        mainSwitchBar0.e(this.t());
        if(Build.VERSION.SDK_INT >= 35) {
            mainSwitchBar0.d(this.m());
        }
        mainSwitchBar0.setOnClickListener(new skk(this, mainSwitchBar0));
        mainSwitchBar0.a.clear();
        mainSwitchBar0.c(this.a);
        mainSwitchBar0.a(this);
        if(!this.z) {
            if(mainSwitchBar0.g()) {
                mainSwitchBar0.setVisibility(8);
                mainSwitchBar0.d.setOnCheckedChangeListener(null);
            }
            return;
        }
        mainSwitchBar0.setVisibility(0);
        mainSwitchBar0.d.setOnCheckedChangeListener(mainSwitchBar0);
    }

    @Deprecated
    public final void aj(skl skl0) {
        List list0 = this.c;
        if(!list0.contains(skl0)) {
            list0.add(skl0);
        }
    }

    @Override  // skl
    public final void fn(CompoundButton compoundButton0, boolean z) {
        super.k(z);
        for(Object object0: this.c) {
            ((skl)object0).fn(compoundButton0, z);
        }
    }
}

