public class bwwb {
    public int a;
    public int b;
    private final char[] c;

    public bwwb(String s) {
        this.c = s.toCharArray();
    }

    public final char a() {
        return this.c[this.a];
    }

    public final bwvz b(String s) {
        return this.c(s, this.a);
    }

    public final bwvz c(String s, int v) {
        return new bwvz(v, new String(this.c), s);
    }

    public final bwwa d() {
        return new bwwa(this.b, new String(this.c, this.b, this.a - this.b));
    }

    public final void e() {
        this.b = this.a;
    }

    public final void f() {
        ++this.a;
    }

    public final void g() {
        while(!this.h() && Character.isWhitespace(this.a())) {
            this.f();
        }
    }

    public final boolean h() {
        return this.a == this.c.length;
    }

    protected static boolean i(char c) {
        return c >= 0x30 && c <= 57;
    }
}

