public final class iev {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean e;

    public iev() {
        this.a = 10.0f;
        this.b = 40.0f;
        this.c = 10.0f;
        this.d = 40.0f;
        this.e = true;
    }

    public static final long a(jks jks0) {
        return ijj.b(jks0.ei(10.0f), jks0.ei(40.0f), jks0.ei(10.0f), jks0.ei(40.0f));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof iev)) {
            return false;
        }
        iev iev0 = (iev)object0;
        if(!jkv.c(10.0f, 10.0f)) {
            return false;
        }
        if(!jkv.c(40.0f, 40.0f)) {
            return false;
        }
        return jkv.c(10.0f, 10.0f) ? jkv.c(40.0f, 40.0f) : false;
    }

    @Override
    public final int hashCode() {
        return (((Float.floatToIntBits(10.0f) * 0x1F + Float.floatToIntBits(40.0f)) * 0x1F + Float.floatToIntBits(10.0f)) * 0x1F + Float.floatToIntBits(40.0f)) * 0x1F + 0x4CF;
    }

    @Override
    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + jkv.b(10.0f) + ", top=" + jkv.b(40.0f) + ", end=" + jkv.b(10.0f) + ", bottom=" + jkv.b(40.0f) + ", isLayoutDirectionAware=true)";
    }
}

