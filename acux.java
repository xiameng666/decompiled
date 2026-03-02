import com.google.android.gms.auth.aang.GoogleAccount;

public final class acux implements gfsi {
    public final GoogleAccount a;
    public final String b;

    public acux(GoogleAccount googleAccount0, String s) {
        this.a = googleAccount0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = this.a.a;
        adrw adrw0 = adrw.a;
        s.getClass();
        adrw adrw1 = (adrw)((adry)object0).b.get(s);
        if(adrw1 != null) {
            adrw0 = adrw1;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)adrw0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)adrw0));
        adrz adrz0 = ((adrw)hftp0.b_message).c;
        if(adrz0 == null) {
            adrz0 = adrz.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)adrz0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)adrz0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        adrz adrz1 = (adrz)hftp1.b_message;
        adrz1.b |= 1;
        adrz1.c = this.b;
        adrz adrz2 = (adrz)hftp1.N_build();
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((adry)object0))).jf(5, null);
        hftp2.X(((ProtoLiteMessage)(((adry)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        adrw adrw2 = (adrw)hftp0.b_message;
        adrz2.getClass();
        adrw2.c = adrz2;
        adrw2.b |= 1;
        adrw adrw3 = (adrw)hftp0.N_build();
        s.getClass();
        adrw3.getClass();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((adry)hftp2.b_message).b().put(s, adrw3);
        return (adry)hftp2.N_build();
    }
}

