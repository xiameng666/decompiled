import android.os.PersistableBundle;

final class rwi implements ibum, icih {
    final rut a;

    public rwi(rut rut0) {
        this.a = rut0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        this.a.fe(((PersistableBundle)object0));
        return ibom.a;
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibue(2, this.a, rut.class, "onTaskMetadataUpdated", "onTaskMetadataUpdated(Landroid/os/PersistableBundle;)V", 4);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof icih) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }
}

