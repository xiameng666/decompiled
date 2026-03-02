import java.util.Comparator;

public final class wzu implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        xee xee0 = (xee)object0;
        xee xee1 = (xee)object1;
        int v = xee0.at();
        int v1 = xee1.at();
        return ggbe.b.b(v, v1).d(xee0.h(), xee1.h()).a();
    }
}

