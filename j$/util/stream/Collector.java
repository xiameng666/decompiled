package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Collector {
    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public static final class Characteristics extends Enum {
        public static final enum Characteristics CONCURRENT;
        public static final enum Characteristics IDENTITY_FINISH;
        public static final enum Characteristics UNORDERED;
        public static final Characteristics[] a;

        static {
            Characteristics collector$Characteristics0 = __alloc_invoke__ Characteristics, Enum("CONCURRENT", 0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            Characteristics.CONCURRENT = collector$Characteristics0;
            Characteristics collector$Characteristics1 = __alloc_invoke__ Characteristics, Enum("UNORDERED", 1);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            Characteristics.UNORDERED = collector$Characteristics1;
            Characteristics collector$Characteristics2 = __alloc_invoke__ Characteristics, Enum("IDENTITY_FINISH", 2);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            Characteristics.IDENTITY_FINISH = collector$Characteristics2;
            Characteristics.a = new Characteristics[]{collector$Characteristics0, collector$Characteristics1, collector$Characteristics2};
        }

        public static Characteristics valueOf(String s) {
            return (Characteristics)Enum.valueOf(Characteristics.class, s);
        }

        public static Characteristics[] values() {
            return (Characteristics[])Characteristics.a.clone();
        }
    }

    BiConsumer accumulator();

    Set characteristics();

    BinaryOperator combiner();

    Function finisher();

    Supplier supplier();
}

