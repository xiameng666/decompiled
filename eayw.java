import android.content.Context;
import dagger.android.AndroidInjector;
import j..util.Optional;

final class eayw implements AndroidInjector {
    private final dola a;
    private final dmgr b;

    public eayw(dola dola0, dmgr dmgr0) {
        this.a = dola0;
        this.b = dmgr0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        Context context0 = dlnj.a();
        dlnm dlnm0 = new dlnm(new acqn(dlnj.a()), dolf.b(this.a), dole.b(this.a));
        Context context1 = dlnj.a();
        String s = dolf.b(this.a);
        String s1 = dole.b(this.a);
        String s2 = dmgy.a();
        dlmc dlmc0 = new dlmc(dlnj.a(), dole.b(this.a), dmgy.a());
        ((ebcb)object0).a = new edpn(context0, dlnm0, dmhh.b(context1, s, s1, s2, this.b.a, Optional.empty()), dlmc0);
    }
}

