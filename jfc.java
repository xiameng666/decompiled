import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.List;

public final class jfc {
    public static final Typeface a(Typeface typeface0, jes jes0, Context context0) {
        float f;
        String s;
        if(typeface0 == null) {
            return null;
        }
        List list0 = jes0.a;
        if(!list0.isEmpty()) {
            ThreadLocal threadLocal0 = jfe.a;
            Paint paint0 = (Paint)threadLocal0.get();
            if(paint0 == null) {
                paint0 = new Paint();
                threadLocal0.set(paint0);
            }
            paint0.setFontVariationSettings(null);
            paint0.setTypeface(typeface0);
            jkm.a(context0);
            int v1 = context0 == null || context0.getResources().getConfiguration().fontWeightAdjustment == 0x7FFFFFFF ? 0 : context0.getResources().getConfiguration().fontWeightAdjustment;
            if(v1 == 0) {
                s = jlz.c(list0, null, null, null, new jez(), 0x1F);
            }
            else {
                int v2 = list0.size();
                String s1 = "";
                boolean z = false;
                for(int v = 0; v < v2; ++v) {
                    jep jep0 = (jep)list0.get(v);
                    if(ibuq.m(jep0.a(), "wght")) {
                        f = jfa.a(jep0.b() + ((float)v1));
                        z = true;
                    }
                    else {
                        f = jep0.b();
                    }
                    if(v != 0) {
                        s1 = s1 + ',';
                    }
                    s1 = s1 + '\'' + jep0.a() + "\' " + f;
                }
                if(z) {
                    s = s1;
                }
                else {
                    float f1 = jfa.a(((float)v1) + 400.0f);
                    if(!list0.isEmpty()) {
                        s1 = s1 + ',';
                    }
                    s = s1 + "\'wght\' " + f1;
                }
            }
            paint0.setFontVariationSettings(s);
            return paint0.getTypeface();
        }
        return typeface0;
    }
}

