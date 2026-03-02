package com.google.android.wallet.ui.common;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView.BufferType;
import com.google.android.wallet.clientlog.LogContext;
import fayg;
import gcfz;
import gcgb;
import gcio;
import gciq;
import gcji;
import gcjj;
import gcjp;
import gcjs;
import gcyd;
import gdcb;
import gevr;
import gevs;
import gfev;
import gffq;
import gfgo;
import j..util.Objects;
import java.util.List;
import kv;

public class ButtonComponent extends AppCompatButton implements View.OnClickListener, gcjj, gcjp, gcyd, Runnable {
    public gevs b;
    public LogContext c;
    final gcgb d;
    public View.OnClickListener e;
    final gcji f;
    boolean g;
    boolean h;
    int i;
    boolean j;
    private boolean k;
    private long l;
    private boolean m;
    private boolean n;
    private fayg o;

    public ButtonComponent(Context context0) {
        super(context0);
        this.d = new gcgb(this);
        this.f = new gcji();
        this.l = -1L;
        this.g = true;
        this.h = true;
        this.h(null);
    }

    public ButtonComponent(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = new gcgb(this);
        this.f = new gcji();
        this.l = -1L;
        this.g = true;
        this.h = true;
        this.h(attributeSet0);
    }

    public ButtonComponent(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d = new gcgb(this);
        this.f = new gcji();
        this.l = -1L;
        this.g = true;
        this.h = true;
        this.h(attributeSet0);
    }

    @Override  // gcjp
    public final void K(gffq gffq0, List list0) {
        int v = gffq0.e;
        int v1 = gfev.a(v);
        int v2 = 1;
        if(v1 == 0) {
            v1 = 1;
        }
        switch(v1 - 1) {
            case 1: {
                this.n(false);
                return;
            }
            case 2: {
                this.f();
                return;
            }
            case 7: {
                this.e(false);
                return;
            }
            case 11: {
                this.n(true);
                return;
            }
            case 16: {
                this.e(true);
                return;
            }
            default: {
                int v3 = gfev.a(v);
                if(v3 != 0) {
                    v2 = v3;
                }
                throw new IllegalArgumentException(String.format("Unsupported resulting action type: %s", ((int)(v2 - 1))));
            }
        }
    }

    @Override  // gcjj
    public final gcjs b() {
        return this.f;
    }

    @Override  // gcyd
    public final View c() {
        return this;
    }

    @Override  // gcyd
    public final Button d() {
        return this;
    }

    final void e(boolean z) {
        boolean z1 = false;
        this.h = z;
        if(this.l == -1L && z != this.isEnabled()) {
            if(this.g && this.h) {
                z1 = true;
            }
            this.j(z1);
        }
    }

    public final void f() {
        if(this.l != -1L) {
            this.l = -1L;
            this.setEnabled(this.n);
            this.removeCallbacks(this);
            if((this.b.b & 0x20) != 0 && !this.b.h.isEmpty()) {
                this.setText(this.b.h);
                return;
            }
            this.setText(((this.b.b & 8) == 0 ? "" : this.b.f));
        }
    }

    private static long g(long v) {
        return (v + 500L) / 1000L * 1000L;
    }

