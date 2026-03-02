import android.graphics.Typeface;
import android.text.Html;
import android.text.Layout.Alignment;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;

public final class iwx {
    private static final iwv a;

    static {
        iwx.a = new iwv();
    }

    public static final iwj a(String s, jbf jbf0, ixb ixb0) {
        jew jew4;
        jat jat0;
        int v6;
        Spanned spanned0 = Html.fromHtml(("<ContentHandlerReplacementTag />" + s), 0x3F, null, iwx.a);
        iwg iwg0 = new iwg(spanned0.length());
        iwg0.l(spanned0);
        Object[] arr_object = spanned0.getSpans(0, iwg0.a(), Object.class);
        int v = arr_object.length;
        int v1 = 0;
        while(v1 < v) {
            int v2 = 3;
            Object object0 = arr_object[v1];
            long v3 = jbl.a(spanned0.getSpanStart(object0), spanned0.getSpanEnd(object0));
            int v4 = jbk.e(v3);
            int v5 = jbk.a(v3);
            if((object0 instanceof AbsoluteSizeSpan)) {
                v6 = v;
            }
            else if((object0 instanceof AlignmentSpan)) {
                Layout.Alignment layout$Alignment0 = ((AlignmentSpan)object0).getAlignment();
                if(layout$Alignment0 == null) {
                    v2 = 0;
                }
                else {
                    switch(iww.a[layout$Alignment0.ordinal()]) {
                        case 1: {
                            v2 = 5;
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            v2 = 6;
                            break;
                        }
                        default: {
                            v2 = 0;
                        }
                    }
                }
                iwf iwf0 = new iwf(new ixo(v2, null, 510), v4, v5, 8);
                iwg0.a.add(iwf0);
                v6 = v;
            }
            else if((object0 instanceof iwo)) {
                iwg0.g(((iwo)object0).a, ((iwo)object0).b, v4, v5);
                v6 = v;
            }
            else if((object0 instanceof BackgroundColorSpan)) {
                iwg0.h(new jat(0L, 0L, null, null, null, null, null, 0L, null, null, null, hln.c(((BackgroundColorSpan)object0).getBackgroundColor()), null, null, 0xF7FF), v4, v5);
                v6 = v;
            }
            else if((object0 instanceof iwr)) {
                jlq.g(iwq.a);
                v6 = v;
                long v7 = jlq.f(iwq.a & 0xFF00000000L, jlp.a(iwq.a) * ((float)((iwr)object0).b));
                iwf iwf1 = new iwf(new ixo(0, new jki(v7, v7), 503), v4, v5, 8);
                iwg0.a.add(iwf1);
                iwf iwf2 = new iwf(((iwr)object0).a, v4, v5, 8);
                iwg0.a.add(iwf2);
            }
            else {
                v6 = v;
                if((object0 instanceof ForegroundColorSpan)) {
                    iwg0.h(new jat(hln.c(((ForegroundColorSpan)object0).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFFE), v4, v5);
                }
                else if((object0 instanceof RelativeSizeSpan)) {
                    iwg0.h(new jat(0L, jlq.b(((RelativeSizeSpan)object0).getSizeChange()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFFD), v4, v5);
                }
                else if((object0 instanceof StrikethroughSpan)) {
                    iwg0.h(new jat(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jjz.c, null, 0xEFFF), v4, v5);
                }
                else if((object0 instanceof StyleSpan)) {
                    switch(((StyleSpan)object0).getStyle()) {
                        case 1: {
                            jat0 = new jat(0L, 0L, jeu.k, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFFB);
                            break;
                        }
                        case 2: {
                            jat0 = new jat(0L, 0L, null, new jem(1), null, null, null, 0L, null, null, null, 0L, null, null, 0xFFF7);
                            break;
                        }
                        case 3: {
                            jem jem0 = new jem(1);
                            jat0 = new jat(0L, 0L, jeu.k, jem0, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFF3);
                            break;
                        }
                        default: {
                            jat0 = null;
                        }
                    }
                    if(jat0 != null) {
                        iwg0.h(jat0, v4, v5);
                    }
                }
                else if((object0 instanceof SubscriptSpan)) {
                    iwg0.h(new jat(0L, 0L, null, null, null, null, null, 0L, new jjk(-0.5f), null, null, 0L, null, null, 0xFEFF), v4, v5);
                }
                else if((object0 instanceof SuperscriptSpan)) {
                    iwg0.h(new jat(0L, 0L, null, null, null, null, null, 0L, new jjk(0.5f), null, null, 0L, null, null, 0xFEFF), v4, v5);
                }
                else if((object0 instanceof TypefaceSpan)) {
                    String s1 = ((TypefaceSpan)object0).getFamily();
                    jew jew0 = jdz.d;
                    if(!ibuq.m(s1, jew0.f)) {
                        jew jew1 = jdz.c;
                        if(ibuq.m(s1, jew1.f)) {
                            jew0 = jew1;
                        }
                        else {
                            jew jew2 = jdz.a;
                            if(ibuq.m(s1, jew2.f)) {
                                jew0 = jew2;
                            }
                            else {
                                jew jew3 = jdz.b;
                                if(ibuq.m(s1, jew3.f)) {
                                    jew4 = jew3;
                                }
                                else {
                                    String s2 = ((TypefaceSpan)object0).getFamily();
                                    if(s2 != null && s2.length() != 0) {
                                        Typeface typeface0 = Typeface.create(s2, 0);
                                        if(ibuq.m(typeface0, Typeface.DEFAULT) || ibuq.m(typeface0, Typeface.create(Typeface.DEFAULT, 0))) {
                                            typeface0 = null;
                                        }
                                        if(typeface0 != null) {
                                            jew4 = new jex(new jis(typeface0));
                                            goto label_101;
                                        }
                                    }
                                    jew4 = null;
                                }
                                goto label_101;
                            }
                        }
                    }
                    jew4 = jew0;
                label_101:
                    iwg0.h(new jat(0L, 0L, null, null, null, jew4, null, 0L, null, null, null, 0L, null, null, 0xFFDF), v4, v5);
                }
                else if((object0 instanceof UnderlineSpan)) {
                    iwg0.h(new jat(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jjz.b, null, 0xEFFF), v4, v5);
                }
                else if((object0 instanceof URLSpan)) {
                    String s3 = ((URLSpan)object0).getURL();
                    if(s3 != null) {
                        iwg0.f(new iwz(s3, jbf0, ixb0), v4, v5);
                    }
                }
            }
            ++v1;
            v = v6;
        }
        return iwg0.d();
    }

    public static iwj b(String s, jbf jbf0, int v) {
        if((v & 2) != 0) {
            jbf0 = null;
        }
        return iwx.a(s, jbf0, null);
    }
}

