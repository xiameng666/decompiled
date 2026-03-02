import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gpro {
    public final String[] a;
    public final gptb b;

    public gpro(gptb gptb0, String[] arr_s) {
        this.b = gptb0;
        this.a = arr_s;
    }

    public static gprf a(byte[] arr_b, int v, gpqz gpqz0) {
        gprh gprh0 = new gprh(arr_b, v);
        try {
            int v1 = gprh0.b();
            int v2 = gprh0.b();
            if((0xF80F & v2) != 0x8000) {
                throw new gpre(1, "Not a response", null);
            }
            gprf gprf0 = gprf.a(gprh0, v2, v1);
            if(gprf0.d.size() > 0) {
                return gprf0;
            }
            throw new gpre(2, "Response has no answers", null);
        }
        catch(EOFException eOFException0) {
            throw new gpre(12, "Reached the end of the mDNS response unexpectedly.", eOFException0);
        }
    }

    public static gprn b(List list0, String[] arr_s) {
        for(Object object0: list0) {
            gprn gprn0 = (gprn)object0;
            if(gpqj.b(gprn0.d, arr_s)) {
                return gprn0;
            }
        }
        return null;
    }

    public static List c(List list0, String[] arr_s) {
        if(!list0.isEmpty()) {
            List list1 = null;
            for(Object object0: list0) {
                gprn gprn0 = (gprn)object0;
                gpsa gpsa0 = gprn0.b();
                if(gpsa0 != null && gpqj.b(gpsa0.b, arr_s)) {
                    if(list1 == null) {
                        list1 = new ArrayList(list0.size());
                    }
                    list1.add(gprn0);
                }
            }
            return list1 == null ? Collections.EMPTY_LIST : list1;
        }
        return Collections.EMPTY_LIST;
    }
}

