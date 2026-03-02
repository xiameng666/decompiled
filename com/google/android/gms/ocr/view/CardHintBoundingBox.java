package com.google.android.gms.ocr.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;

public class CardHintBoundingBox extends BoundingBox {
    private final int a;
    private final Path b;
    private final Path c;
    private final Path d;
    private final Path e;

    public CardHintBoundingBox(Context context0) {
        this(context0, null);
    }

    public CardHintBoundingBox(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public CardHintBoundingBox(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = new Path();
        this.c = new Path();
        this.d = new Path();
        this.e = new Path();
        int v1 = this.getResources().getDimensionPixelSize(0x7F070D11);  // dimen:ocr_edge_detection_hint_line_width
        this.a = v1;
        CardHintBoundingBox.e(this.getResources().getColor(0x7F060D6C), v1);  // color:ocr_edge_detection_hint_stroke
    }

    @Override  // com.google.android.gms.ocr.view.BoundingBox
    protected final void a(Rect rect0) {
        super.a(rect0);
        int v = this.a / 2;
        rect0.left = Math.max(v, rect0.left);
        rect0.right = Math.max(v, rect0.right);
        rect0.top = Math.max(v, rect0.top);
        rect0.bottom = Math.max(v, rect0.bottom);
    }

    @Override  // com.google.android.gms.ocr.view.BoundingBox
    protected final void b(Rect rect0, RectF rectF0, RectF rectF1, RectF rectF2, RectF rectF3, float f) {
        this.b.reset();
        this.b.addArc(rectF3, 135.0f, 45.0f);
        this.b.lineTo(((float)rect0.left), ((float)rect0.top) + f);
        this.b.arcTo(rectF0, 180.0f, 45.0f);
        this.c.reset();
        this.c.addArc(rectF0, 225.0f, 45.0f);
        this.c.lineTo(((float)rect0.right) - f, ((float)rect0.top));
        this.c.arcTo(rectF1, 270.0f, 45.0f);
        this.d.reset();
        this.d.addArc(rectF1, 315.0f, 45.0f);
        this.d.lineTo(((float)rect0.right), ((float)rect0.bottom) - f);
        this.d.arcTo(rectF2, 0.0f, 45.0f);
        this.e.reset();
        this.e.addArc(rectF2, 45.0f, 45.0f);
        this.e.lineTo(((float)rect0.right) - f, ((float)rect0.bottom));
        this.e.arcTo(rectF3, 90.0f, 45.0f);
    }

    @Override  // com.google.android.gms.ocr.view.BoundingBox
    protected final void onDraw(Canvas canvas0) {
        if(this.d()) {
            super.onDraw(canvas0);
        }
    }
}

