import java.util.Comparator;

final class gcgn implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = String.CASE_INSENSITIVE_ORDER.compare(((gcgo)object0).c, ((gcgo)object1).c);
        if(v != 0) {
            return v;
        }
        CharSequence charSequence0 = ((gcgo)object0).e;
        if(charSequence0 != null) {
            CharSequence charSequence1 = ((gcgo)object1).e;
            if(charSequence1 != null) {
                int v1 = String.CASE_INSENSITIVE_ORDER.compare(charSequence0.toString(), charSequence1.toString());
                return v1 == 0 ? 0 : v1;
            }
        }
        return 0;
    }
}

