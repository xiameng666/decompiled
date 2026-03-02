import java.util.Comparator;

public final class aatp implements Comparator {
    private static final Integer a(aath aath0) {
        int v = grys.a(aath0.b.f) == 0 ? 1 : grys.a(aath0.b.f);
        if(v - 1 != 1) {
            switch(v - 1) {
                case 2: {
                    return (int)3;
                }
                case 3: {
                    return (int)2;
                }
                default: {
                    return (int)1;
                }
            }
        }
        return (int)4;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return aatp.a(((aath)object1)).compareTo(aatp.a(((aath)object0)));
    }
}

