package com.google.android.gms.multidevice.ui.enrollment.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cufr;
import cuhf;
import cuhg;
import cuhh;
import cuhi;
import cuhj;
import ibnn;
import ibnz;
import ibth;
import ibuq;

public final class EnrollmentDeviceView extends ConstraintLayout {
    private final ibnn h;
    private final ibnn i;
    private final ibnn j;
    private final ibnn k;

    public EnrollmentDeviceView(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
        this.h = new ibnz(new cuhf(this));
        this.i = new ibnz(new cuhg(this));
        this.j = new ibnz(new cuhh(this));
        this.k = new ibnz(new cuhi(this));
        LayoutInflater.from(this.getContext()).inflate(0x7F0E0322, this, true);  // layout:enrollment_device_item
    }

    public EnrollmentDeviceView(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0);
        this.h = new ibnz(new cuhf(this));
        this.i = new ibnz(new cuhg(this));
        this.j = new ibnz(new cuhh(this));
        this.k = new ibnz(new cuhi(this));
        LayoutInflater.from(this.getContext()).inflate(0x7F0E0322, this, true);  // layout:enrollment_device_item
    }

    public final void g(cufr cufr0, ibth ibth0) {
        ibuq.f(cufr0, "deviceUiState");
        ibth ibth1 = cufr0.e;
        this.setEnabled(((Boolean)ibth1.a()).booleanValue());
        this.k().setText(cufr0.a);
        this.k().setEnabled(((Boolean)ibth1.a()).booleanValue());
        this.j().setImageResource(cufr0.b);
        this.j().setAlpha((((Boolean)ibth1.a()).booleanValue() ? 1.0f : 0.38f));
        if(cufr0.f) {
            this.i().setVisibility(8);
            this.i().setChecked(false);
            this.h().setVisibility(0);
            return;
        }
        this.h().setVisibility(8);
        this.i().setEnabled(((Boolean)ibth1.a()).booleanValue());
        this.i().setChecked(((Boolean)cufr0.c.a()).booleanValue());
        this.i().setOnClickListener(new cuhj(ibth0));
        this.i().setVisibility(0);
    }

    private final Button h() {
        Object object0 = this.k.a();
        ibuq.e(object0, "getValue(...)");
        return (Button)object0;
    }

    private final CheckBox i() {
        Object object0 = this.j.a();
        ibuq.e(object0, "getValue(...)");
        return (CheckBox)object0;
    }

    private final ImageView j() {
        Object object0 = this.h.a();
        ibuq.e(object0, "getValue(...)");
        return (ImageView)object0;
    }

    private final TextView k() {
        Object object0 = this.i.a();
        ibuq.e(object0, "getValue(...)");
        return (TextView)object0;
    }
}

