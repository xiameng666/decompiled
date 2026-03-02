import java.text.Collator;
import java.util.Comparator;

public final class bggz implements Comparator {
    public final Collator a;

    public bggz(Collator collator0) {
        this.a = collator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        String s = gqlw.b(((gqlt)object0).b.c);
        String s1 = gqlw.b(((gqlt)object1).b.c);
        return this.a.compare(s, s1);
    }
}

