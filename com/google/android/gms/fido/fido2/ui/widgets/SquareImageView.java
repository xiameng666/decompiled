package com.google.android.gms.fido.fido2.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.material.imageview.ShapeableImageView;

public final class SquareImageView extends ShapeableImageView {
    public SquareImageView(Context context0) {
        super(context0);
    }

    public SquareImageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public SquareImageView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public SquareImageView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0);
    }

    @Override  // com.google.android.material.imageview.ShapeableImageView
    protected final void onMeasure(int v, int v1) {
        if(View.MeasureSpec.getSize(v) <= View.MeasureSpec.getSize(v1)) {
            super.onMeasure(v, v);
            return;
        }
        super.onMeasure(v1, v1);
    }
}

