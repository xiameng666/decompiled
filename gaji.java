import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class gaji {
    public static void a(View view0) {
        int v3;
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
                    TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{0x7F040C27, 0x7F040C26});  // attr:sudMarginStart
                    int v = typedArray0.getDimensionPixelSize(0, 0);
                    int v1 = typedArray0.getDimensionPixelSize(1, 0);
                    typedArray0.recycle();
                    int v2 = z ? ((int)gaec.h(context0).a(context0, gaea0)) - v : view0.getPaddingStart();
                    if(z1) {
                        v3 = ((int)gaec.h(context0).a(context0, gaea1)) - v1;
                        if(view0.getId() == 0x7F0B2167) {  // id:sud_layout_content
                            v3 = ((int)gaec.h(context0).a(context0, gaea0)) - v1;
                        }
                    }
                    else {
                        v3 = view0.getPaddingEnd();
                        if(view0.getId() == 0x7F0B2167) {  // id:sud_layout_content
                            v3 = view0.getPaddingStart();
                        }
                    }
                    if(v2 != view0.getPaddingStart() || v3 != view0.getPaddingEnd()) {
                        if(view0.getId() == 0x7F0B2167) {  // id:sud_layout_content
                            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : new ViewGroup.MarginLayoutParams(viewGroup$LayoutParams0);
                            viewGroup$MarginLayoutParams0.setMargins(v2, viewGroup$MarginLayoutParams0.topMargin, v3, viewGroup$MarginLayoutParams0.bottomMargin);
                            return;
                        }
                        view0.setPadding(v2, view0.getPaddingTop(), v3, view0.getPaddingBottom());
                    }
                }
                else if(z1) {
                    z1 = true;
                    goto label_12;
                }
            }
        }
    }

    public static void b(View view0) {
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
                    int v = z ? ((int)gaec.h(context0).a(context0, gaea0)) : view0.getPaddingStart();
                    int v1 = z1 ? ((int)gaec.h(context0).a(context0, gaea1)) : view0.getPaddingEnd();
                    if(v != view0.getPaddingStart() || v1 != view0.getPaddingEnd()) {
                        view0.setPadding(v, view0.getPaddingTop(), v1, view0.getPaddingBottom());
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

