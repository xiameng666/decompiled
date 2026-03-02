import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.ArrayList;
import java.util.List;

public final class bmlt {
    public static final bboh a;
    public final bmly b;
    public final bmlv c;
    public final bmlg d;
    private static final hhrs e;
    private static final hhrs f;

    static {
        bmlt.a = bnaa.a("CtapMessageProcessor");
        bmlt.e = new hhrq("type");
        bmlt.f = new hhrq("id");
    }

    public bmlt(bmlg bmlg0, bmly bmly0, bmlv bmlv0) {
        this.d = bmlg0;
        this.b = bmly0;
        this.c = bmlv0;
    }

    public final List a(hhrs hhrs0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(Transport.e);
        String s = PublicKeyCredentialType.a.b;
        List list0 = new ArrayList();
        gged_interceptors gged0 = hhrs0.f().a;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ggfz ggfz0 = ((hhrs)gged0.get(v1)).m().a;
            hhrs hhrs1 = (hhrs)ggfz0.get(bmlt.e);
            hhrs hhrs2 = (hhrs)ggfz0.get(bmlt.f);
            if(hhrs1 != null && hhrs2 != null && hhrs1.p().a.equals(s)) {
                list0.add(new PublicKeyCredentialDescriptor(s, hhrs2.j().a.toByteArray(), arrayList0));
            }
        }
        return list0;
    }
}

