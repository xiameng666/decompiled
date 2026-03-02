import android.provider.Settings.Secure;

public final class bwfp implements glzn {
    public final bwfr a;

    public bwfp(bwfr bwfr0) {
        this.a = bwfr0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        htxi htxi0 = htxi.a;
        boolean z = bwfr.k(((gqpz)object0), htxi0.b().b());
        bwfr bwfr0 = this.a;
        if(!z) {
            return bwfr0.c.a();
        }
        String s = Settings.Secure.getString(bwfr0.d.getContentResolver(), "default_input_method");
        if(s != null) {
            for(Object object1: htxi0.b().e().b) {
                if(s.startsWith(((String)object1))) {
                    bvrf bvrf0 = bwfr0.b;
                    String s1 = ((gqpz)object0).d;
                    int v = ((gqpz)object0).e;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqyb.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gqyb)hftp0.b_message).d = 18;
                    ((gqyb)hftp0.b_message).b |= 2;
                    bvrf0.b(s1, v, hftp0);
                    return bwfr0.c.a();
                }
            }
        }
        bwfr0.j();
        return gmbu.i(null);
    }
}

