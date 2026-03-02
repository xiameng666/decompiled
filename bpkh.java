import j..util.Objects;
import java.util.HashMap;
import java.util.Map;

final class bpkh {
    final bpkl a;
    private final Map b;

    public bpkh(bpkl bpkl0) {
        Objects.requireNonNull(bpkl0);
        this.a = bpkl0;
        super();
        this.b = new HashMap();
    }

    final gtch a(gsyz gsyz0) {
        gtch gtch2;
        synchronized(this.a.k) {
            Map map0 = this.b;
            gtch gtch0 = (gtch)map0.get(gsyz0);
            if(gtch0 != null) {
                return gtch0;
            }
            if(map0.size() == 0x100) {
                map0.clear();
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtch.a).v_newBuilder();
            ByteString hfsf0 = frai.d(gsyz0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gtch gtch1 = (gtch)hftp0.b_message;
            hfsf0.getClass();
            gtch1.b = 7;
            gtch1.c = hfsf0;
            gtch2 = (gtch)hftp0.N_build();
            map0.put(gsyz0, gtch2);
        }
        return gtch2;
    }
}

