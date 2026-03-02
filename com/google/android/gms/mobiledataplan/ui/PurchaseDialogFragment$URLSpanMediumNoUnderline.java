package com.google.android.gms.mobiledataplan.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import csep;

public class PurchaseDialogFragment.URLSpanMediumNoUnderline extends URLSpan {
    public PurchaseDialogFragment.URLSpanMediumNoUnderline(String s) {
        super(s);
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        super.updateDrawState(textPaint0);
        textPaint0.setUnderlineText(false);
        textPaint0.setTypeface(csep.ag);
    }
}

