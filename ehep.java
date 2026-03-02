import android.content.SyncStats;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class ehep extends ehem {
    public ehep(ehim ehim0, ehfx ehfx0, ehfy ehfy0, ehfw ehfw0, egzp egzp0, ehab ehab0, ehcq ehcq0, ehfk ehfk0, ehfq ehfq0, ehdl ehdl0, ehft ehft0) {
        super(girk.d, ehfx0, ehfy0, ehfw0, ehim0, egzp0, ehab0, ehcq0, ehfk0, ehfq0, ehdl0, ehft0);
    }

    @Override  // ehem
    protected final gfsx a(egzx egzx0) {
        String s = egzx0.k;
        if(s == null) {
            throw new iapl(iaph.d.a().f("Request contains an invalid argument."));
        }
        if(s.isEmpty()) {
            throw new iapl(iaph.d.a().f("Entry #1: Group ID is missing."));
        }
        if(s.trim().isEmpty()) {
            throw new iapl(iaph.d.a().f("Entry #1: Invalid group ID."));
        }
        if(ehhy.b(s)) {
            throw new iapl(iaph.d.a().f("Entry #1: Group ID cannot belong to a system group."));
        }
        if(ehhy.a(s)) {
            return gfqx.a;
        }
        throw new iapl(iaph.d.a().f("Entry #1: Invalid group ID."));
    }

    @Override  // ehem
    protected final List b(List list0) {
        gssa gssa0;
        if(ehjs.i(list0)) {
            return Collections.EMPTY_LIST;
        }
        gsrz gsrz0 = gsrz.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsrz0).v_newBuilder();
        for(Object object0: list0) {
            egzx egzx0 = (egzx)object0;
            if(egzx0 != null) {
                String s = egzx0.k;
                if(s != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gsrz gsrz1 = (gsrz)hftp0.b_message;
                    hfuo hfuo0 = gsrz1.c;
                    if(!hfuo0.c()) {
                        gsrz1.c = ProtoLiteMessage.E(hfuo0);
                    }
                    gsrz1.c.add(s);
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehcq ehcq0 = this.d;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gsrz)hftv0).d = false;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsts gsts0 = ehcq0.f;
        gsrz gsrz2 = (gsrz)hftp0.b_message;
        gsts0.getClass();
        gsrz2.e = gsts0;
        gsrz2.b |= 2;
        gsrz gsrz3 = (gsrz)hftp0.N_build();
        ehcq0.d.a();
        try {
            egke egke0 = ehcq0.b;
            baqr baqr0 = ehcq0.a;
            try {
                egkd egkd0 = new egkd(egke0.b, cmlp.a, cksm.b);
                long v = (long)egke0.a;
                if(egkd.h == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gsrz0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gssa.a));
                    egkd.h = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/DeleteContactGroups", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gssa0 = (gssa)egkd0.o.callUnaryWithAuth(egkd.h, baqr0, gsrz3, v, TimeUnit.MILLISECONDS, egkd0.p);
            }
            catch(acse | iapl exception0) {
                egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                throw exception0;
            }
            ehcq0.d.c("FSA_deleteContactGroups", list0.size(), ehcw.a(((MessageLite)gssa0)));
        }
        catch(iapl iapl0) {
            ehcq0.d.d("FSA_deleteContactGroups", iapl0);
            throw iapl0;
        }
        if(gssa0 == null) {
            throw new ehfb(1);
        }
        ehcq.b(gssa0.b, list0.size());
        return gssa0.b;
    }

    @Override  // ehem
    protected final void j(egzx egzx0, himv himv0) {
        SyncStats syncStats0;
        try {
            if(himv0 != null) {
                int v = himv0.g;
                if(himu.a(v) != 0 && himu.a(v) != 1) {
                    iapk iapk0 = (iapk)ehcu.a.get(Integer.valueOf((himu.a(v) == 0 ? 1 : himu.a(v))));
                    if(iapk0 == null) {
                        iapk0 = iapk.d;
                    }
                    throw new iapl(iapk0);
                }
                if((himv0.b & 1) != 0) {
                    if(!(himv0.c == null ? himq.a : himv0.c).c.isEmpty()) {
                        egzw egzw0 = egzx.b();
                        egzw0.d = (himv0.c == null ? himq.a : himv0.c).c;
                        egzw0.a();
                        if(hwyi.z()) {
                            this.a.h(egzx0);
                            return;
                        }
                        this.a.e(egzx0.h);
                        return;
                    }
                    egig.d("FSA2_ProtoToPeopleUtil", "Delete returned group with empty id.id - %s", new Object[]{himv0.d});
                    throw new ehfa(8);
                }
                egig.d("FSA2_ProtoToPeopleUtil", "Delete returned group with null id - %s", new Object[]{himv0.d});
                throw new ehfa(7);
            }
            egig.e("FSA2_ProtoToPeopleUtil", "Server returned null API group");
            throw new ehfa(1);
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
                case 5: {
                    if(hwyi.z()) {
                        this.a.h(egzx0);
                    }
                    else {
                        this.a.e(egzx0.h);
                    }
                    this.e.h(this.i, gjgi.c, false, 3, 1);
                    return;
                }
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
            ehep.m(iapl0, gged_interceptors.l(egzx0));
            this.d(iapl0, iaph0.name(), 1);
            this.g(egzx0);
        }
    }

    @Override  // ehem
    protected final void k(List list0) {
        this.f(list0);
    }
}

