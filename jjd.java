import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class jjd {
    public static final float a(long v, float f, jks jks0) {
        if(jlp.e(v, jlp.a)) {
            return f;
        }
        long v1 = jlp.c(v);
        if(jlr.b(v1, 0x100000000L)) {
            return jks0.ed(v);
        }
        return jlr.b(v1, 0x200000000L) ? jlp.a(v) * f : NaNf;
    }

    public static final float b(long v, float f, jks jks0) {
        long v1 = jlp.c(v);
        if(jlr.b(v1, 0x100000000L)) {
            return ((double)jks0.dY()) > 1.05 ? jlp.a(v) / jlp.a(jks0.em(f)) * f : jks0.ed(v);
        }
        return jlr.b(v1, 0x200000000L) ? jlp.a(v) * f : NaNf;
    }

    public static final jat c(jat jat0, jat jat1) {
        return jat0 == null ? jat1 : jat0.d(jat1);
    }

    public static final void d(Spannable spannable0, long v, int v1, int v2) {
        if(v != 16L) {
            jjd.h(spannable0, new BackgroundColorSpan(hln.b(v)), v1, v2);
        }
    }

    public static final void e(Spannable spannable0, long v, int v1, int v2) {
        if(v != 16L) {
            jjd.h(spannable0, new ForegroundColorSpan(hln.b(v)), v1, v2);
        }
    }

    public static final void f(Spannable spannable0, long v, jks jks0, int v1, int v2) {
        long v3 = jlp.c(v);
        if(!jlr.b(v3, 0x100000000L)) {
            if(jlr.b(v3, 0x200000000L)) {
                jjd.h(spannable0, new RelativeSizeSpan(jlp.a(v)), v1, v2);
            }
            return;
        }
        jjd.h(spannable0, new AbsoluteSizeSpan(ibvr.c(jks0.ed(v)), false), v1, v2);
    }

    public static final void g(Spannable spannable0, jii jii0, int v, int v1) {
        if(jii0 != null) {
            ArrayList arrayList0 = new ArrayList(ibpo.q(jii0, 10));
            for(Object object0: jii0) {
                arrayList0.add(((jig)object0).a);
            }
            Locale[] arr_locale = (Locale[])arrayList0.toArray(new Locale[0]);
            jjd.h(spannable0, new LocaleSpan(new LocaleList(((Locale[])Arrays.copyOf(arr_locale, arr_locale.length)))), v, v1);
        }
    }

    public static final void h(Spannable spannable0, Object object0, int v, int v1) {
        spannable0.setSpan(object0, v, v1, 33);
    }
}

