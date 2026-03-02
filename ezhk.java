import j..util.Collection.-EL;
import j..util.Objects;
import j..util.stream.Stream;
import java.util.LinkedHashSet;

public final class ezhk implements evpz {
    public final ezho a;
    public final evql b;
    public final ggdy c;

    public ezhk(ezho ezho0, evql evql0, ggdy ggdy0) {
        this.a = ezho0;
        this.b = evql0;
        this.c = ggdy0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        gged_interceptors gged0;
        ggdy ggdy0 = this.c;
        if(bbqa.c()) {
            evql evql1 = this.b;
            if(evql1 != null && evql1.n()) {
                ezgl ezgl0 = (ezgl)Objects.requireNonNull(((ezgl)evql1.j()));
                Stream stream0 = Collection.-EL.stream(ezgl0.b(ezge.a.g()));
                ezfx ezfx0 = new ezfx();
                Objects.requireNonNull(ezgl0);
                ggeo ggeo0 = (ggeo)stream0.collect(ggaf.b(ezfx0, new ezfy(ezgl0)));
                ggef ggef0 = (ggef)Collection.-EL.stream(ggeo0.v()).filter(new ezfz()).collect(ggaf.a(new ezga(), new ezgb()));
                gged0 = ezge.a(ggdy0.h(), new ezhg(), ggef0, ggeo0);
            }
            else {
                gged0 = ggdy0.h();
            }
        }
        else {
            gged0 = ggdy0.h();
        }
        ezhf ezhf0 = new ezhf(false, new LinkedHashSet(gged0));
        this.a.c.l(ezhf0);
    }
}

