import java.io.IOException;
import java.util.Arrays;

public final class eios {
    private static final bboh a;

    static {
        eios.a = bboh.b("ExperimentIdEncoder", bbcu.al);
    }

    public static byte[] a(gocn gocn0) {
        if(gocn0.j.size() != 0) {
            int v = gocn0.j.size();
            int[] arr_v = new int[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_v[v1] = gocn0.j.d(v1);
            }
            Arrays.sort(arr_v);
            return eios.b(arr_v, v);
        }
        return null;
    }

    static byte[] b(int[] arr_v, int v) {
        if(v == 0) {
            return null;
        }
        if(v > arr_v.length || v < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v2 = CodedOutputStream.Y(arr_v[0]);
        int v3 = arr_v[0];
        int v5 = 1;
        for(int v4 = 1; v4 < v; ++v4) {
            int v6 = arr_v[v4];
            long v7 = ((long)v6) - ((long)v3);
            if(v7 > 0L && v7 <= 0x7FFFFFFFL) {
                arr_v[v5] = (int)v7;
                v2 += CodedOutputStream.Y(((int)v7));
                ++v5;
                v3 = v6;
            }
        }
        byte[] arr_b = new byte[v2 + CodedOutputStream.Y(v5)];
        try {
            CodedOutputStream hfsq0 = CodedOutputStream.ad(arr_b);
            hfsq0.writeRawVarint32(v5);
            for(int v1 = 0; v1 < v5; ++v1) {
                hfsq0.writeRawVarint32(arr_v[v1]);
            }
        }
        catch(IOException iOException0) {
            a.ae(eios.a.j(), "Failed to encode weak experiment IDs.", iOException0);
        }
        return arr_b;
    }

    public static int[] c(byte[] arr_b) {
        int[] arr_v = null;
        if(arr_b != null) {
            try {
                hfsl hfsl0 = hfsl.P(arr_b);
                int v = ((hfsh)hfsl0).j();
                arr_v = new int[v];
                arr_v[0] = ((hfsh)hfsl0).j();
                for(int v1 = 1; v1 < v; ++v1) {
                    arr_v[v1] = arr_v[v1 - 1] + ((hfsh)hfsl0).j();
                }
                return arr_v;
            }
            catch(IOException iOException0) {
                a.ae(eios.a.j(), "Failed to decode weak experiment IDs.", iOException0);
            }
        }
        return arr_v;
    }
}

