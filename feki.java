import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class feki {
    public final ghga a;
    private static final ghfz b;

    static {
        feki.b = ghgd.a;
    }

    public feki() {
        this.a = feki.b.h();
    }

    public final byte[] a() {
        return this.a.s().e();
    }

    public final void b(int v, boolean z) {
        if(z) {
            this.e(v);
            this.a.j(1);
            ((ghfe)this.a).a(1);
        }
    }

    public final void c(int v, ByteString hfsf0) {
        if(!hfsf0.isEmpty()) {
            this.e(v);
            int v1 = hfsf0.size();
            this.a.j(v1);
            ByteBuffer byteBuffer0 = hfsf0.n();
            ((ghfe)this.a).b(byteBuffer0);
        }
    }

    public final void d(int v, int v1) {
        if(v1 != 0) {
            this.e(v);
            this.a.j(4);
            this.a.j(v1);
        }
    }

    public final void e(int v) {
        this.a.j(4);
        this.a.j(v);
    }

    public final void f(String s) {
        byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
        this.a.j(s.length());
        this.a.l(arr_b);
    }

    public final void g(int v, long v1) {
        if(v1 != 0L) {
            this.e(v);
            this.a.j(8);
            this.a.k(v1);
        }
    }

    public final void h(int v, String s) {
        if(!s.isEmpty()) {
            this.e(v);
            byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
            this.a.j(s.length());
            this.a.l(arr_b);
        }
    }

    public final void i(int v, List list0) {
        if(!list0.isEmpty()) {
            this.e(v);
            this.a.j(list0.size());
            for(Object object0: list0) {
                this.f(((String)object0));
            }
        }
    }

    public final void j(hfwn hfwn0) {
        if(!((ProtoLiteMessage)hfwn0).equals(hfyn.c)) {
            this.a.j(12);
            this.a.k(hfwn0.b);
            this.a.j(hfwn0.c);
        }
    }
}

