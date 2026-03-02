import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import j..util.Objects;

public final class qf {
    public Typeface a;
    public String b;
    private final TextView c;
    private final kar d;
    private Typeface e;

    public qf(TextView textView0, kar kar0) {
        this.c = textView0;
        this.d = kar0;
    }

    public final void a(Typeface typeface0) {
        this.a = typeface0;
        this.c(typeface0);
    }

    public final boolean b(String s) {
        String s1;
        boolean z;
        int v1;
        FontVariationAxis[] arr_fontVariationAxis;
        TextView textView0 = this.c;
        Typeface typeface0 = this.a;
        TextPaint textPaint0 = textView0.getPaint();
        if(this.e != textPaint0.getTypeface()) {
            Log.w("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface0 = textPaint0.getTypeface();
        }
        int v = textView0.getContext().getResources().getConfiguration().fontWeightAdjustment;
        if(v == 0x7FFFFFFF) {
            v = 0;
        }
        qd qd0 = new qd(typeface0, s, v);
        byk byk0 = qe.a;
        Typeface typeface1 = (Typeface)byk0.d(qd0);
        if(typeface1 == null) {
            Paint paint0 = qe.b;
            if(paint0 == null) {
                paint0 = new Paint();
                qe.b = paint0;
            }
            if(v == 0) {
                s1 = s;
            }
            else if(TextUtils.isEmpty(s)) {
                arr_fontVariationAxis = new FontVariationAxis[0];
                v1 = 0;
                z = false;
                goto label_27;
            }
            else {
                arr_fontVariationAxis = FontVariationAxis.fromFontVariationSettings(s);
                if(arr_fontVariationAxis == null) {
                    s1 = s;
                }
                else {
                    v1 = 0;
                    z = false;
                label_27:
                    while(v1 < arr_fontVariationAxis.length) {
                        FontVariationAxis fontVariationAxis0 = arr_fontVariationAxis[v1];
                        if("wght".equals(fontVariationAxis0.getTag())) {
                            arr_fontVariationAxis[v1] = new FontVariationAxis("wght", qe.a(fontVariationAxis0.getStyleValue() + ((float)v)));
                            z = true;
                        }
                        ++v1;
                    }
                    if(!z) {
                        FontVariationAxis[] arr_fontVariationAxis1 = new FontVariationAxis[arr_fontVariationAxis.length + 1];
                        System.arraycopy(arr_fontVariationAxis, 0, arr_fontVariationAxis1, 0, arr_fontVariationAxis.length);
                        arr_fontVariationAxis1[arr_fontVariationAxis.length] = new FontVariationAxis("wght", qe.a(v + 400));
                        arr_fontVariationAxis = arr_fontVariationAxis1;
                    }
                    s1 = FontVariationAxis.toFontVariationSettings(arr_fontVariationAxis);
                }
            }
            if(Objects.equals(paint0.getFontVariationSettings(), s1)) {
                paint0.setFontVariationSettings(null);
            }
            paint0.setTypeface(typeface0);
            if(paint0.setFontVariationSettings(s1)) {
                typeface1 = paint0.getTypeface();
                byk0.e(qd0, typeface1);
            }
            else {
                typeface1 = null;
            }
        }
        if(typeface1 != null) {
            this.c(typeface1);
            this.b = s;
            return true;
        }
        return false;
    }

    private final void c(Typeface typeface0) {
        this.e = typeface0;
        this.d.accept(typeface0);
    }
}

