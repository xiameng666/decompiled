import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import j..util.Objects;
import java.util.Locale;
import java.util.function.Consumer;

public final class aknt implements luo {
    final PhoneskyDpcInstallChimeraActivity a;
    private final Consumer b;

    public aknt(PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity0, Consumer consumer0) {
        Objects.requireNonNull(phoneskyDpcInstallChimeraActivity0);
        this.a = phoneskyDpcInstallChimeraActivity0;
        super();
        this.b = consumer0;
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        return new aknz(this.a, this.a.k);
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        if(((int)(((Integer)object0))) < 0) {
            switch(((int)(((Integer)object0)))) {
                case -6: 
                case -5: 
                case -4: {
                    this.a.l.h();
                    this.a.l.i();
                    return;
                }
                case -3: {
                    this.b.accept(akrp.g);
                    this.a.n(2);
                    return;
                }
                case -2: {
                    this.b.accept(akrp.f);
                    this.a.n(3);
                    return;
                }
                case -1: {
                    this.b.accept(akrp.d);
                    this.a.n(-1);
                    return;
                }
                default: {
                    Locale locale0 = Locale.US;
                    java.util.Objects.toString(((Integer)object0));
                    Log.e("Auth", String.format(locale0, "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Unrecognized Result: " + ((Integer)object0)));
                }
            }
        }
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }
}

