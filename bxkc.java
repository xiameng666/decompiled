import com.google.android.gms.auth.api.identity.Claim;

public final class bxkc implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqvo.a).v_newBuilder();
        String s = ((Claim)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gqvo)hftv0).b |= 1;
        ((gqvo)hftv0).c = s;
        boolean z = ((Claim)object0).b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqvo gqvo0 = (gqvo)hftp0.b_message;
        gqvo0.b |= 2;
        gqvo0.d = z;
        return (gqvo)hftp0.N_build();
    }
}

