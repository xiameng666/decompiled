import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public class dohl implements dohf {
    private final String a;
    private final String b;
    private final gtlk c;
    private final String d;

    public dohl(Valuable valuable0) {
        ibuq.f(valuable0, "valuable");
        super();
        ibuq.e(valuable0.b, "id");
        this.a = valuable0.b;
        String s = valuable0.p.f;
        ibuq.e(s, "getGroupingSubtitle(...)");
        this.b = s;
        gtlj gtlj0 = valuable0.z.r == null ? gtlj.a : valuable0.z.r;
        gtlk gtlk0 = gtlk.b(gtlj0.b) == null ? gtlk.e : gtlk.b(gtlj0.b);
        ibuq.e(gtlk0, "getSurfacingState(...)");
        this.c = gtlk0;
        String s1 = valuable0.p.e;
        ibuq.e(s1, "getGroupingTitle(...)");
        this.d = s1;
    }

    @Override  // edxb
    public final int a(edxb edxb0) {
        edxa.b(edxb0);
        return 0;
    }

    @Override  // edxb
    public final int b() {
        return 0;
    }

    @Override  // edxb
    public final long c() {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // edxb
    public final String d() {
        return this.a;
    }

    @Override  // edxb
    public final boolean e() {
        return false;
    }

    @Override  // dohf
    public int f() {
        return 0x7F080B31;  // drawable:quantum_gm_ic_confirmation_number_vd_theme_24
    }

    @Override  // edxb
    public final boolean g(edxb edxb0) {
        return (edxb0 instanceof dohl) && ibuq.m(this.a, ((dohl)edxb0).a) && this.f() == ((dohl)edxb0).f() && ibuq.m(this.h(), ((dohl)edxb0).h()) && this.c == ((dohl)edxb0).c && ibuq.m(this.d, ((dohl)edxb0).d);
    }

    @Override  // dohf
    public String h() {
        return this.b;
    }

    @Override  // dohf
    public final String i() {
        return this.d;
    }
}

