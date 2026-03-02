public final class eitw {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;

    public eitw() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    final int a() {
        return this.e - this.g;
    }

    final boolean b() {
        return this.d == 1 && this.c == 1 && (this.e == 0 || this.g == 1) || this.a > 0 && this.c > 1 && (this.b == 0 || this.a() == 0);
    }
}

