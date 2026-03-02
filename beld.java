import java.util.Comparator;

public final class beld implements Comparator {
    public final bele a;

    public beld(bele bele0) {
        this.a = bele0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        String s = gqlw.b(((gqlt)object0).b.c);
        String s1 = gqlw.b(((gqlt)object1).b.c);
        return this.a.a.compare(s, s1);
    }
}

