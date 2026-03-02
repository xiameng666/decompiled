import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class doif implements doey {
    public final fhvw a;
    private final fhwk b;

    public doif(fhwk fhwk0, fhvw fhvw0) {
        this.b = fhwk0;
        this.a = fhvw0;
    }

    @Override  // doey
    public final uq a(ViewGroup viewGroup0) {
        return new uq(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0354, viewGroup0, false));  // layout:expired_passes_button
    }

    @Override  // doey
    public final void b(uq uq0, Object object0) {
        gftb.checkTrue(((edxb)object0) instanceof doid);
        fhvo fhvo0 = this.b.a.a(171061);
        this.b.g(uq0.a, fhvo0);
        doie doie0 = new doie(this);
        uq0.a.setOnClickListener(doie0);
    }

    @Override  // doey
    public final void c(uq uq0) {
        this.b.d(uq0.a);
    }
}

