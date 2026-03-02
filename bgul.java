import com.android.settingslib.widget.MainSwitchPreference;
import j..util.Objects;

final class bgul implements gmbg {
    final MainSwitchPreference a;
    final bgus b;

    public bgul(bgus bgus0, MainSwitchPreference mainSwitchPreference0) {
        this.a = mainSwitchPreference0;
        Objects.requireNonNull(bgus0);
        this.b = bgus0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(bgus.d.h(), "load ux opt-in exception", throwable0);
        this.b.al.f();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        this.a.H(true);
        this.a.k(boolean0.booleanValue());
        bguk bguk0 = new bguk(this);
        this.a.aj(bguk0);
        this.b.al.e(boolean0.booleanValue());
    }
}

