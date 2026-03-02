import java.util.Comparator;

final class emdo implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        hfwn hfwn0 = ((gzrd)object0).c;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        long v = hfyn.b(hfwn0);
        hfwn hfwn1 = ((gzrd)object1).c;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        int v1 = Long.compare(v, hfyn.b(hfwn1));
        if(v1 == 0) {
            gzra gzra0 = ((gzrd)object0).g;
            if(gzra0 == null) {
                gzra0 = gzra.a;
            }
            gzqz gzqz0 = gzqz.a;
            if(gzqz.a(gzra0.b) == gzqz0) {
                gzra gzra1 = ((gzrd)object1).g;
                if(gzra1 == null) {
                    gzra1 = gzra.a;
                }
                if(gzqz.a(gzra1.b) == gzqz0) {
                    gzra gzra2 = ((gzrd)object0).g;
                    if(gzra2 == null) {
                        gzra2 = gzra.a;
                    }
                    int v2 = (gzra2.b == 1 ? ((hgvd)gzra2.c) : hgvd.a).c;
                    gzra gzra3 = ((gzrd)object1).g;
                    if(gzra3 == null) {
                        gzra3 = gzra.a;
                    }
                    return gzra3.b == 1 ? Integer.compare(v2, ((hgvd)gzra3.c).c) : Integer.compare(v2, hgvd.a.c);
                }
            }
            hfwn hfwn2 = ((gzrd)object1).d;
            if(hfwn2 == null) {
                hfwn2 = hfwn.a;
            }
            long v3 = hfyn.b(hfwn2);
            hfwn hfwn3 = ((gzrd)object0).d;
            if(hfwn3 == null) {
                hfwn3 = hfwn.a;
            }
            return Long.compare(v3, hfyn.b(hfwn3));
        }
        return v1;
    }
}

