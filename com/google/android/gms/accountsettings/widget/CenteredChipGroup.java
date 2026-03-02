package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.chip.ChipGroup;
import gggq;
import java.util.ArrayList;
import java.util.List;

public class CenteredChipGroup extends ChipGroup {
    private final ArrayList f;

    public CenteredChipGroup(Context context0) {
        super(context0);
        this.f = new ArrayList();
    }

    public CenteredChipGroup(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = new ArrayList();
    }

    public CenteredChipGroup(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = new ArrayList();
    }

    private final void f(List list0, int v, int v1) {
        int v3;
        int v2;
        boolean z = this.getLayoutDirection() == 1;
        if(z) {
            v2 = ((View)list0.get(0)).getRight();
            v3 = ((View)gggq.p(list0)).getLeft();
        }
        else {
            v2 = ((View)gggq.p(list0)).getRight();
            v3 = ((View)list0.get(0)).getLeft();
        }
        int v4 = v2 - v3;
        int v5 = v1 - v;
        int v6 = (z ? (v5 + v4) / 2 : (v5 - v4) / 2) - (z ? ((View)list0.get(0)).getRight() : ((View)list0.get(0)).getLeft());
        for(Object object0: list0) {
            ((View)object0).layout(((View)object0).getLeft() + v6, ((View)object0).getTop(), ((View)object0).getRight() + v6, ((View)object0).getBottom());
        }
    }

    @Override  // fyly
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.getChildCount() == 0) {
            return;
        }
        ArrayList arrayList0 = this.f;
        arrayList0.clear();
        arrayList0.add(this.getChildAt(0));
        for(int v4 = 1; v4 < this.getChildCount(); ++v4) {
            View view0 = this.getChildAt(v4);
            View view1 = (View)gggq.p(arrayList0);
            int v5 = CenteredChipGroup.e(view0);
            int v6 = CenteredChipGroup.e(view1);
            if(view0.getVisibility() != 8) {
                if(v6 != v5) {
                    this.f(arrayList0, v, v2);
                    arrayList0.clear();
                }
                arrayList0.add(view0);
            }
        }
        this.f(arrayList0, v, v2);
    }
}

