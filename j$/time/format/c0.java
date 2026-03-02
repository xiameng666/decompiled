package j$.time.format;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class c0 extends Enum {
    public static final enum c0 LENIENT;
    public static final enum c0 SMART;
    public static final enum c0 STRICT;
    public static final c0[] a;

    static {
        c0 c00 = __alloc_invoke__ c0, Enum("STRICT", 0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        c0.STRICT = c00;
        c0 c01 = __alloc_invoke__ c0, Enum("SMART", 1);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        c0.SMART = c01;
        c0 c02 = __alloc_invoke__ c0, Enum("LENIENT", 2);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        c0.LENIENT = c02;
        c0.a = new c0[]{c00, c01, c02};
    }

    public static c0 valueOf(String s) {
        return (c0)Enum.valueOf(c0.class, s);
    }

    public static c0[] values() {
        return (c0[])c0.a.clone();
    }
}

