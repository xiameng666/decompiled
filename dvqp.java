import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class dvqp implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;

    public dvqp(dolg dolg0, domw domw0) {
        dvqn dvqn0 = new dvqn(dolg0);
        this.a = dvqn0;
        dvqo dvqo0 = new dvqo(domw0);
        this.b = dvqo0;
        dlny dlny0 = new dlny(dlni.a, dvqo0);
        this.c = dlny0;
        efmg efmg0 = new efmg(dlni.a);
        this.d = efmg0;
        this.e = DoubleCheck.b(new dsol(dlni.a, dvqn0, dlny0, efmg0));
        this.f = DoubleCheck.b(new dspa(dlni.a, dvqn0, dlny0, efmg0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        Context context0 = dlnj.a();
        dsok dsok0 = (dsok)this.e.get();
        ((dvwc)object0).a = new dspe(context0, ((dsoz)this.f.get()));
    }
}

