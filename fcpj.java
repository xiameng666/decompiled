import java.util.function.Supplier;

public final class fcpj implements Supplier {
    @Override
    public final Object get() {
        return new fcpt();
    }
}

