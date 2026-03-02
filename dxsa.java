import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class dxsa implements lsk {
    private final ibnf a;
    private final ibnf b;
    private final ftej c;

    @AssistedInject
    public dxsa(ibnf ibnf0, ibnf ibnf1, @Assisted ftej ftej0) {
        ibuq.f(ftej0, "processPaymentConfig");
        super();
        this.a = ibnf0;
        this.b = ibnf1;
        this.c = ftej0;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        ibuq.f(class0, "modelClass");
        if(!class0.isAssignableFrom(dxmj.class)) {
            throw new IllegalArgumentException("Unknown view model class: " + class0.getName());
        }
        int v = this.c.b;
        if((v & 0x800) == 0) {
            if((v & 0x20000) != 0) {
                return ((dxqj)this.b).a();
            }
            throw new IllegalArgumentException("Must have either transit options or secure element options in processPaymentConfig.");
        }
        return ((dxsx)this.a).a();
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        return lsi.c(this, class0);
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

