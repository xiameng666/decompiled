import java.util.LinkedHashMap;
import java.util.Map;

public final class ebse implements evpo {
    public final ebsf a;
    public final String b;

    public ebse(ebsf ebsf0, String s) {
        this.a = ebsf0;
        this.b = s;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            hfuo hfuo0 = ((hkjs)evql0.j()).b;
            ibuq.e(hfuo0, "getCardInfoList(...)");
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
            for(Object object0: hfuo0) {
                hjwx hjwx0 = ((hkjm)object0).c;
                if(hjwx0 == null) {
                    hjwx0 = hjwx.a;
                }
                ibns ibns0 = new ibns(hjwx0.d, ((hkjm)object0));
                linkedHashMap0.put(ibns0.a, ibns0.b);
            }
            this.a.v = linkedHashMap0;
            Map map0 = this.a.v;
            if(map0 == null) {
                ibuq.j("cidToCardInfoMap");
                map0 = null;
            }
            hkjm hkjm0 = (hkjm)map0.get(this.b);
            return hkjm0 == null ? Boolean.valueOf(false) : Boolean.valueOf(hkjm0.i);
        }
        ((ggtj)ebsf.a.i()).x("GetCardInfoList RPC failed.");
        return Boolean.valueOf(false);
    }
}

