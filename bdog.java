import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class bdog {
    private final bdof a;

    public bdog(bdof bdof0) {
        this.a = bdof0;
    }

    public final bdoe a(String s) {
        return new bdoe(((beba)this.a.a).a(), s, new bgog());
    }

    public static Provider b(bdof bdof0) {
        return InstanceFactory.a(new bdog(bdof0));
    }
}

