import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ghaj {
    static List a(int v, int v1, ggxe ggxe0) {
        int v11;
        int v10;
        List list0 = new ArrayList(v);
        ghah ghah0 = new ghah();
        int v3 = 0;
        while(v3 < v) {
            long v4 = ggxe0.f();
            int v5 = (int)(v4 % 6L);
            if(Long.compare(v4, 0L) < 0) {
                throw new IOException(a.n(v4, v5, "Invalid face: ", ", from faceAndCount: "));
            }
            if(((int)(v4 / 6L)) < 0) {
                throw new IOException(a.n(v4, ((int)(v4 / 6L)), "Invalid count: ", ", from faceAndCount: "));
            }
            ghag ghag0 = new ghag(v5, ((int)(v4 / 6L)));
            ghah0.a.add(ghag0);
            v3 += ghag0.b;
            continue;
        }
        Iterator iterator0 = ghah0.a.iterator();
        Iterator iterator1 = iterator0.hasNext() ? new ghaf(ghah0, iterator0) : Collections.emptyIterator();
        ghai ghai0 = new ghai();
        ghai ghai1 = new ghai();
        for(int v6 = 0; v6 < v; ++v6) {
            if(v6 == 0) {
                int v7 = v1 + 7 >> 3;
                int v8 = v7 + v7;
                byte[] arr_b = new byte[v8];
                if(ggxe0.a.read(arr_b) < v8) {
                    throw new IOException("EOF");
                }
                long v9 = Long.reverseBytes(glxd.c(Arrays.copyOf(arr_b, 8)));
                v10 = ghai0.a(ggxc.c(v9));
                v11 = ghai1.a(ggxc.b(v9));
            }
            else {
                long v12 = ggxe0.f();
                v10 = ghai0.a(ggxc.a(ggxc.c(v12)));
                v11 = ghai1.a(ggxc.a(ggxc.b(v12)));
            }
            Object object0 = iterator1.next();
            list0.add(ghae.q(ghbj.i(((Integer)object0).intValue(), ghbj.c(ghaj.b(v10, v1)), ghbj.c(ghaj.b(v11, v1)))));
        }
        int v13 = ggxe0.d();
        if(v13 > v) {
            throw new IOException("Number of off-center points is greater than total amount of points.");
        }
        for(int v2 = 0; v2 < v13; ++v2) {
            int v14 = ggxe0.d();
            double f = ggxe0.b();
            double f1 = ggxe0.b();
            double f2 = ggxe0.b();
            try {
                list0.set(v14, new ghae(f, f1, f2));
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new IOException("Insufficient or invalid data: ", indexOutOfBoundsException0);
            }
        }
        return list0;
    }

    private static double b(int v, int v1) {
        return (((double)v) + 0.5) / ((double)(1 << v1));
    }
}

