import java.util.Comparator;

public final class amve implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((ProtoLiteMessage)(((herq)object0))).equals(((herq)object1))) {
            return 0;
        }
        int v = hern.a(((herq)object0).m);
        if(v == 0) {
            return 1;
        }
        if(v == 3) {
            switch(hern.a(((herq)object1).m)) {
                case 0: 
                case 1: {
                    return -1;
                }
                default: {
                    return 1;
                }
            }
        }
        return 1;
    }
}

