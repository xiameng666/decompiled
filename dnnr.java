import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

public final class dnnr extends tk {
    public dxev a;
    public boolean e;
    private final edoq f;
    private dnnp g;

    public dnnr(edoq edoq0) {
        this.f = edoq0;
        this.g = dnnp.a;
        this.e = true;
    }

    private static final boolean G(dxev dxev0) {
        return (dxev0.b & 2) == 0 ? false : (dxev0.d == null ? dxet.a : dxev0.d).c;
    }

    private static final boolean H(edoq edoq0) {
        return edoq0.a() == 3;
    }

    @Override  // tk
    public final int b() {
        return this.g == dnnp.a ? 0 : 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E089E, viewGroup0, false);  // layout:ready_to_pay_view
        ibuq.c(view0);
        return new dnnq(view0);
    }

    public final void f() {
        dnnp dnnp1;
        dnnp dnnp0 = this.g;
        dxev dxev0 = this.a;
        if(dxev0 == null) {
            dnnp1 = dnnp.a;
        }
        else {
            if(dnpx.r(dxev0)) {
                dxev dxev1 = this.a;
                if(dxev1 == null) {
                    dnnp1 = dnnp.a;
                }
                else if(!dnnr.G(dxev1) || !dnnr.n(dxev1) || !dnnr.H(this.f)) {
                    dnnp1 = dnnp.a;
                }
                else if(dnpx.q(dxev1)) {
                    dnnp1 = dnnp.d;
                }
                else if(dnpx.l(dxev1)) {
                    dnnp1 = dnnp.e;
                }
                else {
                    dnnp1 = dnnp.a;
                }
            }
            else if(hwoz.f()) {
                hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                if((hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) == hkiq.e) {
                    hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
                    hkhh hkhh1 = hkhr1.q == null ? hkhh.a : hkhr1.q;
                    if(hkio.a((hkhh1.g == null ? hkir.a : hkhh1.g).n) == 3) {
                        dnnp1 = dnnp.f;
                        goto label_36;
                    }
                }
                goto label_29;
            }
            else {
            label_29:
                if(!dnnr.n(dxev0) || !dnnr.H(this.f) || !this.e) {
                    dnnp1 = dnnp.a;
                }
                else if(dnnr.G(dxev0)) {
                    dnnp1 = dnnp.b;
                }
                else {
                    dnnp1 = dnnp.c;
                }
            }
        label_36:
            if(dnnp1 == null) {
                dnnp1 = dnnp.a;
            }
        }
        this.g = dnnp1;
        if(dnnp0 == dnnp1) {
            return;
        }
        dnnp dnnp2 = dnnp.a;
        if(dnnp1 == dnnp2) {
            this.y(0);
            return;
        }
        if(dnnp0 == dnnp2) {
            this.s(0);
            return;
        }
        this.r(0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        fuio fuio0;
        ibuq.f(((dnnq)uq0), "holder");
        int v1 = 8;
        if(hwev.c()) {
            dnnp dnnp0 = this.g;
            Context context0 = ((dnnq)uq0).t.getContext();
            ibuq.e(context0, "getContext(...)");
            switch(dnnp0.ordinal()) {
                case 0: {
                    fuio0 = new fuio(new fuii(fuip.a), new fryu(""));
                    break;
                }
                case 1: {
                    fuio0 = new fuio(new fuii(fuip.b), new fryr(0x7F151CDA));  // string:pay_default_for_contactless "Default for tap to pay"
                    break;
                }
                case 2: {
                    fuio0 = new fuio(new fuii(fuip.c), new fryr(0x7F151E82));  // string:pay_hold_near_reader "Hold to reader"
                    break;
                }
                case 3: {
                    fuio0 = new fuio(new fuih(new fryh((fsce.a(context0) ? 0x7F080A04 : 0x7F080A03)), 2), new fryr(0x7F151E82));  // drawable:pay_quicpay_card_network_idle_icon
                    break;
                }
                case 4: {
                    fuio0 = new fuio(new fuih(new fryh(0x7F0809DE), 2), new fryr(0x7F151E82));  // drawable:pay_id_card_network_icon
                    break;
                }
                case 5: {
                    fuio0 = new fuio(new fuii(fuip.g), new fryr(0x7F151F4A));  // string:pay_locked "Locked"
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            ((dnnq)uq0).x.a.b(fuio0);
            ((dnnq)uq0).x.setVisibility(0);
        }
        else {
            TextView textView0 = ((dnnq)uq0).w;
            Integer integer0 = this.g.g;
            if(integer0 != null) {
                textView0.setText(integer0.intValue());
                if(hwoz.f()) {
                    Integer integer1 = this.g.l;
                    if(integer1 != null) {
                        int v2 = integer1.intValue();
                        textView0.setTextColor(fyho.g(textView0.getContext(), v2));
                    }
                }
            }
            textView0.setVisibility(0);
            LottieAnimationView lottieAnimationView0 = ((dnnq)uq0).u;
            Integer integer2 = this.g.h;
            if(integer2 == null) {
                lottieAnimationView0.setVisibility(8);
            }
            else {
                lottieAnimationView0.l(integer2.intValue());
                lottieAnimationView0.t(((int)hwtu.a.e().c()));
                lottieAnimationView0.i();
                lottieAnimationView0.setVisibility(0);
            }
            ImageView imageView0 = ((dnnq)uq0).v;
            if(this.g.i == null) {
                imageView0.setVisibility(8);
                goto label_60;
            }
            if(fsce.a(imageView0.getContext())) {
                Integer integer3 = this.g.j;
                if(integer3 != null) {
                    imageView0.setImageResource(integer3.intValue());
                    imageView0.setImageTintList(fyho.g(imageView0.getContext(), 0x7F0402C9));  // attr:colorOnBackground
                    goto label_54;
                }
            }
            Integer integer4 = this.g.i;
            if(integer4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            imageView0.setImageResource(integer4.intValue());
        label_54:
            if(hwoz.f()) {
                Integer integer5 = this.g.k;
                if(integer5 != null) {
                    int v3 = integer5.intValue();
                    imageView0.setImageTintList(fyho.g(imageView0.getContext(), v3));
                }
            }
            imageView0.setVisibility(0);
        }
    label_60:
        View view0 = ((dnnq)uq0).t;
        if(this.g != dnnp.a) {
            v1 = 0;
        }
        view0.setVisibility(v1);
    }

    private static final boolean n(dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        return (hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) == hkiq.d;
    }
}

