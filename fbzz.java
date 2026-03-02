import android.os.Bundle;
import com.google.android.wallet.clientlog.LogContext;
import java.util.List;
import java.util.Locale;

public final class fbzz implements gcjk, gcjp {
    public final gevx a;
    public fcaa b;
    protected final int c;
    protected final String d;
    protected final LogContext e;
    public final fm f;
    public gcjn g;

    public fbzz(gevx gevx0, gdcl gdcl0) {
        this.a = gevx0;
        this.c = gdcl0.c;
        this.d = gdcl0.f;
        this.e = gdcl0.e;
        this.f = gdcl0.b;
        du du0 = gdcl0.b.h(this.a());
        if((du0 instanceof fcaa)) {
            this.b = (fcaa)du0;
            ((fcaa)du0).ag = this.g;
        }
    }

    @Override  // gcjp
    public final void K(gffq gffq0, List list0) {
        int v = gfev.a(gffq0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        switch(v - 1) {
            case 1: {
                gcjn gcjn0 = this.g;
                fcaa fcaa0 = new fcaa();
                Bundle bundle0 = new Bundle();
                bundle0.putString("analyticsId", this.d);
                bundle0.putInt("themeResourceId", this.c);
                bundle0.putParcelable("parentLogContext", this.e);
                gciq.j(bundle0, "argDialogProto", ((MessageLite)this.a));
                fcaa0.setArguments(bundle0);
                fcaa0.ag = gcjn0;
                this.b = fcaa0;
                fcaa0.show(this.f, this.a());
                return;
            }
            case 11: {
                fcaa fcaa1 = this.b;
                if(fcaa1 != null) {
                    fcaa1.lr();
                    ca ca0 = new ca(this.f);
                    ca0.o(this.b);
                    ca0.a();
                    this.b = null;
                }
                return;
            }
            default: {
                Locale locale0 = Locale.US;
                int v2 = gfev.a(gffq0.e);
                if(v2 != 0) {
                    v1 = v2;
                }
                throw new IllegalArgumentException(String.format(locale0, "Unsupported ResultingActionReference action type %s", ((int)(v1 - 1))));
            }
        }
    }

    public final String a() {
        return String.format(Locale.US, "dialog%d", ((long)this.a.b));
    }

    @Override  // gcjk
    public final void lr() {
        du du0 = this.f.h(this.a());
        if((du0 instanceof fcaa)) {
            this.b = (fcaa)du0;
            ((fcaa)du0).lr();
        }
        gcjo.c(this, this.a.b, this.g);
    }
}

