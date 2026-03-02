import java.text.Collator;
import java.util.Comparator;

public final class beqb implements Comparator {
    public final Collator a;

    public beqb(Collator collator0) {
        this.a = collator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        String s = gqlw.b(((bedh)((bede)object0).c.d()).b.c);
        String s1 = gqlw.b(((bedh)((bede)object1).c.d()).b.c);
        return this.a.compare(s, s1);
    }
}

