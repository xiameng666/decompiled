import java.util.Objects;

public final class ephv implements ibts {
    public final hjij a;

    public ephv(hjij hjij0) {
        this.a = hjij0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hfuo hfuo0 = ((gsmw)object0).b;
        ibuq.e(hfuo0, "getGeocodesList(...)");
        gsmv gsmv0 = (gsmv)ibpo.T(hfuo0);
        if(gsmv0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hatr.a).v_newBuilder();
            String s = gsmv0.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hatr hatr0 = (hatr)hftp0.b_message;
            s.getClass();
            hatr0.c = s;
            gsmu gsmu0 = gsmv0.e == null ? gsmu.a : gsmv0.e;
            hjij hjij0 = gsmu0.c == null ? hjij.a : gsmu0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            hjij0.getClass();
            ((hatr)hftv0).f = hjij0;
            ((hatr)hftv0).b |= 16;
            String s1 = gsmv0.c;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hatr hatr1 = (hatr)hftp0.b_message;
            s1.getClass();
            hatr1.e = s1;
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ibuq.e(hftv1, "build(...)");
            if(((hatr)hftv1) != null) {
                return (hatr)hftv1;
            }
        }
        Objects.toString(this.a);
        throw new IllegalStateException("No geocode found for latlng: " + this.a);
    }
}

