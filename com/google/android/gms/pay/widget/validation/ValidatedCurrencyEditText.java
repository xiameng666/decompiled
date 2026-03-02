package com.google.android.gms.pay.widget.validation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import efmr;
import efmt;
import fscd;
import java.util.Locale;

public class ValidatedCurrencyEditText extends LinearLayout implements efmt {
    public final ValidatedEditText a;
    public final TextView b;
    public int c;
    public final int d;

    public ValidatedCurrencyEditText(Context context0) {
        this(context0, null);
    }

    public ValidatedCurrencyEditText(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ValidatedCurrencyEditText(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, 0);
        ValidatedCurrencyEditText.inflate(context0, 0x7F0E0C25, this);  // layout:validated_currency_edit_text
        TextView textView0 = (TextView)this.findViewById((fscd.l(Locale.getDefault()) == 2 ? 0x7F0B085B : 0x7F0B069A));  // id:SuffixMoneySymbol
        this.b = textView0;
        textView0.setVisibility(0);
        ValidatedEditText validatedEditText0 = (ValidatedEditText)this.findViewById(0x7F0B05A4);  // id:MoneyInput
        this.a = validatedEditText0;
        validatedEditText0.setRawInputType(0x2002);
        this.d = validatedEditText0.getPaddingStart();
        validatedEditText0.a.a(context0, attributeSet0);
    }

    @Override  // efmt
    public final boolean a() {
        return this.a.a();
    }

    public static final boolean b() {
        return fscd.l(Locale.getDefault()) == 2;
    }

    @Override  // android.view.ViewGroup
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setOrientation(0);
        efmr efmr0 = new efmr(this);
        this.a.addTextChangedListener(efmr0);
    }

    @Override  // android.widget.LinearLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(ValidatedCurrencyEditText.b()) {
            int v4 = this.a.hasFocus() || this.c != 0 ? this.d : this.d + 8;
            int v5 = this.a.getPaddingTop();
            this.a.setPaddingRelative(v4, v5, this.b.getPaddingEnd() + 8, this.a.getPaddingBottom());
            this.b.setPaddingRelative((this.c == 0 ? this.d + this.c : this.d + this.c + 8), this.b.getPaddingTop(), this.b.getPaddingEnd(), this.b.getPaddingBottom());
            return;
        }
        int v6 = this.b.getWidth() + 8;
        int v7 = this.a.getPaddingTop();
        int v8 = this.a.getPaddingEnd();
        int v9 = this.a.getPaddingBottom();
        this.a.setPaddingRelative(v6, v7, v8, v9);
    }
}

