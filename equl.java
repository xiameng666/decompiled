import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class equl implements gmbg {
    final eqvw a;

    public equl(equm equm0, eqvw eqvw0) {
        this.a = eqvw0;
        Objects.requireNonNull(equm0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        equm.a.e("Cleanup the restoreInformation failed.", throwable0, new Object[0]);
        Status status0 = new Status(13);
        equm.m(this.a, status0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        equm.a.d("Successfully cleanup the restoreInformation.", new Object[0]);
        equm.m(this.a, Status.b);
    }
}

