import java.util.List;

public final class bowd implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        return Boolean.valueOf(((List)object0).contains(Boolean.valueOf(true)));
    }
}

