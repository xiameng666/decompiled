package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import slt;
import slu;
import slv;
import slw;

@Deprecated
public class ItemGroup extends AbstractItemHierarchy implements slu, slw {
    private final List b;
    private final SparseIntArray c;
    private int d;
    private boolean e;

    public ItemGroup() {
        this.b = new ArrayList();
        this.c = new SparseIntArray();
        this.d = 0;
        this.e = false;
    }

    public ItemGroup(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = new ArrayList();
        this.c = new SparseIntArray();
        this.d = 0;
        this.e = false;
    }

    @Override  // slv
    public final int a() {
        this.m();
        return this.d;
    }

    @Override  // slv
    public final slt b(int v) {
        int v5;
        this.m();
        if(v < 0 || v >= this.d) {
            throw new IndexOutOfBoundsException("size=" + this.d + "; index=" + v);
        }
        SparseIntArray sparseIntArray0 = this.c;
        int v1 = sparseIntArray0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            int v4 = sparseIntArray0.valueAt(v3);
            if(v4 < v) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > v) {
                v1 = v3 - 1;
                continue;
            }
            v5 = sparseIntArray0.keyAt(v3);
            goto label_17;
        }
        v5 = sparseIntArray0.keyAt(v2 - 1);
    label_17:
        if(v5 >= 0) {
            return ((slv)this.b.get(v5)).b(v - sparseIntArray0.get(v5));
        }
        throw new IllegalStateException("Cannot have item start index < 0");
    }

    @Override  // slu
    public final void c(slv slv0, int v, int v1) {
        this.e = true;
        int v2 = this.l(slv0);
        if(v2 >= 0) {
            this.e(v2 + v, v1);
            return;
        }
        Log.e("ItemGroup", "Unexpected child insert " + slv0.toString());
    }

    @Override  // slv
    public final slv d() {
        if(this.a == 0x7F0B0B94) {  // id:android_auto_item
            return this;
        }
        for(Object object0: this.b) {
            slv slv0 = ((slv)object0).d();
            if(slv0 != null) {
                return slv0;
            }
        }
        return null;
    }

    @Override  // slu
    public final void i(slv slv0, int v) {
        int v1 = this.l(slv0);
        if(v1 >= 0) {
            this.g(v1 + v);
            return;
        }
        Log.e("ItemGroup", "Unexpected child change " + slv0.toString());
    }

    @Override  // slw
    public final void j(slv slv0) {
        this.e = true;
        this.b.add(slv0);
        slv0.f(this);
        int v = slv0.a();
        if(v > 0) {
            this.e(this.l(slv0), v);
        }
    }

    @Override  // slu
    public final void k(slv slv0, int v) {
        this.e = true;
        int v1 = this.l(slv0);
        if(v1 >= 0) {
            this.h(v1 + v);
            return;
        }
        Log.e("ItemGroup", "Unexpected child remove " + slv0.toString());
    }

    private final int l(slv slv0) {
        List list0 = this.b;
        int v = list0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(list0.get(v1) == slv0) {
                break;
            }
        }
        this.m();
        if(v1 != -1) {
            int v2 = list0.size();
            int v3 = -1;
            while(v3 < 0 && v1 < v2) {
                v3 = this.c.get(v1, -1);
                ++v1;
            }
            return v3 >= 0 ? v3 : this.a();
        }
        return -1;
    }

    private final void m() {
        if(this.e) {
            this.d = 0;
            SparseIntArray sparseIntArray0 = this.c;
            sparseIntArray0.clear();
            for(int v = 0; true; ++v) {
                List list0 = this.b;
                if(v >= list0.size()) {
                    break;
                }
                slv slv0 = (slv)list0.get(v);
                if(slv0.a() > 0) {
                    sparseIntArray0.put(v, this.d);
                }
                this.d += slv0.a();
            }
            this.e = false;
        }
    }
}

