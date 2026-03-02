import j..util.Collection.-EL;
import java.util.List;

public final class ahdc implements bxto {
    public final ahdg a;

    public ahdc(ahdg ahdg0) {
        this.a = ahdg0;
    }

    @Override  // bxto
    public final Object a(Object object0) {
        return (gged_interceptors)ggpa.b(Collection.-EL.stream(this.a.b), Collection.-EL.stream(((List)object0)), new ahde()).collect(ggaf.a);
    }
}

