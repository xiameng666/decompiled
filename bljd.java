import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;
import j..util.Objects;

final class bljd implements evpo {
    final KeyCreationRequestOptions a;
    final bljg b;

    public bljd(bljg bljg0, KeyCreationRequestOptions keyCreationRequestOptions0) {
        this.a = keyCreationRequestOptions0;
        Objects.requireNonNull(bljg0);
        this.b = bljg0;
        super();
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        ggdy ggdy0 = new ggdy();
        if(evql0.n()) {
            gged_interceptors gged0 = (gged_interceptors)evql0.j();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                hery hery0 = (hery)gged0.get(v1);
                ggdy0.i(((blir)this.b.a.d()).a(this.a.h, hery0));
            }
        }
        return evrg.e(ggdy0.h());
    }
}

