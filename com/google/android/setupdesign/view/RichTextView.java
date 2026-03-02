package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView.BufferType;
import gafp;
import gagv;
import gahp;
import gahr;
import gahs;
import gaht;
import gajy;
import kfe;

public class RichTextView extends AppCompatTextView implements gahr {
    public static Typeface a;
    public gahr b;
    private gagv c;

    public RichTextView(Context context0) {
        super(context0);
        this.a();
    }

    public RichTextView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a();
    }

    @Override  // gahr
    public final void G() {
    }

    private final void a() {
        if(this.isInEditMode()) {
            return;
        }
        gagv gagv0 = new gagv();
        this.c = gagv0;
        kfe.j(this, gagv0);
    }

    @Override  // android.support.v7.widget.AppCompatTextView
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable[] arr_drawable = this.getCompoundDrawablesRelative();
        for(int v = 0; v < arr_drawable.length; ++v) {
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null && drawable0.setState(arr_v)) {
                this.invalidateDrawable(drawable0);
            }
        }
    }

    @Override  // android.widget.TextView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = super.onTouchEvent(motionEvent0);
        MovementMethod movementMethod0 = this.getMovementMethod();
        return !(movementMethod0 instanceof gajy) || ((gajy)movementMethod0).b != motionEvent0 ? z : ((gajy)movementMethod0).a;
    }

    @Override  // android.widget.TextView
    public final void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        Context context0 = this.getContext();
        if((charSequence0 instanceof Spanned)) {
            SpannableString spannableString0 = new SpannableString(charSequence0);
            Annotation[] arr_annotation = (Annotation[])spannableString0.getSpans(0, spannableString0.length(), Annotation.class);
            for(int v = 0; v < arr_annotation.length; ++v) {
                Annotation annotation0 = arr_annotation[v];
                String s = annotation0.getKey();
                if("textAppearance".equals(s)) {
                    String s1 = annotation0.getValue();
                    int v1 = context0.getResources().getIdentifier(s1, "style", "com.google.android.gms");
                    if(v1 == 0) {
                        Log.w("RichTextView", "Cannot find resource: 0");
                        v1 = 0;
                    }
                    gaht.a(spannableString0, annotation0, new Object[]{new TextAppearanceSpan(context0, v1)});
                }
                else if("link".equals(s)) {
                    gahs gahs0 = gafp.b() ? new gahp(context0, annotation0.getValue()) : new gahs(annotation0.getValue());
                    gaht.a(spannableString0, annotation0, new Object[]{gahs0, (RichTextView.a == null ? new TypefaceSpan("sans-serif-medium") : new TypefaceSpan(RichTextView.a))});
                }
            }
            charSequence0 = spannableString0;
        }
        super.setText(charSequence0, textView$BufferType0);
        boolean z = (charSequence0 instanceof Spanned) && ((ClickableSpan[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), ClickableSpan.class)).length > 0;
        if(z) {
            this.setMovementMethod(new gajy());
        }
        else {
            this.setMovementMethod(null);
        }
        this.setFocusable(z);
        this.setRevealOnFocusHint(false);
        this.setFocusableInTouchMode(z);
    }
}

