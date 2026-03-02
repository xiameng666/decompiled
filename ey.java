import android.os.Bundle;

final class ey implements lpp {
    final String a;
    final fs b;
    final lpg c;
    final fm d;

    public ey(fm fm0, String s, fs fs0, lpg lpg0) {
        this.d = fm0;
        this.a = s;
        this.b = fs0;
        this.c = lpg0;
        super();
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        if(lpe0 == lpe.ON_START) {
            fm fm0 = this.d;
            String s = this.a;
            Bundle bundle0 = (Bundle)fm0.k.get(s);
            if(bundle0 != null) {
                this.b.a(s, bundle0);
                fm0.u(s);
            }
        }
        if(lpe0 == lpe.ON_DESTROY) {
            this.c.d(this);
            this.d.l.remove(this.a);
        }
    }
}

