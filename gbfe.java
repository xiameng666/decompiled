import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils.TruncateAt;
import android.widget.TextView;
import com.google.android.wallet.bender3.framework.view.clickspan.TextInfoClickSpan;

public final class gbfe {
    public static float a(gbet gbet0, gbdq gbdq0) {
        return ((hdsn)gbdq0.e(2, gbet0.d, hdsn.class)).d;
    }

    static int b(gbdq gbdq0, int v) {
        int v1 = ((hdsx)gbdq0.g(6, v, hdsx.class)).ordinal();
        switch(v1) {
            case 1: {
                return 300;
            }
            case 3: {
                return 500;
            }
            case 4: {
                return 600;
            }
            case 5: {
                return 700;
            }
            case 6: {
                return 800;
            }
            default: {
                return v1 == 7 ? 900 : 400;
            }
        }
    }

    public static int c(gbet gbet0, gbdq gbdq0) {
        return gbdq0.b(3, gbet0.d);
    }

    public static void d(gbet gbet0, gbdq gbdq0, TextView textView0, int v) {
        if(gbet0.e(gbdq0, new int[]{10})) {
            textView0.setGravity(gbdu.a(((hdqc)gbdq0.e(10, gbet0.d, hdqc.class)), v));
        }
    }

    static void e(gbet gbet0, gbdq gbdq0, TextView textView0) {
        if(gbet0.e(gbdq0, new int[]{3}) && gbdq0.l(3, gbet0.d)) {
            textView0.setTextColor(gbfe.c(gbet0, gbdq0));
        }
        gbfe.k(gbet0, gbdq0, new gbff(textView0));
        if(gbet0.e(gbdq0, new int[]{2}) && gbdq0.l(2, gbet0.d)) {
            textView0.setTextSize(gbfe.a(gbet0, gbdq0));
        }
        if(gbet0.e(gbdq0, new int[]{7}) && gbdq0.l(7, gbet0.d)) {
            kim.c(textView0, gbez.c(gbdq0, 7, gbet0.d));
        }
        if(gbet0.e(gbdq0, new int[]{5}) && gbdq0.l(5, gbet0.d)) {
            textView0.setLetterSpacing(((hdsn)gbdq0.e(5, gbet0.d, hdsn.class)).d);
        }
        if(gbet0.e(gbdq0, new int[]{10})) {
            hdta hdta0 = (hdta)gbdq0.e(10, gbet0.d, hdta.class);
            int v = textView0.getPaintFlags();
            int v1 = hdta0.c ? v | 16 : v & -17;
            textView0.setPaintFlags((hdta0.b ? v1 | 8 : v1 & -9));
        }
    }

    static void f(gbet gbet0, gbdq gbdq0, TextView textView0) {
        gbfe.d(gbet0, gbdq0, textView0, 0x800033);
    }

    public static void g(gbet gbet0, SpannableString spannableString0) {
        gbdq gbdq0 = gbet0.c.d().d(15);
        if(gbdq0 != null) {
            TextInfoClickSpan[] arr_textInfoClickSpan = (TextInfoClickSpan[])spannableString0.getSpans(0, spannableString0.length(), TextInfoClickSpan.class);
            if(arr_textInfoClickSpan.length > 0) {
                boolean z = gbet0.e(gbdq0, new int[]{3});
                int v1 = z ? gbdq0.b(3, gbet0.d) : 0;
                gbfe.k(gbet0, gbdq0, new gbfc(arr_textInfoClickSpan));
                boolean z1 = gbet0.e(gbdq0, new int[]{2});
                float f = !z1 || !gbdq0.l(2, gbet0.d) ? 0.0f : ((float)gbez.c(gbdq0, 2, gbet0.d));
                hdta hdta0 = gbet0.e(gbdq0, new int[]{10}) ? ((hdta)gbdq0.e(10, gbet0.d, hdta.class)) : null;
                for(int v = 0; v < arr_textInfoClickSpan.length; ++v) {
                    TextInfoClickSpan textInfoClickSpan0 = arr_textInfoClickSpan[v];
                    if(z) {
                        textInfoClickSpan0.d = v1;
                    }
                    if(z1) {
                        textInfoClickSpan0.c = f;
                    }
                    if(hdta0 != null) {
                        textInfoClickSpan0.e = hdta0.c;
                        textInfoClickSpan0.a = hdta0.b;
                    }
                }
            }
        }
    }

    public static void h(gbet gbet0, TextView textView0) {
        gbdp gbdp0 = gbet0.c;
        gbfj.d(gbet0, textView0);
        gbfe.f(gbet0, gbdp0.c(), textView0);
        gbfe.i(gbet0, gbdp0.d(), textView0);
        if((textView0.getText() instanceof SpannableString)) {
            gbfe.g(gbet0, ((SpannableString)textView0.getText()));
        }
    }

    public static void i(gbet gbet0, gbdq gbdq0, TextView textView0) {
        gbdq gbdq1 = gbdq0.d(8);
        if(gbdq1 != null) {
            gbfe.e(gbet0, gbdq1, textView0);
            int v = 0;
            if(gbet0.e(gbdq1, new int[]{8})) {
                textView0.setAllCaps(gbdq1.l(8, gbet0.d) && gbdq1.g(8, gbet0.d, hdsv.class) == hdsv.b);
            }
            if(gbdq1.l(9, gbet0.d) && gbet0.e(gbdq1, new int[]{9})) {
                hdsz hdsz0 = (hdsz)gbdq1.g(9, gbet0.d, hdsz.class);
                switch(hdsz0.ordinal()) {
                    case 1: {
                        v = 0x800003;
                        break;
                    }
                    case 2: {
                        v = 0x800005;
                        break;
                    }
                    case 3: {
                        v = 17;
                        break;
                    }
                    case 0: 
                    case 4: {
                        v = 0x800033;
                    }
                }
                textView0.setGravity(v);
                if(hdsz0 == hdsz.e) {
                    textView0.setJustificationMode(1);
                }
            }
        }
    }

    public static void j(TextView textView0, hckq hckq0) {
        if((hckq0.b & 2) != 0) {
            textView0.setMaxLines(hckq0.d);
        }
        int v = 1;
        if((hckq0.b & 1) != 0) {
            int v1 = hckm.a(hckq0.c);
            if(v1 != 0) {
                v = v1;
            }
            textView0.setEllipsize((v - 1 == 2 ? TextUtils.TruncateAt.END : null));
        }
    }

    public static void k(gbet gbet0, gbdq gbdq0, gbfh gbfh0) {
        if(gbet0.e(gbdq0, new int[]{1, 4, 6, 13})) {
            int v = gbet0.d;
            MessageLite hfvm0 = gbdq0.f(1, v);
            String s = gbdq0.d.l(hfvm0);
            if(gbet0.e(gbdq0, new int[]{13})) {
                gbfh0.a = (hdtb)gbdq0.e(13, gbet0.d, hdtb.class);
            }
            ibuq.f(s, "familyName");
            gbeg gbeg0 = (gbeg)gbeg.a.get(s);
            if(gbeg0 != null) {
                int v1 = gbfe.b(gbdq0, v);
                boolean z = gbfe.l(gbdq0, v);
                gbfh0.h(gbet0.b, (v1 <= 400 ? gbeg0.b : gbeg0.c), z, v1);
                return;
            }
            gbfh0.f(Typeface.create(Typeface.create(s, 0), gbfe.b(gbdq0, v), gbfe.l(gbdq0, v)));
        }
    }

    static boolean l(gbdq gbdq0, int v) {
        return gbdq0.g(4, v, hdst.class) == hdst.b;
    }
}

