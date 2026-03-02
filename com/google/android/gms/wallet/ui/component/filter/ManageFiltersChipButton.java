package com.google.android.gms.wallet.ui.component.filter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import gdcb;

public class ManageFiltersChipButton extends AppCompatButton {
    public ManageFiltersChipButton(Context context0) {
        super(context0);
    }

    public ManageFiltersChipButton(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public ManageFiltersChipButton(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ColorStateList colorStateList0 = gdcb.i(this.getContext(), 0x7F040DDC);  // attr:uicColorMaterialAccent
        this.setTextColor(colorStateList0);
        GradientDrawable gradientDrawable0 = (GradientDrawable)this.getBackground();
        gradientDrawable0.setStroke(this.getResources().getDimensionPixelSize(0x7F0714BB), colorStateList0);  // dimen:wallet_manage_filters_chip_button_stroke_width
        this.setBackground(gradientDrawable0);
    }

    @Override  // android.widget.TextView
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if(this.getBackground() != null) {
            this.getBackground().setAlpha((z ? 0xFF : 77));
        }
    }
}

