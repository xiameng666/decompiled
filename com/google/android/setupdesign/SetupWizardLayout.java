package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.view.Illustration;
import com.google.android.setupdesign.view.NavigationBar;
import gafo;
import gagt;
import gahu;
import gahy;
import gaie;
import gaig;
import gaiw;
import gaix;

public class SetupWizardLayout extends TemplateLayout {
    public SetupWizardLayout(Context context0) {
        super(context0, 0, 0);
        this.a(null, 0x7F040C1D);  // attr:sudLayoutTheme
    }

    public SetupWizardLayout(Context context0, int v) {
        this(context0, v, 0);
    }

    public SetupWizardLayout(Context context0, int v, int v1) {
        super(context0, v, v1);
        this.a(null, 0x7F040C1D);  // attr:sudLayoutTheme
    }

    public SetupWizardLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a(attributeSet0, 0x7F040C1D);  // attr:sudLayoutTheme
    }

    public SetupWizardLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a(attributeSet0, v);
    }

    private void a(AttributeSet attributeSet0, int v) {
        if(this.isInEditMode()) {
            return;
        }
        ScrollView scrollView0 = null;
        gafo gafo0 = new gafo(this, null);
        this.v(gafo.class, gafo0);
        gahy gahy0 = new gahy(this, attributeSet0, v);
        this.v(gahy.class, gahy0);
        gahu gahu0 = new gahu(this, attributeSet0, v);
        this.v(gahu.class, gahu0);
        gaig gaig0 = new gaig(this, null, 0);
        this.v(gaig.class, gaig0);
        gaie gaie0 = new gaie(this);
        this.v(gaie.class, gaie0);
        gaiw gaiw0 = new gaiw(this);
        this.v(gaiw.class, gaiw0);
        View view0 = this.r(0x7F0B213B);  // id:sud_bottom_scroll_view
        if((view0 instanceof ScrollView)) {
            scrollView0 = (ScrollView)view0;
        }
        if(scrollView0 != null) {
            gaiw0.c = new gaix(gaiw0, scrollView0);
        }
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, gagt.x, v, 0);
        Drawable drawable0 = typedArray0.getDrawable(0);
        if(drawable0 == null) {
            Drawable drawable1 = typedArray0.getDrawable(1);
            if(drawable1 != null) {
                if((drawable1 instanceof BitmapDrawable)) {
                    ((BitmapDrawable)drawable1).setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                }
                this.q(drawable1);
            }
        }
        else {
            this.q(drawable0);
        }
        Drawable drawable2 = typedArray0.getDrawable(3);
        if(drawable2 == null) {
            Drawable drawable3 = typedArray0.getDrawable(6);
            Drawable drawable4 = typedArray0.getDrawable(5);
            if(drawable3 != null && drawable4 != null) {
                View view2 = this.r(0x7F0B2168);  // id:sud_layout_decor
                if((view2 instanceof Illustration)) {
                    if(this.getContext().getResources().getBoolean(0x7F05004D)) {  // bool:sudUseTabletLayout
                        if((drawable4 instanceof BitmapDrawable)) {
                            ((BitmapDrawable)drawable4).setTileModeX(Shader.TileMode.REPEAT);
                            ((BitmapDrawable)drawable4).setGravity(0x30);
                        }
                        if((drawable3 instanceof BitmapDrawable)) {
                            ((BitmapDrawable)drawable3).setGravity(51);
                        }
                        LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{drawable4, drawable3});
                        layerDrawable0.setAutoMirrored(true);
                        drawable3 = layerDrawable0;
                    }
                    else {
                        drawable3.setAutoMirrored(true);
                    }
                    ((Illustration)view2).a(drawable3);
                }
            }
        }
        else {
            View view1 = this.r(0x7F0B2168);  // id:sud_layout_decor
            if((view1 instanceof Illustration)) {
                ((Illustration)view1).a(drawable2);
            }
        }
        int v1 = typedArray0.getDimensionPixelSize(2, -1);
        if(v1 == -1) {
            v1 = this.getResources().getDimensionPixelSize(0x7F0711AA);  // dimen:sud_decor_padding_top
        }
        View view3 = this.r(0x7F0B2168);  // id:sud_layout_decor
        if(view3 != null) {
            view3.setPadding(view3.getPaddingLeft(), v1, view3.getPaddingRight(), view3.getPaddingBottom());
        }
        float f = typedArray0.getFloat(4, -1.0f);
        if(f == -1.0f) {
            TypedValue typedValue0 = new TypedValue();
            this.getResources().getValue(0x7F07124D, typedValue0, true);  // dimen:sud_illustration_aspect_ratio
            f = typedValue0.getFloat();
        }
        View view4 = this.r(0x7F0B2168);  // id:sud_layout_decor
        if((view4 instanceof Illustration)) {
            ((Illustration)view4).a = f;
            ((Illustration)view4).invalidate();
            ((Illustration)view4).requestLayout();
        }
        typedArray0.recycle();
    }

    public final void b(CharSequence charSequence0) {
        ((gahy)this.t(gahy.class)).d(charSequence0);
    }

    @Override  // com.google.android.setupcompat.internal.TemplateLayout
    protected View l(LayoutInflater layoutInflater0, int v) {
        if(v == 0) {
            v = 0x7F0E0ACD;  // layout:sud_template
        }
        return this.s(layoutInflater0, 0x7F160962, v);  // style:SudThemeMaterial.Light
    }

    @Override  // com.google.android.setupcompat.internal.TemplateLayout
    protected ViewGroup m(int v) {
        if(v == 0) {
            v = 0x7F0B2167;  // id:sud_layout_content
        }
        return super.m(v);
    }

    public final TextView o() {
        return ((gahy)this.t(gahy.class)).a();
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SetupWizardLayout.SavedState)) {
            Log.w("SetupWizardLayout", "Ignoring restore instance state " + parcelable0);
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SetupWizardLayout.SavedState)parcelable0).getSuperState());
        this.w(((SetupWizardLayout.SavedState)parcelable0).a);
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SetupWizardLayout.SavedState(super.onSaveInstanceState());
        parcelable0.a = ((gaig)this.t(gaig.class)).d();
        return parcelable0;
    }

    public final NavigationBar p() {
        return ((gaie)this.t(gaie.class)).a();
    }

    public final void q(Drawable drawable0) {
        View view0 = this.r(0x7F0B2168);  // id:sud_layout_decor
        if(view0 != null) {
            view0.setBackgroundDrawable(drawable0);
        }
    }

    public final void w(boolean z) {
        ((gaig)this.t(gaig.class)).c(z);
    }
}

