import java.util.Map;
import java.util.Objects;

public final class ezaf implements lsk {
    private final Map a;

    public ezaf(Map map0) {
        ibuq.f(map0, "providers");
        super();
        this.a = map0;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        ibuq.f(class0, "modelClass");
        ibnf ibnf0 = (ibnf)this.a.get(class0);
        lsb lsb0 = null;
        lsb lsb1 = ibnf0 == null ? null : ((lsb)ibnf0.get());
        if((lsb1 instanceof lsb)) {
            lsb0 = lsb1;
        }
        if(lsb0 != null) {
            return lsb0;
        }
        Objects.toString(class0);
        throw new IllegalArgumentException("Unknown modelClass: " + class0);
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

