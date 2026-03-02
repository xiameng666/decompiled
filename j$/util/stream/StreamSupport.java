package j$.util.stream;

import j..util.Objects;
import j..util.Spliterator;
import java.util.function.Supplier;

public final class StreamSupport {
    public static Stream stream(Spliterator spliterator0, boolean z) {
        Objects.requireNonNull(spliterator0);
        return __alloc_invoke__ k5, b(spliterator0, l7.n(spliterator0), z);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
    }

    public static Stream stream(Supplier supplier0, int v, boolean z) {
        Objects.requireNonNull(supplier0);
        return __alloc_invoke__ k5, b(supplier0, v & l7.f, z);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
    }
}

