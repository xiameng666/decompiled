import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class duyj extends dokz implements ednc {
    public static final duye a;
    private final String b;
    private final String c;

    static {
        duyj.a = new duye();
    }

    public duyj() {
        this.b = "mdl";
        this.c = "idpass";
    }

    @Override  // ednc
    public final boolean F() {
        return hwmp.x();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        String s;
        ibuq.f(layoutInflater0, "inflater");
        if(this.getArguments() == null) {
            s = null;
        }
        else {
            Bundle bundle1 = this.getArguments();
            if(bundle1 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            s = bundle1.getString("mdoc_type_name");
        }
        ibvd ibvd0 = new ibvd();
        ibvd0.a = gtxf.a;
        if(ibuq.m(s, this.b)) {
            ibvd0.a = gtxf.b;
        }
        else if(ibuq.m(s, this.c)) {
            ibvd0.a = gtxf.c;
        }
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(-2045393490, true, new duyi(this, ibvd0)));
        return view0;
    }

    public final void y(hfc hfc0, ibth ibth0, ibth ibth1, goz goz0, int v) {
        goz goz1 = goz0.ao(-890342828);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(ibth0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            duyx.a(hfc0, ibth0, ibth1, goz1, v1 & 0x3FE);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new duyd(this, hfc0, ibth0, ibth1, v);
        }
    }
}

