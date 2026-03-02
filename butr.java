import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;

public final class butr extends busu {
    public static final bboh a;
    private final ibnn ag;
    public buht b;
    public buje c;
    public cmhi d;

    static {
        butr.a = bboh.b("WebViewPage", bbcu.hd);
    }

    public butr() {
        butn butn0 = new butn(new butm(this));
        ibnn ibnn0 = ibno.a(ibnp.c, butn0);
        ibuk ibuk0 = new ibuk(buty.class);
        buto buto0 = new buto(ibnn0);
        butp butp0 = new butp(ibnn0);
        this.ag = new lsd(ibuk0, buto0, new butq(this, ibnn0), butp0);
    }

    public final void A(String s, ibth ibth0, ibtw ibtw0, goz goz0, int v) {
        goz goz2;
        ibuq.f(s, "toolbarTitle");
        ibuq.f(ibth0, "onBackPressed");
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(-406381763);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            fits.a(null, gzf.e(0x839B6601, new buta(s, ibth0), goz1), null, null, null, 0, 0L, 0L, null, gzf.e(-2125074100, new butb(ibtw0), goz1), goz2, 0x30000030, 509);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new busx(this, s, ibth0, ibtw0, v);
        }
    }

    public final void B(String s, ibth ibth0, buty buty0, goz goz0, int v) {
        int v3;
        int v2;
        ibuq.f(s, "toolbarTitle");
        ibuq.f(ibth0, "onBackPressed");
        goz goz1 = goz0.ao(0x74EF60A8);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= 0x80;
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(this) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            v2 = v;
            goto label_41;
        }
        goz1.I();
        xob xob0 = null;
        if((v & 1) != 0 && !goz1.aa()) {
            v3 = v1 & -897;
            goz1.G();
        }
        else {
            lsq lsq0 = lud.b(goz1);
            if(lsq0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            v3 = v1 & -897;
            ltx ltx0 = (lsq0 instanceof loz) ? ((loz)lsq0).getDefaultViewModelCreationExtras() : ltv.a;
            buty0 = (buty)lue.a(new ibuk(buty.class), lsq0, null, null, ltx0);
        }
        goz1.w();
        Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
        if((context0 instanceof xob)) {
            xob0 = (xob)context0;
        }
        if(xob0 == null) {
            ((ggtj)butr.a.j()).x("activity is not a chimera activity");
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new busv(this, s, ibth0, buty0, v);
            }
        }
        else {
            v2 = v;
            this.A(s, ibth0, gzf.e(0xBB40417A, new butg(buty0, this, context0, xob0), goz1), goz1, v3 & 14 | 0x180 | v3 & 0x70 | v3 & 0x1C00);
            buty0 = buty0;
        label_41:
            gsb gsb1 = goz1.af();
            if(gsb1 != null) {
                gsb1.d = new busw(this, s, ibth0, buty0, v2);
            }
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        boolean z;
        super.onCreate(bundle0);
        try {
            byte[] arr_b = this.requireArguments().getByteArray("webViewFragmentArgs");
            if(arr_b == null) {
                throw new IllegalStateException("Web view fragment args cannot be empty");
            }
            z = false;
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)buht.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            this.b = (buht)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException(hfur0);
        }
        buty buty0 = (buty)this.ag.a();
        buht buht0 = this.b;
        if(buht0 == null) {
            ibuq.j("fragmentArgs");
            buht0 = null;
        }
        ghip ghip0 = buht0.d == null ? ghip.a : buht0.d;
        ibuq.e(ghip0, "getWebviewUrl(...)");
        if((this.requireContext().getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            z = true;
        }
        buty0.a(ghip0, z);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0x5D6FD7FA, true, new butl(this)));
        return view0;
    }
}

