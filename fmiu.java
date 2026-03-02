import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;

public final class fmiu implements gmbg {
    final fmjo a;
    final fmga b;
    final AccountContext c;
    final fmiv d;

    public fmiu(fmiv fmiv0, fmjo fmjo0, fmga fmga0, AccountContext accountContext0) {
        this.a = fmjo0;
        this.b = fmga0;
        this.c = accountContext0;
        Objects.requireNonNull(fmiv0);
        this.d = fmiv0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        switch(iapk.d(throwable0).t.ordinal()) {
            case 3: 
            case 5: {
                fmjn fmjn0 = new fmjn(this.a);
                fmjn0.b(2);
                fmjo fmjo0 = fmjn0.a();
                fmfm fmfm0 = new fmfm(this.b);
                fmfo fmfo0 = new fmfo();
                fmfo0.c("photos");
                fmfo0.b(((byte[])fmia.c(fmjo0).d()));
                fmfm0.q(fmfo0.a());
                fmga fmga0 = fmfm0.a();
                this.d.f.b(this.c).V(fmga0);
            }
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        fmix fmix0 = (fmix)object0;
    }
}

