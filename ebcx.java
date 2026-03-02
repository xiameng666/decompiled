import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import j..util.Optional;

final class ebcx implements AndroidInjector {
    private final dola a;
    private final dmgr b;
    private final domq c;

    public ebcx(dola dola0, dmgr dmgr0, domq domq0) {
        this.a = dola0;
        this.b = dmgr0;
        this.c = domq0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebdx ebdx0 = (ebdx)object0;
        Context context0 = dlnj.a();
        String s = dolf.b(this.a);
        String s1 = dole.b(this.a);
        String s2 = dmgy.a();
        dmgo dmgo0 = new dmgo(dlnj.a(), new dmkl(dlnj.a()));
        ebdx0.b = new dqib(dmhh.b(context0, s, s1, s2, this.b.a, Optional.empty()), dmgo0);
        dqng dqng0 = this.c.b();
        Preconditions.e(dqng0);
        ebdx0.c = dqng0;
    }
}

