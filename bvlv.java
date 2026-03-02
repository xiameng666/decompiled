import java.util.LinkedHashMap;
import java.util.Map;

public final class bvlv {
    public final Map a;

    public bvlv() {
        ibpt ibpt0;
        if(htvk.f() && htvk.e()) {
            hfuo hfuo0 = htvk.b().b;
            ibuq.e(hfuo0, "getOverridesList(...)");
            ibpt0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
            for(Object object0: hfuo0) {
                buyk buyk0 = ((buyn)object0).b;
                if(buyk0 == null) {
                    buyk0 = buyk.a;
                }
                awkv awkv0 = awkv.b(buyk0.b) == null ? awkv.a : awkv.b(buyk0.b);
                ibuq.e(awkv0, "getGoogleSettingsItemId(...)");
                buyi buyi0 = buyi.b(((buyn)object0).d);
                if(buyi0 == null) {
                    buyi0 = buyi.o;
                }
                ibpt0.put(awkv0, buyi0);
            }
        }
        else {
            ibpt0 = ibpt.a;
        }
        this.a = ibpt0;
    }
}

