import j..util.Objects;

final class iauu extends iavq {
    final iapk a;
    final iaof_metadata b;
    final iauw c;

    public iauu(iauw iauw0, iapk iapk0, iaof_metadata iaof0) {
        this.a = iapk0;
        this.b = iaof0;
        Objects.requireNonNull(iauw0);
        this.c = iauw0;
        super(iauw0.c.e);
    }

    @Override  // iavq
    public final void a() {
        iauw iauw0 = this.c;
        iauw0.c.f.b();
        iapk iapk0 = this.a;
        iaof_metadata iaof0 = this.b;
        iapk iapk1 = iauw0.b;
        if(iapk1 != null) {
            iaof0 = new iaof_metadata();
            iapk0 = iapk1;
        }
        try {
            iaux.g(iauw0.a, iapk0, iaof0);
        }
        finally {
            this.c.c.d.a(iapk0.h());
        }
    }
}

