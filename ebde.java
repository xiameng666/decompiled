import android.content.Context;
import dagger.android.AndroidInjector;
import j..util.Optional;

final class ebde implements AndroidInjector {
    private final dola a;
    private final dmgr b;

    public ebde(dola dola0, dmgr dmgr0) {
        this.a = dola0;
        this.b = dmgr0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebee ebee0 = (ebee)object0;
        ebee0.a = new dsie(dole.b(this.a), dmgy.a(), dlnj.a());
        Context context0 = dlnj.a();
        String s = dolf.b(this.a);
        String s1 = dole.b(this.a);
        String s2 = dmgy.a();
        dmgo dmgo0 = new dmgo(dlnj.a(), new dmkl(dlnj.a()));
        ebee0.b = new dqhz(dmhh.b(context0, s, s1, s2, this.b.a, Optional.empty()), dmgo0);
    }
}

