import java.util.Comparator;

public final class arqw implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        long v = 0L;
        long v1 = ((((asby)object0).c == 100 ? ((asbs)((asby)object0).d) : asbs.a).b & 2) == 0 ? 0L : (((asby)object0).c == 100 ? ((asbs)((asby)object0).d) : asbs.a).d;
        int v2 = ((asby)object1).c;
        if(((v2 == 100 ? ((asbs)((asby)object1).d) : asbs.a).b & 2) != 0) {
            v = (v2 == 100 ? ((asbs)((asby)object1).d) : asbs.a).d;
        }
        return Long.valueOf(v).compareTo(Long.valueOf(v1));
    }
}

