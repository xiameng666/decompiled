import java.util.Comparator;

public final class djvb implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v;
        if(((ProtoLiteMessage)(((heia)object0))).isImmutable()) {
            v = ((ProtoLiteMessage)(((heia)object0))).s();
        }
        else {
            v = ((heia)object0).memoizedHashCode;
            if(v == 0) {
                v = ((ProtoLiteMessage)(((heia)object0))).s();
                ((heia)object0).memoizedHashCode = v;
            }
        }
        Integer integer0 = v;
        if(((ProtoLiteMessage)(((heia)object1))).isImmutable()) {
            return ibrc.a(integer0, Integer.valueOf(((ProtoLiteMessage)(((heia)object1))).s()));
        }
        int v1 = ((heia)object1).memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)(((heia)object1))).s();
            ((heia)object1).memoizedHashCode = v1;
        }
        return ibrc.a(integer0, Integer.valueOf(v1));
    }
}

