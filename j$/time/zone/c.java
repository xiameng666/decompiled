package j$.time.zone;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class c extends Enum {
    public static final enum c STANDARD;
    public static final enum c UTC;
    public static final enum c WALL;
    public static final c[] a;

    static {
        c c0 = __alloc_invoke__ c, Enum("UTC", 0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        c.UTC = c0;
        c c1 = __alloc_invoke__ c, Enum("WALL", 1);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        c.WALL = c1;
        c c2 = __alloc_invoke__ c, Enum("STANDARD", 2);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        c.STANDARD = c2;
        c.a = new c[]{c0, c1, c2};
    }

    public static c valueOf(String s) {
        return (c)Enum.valueOf(c.class, s);
    }

    public static c[] values() {
        return (c[])c.a.clone();
    }
}

