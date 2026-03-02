import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Paint.Align;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.text.Normalizer.Form;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;

public final class fmqm {
    private static final double a;
    private static fmqm b;

    static {
        fmqm.a = 2.0 - Math.sqrt(2.0);
        fmqm.b = null;
    }

    final Bitmap a(fmeo fmeo0, int v, int[] arr_v, int v1, gfsx gfsx0, Drawable drawable0) {
        String s1;
        gfsx gfsx1 = fmeo0.e;
        if(!gfsx1.i()) {
            ContactId contactId0 = fmeo0.a;
            int v2 = contactId0.d().hashCode();
            gfsx gfsx2 = fmeo0.b;
            if(gfsx2.i() && !TextUtils.isEmpty(((CharSequence)gfsx2.d()))) {
                String s = (String)gfsx2.d();
                v2 = s.length() <= 4 ? s.hashCode() : s.substring(s.length() - 4).hashCode();
            }
            int v3 = Math.abs(v2 % arr_v.length);
            if(gfsx2.i() && !contactId0.b().equals(ContactId.ContactType.e)) {
                char[] arr_c = Normalizer.normalize(((CharSequence)gfsx2.d()), Normalizer.Form.NFKC).toCharArray();
                for(int v4 = 0; true; ++v4) {
                    s1 = null;
                    if(v4 >= arr_c.length) {
                        break;
                    }
                    int v5 = arr_c[v4];
                    if(Character.isLetter(((char)v5))) {
                        s1 = Character.toString(Character.toUpperCase(((char)v5)));
                        break;
                    }
                }
                if(!TextUtils.isEmpty(s1)) {
                    int v6 = arr_v[v3];
                    Bitmap bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
                    Canvas canvas0 = new Canvas(bitmap0);
                    canvas0.drawColor(0, PorterDuff.Mode.CLEAR);
                    Paint paint0 = new Paint();
                    paint0.setAntiAlias(true);
                    paint0.setColor(v6);
                    float f = ((float)v) / 2.0f;
                    canvas0.drawCircle(f, f, f, paint0);
                    Paint paint1 = new Paint();
                    paint1.setTextAlign(Paint.Align.CENTER);
                    paint1.setColor(v1);
                    paint1.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
                    paint1.setTextSize(((float)v) * 0.6f);
                    paint1.setAntiAlias(true);
                    Rect rect0 = new Rect();
                    paint1.getTextBounds(s1, 0, 1, rect0);
                    canvas0.drawText(s1, f, ((float)(v + rect0.bottom - rect0.top)) / 2.0f, paint1);
                    return bitmap0;
                }
            }
            return this.b(arr_v[v3], drawable0, v1, v);
        }
        return this.c(Arrays.asList(new Bitmap[]{((Bitmap)gfsx1.d())}), v);
    }

    final Bitmap b(int v, Drawable drawable0, int v1, int v2) {
        Bitmap bitmap0 = Bitmap.createBitmap(v2, v2, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        canvas0.drawColor(0, PorterDuff.Mode.CLEAR);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setColor(v);
        float f = ((float)v2) / 2.0f;
        canvas0.drawCircle(f, f, f, paint0);
        drawable0.setBounds(new Rect(0, 0, v2, v2));
        drawable0.setTint(v1);
        drawable0.draw(canvas0);
        return bitmap0;
    }

    final Bitmap c(List list0, int v) {
        RectF[] arr_rectF;
        if(list0.size() > 4) {
            flbj.f("AvatarUtils", ">4 bitmaps provided. Using first 4 and ignoring the rest.");
        }
        Bitmap bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        canvas0.drawColor(0, PorterDuff.Mode.CLEAR);
        int v1 = list0.size();
        float f = (float)bitmap0.getWidth();
        float f1 = (float)bitmap0.getHeight();
        if(v1 <= 0) {
            throw new IllegalArgumentException();
        }
        switch(v1) {
            case 1: {
                arr_rectF = new RectF[]{new RectF(0.0f, 0.0f, f, f1)};
                break;
            }
            case 2: {
                arr_rectF = new RectF[2];
                float f2 = ((float)fmqm.a) * f;
                arr_rectF[0] = new RectF(0.0f, 0.0f, f2, f2);
                arr_rectF[1] = new RectF(f - f2, f1 - f2, f, f1);
                break;
            }
            case 3: {
                arr_rectF = new RectF[3];
                float f3 = f1 - f1 / 4.0f - ((float)(((double)(f1 / 4.0f)) * Math.sqrt(3.0)));
                arr_rectF[0] = new RectF(f / 4.0f, f3 - f1 / 4.0f, 3.0f * (f / 4.0f), f3 + f1 / 4.0f);
                arr_rectF[1] = new RectF(0.0f, f1 / 2.0f, f / 2.0f, f1);
                arr_rectF[2] = new RectF(f / 2.0f, f1 / 2.0f, f, f1);
                break;
            }
            default: {
                arr_rectF = new RectF[]{new RectF(0.0f, 0.0f, f / 2.0f, f1 / 2.0f), new RectF(f / 2.0f, 0.0f, f, f1 / 2.0f), new RectF(0.0f, f1 / 2.0f, f / 2.0f, f1), new RectF(f / 2.0f, f1 / 2.0f, f, f1)};
            }
        }
        for(int v2 = 0; v2 < arr_rectF.length; ++v2) {
            RectF rectF0 = arr_rectF[v2];
            Bitmap bitmap1 = (Bitmap)list0.get(v2);
            BitmapShader bitmapShader0 = new BitmapShader(bitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Matrix matrix0 = new Matrix();
            matrix0.setRectToRect(new RectF(0.0f, 0.0f, ((float)bitmap1.getWidth()), ((float)bitmap1.getHeight())), rectF0, Matrix.ScaleToFit.FILL);
            bitmapShader0.setLocalMatrix(matrix0);
            Paint paint0 = new Paint();
            paint0.setAntiAlias(true);
            paint0.setShader(bitmapShader0);
            canvas0.drawRoundRect(rectF0, rectF0.width() / 2.0f, rectF0.height() / 2.0f, paint0);
        }
        return bitmap0;
    }

    public static fmqm d() {
        if(fmqm.b == null) {
            fmqm.b = new fmqm();
        }
        return fmqm.b;
    }
}

