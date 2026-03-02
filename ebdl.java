import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;

final class ebdl implements AndroidInjector {
    private final dola a;
    private final domv b;

    public ebdl(dola dola0, domv domv0) {
        this.a = dola0;
        this.b = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebep ebep0 = (ebep)object0;
        ebep0.a = new dqlm(dole.b(this.a), dolf.b(this.a), dmgy.a(), this.b.a(), new dsie(dole.b(this.a), dmgy.a(), this.b.a()), new earo(this.b.a(), dole.b(this.a), dmgy.a(), new earr(this.b.a(), dole.b(this.a), dmgy.a())), DoubleCheck.a(dxyf.a), this.b.h());
        ebep0.b = easi.a();
    }
}

