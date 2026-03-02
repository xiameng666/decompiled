import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

public final class bvyt implements ibts {
    public final bvyu a;
    public final hgnm b;
    public final TextView c;
    public final CharSequence d;

    public bvyt(bvyu bvyu0, hgnm hgnm0, TextView textView0, CharSequence charSequence0) {
        this.a = bvyu0;
        this.b = hgnm0;
        this.c = textView0;
        this.d = charSequence0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Drawable drawable0 = (Drawable)object0;
        ibuq.f(drawable0, "sourceImage");
        TextView textView0 = this.c;
        bwdm bwdm0 = this.a.i;
        if((!bwdm0.b() || !(drawable0 instanceof BitmapDrawable)) && this.b.g && (drawable0 instanceof BitmapDrawable)) {
            Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
            ibuq.e(bitmap0, "getBitmap(...)");
            ibuq.f(bitmap0, "src");
            int[] arr_v = new int[2];
            Paint paint0 = new Paint();
            paint0.setMaskFilter(new BlurMaskFilter(8.0f, BlurMaskFilter.Blur.OUTER));
            Bitmap bitmap1 = bitmap0.extractAlpha(paint0, arr_v);
            ibuq.e(bitmap1, "extractAlpha(...)");
            Bitmap bitmap2 = Bitmap.createBitmap(bitmap1.getWidth(), bitmap1.getHeight(), Bitmap.Config.ARGB_8888);
            ibuq.e(bitmap2, "createBitmap(...)");
            Canvas canvas0 = new Canvas(bitmap2);
            canvas0.drawColor(0, PorterDuff.Mode.CLEAR);
            for(Object object1: bvyu.a) {
                int v = ((Number)((ibns)object1).a).intValue();
                int v1 = ((Number)((ibns)object1).b).intValue();
                Paint paint1 = new Paint();
                paint1.setColor(v1);
                canvas0.drawBitmap(bitmap1, 0.0f, ((float)v), paint1);
            }
            canvas0.drawBitmap(bitmap0, -((float)arr_v[0]), -((float)arr_v[1]), null);
            Resources resources0 = textView0.getResources();
            ibuq.e(resources0, "getResources(...)");
            drawable0 = new BitmapDrawable(resources0, bitmap2);
        }
        int v2 = bwdm0.b() ? bwdz.a(textView0, 0x7F040E20) : bwdz.a(textView0, 0x7F040E1F);  // attr:uiflow_app_icon_padding_bc25
        int v3 = bwdm0.b() ? bwdz.a(textView0, 0x7F040E22) : bwdz.a(textView0, 0x7F040E21) + v2;  // attr:uiflow_app_icon_size_bc25
        drawable0.setBounds(0, 0, v3, v3);
        TextDirectionHeuristic textDirectionHeuristic0 = TextDirectionHeuristics.ANYRTL_LTR;
        int v4 = this.d.length();
        boolean z = textDirectionHeuristic0.isRtl(this.d, 0, v4);
        if(bwdm0.b()) {
            textView0.setLayoutDirection(((int)z));
        }
        Drawable drawable1 = z ? null : drawable0;
        if(!z) {
            drawable0 = null;
        }
        textView0.setCompoundDrawables(drawable1, null, drawable0, null);
        textView0.setCompoundDrawablePadding(v2);
        return ibom.a;
    }
}

