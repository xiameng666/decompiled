import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;
import j..util.Objects;

final class bljf implements evpo {
    final KeyCreationRequestOptions a;
    final bljg b;
    final ProtoLiteBuilder c;

    public bljf(bljg bljg0, ProtoLiteBuilder hftp0, KeyCreationRequestOptions keyCreationRequestOptions0) {
        this.c = hftp0;
        this.a = keyCreationRequestOptions0;
        Objects.requireNonNull(bljg0);
        this.b = bljg0;
        super();
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        gged_interceptors gged0 = (gged_interceptors)evql0.j();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            hery hery0 = (hery)gged0.get(v1);
            ProtoLiteBuilder hftp0 = this.c;
            ByteString hfsf0 = hery0.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hery hery1 = (hery)hftp0.b_message;
            hfsf0.getClass();
            hery1.b();
            hery1.i.add(hfsf0);
        }
        return ((blir)this.b.a.d()).c(((hery)this.c.N_build()), this.a.h);
    }
}

