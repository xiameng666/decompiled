package com.google.android.gms.googleone.smui.landing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import buqe;
import gged_interceptors;
import ggna;

public final class StorageBarView extends View {
    public boolean a;
    public gged_interceptors b;
    private final Context c;

    public StorageBarView(Context context0) {
        this(context0, null);
    }

    public StorageBarView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = ggna.a;
        this.c = context0;
    }

    public final Paint a(int v, Paint.Cap paint$Cap0) {
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeWidth(((float)this.getResources().getDimensionPixelSize(0x7F070ED6)));  // dimen:progress_bar_height
        paint0.setStrokeCap(paint$Cap0);
        paint0.setColor(v);
        return paint0;
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
        float f5;
        super.onDraw(canvas0);
        int v = this.getResources().getDimensionPixelSize(0x7F070ED6);  // dimen:progress_bar_height
        int v1 = this.getResources().getDimensionPixelSize(0x7F070ED9);  // dimen:progress_bar_separator_width
        int v2 = this.getResources().getDimensionPixelSize(0x7F070ED8);  // dimen:progress_bar_min_width
        int v3 = this.getWidth() - v;
        Context context0 = this.c;
        canvas0.drawLine(((float)v) * 0.5f, ((float)v) * 0.5f, ((float)v3), ((float)v) * 0.5f, this.a(context0.getColor(0x7F06112C), Paint.Cap.ROUND));  // color:smui_bar_background
        float f = 0.0f;
        for(int v4 = 0; true; ++v4) {
            gged_interceptors gged0 = this.b;
            if(v4 >= ((ggna)gged0).c) {
                break;
            }
            buqe buqe0 = (buqe)gged0.get(v4);
            float f1 = v4 == 0 ? ((float)v) * 0.5f : f;
            float f2 = buqe0.b * ((float)v3);
            int v5 = v2 + v;
            if((f2 - f1 < ((float)v5))) {
                f2 = f1 + ((float)v2) + ((float)v);
            }
            int v6 = ((ggna)this.b).c - 1 - v4;
            float f3 = Math.min(f2, ((float)v3) - ((float)(v5 * v6 + v6 * (v1 + v))));
            if(v4 == 0) {
                buqe0.a.setStrokeCap(Paint.Cap.ROUND);
                float f4 = f1 + (f3 - f1) / 2.0f;
                canvas0.drawLine(f1, ((float)v) * 0.5f, f4, ((float)v) * 0.5f, buqe0.a);
                Paint paint0 = buqe0.a;
                if(((ggna)this.b).c == 1) {
                    paint0.setStrokeCap((this.a ? Paint.Cap.ROUND : Paint.Cap.SQUARE));
                }
                else {
                    paint0.setStrokeCap(Paint.Cap.SQUARE);
                }
                f5 = f3;
                canvas0.drawLine(f4, ((float)v) * 0.5f, f5, ((float)v) * 0.5f, paint0);
                v4 = 0;
            }
            else if(v4 == ((ggna)this.b).c - 1 && this.a) {
                float f6 = f1 + (f3 - f1) / 2.0f;
                canvas0.drawLine(f1, ((float)v) * 0.5f, f6, ((float)v) * 0.5f, buqe0.a);
                buqe0.a.setStrokeCap(Paint.Cap.ROUND);
                f5 = f3;
                canvas0.drawLine(f6, ((float)v) * 0.5f, f5, ((float)v) * 0.5f, buqe0.a);
            }
            else {
                f5 = f3;
                canvas0.drawLine(f1, ((float)v) * 0.5f, f5, ((float)v) * 0.5f, buqe0.a);
            }
            Paint paint1 = this.a(context0.getColor(0x7F06112D), Paint.Cap.SQUARE);  // color:smui_bar_separator
            if(v4 != ((ggna)this.b).c - 1) {
                float f7 = f5 + ((float)v);
                float f8 = f7 + ((float)v1);
                canvas0.drawLine(f7, ((float)v) * 0.5f, f8, ((float)v) * 0.5f, paint1);
                f = f8;
            }
        }
    }
}

