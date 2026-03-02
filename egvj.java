import java.text.Collator;
import java.util.Comparator;

public final class egvj implements Comparator {
    public final Collator a;

    public egvj(Collator collator0) {
        this.a = collator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return this.a.compare(((egnp)object0).c, ((egnp)object1).c);
    }
}

