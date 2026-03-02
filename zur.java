import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.Iterator;
import java.util.List;

public final class zur extends aaep {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final ztd G;
    private final zem H;
    private final boolean I;
    private final zor J;
    private final zoy K;
    private final zpe L;
    private final zpg M;
    private final zpi N;
    private final zpk O;
    private final zpn P;
    private final zpp Q;
    private final zpr R;
    public final LinearLayout t;
    public final aacf u;
    public final aauk v;
    private final Context w;
    private final CardView x;
    private final FrameLayout y;
    private final View z;

    @AssistedInject
    public zur(@Assisted View view0, ztd ztd0, boolean z, zem zem0, aacf aacf0, zor zor0, zoy zoy0, zpe zpe0, zpg zpg0, zpi zpi0, zpk zpk0, zpn zpn0, zpp zpp0, zpr zpr0, aauk aauk0) {
        super(view0);
        this.G = ztd0;
        this.J = zor0;
        this.K = zoy0;
        this.L = zpe0;
        this.M = zpg0;
        this.N = zpi0;
        this.O = zpk0;
        this.P = zpn0;
        this.Q = zpp0;
        this.R = zpr0;
        this.I = z;
        this.v = aauk0;
        Context context0 = view0.getContext();
        this.w = context0;
        CardView cardView0 = (CardView)view0.findViewById(0x7F0B0E29);  // id:card_view
        this.x = cardView0;
        FrameLayout frameLayout0 = (FrameLayout)view0.findViewById(0x7F0B2188);  // id:summary_card
        this.y = frameLayout0;
        LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B11C2);  // id:dynamic_content
        this.t = linearLayout0;
        this.z = view0.findViewById(0x7F0B0C44);  // id:background
        this.H = zem0;
        this.u = aacf0;
        Resources resources0 = context0.getResources();
        this.A = resources0.getDimensionPixelSize(0x7F070176);  // dimen:as_card_block_vertical_padding
        this.B = resources0.getDimensionPixelSize(0x7F070182);  // dimen:as_card_vertical_spacing
        this.C = resources0.getDimensionPixelSize(0x7F070178);  // dimen:as_card_borderless_block_vertical_padding
        this.D = resources0.getDimensionPixelSize(0x7F07017A);  // dimen:as_card_deck_outer_padding
        this.F = resources0.getDimensionPixelSize(0x7F0701DE);  // dimen:as_tappable_item_min_height
        this.E = resources0.getDimensionPixelSize(0x7F070177);  // dimen:as_card_border_width
        if(z) {
            linearLayout0.setMinimumHeight(linearLayout0.getPaddingTop() + linearLayout0.getPaddingBottom());
            linearLayout0.setPadding(0, 0, 0, 0);
            frameLayout0.setPadding(0, 0, 0, 0);
        }
        else {
            ztf.a(cardView0, 1);
        }
        linearLayout0.setClipChildren(true);
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        if(aaem0.a() == 3) {
            if(this.fq() == this.G.b() - 1) {
                ztf.a(this.x, 2);
            }
            grvb grvb0 = ((zun)aaem0).a;
            this.L();
            LinearLayout linearLayout0 = this.t;
            linearLayout0.removeAllViews();
            if(grvb0.b == 1) {
                grzs grzs0 = (grzs)grvb0.c;
                if(hoju.p() && (grzs0.b & 16) != 0) {
                    this.v.a(this.a, (grzs0.e == null ? grwb.a : grzs0.e));
                }
                CardView cardView0 = this.x;
                cardView0.setClipToOutline(false);
                boolean z = this.I;
                if(!z && !grzs0.d) {
                    Drawable drawable0 = cchs.f(this.w, 0x7F04011C);  // attr:asCardBorder
                    this.z.setBackgroundDrawable(drawable0);
                }
                else if(hoju.j()) {
                    cardView0.setBackgroundColor(this.w.getColor(0x106000D));
                    int v = this.w.getColor(0x106000D);
                    this.z.setBackgroundColor(v);
                }
                else {
                    int v1 = cchs.a(this.w, 0x1010031, 0x7F060814);  // color:google_white
                    this.z.setBackgroundColor(v1);
                }
                for(int v2 = 0; v2 < grzs0.c.size(); ++v2) {
                    gruw gruw0 = (gruw)grzs0.c.get(v2);
                    aatc aatc0 = ((zun)aaem0).b;
                    View view0 = this.I(gruw0, aatc0);
                    if(view0 != null) {
                        if(zhz.c((gruw0.e == null ? grwp.a : gruw0.e))) {
                            view0.setMinimumHeight(this.F);
                        }
                        this.K(view0, v2, grzs0);
                        if(zhz.c((gruw0.e == null ? grwp.a : gruw0.e)) && v2 + 1 < grzs0.c.size()) {
                            grwp grwp0 = ((gruw)grzs0.c.get(v2 + 1)).e;
                            if(grwp0 == null) {
                                grwp0 = grwp.a;
                            }
                            if(zhz.c(grwp0)) {
                                grwp grwp1 = gruw0.e == null ? grwp.a : gruw0.e;
                                grwp grwp2 = ((gruw)grzs0.c.get(v2 + 1)).e;
                                if(grwp2 == null) {
                                    grwp2 = grwp.a;
                                }
                                if(((ProtoLiteMessage)grwp1).equals(grwp2)) {
                                    LinearLayout linearLayout1 = new LinearLayout(this.w);
                                    linearLayout1.setOrientation(1);
                                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                                    linearLayout1.setClipToPadding(false);
                                    linearLayout1.setClipChildren(false);
                                    linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
                                    linearLayout1.addView(view0);
                                    int v3 = 1;
                                    while(v2 + 1 < grzs0.c.size()) {
                                        grwp grwp3 = ((gruw)grzs0.c.get(v2 + 1)).e;
                                        if(grwp3 == null) {
                                            grwp3 = grwp.a;
                                        }
                                        if(!zhz.c(grwp3)) {
                                            break;
                                        }
                                        grwp grwp4 = gruw0.e == null ? grwp.a : gruw0.e;
                                        grwp grwp5 = ((gruw)grzs0.c.get(v2 + 1)).e;
                                        if(grwp5 == null) {
                                            grwp5 = grwp.a;
                                        }
                                        if(!((ProtoLiteMessage)grwp4).equals(grwp5)) {
                                            break;
                                        }
                                        View view1 = this.I(((gruw)grzs0.c.get(v2 + 1)), aatc0);
                                        if(view1 != null) {
                                            this.K(view1, v2 + 1, grzs0);
                                            linearLayout1.addView(view1);
                                            ++v3;
                                        }
                                        ++v2;
                                    }
                                    if(hoju.p()) {
                                        grwp grwp6 = gruw0.e;
                                        if(((grwp6 == null ? grwp.a : grwp6).b & 4) != 0) {
                                            aauk aauk0 = this.v;
                                            View view2 = this.a;
                                            if(grwp6 == null) {
                                                grwp6 = grwp.a;
                                            }
                                            aauk0.b(linearLayout1, view2, (grwp6.e == null ? grwb.a : grwp6.e));
                                        }
                                    }
                                    grwp grwp7 = gruw0.e == null ? grwp.a : gruw0.e;
                                    aacf aacf0 = hoju.p() ? new zuo(this, linearLayout1) : this.u;
                                    aabu.j(linearLayout1, grwp7, aacf0, this.G(v2, grzs0.c, v3));
                                    linearLayout0.addView(linearLayout1);
                                    continue;
                                }
                            }
                        }
                        if(hoju.p()) {
                            grwp grwp8 = gruw0.e;
                            if(((grwp8 == null ? grwp.a : grwp8).b & 4) != 0 && !(view0 instanceof kem)) {
                                aauk aauk1 = this.v;
                                View view3 = this.a;
                                if(grwp8 == null) {
                                    grwp8 = grwp.a;
                                }
                                aauk1.b(view0, view3, (grwp8.e == null ? grwb.a : grwp8.e));
                            }
                        }
                        grwp grwp9 = gruw0.e == null ? grwp.a : gruw0.e;
                        aacf aacf1 = hoju.p() ? new zup(this, view0) : this.u;
                        aabu.j(view0, grwp9, aacf1, this.G(v2, grzs0.c, 1));
                        linearLayout0.addView(view0);
                    }
                }
                if(hoju.p() && ((grzs0.f == null ? grwp.a : grzs0.f).b & 4) != 0) {
                    grwp grwp10 = grzs0.f == null ? grwp.a : grzs0.f;
                    this.v.b(linearLayout0, this.a, (grwp10.e == null ? grwb.a : grwp10.e));
                }
                grwp grwp11 = grzs0.f == null ? grwp.a : grzs0.f;
                aacf aacf2 = hoju.p() ? new zuq(this) : this.u;
                aabu.j(linearLayout0, grwp11, aacf2, (z ? cchs.c(this.w, 0x7F040136, 0x7F080221) : cchs.c(this.w, 0x7F04011F, 0x7F08020D)));  // attr:asRipple
            }
        }
    }

    @Override  // aaep
    public final void F() {
        this.L();
    }

    private final int G(int v, List list0, int v1) {
        int v2 = list0.size();
        if(this.I) {
            return cchs.c(this.w, 0x7F040136, 0x7F080221);  // attr:asRipple
        }
        if(v2 == v1) {
            return cchs.c(this.w, 0x7F04011F, 0x7F08020D);  // attr:asCardRoundedRipple
        }
        if(list0.size() == 1) {
            return cchs.c(this.w, 0x7F04011F, 0x7F08020D);  // attr:asCardRoundedRipple
        }
        if(v == 0) {
            return cchs.c(this.w, 0x7F040138, 0x7F080227);  // attr:asRippleRoundedTop
        }
        return v == list0.size() - 1 ? cchs.c(this.w, 0x7F040137, 0x7F080224) : cchs.c(this.w, 0x7F040136, 0x7F080221);  // attr:asRippleRoundedBottom
    }

    private final int H(gruw gruw0, int v, boolean z, grzs grzs0) {
        if(z) {
            if(grzs0.d && (!this.I || gruw0.c == 16)) {
                return this.C;
            }
            return this.I ? this.B : this.A;
        }
        return gruw0.c == 5 || gruw0.c == 8 || ((gruw)grzs0.c.get(v)).c == 3 ? this.A : 0;
    }

    private final View I(gruw gruw0, aatc aatc0) {
        gsad gsad2;
        hjie hjie4;
        hjie hjie2;
        HorizontalScrollView horizontalScrollView1;
        LinearLayout linearLayout7;
        grvh grvh2;
        int v12;
        grvh grvh0;
        gsad gsad0;
        hjie hjie0;
        int v = gruw0.c;
        boolean z = false;
        if(v == 1) {
            zpg zpg0 = this.M;
            grvo grvo0 = (grvo)gruw0.d;
            Context context0 = this.t.getContext();
            View view0 = LayoutInflater.from(context0).inflate(0x7F0E00BF, this.t, false);  // layout:as_card_description_block
            TextView textView0 = (TextView)view0.findViewById(0x7F0B22B8);  // id:title
            TextView textView1 = (TextView)view0.findViewById(0x7F0B10E6);  // id:description
            aabu.k(textView0, grvo0.c);
            aabu.k(textView1, grvo0.d);
            if((grvo0.b & 1) == 0) {
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)textView1.getLayoutParams();
                linearLayout$LayoutParams0.setMargins(0, 0, 0, 0);
                textView1.setLayoutParams(linearLayout$LayoutParams0);
            }
            aabu.f(textView1, grvo0.f, (grvo0.g == null ? grwe.a : grvo0.g), (grvo0.h == null ? grwp.a : grvo0.h), zpg0.a);
            if(zhz.c((grvo0.h == null ? grwp.a : grvo0.h))) {
                textView1.setMinHeight(context0.getResources().getDimensionPixelSize(0x7F0701DE));  // dimen:as_tappable_item_min_height
            }
            zem zem0 = zpg0.b;
            FadeInImageView fadeInImageView0 = (FadeInImageView)view0.findViewById(0x7F0B16E3);  // id:image
            if((4 & grvo0.b) != 0) {
                z = true;
            }
            aabu.g(zem0, fadeInImageView0, z, (grvo0.e == null ? grwe.a : grvo0.e));
            view0.setFocusable(true);
            textView0.setTextAppearance(cchs.c(context0, 0x7F040D1F, 0x7F1609EB));  // attr:textAppearanceTitleMedium
            return view0;
        }
        switch(v) {
            case 2: {
                View view1 = LayoutInflater.from(this.w).inflate(0x7F0E00C2, this.x, false);  // layout:as_card_image_block
                zem zem1 = this.H;
                FadeInImageView fadeInImageView1 = (FadeInImageView)view1.findViewById(0x7F0B16E3);  // id:image
                int v1 = (gruw0.c == 2 ? ((grwf)gruw0.d) : grwf.a).b & 1;
                grwf grwf0 = gruw0.c == 2 ? ((grwf)gruw0.d) : grwf.a;
                grwe grwe0 = grwf0.c == null ? grwe.a : grwf0.c;
                if(1 == v1) {
                    z = true;
                }
                aabu.g(zem1, fadeInImageView1, z, grwe0);
                return view1;
            }
            case 3: {
                return LayoutInflater.from(this.w).inflate(0x7F0E00C0, this.x, false);  // layout:as_card_divider_block
            }
            case 5: {
                zpk zpk0 = this.O;
                grwq grwq0 = (grwq)gruw0.d;
                LinearLayout linearLayout0 = this.t;
                Context context1 = linearLayout0.getContext();
                View view2 = LayoutInflater.from(context1).inflate(0x7F0E00C5, linearLayout0, false);  // layout:as_card_list_item_block
                FadeInImageView fadeInImageView2 = (FadeInImageView)view2.findViewById(0x7F0B16B9);  // id:icon
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)fadeInImageView2.getLayoutParams();
                linearLayout$LayoutParams1.gravity = grwq0.j == 1 ? 0x30 : 17;
                fadeInImageView2.setLayoutParams(linearLayout$LayoutParams1);
                zem zem2 = zpk0.a;
                aabu.g(zem2, fadeInImageView2, (grwq0.b & 8) != 0, (grwq0.h == null ? grwe.a : grwq0.h));
                FadeInImageView fadeInImageView3 = (FadeInImageView)view2.findViewById(0x7F0B1F6A);  // id:secondary_icon
                fadeInImageView3.setLayoutParams(linearLayout$LayoutParams1);
                fadeInImageView3.setVisibility(0);
                aabu.g(zem2, fadeInImageView3, (grwq0.b & 16) != 0, (grwq0.i == null ? grwe.a : grwq0.i));
                aabu.g(zem2, ((FadeInImageView)view2.findViewById(0x7F0B16E3)), 1 == (grwq0.b & 1), (grwq0.c == null ? grwe.a : grwq0.c));  // id:image
                LinearLayout linearLayout1 = (LinearLayout)view2.findViewById(0x7F0B0FD4);  // id:content
                if(grwq0.k.size() > 0) {
                    aabu.d(zem2, linearLayout1, grwq0.k);
                }
                else {
                    if((grwq0.b & 2) != 0) {
                        TextView textView2 = new TextView(context1);
                        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        aabu.s(textView2, 2);
                        aabu.k(textView2, grwq0.d);
                        linearLayout1.addView(textView2);
                    }
                    if(grwq0.e.size() > 0) {
                        LinearLayout linearLayout2 = new LinearLayout(context1);
                        linearLayout2.setOrientation(1);
                        for(Object object0: grwq0.e) {
                            TextView textView3 = new TextView(context1);
                            textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            aabu.s(textView3, 3);
                            aabu.k(textView3, ((String)object0));
                            linearLayout2.addView(textView3);
                        }
                        linearLayout1.addView(linearLayout2);
                    }
                    if(grwq0.f.size() > 0) {
                        LinearLayout linearLayout3 = new LinearLayout(context1);
                        linearLayout3.setOrientation(1);
                        for(Object object1: grwq0.f) {
                            TextView textView4 = new TextView(context1);
                            textView4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            aabu.s(textView4, 4);
                            aabu.k(textView4, ((String)object1));
                            linearLayout3.addView(textView4);
                        }
                        linearLayout1.addView(linearLayout3);
                    }
                    if((grwq0.b & 4) != 0) {
                        View view3 = LayoutInflater.from(context1).inflate(0x7F0E00CB, linearLayout0, false);  // layout:as_card_special_desc
                        grzc grzc0 = grwq0.g == null ? grzc.a : grwq0.g;
                        TextView textView5 = (TextView)view3.findViewById(0x7F0B2259);  // id:text
                        String s = grzc0.c;
                        if((grzc0.b & 4) == 0) {
                            hjie0 = null;
                        }
                        else {
                            hjie0 = grzc0.e;
                            if(hjie0 == null) {
                                hjie0 = hjie.a;
                            }
                        }
                        if((grzc0.b & 8) == 0) {
                            gsad0 = null;
                        }
                        else {
                            gsad0 = grzc0.f;
                            if(gsad0 == null) {
                                gsad0 = gsad.a;
                            }
                        }
                        aabu.m(textView5, s, ccht.a(hjie0, gsad0));
                        FadeInImageView fadeInImageView4 = (FadeInImageView)view3.findViewById(0x7F0B16E3);  // id:image
                        if((grzc0.b & 2) != 0) {
                            z = true;
                        }
                        aabu.g(zem2, fadeInImageView4, z, (grzc0.d == null ? grwe.a : grzc0.d));
                        linearLayout1.addView(view3);
                    }
                    aabu.e(linearLayout1, context1.getResources().getDimensionPixelOffset(0x7F0701D8));  // dimen:as_styled_text_entry_vertical_margin
                }
                view2.setFocusable(true);
                return view2;
            }
            case 6: {
                grvh0 = (grvh)gruw0.d;
                break;
            }
            default: {
                grvh0 = grvh.a;
            }
        }
        if(grvh0.b.size() != 0) {
            zpe zpe0 = this.L;
            grvh grvh1 = gruw0.c == 6 ? ((grvh)gruw0.d) : grvh.a;
            LinearLayout linearLayout4 = this.t;
            Context context2 = linearLayout4.getContext();
            View view4 = LayoutInflater.from(context2).inflate(0x7F0E00BC, linearLayout4, false);  // layout:as_card_carousel_block
            int v2 = grvh1.c;
            int v3 = context2.getResources().getDimensionPixelSize(0x7F0701E2);  // dimen:as_vertical_carousel_item_min_width
            int v4 = context2.getResources().getDimensionPixelSize(0x7F070185);  // dimen:as_carousel_item_padding
            int v5 = 0;
            int v6 = 0;
            for(Object object2: grvh1.b) {
                grvi grvi0 = (grvi)object2;
                if((grvi0.b & 1) != 0) {
                    v6 = Math.max(v6, (grvi0.c == null ? grwe.a : grvi0.c).g);
                    v5 = Math.max(v5, (grvi0.c == null ? grwe.a : grvi0.c).f);
                }
            }
            int v7 = aabu.b(v5, context2);
            int v8 = aabu.b(v6, context2);
            LinearLayout linearLayout5 = (LinearLayout)view4.findViewById(0x7F0B0E5B);  // id:carousel
            HorizontalScrollView horizontalScrollView0 = (HorizontalScrollView)view4.findViewById(0x7F0B0E5C);  // id:carouselScrollView
            int v9 = 0;
            while(v9 < grvh1.b.size()) {
                grvi grvi1 = (grvi)grvh1.b.get(v9);
                View view5 = LayoutInflater.from(context2).inflate((v2 == 2 ? 0x7F0E00C1 : 0x7F0E00BD), linearLayout5, false);  // layout:as_card_horizontal_carousel_item
                CardView cardView0 = (CardView)view5.findViewById(0x7F0B0E29);  // id:card_view
                if(grvi1.i) {
                    cardView0.f(4.0f);
                    cchs.i(cardView0, 3);
                }
                else {
                    cardView0.f(0.0f);
                    cchs.i(cardView0, 1);
                }
                int v10 = grvh1.c == 1 ? 1 : 0;
                int v11 = aabu.b(grvh1.e, context2);
                if(v11 > 0 && v10 != 0) {
                    v12 = v10;
                    LinearLayout.LayoutParams linearLayout$LayoutParams2 = (LinearLayout.LayoutParams)cardView0.getLayoutParams();
                    linearLayout$LayoutParams2.width = v11;
                    cardView0.setLayoutParams(linearLayout$LayoutParams2);
                }
                else {
                    v12 = v10;
                    v11 = v3;
                }
                int v13 = grvh1.d;
                boolean z1 = v13 == 2;
                LinearLayout linearLayout6 = (LinearLayout)view5.findViewById(0x7F0B0FD4);  // id:content
                linearLayout6.setHorizontalGravity((v13 == 2 ? 17 : 0x800003));
                if(grvi1.j.size() > 0) {
                    aabu.d(zpe0.b, linearLayout6, grvi1.j);
                    for(int v14 = 0; v14 < linearLayout6.getChildCount(); ++v14) {
                        zpe.a(((TextView)linearLayout6.getChildAt(v14).findViewById(0x7F0B2259)), z1);  // id:text
                    }
                    grvh2 = grvh1;
                    linearLayout7 = linearLayout5;
                    horizontalScrollView1 = horizontalScrollView0;
                }
                else if(zpe.b(grvi1)) {
                    linearLayout6.setVisibility(8);
                    grvh2 = grvh1;
                    linearLayout7 = linearLayout5;
                    horizontalScrollView1 = horizontalScrollView0;
                }
                else {
                    boolean z2 = grvh1.d == 2;
                    if((grvi1.b & 2) == 0) {
                        horizontalScrollView1 = horizontalScrollView0;
                    }
                    else {
                        TextView textView6 = new TextView(linearLayout6.getContext());
                        horizontalScrollView1 = horizontalScrollView0;
                        textView6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        aabu.s(textView6, 2);
                        aabu.k(textView6, grvi1.d);
                        linearLayout6.addView(textView6);
                        zpe.a(textView6, z2);
                    }
                    if(grvi1.e.size() > 0) {
                        LinearLayout linearLayout8 = new LinearLayout(context2);
                        linearLayout8.setOrientation(1);
                        Iterator iterator3 = grvi1.e.iterator();
                        while(iterator3.hasNext()) {
                            Object object3 = iterator3.next();
                            TextView textView7 = new TextView(context2);
                            textView7.setTextAppearance(0x7F160071);  // style:AsStyledTextAppearanceTitle
                            textView7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            zpe.a(textView7, z2);
                            aabu.k(textView7, ((String)object3));
                            linearLayout8.addView(textView7);
                            iterator3 = iterator3;
                            grvh1 = grvh1;
                            linearLayout5 = linearLayout5;
                        }
                        grvh2 = grvh1;
                        linearLayout7 = linearLayout5;
                        linearLayout6.addView(linearLayout8);
                    }
                    else {
                        grvh2 = grvh1;
                        linearLayout7 = linearLayout5;
                    }
                    if(grvi1.f.size() > 0) {
                        LinearLayout linearLayout9 = new LinearLayout(context2);
                        linearLayout9.setOrientation(1);
                        for(Iterator iterator4 = grvi1.f.iterator(); iterator4.hasNext(); iterator4 = iterator4) {
                            Object object4 = iterator4.next();
                            TextView textView8 = new TextView(context2);
                            textView8.setTextAppearance(0x7F16006E);  // style:AsStyledTextAppearanceDescription
                            textView8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            zpe.a(textView8, z2);
                            if((grvi1.b & 8) == 0) {
                                hjie2 = null;
                            }
                            else {
                                hjie hjie1 = grvi1.h;
                                hjie2 = hjie1 == null ? hjie.a : hjie1;
                            }
                            aabu.m(textView8, ((String)object4), hjie2);
                            linearLayout9.addView(textView8);
                        }
                        linearLayout6.addView(linearLayout9);
                    }
                    if((grvi1.b & 4) != 0) {
                        View view6 = LayoutInflater.from(context2).inflate(0x7F0E00CB, linearLayout6, false);  // layout:as_card_special_desc
                        grzc grzc1 = grvi1.g == null ? grzc.a : grvi1.g;
                        TextView textView9 = (TextView)view6.findViewById(0x7F0B2259);  // id:text
                        String s1 = grzc1.c;
                        if((grzc1.b & 4) == 0) {
                            hjie4 = null;
                        }
                        else {
                            hjie hjie3 = grzc1.e;
                            hjie4 = hjie3 == null ? hjie.a : hjie3;
                        }
                        if((grzc1.b & 8) == 0) {
                            gsad2 = null;
                        }
                        else {
                            gsad gsad1 = grzc1.f;
                            gsad2 = gsad1 == null ? gsad.a : gsad1;
                        }
                        aabu.m(textView9, s1, ccht.a(hjie4, gsad2));
                        FadeInImageView fadeInImageView5 = (FadeInImageView)view6.findViewById(0x7F0B16E3);  // id:image
                        aabu.g(zpe0.b, fadeInImageView5, (grzc1.b & 2) != 0, (grzc1.d == null ? grwe.a : grzc1.d));
                        LinearLayout linearLayout10 = (LinearLayout)view6.findViewById(0x7F0B2090);  // id:special_desc
                        if(z2) {
                            linearLayout10.setGravity(17);
                        }
                        else {
                            linearLayout10.setGravity(0x800003);
                        }
                        linearLayout6.addView(view6);
                    }
                    aabu.e(linearLayout6, context2.getResources().getDimensionPixelSize(0x7F0701D8));  // dimen:as_styled_text_entry_vertical_margin
                }
                FrameLayout frameLayout0 = (FrameLayout)view5.findViewById(0x7F0B16EB);  // id:image_frame
                if((grvi1.b & 1) == 0) {
                    frameLayout0.setVisibility(8);
                }
                else {
                    LinearLayout.LayoutParams linearLayout$LayoutParams3 = (LinearLayout.LayoutParams)frameLayout0.getLayoutParams();
                    int v15 = v11 - (v4 + v4);
                    linearLayout$LayoutParams3.width = Math.min(v7, v15);
                    linearLayout$LayoutParams3.height = (int)(((float)v8) * (((float)linearLayout$LayoutParams3.width) / ((float)v7)));
                    if(zpe.b(grvi1)) {
                        linearLayout$LayoutParams3.setMargins(0, 0, 0, 0);
                    }
                    frameLayout0.post(new zpa(frameLayout0, linearLayout$LayoutParams3));
                    frameLayout0.setVisibility(0);
                    if(v12 == 0) {
                        FadeInImageView fadeInImageView7 = (FadeInImageView)view5.findViewById(0x7F0B16E3);  // id:image
                        aabu.g(zpe0.b, fadeInImageView7, true, (grvi1.c == null ? grwe.a : grvi1.c));
                    }
                    else {
                        FadeInImageView fadeInImageView6 = (FadeInImageView)view5.findViewById(0x7F0B16E3);  // id:image
                        aabu.h(zpe0.b, fadeInImageView6, true, (grvi1.c == null ? grwe.a : grvi1.c), v15);
                    }
                }
                View view7 = cardView0.findViewById(0x7F0B2246);  // id:tappable_view
                grwp grwp0 = grvi1.k == null ? grwp.a : grvi1.k;
                int v16 = cchs.c(context2, 0x7F040120, 0x7F080210);  // attr:asCarouselRoundedRipple
                aabu.j(view7, grwp0, zpe0.a, v16);
                if(!zhz.c((grvi1.k == null ? grwp.a : grvi1.k))) {
                    cardView0.setClickable(false);
                    cardView0.setOnClickListener(new zpb(linearLayout4));
                }
                linearLayout5 = linearLayout7;
                linearLayout5.addView(view5);
                ++v9;
                v3 = v3;
                v4 = v4;
                v2 = v2;
                horizontalScrollView0 = horizontalScrollView1;
                view4 = view4;
                grvh1 = grvh2;
            }
            if(zhz.c((grvh1.g == null ? grwp.a : grvh1.g))) {
                View view8 = LayoutInflater.from(context2).inflate(0x7F0E00BE, linearLayout5, false);  // layout:as_card_carousel_view_all
                TextView textView10 = (TextView)view8.findViewById(0x7F0B2259);  // id:text
                aabu.k(textView10, grvh1.f);
                View view9 = view8.findViewById(0x7F0B0D7D);  // id:button
                aabu.i(view9, (grvh1.g == null ? grwp.a : grvh1.g), zpe0.a);
                textView10.setImportantForAccessibility(2);
                view9.setContentDescription(grvh1.f);
                if(cchl.d()) {
                    view9.setBackgroundTintList(cchs.e(jxm.f(cchs.h(3), cchs.a(context2, 0x1010031, 0x7F060814))));  // color:google_white
                }
                linearLayout5.addView(view8);
            }
            int v17 = context2.getResources().getDimensionPixelSize(0x7F070183);  // dimen:as_carousel_children_spacing
            int v18 = linearLayout5.getChildCount();
            for(int v19 = 0; v19 < v18 - 1; ++v19) {
                View view10 = linearLayout5.getChildAt(v19);
                if(view10 != null && view10.getVisibility() != 8) {
                    LinearLayout.LayoutParams linearLayout$LayoutParams4 = (LinearLayout.LayoutParams)view10.getLayoutParams();
                    if(aabu.r(linearLayout5.getContext())) {
                        linearLayout$LayoutParams4.leftMargin = v17;
                    }
                    else {
                        linearLayout$LayoutParams4.rightMargin = v17;
                    }
                    view10.setLayoutParams(linearLayout$LayoutParams4);
                }
            }
            horizontalScrollView0.addOnLayoutChangeListener(new zpd(zpe0, horizontalScrollView0, context2, linearLayout5));
            if(!this.I) {
                return ((grvi)(gruw0.c == 6 ? ((grvh)gruw0.d) : grvh.a).b.get(0)).i ? view4 : this.J(view4);
            }
            return view4;
        }
        int v20 = gruw0.c;
        if(v20 == 9) {
            View view11 = this.a;
            gruh gruh0 = (gruh)gruw0.d;
            Context context3 = this.t.getContext();
            View view12 = LayoutInflater.from(context3).inflate(0x7F0E00BA, this.t, false);  // layout:as_card_action_chips_block
            zox zox0 = new zox(context3, view11, gruh0.b, this.J.a, this.t, this.J.b, this.J.c);
            RecyclerView recyclerView0 = (RecyclerView)view12.findViewById(0x7F0B1690);  // id:horizontal_list
            LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(0, false);
            recyclerView0.A(new aaew(context3.getResources().getDimensionPixelSize(0x7F07015A)));  // dimen:as_action_chip_carousel_padding
            recyclerView0.setNestedScrollingEnabled(false);
            recyclerView0.ap(linearLayoutManager0);
            recyclerView0.suppressLayout(false);
            recyclerView0.aF(zox0, true);
            recyclerView0.ae(true);
            recyclerView0.requestLayout();
            return this.I ? view12 : this.J(view12);
        }
        switch(v20) {
            case 8: {
                gruk gruk0 = (gruk)gruw0.d;
                View view13 = LayoutInflater.from(this.t.getContext()).inflate(0x7F0E00BB, this.t, false);  // layout:as_card_action_line_block
                aabu.k(((TextView)view13.findViewById(0x7F0B1813)), gruk0.c);  // id:link_text
                FadeInImageView fadeInImageView8 = (FadeInImageView)view13.findViewById(0x7F0B16B9);  // id:icon
                aabu.g(this.K.a, fadeInImageView8, (gruk0.b & 2) != 0, (gruk0.d == null ? grwe.a : gruk0.d));
                return view13;
            }
            case 10: {
                zpn zpn0 = this.P;
                View view14 = this.a;
                grxf grxf0 = (grxf)gruw0.d;
                Context context4 = this.t.getContext();
                View view15 = LayoutInflater.from(context4).inflate(0x7F0E00C6, this.t, false);  // layout:as_card_profile_picture_block
                LinearLayout linearLayout11 = (LinearLayout)view15.findViewById(0x7F0B2270);  // id:text_content
                if(grxf0.e.size() > 0) {
                    aabu.d(zpn0.b, linearLayout11, grxf0.e);
                }
                else {
                    if(!grxf0.b.isEmpty()) {
                        TextView textView11 = new TextView(context4);
                        textView11.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        aabu.s(textView11, 2);
                        aabu.k(textView11, grxf0.b);
                        linearLayout11.addView(textView11);
                    }
                    if(!grxf0.c.isEmpty()) {
                        TextView textView12 = new TextView(context4);
                        textView12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        aabu.s(textView12, 3);
                        aabu.k(textView12, grxf0.c);
                        linearLayout11.addView(textView12);
                    }
                    if(!grxf0.d.isEmpty()) {
                        TextView textView13 = new TextView(context4);
                        textView13.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        aabu.s(textView13, 4);
                        aabu.k(textView13, grxf0.d);
                        linearLayout11.addView(textView13);
                    }
                    aabu.e(linearLayout11, context4.getResources().getDimensionPixelOffset(0x7F0701D8));  // dimen:as_styled_text_entry_vertical_margin
                }
                AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)view15.findViewById(0x7F0B0C3C);  // id:avatar_particle_disc
                zpn0.c.a(accountParticleDisc0, false).a(gfsx.l(aatc0));
                if(zhz.c((grxf0.f == null ? grwp.a : grxf0.f))) {
                    if(hoju.p()) {
                        grwp grwp1 = grxf0.f;
                        if(((grwp1 == null ? grwp.a : grwp1).b & 4) != 0) {
                            aauk aauk0 = zpn0.d;
                            if(grwp1 == null) {
                                grwp1 = grwp.a;
                            }
                            aauk0.b(accountParticleDisc0, view14, (grwp1.e == null ? grwb.a : grwp1.e));
                        }
                    }
                    accountParticleDisc0.setClickable(true);
                    accountParticleDisc0.setFocusable(true);
                    accountParticleDisc0.setContentDescription(grxf0.g);
                }
                grwp grwp2 = grxf0.f == null ? grwp.a : grxf0.f;
                aacf aacf0 = hoju.p() ? new zpm(zpn0, accountParticleDisc0) : zpn0.a;
                aabu.i(accountParticleDisc0, grwp2, aacf0);
                return view15;
            }
            case 12: {
                grxi grxi0 = (grxi)gruw0.d;
                View view16 = LayoutInflater.from(this.t.getContext()).inflate(0x7F0E00C7, this.t, false);  // layout:as_card_progress_bar_block
                grxh grxh0 = grxi0.b == null ? grxh.a : grxi0.b;
                TextView textView14 = (TextView)view16.findViewById(0x7F0B17A6);  // id:label
                FadeInImageView fadeInImageView9 = (FadeInImageView)view16.findViewById(0x7F0B17A8);  // id:label_icon
                aabu.o(textView14, ((ProgressBar)view16.findViewById(0x7F0B1D35)), fadeInImageView9, this.R.a, grxh0);  // id:progress_bar
                return view16;
            }
            case 16: {
                Drawable drawable0 = cchs.f(this.w, 0x7F04011E);  // attr:asCardLegendBackground
                this.z.setBackgroundDrawable(drawable0);
                zpi zpi0 = this.N;
                grwn grwn0 = gruw0.c == 16 ? ((grwn)gruw0.d) : grwn.a;
                LinearLayout linearLayout12 = this.t;
                Context context5 = linearLayout12.getContext();
                View view17 = LayoutInflater.from(context5).inflate(0x7F0E00C3, linearLayout12, false);  // layout:as_card_legend_block
                LinearLayout linearLayout13 = (LinearLayout)view17.findViewById(0x7F0B0FD4);  // id:content
                if(grwn0.b.size() > 0) {
                    for(Object object5: grwn0.b) {
                        View view18 = LayoutInflater.from(context5).inflate(0x7F0E00C4, linearLayout12, false);  // layout:as_card_legend_item
                        zem zem3 = zpi0.a;
                        FadeInImageView fadeInImageView10 = (FadeInImageView)view18.findViewById(0x7F0B16E3);  // id:image
                        int v21 = ((grwo)object5).b & 1;
                        grwe grwe1 = ((grwo)object5).c;
                        if(grwe1 == null) {
                            grwe1 = grwe.a;
                        }
                        aabu.g(zem3, fadeInImageView10, 1 == v21, grwe1);
                        aabu.s(((TextView)view18.findViewById(0x7F0B17A6)), 6);  // id:label
                        aabu.k(((TextView)view18.findViewById(0x7F0B17A6)), ((grwo)object5).d);  // id:label
                        linearLayout13.addView(view18);
                    }
                }
                if(this.I) {
                    ztf.a(this.x, 1);
                    ztf.a(this.x, 2);
                    this.y.setPadding(this.D, 0, this.D, 0);
                    linearLayout12.setPadding(this.E, this.E, this.E, this.E);
                }
                return view17;
            }
            case 21: {
                grxj grxj0 = (grxj)gruw0.d;
                View view19 = LayoutInflater.from(this.t.getContext()).inflate(0x7F0E00C8, this.t, false);  // layout:as_card_progress_bar_list_item_block
                grxh grxh1 = grxj0.e == null ? grxh.a : grxj0.e;
                aabu.k(((TextView)view19.findViewById(0x7F0B22B8)), grxj0.d);  // id:title
                FadeInImageView fadeInImageView11 = (FadeInImageView)view19.findViewById(0x7F0B16E3);  // id:image
                zem zem4 = this.Q.a;
                boolean z3 = true;
                aabu.g(zem4, fadeInImageView11, 1 == (grxj0.b & 1), (grxj0.c == null ? grwe.a : grxj0.c));
                FadeInImageView fadeInImageView12 = (FadeInImageView)view19.findViewById(0x7F0B16B9);  // id:icon
                if((grxj0.b & 8) == 0) {
                    z3 = false;
                }
                aabu.g(zem4, fadeInImageView12, z3, (grxj0.f == null ? grwe.a : grxj0.f));
                TextView textView15 = (TextView)view19.findViewById(0x7F0B17A6);  // id:label
                FadeInImageView fadeInImageView13 = (FadeInImageView)view19.findViewById(0x7F0B17A8);  // id:label_icon
                aabu.o(textView15, ((ProgressBar)view19.findViewById(0x7F0B1D35)), fadeInImageView13, zem4, grxh1);  // id:progress_bar
                return view19;
            }
            default: {
                return null;
            }
        }
    }

    private final View J(View view0) {
        View view1 = new LinearLayout(this.w);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        int v = -this.D;
        linearLayout$LayoutParams0.setMargins(v, 0, v, 0);
        ((LinearLayout)view1).setLayoutParams(linearLayout$LayoutParams0);
        ((LinearLayout)view1).setPadding(this.D, 0, this.D, 0);
        ((LinearLayout)view1).addView(view0);
        return view1;
    }

    private final void K(View view0, int v, grzs grzs0) {
        gruw gruw0 = (gruw)grzs0.c.get(v);
        int v1 = grzs0.c.size() - 1;
        int v2 = 0;
        int v3 = this.H(gruw0, v - 1, v == 0, grzs0);
        int v4 = this.H(gruw0, v + 1, v == v1, grzs0);
        if(this.I && gruw0.c != 16) {
            v2 = this.D;
        }
        view0.setPadding(view0.getPaddingLeft() + v2, view0.getPaddingTop() + v3, view0.getPaddingRight() + v2, view0.getPaddingBottom() + v4);
    }

    private final void L() {
        if(hoju.p()) {
            this.v.e(this.a);
        }
    }
}

