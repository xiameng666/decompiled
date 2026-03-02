import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Map.Entry;

public final class ahao implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        ggeo ggeo0 = ggma.a(((gged_interceptors)object0), new ahag()).map;
        gged_interceptors gged0 = ggmo.g(new aenl(new ahah())).b().a(ggeo0.v());
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Map.Entry map$Entry0 = (Map.Entry)gged0.get(v1);
            ggdy0.i(((Credential)ggmo.g(new aenl(new ahai())).h(((Iterable)map$Entry0.getValue()))));
        }
        return ggdy0.h();
    }
}

