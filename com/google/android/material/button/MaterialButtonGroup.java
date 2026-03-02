package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import fygj;
import fygk;
import fygl;
import fygm;
import fygn;
import fygo;
import fygr;
import fynk;
import fynt;
import fyse;
import fytx;
import fyur;
import fyut;
import fyvk;
import fyvl;
import fyvm;
import fyvo;
import fyvp;
import fzaq;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import na;
import tb;

public class MaterialButtonGroup extends LinearLayout {
    public static final Object a;
    fyvk b;
    public fyvp c;
    public tb d;
    private int e;
    private final List f;
    private final fygn g;
    private final Comparator h;
    private Integer[] i;
    private fyvm j;
    private int k;
    private boolean l;
    private final int m;
    private boolean n;
    private MaterialButton o;
    private final Map p;
    private final Map q;
    private final List r;
    private final List s;

    static {
        MaterialButtonGroup.a = new Object();
    }

    public MaterialButtonGroup(Context context0) {
        this(context0, null);
    }

    public MaterialButtonGroup(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F040851);  // attr:materialButtonGroupStyle
    }

    public MaterialButtonGroup(Context context0, AttributeSet attributeSet0, int v) {
        super(fzaq.a(context0, attributeSet0, v, 0x7F1613E2), attributeSet0, v);  // style:Widget.Material3.MaterialButtonGroup
        this.e = 0;
        this.f = new ArrayList();
        this.g = new fygn(this);
        this.h = new fygk(this);
        this.l = true;
        this.p = new HashMap();
        this.q = new HashMap();
        this.r = new ArrayList();
        this.s = new ArrayList();
        Context context1 = this.getContext();
        TypedArray typedArray0 = fynk.a(context1, attributeSet0, fygr.b, v, 0x7F1613E2, new int[0]);  // style:Widget.Material3.MaterialButtonGroup
        if(typedArray0.hasValue(2)) {
            this.c = fyvp.b(context1, typedArray0);
        }
        if(typedArray0.hasValue(6)) {
            fyvm fyvm0 = fyvm.g(context1, typedArray0, 6);
            this.j = fyvm0;
            if(fyvm0 == null) {
                this.j = new fyvl(new fyut(fyut.h(context1, typedArray0.getResourceId(6, 0), typedArray0.getResourceId(7, 0)))).a();
            }
        }
        if(typedArray0.hasValue(3)) {
            this.b = fyvk.d(context1, typedArray0, new fytx(0.0f));
        }
        this.k = typedArray0.getDimensionPixelSize(1, 0);
        this.setChildrenDrawingOrderEnabled(true);
        this.setEnabled(typedArray0.getBoolean(0, true));
        int v1 = typedArray0.getInt(5, 0);
        if(this.e != v1) {
            this.e = v1;
            this.requestLayout();
            this.invalidate();
        }
        this.m = this.getResources().getDimensionPixelOffset(0x7F070962);  // dimen:m3_btn_group_overflow_item_icon_horizontal_padding
        if(this.g()) {
            Drawable drawable0 = typedArray0.getDrawable(4);
            MaterialButton materialButton0 = (MaterialButton)LayoutInflater.from(context1).inflate(0x7F0E054E, this, false);  // layout:m3_button_group_overflow_button
            this.o = materialButton0;
            materialButton0.setTag(MaterialButtonGroup.a);
            this.o.u(drawable0);
            if(this.o.getContentDescription() == null) {
                this.o.setContentDescription("Overflow menu");
            }
            this.o.setVisibility(8);
            int v2 = fyse.e(this, 0x7F040850).data;  // attr:materialButtonGroupPopupMenuStyle
            tb tb0 = new tb(this.getContext(), this.o, v2);
            this.d = tb0;
            tb0.b.d(true);
            this.o.setOnClickListener(new fygj(this));
            this.addView(this.o);
            this.n = true;
        }
        typedArray0.recycle();
    }

    final MaterialButton a(int v) {
        return (MaterialButton)this.getChildAt(v);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!(view0 instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        this.n();
        this.l = true;
        int v1 = this.indexOfChild(this.o);
        if(v1 >= 0 && v == -1) {
            super.addView(view0, v1, viewGroup$LayoutParams0);
        }
        else {
            super.addView(view0, v, viewGroup$LayoutParams0);
        }
        if(((MaterialButton)view0).getId() == -1) {
            ((MaterialButton)view0).setId(View.generateViewId());
        }
        ((MaterialButton)view0).x = this.g;
        List list0 = this.f;
        if(!((MaterialButton)view0).G()) {
            throw new IllegalStateException("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        }
        list0.add(((MaterialButton)view0).j.b);
        ((MaterialButton)view0).setEnabled(this.isEnabled());
    }

    public final MaterialButton b(int v) {
        int v1 = this.getChildCount();
        while(true) {
            ++v;
            if(v >= v1) {
                break;
            }
            if(this.o(v)) {
                return this.a(v);
            }
        }
        return null;
    }

    public final MaterialButton c(int v) {
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(this.o(v)) {
                return this.a(v);
            }
        }
        return null;
    }

    @Override  // android.widget.LinearLayout
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof fygm;
    }

    public final fygm d(AttributeSet attributeSet0) {
        return new fygm(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchDraw(Canvas canvas0) {
        TreeMap treeMap0 = new TreeMap(this.h);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            treeMap0.put(this.a(v1), Integer.valueOf(v1));
        }
        this.i = (Integer[])treeMap0.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas0);
    }

    final void e() {
        int v5;
        if((this.b != null || this.j != null) && this.l) {
            this.l = false;
            int v = this.getChildCount();
            int v1 = this.j();
            int v2 = this.k();
            for(int v3 = 0; v3 < v; ++v3) {
                MaterialButton materialButton0 = this.a(v3);
                if(materialButton0.getVisibility() != 8) {
                    fyur fyur0 = this.j;
                    if(fyur0 == null || v3 != v1 && v3 != v2) {
                        fyur0 = (fyur)this.f.get(v3);
                    }
                    fyvl fyvl0 = (fyur0 instanceof fyvm) ? new fyvl(((fyvm)fyur0)) : new fyvl(((fyut)this.f.get(v3)));
                    int v4 = this.getOrientation();
                    boolean z = fynt.k(this);
                    if(v4 == 0) {
                        v5 = v3 == v1 ? 5 : 0;
                        if(v3 == v2) {
                            v5 |= 10;
                        }
                        if(z) {
                            int v6 = v5 & 5;
                            v5 = (v5 & 10) >> 1 | v6 + v6;
                        }
                    }
                    else {
                        v5 = v3 == v1 ? 3 : 0;
                        if(v3 == v2) {
                            v5 |= 12;
                        }
                    }
                    fyvk fyvk0 = this.b;
                    if(fyut.k(~v5, 1)) {
                        fyvl0.e = fyvk0;
                    }
                    if(fyut.k(~v5, 2)) {
                        fyvl0.f = fyvk0;
                    }
                    if(fyut.k(~v5, 4)) {
                        fyvl0.g = fyvk0;
                    }
                    if(fyut.k(~v5, 8)) {
                        fyvl0.h = fyvk0;
                    }
                    fyvm fyvm0 = fyvl0.a();
                    if(!fyvm0.e()) {
                        fyvm0 = fyvm0.h();
                    }
                    if(!materialButton0.G()) {
                        throw new IllegalStateException("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
                    }
                    fygo fygo0 = materialButton0.j;
                    if(fygo0.c == null && fyvm0.e()) {
                        fygo0.c(materialButton0.lH());
                    }
                    fygo0.d(fyvm0);
                    continue;
                }
            }
        }
    }

    public final void f() {
        for(Object object0: this.q.entrySet()) {
            Button button0 = (Button)((Map.Entry)object0).getKey();
            MenuItem menuItem0 = (MenuItem)((Map.Entry)object0).getValue();
            if((((Map.Entry)object0).getKey() instanceof MaterialButton)) {
                menuItem0.setCheckable(((MaterialButton)button0).F());
                menuItem0.setChecked(((MaterialButton)button0).n);
            }
            menuItem0.setEnabled(button0.isEnabled());
        }
    }

    public boolean g() {
        return true;
    }

    @Override  // android.widget.LinearLayout
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new fygm(-2, -2);
    }

    @Override  // android.widget.LinearLayout
    protected final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new fygm(-2, -2);
    }

    @Override  // android.widget.LinearLayout
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.d(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return MaterialButtonGroup.i(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.LinearLayout
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.d(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected final LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return MaterialButtonGroup.i(viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected final int getChildDrawingOrder(int v, int v1) {
        Integer[] arr_integer = this.i;
        if(arr_integer != null && v1 < arr_integer.length) {
            return (int)arr_integer[v1];
        }
        Log.w("MButtonGroup", "Child order wasn\'t updated");
        return v1;
    }

    static final LinearLayout.LayoutParams h(View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return (viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams) ? ((LinearLayout.LayoutParams)viewGroup$LayoutParams0) : new fygm(viewGroup$LayoutParams0.width, viewGroup$LayoutParams0.height);
    }

    protected static final fygm i(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if((viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams)) {
            return new fygm(((LinearLayout.LayoutParams)viewGroup$LayoutParams0));
        }
        return (viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) ? new fygm(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new fygm(viewGroup$LayoutParams0);
    }

    private final int j() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.o(v1)) {
                return v1;
            }
        }
        return -1;
    }

    private final int k() {
        for(int v = this.getChildCount() - 1; v >= 0; --v) {
            if(this.o(v)) {
                return v;
            }
        }
        return -1;
    }

    private final int l(boolean z, Button button0, int v, int v1) {
        int v4;
        int v3;
        this.measureChild(button0, v, v1);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)button0.getLayoutParams();
        int v2 = z ? button0.getMeasuredWidth() : button0.getMeasuredHeight();
        if(z) {
            v3 = linearLayout$LayoutParams0.leftMargin;
            v4 = linearLayout$LayoutParams0.rightMargin;
        }
        else {
            v3 = linearLayout$LayoutParams0.topMargin;
            v4 = linearLayout$LayoutParams0.bottomMargin;
        }
        if(v2 == 0) {
            if(z) {
                return button0.getMinimumWidth() + (v3 + v4);
            }
            v2 = button0.getMinimumHeight();
        }
        return v2 + (v3 + v4);
    }

    private final void m() {
        int v2;
        int v = this.j();
        if(v != -1) {
            for(int v1 = v + 1; v1 < this.getChildCount(); ++v1) {
                MaterialButton materialButton0 = this.a(v1);
                MaterialButton materialButton1 = this.a(v1 - 1);
                if(this.k <= 0) {
                    v2 = Math.min(materialButton0.lG(), materialButton1.lG());
                    materialButton0.z(true);
                    materialButton1.z(true);
                }
                else {
                    materialButton0.z(false);
                    materialButton1.z(false);
                    v2 = 0;
                }
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = MaterialButtonGroup.h(materialButton0);
                if(this.getOrientation() == 0) {
                    linearLayout$LayoutParams0.setMarginEnd(0);
                    linearLayout$LayoutParams0.setMarginStart(this.k - v2);
                    linearLayout$LayoutParams0.topMargin = 0;
                }
                else {
                    linearLayout$LayoutParams0.bottomMargin = 0;
                    linearLayout$LayoutParams0.topMargin = this.k - v2;
                    linearLayout$LayoutParams0.setMarginStart(0);
                }
                materialButton0.setLayoutParams(linearLayout$LayoutParams0);
            }
            if(this.getChildCount() != 0 && v != -1) {
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = MaterialButtonGroup.h(this.a(v));
                if(this.getOrientation() == 1) {
                    linearLayout$LayoutParams1.topMargin = 0;
                    linearLayout$LayoutParams1.bottomMargin = 0;
                    return;
                }
                linearLayout$LayoutParams1.setMarginEnd(0);
                linearLayout$LayoutParams1.setMarginStart(0);
                linearLayout$LayoutParams1.leftMargin = 0;
                linearLayout$LayoutParams1.rightMargin = 0;
            }
        }
    }

    private final void n() {
        for(int v = 0; v < this.getChildCount(); ++v) {
            MaterialButton materialButton0 = this.a(v);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = materialButton0.p;
            if(linearLayout$LayoutParams0 != null) {
                materialButton0.setLayoutParams(linearLayout$LayoutParams0);
                materialButton0.p = null;
                materialButton0.o = -1.0f;
            }
        }
    }

    private boolean o(int v) {
        return this.getChildAt(v).getVisibility() != 8;
    }

    @Override  // android.widget.LinearLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            this.n();
            int v4 = this.j();
            int v5 = this.k();
            if(v4 != -1 && this.c != null && this.getChildCount() != 0) {
                int v6 = 0x7FFFFFFF;
                for(int v7 = v4; true; ++v7) {
                    int v8 = 0;
                    if(v7 > v5) {
                        break;
                    }
                    if(this.o(v7)) {
                        if(this.o(v7) && this.c != null) {
                            MaterialButton materialButton0 = this.a(v7);
                            fyvp fyvp0 = this.c;
                            int v9 = materialButton0.getWidth();
                            int v10 = -v9;
                            for(int v11 = 0; v11 < fyvp0.a; ++v11) {
                                fyvo fyvo0 = fyvp0.d[v11].a;
                                v10 = (int)(fyvo0.b == 2 ? Math.max(v10, fyvo0.a) : Math.max(v10, ((float)v9) * fyvo0.a));
                            }
                            int v12 = Math.max(0, v10);
                            MaterialButton materialButton1 = this.c(v7);
                            int v13 = materialButton1 == null ? 0 : materialButton1.t;
                            MaterialButton materialButton2 = this.b(v7);
                            if(materialButton2 != null) {
                                v8 = materialButton2.t;
                            }
                            v8 = Math.min(v12, v13 + v8);
                        }
                        if(v7 != v4 && v7 != v5) {
                            v8 /= 2;
                        }
                        v6 = Math.min(v6, v8);
                    }
                }
                for(int v14 = v4; v14 <= v5; ++v14) {
                    if(this.o(v14)) {
                        MaterialButton materialButton3 = this.a(v14);
                        fyvp fyvp1 = this.c;
                        if(materialButton3.u != fyvp1) {
                            materialButton3.u = fyvp1;
                            materialButton3.o(true);
                        }
                        MaterialButton materialButton4 = this.a(v14);
                        int v15 = v14 == v4 || v14 == v5 ? v6 : v6 + v6;
                        if(materialButton4.v != v15) {
                            materialButton4.v = v15;
                            materialButton4.o(true);
                        }
                    }
                }
            }
        }
    }

    @Override  // android.widget.LinearLayout
    protected final void onMeasure(int v, int v1) {
        MenuItem menuItem0;
        boolean z = true;
        this.m();
        if(this.n) {
            if(this.e == 1) {
                if(this.getOrientation() != 0) {
                    z = false;
                }
                List list0 = this.r;
                list0.clear();
                int v2 = z ? View.MeasureSpec.getSize(v) : View.MeasureSpec.getSize(v1);
                int v3 = this.l(z, this.o, v, v1);
                int v5 = 0;
                for(int v4 = 0; true; v4 = v6) {
                    if(v4 >= this.getChildCount() - 1) {
                        this.o.setVisibility(8);
                        list0.clear();
                        break;
                    }
                    int v6 = v4 + 1;
                    MaterialButton materialButton0 = this.a(v4);
                    v5 += this.l(z, materialButton0, v, v1);
                    if(v5 + v3 > v2) {
                        list0.add(materialButton0);
                    }
                    if(v5 > v2) {
                        while(v6 < this.getChildCount() - 1) {
                            list0.add(this.a(v6));
                            ++v6;
                        }
                        this.o.setVisibility(0);
                        break;
                    }
                }
                List list1 = this.s;
                if(!list0.equals(list1)) {
                    for(int v7 = 0; v7 < this.getChildCount() - 1; ++v7) {
                        MaterialButton materialButton1 = this.a(v7);
                        if(this.q.containsKey(materialButton1)) {
                            materialButton1.setVisibility(0);
                        }
                    }
                    list1.clear();
                    list1.addAll(list0);
                    na na0 = this.d.a;
                    Map map0 = this.p;
                    map0.clear();
                    Map map1 = this.q;
                    map1.clear();
                    na0.clear();
                    for(Object object0: list1) {
                        Button button0 = (Button)object0;
                        if((button0.getLayoutParams() instanceof fygm)) {
                            fygm fygm0 = (fygm)button0.getLayoutParams();
                            CharSequence charSequence0 = fygm0.b;
                            if(TextUtils.isEmpty(charSequence0)) {
                                charSequence0 = !(button0 instanceof MaterialButton) || TextUtils.isEmpty(((MaterialButton)button0).getText()) ? button0.getContentDescription() : ((MaterialButton)button0).getText();
                            }
                            Drawable drawable0 = fygm0.a;
                            menuItem0 = na0.add(charSequence0);
                            if(drawable0 != null) {
                                menuItem0.setIcon(new InsetDrawable(drawable0, this.m, 0, this.m, 0));
                            }
                            menuItem0.setOnMenuItemClickListener(new fygl(button0));
                        }
                        else {
                            menuItem0 = null;
                        }
                        if(menuItem0 != null) {
                            map0.put(Integer.valueOf(menuItem0.getItemId()), button0);
                            map1.put(button0, menuItem0);
                            button0.setVisibility(8);
                        }
                    }
                    this.f();
                }
            }
            else {
                this.o.setVisibility(8);
            }
        }
        this.e();
        super.onMeasure(v, v1);
    }

    @Override  // android.view.ViewGroup
    public final void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        if((view0 instanceof MaterialButton)) {
            ((MaterialButton)view0).x = null;
        }
        int v = this.indexOfChild(view0);
        if(v >= 0) {
            this.f.remove(v);
        }
        this.l = true;
        this.e();
        this.n();
        this.m();
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for(int v = 0; v < this.getChildCount(); ++v) {
            this.a(v).setEnabled(z);
        }
    }

    @Override  // android.widget.LinearLayout
    public final void setOrientation(int v) {
        if(this.getOrientation() != v) {
            this.l = true;
        }
        super.setOrientation(v);
    }
}

