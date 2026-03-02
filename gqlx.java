import java.util.Comparator;

public final class gqlx implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        gqlo gqlo0 = (gqlo)object0;
        gqlo gqlo1 = (gqlo)object1;
        boolean z = gqlo0.f();
        boolean z1 = gqlo1.f();
        return ggbe.b.g(z, z1).g(gqlo0.e(), gqlo1.e()).g(gqlo0.d(), gqlo1.d()).d(gqlo0.a, gqlo1.a).a();
    }
}

