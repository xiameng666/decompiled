import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.AdviceCardView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import j..util.Objects;
import java.util.HashMap;
import java.util.List;

public final class zrd extends aaep {
    public final aacf t;
    public final aacb u;
    public final aacd v;
    private static final List w;
    private final zem x;
    private final aauk y;

    static {
        zrd.w = ibpo.g(new Integer[]{((int)8), ((int)9)});
    }

    @AssistedInject
    public zrd(@Assisted View view0, aacf aacf0, aacb aacb0, aacd aacd0, zem zem0, aauk aauk0) {
        ibuq.f(view0, "view");
        ibuq.f(aacf0, "onLinkClickListener");
        ibuq.f(aacb0, "onAdviceBodyClickListener");
        ibuq.f(aacd0, "onAdviceDismissClickListener");
        ibuq.f(zem0, "imageFetcher");
        super(view0);
        this.t = aacf0;
        this.u = aacb0;
        this.v = aacd0;
        this.x = zem0;
        this.y = aauk0;
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        ibuq.f(aaem0, "item");
    }

    @Override  // aaep
    public final void E(aaem aaem0, List list0) {
        gsad gsad1;
        hjie hjie2;
        gsad gsad0;
        hjie hjie0;
        zqs zqs0;
        zqt zqt0;
        int v;
        ibuq.f(aaem0, "item");
        ibuq.f(list0, "payloads");
        if((aaem0 instanceof znm)) {
            View view0 = this.a;
            if((view0 instanceof AdviceCardView)) {
                grxo grxo0 = ((znm)aaem0).a;
                boolean z = ((znm)aaem0).c;
                ((AdviceCardView)view0).l = z;
                switch(grxo0.c) {
                    case 200: {
                        v = 0x7F040119;  // attr:asAdviceMediumSeverityCard
                        break;
                    }
                    case 300: {
                        v = 0x7F040117;  // attr:asAdviceHighSeverityCard
                        break;
                    }
                    case 400: {
                        v = 0x7F04011A;  // attr:asAdviceUrgentSeverityCard
                        break;
                    }
                    default: {
                        v = 0x7F040118;  // attr:asAdviceLowSeverityCard
                    }
                }
                TypedArray typedArray0 = ((AdviceCardView)view0).getContext().obtainStyledAttributes(((AdviceCardView)view0).h, aasw.a, v, 0);
                ibuq.e(typedArray0, "obtainStyledAttributes(...)");
                int v1 = jxj.a(typedArray0, 0);
                ColorStateList colorStateList0 = typedArray0.getColorStateList(4);
                int v2 = jxj.a(typedArray0, 9);
                int v3 = jxj.a(typedArray0, 3);
                int v4 = jxj.a(typedArray0, 5);
                int v5 = jxj.a(typedArray0, 6);
                int v6 = jxj.a(typedArray0, 7);
                int v7 = jxj.a(typedArray0, 1);
                ColorStateList colorStateList1 = typedArray0.getColorStateList(2);
                typedArray0.recycle();
                if(!hoju.j()) {
                    ((AdviceCardView)view0).v().setImageTintList(colorStateList0);
                }
                Object object0 = ((AdviceCardView)view0).j.a();
                ibuq.e(object0, "getValue(...)");
                ((ImageView)object0).setImageTintList(colorStateList1);
                ((AdviceCardView)view0).o().getBackground().mutate().setTint(v7);
                ((AdviceCardView)view0).z().d(v1);
                ((AdviceCardView)view0).z().G(v1);
                if(!hoju.j()) {
                    ((AdviceCardView)view0).z().F(cchs.d(((AdviceCardView)view0).getContext(), v1));
                }
                ((AdviceCardView)view0).u().setTextColor(v2);
                ((AdviceCardView)view0).r().setTextColor(v3);
                ((AdviceCardView)view0).s().setTextColor(v3);
                ((AdviceCardView)view0).t().setTextColor(v3);
                ((AdviceCardView)view0).w().setBackgroundColor(v4);
                ((AdviceCardView)view0).w().setTextColor(v5);
                ((AdviceCardView)view0).y().setTextColor(v6);
                ((AdviceCardView)view0).x().setTextColor(v6);
                String s = grxo0.e;
                ibuq.e(s, "getTitle(...)");
                ibuq.f(s, "title");
                aabu.k(((AdviceCardView)view0).u(), s);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((AdviceCardView)view0).o().getLayoutParams();
                ibuq.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                if(((AdviceCardView)view0).l) {
                    ((jsr)viewGroup$LayoutParams0).H = 0.0f;
                    ((AdviceCardView)view0).o().setVisibility(8);
                    Space space0 = ((AdviceCardView)view0).q();
                    if(space0 != null) {
                        space0.setVisibility(8);
                    }
                }
                else {
                    ((jsr)viewGroup$LayoutParams0).H = 0.5f;
                    ((AdviceCardView)view0).o().setVisibility(0);
                    Space space1 = ((AdviceCardView)view0).q();
                    if(space1 != null) {
                        space1.setVisibility(0);
                    }
                }
                ((AdviceCardView)view0).o().setLayoutParams(((jsr)viewGroup$LayoutParams0));
                zem zem0 = this.x;
                grwe grwe0 = grxo0.d == null ? grwe.a : grxo0.d;
                ibuq.e(grwe0, "getIcon(...)");
                ibuq.f(zem0, "imageFetcher");
                ibuq.f(grwe0, "iconImage");
                int v8 = ((AdviceCardView)view0).v().getLayoutParams().width;
                if(!Objects.equals(((AdviceCardView)view0).m, grwe0)) {
                    ((AdviceCardView)view0).v().setImageDrawable(null);
                    aabu.h(zem0, ((AdviceCardView)view0).v(), true, grwe0, v8);
                    ((AdviceCardView)view0).m = grwe0;
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams1 = ((AdviceCardView)view0).m().getLayoutParams();
                ibuq.d(viewGroup$LayoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((jsr)viewGroup$LayoutParams1).H = ((AdviceCardView)view0).l ? 0.0f : 0.5f;
                ((AdviceCardView)view0).m().setLayoutParams(((jsr)viewGroup$LayoutParams1));
                if(hoju.j()) {
                    zoh zoh0 = ((znm)aaem0).b;
                    ibuq.f(zoh0, "position");
                    if(hoju.j()) {
                        int v9 = zoh0.ordinal();
                        if(v9 == 0) {
                            zqt0 = new zqt(((AdviceCardView)view0).i(), ((AdviceCardView)view0).j());
                        }
                        else {
                            switch(v9) {
                                case 1: {
                                    zqt0 = new zqt(((AdviceCardView)view0).j(), ((AdviceCardView)view0).j());
                                    break;
                                }
                                case 2: {
                                    zqt0 = new zqt(((AdviceCardView)view0).j(), ((AdviceCardView)view0).i());
                                    break;
                                }
                                default: {
                                    if(v9 != 3) {
                                        throw new ibnq();
                                    }
                                    zqt0 = new zqt(((AdviceCardView)view0).i(), ((AdviceCardView)view0).i());
                                    break;
                                }
                            }
                        }
                        ViewParent viewParent0 = ((AdviceCardView)view0).z().getParent();
                        ibuq.d(viewParent0, "null cannot be cast to non-null type android.view.ViewGroup");
                        int v10 = ((ViewGroup)viewParent0).getPaddingStart();
                        int v11 = ((ViewGroup)viewParent0).getPaddingEnd();
                        ((ViewGroup)viewParent0).setPadding(v10, zqt0.a, v11, zqt0.b);
                        int v12 = zoh0.ordinal();
                        if(v12 == 0) {
                            zqs0 = new zqs(((AdviceCardView)view0).g(), ((AdviceCardView)view0).h());
                        }
                        else {
                            switch(v12) {
                                case 1: {
                                    zqs0 = new zqs(((AdviceCardView)view0).h(), ((AdviceCardView)view0).h());
                                    break;
                                }
                                case 2: {
                                    zqs0 = new zqs(((AdviceCardView)view0).h(), ((AdviceCardView)view0).g());
                                    break;
                                }
                                default: {
                                    if(v12 != 3) {
                                        throw new ibnq();
                                    }
                                    zqs0 = new zqs(((AdviceCardView)view0).g(), ((AdviceCardView)view0).g());
                                    break;
                                }
                            }
                        }
                        MaterialCardView materialCardView0 = ((AdviceCardView)view0).z();
                        fyus fyus0 = new fyus(((AdviceCardView)view0).z().C());
                        fyus0.f(zqs0.a);
                        fyus0.h(zqs0.a);
                        fyus0.b(zqs0.b);
                        fyus0.d(zqs0.b);
                        materialCardView0.mu(new fyut(fyus0));
                    }
                }
                if(hoju.p() && (grxo0.b & 0x8000) != 0) {
                    grwb grwb0 = grxo0.n == null ? grwb.a : grxo0.n;
                    ibuq.e(grwb0, "getVisualElementConfig(...)");
                    this.y.a(((AdviceCardView)view0), grwb0);
                }
                ((AdviceCardView)view0).k().setVisibility(8);
                ((AdviceCardView)view0).l().setVisibility(8);
                ((AdviceCardView)view0).r().setVisibility(8);
                ((AdviceCardView)view0).s().setVisibility(8);
                if((grxo0.f == null ? grxl.a : grxo0.f).b == 1) {
                    grxl grxl0 = grxo0.f == null ? grxl.a : grxo0.f;
                    String s1 = (grxl0.b == 1 ? ((grxn)grxl0.c) : grxn.a).b;
                    ibuq.e(s1, "getText(...)");
                    ibuq.f(s1, "description");
                    ((AdviceCardView)view0).l().setVisibility(8);
                    ((AdviceCardView)view0).k().setVisibility(0);
                    ((AdviceCardView)view0).r().setText(s1);
                    ((AdviceCardView)view0).s().setText(s1);
                    if(((AdviceCardView)view0).l) {
                        ((AdviceCardView)view0).s().setVisibility(0);
                        ((AdviceCardView)view0).r().setVisibility(8);
                    }
                    else {
                        ((AdviceCardView)view0).s().setVisibility(8);
                        ((AdviceCardView)view0).r().setVisibility(0);
                    }
                }
                else {
                    grxl grxl1 = grxo0.f;
                    if((grxl1 == null ? grxl.a : grxl1).b == 2) {
                        if(grxl1 == null) {
                            grxl1 = grxl.a;
                        }
                        grxp grxp0 = grxl1.b == 2 ? ((grxp)grxl1.c) : grxp.a;
                        grxh grxh0 = grxp0.c == null ? grxh.a : grxp0.c;
                        String s2 = grxh0.h;
                        ibuq.e(s2, "getLabelText(...)");
                        float f = grxh0.c;
                        ibuq.c(grxh0);
                        ibuq.f(grxh0, "<this>");
                        if((2 & grxh0.b) == 0) {
                            hjie0 = null;
                        }
                        else {
                            hjie0 = grxh0.d;
                            if(hjie0 == null) {
                                hjie0 = hjie.a;
                            }
                        }
                        ibuq.f(grxh0, "<this>");
                        if((grxh0.b & 4) == 0) {
                            gsad0 = null;
                        }
                        else {
                            gsad0 = grxh0.e;
                            if(gsad0 == null) {
                                gsad0 = gsad.a;
                            }
                        }
                        hjie hjie1 = ccht.a(hjie0, gsad0);
                        ibuq.f(grxh0, "<this>");
                        if((grxh0.b & 8) == 0) {
                            hjie2 = null;
                        }
                        else {
                            hjie2 = grxh0.f;
                            if(hjie2 == null) {
                                hjie2 = hjie.a;
                            }
                        }
                        ibuq.f(grxh0, "<this>");
                        if((grxh0.b & 16) == 0) {
                            gsad1 = null;
                        }
                        else {
                            gsad1 = grxh0.g;
                            if(gsad1 == null) {
                                gsad1 = gsad.a;
                            }
                        }
                        hjie hjie3 = ccht.a(hjie2, gsad1);
                        ibuq.f(s2, "label");
                        if(((AdviceCardView)view0).A() != null && hoju.j()) {
                            if(hjie1 != null) {
                                LinearProgressIndicator linearProgressIndicator0 = ((AdviceCardView)view0).A();
                                if(linearProgressIndicator0 != null) {
                                    linearProgressIndicator0.f(new int[]{aabu.a(hjie1)});
                                }
                            }
                            if(hjie3 != null) {
                                LinearProgressIndicator linearProgressIndicator1 = ((AdviceCardView)view0).A();
                                if(linearProgressIndicator1 != null) {
                                    linearProgressIndicator1.h(aabu.a(hjie3));
                                }
                            }
                            LinearProgressIndicator linearProgressIndicator2 = ((AdviceCardView)view0).A();
                            if(linearProgressIndicator2 != null) {
                                linearProgressIndicator2.setProgress(((int)(f * 100.0f)));
                            }
                        }
                        else if(((AdviceCardView)view0).p() != null) {
                            aabu.n(((AdviceCardView)view0).p(), hjie1, hjie3);
                            ProgressBar progressBar0 = ((AdviceCardView)view0).p();
                            if(progressBar0 != null) {
                                progressBar0.setProgress(((int)(f * 100.0f)));
                            }
                        }
                        aabu.k(((AdviceCardView)view0).t(), s2);
                        ((AdviceCardView)view0).k().setVisibility(8);
                        if(((AdviceCardView)view0).l) {
                            ((AdviceCardView)view0).l().setVisibility(0);
                        }
                        else {
                            ((AdviceCardView)view0).l().setVisibility(8);
                        }
                    }
                }
                ((AdviceCardView)view0).w().setVisibility(8);
                ((AdviceCardView)view0).y().setVisibility(8);
                ((AdviceCardView)view0).x().setVisibility(8);
                ((AdviceCardView)view0).n().setVisibility(8);
                String s3 = grxo0.g;
                ibuq.e(s3, "getCallToActionText(...)");
                int v13 = s3.length();
                boolean z1 = zhz.c((grxo0.h == null ? grwp.a : grxo0.h));
                String s4 = grxo0.j;
                ibuq.e(s4, "getSecondaryButtonText(...)");
                boolean z2 = s4.length() > 0;
                boolean z3 = zhz.c((grxo0.k == null ? grwp.a : grxo0.k));
                boolean z4 = v13 > 0 && z1;
                if(z4) {
                    String s5 = grxo0.g;
                    ibuq.e(s5, "getCallToActionText(...)");
                    boolean z5 = grxo0.l;
                    zqx zqx0 = new zqx(this, grxo0);
                    ibuq.f(s5, "text");
                    if(((AdviceCardView)view0).l) {
                        ((AdviceCardView)view0).n().setVisibility(0);
                        if(z5) {
                            ((AdviceCardView)view0).w().setVisibility(8);
                            ((AdviceCardView)view0).y().setVisibility(0);
                        }
                        else {
                            ((AdviceCardView)view0).w().setVisibility(0);
                            ((AdviceCardView)view0).y().setVisibility(8);
                        }
                    }
                    else {
                        ((AdviceCardView)view0).n().setVisibility(8);
                    }
                    ((AdviceCardView)view0).w().setText(s5);
                    ((AdviceCardView)view0).w().setOnClickListener(zqx0);
                    ((AdviceCardView)view0).y().setText(s5);
                    ((AdviceCardView)view0).y().setOnClickListener(zqx0);
                    ((AdviceCardView)view0).C();
                }
                if(z2) {
                    if(grxo0.i) {
                        String s6 = grxo0.j;
                        ibuq.e(s6, "getSecondaryButtonText(...)");
                        ((AdviceCardView)view0).B(s6, new zqy(this, aaem0));
                    }
                    else if(z3) {
                        String s7 = grxo0.j;
                        ibuq.e(s7, "getSecondaryButtonText(...)");
                        ((AdviceCardView)view0).B(s7, new zqz(this, grxo0));
                    }
                }
                if(!z) {
                    ((AdviceCardView)view0).setOnClickListener(new zra(this, aaem0));
                }
                else if(z4 && (z2 && z3) || hoju.a.b().a()) {
                    ((AdviceCardView)view0).setOnClickListener(null);
                }
                else {
                    if(hoju.p()) {
                        grwp grwp0 = grxo0.h;
                        if(((grwp0 == null ? grwp.a : grwp0).b & 4) != 0) {
                            aauk aauk0 = this.y;
                            if(grwp0 == null) {
                                grwp0 = grwp.a;
                            }
                            grwb grwb1 = grwp0.e == null ? grwb.a : grwp0.e;
                            ibuq.e(grwb1, "getVisualElementConfig(...)");
                            ibuq.f(grwb1, "config");
                            if(aauk0.c && (grwb1.b & 1) != 0) {
                                HashMap hashMap0 = aauk0.e;
                                if(!ibuq.m(hashMap0.get(((AdviceCardView)view0)), grwb1)) {
                                    hashMap0.put(((AdviceCardView)view0), grwb1);
                                    fhvo fhvo0 = aauk0.f(grwb1);
                                    aauk0.a.f(((AdviceCardView)view0), fhvo0);
                                }
                            }
                        }
                    }
                    ((AdviceCardView)view0).setOnClickListener(new zrb(this, grxo0));
                }
                kfe.j(((AdviceCardView)view0), new zrc(((znm)aaem0)));
                if(!hoju.j()) {
                    tk tk0 = this.r;
                    if(tk0 != null) {
                        int v14 = tk0.b();
                        int v15 = this.fp();
                        int v16 = this.fp();
                        int v17 = this.fp() - 1;
                        int v18 = this.fp() + 1;
                        boolean z6 = v15 == 0 || !zrd.G(tk0, v17);
                        boolean z7 = v16 == v14 - 1 || !zrd.G(tk0, v18);
                        view0.setPadding(0, (z6 ? view0.getResources().getDimensionPixelSize(0x7F070167) : 0), 0, (z7 ? view0.getResources().getDimensionPixelSize(0x7F070167) : 0));  // dimen:as_advice_framework_vertical_padding
                    }
                }
                pao.b(((AdviceCardView)view0), ((pat)((AdviceCardView)view0).k.a()));
            }
        }
    }

    @Override  // aaep
    public final void F() {
        View view0 = this.a;
        if((view0 instanceof AdviceCardView) && hoju.p()) {
            this.y.e(view0);
        }
    }

    private static final boolean G(tk tk0, int v) {
        return zrd.w.contains(Integer.valueOf(tk0.dx(v)));
    }
}

