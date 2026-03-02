import android.os.IBinder;

public final class ctse extends ibsl implements ibtw {
    int a;
    final ctox b;
    final ctsg c;
    final IBinder d;
    final ctoq e;
    private Object f;

    public ctse(ctox ctox0, ctsg ctsg0, IBinder iBinder0, ctoq ctoq0, ibrl ibrl0) {
        this.b = ctox0;
        this.c = ctsg0;
        this.d = iBinder0;
        this.e = ctoq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctse)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctse(this.b, this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.f;
            icnj icnj0 = this.b.b();
            ctsd ctsd0 = new ctsd(this.c, this.d, this.e, icck0);
            this.a = 1;
            if(icnj0.oR(ctsd0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

