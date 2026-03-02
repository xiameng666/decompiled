package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import bhlx;
import bhmn;
import huue;
import oij;

public class ToggleButtonPreference extends TwoTargetPreference {
    public Button a;
    public Button b;
    public bhlx c;
    private final View.OnClickListener d;

    public ToggleButtonPreference(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = new bhmn(this);
    }

    @Override  // com.google.android.gms.drivingmode.TwoTargetPreference
    public final void a(oij oij0) {
        super.a(oij0);
        LinearLayout linearLayout0 = (LinearLayout)oij0.D(0x1020018);
        linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout0.setPadding(0, 0, 0, 0);
        this.a = (Button)oij0.D(0x7F0B1B26);  // id:on_button
        this.b = (Button)oij0.D(0x7F0B1A71);  // id:off_button
        this.a.setOnClickListener(this.d);
        this.b.setOnClickListener(this.d);
    }

    @Override  // com.google.android.gms.drivingmode.TwoTargetPreference
    protected final int k() {
        return 0x7F0E01C3;  // layout:car_preference_widget_toggle_button
    }

    public final void l(boolean z) {
        Button button0 = this.a;
        if(button0 != null && this.b != null) {
            if(z) {
                button0.setVisibility(0);
                if(huue.h()) {
                    this.a.sendAccessibilityEvent(8);
                }
                this.b.setVisibility(8);
                return;
            }
            button0.setVisibility(8);
            this.b.setVisibility(0);
            if(huue.h()) {
                this.b.sendAccessibilityEvent(8);
            }
        }
    }
}

