package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import gagt;
import gahd;

public class SectionItem extends ItemGroup {
    private final Item c;

    public SectionItem() {
        SectionHeaderItem sectionHeaderItem0 = new SectionHeaderItem();
        this.c = sectionHeaderItem0;
        sectionHeaderItem0.F(false);
        this.d(sectionHeaderItem0);
    }

    public SectionItem(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, gagt.w);
        CharSequence charSequence0 = typedArray0.getText(0);
        int v = typedArray0.getColor(1, 0);
        typedArray0.recycle();
        SectionHeaderItem sectionHeaderItem0 = new SectionHeaderItem();
        this.c = sectionHeaderItem0;
        sectionHeaderItem0.E(charSequence0);
        sectionHeaderItem0.F(false);
        sectionHeaderItem0.n = v;
        this.d(sectionHeaderItem0);
    }

    @Override  // com.google.android.setupdesign.items.ItemGroup
    public final void d(gahd gahd0) {
        super.d(gahd0);
        this.j();
    }

    @Override  // com.google.android.setupdesign.items.ItemGroup
    public final void e(gahd gahd0, int v, int v1) {
        super.e(gahd0, v, v1);
        this.j();
    }

    @Override  // com.google.android.setupdesign.items.ItemGroup
    public final void i() {
        super.i();
        this.d(this.c);
        this.j();
    }

    private final void j() {
        Item item0 = this.c;
        if(item0.l) {
            if(this.hd() == 1) {
                item0.F(false);
            }
        }
        else if(this.hd() > 0 && item0.i != null) {
            item0.F(true);
        }
    }

    @Override  // com.google.android.setupdesign.items.ItemGroup
    public final void kk(gahd gahd0, int v, int v1) {
        super.kk(gahd0, v, v1);
        this.j();
    }
}

