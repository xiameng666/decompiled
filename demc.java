public final class demc {
    public final float a;
    public final float b;
    public final float c;
    private final int d;

    public demc(float f, float f1, int v) {
        this.a = 22.0f;
        this.b = f;
        this.c = f1;
        this.d = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof demc)) {
            return false;
        }
        if(!jkv.c(22.0f, 22.0f)) {
            return false;
        }
        if(!jkv.c(this.b, ((demc)object0).b)) {
            return false;
        }
        return jkv.c(this.c, ((demc)object0).c) ? this.d == ((demc)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((Float.floatToIntBits(22.0f) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "GridProperties(verticalSpacing=" + jkv.b(22.0f) + ", horizontalSpacing=" + jkv.b(this.b) + ", itemWidth=" + jkv.b(this.c) + ", maxColumns=" + this.d + ")";
    }
}

