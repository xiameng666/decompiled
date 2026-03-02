import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class sxe {
    public static srp a(swc swc0, srk srk0, byte[] arr_b) {
        return (srp)swc0.a(srk0, arr_b).c(new srp(srk0, arr_b));
    }

    public static List b(byte[] arr_b) {
        List list0 = new ArrayList();
        int v = 0;
        while(true) {
            sxd sxd0 = sxj.a(arr_b, v);
            if(!sxd0.d()) {
                break;
            }
            sxg sxg0 = (sxg)sxd0.b();
            boolean z = sxg0.a == ssr.b.a;
            if(!z && sxg0.a != ssr.a.a) {
                throw sxf.h("Not an OID tag");
            }
            int v1 = sxg0.e;
            if(v1 > arr_b.length) {
                throw sxf.h("Inconsistent Nc");
            }
            list0.add(new ssr((z ? ssq.b : ssq.a), Arrays.copyOfRange(arr_b, sxg0.d, v1)));
            v = v1;
            continue;
        }
        if(v == arr_b.length) {
            return list0;
        }
        throw sxf.h("Trailing data in OID list");
    }
}

