import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class dvyh implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;

    public dvyh(dola dola0, domw domw0) {
        dolc dolc0 = new dolc(dola0);
        this.a = dolc0;
        dvyg dvyg0 = new dvyg(domw0);
        this.b = dvyg0;
        dlny dlny0 = new dlny(dlni.a, dvyg0);
        this.c = dlny0;
        efmg efmg0 = new efmg(dlni.a);
        this.d = efmg0;
        this.e = DoubleCheck.b(new dsol(dlni.a, dolc0, dlny0, efmg0));
        this.f = DoubleCheck.b(new dspa(dlni.a, dolc0, dlny0, efmg0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        Context context0 = dlnj.a();
        dsok dsok0 = (dsok)this.e.get();
        ((dvyl)object0).b = new dspe(context0, ((dsoz)this.f.get()));
    }
}

