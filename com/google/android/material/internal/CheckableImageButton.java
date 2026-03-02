package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.widget.Checkable;
import fyll;
import fylm;
import kfe;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public boolean a;
    public boolean b;
    public boolean c;
    public fylm d;
    private static final int[] e;

    static {
        CheckableImageButton.e = new int[]{0x10100A0};
    }

    public CheckableImageButton(Context context0) {
        this(context0, null);
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040626);  // attr:imageButtonStyle
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = true;
        this.c = true;
        kfe.j(this, new fyll(this));
    }

    public final void a(boolean z) {
        if(this.b != z) {
            this.b = z;
            this.sendAccessibilityEvent(0);
        }
    }

    @Override  // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override  // android.widget.ImageView
    public final int[] onCreateDrawableState(int v) {
        return this.a ? CheckableImageButton.mergeDrawableStates(super.onCreateDrawableState(v + 1), CheckableImageButton.e) : super.onCreateDrawableState(v);
    }

    @Override  // android.widget.ImageView
    protected final void onDetachedFromWindow() {
        this.d = null;
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof CheckableImageButton.SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((CheckableImageButton.SavedState)parcelable0).d);
        this.setChecked(((CheckableImageButton.SavedState)parcelable0).a);
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new CheckableImageButton.SavedState(super.onSaveInstanceState());
        parcelable0.a = this.a;
        return parcelable0;
    }

    @Override  // android.widget.Checkable
    public final void setChecked(boolean z) {
        if(this.b && this.a != z) {
            this.a = z;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(0x800);
        }
    }

    @Override  // android.view.View
    public final void setFocusable(boolean z) {
        boolean z1 = this.isFocusable();
        super.setFocusable(z);
        if(z1 != z) {
            fylm fylm0 = this.d;
            if(fylm0 != null) {
                fylm0.a();
            }
        }
    }

    @Override  // android.view.View
    public final void setPressed(boolean z) {
        if(this.c) {
            super.setPressed(z);
        }
    }

    @Override  // android.widget.Checkable
    public final void toggle() {
        this.setChecked(((boolean)(this.a ^ 1)));
    }
}

