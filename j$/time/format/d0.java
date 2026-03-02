package j$.time.format;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class d0 extends Enum {
    public static final enum d0 ALWAYS;
    public static final enum d0 EXCEEDS_PAD;
    public static final enum d0 NEVER;
    public static final enum d0 NORMAL;
    public static final enum d0 NOT_NEGATIVE;
    public static final d0[] a;

    static {
        d0 d00 = __alloc_invoke__ d0, Enum("NORMAL", 0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        d0.NORMAL = d00;
        d0 d01 = __alloc_invoke__ d0, Enum("ALWAYS", 1);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        d0.ALWAYS = d01;
        d0 d02 = __alloc_invoke__ d0, Enum("NEVER", 2);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        d0.NEVER = d02;
        d0 d03 = __alloc_invoke__ d0, Enum("NOT_NEGATIVE", 3);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        d0.NOT_NEGATIVE = d03;
        d0 d04 = __alloc_invoke__ d0, Enum("EXCEEDS_PAD", 4);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        d0.EXCEEDS_PAD = d04;
        d0.a = new d0[]{d00, d01, d02, d03, d04};
    }

    public static d0 valueOf(String s) {
        return (d0)Enum.valueOf(d0.class, s);
    }

    public static d0[] values() {
        return (d0[])d0.a.clone();
    }
}

