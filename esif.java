import java.util.Comparator;

public final class esif implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        esjb esjb0 = esjb.c;
        if(((esjb)object0) == esjb0 && ((esjb)object1) == esjb.b) {
            return -1;
        }
        if(((esjb)object0) == esjb.b) {
            return ((esjb)object1) == esjb0 ? 1 : 0;
        }
        return 0;
    }
}

