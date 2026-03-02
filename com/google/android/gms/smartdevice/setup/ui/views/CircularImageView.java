package com.google.android.gms.smartdevice.setup.ui.views;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircularImageView extends ImageView {
    public CircularImageView(Context context0) {
        super(context0);
    }

    public CircularImageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public CircularImageView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public CircularImageView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    @Override  // android.widget.ImageView
    protected final void onDraw(Canvas canvas0) {
        Bitmap bitmap0;
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.FILL);
        paint0.setAntiAlias(true);
        Drawable drawable0 = this.getDrawable();
        if(drawable0 == null) {
            bitmap0 = null;
        }
        else {
            int v = this.getWidth();
            int v1 = this.getHeight();
            if(v > 0 && v1 > 0) {
                bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                Canvas canvas1 = new Canvas(bitmap0);
                canvas1.concat(this.getImageMatrix());
                drawable0.draw(canvas1);
            }
            else {
                bitmap0 = null;
            }
        }
        if(bitmap0 == null) {
            paint0.setShader(null);
        }
        else {
            paint0.setShader(new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        }
        float f = (float)Math.min(this.getWidth(), this.getHeight());
        canvas0.drawCircle(((float)this.getWidth()) / 2.0f, ((float)this.getHeight()) / 2.0f, f / 2.0f, paint0);
    }
}

