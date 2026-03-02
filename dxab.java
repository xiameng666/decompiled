import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import com.google.android.libraries.tapandpay.ui.rowsecondary.icon.RowSecondaryIcon;

public final class dxab extends uq {
    public final RowSecondary t;
    private final FrameLayout u;
    private final RowSecondaryIcon v;

    public dxab(View view0) {
        ibuq.f(view0, "itemView");
        super(view0);
        FrameLayout frameLayout0 = (FrameLayout)view0;
        this.u = frameLayout0;
        this.v = (RowSecondaryIcon)frameLayout0.findViewById(0x7F0B01BB);  // id:CategoryInfo
        this.t = (RowSecondary)frameLayout0.findViewById(0x7F0B073D);  // id:RowSecondaryCategoryInfo
    }

    public final void D(Context context0, fhwk fhwk0, gvby gvby0, dsok dsok0, View.OnClickListener view$OnClickListener0) {
        fryh fryh0;
        guey guey0;
        ibuq.f(context0, "context");
        ibuq.f(fhwk0, "viewVisualElements");
        ibuq.f(dsok0, "imageLoader");
        ibuq.f(view$OnClickListener0, "onCategoryInfoClicked");
        String s = gvby0.d;
        ibuq.e(s, "getLabel(...)");
        guez guez0 = gvby0.e == null ? guez.a : gvby0.e;
        ibuq.e(guez0, "getIcon(...)");
        int v = 0;
        if(hwfk.av()) {
            this.v.setVisibility(8);
            RowSecondary rowSecondary0 = this.t;
            rowSecondary0.setVisibility(0);
            fryu fryu0 = new fryu(s);
            if(fsce.a(this.a.getContext()) && (guez0.b & 2) != 0) {
                guey0 = guez0.d;
                if(guey0 == null) {
                    guey0 = guey.a;
                }
            }
            else {
                guey0 = guez0.c;
                if(guey0 == null) {
                    guey0 = guey.a;
                }
            }
            ibuq.c(guey0);
            if(guey0.d.size() > 0) {
                gufc gufc0 = (gufc)guey0.d.get(0);
                ibuq.e(gufc0, "getLocalResource(...)");
                int v1 = gufc0.d;
                if(v1 == 4) {
                    v = (int)(((Integer)gufc0.e));
                }
                else if(v1 == 3) {
                    gufa gufa0 = gufa.b(((Integer)gufc0.e).intValue());
                    if(gufa0 == null) {
                        gufa0 = gufa.bx;
                    }
                    v = dsoa.a(gufa0);
                }
                fryh0 = new fryh(v);
            }
            else if(guey0.e.size() > 0) {
                gufg gufg0 = (gufg)guey0.e.get(0);
                ibuq.e(gufg0, "getRemoteResource(...)");
                int v2 = gufe.a(gufg0.c).ordinal();
                String s1 = "";
                if(v2 == 0) {
                    if(gufg0.c == 2) {
                        s1 = (String)gufg0.d;
                    }
                    ibuq.e(s1, "getSecureFifeUrl(...)");
                    fryh0 = new fryi(s1, null, false, null, null, 62);
                }
                else {
                    switch(v2) {
                        case 1: {
                            if(gufg0.c == 7) {
                                s1 = (String)gufg0.d;
                            }
                            ibuq.e(s1, "getLottieUrl(...)");
                            fryh0 = new fryj(s1, null, null, null, 14);
                            break;
                        }
                        case 2: {
                            if(gufg0.c == 3) {
                                s1 = (String)gufg0.d;
                            }
                            ibuq.e(s1, "getStaticUrl(...)");
                            fryh0 = new fryj(s1, null, null, null, 14);
                            break;
                        }
                        case 3: {
                            fryh0 = new fryh(0);
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
            }
            else {
                fryh0 = new fryh(0);
            }
            rowSecondary0.h(new fuat(fryu0, null, new fuaz(fryh0, new frxp(fipx.a(context0, 0x7F0402C8)), null, null, 28), new fubv(new fryh(0x7F080560), null, new frxp(fipx.a(context0, 0x7F04030C)), null, null, 0x76), 0, null, new dxaa(view$OnClickListener0, this), null, null, false, false, true, fule.a, false, 10162));  // attr:colorOnAppBackgroundElement
        }
        else {
            this.v.setVisibility(0);
            this.t.setVisibility(8);
            this.v.o(s);
            Drawable drawable0 = context0.getResources().getDrawable(0x7F080560, context0.getTheme());  // drawable:gs_edit_vd_theme_24
            drawable0.setTintList(ColorStateList.valueOf(fipx.a(context0, 0x7F04030C)));  // attr:colorPrimary
            ibuq.c(drawable0);
            this.v.q(drawable0);
            Drawable drawable1 = context0.getResources().getDrawable(0x7F08059B, context0.getTheme());  // drawable:gs_image_vd_theme_24
            drawable1.setTintList(ColorStateList.valueOf(fipx.a(context0, 0x7F0402C8)));  // attr:colorOnAppBackgroundElement
            dsoj dsoj0 = new dsoj(this.v.h, guez0);
            dsoj0.f = gfsx.m(drawable1);
            dsok0.d(dsoj0);
            this.v.setOnClickListener(view$OnClickListener0);
        }
        fhwk0.g(this.F(), fhwk0.a.a(0x33AE5));
    }

    public final void E(fhwk fhwk0) {
        ibuq.f(fhwk0, "viewVisualElements");
        fhwk0.d(this.F());
    }

    private final View F() {
        if(hwfk.av()) {
            ibuq.c(this.t);
            return this.t;
        }
        ibuq.c(this.v);
        return this.v;
    }
}

