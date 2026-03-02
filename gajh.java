import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class gajh {
    public static void a(View view0) {
        if(view0 != null && gajm.d(view0)) {
            gajh.c(((TextView)view0.findViewById(0x7F0B2162)));  // id:sud_items_title
            TextView textView0 = (TextView)view0.findViewById(0x7F0B215E);  // id:sud_items_summary
            if(textView0.getVisibility() == 8 && (view0 instanceof LinearLayout)) {
                ((LinearLayout)view0).setGravity(16);
            }
            gajh.b(textView0);
            gajh.d(view0);
        }
    }

    public static void b(TextView textView0) {
        if(!gajm.d(textView0)) {
            return;
        }
        int v = gajm.a(textView0.getContext());
        gajo.a(textView0, new gajn(null, null, gaea.aN, gaea.aQ, null, null, gaea.aO, null, v));
    }

    public static void c(TextView textView0) {
        if(gajm.d(textView0)) {
            Context context0 = textView0.getContext();
            int v = gajm.a(textView0.getContext());
            gajo.a(textView0, new gajn(null, null, gaea.aM, gaea.aP, null, null, null, null, v));
            if(gaec.t(context0)) {
                gaec gaec0 = gaec.h(context0);
                gaea gaea0 = gaea.aR;
                if(gaec0.w(gaea0)) {
                    String s = gaec.h(context0).k(context0, gaea0);
                    if(s != null && !s.isEmpty()) {
                        textView0.setFontVariationSettings(s);
                    }
                }
            }
        }
    }

    public static void d(View view0) {
        Context context0 = view0.getContext();
        float f = gaec.h(context0).w(gaea.aS) ? gaec.h(context0).a(context0, gaea.aS) : ((float)view0.getPaddingTop());
        float f1 = gaec.h(context0).w(gaea.aT) ? gaec.h(context0).a(context0, gaea.aT) : ((float)view0.getPaddingBottom());
        if((f != ((float)view0.getPaddingTop())) || f1 != ((float)view0.getPaddingBottom())) {
            view0.setPadding(view0.getPaddingStart(), ((int)f), view0.getPaddingEnd(), ((int)f1));
        }
        gaec gaec0 = gaec.h(context0);
        gaea gaea0 = gaea.aV;
        if(gaec0.w(gaea0)) {
            view0.setMinimumHeight(((int)gaec.h(context0).a(context0, gaea0)));
        }
    }

    public static void e(View view0) {
        if(view0 != null) {
            Context context0 = view0.getContext();
            gaec gaec0 = gaec.h(context0);
            gaea gaea0 = gaea.O;
            boolean z = gaec0.w(gaea0);
            gaec gaec1 = gaec.h(context0);
            gaea gaea1 = gaea.P;
            boolean z1 = gaec1.w(gaea1);
            if(gajm.e(view0)) {
                if(z) {
                label_12:
                    if((view0.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
                        int v = z ? ((int)gaec.h(context0).a(context0, gaea0)) : viewGroup$MarginLayoutParams0.leftMargin;
                        int v1 = z1 ? ((int)gaec.h(context0).a(context0, gaea1)) : viewGroup$MarginLayoutParams0.rightMargin;
                        viewGroup$MarginLayoutParams0.setMargins(v, viewGroup$MarginLayoutParams0.topMargin, v1, viewGroup$MarginLayoutParams0.bottomMargin);
                        viewGroup$MarginLayoutParams0.setMarginStart(v);
                        viewGroup$MarginLayoutParams0.setMarginEnd(v1);
                    }
                }
                else if(z1) {
                    z1 = true;
                    goto label_12;
                }
            }
        }
    }
}

