import android.os.Parcel;

final class iarq extends iart {
    public final boolean a;
    private iapk h;
    private iaof_metadata i;

    public iarq(iarm iarm0, iakk iakk0, int v, boolean z) {
        super(iarm0, iakk0, v);
        this.a = z;
    }

    @Override  // iart
    protected final void a(iapk iapk0) {
        ibfq ibfq0 = this.g;
        iaof_metadata iaof0 = new iaof_metadata();
        ((iava)ibfq0).a(iapk0, iauz.a, iaof0);
    }

    @Override  // iart
    protected final void b() {
        this.f.m();
        this.l(iarr.f);
        ((iava)this.g).a(this.h, iauz.a, this.i);
        this.n();
    }

    @Override  // iart
    public final void c(int v, Parcel parcel0) {
        this.h = iasy.a(v, parcel0);
        this.i = iasg.a(parcel0, this.c);
    }

    @Override  // iart
    public final boolean d() {
        return this.a;
    }

    @Override  // iart
    public final void e(Parcel parcel0) {
        iaof_metadata iaof0 = iasg.a(parcel0, this.c);
        this.f.d();
        ((iava)this.g).c(iaof0);
    }
}

