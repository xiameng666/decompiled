import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.Set;

public final class dtwd implements evqf {
    public final dtwk a;

    public dtwd(dtwk dtwk0) {
        this.a = dtwk0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Set set0 = (Set)Collection.-EL.stream(((gtxe)object0).b).filter(new dtwf()).collect(Collectors.toSet());
        this.a.e(set0);
    }
}

