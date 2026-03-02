import java.util.Comparator;

public final class bpcv implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        gfsx gfsx0 = ((bpko)object0).c;
        boolean z = gfsx0.i();
        gfsx gfsx1 = ((bpko)object1).c;
        boolean z1 = gfsx1.i();
        if(z) {
            if(z1) {
                int v = ((gsyz)gfsx0.d()).b.compareTo(((gsyz)gfsx1.d()).b);
                return v == 0 ? ((bpko)object0).d.compareTo(((bpko)object1).d) : v;
            }
            z1 = false;
        }
        return z || z1 ? Boolean.compare(z, z1) : ByteString.c.compare(((bpko)object1).a, ((bpko)object0).a);
    }
}

