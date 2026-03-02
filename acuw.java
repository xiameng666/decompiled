import com.google.android.gms.auth.aang.GoogleAccount;

public final class acuw implements gfsi {
    public final GoogleAccount a;

    public acuw(GoogleAccount googleAccount0) {
        this.a = googleAccount0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((adry)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((adry)object0))));
        String s = this.a.a;
        s.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((adry)hftp0.b_message).b().remove(s);
        return (adry)hftp0.N_build();
    }
}

