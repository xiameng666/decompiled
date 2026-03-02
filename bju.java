import j..util.DesugarCollections;
import java.util.EnumSet;
import java.util.Set;

public final class bju {
    public static final Set a;
    public static final Set b;
    public static final Set c;
    public static final Set d;

    static {
        bju.a = DesugarCollections.unmodifiableSet(EnumSet.of(bhr.d, bhr.e, bhr.f, bhr.g));
        bju.b = DesugarCollections.unmodifiableSet(EnumSet.of(bhs.d, bhs.a));
        Set set0 = DesugarCollections.unmodifiableSet(EnumSet.of(bhq.e, bhq.d, bhq.a));
        bju.c = set0;
        EnumSet enumSet0 = EnumSet.copyOf(set0);
        enumSet0.remove(bhq.d);
        enumSet0.remove(bhq.a);
        bju.d = DesugarCollections.unmodifiableSet(enumSet0);
    }
}

