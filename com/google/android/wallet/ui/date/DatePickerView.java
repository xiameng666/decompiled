package com.google.android.wallet.ui.date;

import MessageLite;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import fm;
import gcij;
import gciq;
import gcjp;
import gcjq;
import gcjr;
import gczt;
import gdaj;
import gdcb;
import gddv;
import gddw;
import gepn;
import gfid;
import gfig;
import gfjj;
import java.util.GregorianCalendar;

public class DatePickerView extends LinearLayout implements DatePickerDialog.OnDateSetListener, View.OnClickListener, gcjr, gczt, gddv {
    public TextView a;
    public TextView b;
    public gfjj c;
    public gfig d;
    public gcij e;
    public fm f;
    Toast g;
    public DatePickerView h;
    private gepn i;
    private gcjq j;

    public DatePickerView(Context context0) {
        super(context0);
    }

    public DatePickerView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public DatePickerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // gddv
    public final int a() {
        return this.i == null ? 0 : this.i.e;
    }

    @Override  // gdaj
    public final gdaj aV() {
        return null;
    }

    @Override  // gdaj
    public final String aX(String s) {
        return this.b.getText().toString();
    }

    public final void b(int v, int v1, int v2) {
        String s = this.e.a(v2, v1, v);
        this.b.setText(s);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gepn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gepn)hftv0).b |= 4;
        ((gepn)hftv0).e = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gepn)hftv1).b |= 2;
        ((gepn)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gepn gepn0 = (gepn)hftp0.b_message;
        gepn0.b |= 1;
        gepn0.c = v;
        this.i = (gepn)hftp0.N_build();
    }

    private final void c(CharSequence charSequence0) {
        Toast toast0 = this.g;
        if(toast0 != null) {
            toast0.cancel();
        }
        if(TextUtils.isEmpty(charSequence0)) {
            this.g = null;
            return;
        }
        Toast toast1 = Toast.makeText(this.getContext(), charSequence0, 0);
        this.g = toast1;
        toast1.show();
    }

    @Override  // gddv
    public final int d() {
        return this.i == null ? 0 : this.i.d;
    }

    @Override  // gddv
    public final int f() {
        return this.i == null ? 0 : this.i.c;
    }

    private static boolean g(gepn gepn0) {
        return gepn0 == null ? true : gepn0.c == 0 && gepn0.d == 0 && gepn0.e == 0;
    }

    @Override  // gczt
    public final CharSequence getError() {
        return null;
    }

    @Override  // gczt
    public final void nT(CharSequence charSequence0, boolean z) {
        throw new IllegalArgumentException("Errors not supported on DatePickerView.");
    }

    @Override  // gczt
    public final boolean nW() {
        return this.c.h || this.i != null;
    }

    @Override  // gczt
    public final boolean nX() {
        if(this.hasFocus() || !this.requestFocus()) {
            gdcb.G(this);
        }
        return this.hasFocus();
    }

    @Override  // gczt
    public final boolean nY() {
        boolean z = this.nW();
        if(z) {
            this.c(null);
            return z;
        }
        this.c("Required field");
        return z;
    }

    @Override  // gczt
    public final boolean nZ(Object object0) {
        return this.b.getText().toString().equals(object0);
    }

    @Override  // gcjr
    public final gcjp od() {
        if(this.j == null) {
            this.j = new gcjq(this);
        }
        return this.j;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.f == null) {
            throw new IllegalStateException("FragmentManager not set in DatePickerView.");
        }
        gepn gepn0 = this.d.d == null ? gepn.a : this.d.d;
        gfig gfig0 = this.d;
        gepn gepn1 = gfig0.e == null ? gepn.a : gfig0.e;
        DatePickerView datePickerView0 = this.h;
        if(datePickerView0 != null) {
            int v = gfig0.i;
            if(gfid.a(v) == 2) {
                gepn gepn2 = datePickerView0.i;
                if(DatePickerView.g(gepn1) || !DatePickerView.g(gepn2) && new GregorianCalendar(gepn1.c, gepn1.d, gepn1.e).compareTo(new GregorianCalendar(gepn2.c, gepn2.d, gepn2.e)) > 0) {
                    gepn1 = gepn2;
                }
            }
            else if(gfid.a(v) == 3) {
                gepn gepn3 = datePickerView0.i;
                if(DatePickerView.g(gepn0) || !DatePickerView.g(gepn3) && new GregorianCalendar(gepn0.c, gepn0.d, gepn0.e).compareTo(new GregorianCalendar(gepn3.c, gepn3.d, gepn3.e)) < 0) {
                    gepn0 = gepn3;
                }
            }
        }
        gepn gepn4 = this.i;
        gddw gddw0 = new gddw();
        Bundle bundle0 = new Bundle();
        gciq.j(bundle0, "initialDate", ((MessageLite)gepn4));
        gciq.j(bundle0, "minDate", ((MessageLite)gepn0));
        gciq.j(bundle0, "maxDate", ((MessageLite)gepn1));
        gddw0.setArguments(bundle0);
        gddw0.ag = this;
        gddw0.show(this.f, "DatePickerDialog");
    }

    @Override  // android.app.DatePickerDialog$OnDateSetListener
    public final void onDateSet(DatePicker datePicker0, int v, int v1, int v2) {
        this.b(v, v1 + 1, v2);
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(0x7F0B17A6);  // id:label
        this.b = (TextView)this.findViewById(0x7F0B10AA);  // id:date_text
        this.setOnClickListener(this);
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("parentState"));
            this.i = (gepn)gciq.a(((Bundle)parcelable0), "currentDate", ((Parser)((ProtoLiteMessage)gepn.a).jf(7, null)));
            this.setVisibility(((Bundle)parcelable0).getInt("viewVisibility"));
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("parentState", super.onSaveInstanceState());
        gciq.j(((Bundle)parcelable0), "currentDate", ((MessageLite)this.i));
        ((Bundle)parcelable0).putInt("viewVisibility", this.getVisibility());
        return parcelable0;
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        int v = ((int)z) & (this.c.i ^ 1);
        super.setEnabled(((boolean)v));
        gdcb.N(this, ((boolean)v));
    }
}