    private final void h(AttributeSet attributeSet0) {
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, new int[]{0x7F040DF2});  // attr:uicFormButtonTextCapitalized
        this.k = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        this.i = this.getVisibility();
        super.setOnClickListener(this);
    }

    @Override  // android.view.View
    public final boolean hasOnClickListeners() {
        return super.hasOnClickListeners() ? this.e != null || this.o != null : false;
    }

    @Override  // gcyd
    public final void i(gevs gevs0) {
        if(((gevs0.b & 8) == 0 || gevs0.f.isEmpty()) && (gevs0.b & 4) == 0) {
            throw new IllegalArgumentException("Button spec without initial text or icon received.");
        }
        int v = gevs0.b;
        if((v & 0x40) != 0 && gevs0.i > 0) {
            if((v & 16) == 0 || gevs0.g.isEmpty()) {
                throw new IllegalArgumentException("Re-send timer w/o a refresh message received.");
            }
            if(gevs0.i < 1000) {
                throw new IllegalArgumentException("Re-send timer less than 1 second which is the minimum displayable unit.");
            }
        }
        if(this.b != null && (this.b.b & 4) != 0) {
            this.o(null);
        }
        this.b = gevs0;
        if(this.m) {
            this.removeCallbacks(this);
            this.l = -1L;
        }
        this.setText(((this.b.b & 8) == 0 ? "" : this.b.f));
        this.p();
        this.e(this.b.d);
        this.d.b = gevs0.c;
    }

    private final void j(boolean z) {
        if(this.isEnabled() != z) {
            this.q(z);
        }
        super.setEnabled(z);
    }

    @Override  // gcyd
    public final void k(fayg fayg0) {
        this.o = fayg0;
    }

    @Override  // gcyd
    public final gevs l() {
        return this.b;
    }

    @Override  // gcyd
    public final void m(LogContext logContext0) {
        this.c = logContext0;
        this.d.a = logContext0;
    }

    private final void n(boolean z) {
        this.j = z;
        super.setVisibility((z ? 8 : this.i));
    }

    private final void o(Drawable drawable0) {
        Drawable[] arr_drawable = this.getCompoundDrawablesRelative();
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, arr_drawable[1], arr_drawable[2], arr_drawable[3]);
    }

    @Override  // gcjr
    public final gcjp od() {
        return null;
    }

    @Override  // android.widget.TextView
    protected final void onAttachedToWindow() {
        this.m = true;
        super.onAttachedToWindow();
        this.d.b();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        gcfz.b(this.c, this.b.c);
        if(!this.f.a() || !this.f.a) {
            gevs gevs0 = this.b;
            int v = gevs0.b;
            String s = "";
            int v1 = 1;
            if((v & 0x40) != 0 && gevs0.i > 0) {
                this.j(false);
                this.l = SystemClock.elapsedRealtime();
                this.n = true;
                long v2 = ButtonComponent.g(this.b.i);
                if((this.b.b & 16) != 0) {
                    s = String.format(this.getResources().getConfiguration().locale, this.b.g, ((long)(v2 / 1000L)));
                }
                this.setText(s);
                this.postDelayed(this, Math.min(v2, 1000L));
            }
            else if((v & 0x20) != 0 && !gevs0.h.isEmpty()) {
                this.setText(this.b.h);
            }
            else {
                gevs gevs1 = this.b;
                if((gevs1.b & 8) != 0) {
                    s = gevs1.f;
                }
                this.setText(s);
            }
            View.OnClickListener view$OnClickListener0 = this.e;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(view0);
            }
            fayg fayg0 = this.o;
            if(fayg0 != null) {
                int v3 = gevr.a(this.b.j);
                if(v3 != 0) {
                    v1 = v3;
                }
                fayg0.ad(v1);
            }
        }
    }

    @Override  // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = false;
        this.removeCallbacks(this);
    }

    @Override  // android.widget.TextView
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        ((Bundle)parcelable0).setClassLoader(this.getClass().getClassLoader());
        super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("superSavedInstanceState"));
        gevs gevs0 = (gevs)gciq.a(((Bundle)parcelable0), "buttonSpec", ((Parser)((ProtoLiteMessage)gevs.a).jf(7, null)));
        if(this.b == null) {
            this.b = gevs0;
        }
        gevs gevs1 = this.b;
        int v = 8;
        boolean z = true;
        if(Objects.equals(gevs0, gevs1)) {
        label_33:
            this.l = ((Bundle)parcelable0).getLong("timeWhenRefreshStartedMs");
            this.n = ((Bundle)parcelable0).getBoolean("requestedEnabledState");
            this.setText(((Bundle)parcelable0).getCharSequence("text"));
        }
        else if(gevs0 != null && gevs1 != null && ((gevs0.b & 0x20) != 0 && (gevs1.b & 0x20) != 0 && gevs0.h.equals(gevs1.h) || (gevs0.b & 0x20) == 0 && (gevs1.b & 0x20) == 0) && ((gevs0.b & 8) != 0 && (gevs1.b & 8) != 0 && gevs0.f.equals(gevs1.f) || (gevs0.b & 8) == 0 && (gevs1.b & 8) == 0) && ((gevs0.b & 16) != 0 && (gevs1.b & 16) != 0 && gevs0.g.equals(gevs1.g) || (gevs0.b & 16) == 0 && (gevs1.b & 16) == 0)) {
            int v1 = gevs0.b;
            if((v1 & 0x40) == 0) {
                if((gevs1.b & 0x40) == 0) {
                label_19:
                    if((v1 & 1) == 0) {
                        if((gevs1.b & 1) == 0) {
                        label_24:
                            if(gevs0.d == gevs1.d) {
                                goto label_33;
                            }
                            else {
                                this.setText(((this.b.b & 8) == 0 ? "" : this.b.f));
                            }
                        }
                        else {
                            this.setText(((this.b.b & 8) == 0 ? "" : this.b.f));
                        }
                    }
                    else if((gevs1.b & 1) == 0 || gevs0.c != gevs1.c) {
                        this.setText(((this.b.b & 8) == 0 ? "" : this.b.f));
                    }
                    else {
                        goto label_24;
                    }
                }
                else {
                    this.setText(((this.b.b & 8) == 0 ? "" : this.b.f));
                }
            }
            else if((gevs1.b & 0x40) == 0 || gevs0.i != gevs1.i) {
                this.setText(((this.b.b & 8) == 0 ? "" : this.b.f));
            }
            else {
                goto label_19;
            }
        }
        else {
            this.setText(((this.b.b & 8) == 0 ? "" : this.b.f));
        }
        this.p();
        this.g = ((Bundle)parcelable0).getBoolean("enabledByView", true);
        this.h = ((Bundle)parcelable0).getBoolean("enabledByDependencyGraph", true);
        this.i = ((Bundle)parcelable0).getInt("requestedVisibility", 0);
        this.j = ((Bundle)parcelable0).getBoolean("hiddenByDependencyGraph", false);
        if(this.l == -1L) {
            if(!this.g || !this.h) {
                z = false;
            }
            this.j(z);
        }
        else {
            this.j(false);
            this.run();
        }
        Bundle bundle0 = ((Bundle)parcelable0).getBundle("impressionLoggerState");
        this.d.c(bundle0);
        if(!this.j) {
            v = this.i;
        }
        super.setVisibility(v);
    }

    @Override  // android.widget.TextView
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        gciq.j(((Bundle)parcelable0), "buttonSpec", ((MessageLite)this.b));
        ((Bundle)parcelable0).putLong("timeWhenRefreshStartedMs", this.l);
        ((Bundle)parcelable0).putBoolean("requestedEnabledState", this.n);
        ((Bundle)parcelable0).putCharSequence("text", this.getText());
        ((Bundle)parcelable0).putBoolean("enabledByView", this.g);
        ((Bundle)parcelable0).putBoolean("enabledByDependencyGraph", this.h);
        ((Bundle)parcelable0).putInt("requestedVisibility", this.i);
        ((Bundle)parcelable0).putBoolean("hiddenByDependencyGraph", this.j);
        ((Bundle)parcelable0).putBundle("impressionLoggerState", this.d.a());
        return parcelable0;
    }

    private final void p() {
        if(this.b != null && (this.b.b & 4) != 0 && gcio.k((this.b.e == null ? gfgo.a : this.b.e).d)) {
            this.o(kv.a(this.getContext(), gdcb.ah(this.getContext(), (this.b.e == null ? gfgo.a : this.b.e).d)));
            this.q(this.isEnabled());
        }
    }

    private final void q(boolean z) {
        if(this.b != null && (this.b.b & 4) != 0) {
            Drawable[] arr_drawable = this.getCompoundDrawablesRelative();
            Drawable drawable0 = arr_drawable[0];
            if(drawable0 != null) {
                drawable0.setAlpha((z ? 0xFF : 77));
            }
            this.setCompoundDrawablesRelativeWithIntrinsicBounds(arr_drawable[0], arr_drawable[1], arr_drawable[2], arr_drawable[3]);
        }
    }

    @Override
    public final void run() {
        if((this.b.b & 0x40) == 0 || this.b.i <= 0) {
            throw new IllegalStateException("Timer based text changes not needed!");
        }
        long v = SystemClock.elapsedRealtime();
        gevs gevs0 = this.b;
        long v1 = ButtonComponent.g(this.l + ((long)gevs0.i) - v);
        if(v1 > 0L) {
            this.setText(((gevs0.b & 16) == 0 ? "" : String.format(this.getResources().getConfiguration().locale, this.b.g, ((long)(v1 / 1000L)))));
            this.postDelayed(this, Math.min(v1, 1000L));
            return;
        }
        this.f();
    }

    @Override  // android.widget.TextView
    public final void setEnabled(boolean z) {
        if(this.l != -1L) {
            this.n = z;
            return;
        }
        this.g = z;
        this.j(z && this.h);
    }

    @Override  // android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.e = view$OnClickListener0;
    }

    @Override  // android.widget.TextView
    public final void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        if(this.k && !TextUtils.isEmpty(charSequence0)) {
            charSequence0 = charSequence0.toString().toUpperCase(this.getResources().getConfiguration().locale);
        }
        super.setText(charSequence0, textView$BufferType0);
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        this.i = v;
        if(this.j) {
            v = 8;
        }
        super.setVisibility(v);
    }
}

