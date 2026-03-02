public final class zhw {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zhw(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zhw)) {
            return false;
        }
        if(Float.compare(this.a, ((zhw)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((zhw)object0).b) != 0) {
            return false;
        }
        return Float.compare(this.c, ((zhw)object0).c) == 0 ? Float.compare(this.d, ((zhw)object0).d) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d);
    }

    @Override
    public final String toString() {
        return "ASColor(alpha=" + this.a + ", red=" + this.b + ", green=" + this.c + ", blue=" + this.d + ")";
    }
}

