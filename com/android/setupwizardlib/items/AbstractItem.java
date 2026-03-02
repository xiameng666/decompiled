package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import slt;
import slv;

@Deprecated
public abstract class AbstractItem extends AbstractItemHierarchy implements slt {
    public AbstractItem() {
    }

    public AbstractItem(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // slv
    public int a() {
        return 1;
    }

    @Override  // slv
    public final slt b(int v) {
        return this;
    }

    public final void c() {
        this.g(0);
    }

    @Override  // slv
    public slv d() {
        return this.a == 0x7F0B0B94 ? this : null;  // id:android_auto_item
    }
}

