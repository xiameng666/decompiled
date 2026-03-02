import androidx.preference.Preference;

public final class aspy {
    public final Preference a;
    public final String b;
    private cmea c;

    public aspy(Preference preference0) {
        this.a = preference0;
        String s = preference0.s;
        ibuq.e(s, "getKey(...)");
        this.b = s;
    }

    public final cmea a() {
        cmea cmea0 = this.c;
        if(cmea0 != null) {
            return cmea0;
        }
        throw new IllegalStateException("Preference not instrumented.");
    }

    public final void b(cmea cmea0, int v) {
        this.c = cmea0;
        cmea0.a(this.b, v);
    }

    public final void c(boolean z) {
        this.a.H(z);
    }

    public final void d(int v) {
        this.a.I(v);
    }

    public final void e(ibth ibth0) {
        if(ibth0 == null) {
            this.a.o = null;
            return;
        }
        this.a.o = new aspw(this, ibth0);
    }

    public final void f(CharSequence charSequence0) {
        this.a.n(charSequence0);
    }

    public final void g(boolean z) {
        this.a.T(z);
        this.a().d(this.b, (z ? 1 : 2));
    }
}

