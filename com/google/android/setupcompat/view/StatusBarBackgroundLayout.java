package com.google.android.setupcompat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import gaec;
import gafs;
import java.util.Locale;

public class StatusBarBackgroundLayout extends FrameLayout {
    public Drawable a;
    private static final gafs b;
    private WindowInsets c;

    static {
        StatusBarBackgroundLayout.b = new gafs("StatusBarBgLayout");
    }

    public StatusBarBackgroundLayout(Context context0) {
        super(context0);
    }

    public StatusBarBackgroundLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public StatusBarBackgroundLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets0) {
        int v = windowInsets0.getSystemWindowInsetBottom();
        boolean z = gaec.t(this.getContext());
        StatusBarBackgroundLayout.b.a(String.format(Locale.US, "Apply edge to edge, glifExpressiveEnabled: %s, isAtLeastLollipop: %s, windowInsetBottom: %d", Boolean.valueOf(z), Boolean.valueOf(true), v));
        if(z && v > 0) {
            windowInsets0 = windowInsets0.replaceSystemWindowInsets(0, windowInsets0.getSystemWindowInsetTop(), 0, this.findViewById(0x7F0B2132).getPaddingBottom());  // id:suc_layout_status
        }
        this.c = windowInsets0;
        return super.onApplyWindowInsets(windowInsets0);
    }

    @Override  // android.view.ViewGroup
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.c == null) {
            this.requestApplyInsets();
        }
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        WindowInsets windowInsets0 = this.c;
        if(windowInsets0 != null) {
            int v = windowInsets0.getSystemWindowInsetTop();
            if(v > 0) {
                this.a.setBounds(0, 0, this.getWidth(), v);
                this.a.draw(canvas0);
            }
        }
    }
}

