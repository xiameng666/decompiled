public final class ehsu {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    private final long f;

    public ehsu() {
        throw null;
    }

    public ehsu(long v, int v1, float f, float f1, float f2, float f3) {
        this.f = v;
        this.a = v1;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
    }

    public static float a(float f, long v, float f1, long v1) {
        return (f1 - f) / ((float)(v1 - v));
    }

    public static float b(int v, ehsl ehsl0) {
        if(v + 1 < ehsl0.a) {
            long v1 = ehsl0.c(v);
            float f = ehsu.c(v, ehsl0);
            long v2 = ehsl0.c(v + 1);
            return v1 == -1L || v2 == -1L ? NaNf : ehsu.a(f, v1, ehsu.c(v + 1, ehsl0), v2);
        }
        return NaNf;
    }

    public static float c(int v, ehsl ehsl0) {
        return (float)ehsr.a(ehsl0.a(v, 0), ehsl0.a(v, 1), ehsl0.a(v, 2));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehsu) && this.f == ((ehsu)object0).f && this.a == ((ehsu)object0).a && Float.floatToIntBits(this.b) == Float.floatToIntBits(((ehsu)object0).b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(((ehsu)object0).c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(((ehsu)object0).d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(((ehsu)object0).e);
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.e) ^ (((((((int)(this.f ^ this.f >>> 0x20)) ^ 1000003) * 1000003 ^ this.a) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ Float.floatToIntBits(this.c)) * 1000003 ^ Float.floatToIntBits(this.d)) * 1000003;
    }

    @Override
    public final String toString() {
        return "Signature:" + this.c + ";" + this.d + ";" + this.e;
    }
}

