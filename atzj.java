import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class atzj {
    public final int a;
    public final List b;
    public final long c;
    public long d;
    public final List e;
    public final List f;

    public atzj(atzi atzi0) {
        this.e = DesugarCollections.synchronizedList(new ArrayList());
        this.f = DesugarCollections.synchronizedList(new ArrayList());
        this.a = atzi0.a;
        this.b = new ArrayList(atzi0.b);
        this.c = System.currentTimeMillis();
    }
}

