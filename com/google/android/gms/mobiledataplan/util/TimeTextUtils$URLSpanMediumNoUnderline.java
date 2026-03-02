package com.google.android.gms.mobiledataplan.util;

import android.text.TextPaint;
import android.text.style.URLSpan;
import csly;

public class TimeTextUtils.URLSpanMediumNoUnderline extends URLSpan {
    public TimeTextUtils.URLSpanMediumNoUnderline(String s) {
        super(s);
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        super.updateDrawState(textPaint0);
        textPaint0.setUnderlineText(false);
        textPaint0.setTypeface(csly.a);
    }
}

