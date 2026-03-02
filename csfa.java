import java.util.logging.Level;

final class csfa implements evqc {
    final boolean a;
    final csdj b;

    public csfa(boolean z, csdj csdj0) {
        this.a = z;
        this.b = csdj0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        if(this.a) {
            Level level0 = cslm.h();
            ((ggtj)csff.a.g(level0).s(exception0)).x("Set consent status failed on UX");
            this.b.o(exception0);
        }
    }
}

