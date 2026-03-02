import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Set;

public final class durb extends dokz {
    public static final duqw a;

    static {
        durb.a = new duqw();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        if(hwmp.o() && !hwmp.n()) {
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(hwpi.e())).addFlags(0x10000000);
            ibuq.e(intent0, "addFlags(...)");
            this.requireContext().startActivity(intent0);
            this.ar();
        }
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0xB83D1C5, true, new dura(this, dtzj.a())));
        return view0;
    }

    public final void y(hfc hfc0, Set set0, ibth ibth0, ibts ibts0, goz goz0, int v) {
        hey hey1;
        hfc hfc1;
        ibuq.f(ibth0, "onNavIconClick");
        ibuq.f(ibts0, "onIdTypeClick");
        goz goz1 = goz0.ao(-920996734);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(set0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            if(set0.isEmpty()) {
                goz1.M(0xED3FB98E);
                durr.c(hey0, ibth0, goz1, v1 >> 3 & 0x70 | v1 & 14);
                goz1.x();
                hey1 = hey0;
            }
            else if(set0.size() == 1) {
                goz1.M(0xED3FC747);
                goz1.x();
                ibts0.a(ibpo.Q(set0));
                hey1 = hey0;
            }
            else {
                goz1.M(0xED3FCF4F);
                hey1 = hey0;
                durr.b(hey1, set0, ibth0, ibts0, goz1, v1 & 0x1FFE);
                goz1.x();
            }
            hfc1 = hey1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duqv(this, hfc1, set0, ibth0, ibts0, v);
        }
    }
}

