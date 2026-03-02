import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.tapandpay.ui.foprow.FopRow;

public final class dnor extends uq {
    public final FopRow t;
    public final dnpp u;
    public final Account v;
    public final du w;
    public final boolean x;
    public final Context y;
    public dxev z;

    public dnor(FopRow fopRow0, dnpp dnpp0, Account account0, du du0, boolean z) {
        super(fopRow0);
        this.t = fopRow0;
        this.u = dnpp0;
        this.v = account0;
        this.w = du0;
        this.x = z;
        this.y = this.a.getContext();
    }

    public final fujl D() {
        dxev dxev0 = this.z;
        dxev dxev1 = null;
        if(dxev0 == null) {
            ibuq.j("paymentMethodData");
            dxev0 = null;
        }
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        ibuq.e(hkhr0, "getPaymentMethod(...)");
        boolean z = false;
        if(fscr.a(hkhr0)) {
            dxev dxev2 = this.z;
            if(dxev2 == null) {
                ibuq.j("paymentMethodData");
                dxev2 = null;
            }
            gfsx gfsx0 = dnpx.a(dxev2, hkid.k);
            fryh fryh0 = new fryh(0);
            dxev dxev3 = this.z;
            if(dxev3 == null) {
                ibuq.j("paymentMethodData");
            }
            else {
                dxev1 = dxev3;
            }
            String s = (dxev1.c == null ? hkhr.b : dxev1.c).l;
            ibuq.e(s, "getLogoFifeUrl(...)");
            fuhz fuhz0 = new fuhz(new fryj(s, null, null, null, 14));
            boolean z1 = gfsx0.i();
            return new fujl(fryh0, fuhz0, null, new frxo(0x7F040332), z1, null, true, 84);  // attr:colorSurface
        }
        dxev dxev4 = this.z;
        if(dxev4 == null) {
            ibuq.j("paymentMethodData");
            dxev4 = null;
        }
        fsan fsan0 = fsam.a(dxev4);
        dxev dxev5 = this.z;
        if(dxev5 == null) {
            ibuq.j("paymentMethodData");
            dxev5 = null;
        }
        hkhr hkhr1 = dxev5.c == null ? hkhr.b : dxev5.c;
        hkhh hkhh0 = hkhr1.q == null ? hkhh.a : hkhr1.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        if((hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) != hkiq.d) {
            z = true;
        }
        if(fsan0 != null) {
            Uri uri0 = fsan0.h;
            if(uri0 != null) {
                String s1 = uri0.toString();
                return s1 == null ? new fujl(new fryj("", null, null, null, 14), new fuib(new fryu(fsan0.b), new frxr(fsan0.f)), null, new frxp(fsan0.g), z, null, true, 84) : new fujl(new fryj(s1, null, null, null, 14), new fuib(new fryu(fsan0.b), new frxr(fsan0.f)), null, new frxp(fsan0.g), z, null, true, 84);
            }
            return new fujl(new fryj("", null, null, null, 14), new fuib(new fryu(fsan0.b), new frxr(fsan0.f)), null, new frxp(fsan0.g), z, null, true, 84);
        }
        dxev dxev6 = this.z;
        if(dxev6 == null) {
            ibuq.j("paymentMethodData");
        }
        else {
            dxev1 = dxev6;
        }
        String s2 = (dxev1.c == null ? hkhr.b : dxev1.c).l;
        ibuq.e(s2, "getLogoFifeUrl(...)");
        return new fujl(new fryj(s2, null, null, null, 14), null, null, null, z, null, true, 94);
    }

    public final String E(dnoq dnoq0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        dxev dxev0 = this.z;
        dxev dxev1 = null;
        if(dxev0 == null) {
            ibuq.j("paymentMethodData");
            dxev0 = null;
        }
        if((dxev0.b & 2) != 0) {
            dxev dxev2 = this.z;
            if(dxev2 == null) {
                ibuq.j("paymentMethodData");
                dxev2 = null;
            }
            if((dxev2.d == null ? dxet.a : dxev2.d).c && this.x) {
                Context context0 = this.y;
                dxev dxev3 = this.z;
                if(dxev3 == null) {
                    ibuq.j("paymentMethodData");
                }
                else {
                    dxev1 = dxev3;
                }
                String s = (dxev1.c == null ? hkhr.b : dxev1.c).h;
                ibuq.e(s, "getTitle(...)");
                stringBuilder0.append(context0.getString(0x7F151E18, new Object[]{edkt.a(s)}));  // string:pay_fops_list_default_card_content_description "%1$s is your default for 
                                                                                                 // tap to pay."
                return stringBuilder0.toString();
            }
        }
        dxev dxev4 = this.z;
        if(dxev4 == null) {
            ibuq.j("paymentMethodData");
        }
        else {
            dxev1 = dxev4;
        }
        String s1 = (dxev1.c == null ? hkhr.b : dxev1.c).h;
        ibuq.e(s1, "getTitle(...)");
        stringBuilder0.append(edkt.a(s1));
        Integer integer0 = dnoq0.i;
        if(integer0 != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.y.getString(integer0.intValue()));
        }
        return stringBuilder0.toString();
    }
}

