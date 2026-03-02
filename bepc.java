import java.util.Collection;

public final class bepc implements ibts {
    public final bepf a;

    public bepc(bepf bepf0) {
        this.a = bepf0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(!((bedv)object0).c()) {
            return new bedv(((bedv)object0).a, null, ((bedv)object0).c);
        }
        bepf bepf0 = this.a;
        if(bepf0.e != null && bepf0.e.size() > ((gged_interceptors)((bedv)object0).b).size()) {
            gged_interceptors gged0 = ggch.j(bepf0.e).l(new beox(((bedv)object0))).n();
            return new bedv(bedu.a, gged0, null);
        }
        if(bepf0.e == null) {
            gged_interceptors gged1 = (gged_interceptors)((bedv)object0).b;
            if(!gged1.isEmpty()) {
                bepf0.e = gged1;
            }
        }
        gged_interceptors gged2 = gged_interceptors.i(((Collection)((bedv)object0).b));
        return new bedv(bedu.a, gged2, null);
    }
}

