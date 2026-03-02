package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import fzbf;
import fzby;
import fzbz;
import fzca;
import fzcb;
import fzcc;
import fzcd;

public class TimePickerView extends ConstraintLayout {
    public final Chip h;
    public final Chip i;
    public final ClockHandView j;
    public final ClockFaceView k;
    public final MaterialButtonToggleGroup l;
    public fzcc m;
    public fzcd n;
    public fzbf o;
    private final View.OnClickListener p;

    public TimePickerView(Context context0) {
        this(context0, null);
    }

    public TimePickerView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public TimePickerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        fzbz fzbz0 = new fzbz(this);
        this.p = fzbz0;
        LayoutInflater.from(context0).inflate(0x7F0E0568, this);  // layout:material_timepicker
        this.k = (ClockFaceView)this.findViewById(0x7F0B18C1);  // id:material_clock_face
        MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)this.findViewById(0x7F0B18C6);  // id:material_clock_period_toggle
        this.l = materialButtonToggleGroup0;
        materialButtonToggleGroup0.j(new fzby(this));
        Chip chip0 = (Chip)this.findViewById(0x7F0B18CB);  // id:material_minute_tv
        this.h = chip0;
        Chip chip1 = (Chip)this.findViewById(0x7F0B18C8);  // id:material_hour_tv
        this.i = chip1;
        this.j = (ClockHandView)this.findViewById(0x7F0B18C2);  // id:material_clock_hand
        fzcb fzcb0 = new fzcb(this, new GestureDetector(this.getContext(), new fzca(this)));
        chip0.setOnTouchListener(fzcb0);
        chip1.setOnTouchListener(fzcb0);
        chip0.setTag(0x7F0B1FAE, Integer.valueOf(12));  // id:selection_type
        chip1.setTag(0x7F0B1FAE, Integer.valueOf(10));  // id:selection_type
        chip0.setOnClickListener(fzbz0);
        chip1.setOnClickListener(fzbz0);
        chip0.u();
        chip1.u();
    }

    public final void g(float f, boolean z) {
        this.j.c(f, z);
    }

    public static final void h(Chip chip0, boolean z) {
        chip0.setChecked(z);
        chip0.setAccessibilityLiveRegion((z ? 2 : 0));
    }

    @Override  // android.view.View
    protected final void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(view0 == this && v == 0) {
            this.i.sendAccessibilityEvent(8);
        }
    }
}

