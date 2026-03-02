import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class dxnh implements lsk {
    private final ibnf a;
    private final ibnf b;
    private final ftem c;

    @AssistedInject
    public dxnh(ibnf ibnf0, ibnf ibnf1, @Assisted ftem ftem0) {
        ibuq.f(ftem0, "purchasePreviewConfig");
        super();
        this.a = ibnf0;
        this.b = ibnf1;
        this.c = ftem0;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        ibuq.f(class0, "modelClass");
        if(class0.isAssignableFrom(dxmi.class)) {
            return (this.c.b & 0x1000000) != 0 ? ((dxqc)this.b).a() : ((dxsu)this.a).a();
        }
        throw new IllegalArgumentException("Unknown view model class: " + class0.getName());
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

