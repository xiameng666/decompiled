import com.android.settingslib.widget.MainSwitchPreference;
import j..util.Objects;

final class bgtz implements gmbg {
    final MainSwitchPreference a;
    final bgug b;

    public bgtz(bgug bgug0, MainSwitchPreference mainSwitchPreference0) {
        this.a = mainSwitchPreference0;
        Objects.requireNonNull(bgug0);
        this.b = bgug0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(bgug.d.h(), "load ux opt-in exception", throwable0);
        this.b.ak.f();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        this.a.H(true);
        this.a.k(boolean0.booleanValue());
        this.a.n = new bgty(this);
        this.b.ak.e(boolean0.booleanValue());
    }
}

