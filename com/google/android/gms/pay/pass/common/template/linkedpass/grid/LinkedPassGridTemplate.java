package com.google.android.gms.pay.pass.common.template.linkedpass.grid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import dstl;
import dtig;
import dtit;

public final class LinkedPassGridTemplate extends dtit {
    private final dstl j;

    public LinkedPassGridTemplate(Context context0) {
        this(context0, null);
    }

    public LinkedPassGridTemplate(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public LinkedPassGridTemplate(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.j = new dstl(context0);
    }

    @Override  // dtit
    protected final RecyclerView a() {
        return (RecyclerView)this.findViewById(0x7F0B0519);  // id:LinkedPassGridRecyclerView
    }

    @Override  // dtit
    protected final View b() {
        return this.findViewById(0x7F0B052C);  // id:LinkedPassListProgressBar
    }

    @Override  // dtit
    protected final dtig c() {
        return this.j;
    }
}

