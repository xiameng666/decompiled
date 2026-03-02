public final class fy {
    public int a;
    public du b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public lpf h;
    public lpf i;

    public fy() {
    }

    public fy(int v, du du0) {
        this.a = v;
        this.b = du0;
        this.c = false;
        this.h = lpf.e;
        this.i = lpf.e;
    }

    public fy(int v, du du0, byte[] arr_b) {
        this.a = v;
        this.b = du0;
        this.c = true;
        this.h = lpf.e;
        this.i = lpf.e;
    }

    public fy(du du0, lpf lpf0) {
        this.a = 10;
        this.b = du0;
        this.c = false;
        this.h = du0.Y;
        this.i = lpf0;
    }

    public fy(fy fy0) {
        this.a = fy0.a;
        this.b = fy0.b;
        this.c = fy0.c;
        this.d = fy0.d;
        this.e = fy0.e;
        this.f = fy0.f;
        this.g = fy0.g;
        this.h = fy0.h;
        this.i = fy0.i;
    }
}

