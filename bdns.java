import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class bdns {
    private final bdnr a;

    public bdns(bdnr bdnr0) {
        this.a = bdnr0;
    }

    public final bdnq a(String s) {
        return new bdnq(((beal)this.a.a).a(), ((beaf)this.a.b).a(), ((bdmv)this.a.c).a(), bbnk.a, s);
    }

    public static Provider b(bdnr bdnr0) {
        return InstanceFactory.a(new bdns(bdnr0));
    }
}

