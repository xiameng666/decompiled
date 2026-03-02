package com.android.settingslib.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LinkableTextView extends AppCompatTextView {
    public LinkableTextView(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public LinkableTextView(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public LinkableTextView(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
    }

    public LinkableTextView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // android.widget.TextView
    public final void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        ibuq.f(charSequence0, "text");
        super.setText(charSequence0, textView$BufferType0);
        if((charSequence0 instanceof Spanned) && ((ClickableSpan[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), ClickableSpan.class)).length > 0) {
            this.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}

