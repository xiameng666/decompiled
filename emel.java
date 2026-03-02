import java.util.Comparator;

public final class emel implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Double.compare(((emep)object0).a, ((emep)object1).a);
        if(v == 0) {
            gzhd gzhd0 = ((emep)object0).b.c;
            if(gzhd0 == null) {
                gzhd0 = gzhd.c;
            }
            long v1 = (gzhd0.e == null ? gzgf.a : gzhd0.e).d;
            gzhd gzhd1 = ((emep)object1).b.c;
            if(gzhd1 == null) {
                gzhd1 = gzhd.c;
            }
            return Long.compare(v1, (gzhd1.e == null ? gzgf.a : gzhd1.e).d);
        }
        return v;
    }
}

