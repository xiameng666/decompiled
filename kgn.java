import android.os.Build.VERSION;
import android.view.View;
import j..util.Objects;

public class kgn {
    static final kgq f;
    final kgq g;

    static {
        kgd kgd0 = Build.VERSION.SDK_INT >= 34 ? new kge() : new kgd();
        kgn.f = kgd0.a().m().n().o();
    }

    public kgn(kgq kgq0) {
        this.g = kgq0;
    }

    public jxn a(int v) {
        return jxn.a;
    }

    public jxn c(int v) {
        if((v & 8) == 0) {
            return jxn.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public jxn d() {
        return jxn.a;
    }

    public kgq e(int v, int v1, int v2, int v3) {
        return kgn.f;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kgn) ? this.l() == ((kgn)object0).l() && this.s() == ((kgn)object0).s() && Objects.equals(this.d(), ((kgn)object0).d()) && Objects.equals(this.p(), ((kgn)object0).p()) && Objects.equals(this.t(), ((kgn)object0).t()) : false;
    }

    public void f(View view0) {
    }

    public void g(kgq kgq0) {
    }

    public void h(jxn[] arr_jxn) {
    }

    @Override
    public int hashCode() {
        jxn jxn0 = this.d();
        jxn jxn1 = this.p();
        return Objects.hash(new Object[]{Boolean.valueOf(this.l()), Boolean.valueOf(this.s()), jxn0, jxn1, this.t()});
    }

    public void i(jxn jxn0) {
    }

    public void j(kgq kgq0) {
    }

    public void k(int v) {
    }

    public boolean l() {
        return false;
    }

    public boolean n(int v) {
        return true;
    }

    public jxn p() {
        return jxn.a;
    }

    public kgq q() {
        return this.g;
    }

    public kgq r() {
        return this.g;
    }

    public boolean s() {
        return false;
    }

    public kdp t() {
        return null;
    }

    public kgq u() {
        return this.g;
    }

    public jxn v() {
        return this.d();
    }

    public jxn w() {
        return this.d();
    }

    public jxn x() {
        return this.d();
    }
}

