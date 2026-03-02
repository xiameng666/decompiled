import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.tapandpay.ui.card.WalletCard;
import com.google.android.libraries.tapandpay.ui.card.credit.CardCredit;
import com.google.android.libraries.tapandpay.ui.card.untokenized.CardUntokenized;
import j..util.Objects;

public final class dnbr extends uq {
    private final CardUntokenized A;
    private final CardCredit B;
    public final WalletCard t;
    public final WalletCard u;
    public dxev v;
    public boolean w;
    final dnbs x;
    private final View y;
    private final View z;

    public dnbr(dnbs dnbs0, View view0) {
        ibuq.f(view0, "view");
        this.x = dnbs0;
        super(view0);
        View view1 = view0.findViewById(0x7F0B0221);  // id:ContainerView
        ibuq.e(view1, "findViewById(...)");
        this.y = view1;
        View view2 = view0.findViewById(0x7F0B03EC);  // id:FopCardArt
        ibuq.e(view2, "findViewById(...)");
        CardView cardView0 = (CardView)view2;
        View view3 = view0.findViewById(0x7F0B016A);  // id:CardImage
        ibuq.e(view3, "findViewById(...)");
        ImageView imageView0 = (ImageView)view3;
        View view4 = view0.findViewById(0x7F0B00DB);  // id:BasicCardArtView
        ibuq.e(view4, "findViewById(...)");
        this.z = view4;
        View view5 = view0.findViewById(0x7F0B08C5);  // id:TitleText
        ibuq.e(view5, "findViewById(...)");
        TextView textView0 = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B084F);  // id:SubTitleText
        ibuq.e(view6, "findViewById(...)");
        TextView textView1 = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B0549);  // id:Logo
        ibuq.e(view7, "findViewById(...)");
        ImageView imageView1 = (ImageView)view7;
        View view8 = view0.findViewById(0x7F0B00DC);  // id:BasicCardComponent
        ibuq.e(view8, "findViewById(...)");
        this.A = (CardUntokenized)view8;
        View view9 = view0.findViewById(0x7F0B00DD);  // id:BasicWalletCard
        ibuq.e(view9, "findViewById(...)");
        this.t = (WalletCard)view9;
        View view10 = view0.findViewById(0x7F0B03ED);  // id:FopCardComponent
        ibuq.e(view10, "findViewById(...)");
        this.B = (CardCredit)view10;
        View view11 = view0.findViewById(0x7F0B03FC);  // id:FopWalletCard
        ibuq.e(view11, "findViewById(...)");
        this.u = (WalletCard)view11;
    }

    public final void D(dxev dxev0) {
        dnbs dnbs0 = this.x;
        dnbs0.j = false;
        dmew dmew0 = dmev.d(dxev0);
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        float f = 1.0f;
        if(((hkhr0.q == null ? hkhh.a : hkhr0.q).b & 2) != 0) {
            hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh0 = hkhr1.q == null ? hkhh.a : hkhr1.q;
            hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
            ibuq.e(hkir0, "getTokenData(...)");
            if((hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) != hkiq.d) {
                f = 0.5f;
            }
            else if(dnbs0.i.a && dnpx.r(dxev0) && (dnbs0.h.a() != 3 || !(dxev0.d == null ? dxet.a : dxev0.d).c)) {
                f = 0.5f;
            }
        }
        this.y.setAlpha(f);
        if(hwgz.a.b().m()) {
            fsan fsan0 = fsam.a(dxev0);
            if(fsan0 == null) {
                hkhr hkhr2 = dxev0.c;
                hkhr hkhr3 = hkhr2 == null ? hkhr.b : hkhr2;
                if((hkhm.b(hkhr3.f) == null ? hkhm.k : hkhm.b(hkhr3.f)) == hkhm.b) {
                    if(hkhr2 == null) {
                        hkhr2 = hkhr.b;
                    }
                    ibuq.e(hkhr2, "getPaymentMethod(...)");
                    this.z.setVisibility(8);
                    this.A.setVisibility(8);
                    this.t.setVisibility(0);
                    fryh fryh0 = new fryh(0x7F0809D4);  // drawable:pay_fop_detail_platform_fop_card_background
                    String s = hkhr2.l;
                    ibuq.e(s, "getLogoFifeUrl(...)");
                    fryj fryj0 = new fryj(s, null, null, null, 14);
                    String s1 = hkhr2.i;
                    ibuq.e(s1, "getDefaultTitle(...)");
                    String s2 = edkt.a(s1);
                    String s3 = hkhr2.i;
                    ibuq.e(s3, "getDefaultTitle(...)");
                    String s4 = dnbr.E(s3);
                    String s5 = hkhr2.j;
                    ibuq.e(s5, "getSubTitle(...)");
                    fujl fujl0 = new fujl(fryh0, new fuif(new fryu(s4), new fryu(s5), fryj0, 10), new fryu(s2), null, false, null, false, 0xF8);
                    this.t.g(fujl0);
                }
                else {
                    if(hkhr2 == null) {
                        hkhr2 = hkhr.b;
                    }
                    ibuq.e(hkhr2, "getPaymentMethod(...)");
                    this.z.setVisibility(8);
                    this.A.setVisibility(8);
                    WalletCard walletCard0 = this.t;
                    walletCard0.setVisibility(0);
                    fryh fryh1 = new fryh(0x7F0809D4);  // drawable:pay_fop_detail_platform_fop_card_background
                    String s6 = hkhr2.l;
                    ibuq.e(s6, "getLogoFifeUrl(...)");
                    fryj fryj1 = new fryj(s6, null, null, null, 14);
                    if(hwtu.g() && (hkhm.b(hkhr2.f) == null ? hkhm.k : hkhm.b(hkhr2.f)) == hkhm.g) {
                        walletCard0.g(new fujl(fryh1, new fuif(null, null, fryj1, 15), null, null, false, null, false, 0xFC));
                    }
                    else if(hwev.c() && (hkhm.b(hkhr2.f) == null ? hkhm.k : hkhm.b(hkhr2.f)) == hkhm.d) {
                        String s7 = hkhr2.i;
                        ibuq.e(s7, "getDefaultTitle(...)");
                        String s8 = edkt.a(s7);
                        fryh fryh2 = new fryh(0);
                        frxo frxo0 = new frxo(0x7F040332);  // attr:colorSurface
                        walletCard0.g(new fujl(fryh2, new fuhz(fryj1), new fryu(s8), frxo0, false, null, true, 0x70));
                    }
                    else {
                        String s9 = (hkhm.b(hkhr2.f) == null ? hkhm.k : hkhm.b(hkhr2.f)) == hkhm.d ? hkhr2.h : hkhr2.i;
                        ibuq.c(s9);
                        String s10 = hkhr2.i;
                        ibuq.e(s10, "getDefaultTitle(...)");
                        String s11 = edkt.a(s10);
                        String s12 = hkhr2.j;
                        ibuq.e(s12, "getSubTitle(...)");
                        walletCard0.g(new fujl(fryh1, new fuif(new fryu(s9), new fryu(s12), fryj1, 10), new fryu(s11), null, false, null, false, 0xF8));
                    }
                }
                this.u.setVisibility(8);
                return;
            }
            this.t.setVisibility(8);
            this.u.setVisibility(0);
            dnbs0.f.h(fsan0, this.u);
            return;
        }
        if(dmew0 == null) {
            CardUntokenized cardUntokenized0 = this.A;
            pcb pcb0 = pcb.b(cardUntokenized0.getResources(), 0x7F0809D4, cardUntokenized0.getContext().getTheme());  // drawable:pay_fop_detail_platform_fop_card_background
            hkhr hkhr4 = dxev0.c;
            hkhr hkhr5 = hkhr4 == null ? hkhr.b : hkhr4;
            if((hkhm.b(hkhr5.f) == null ? hkhm.k : hkhm.b(hkhr5.f)) == hkhm.b) {
                if(hkhr4 == null) {
                    hkhr4 = hkhr.b;
                }
                ibuq.e(hkhr4, "getPaymentMethod(...)");
                this.z.setVisibility(8);
                this.t.setVisibility(8);
                cardUntokenized0.k(pcb0);
                String s13 = hkhr4.i;
                ibuq.e(s13, "getDefaultTitle(...)");
                cardUntokenized0.n(dnbr.E(s13));
                String s14 = hkhr4.j;
                ibuq.e(s14, "getSubTitle(...)");
                cardUntokenized0.m(s14);
                cardUntokenized0.setVisibility(0);
                String s15 = hkhr4.i;
                ibuq.e(s15, "getDefaultTitle(...)");
                cardUntokenized0.setContentDescription(edkt.a(s15));
                ((txx)dnbs0.g.h(hkhr4.l).s(udf.a)).a(new dnbo()).p(new dnbp(cardUntokenized0, cardUntokenized0));
            }
            else {
                if(hkhr4 == null) {
                    hkhr4 = hkhr.b;
                }
                ibuq.e(hkhr4, "getPaymentMethod(...)");
                this.z.setVisibility(8);
                this.t.setVisibility(8);
                cardUntokenized0.k(pcb0);
                if(hwtu.g() && (hkhm.b(hkhr4.f) == null ? hkhm.k : hkhm.b(hkhr4.f)) == hkhm.g) {
                    cardUntokenized0.g.setVisibility(8);
                    cardUntokenized0.h.setVisibility(8);
                }
                else {
                    String s16 = (hkhm.b(hkhr4.f) == null ? hkhm.k : hkhm.b(hkhr4.f)) == hkhm.d ? hkhr4.h : hkhr4.i;
                    ibuq.c(s16);
                    cardUntokenized0.n(s16);
                    String s17 = hkhr4.i;
                    ibuq.e(s17, "getDefaultTitle(...)");
                    cardUntokenized0.setContentDescription(edkt.a(s17));
                    String s18 = hkhr4.j;
                    ibuq.e(s18, "getSubTitle(...)");
                    cardUntokenized0.m(s18);
                }
                cardUntokenized0.setVisibility(0);
                ((txx)dnbs0.g.h(hkhr4.l).s(udf.a)).a(new dnbm()).p(new dnbn(cardUntokenized0, cardUntokenized0));
            }
            this.B.setVisibility(8);
            return;
        }
        this.A.setVisibility(8);
        CardCredit cardCredit0 = this.B;
        cardCredit0.setVisibility(0);
        dmet dmet0 = dnbs0.f;
        dnbq dnbq0 = new dnbq(dnbs0);
        Drawable drawable0 = cardCredit0.g.getDrawable();
        if((drawable0 instanceof fsap) && String.valueOf(Objects.hash(new Object[]{dmew0, 0})).equals(((fsap)drawable0).j) && (TextUtils.isEmpty(dmet.c(dmew0)) || ((fsap)drawable0).c() != null)) {
            return;
        }
        Context context0 = dmet0.b;
        fsap fsap0 = new fsap(context0);
        fsap0.r();
        fsap0.j = String.valueOf(Objects.hash(new Object[]{dmew0, 0}));
        fsap0.i(dmew0.a);
        fsap0.n(dmew0.c);
        fsap0.p(dmew0.d);
        fsap0.k(dmew0.e);
        fsap0.j(dmew0.g);
        int v = dmew0.f;
        fsap0.o(v);
        fsap0.q();
        if((cardCredit0 instanceof CardCredit)) {
            cardCredit0.j(dmew0.b);
            cardCredit0.h.setTextColor(v);
            fsap0.h = dmew0.b;
        }
        else {
            fsap0.l(dmew0.b);
        }
        String s19 = dmet.c(dmew0);
        if(!TextUtils.isEmpty(s19)) {
            dmep dmep0 = new dmep(dmet0, dmet0.a(s19), s19);
            dmeq dmeq0 = new dmeq(dnbq0, fsap0, cardCredit0);
            dmer dmer0 = new dmer(dnbq0, cardCredit0, fsap0);
            donb.a(context0, dmet0.d, dmep0, dmeq0, dmer0);
            return;
        }
        dmet.k(cardCredit0, fsap0);
    }

    private static final String E(String s) {
        if(!dnbs.e.matcher(s).matches()) {
            return s;
        }
        String s1 = dnbs.a.matcher(s).replaceAll("");
        ibuq.e(s1, "replaceAll(...)");
        return s1;
    }
}

