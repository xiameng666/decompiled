package j$.time.format;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class q extends Enum implements e {
    public static final enum q INSENSITIVE;
    public static final enum q LENIENT;
    public static final enum q SENSITIVE;
    public static final enum q STRICT;
    public static final q[] a;

    static {
        q q0 = __alloc_invoke__ q, Enum("SENSITIVE", 0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        q.SENSITIVE = q0;
        q q1 = __alloc_invoke__ q, Enum("INSENSITIVE", 1);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        q.INSENSITIVE = q1;
        q q2 = __alloc_invoke__ q, Enum("STRICT", 2);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        q.STRICT = q2;
        q q3 = __alloc_invoke__ q, Enum("LENIENT", 3);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        q.LENIENT = q3;
        q.a = new q[]{q0, q1, q2, q3};
    }

    @Override  // j$.time.format.e
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        switch(this.ordinal()) {
            case 0: {
                v0.b = true;
                return v1;
            }
            case 1: {
                v0.b = false;
                return v1;
            }
            case 2: {
                v0.c = true;
                return v1;
            }
            case 3: {
                v0.c = false;
                return v1;
            }
            default: {
                return v1;
            }
        }
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "ParseCaseSensitive(true)";
            }
            case 1: {
                return "ParseCaseSensitive(false)";
            }
            case 2: {
                return "ParseStrict(true)";
            }
            case 3: {
                return "ParseStrict(false)";
            }
            default: {
                throw new IllegalStateException("Unreachable");
            }
        }
    }

    public static q valueOf(String s) {
        return (q)Enum.valueOf(q.class, s);
    }

    public static q[] values() {
        return (q[])q.a.clone();
    }
}

