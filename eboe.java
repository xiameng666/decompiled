import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class eboe implements AndroidInjector {
    private final domv a;

    public eboe(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebwf ebwf0 = (ebwf)object0;
        ebwf0.d = dond.a();
        fsgp fsgp0 = new fsgp(this.a.a(), new edsl(dmgv.e(dmgy.a())), new bblp(1, 9));
        fhwb fhwb0 = this.a.h();
        fich fich0 = this.a.k();
        Preconditions.e(fich0);
        ebwf0.g = new fsge(fsgp0, fhwb0, fich0);
        ebwf0.e = new ebst(this.a.h());
    }
}

