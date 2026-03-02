package com.google.android.wallet.bender3.impl.ui.common.input.dateinput;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import gcbl;
import gcbm;
import gkwv;
import java.util.List;
import java.util.regex.Pattern;

public class DateInputEditText extends TextInputEditText {
    public List a;
    public Pattern b;
    public String c;
    public String d;
    public String e;
    public String f;
    public gkwv g;
    public gcbm h;

    public DateInputEditText(Context context0) {
        super(context0);
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = gkwv.b;
        this.addTextChangedListener(new gcbl(this));
    }

    public DateInputEditText(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = gkwv.b;
        this.addTextChangedListener(new gcbl(this));
    }

    public DateInputEditText(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = gkwv.b;
        this.addTextChangedListener(new gcbl(this));
    }
}

