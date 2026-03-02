import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class duzo extends dokz implements ednc {
    public static final duzh a;

    static {
        duzo.a = new duzh();
    }

    @Override  // ednc
    public final boolean F() {
        return hwmp.x();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        gtxf gtxf0 = gtxf.b(bundle1.getInt("mdoc_type", 0));
        if(gtxf0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle bundle2 = this.getArguments();
        if(bundle2 != null) {
            byte[] arr_b = bundle2.getByteArray("id_card_issuer");
            hkas hkas0 = null;
            if(arr_b != null) {
                try {
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hkas.a), arr_b, 0, arr_b.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    hkas0 = (hkas)hftv0;
                }
                catch(hfur unused_ex) {
                }
            }
            if(hkas0 != null) {
                View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
                ((ComposeView)view0).a(new gze(0xDA6D3B90, true, new duzn(this, hkas0, gtxf0)));
                return view0;
            }
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void y(String s) {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s)).addFlags(0x10000000);
        ibuq.e(intent0, "addFlags(...)");
        this.requireContext().startActivity(intent0);
    }

    public final void z(hfc hfc0, hkas hkas0, ibth ibth0, ibth ibth1, ibth ibth2, ibth ibth3, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(ibth0, "continueClicked");
        ibuq.f(ibth1, "navIconClicked");
        ibuq.f(ibth2, "findLocationsClicked");
        ibuq.f(ibth3, "educationClicked");
        goz goz1 = goz0.ao(-346069210);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(hkas0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibth3) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) == 74898 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            dval.b(hfc.e, hkas0, ibth0, ibth1, ibth3, ibth2, goz1, v1 >> 3 & 0xE000 | v1 & 0x1FFE | v1 << 3 & 0x70000);
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duzg(this, hfc1, hkas0, ibth0, ibth1, ibth2, ibth3, v);
        }
    }
}

