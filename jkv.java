public final class jkv implements Comparable {
    public final float a;

    public jkv(float f) {
        this.a = f;
    }

    public static int a(float f, float f1) {
        return Float.isNaN(f) || Float.isNaN(f1) ? 0 : Float.compare(f, f1);
    }

    public static String b(float f) {
        return Float.isNaN(f) ? "Dp.Unspecified" : f + ".dp";
    }

    public static final boolean c(float f, float f1) {
        return Float.compare(f, f1) == 0;
    }

    @Override
    public final int compareTo(Object object0) {
        return jkv.a(this.a, ((jkv)object0).a);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof jkv) && Float.compare(this.a, ((jkv)object0).a) == 0;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public final String toString() {
        return jkv.b(this.a);
    }
}

