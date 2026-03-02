import java.util.Comparator;

public final class behs implements Comparator {
    public final ibtw a;

    public behs(ibtw ibtw0) {
        this.a = ibtw0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return ((Number)this.a.a(object0, object1)).intValue();
    }
}

