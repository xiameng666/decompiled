import j..util.Collection.-EL;
import j..util.stream.Collectors;

public final class apoq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((ggfp)object0) == null) {
            return gfqx.a;
        }
        ggqj ggqj0 = ((ggfp)object0).om();
        while(ggqj0.hasNext()) {
            Object object1 = ggqj0.next();
            Object object2 = ((amnm)object1).a;
            if((object2 instanceof amog)) {
                return gfsx.m(((String)Collection.-EL.stream(gged_interceptors.n(((amog)object2).c, ((amog)object2).e, ((amog)object2).d)).filter(new apoi()).collect(Collectors.joining(" "))));
            }
        }
        return gfqx.a;
    }
}

