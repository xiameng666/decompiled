package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import slr;
import smd;

@Deprecated
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {
    public boolean e;
    public smd f;

    public SwitchItem() {
        this.e = false;
    }

    public SwitchItem(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.e = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, slr.r);
        this.e = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
    }

    @Override  // com.android.setupwizardlib.items.Item
    protected int j() {
        return 0x7F0E0B1B;  // layout:suw_items_switch
    }

    @Override  // com.android.setupwizardlib.items.Item
    public void k(View view0) {
        super.k(view0);
        SwitchCompat switchCompat0 = (SwitchCompat)view0.findViewById(0x7F0B21DB);  // id:suw_items_switch
        switchCompat0.setOnCheckedChangeListener(null);
        switchCompat0.setChecked(this.e);
        switchCompat0.setOnCheckedChangeListener(this);
        switchCompat0.setEnabled(this.b);
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.e = z;
        smd smd0 = this.f;
        if(smd0 != null) {
            smd0.a(z);
        }
    }

    public final void r(boolean z) {
        if(this.e != z) {
            this.e = z;
            this.c();
            smd smd0 = this.f;
            if(smd0 != null) {
                smd0.a(z);
            }
        }
    }
}

