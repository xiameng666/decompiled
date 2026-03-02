package com.google.android.gms.pay.widget.componentlayouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;
import efle;

public class ExpandableTextView extends AppCompatTextView {
    private int a;
    private boolean b;
    private boolean c;

    public ExpandableTextView(Context context0) {
        this(context0, null);
    }

    public ExpandableTextView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ExpandableTextView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = 2;
        this.c = false;
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, efle.a, 0, 0);
        try {
            this.a = typedArray0.getInteger(1, this.a);
            this.c = typedArray0.getBoolean(0, this.c);
        }
        finally {
            typedArray0.recycle();
        }
    }

    // Detected as a lambda impl.
    public final void a() {
        if(this.b) {
        label_3:
            int v = this.b;
            this.b = v ^ 1;
            this.setMaxLines((v == 0 ? 0x7FFFFFFF : this.a));
        }
        else {
            Layout layout0 = this.getLayout();
            if(layout0 != null && layout0.getEllipsisCount(layout0.getLineCount() - 1) > 0) {
                goto label_3;
            }
        }
    }

    @Override  // android.widget.TextView
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setMaxLines(this.a);
        this.b = false;
        if(!this.c) {
            this.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> if(this.b) {
            label_3:
                int v = this.b;
                this.b = v ^ 1;
                this.setMaxLines((v == 0 ? 0x7FFFFFFF : this.a));
            }
            else {
                Layout layout0 = this.getLayout();
                if(layout0 != null && layout0.getEllipsisCount(layout0.getLineCount() - 1) > 0) {
                    goto label_3;
                }
            });
        }
    }
}

