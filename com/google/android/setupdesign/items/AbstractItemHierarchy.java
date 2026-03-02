package com.google.android.setupdesign.items;

import a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import gagt;
import gahc;
import gahd;
import java.util.ArrayList;

public abstract class AbstractItemHierarchy implements gahd {
    private final ArrayList a;
    public int e;

    public AbstractItemHierarchy() {
        this.a = new ArrayList();
        this.e = -1;
    }

    public AbstractItemHierarchy(Context context0, AttributeSet attributeSet0) {
        this.a = new ArrayList();
        this.e = -1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, gagt.a);
        this.e = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
    }

    public final void t() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((gahc)arrayList0.get(v1)).kl();
        }
    }

    public final void u(int v, int v1) {
        if(v < 0) {
            Log.w("AbstractItemHierarchy", "notifyItemRangeInserted: Invalid position=" + v);
            return;
        }
        ArrayList arrayList0 = this.a;
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((gahc)arrayList0.get(v3)).e(this, v, v1);
        }
    }

    public final void v(int v, int v1) {
        if(v < 0) {
            Log.w("AbstractItemHierarchy", a.h(v, "notifyItemRangeInserted: Invalid position="));
            return;
        }
        if(v1 < 0) {
            Log.w("AbstractItemHierarchy", a.h(v1, "notifyItemRangeInserted: Invalid itemCount="));
            return;
        }
        ArrayList arrayList0 = this.a;
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((gahc)arrayList0.get(v3)).kk(this, v, v1);
        }
    }

    @Override  // gahd
    public final void w(gahc gahc0) {
        this.a.add(gahc0);
    }

    @Override  // gahd
    public final void x(gahc gahc0) {
        this.a.remove(gahc0);
    }

    public final void y(int v) {
        if(v < 0) {
            Log.w("AbstractItemHierarchy", a.h(v, "notifyItemRangeChanged: Invalid position="));
            return;
        }
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((gahc)arrayList0.get(v2)).c(this, v);
        }
    }
}

