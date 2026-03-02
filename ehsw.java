import java.text.DecimalFormat;

public final class ehsw {
    public static final gged_interceptors a;
    public static final gged_interceptors b;
    public static final gged_interceptors c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;

    static {
        ehsw.a = gged_interceptors.o(Integer.valueOf(3), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13));
        Float float0 = (float)10.1f;
        Float float1 = (float)1.4f;
        Float float2 = (float)0.03f;
        Float float3 = (float)1.8f;
        Float float4 = (float)0.3f;
        ehsw.b = gged_interceptors.r(new gfsz(((float)9.8f), ((float)40.0f)), new gfsz(((float)0.002f), ((float)0.4f)), new gfsz(((float)2.5f), float0), new gfsz(float1, ((float)3.5f)), new gfsz(float2, ((float)0.6f)), new gfsz(((float)1.2f), float3), new gfsz(((float)0.02f), float4));
        gfsz gfsz0 = new gfsz(float2, float4);
        gfsz gfsz1 = new gfsz(float1, float3);
        ehsw.c = gged_interceptors.r(new gfsz(((float)10.0f), ((float)14.0f)), new gfsz(((float)0.01f), ((float)0.07f)), new gfsz(float0, ((float)25.0f)), new gfsz(((float)2.1f), ((float)2.7f)), gfsz0, gfsz1, new gfsz(float2, ((float)0.15f)));
    }

    public ehsw() {
        throw null;
    }

    public ehsw(float f, float f1, float f2, float f3, float f4, float f5, float f6) {
        this.d = f;
        this.e = f1;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
        this.j = f6;
    }

    public static ehsv a() {
        ehsv ehsv0 = new ehsv();
        ehsv0.d(0.0f);
        ehsv0.c(0.0f);
        ehsv0.b(0.0f);
        ehsv0.h(0.0f);
        ehsv0.g(0.0f);
        ehsv0.f(0.0f);
        ehsv0.e(0.0f);
        return ehsv0;
    }

    public final float[] b() {
        return new float[]{this.d, this.e, this.f, this.g, this.h, this.i, this.j};
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehsw) && Float.floatToIntBits(this.d) == Float.floatToIntBits(((ehsw)object0).d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(((ehsw)object0).e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(((ehsw)object0).f) && Float.floatToIntBits(this.g) == Float.floatToIntBits(((ehsw)object0).g) && Float.floatToIntBits(this.h) == Float.floatToIntBits(((ehsw)object0).h) && Float.floatToIntBits(this.i) == Float.floatToIntBits(((ehsw)object0).i) && Float.floatToIntBits(this.j) == Float.floatToIntBits(((ehsw)object0).j);
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.j) ^ ((((((Float.floatToIntBits(this.d) ^ 1000003) * 1000003 ^ Float.floatToIntBits(this.e)) * 1000003 ^ Float.floatToIntBits(this.f)) * 1000003 ^ Float.floatToIntBits(this.g)) * 1000003 ^ Float.floatToIntBits(this.h)) * 1000003 ^ Float.floatToIntBits(this.i)) * 1000003;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        float[] arr_f = this.b();
        for(int v = 0; v < 7; ++v) {
            float f = arr_f[v];
            stringBuilder0.append(new DecimalFormat("0.00").format(((double)f)));
            stringBuilder0.append(",");
        }
        return stringBuilder0.toString();
    }
}

