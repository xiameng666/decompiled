import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public final class tij extends thp {
    public static final tib a;
    public final SortedMap e;
    private static final thz f;

    static {
        tij.a = new tib(-1, -102);
        tij.f = new thz(3);
    }

    public tij(tib tib0, byte[] arr_b, tid tid0) {
        super(tib0, arr_b, tij.f);
        int v4;
        this.e = new TreeMap();
        for(Object object0: new tff().b(new ByteArrayInputStream(arr_b))) {
            tfg tfg0 = new tfg(tha.a);
            if(!((tfe)object0).a.equals(tfg0)) {
                throw new RuntimeException("Expected DGI_CONTAINER_IDENTIFIER");
            }
            byte[] arr_b1 = ((tfe)object0).d();
            new tgc(arr_b1, tha.b);
            HashMap hashMap0 = new HashMap();
            if(arr_b1 == null || arr_b1.length <= 0) {
                throw new RuntimeException("Failed to parse AID tag");
            }
            if(arr_b1[0] != tha.c[0]) {
                throw new RuntimeException("Expected APPLICATION_IDENTIFIER tag");
            }
            if(arr_b1.length - 1 <= 0) {
                throw new RuntimeException("Failed to parse AID value length");
            }
            int v = Integer.parseInt(tjs.a(arr_b1[1]), 16);
            if(arr_b1.length - 2 < v) {
                throw new RuntimeException("Failed to parse AID value");
            }
            byte[] arr_b2 = new byte[v];
            System.arraycopy(arr_b1, 2, arr_b2, 0, v);
            int v1 = v + 2;
            while(v1 < arr_b1.length) {
                if(arr_b1.length - v1 < 2) {
                    throw new RuntimeException("Failed to parse DGI tag");
                }
                tib tib1 = new tib(arr_b1[v1], arr_b1[v1 + 1]);
                if(arr_b1.length - (v1 + 2) <= 0) {
                    throw new RuntimeException("Failed to parse DGI value length");
                }
                int v2 = v1 + 3;
                int v3 = arr_b1[v1 + 2];
                byte b = -1;
                if(v3 == -1) {
                    if(arr_b1.length - v2 < 2) {
                        throw new RuntimeException("Failed to parse DGI value length");
                    }
                    byte b1 = arr_b1[v2];
                    byte b2 = arr_b1[v1 + 4];
                    if(b1 != -1) {
                        b = b1;
                    }
                    else if(b2 == -1) {
                        throw new RuntimeException("Failed to parse DGI value length");
                    }
                    v2 = v1 + 5;
                    v4 = Integer.parseInt(tjs.b(new byte[]{b, b2}), 16);
                }
                else {
                    v4 = Integer.parseInt(tjs.a(((byte)v3)), 16);
                }
                if(arr_b1.length - v2 < v4) {
                    throw new RuntimeException("Failed to parse DGI value");
                }
                byte[] arr_b3 = new byte[v4];
                System.arraycopy(arr_b1, v2, arr_b3, 0, v4);
                v1 = v4 + v2;
                hashMap0.put(tib1, tid0.b(tib1, arr_b3));
                continue;
            }
            String s = tjs.b(arr_b2);
            this.e.put(s, hashMap0);
            continue;
        }
    }
}

