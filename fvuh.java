public final class fvuh {
    public int a;
    public String b;
    public float c;
    private final int d;
    private final int e;
    private final int f;
    private float g;
    private float h;
    private String i;

    public fvuh(int v, int v1, int v2) {
        this.g = -Infinityf;
        this.h = -1.0f;
        this.i = "";
        this.a = 0x80000000;
        this.b = "";
        this.c = 0.5f;
        this.d = v;
        this.e = v1;
        this.f = v2;
    }

    public final fvui a() {
        return this.g == -Infinityf && this.h == -1.0f && "".equals(this.i) && this.a == 0x80000000 && "".equals(this.b) && this.c == 0.5f ? new fvui(this.d, this.e, this.f) : new fvuw(this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.b, this.c);
    }

    public final void b(float f, float f1) {
        if(Float.compare(f, -Infinityf) == 0 || f1 == -1.0f) {
            f = -Infinityf;
            f1 = -1.0f;
        }
        this.g = f;
        this.h = f1;
    }

    public final void c(String s) {
        if(s == null) {
            s = "";
        }
        this.i = s;
    }
}

