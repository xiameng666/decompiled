package com.google.android.wallet.bender3.impl.ui.common.input;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import gbne;
import gcay;
import gcbb;
import gcbc;
import gcbd;
import gcbe;
import gcbf;
import gged_interceptors;
import ggia;
import gkwv;
import hdkw;
import hdkx;
import hdlc;
import hdle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TransformEditText extends gbne {
    public gcbd f;
    final ArrayList g;
    public final gcbf h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public StringBuilder m;
    TextWatcher n;

    public TransformEditText(Context context0) {
        super(context0);
        this.g = new ArrayList();
        this.h = new gcbf();
        this.l = -1;
        this.b();
    }

    public TransformEditText(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = new ArrayList();
        this.h = new gcbf();
        this.l = -1;
        this.b();
    }

    public TransformEditText(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.g = new ArrayList();
        this.h = new gcbf();
        this.l = -1;
        this.b();
    }

    @Override  // gbne
    public final void b() {
        super.b();
        this.m = new StringBuilder();
        gcbc gcbc0 = new gcbc(this);
        this.n = gcbc0;
        this.addTextChangedListener(gcbc0);
    }

    public final String d() {
        Editable editable0 = this.getText();
        return editable0 == null ? "" : editable0.toString();
    }

    @Override  // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        if(accessibilityEvent0.getEventType() == 0x2000) {
            int v = this.getText().length();
            return accessibilityEvent0.getFromIndex() != v || accessibilityEvent0.getToIndex() != v ? super.dispatchPopulateAccessibilityEvent(accessibilityEvent0) : false;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
    }

    public final void e(gcbf gcbf0) {
        for(Object object0: ggia.g(this.g)) {
            ((gcbe)object0).b(gcbf0);
        }
    }

    public final void f(gcbf gcbf0) {
        ArrayList arrayList0 = this.g;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((gcbe)arrayList0.get(v1)).c(gcbf0, this.hasFocus());
        }
    }

    public final void g() {
        if(this.f != null) {
            this.d();
        }
    }

    @Override  // android.widget.EditText
    public final boolean getFreezesText() {
        return false;
    }

    public final void h(gkwv gkwv0) {
        gcbd gcbd0 = this.f;
        if(gcbd0 != null) {
            gcbd0.f(this.m.toString(), gkwv0);
        }
    }

    public final void i(boolean z) {
        gcbf gcbf0 = this.h;
        StringBuilder stringBuilder0 = this.m;
        gcbf0.a = stringBuilder0;
        gcbf0.b = z ? stringBuilder0.length() : this.k;
        this.f(gcbf0);
        int v = gcbf0.b;
        this.i = true;
        this.setText(gcbf0.a);
        this.setSelection(v);
        this.i = false;
        this.g();
    }

    public final void j(gged_interceptors gged0) {
        this.setFilters(((InputFilter[])gged0.toArray(new InputFilter[0])));
    }

    public final void k(List list0) {
        gcay gcay0;
        ArrayList arrayList0 = this.g;
        arrayList0.clear();
        for(Object object0: list0) {
            hdkx hdkx0 = (hdkx)object0;
            int v = hdkx0.b;
            int v1 = hdkw.a(v);
            if(v1 == 0) {
                throw null;
            }
            switch(v1 - 1) {
                case 2: {
                    gcay0 = new gcay((v == 2 ? ((hdlc)hdkx0.c) : hdlc.a));
                    break;
                }
                case 4: {
                    gcay0 = new gcbb((v == 4 ? ((hdle)hdkx0.c) : hdle.a));
                    break;
                }
                default: {
                    Locale locale0 = Locale.US;
                    int v2 = hdkw.a(hdkx0.b);
                    if(v2 != 0) {
                        throw new IllegalArgumentException(String.format(locale0, "Following type of formatting strategy is not supported: %s.", ((int)(v2 - 1))));
                    }
                    throw null;
                }
            }
            arrayList0.add(gcay0);
            continue;
        }
        this.i(false);
        int v4 = arrayList0.size();
        int v5 = -1;
        for(int v3 = 0; v3 < v4; ++v3) {
            int v6 = ((gcbe)arrayList0.get(v3)).a();
            if(v6 >= 0) {
                v5 = v5 < 0 ? v6 : Math.min(v5, v6);
            }
        }
        this.l = v5;
    }

    @Override  // gbne
    public final void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(z && TextUtils.isEmpty(this.getText())) {
            this.i(true);
        }
    }

    @Override  // android.widget.TextView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = !this.hasFocus() && TextUtils.isEmpty(this.getText());
        boolean z1 = super.onTouchEvent(motionEvent0);
        if(z && this.hasFocus() && motionEvent0.getAction() == 1) {
            this.i(true);
        }
        return z1;
    }
}

