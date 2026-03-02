import j..util.Collection.-EL;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class arpz extends arqo {
    public ggeo a;
    private final arkn b;

    public arpz(arkn arkn0) {
        gftb.check(arkn0);
        this.b = arkn0;
    }

    @Override  // arqo
    public final File a(asby asby0) {
        String s = asby0.e;
        String s1 = (asby0.c == 103 ? ((asbc)asby0.d) : asbc.a).c;
        String s2 = (asby0.c == 103 ? ((asbc)asby0.d) : asbc.a).d;
        arkm arkm0 = new arkm(s, s1, s2);
        if(hqhq.k()) {
            if(!s2.isEmpty()) {
                return hrnt.i() ? new File(ccsb.a.a(s2)) : new File(s2);
            }
            throw new IOException("unable to prepare file payload for item: " + arkm0.toString());
        }
        if(this.a != null && this.a.containsKey(arkm0)) {
            return hrnt.i() ? new File(ccsb.a.a(((String)Objects.requireNonNull(((String)this.a.get(arkm0)))))) : new File(((String)Objects.requireNonNull(((String)this.a.get(arkm0)))));
        }
        throw new IOException("unable to prepare file payload for item: " + arkm0.toString());
    }

    @Override  // arqo
    public final InputStream b(asby asby0) {
        String s = asby0.e;
        String s1 = (asby0.c == 103 ? ((asbc)asby0.d) : asbc.a).c;
        String s2 = (asby0.c == 103 ? ((asbc)asby0.d) : asbc.a).d;
        arkm arkm0 = new arkm(s, s1, s2);
        if(hqhq.k()) {
            return s2.isEmpty() ? new arrh(new arpt(arkm0)) : new arrh(new arpu(s2));
        }
        return this.a == null || !this.a.containsKey(arkm0) ? new arrh(new arpv(arkm0)) : new arrh(new arpw(this, arkm0));
    }

    @Override  // arqo
    public final List c() {
        arkn arkn0 = this.b;
        if(arkn0.a().isEmpty()) {
            return ggna.a;
        }
        ggfp ggfp0 = ggfp.G(arkn0.a());
        this.a = (ggeo)Collection.-EL.stream(ggfp0).collect(ggaf.b(new arpx(), new arpy()));
        ggdy ggdy0 = new ggdy();
        ggqj ggqj0 = ggfp0.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            String s = ((arkm)object0).a;
            String s1 = ((arkm)object0).b;
            String s2 = ((arkm)object0).c;
            long v = (hrnt.i() ? new File(ccsb.a.a(s2)) : new File(s2)).length();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asby.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asby asby0 = (asby)hftp0.b_message;
            asby0.b |= 1;
            asby0.e = s;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbc.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((asbc)hftv0).b |= 1;
            ((asbc)hftv0).c = s1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbc asbc0 = (asbc)hftp1.b_message;
            asbc0.b |= 2;
            asbc0.d = s2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asby asby1 = (asby)hftp0.b_message;
            asbc asbc1 = (asbc)hftp1.N_build();
            asbc1.getClass();
            asby1.d = asbc1;
            asby1.c = 103;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asby asby2 = (asby)hftp0.b_message;
            asby2.b |= 2;
            asby2.f = v;
            ggdy0.i(((asby)hftp0.N_build()));
        }
        return gged_interceptors.i(ggdy0.h());
    }

    @Override  // arqo
    public final void d(asby asby0, InputStream inputStream0) {
        bbpb.b(inputStream0);
    }

    @Override  // arqo
    public final long e(asby asby0) {
        if(((asby0.c == 103 ? ((asbc)asby0.d) : asbc.a).b & 1) != 0) {
            String s = asby0.e;
            return asby0.c == 103 ? ghgc.a.d(s + ((asbc)asby0.d).c).c() : ghgc.a.d(s + asbc.a.c).c();
        }
        return super.e(asby0);
    }
}

