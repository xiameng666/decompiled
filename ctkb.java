import java.util.List;
import java.util.Map;

public final class ctkb {
    public static final void a(List list0, Map map0, ibts ibts0, goz goz0, int v) {
        goz goz2;
        ibuq.f(list0, "appList");
        ibuq.f(map0, "icons");
        ibuq.f(ibts0, "onAppClick");
        goz goz1 = goz0.ao(-139559290);
        int v1 = (v & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(map0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            dpg dpg0 = new dpg();
            hfc hfc0 = dls.u(hfc.e);
            goz1.M(0x97EA02AA);
            int v2 = goz1.Z(list0) | goz1.Z(map0);
            Object object0 = goz1.j();
            if((((v1 & 0x380) == 0x100 ? 1 : 0) | v2) != 0 || object0 == gop.a) {
                object0 = new ctjw(list0, map0, ibts0);
                goz1.P(object0);
            }
            goz1.x();
            goz2 = goz1;
            dpm.a(dpg0, hfc0, null, null, null, null, null, false, null, ((ibts)object0), goz2, 0x30, 0);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ctjx(list0, map0, ibts0, v);
        }
    }
}

