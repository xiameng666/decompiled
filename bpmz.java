import com.google.android.gms.findmydevice.spot.SetOwnerKeyRequest;
import com.google.android.gms.findmydevice.spot.SetOwnerKeyResponse;

public final class bpmz implements bpnj {
    public static final SetOwnerKeyResponse a;
    private final bnzh b;

    static {
        bpmz.a = new SetOwnerKeyResponse();
    }

    public bpmz(bnzh bnzh0) {
        this.b = bnzh0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        if(((SetOwnerKeyRequest)object0).b == -1) {
            byte[] arr_b = ((SetOwnerKeyRequest)object0).c;
            if(arr_b == null || arr_b.length == 0) {
                bnth bnth0 = new bnth();
                return gdta.g(gdta.g(((bntk)this.b).c.b(bnth0, gmap.a)).i(new bnti(((bntk)this.b)), ((bntk)this.b).b)).h(new bpmx(), gmap.a);
            }
        }
        bnzh bnzh0 = this.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqzn.a).v_newBuilder();
        int v = ((SetOwnerKeyRequest)object0).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzn fqzn0 = (fqzn)hftp0.b_message;
        fqzn0.b |= 4;
        fqzn0.e = v;
        ByteString hfsf0 = ByteString.copyFrom(((SetOwnerKeyRequest)object0).c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzn fqzn1 = (fqzn)hftp0.b_message;
        fqzn1.b |= 1;
        fqzn1.c = hfsf0;
        return gdta.g(bnzh0.c(((fqzn)hftp0.N_build()))).h(new bpmy(), gmap.a);
    }
}

