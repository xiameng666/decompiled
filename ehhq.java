import android.net.Uri;
import java.util.concurrent.TimeUnit;

public final class ehhq extends ehhs {
    private final ehcp d;

    public ehhq(ehcp ehcp0, ehbg ehbg0, ehga ehga0, egzp egzp0, Uri uri0, ehim ehim0) {
        super("FSA2_ApiGroupsReader", ehbg0, ehga0, egzp0, uri0, ehim0);
        this.d = ehcp0;
    }

    @Override  // ehhs
    protected final ehaa a() {
        egyn egyn0 = this.a.a.b();
        String s = null;
        String s1 = (egyn0.b & 4) == 0 ? null : egyn0.e;
        if((egyn0.b & 8) != 0) {
            s = egyn0.f;
        }
        return new ehaa(s1, s);
    }

    @Override  // ehhs
    protected final void b() {
        this.a.b();
    }

    @Override  // ehhs
    protected final void c() {
        ((ehiv)this.b).l = true;
        if(this.c) {
            this.a.c(System.currentTimeMillis(), false, false);
        }
    }

    @Override  // ehhs
    protected final boolean d(Object object0) {
        egzx egzx0 = (egzx)object0;
        return true;
    }

    @Override  // ehhs
    protected final int e() {
        return 2;
    }

    @Override  // ehhs
    protected final ehaa f(ehaa ehaa0, boolean z, ehhr ehhr0) {
        egzx egzx0;
        gstj gstj0;
        gsti gsti0 = gsti.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsti0).v_newBuilder();
        egiv.R();
        int v = (int)hwzc.a.c().l();
        Integer.valueOf(v).getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gsti)hftv0).d = v;
        String s = ehaa0.a;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gsti)hftv1).f = s;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsti gsti1 = (gsti)hftp0.b_message;
            hfuf hfuf0 = gsti1.g;
            if(!hfuf0.c()) {
                gsti1.g = ProtoLiteMessage.C(hfuf0);
            }
            gsti1.g.i(1);
        }
        String s1 = ehaa0.b;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsti)hftp0.b_message).e = s1;
        }
        gstb gstb0 = (gstb)((ProtoLiteMessage)gstc.a).v_newBuilder();
        gstb0.a();
        gstc gstc0 = (gstc)((ProtoLiteBuilder)gstb0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehcp ehcp0 = this.d;
        ProtoLiteMessage hftv2 = hftp0.b_message;
        gstc0.getClass();
        ((gsti)hftv2).i = gstc0;
        ((gsti)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsts gsts0 = ehcp0.f;
        gsti gsti2 = (gsti)hftp0.b_message;
        gsts0.getClass();
        gsti2.h = gsts0;
        gsti2.b |= 2;
        if(ehcp0.l.b()) {
            hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
            hftf0.a(ehcp.h);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsti gsti3 = (gsti)hftp0.b_message;
            hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
            hftg0.getClass();
            gsti3.c = hftg0;
            gsti3.b |= 1;
        }
        try {
            ehcp0.d.a();
            egke egke0 = ehcp0.b;
            baqr baqr0 = ehcp0.a;
            gsti gsti4 = (gsti)hftp0.N_build();
            try {
                egkd egkd0 = new egkd(egke0.b, cmlp.a, cksu.b);
                long v1 = (long)egke0.a;
                if(egkd.e == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gsti0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gstj.a));
                    egkd.e = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/ListContactGroups", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gstj0 = (gstj)egkd0.o.callUnaryWithAuth(egkd.e, baqr0, gsti4, v1, TimeUnit.MILLISECONDS, egkd0.p);
            }
            catch(acse | iapl exception0) {
                egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                throw exception0;
            }
            ehcp0.d.c("FSA_listContactGroups", (gstj0 == null ? 0 : gstj0.b.size()), ehcw.a(((MessageLite)gstj0)));
        }
        catch(acse acse0) {
            egig.c("FSA2_GroupSyncGrpc", "getGroups() failed", acse0);
            throw new ehfh(acse0);
        }
        catch(iapl iapl0) {
            egig.c("FSA2_GroupSyncGrpc", "getGroups() failed", iapl0);
            ehcp0.d.d("FSA_listContactGroups", iapl0);
            throw iapl0;
        }
        if(gstj0 == null) {
            egig.b("FSA2_GroupSyncGrpc", "Received null API-group response");
            return null;
        }
        egig.e("FSA2_GroupSyncGrpc", "Received non-null API-group response");
        ehaa ehaa1 = new ehaa(gstj0.d, gstj0.c);
        ehcp0.e.v(gjgi.c, 2, 3, gstj0.e);
        for(Object object0: gstj0.b) {
            himv himv0 = (himv)object0;
            try {
                egzx0 = ehcu.c(himv0, ehcp0.k);
                if(egzx0 == null) {
                    continue;
                }
            }
            catch(ehfa | iapl exception1) {
                egig.d("FSA2_GroupSyncGrpc", "Stop syncing because of error when loading API group", new Object[]{exception1});
                throw new ehfh(exception1);
            }
            if(ehcp0.l.b() && egzx0.d()) {
                egzx0 = ehcu.b(egzx0, ehcp0.j.g(egzx0.r));
            }
            ehhr0.a(egzx0);
        }
        if(!z) {
            return ehaa1;
        }
        ehcp0.i.e(true, gjgi.c, gstj0.e);
        return ehaa1;
    }
}

