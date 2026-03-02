import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import com.google.android.setupdesign.GlifLayout;

public final class eqpc {
    public static void a(UiCustomization uiCustomization0, GlifLayout glifLayout0) {
        TextView textView0 = ((gahy)glifLayout0.t(gahy.class)).a();
        ImageView imageView0 = (ImageView)glifLayout0.r(0x7F0B216C);  // id:sud_layout_icon
        int v = uiCustomization0.b;
        if(v == 1) {
            textView0.setGravity(1);
            v = 1;
        }
        if(v == 0) {
            if(hygx.i()) {
                textView0.setGravity(0x800003);
                if(gaec.t(glifLayout0.getContext())) {
                    gahw gahw0 = (gahw)glifLayout0.t(gahw.class);
                    if(gahw0 != null) {
                        gahw0.c(8);
                    }
                }
            }
            v = 0;
        }
        int v1 = uiCustomization0.d;
        hygx hygx0 = hygx.a;
        if(((long)v1) >= hygx0.b().e() && ((long)v1) <= hygx0.b().c()) {
            textView0.setTextSize(((float)v1));
        }
        if((imageView0.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)imageView0.getLayoutParams();
            if(frameLayout$LayoutParams0 != null) {
                if(v == 1) {
                    frameLayout$LayoutParams0.gravity = 1;
                }
                else if(v == 0 && hygx.i()) {
                    frameLayout$LayoutParams0.gravity = 0x800003;
                }
                int v2 = uiCustomization0.c;
                if(((long)v2) >= hygx0.b().d() && ((long)v2) <= hygx0.b().b()) {
                    int v3 = (int)TypedValue.applyDimension(1, ((float)v2), glifLayout0.getResources().getDisplayMetrics());
                    frameLayout$LayoutParams0.height = v3;
                    frameLayout$LayoutParams0.width = v3;
                }
                imageView0.setLayoutParams(frameLayout$LayoutParams0);
            }
        }
    }

    public static void b(Context context0, Button button0) {
        button0.setTextColor(context0.getResources().getColor(0x7F061127));  // color:smartdevice_text_color_on_primary
    }

    public static void c(GlifLayout glifLayout0) {
        if(hygx.a.b().k()) {
            Context context0 = glifLayout0.getContext();
            if((context0 instanceof xnz) && bagw.b(((xnz)context0).getIntent())) {
                gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
                if(gaff0 != null) {
                    Button button0 = gaff0.h();
                    if(button0 != null) {
                        eqpc.b(glifLayout0.getContext(), button0);
                    }
                }
            }
        }
    }

    public static void d(Context context0, GlifLayout glifLayout0, int v) {
        if(glifLayout0 != null && v != 0) {
            Drawable drawable0 = context0.getDrawable(v);
            if(drawable0 != null) {
                glifLayout0.M(drawable0);
                if(v == 0x7F080491 || v == 0x7F080493 || v == 0x7F080E29) {  // drawable:googleg_standard_color_32_vd
                    ((gahz)glifLayout0.t(gahz.class)).g(0);
                }
            }
        }
    }

    public static void e(GlifLayout glifLayout0, int v) {
        switch(v) {
            case 1: {
                View view0 = glifLayout0.r(0x7F0B2143);  // id:sud_glif_progress_bar
                if(view0 != null) {
                    view0.setVisibility(0);
                }
                glifLayout0.O(false);
                return;
            }
            case 2: {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)((gahy)glifLayout0.t(gahy.class)).a().getLayoutParams();
                if(viewGroup$MarginLayoutParams0 != null) {
                    viewGroup$MarginLayoutParams0.setMargins(viewGroup$MarginLayoutParams0.leftMargin, ((int)glifLayout0.getContext().getResources().getDimension(0x7F071149)), viewGroup$MarginLayoutParams0.rightMargin, viewGroup$MarginLayoutParams0.bottomMargin);  // dimen:smartdevice_title_margin_top_bc25
                }
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams1 = (ViewGroup.MarginLayoutParams)((gahu)glifLayout0.t(gahu.class)).a().getLayoutParams();
                if(viewGroup$MarginLayoutParams1 != null) {
                    viewGroup$MarginLayoutParams1.setMargins(viewGroup$MarginLayoutParams1.leftMargin, ((int)glifLayout0.getContext().getResources().getDimension(0x7F071113)), viewGroup$MarginLayoutParams1.rightMargin, ((int)glifLayout0.getContext().getResources().getDimension(0x7F071112)));  // dimen:smartdevice_description_margin_top_bc25
                }
                View view1 = glifLayout0.r(0x7F0B2175);  // id:sud_layout_progress_indicator
                ViewStub viewStub0 = (ViewStub)glifLayout0.r(0x7F0B2144);  // id:sud_glif_progress_indicator_stub
                if(viewStub0 != null) {
                    viewStub0.inflate();
                    viewStub0.setVisibility(0);
                }
                if(view1 != null) {
                    view1.setVisibility(0);
                }
                glifLayout0.O(false);
                return;
            }
            default: {
                glifLayout0.O(true);
            }
        }
    }
}

