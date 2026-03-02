package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import fylz;
import fymj;
import kdl;
import kfe;
import nd;
import no;
import sc;

public class NavigationMenuItemView extends fylz implements no {
    public int c;
    public boolean d;
    public boolean e;
    public boolean i;
    public final CheckedTextView j;
    public FrameLayout k;
    public nd l;
    public ColorStateList m;
    public boolean n;
    private static final int[] o;
    private Drawable p;
    private final kdl q;

    static {
        NavigationMenuItemView.o = new int[]{0x10100A0};
    }

    public NavigationMenuItemView(Context context0) {
        this(context0, null);
    }

    public NavigationMenuItemView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public NavigationMenuItemView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.i = true;
        fymj fymj0 = new fymj(this);
        this.q = fymj0;
        this.r(0);
        LayoutInflater.from(context0).inflate(0x7F0E02D0, this, true);  // layout:design_navigation_menu_item
        this.c = context0.getResources().getDimensionPixelSize(0x7F070504);  // dimen:design_navigation_icon_size
        CheckedTextView checkedTextView0 = (CheckedTextView)this.findViewById(0x7F0B10FA);  // id:design_menu_item_text
        this.j = checkedTextView0;
        kfe.j(checkedTextView0, fymj0);
    }

    @Override  // no
    public final nd a() {
        return this.l;
    }

    public final void b(Drawable drawable0) {
        if(drawable0 != null) {
            if(this.n) {
                Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                if(drawable$ConstantState0 != null) {
                    drawable0 = drawable$ConstantState0.newDrawable();
                }
                drawable0 = drawable0.mutate();
                drawable0.setTintList(this.m);
            }
            drawable0.setBounds(0, 0, this.c, this.c);
        }
        else if(this.d) {
            if(this.p == null) {
                Drawable drawable1 = this.getResources().getDrawable(0x7F08095E, this.getContext().getTheme());  // drawable:navigation_empty_icon
                this.p = drawable1;
                if(drawable1 != null) {
                    drawable1.setBounds(0, 0, this.c, this.c);
                }
            }
            drawable0 = this.p;
        }
        this.j.setCompoundDrawablesRelative(drawable0, null, null, null);
    }

    @Override  // no
    public final boolean e() {
        return false;
    }

    @Override  // no
    public final void f(nd nd0) {
        StateListDrawable stateListDrawable0;
        this.l = nd0;
        int v = nd0.a;
        if(v > 0) {
            this.setId(v);
        }
        int v1 = 1;
        this.setVisibility((nd0.isVisible() ? 0 : 8));
        if(this.getBackground() == null) {
            TypedValue typedValue0 = new TypedValue();
            if(this.getContext().getTheme().resolveAttribute(0x7F0402BE, typedValue0, true)) {  // attr:colorControlHighlight
                stateListDrawable0 = new StateListDrawable();
                ColorDrawable colorDrawable0 = new ColorDrawable(typedValue0.data);
                stateListDrawable0.addState(NavigationMenuItemView.o, colorDrawable0);
                stateListDrawable0.addState(NavigationMenuItemView.EMPTY_STATE_SET, new ColorDrawable(0));
            }
            else {
                stateListDrawable0 = null;
            }
            this.setBackground(stateListDrawable0);
        }
        boolean z = nd0.isCheckable();
        this.refreshDrawableState();
        if(this.e != z) {
            this.e = z;
            this.q.e(this.j, 0x800);
        }
        boolean z1 = nd0.isChecked();
        this.refreshDrawableState();
        CheckedTextView checkedTextView0 = this.j;
        checkedTextView0.setChecked(z1);
        Typeface typeface0 = checkedTextView0.getTypeface();
        if(!z1 || !this.i) {
            v1 = 0;
        }
        checkedTextView0.setTypeface(typeface0, v1);
        this.setEnabled(nd0.isEnabled());
        checkedTextView0.setText(nd0.d);
        this.b(nd0.getIcon());
        View view0 = nd0.getActionView();
        if(view0 != null) {
            if(this.k == null) {
                this.k = (FrameLayout)((ViewStub)this.findViewById(0x7F0B10F9)).inflate();  // id:design_menu_item_action_area_stub
            }
            if(view0.getParent() != null) {
                ((ViewGroup)view0.getParent()).removeView(view0);
            }
            this.k.removeAllViews();
            this.k.addView(view0);
        }
        this.setContentDescription(nd0.l);
        this.setTooltipText(nd0.m);
        if(this.l.d == null && this.l.getIcon() == null && this.l.getActionView() != null) {
            checkedTextView0.setVisibility(8);
            FrameLayout frameLayout0 = this.k;
            if(frameLayout0 != null) {
                sc sc0 = (sc)frameLayout0.getLayoutParams();
                sc0.width = -1;
                this.k.setLayoutParams(sc0);
            }
        }
        else {
            checkedTextView0.setVisibility(0);
            FrameLayout frameLayout1 = this.k;
            if(frameLayout1 != null) {
                sc sc1 = (sc)frameLayout1.getLayoutParams();
                sc1.width = -2;
                this.k.setLayoutParams(sc1);
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected final int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.l != null && this.l.isCheckable() && this.l.isChecked()) {
            NavigationMenuItemView.mergeDrawableStates(arr_v, NavigationMenuItemView.o);
        }
        return arr_v;
    }
}

