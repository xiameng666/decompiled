import android.content.SyncStats;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class eher extends ehem {
    private final egzo j;

    protected eher(ehim ehim0, ehfx ehfx0, ehfy ehfy0, ehfw ehfw0, egzp egzp0, ehab ehab0, ehcq ehcq0, ehfk ehfk0, ehfq ehfq0, ehdl ehdl0, ehft ehft0, egzo egzo0) {
        super(girk.b, ehfx0, ehfy0, ehfw0, ehim0, egzp0, ehab0, ehcq0, ehfk0, ehfq0, ehdl0, ehft0);
        this.j = egzo0;
    }

    @Override  // ehem
    protected final gfsx a(egzx egzx0) {
        if(!hxcc.g()) {
            return gfqx.a;
        }
        String s = egzx0.m;
        if(TextUtils.isEmpty(s)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)himv.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((himv)hftv0).g = 3;
            ((himv)hftv0).b |= 16;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            himv himv0 = (himv)hftp0.b_message;
            himv0.b |= 2;
            himv0.d = "Group type missing.";
            return gfsx.m(((himv)hftp0.N_build()));
        }
        if(TextUtils.isEmpty(s.trim())) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)himv.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((himv)hftv1).g = 3;
            ((himv)hftv1).b |= 16;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            himv himv1 = (himv)hftp1.b_message;
            himv1.b |= 2;
            himv1.d = "Name is missing.";
            return gfsx.m(((himv)hftp1.N_build()));
        }
        if(((long)s.length()) > hxcc.d()) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)himv.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((himv)hftv2).g = 3;
            ((himv)hftv2).b |= 16;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            himv himv2 = (himv)hftp2.b_message;
            himv2.b |= 2;
            himv2.d = "Name is too long.";
            return gfsx.m(((himv)hftp2.N_build()));
        }
        return gfqx.a;
    }

    @Override  // ehem
    protected final List b(List list0) {
        gsrw gsrw0;
        hims[] arr_hims = ehct.c(list0);
        if(ehjs.h(arr_hims)) {
            return Collections.EMPTY_LIST;
        }
        gsrv gsrv0 = gsrv.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsrv0).v_newBuilder();
        List list1 = Arrays.asList(arr_hims);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsrv gsrv1 = (gsrv)hftp0.b_message;
        hfuo hfuo0 = gsrv1.c;
        if(!hfuo0.c()) {
            gsrv1.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list1, gsrv1.c);
        gstc gstc0 = ehcq.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehcq ehcq0 = this.d;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        gstc0.getClass();
        ((gsrv)hftv0).f = gstc0;
        ((gsrv)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsts gsts0 = ehcq0.f;
        gsrv gsrv2 = (gsrv)hftp0.b_message;
        gsts0.getClass();
        gsrv2.e = gsts0;
        gsrv2.b |= 2;
        if(hwyi.z() && ehcq0.i.b() && !ehcq.c(list0)) {
            hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
            hftf0.a(ehcq.h);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsrv gsrv3 = (gsrv)hftp0.b_message;
            hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
            hftg0.getClass();
            gsrv3.d = hftg0;
            gsrv3.b |= 1;
        }
        gsrv gsrv4 = (gsrv)hftp0.N_build();
        ehcq0.d.a();
        try {
            egke egke0 = ehcq0.b;
            baqr baqr0 = ehcq0.a;
            try {
                egkd egkd0 = new egkd(egke0.b, cmlp.a, cksl.b);
                long v = (long)egke0.a;
                if(egkd.f == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gsrv0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gsrw.a));
                    egkd.f = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/CreateContactGroups", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gsrw0 = (gsrw)egkd0.o.callUnaryWithAuth(egkd.f, baqr0, gsrv4, v, TimeUnit.MILLISECONDS, egkd0.p);
            }
            catch(acse | iapl exception0) {
                egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                throw exception0;
            }
            ehcq0.d.c("FSA_createContactGroups", gsrv4.c.size(), ehcw.a(((MessageLite)gsrw0)));
        }
        catch(iapl iapl0) {
            ehcq0.d.d("FSA_createContactGroups", iapl0);
            throw iapl0;
        }
        if(gsrw0 == null) {
            throw new ehfb(1);
        }
        ehcq.b(gsrw0.b, list0.size());
        return gsrw0.b;
    }

    @Override  // ehem
    protected final void j(egzx egzx0, himv himv0) {
        SyncStats syncStats0;
        try {
            egzx egzx1 = ehcu.c(himv0, this.j);
            if(hwyi.z() && egzx1 != null && egzx1.d()) {
                egzx1 = ehcu.b(egzx1, this.c.g(egzx1.r));
            }
            this.i(egzx1, egzx0);
        }
        catch(iapl iapl0) {
            iaph iaph0 = iapl0.a.t;
            switch(iaph0.ordinal()) {
                case 3: {
                    egiv.R();
                    if(egiv.f().booleanValue()) {
                        SyncStats syncStats1 = ((ehiv)this.e).a.stats;
                        ++syncStats1.numParseExceptions;
                    }
                    else {
                        syncStats0 = ((ehiv)this.e).a.stats;
                        ++syncStats0.numIoExceptions;
                    }
                    break;
                }
                case 5: 
                case 6: 
                case 9: 
                case 12: 
                case 15: {
                    SyncStats syncStats2 = ((ehiv)this.e).a.stats;
                    ++syncStats2.numParseExceptions;
                    break;
                }
                default: {
                    syncStats0 = ((ehiv)this.e).a.stats;
                    ++syncStats0.numIoExceptions;
                }
            }
            eher.m(iapl0, gged_interceptors.l(egzx0));
            this.d(iapl0, iaph0.name(), 1);
            this.g(egzx0);
        }
    }

    @Override  // ehem
    protected final void k(List list0) {
        this.f(list0);
    }
}

