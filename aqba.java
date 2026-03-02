import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.security.MessageDigest;

public final class aqba extends ujo {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public aqba(int v, int v1, int v2, int v3, int v4) {
        this.c = v1;
        this.b = v;
        this.d = v2;
        this.e = v3;
        this.f = v4;
    }

    @Override  // uay
    public final void a(MessageDigest messageDigest0) {
    }

    @Override  // ujo
    protected final Bitmap c(uek uek0, Bitmap bitmap0, int v, int v1) {
        int v2 = this.e + this.e;
        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, this.b - v2, this.c - v2, true);
        Bitmap.Config bitmap$Config0 = bitmap1.getConfig();
        Bitmap bitmap2 = Bitmap.createBitmap(this.b, this.c, bitmap$Config0);
        Canvas canvas0 = new Canvas(bitmap2);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setColor(this.f);
        paint0.setStyle(Paint.Style.FILL);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)this.b), ((float)this.c));
        float f = (float)this.d;
        canvas0.drawRoundRect(rectF0, f, f, paint0);
        int v3 = bitmap1.getWidth() + this.e;
        float f1 = (float)(bitmap1.getHeight() + this.e);
        float f2 = (float)this.e;
        RectF rectF1 = new RectF(f2, f2, ((float)v3), f1);
        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas0.drawRoundRect(rectF1, f, f, paint1);
        paint1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        canvas0.drawBitmap(bitmap1, null, rectF1, paint1);
        return bitmap2;
    }
}

