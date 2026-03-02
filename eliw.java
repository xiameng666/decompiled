import java.util.Comparator;

public final class eliw implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        for(int v = 0; v < ((byte[])object0).length && v < ((byte[])object1).length; ++v) {
            int v1 = Integer.compare(((byte[])object0)[v] & 0xFF, ((byte[])object1)[v] & 0xFF);
            if(v1 != 0) {
                return v1;
            }
        }
        return 0;
    }
}

