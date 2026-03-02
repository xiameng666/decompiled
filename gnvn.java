import java.util.function.Supplier;

public final class gnvn implements Supplier {
    @Override
    public final Object get() {
        return new UnsupportedOperationException("Serialization is not supported for this type (or no SerializationOps with the capabilities was provided).");
    }
}

