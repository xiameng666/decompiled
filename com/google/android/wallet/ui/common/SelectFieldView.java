package com.google.android.wallet.ui.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import gcjh;
import gcjm;
import gcjn;
import gcjo;
import gcjp;
import gcjs;
import gczq;
import gdch;
import gfev;
import gffg;
import gffi;
import gffj;
import gffl;
import gffq;
import gffr;
import gffw;
import gfga;
import gfgr;
import gfio;
import gfip;
import gfjj;
import gfjm;
import gfjn;
import gfjo;
import hfui;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class SelectFieldView extends LinearLayout implements AdapterView.OnItemSelectedListener, gcjp, gcjs, gczq {
    public FormSpinner a;
    public InlineSelectView b;
    public InfoMessageView c;
    public ImageWithCaptionView d;
    public TextView e;
    public View f;
    public gfjj g;
    public boolean h;
    public int i;
    public int j;
    public boolean[] k;
    public View l;
    int[] m;
    private gcjn n;
    private final ArrayList o;
    private boolean p;

    public SelectFieldView(Context context0) {
        super(context0);
        this.o = new ArrayList();
        this.j = -1;
    }

    public SelectFieldView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.o = new ArrayList();
        this.j = -1;
    }

    public SelectFieldView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.o = new ArrayList();
        this.j = -1;
    }

    public SelectFieldView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.o = new ArrayList();
        this.j = -1;
    }

    @Override  // gcjp
    public final void K(gffq gffq0, List list0) {
        int v = gffq0.e;
        int v1 = gfev.a(v);
        int v2 = 1;
        if(v1 == 0) {
            v1 = 1;
        }
        int v3 = 0;
        switch(v1 - 1) {
            case 1: {
                this.g(false);
                return;
            }
            case 2: {
                if(this.a.getVisibility() == 0) {
                    this.d(this.j);
                }
                if(this.b.getVisibility() == 0) {
                    if(InlineSelectView.g((this.g.c == 7 ? ((gfip)this.g.d) : gfip.a))) {
                        this.b.d(this.k, ((Boolean)gcjh.E.a()).booleanValue());
                        return;
                    }
                    int v5 = this.j;
                    InlineSelectView inlineSelectView0 = this.b;
                    if(v5 != inlineSelectView0.e) {
                        inlineSelectView0.f(v5, ((Boolean)gcjh.E.a()).booleanValue());
                        return;
                    }
                }
                return;
            }
            case 11: {
                this.g(true);
                return;
            }
            case 12: {
                gffj gffj0 = gffq0.c == 9 ? ((gffj)gffq0.d) : gffj.a;
                if(this.a.getVisibility() != 0) {
                    throw new IllegalArgumentException("Currently only DROP_DOWN_MENU select field support MODIFY_COMPONENT_VALUES action");
                }
                int v6 = gffj0.d;
                if(gffg.a(v6) != 2 && gffg.a(v6) != 3) {
                    int v7 = gffg.a(v6);
                    if(v7 != 0) {
                        v2 = v7;
                    }
                    throw new IllegalArgumentException(String.format("Unsupported modify component list type %s", ((int)(v2 - 1))));
                }
                int v8 = gffj0.c;
                if(gffi.a(v8) != 2 && gffi.a(v8) != 3) {
                    int v9 = gffi.a(v8);
                    if(v9 != 0) {
                        v2 = v9;
                    }
                    throw new IllegalArgumentException(String.format("Unsupported modify type %s", ((int)(v2 - 1))));
                }
                gfip gfip0 = this.g.c == 7 ? ((gfip)this.g.d) : gfip.a;
                hfui hfui0 = gffj0.b;
                int[] arr_v = new int[gfip0.c.size()];
                for(int v10 = 0; v10 < gfip0.c.size(); ++v10) {
                    if(hfui0.contains(Long.valueOf(((gfio)gfip0.c.get(v10)).j))) {
                        arr_v[v10] = gffi.a(gffj0.c) == 2 ? 0 : 8;
                    }
                    else if(gffg.a(gffj0.d) == 2) {
                        arr_v[v10] = this.m == null ? 0 : this.m[v10];
                    }
                    else if(gffi.a(gffj0.c) == 2) {
                        arr_v[v10] = 8;
                    }
                    else {
                        arr_v[v10] = 0;
                    }
                }
                this.m = arr_v;
                gdch gdch0 = (gdch)this.a.getAdapter();
                gdch0.c = this.m;
                int v11 = this.e(this.a.getSelectedItemPosition());
                if(v11 >= 0 && this.m[v11] == 8) {
                    while(true) {
                        int[] arr_v1 = this.m;
                        if(v3 >= arr_v1.length) {
                            v3 = -1;
                            break;
                        }
                        if(arr_v1[v3] == 0) {
                            break;
                        }
                        ++v3;
                    }
                    if(v3 == -1) {
                        throw new IllegalArgumentException("There is no option visible after applying MODIFY_COMPONENT_VALUES action");
                    }
                    this.d(v3);
                    return;
                }
                return;
            }
            case 17: {
                if(InlineSelectView.g((this.g.c == 7 ? ((gfip)this.g.d) : gfip.a))) {
                    gffl gffl0 = gffq0.c == 11 ? ((gffl)gffq0.d) : gffl.a;
                    gfjo gfjo0 = gffl0.b == 1 ? ((gfjo)gffl0.c) : gfjo.a;
                    gfjn gfjn0 = gfjo0.c == 11 ? ((gfjn)gfjo0.d) : gfjn.a;
                    boolean[] arr_z = new boolean[(this.g.c == 7 ? ((gfip)this.g.d) : gfip.a).c.size()];
                    for(Object object0: gfjn0.b) {
                        arr_z[this.f(((gfjm)object0).c)] = true;
                    }
                    this.b.d(arr_z, true);
                    return;
                }
                gffl gffl1 = gffq0.c == 11 ? ((gffl)gffq0.d) : gffl.a;
                gfjo gfjo1 = gffl1.b == 1 ? ((gfjo)gffl1.c) : gfjo.a;
                int v12 = this.f((gfjo1.c == 2 ? ((String)gfjo1.d) : ""));
                InlineSelectView inlineSelectView1 = this.b;
                if(v12 != inlineSelectView1.e) {
                    inlineSelectView1.f(v12, true);
                    return;
                }
                return;
            }
            case 27: {
                if(this.getVisibility() != 0) {
                    v2 = 0;
                }
                this.g(((boolean)v2));
                return;
            }
            default: {
                int v4 = gfev.a(v);
                if(v4 != 0) {
                    v2 = v4;
                }
                throw new IllegalArgumentException(String.format("Unknown ResultingActionReference action type %s", ((int)(v2 - 1))));
            }
        }
    }

    public final void a(boolean z) {
        if(z) {
            gcjo.d(this.n, this.o);
        }
    }

    @Override  // gcjs
    public final boolean aO(gfga gfga0) {
        if(this.g != null) {
            int v = this.a.getVisibility() == 0 ? this.e(this.a.getSelectedItemPosition()) : this.i;
            if(v >= 0) {
                return this.g.c == 7 ? gcjo.g(gfga0, ((gfio)((gfip)this.g.d).c.get(v)).j) : gcjo.g(gfga0, ((gfio)gfip.a.c.get(v)).j);
            }
        }
        return false;
    }

    @Override  // gczq
    public final View b() {
        return this.f;
    }

    public final void c(int v, boolean z) {
        String s = null;
        if(v >= 0) {
            gfio gfio0 = (gfio)(this.g.c == 7 ? ((gfip)this.g.d) : gfip.a).c.get(v);
            this.c.p((gfio0.k == null ? gfgr.a : gfio0.k));
            if(!z && (v != this.i || this.a.getVisibility() != 0)) {
                gcjn gcjn0 = this.n;
                ArrayList arrayList0 = this.o;
                long v1 = gfio0.j;
                if((gfio0.b & 0x20) != 0) {
                    s = gfio0.h;
                }
                for(Object object0: arrayList0) {
                    gcjm gcjm0 = (gcjm)object0;
                    gfga gfga0 = gcjm0.a;
                    if(gcjo.j(gfga0)) {
                        gffr gffr0 = gcjo.a(gfga0);
                        if(gffr0 == null || gffr0.b.contains(Long.valueOf(v1)) || gffr0.b.size() == 0 && gffr0.c.isEmpty() || s != null && Pattern.matches(gffr0.c, s)) {
                            gcjn0.c(gcjm0);
                        }
                    }
                }
            }
        }
        else {
            this.c.p(null);
        }
        this.i = v;
    }

    public final void d(int v) {
        if(this.h) {
            ++v;
        }
        this.a.n(v);
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        super.dispatchThawSelfOnly(sparseArray0);
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchSaveInstanceState(SparseArray sparseArray0) {
        super.dispatchFreezeSelfOnly(sparseArray0);
    }

    private final int e(int v) {
        return this.h ? v - 1 : v;
    }

    private final int f(String s) {
        int v = (this.g.c == 7 ? ((gfip)this.g.d) : gfip.a).c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(TextUtils.equals(((gfio)(this.g.c == 7 ? ((gfip)this.g.d) : gfip.a).c.get(v1)).h, s)) {
                return v1;
            }
        }
        return -1;
    }

    private final void g(boolean z) {
        this.p = z;
        boolean z1 = false;
        this.setVisibility((z ? 8 : 0));
        View view0 = this.f;
        FormSpinner formSpinner0 = this.a;
        if(view0 == formSpinner0) {
            if(!z && !this.g.h) {
                z1 = true;
            }
            formSpinner0.n = z1;
            return;
        }
        InlineSelectView inlineSelectView0 = this.b;
        if(view0 == inlineSelectView0) {
            if(!z && !this.g.h) {
                z1 = true;
            }
            inlineSelectView0.c = z1;
        }
    }

    @Override  // gcjs
    public final void lk(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gcjm gcjm0 = (gcjm)arrayList0.get(v1);
            gfga gfga0 = gcjm0.a;
            int v2 = gffw.a(gfga0.e);
            int v3 = 1;
            if(v2 == 0) {
                v2 = 1;
            }
            switch(v2 - 1) {
                case 3: {
                    break;
                }
                case 1: 
                case 4: {
                    this.o.add(gcjm0);
                    break;
                }
                default: {
                    Locale locale0 = Locale.US;
                    int v4 = gffw.a(gfga0.e);
                    if(v4 != 0) {
                        v3 = v4;
                    }
                    throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v3 - 1))));
                }
            }
        }
    }

    @Override  // gcjs
    public final void lt(gcjn gcjn0) {
        this.n = gcjn0;
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (FormSpinner)this.findViewById(0x7F0B239B);  // id:ui_field_spinner
        this.b = (InlineSelectView)this.findViewById(0x7F0B2397);  // id:ui_field_inline_select
        this.c = (InfoMessageView)this.findViewById(0x7F0B2396);  // id:ui_field_info_message_description
        this.d = (ImageWithCaptionView)this.findViewById(0x7F0B2399);  // id:ui_field_read_only_text_icon
        this.e = (TextView)this.findViewById(0x7F0B2398);  // id:ui_field_read_only_text
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        this.c(this.e(v), view0 == null);
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
        this.c.p(null);
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("parentState"));
            this.a.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("formSpinnerState"));
            this.b.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("inlineSelectViewState"));
            this.c.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("infoMessageState"));
            this.d.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("readOnlyTextIconState"));
            this.e.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("readOnlyTextState"));
            this.g(((Bundle)parcelable0).getBoolean("hiddenByDependencyGraph"));
            int[] arr_v = ((Bundle)parcelable0).getIntArray("optionVisibilities");
            this.m = arr_v;
            if(arr_v != null) {
                gdch gdch0 = (gdch)this.a.getAdapter();
                gdch0.c = this.m;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("parentState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("formSpinnerState", this.a.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("inlineSelectViewState", this.b.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("infoMessageState", this.c.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("readOnlyTextIconState", this.d.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("readOnlyTextState", this.e.onSaveInstanceState());
        ((Bundle)parcelable0).putBoolean("hiddenByDependencyGraph", this.p);
        ((Bundle)parcelable0).putIntArray("optionVisibilities", this.m);
        return parcelable0;
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        View view0 = this.l;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }
}

