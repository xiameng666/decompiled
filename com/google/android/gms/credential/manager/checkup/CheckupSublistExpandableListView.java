package com.google.android.gms.credential.manager.checkup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ExpandableListView;

public final class CheckupSublistExpandableListView extends ExpandableListView {
    public CheckupSublistExpandableListView(Context context0) {
        super(context0);
    }

    public CheckupSublistExpandableListView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public CheckupSublistExpandableListView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // android.widget.ListView
    public final void onMeasure(int v, int v1) {
        if(this.isGroupExpanded(0)) {
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(0xFFFFFF, 0x80000000));
            return;
        }
        super.onMeasure(v, 0);
    }
}

