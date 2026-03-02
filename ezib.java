import j..util.Collection.-EL;
import j..util.Objects;
import j..util.stream.Stream;
import java.util.LinkedHashSet;

public final class ezib implements evpz {
    public final ezil a;
    public final gged_interceptors b;

    public ezib(ezil ezil0, gged_interceptors gged0) {
        this.a = ezil0;
        this.b = gged0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        gged_interceptors gged0 = this.b;
        if(evql0.n()) {
            ezgl ezgl0 = (ezgl)Objects.requireNonNull(((ezgl)evql0.j()));
            Stream stream0 = Collection.-EL.stream(ezgl0.b(ezge.a.g()));
            ezfx ezfx0 = new ezfx();
            Objects.requireNonNull(ezgl0);
            ggeo ggeo0 = (ggeo)stream0.collect(ggaf.b(ezfx0, new ezfy(ezgl0)));
            ggef ggef0 = (ggef)Collection.-EL.stream(ggeo0.v()).filter(new ezfz()).collect(ggaf.a(new ezga(), new ezgb()));
            gged0 = ezge.a(gged0, new ezia(), ggef0, ggeo0);
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet(gged0);
        this.a.b.l(linkedHashSet0);
    }
}

