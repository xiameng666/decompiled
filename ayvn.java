import java.util.EnumSet;

public final class ayvn {
    public static final ayvn a;
    public static final ayvn b;
    public static final ayvn c;
    public final ggfp d;

    static {
        ayvn.a = new ayvn(ggog.b(EnumSet.allOf(ayvo.class)));
        ayvn.b = new ayvn(ggnj.a);
        ayvn.c = new ayvn(ggog.c(ayvo.a, new ayvo[0]));
    }

    public ayvn(ggfp ggfp0) {
        this.d = ggfp0;
    }

    public final boolean a(ayvo ayvo0) {
        return this.d.contains(ayvo0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ayvn) && this.d.equals(((ayvn)object0).d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }
}

