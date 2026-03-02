import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Objects;

final class eqyv implements eqcq {
    final eqyw a;

    public eqyv(eqyw eqyw0) {
        Objects.requireNonNull(eqyw0);
        this.a = eqyw0;
        super();
    }

    @Override  // epyv
    public final void a(int v, String s, eqoc eqoc0) {
        this.a.d.d(v, eqoc0);
        eqyw.f.m("Account transfer errors out: %d, %s", new Object[]{v, s});
    }

    @Override  // epyv
    public final void b(MessagePayload messagePayload0) {
        this.a.n(messagePayload0);
    }

    @Override  // eqcq
    public final void c() {
        eqyw eqyw0 = this.a;
        erav erav0 = eqyw0.j;
        if(erav0 != null) {
            erav0.e(gjkj.N);
        }
        eqsl eqsl0 = eqyw0.D;
        if(eqsl0 != null) {
            eqsl0.b();
        }
    }
}

