import j..util.Optional;
import java.io.IOException;
import java.security.PublicKey;

public final class dvkn {
    public static final bboh a;
    public final gmcg b;
    public final dvgv c;
    public final dvjf d;
    public final dvjs e;
    public final dyda f;
    private final eaqs g;
    private final dvjv h;

    static {
        dvkn.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvkn(eaqs eaqs0, gmcg gmcg0, dvgv dvgv0, dvjf dvjf0, dvjs dvjs0, dvjv dvjv0, dyda dyda0) {
        this.g = eaqs0;
        this.b = gmcg0;
        this.c = dvgv0;
        this.d = dvjf0;
        this.e = dvjs0;
        this.h = dvjv0;
        this.f = dyda0;
    }

    public final gmcd a(String s) {
        gged_interceptors gged0 = gged_interceptors.l(s);
        return glzd.g(gmbt.h(this.f.a(gged0)), new dvjw(), this.b);
    }

    public final gmcd b(String s, String s1) {
        Optional optional0;
        dvjv dvjv0;
        gtfb gtfb0;
        try {
            gtfb0 = this.g.a();
            dvjv0 = this.h;
        }
        catch(IOException | dpuk exception0) {
            a.e(dvkn.a.j(), "Failed to get attestation signal for valuable with ID %s. Not fetching certificate", s, exception0);
            return this.a(s);
        }
        if(s1.isEmpty()) {
            optional0 = Optional.empty();
        }
        else {
            Optional optional1 = dvjv.d(dvjv0.c(s1));
            if(optional1.isEmpty()) {
                ((ggtj)dvjv.a.j()).B("Public key not found for owner ID %s", s1);
                optional0 = Optional.empty();
            }
            else {
                byte[] arr_b = ((PublicKey)optional1.get()).getEncoded();
                if(arr_b == null) {
                    ((ggtj)dvjv.a.j()).B("Public key for owner ID %s does not support encoding", s1);
                    optional0 = Optional.empty();
                }
                else {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvdt.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gvdt)hftp0.b_message).d = 1;
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gvdt gvdt0 = (gvdt)hftp0.b_message;
                    gvdt0.b = 2;
                    gvdt0.c = hfsf0;
                    optional0 = Optional.of(((gvdt)hftp0.N_build()));
                }
            }
        }
        if(optional0.isEmpty()) {
            ((ggtj)dvkn.a.j()).R("Unable to get key for valuable with ID %s and owner ID %s. Not fetching certificate", s, s1);
            return this.a(s);
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvdi.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvdi gvdi0 = (gvdi)hftp1.b_message;
        s.getClass();
        gvdi0.c = s;
        Object object0 = optional0.get();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gvdi)hftv0).d = (gvdt)object0;
        ((gvdi)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvdi gvdi1 = (gvdi)hftp1.b_message;
        gtfb0.getClass();
        gvdi1.e = gtfb0;
        gvdi1.b |= 2;
        gvdi gvdi2 = (gvdi)hftp1.N_build();
        ((ggtj)((ggtj)dvgv.a.h()).ar(11097)).B("Calling fetchValuableCertificate on server with ID: %s", gvdi2.c);
        gmcd gmcd0 = glzd.g(gmbt.h(dptv.b(this.c.d, dpuj.aX, ((MessageLite)gvdi2), ((MessageLite)gvdj.a))), new dvjx(this, s1), this.b);
        dvjy dvjy0 = new dvjy(this, s);
        return glyi.g(gmcd0, Throwable.class, dvjy0, this.b);
    }
}

