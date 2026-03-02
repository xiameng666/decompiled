import java.util.List;

public final class hmgc extends hmgf {
    public static hmgs a;
    public hmgz b;
    public hmgz c;
    public int d;

    public hmgc() {
        this.d = 3;
    }

    public final List a() {
        hmct hmct0 = this.p.b;
        return ((hmft)this.i).a ? hmct0.c.a.c : hmct0.b.a.c;
    }

    public static void b() {
        hmgc.a = null;
        hmhe.a().e();
    }

    public final void c() {
        this.d = 1;
    }

    public static void d(hmgs hmgs0) {
        hmbb hmbb0 = hmhe.a();
        if(hmgc.a == null) {
            hmgc.a = hmgs0;
            hmbb0.e();
            return;
        }
        hmbb0.d(">>> sPreviousTapContext is already set", new Object[0]);
    }

    @Override  // hmgf
    public final int e() {
        return 1;
    }
}

