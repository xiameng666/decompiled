import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.pay.secard.view.template.SePrepaidCardLoadingScreenTemplate;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.card.WalletCard;

public final class eaeo implements icih {
    final eaeu a;

    public eaeo(eaeu eaeu0) {
        this.a = eaeu0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        eaeu eaeu0 = this.a;
        eagu eagu0 = null;
        if((((eafe)object0) instanceof eaex)) {
            View view0 = eaeu0.requireView();
            View view1 = view0.findViewById(0x7F0B0540);  // id:LoadingScreen
            ibuq.e(view1, "findViewById(...)");
            view1.setVisibility(0);
            View view2 = view0.findViewById(0x7F0B06EF);  // id:ProvisionOptionsScreen
            ibuq.e(view2, "findViewById(...)");
            view2.setVisibility(8);
            if(!hwev.c()) {
                return ibom.a;
            }
            SePrepaidCardLoadingScreenTemplate sePrepaidCardLoadingScreenTemplate0 = (SePrepaidCardLoadingScreenTemplate)view0.findViewById(0x7F0B0540);  // id:LoadingScreen
            eagu eagu1 = eaeu0.al;
            if(eagu1 == null) {
                ibuq.j("provisionData");
            }
            else {
                eagu0 = eagu1;
            }
            dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
            ibuq.e(dyna0, "getServiceProvider(...)");
            sePrepaidCardLoadingScreenTemplate0.c(dyna0);
            return ibom.a;
        }
        if((((eafe)object0) instanceof eaev)) {
            eaeu0.M();
            eaeu0.G();
            View view3 = eaeu0.requireView().findViewById(0x7F0B016E);  // id:CardList
            ibuq.e(view3, "findViewById(...)");
            view3.setVisibility(0);
            eaeu0.K(((eaev)(((eafe)object0))).a);
            eaeu0.A().H(((eaev)(((eafe)object0))).b);
            eaeu.O(eaeu0, ((eaev)(((eafe)object0))).c);
            return ibom.a;
        }
        if((((eafe)object0) instanceof eaez)) {
            eaeu0.M();
            eaeu0.G();
            eaeu0.K(((eaez)(((eafe)object0))).a);
            if(hwev.c() && hwsd.L()) {
                View view4 = eaeu0.requireView().findViewById(0x7F0B059C);  // id:MfcCardOnboardAnimation
                ibuq.c(((LottieAnimationView)view4));
                ((LottieAnimationView)view4).setVisibility(0);
                ((LottieAnimationView)view4).l(((eaez)(((eafe)object0))).b);
                ImageView imageView0 = (ImageView)view4;
            }
            else {
                ImageView imageView1 = (ImageView)eaeu0.requireView().findViewById(0x7F0B059D);  // id:MfcCardOnboardImage
                ibuq.c(imageView1);
                imageView1.setVisibility(0);
                imageView1.setImageResource(((eaez)(((eafe)object0))).b);
                if(hwev.c()) {
                    Integer integer0 = imageView1.getContext().getResources().getDimensionPixelSize(0x7F070DED);  // dimen:pay_large_spacing
                    funy.f(imageView1, integer0, null, integer0, null, 10);
                    imageView1.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
            eaeu.O(eaeu0, ((eaez)(((eafe)object0))).c);
            return ibom.a;
        }
        if((((eafe)object0) instanceof eafa)) {
            eaeu0.M();
            eaeu0.G();
            View view5 = eaeu0.requireView();
            View view6 = view5.findViewById(0x7F0B05E1);  // id:NewCardRowPrimary
            ibuq.e(view6, "findViewById(...)");
            eaeu.N(eaeu0, view6, 168830);
            View view7 = view5.findViewById(0x7F0B0234);  // id:ConvertPlasticCardRowPrimary
            ibuq.e(view7, "findViewById(...)");
            eaeu.N(eaeu0, view7, 0x2937C);
            eaeu0.K(((eafa)(((eafe)object0))).a);
            boolean z = hwev.c();
            eaeu0.L(((eafa)(((eafe)object0))).b, 0x7F0B05E1, z);  // id:NewCardRowPrimary
            eaeu.P(eaeu0, ((eafa)(((eafe)object0))).c, 0x7F0B0234);  // id:ConvertPlasticCardRowPrimary
            return ibom.a;
        }
        if((((eafe)object0) instanceof eaew)) {
            eaeu0.M();
            eaeu0.H();
            View view8 = eaeu0.requireView().findViewById(0x7F0B016E);  // id:CardList
            ibuq.e(view8, "findViewById(...)");
            view8.setVisibility(0);
            eaeu0.K(((eaew)(((eafe)object0))).a);
            eaeu0.A().I(ibpo.b(((eaew)(((eafe)object0))).b));
            eaeu0.J(((eaew)(((eafe)object0))).c, gurm.l);
            return ibom.a;
        }
        if((((eafe)object0) instanceof eafc)) {
            eaeu0.M();
            eaeu0.H();
            eaeu0.K(((eafc)(((eafe)object0))).a);
            int v = ((eafc)(((eafe)object0))).b.intValue();
            WalletCard walletCard0 = (WalletCard)eaeu0.requireView().findViewById(0x7F0B099C);  // id:WalletCard
            ibuq.c(walletCard0);
            walletCard0.setVisibility(0);
            walletCard0.g(new fujl(new fryh(v), null, null, new frxq(hll.h), false, null, false, 0xF6));
            dzzl dzzl0 = ((eafc)(((eafe)object0))).c;
            eagu eagu2 = eaeu0.al;
            if(eagu2 == null) {
                ibuq.j("provisionData");
            }
            else {
                eagu0 = eagu2;
            }
            hfuo hfuo0 = eagu0.e;
            ibuq.e(hfuo0, "getCardsToBeTransferredList(...)");
            Object object1 = ibpo.R(hfuo0);
            ibuq.e(object1, "first(...)");
            eaeu0.J(dzzl0, dzau.h(((hkjm)object1)));
            return ibom.a;
        }
        if((((eafe)object0) instanceof eafd)) {
            eaeu0.M();
            eaeu0.H();
            View view9 = eaeu0.requireView().findViewById(0x7F0B016E);  // id:CardList
            ibuq.e(view9, "findViewById(...)");
            view9.setVisibility(0);
            eaeu0.K(((eafd)(((eafe)object0))).a);
            eaeu0.A().G(((eafd)(((eafe)object0))).b);
            dzzl dzzl1 = ((eafd)(((eafe)object0))).c;
            ComposeActionBar composeActionBar0 = (ComposeActionBar)eaeu0.requireView().findViewById(0x7F0B022E);  // id:ContinueActionBar
            ftuw ftuw0 = composeActionBar0.b();
            fryr fryr0 = new fryr(dzzl1.a);
            fryh fryh0 = dzzl1.c == 0 ? null : new fryh(dzzl1.c);
            int v1 = dzzl1.b;
            gurm gurm0 = dzau.h(((hkjm)ibpo.R(eaeu0.A().n())));
            eagu eagu3 = eaeu0.al;
            if(eagu3 == null) {
                ibuq.j("provisionData");
            }
            else {
                eagu0 = eagu3;
            }
            gged_interceptors gged0 = gged_interceptors.l(dzaw.i(gurm0, (dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c))));
            ibuq.e(gged0, "of(...)");
            composeActionBar0.d(ftuw.a(ftuw0, new ftts(fryr0, null, false, null, fryh0, null, v1, gged0, null, new eael(eaeu0, dzzl1), 302), null, false, ftvd.a, null, false, 0xF6));
            composeActionBar0.e(new fufz(eaeu0.E(), eaeu0.B()));
            ibuq.c(composeActionBar0);
            composeActionBar0.setVisibility(0);
            return ibom.a;
        }
        if((((eafe)object0) instanceof eafb)) {
            eaeu0.M();
            eaeu0.G();
            View view10 = eaeu0.requireView();
            View view11 = view10.findViewById(0x7F0B05E1);  // id:NewCardRowPrimary
            ibuq.e(view11, "findViewById(...)");
            eaeu.N(eaeu0, view11, 168830);
            View view12 = view10.findViewById(0x7F0B091E);  // id:TransferOrDownloadCardsRowPrimary
            ibuq.e(view12, "findViewById(...)");
            eaeu.N(eaeu0, view12, 203620);
            eaeu0.K(((eafb)(((eafe)object0))).a);
            boolean z1 = hwev.c();
            eaeu0.L(((eafb)(((eafe)object0))).b, 0x7F0B05E1, z1);  // id:NewCardRowPrimary
            eaeu.P(eaeu0, ((eafb)(((eafe)object0))).c, 0x7F0B091E);  // id:TransferOrDownloadCardsRowPrimary
            return ibom.a;
        }
        if(!(((eafe)object0) instanceof eaey)) {
            throw new ibnq();
        }
        eaeu0.startActivity(dlnf.ab(eaeu0.requireContext(), ((eaey)(((eafe)object0))).a, ((eaey)(((eafe)object0))).b));
        eaeu0.at(0, null);
        eaeu0.ar();
        return ibom.a;
    }
}

