package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import gdcb;
import zdd;

public class ButtonBar extends LinearLayout {
    public Button a;
    public View b;
    public Button c;
    private View d;

    public ButtonBar(Context context0) {
        super(context0);
        this.c(context0, null);
    }

    public ButtonBar(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c(context0, attributeSet0);
    }

    public ButtonBar(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c(context0, attributeSet0);
    }

    public final void a(boolean z) {
        this.a.setEnabled(z);
        this.c.setEnabled(z);
        if(!z) {
            this.d.setVisibility(0);
            return;
        }
        this.d.setVisibility(4);
    }

    public final void b(CharSequence charSequence0) {
        this.a.setText(charSequence0);
    }

    private final void c(Context context0, AttributeSet attributeSet0) {
        this.setOrientation(0);
        LayoutInflater.from(context0).inflate(0x7F0E0E08, this, true);  // layout:wallet_view_button_bar_dialog
        this.a = (Button)this.findViewById(0x7F0B1CE3);  // id:positive_btn
        this.b = this.findViewById(0x7F0B1CE4);  // id:positive_btn_container
        this.c = (Button)this.findViewById(0x7F0B0F1C);  // id:close_btn
        this.d = this.findViewById(0x7F0B0DBD);  // id:button_progress_spinner
        Button button0 = this.a;
        if(button0 != null) {
            gdcb.I(context0, button0);
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, zdd.q);
        if(typedArray0.hasValue(0)) {
            this.b(typedArray0.getString(0));
        }
        else {
            this.b(this.a.getText());
        }
        typedArray0.recycle();
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("instanceState"));
            if(((Bundle)parcelable0).containsKey("buttonsEnabled")) {
                this.a(((Bundle)parcelable0).getBoolean("buttonsEnabled"));
            }
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("instanceState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putBoolean("buttonsEnabled", this.a.isEnabled());
        return parcelable0;
    }
}

