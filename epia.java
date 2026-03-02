import android.content.Context;
import com.google.android.gms.chimera.modules.significant.places.AppContextProvider;
import java.util.Locale;

public final class epia {
    private final gmcg a;
    private final iaoa b;
    private hatt c;
    private gsnd d;
    private gmcd e;
    private final fhae f;

    public epia() {
        this.a = new bblp(1, 9);
        this.b = new iant("X-Goog-FieldMask", iaof_metadata.c);
        this.e = gmbu.g();
        fhad fhad0 = fhae.a();
        fhad0.b(AppContextProvider.a());
        this.f = fhad0.a();
    }

    public final Object a(String s, ibrl ibrl0) {
        gRPCMethodDescriptor iaoj2;
        ephx ephx0;
        if((ibrl0 instanceof ephx)) {
            ephx0 = (ephx)ibrl0;
            int v = ephx0.c;
            if((v & 0x80000000) == 0) {
                ephx0 = new ephx(this, ibrl0);
            }
            else {
                ephx0.c = v - 0x80000000;
            }
        }
        else {
            ephx0 = new ephx(this, ibrl0);
        }
        Object object0 = ephx0.a;
        Object object1 = ibrx.a;
        switch(ephx0.c) {
            case 0: {
                ibnx.b(object0);
                hatq hatq0 = hatq.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hatq0).v_newBuilder();
                String s1 = String.valueOf(s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hatq)hftp0.b_message).b = "places/" + s1;
                String s2 = Locale.getDefault().toLanguageTag();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hatq hatq1 = (hatq)hftp0.b_message;
                s2.getClass();
                hatq1.c = s2;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                hatq hatq2 = (hatq)hftv0;
                iaof_metadata iaof0 = new iaof_metadata();
                iaof0.i(this.b, "id,displayName,formattedAddress,location");
                try {
                    hatt hatt0 = (hatt)((hatt)this.d().q(cmlp.a, ckvm.b)).p(new iakw[]{new ibjz(iaof0)});
                    iakr iakr0 = hatt0.a;
                    gRPCMethodDescriptor iaoj0 = hatu.a;
                    if(iaoj0 == null) {
                        synchronized(hatu.class) {
                            gRPCMethodDescriptor iaoj1 = hatu.a;
                            if(iaoj1 == null) {
                                gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                                iaog0.methodType = gRPCMethodType.a;
                                iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.maps.places.v1.Places", "GetPlace");
                                iaog0.setSampledToLocalTracing();
                                iaog0.requestMarshaller = new ibjh(((MessageLite)hatq0));
                                iaog0.responseMarshaller = new ibjh(((MessageLite)hatr.a));
                                iaoj2 = iaog0.build();
                                hatu.a = iaoj2;
                            }
                            else {
                                iaoj2 = iaoj1;
                            }
                            iaoj0 = iaoj2;
                        }
                    }
                    gmcd gmcd0 = ibjw.a(iakr0.a(iaoj0, hatt0.b), hatq2);
                    ephx0.c = 1;
                    Object object2 = icpu.c(gmcd0, ephx0);
                    return object2 == object1 ? object1 : object2;
                label_61:
                    ibnx.b(object0);
                    return object0;
                }
                catch(iapn iapn0) {
                    return ibnx.a(iapn0);
                }
            }
            case 1: {
                goto label_61;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(hjij hjij0, ibrl ibrl0) {
        ephy ephy0;
        if((ibrl0 instanceof ephy)) {
            ephy0 = (ephy)ibrl0;
            int v = ephy0.c;
            if((v & 0x80000000) == 0) {
                ephy0 = new ephy(this, ibrl0);
            }
            else {
                ephy0.c = v - 0x80000000;
            }
        }
        else {
            ephy0 = new ephy(this, ibrl0);
        }
        Object object0 = ephy0.a;
        Object object1 = ibrx.a;
        switch(ephy0.c) {
            case 0: {
                ibnx.b(object0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsnf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gsnf gsnf0 = (gsnf)hftp0.b_message;
                hjij0.getClass();
                gsnf0.c = hjij0;
                gsnf0.b |= 1;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                gsnf gsnf1 = (gsnf)hftv0;
                try {
                    if(this.d == null) {
                        fhbw fhbw0 = new fhbw();
                        fhbw0.a(new gsna());
                        gsnd gsnd0 = (gsnd)gsne.a(cmma.g(-1, 0x10C00, this.f, fhbw0).a(gsni.d)).p(new iakw[]{fhbu.b(this.f, fhbw0)});
                        ephp ephp0 = new ephp();
                        Context context0 = AppContextProvider.a();
                        ibuq.e(context0, "getApplicationContext(...)");
                        ephp0.b(context0);
                        gpir gpir0 = ephp0.a().a();
                        this.d = (gsnd)gsnd0.q(gpji.g, gpir0);
                    }
                    gsnd gsnd1 = this.d;
                    if(gsnd1 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    gmcd gmcd0 = glzd.f(((gsnd)gsnd1.q(cmlp.a, ckvn.b)).a(gsnf1), new ephw(new ephv(hjij0)), gmap.a);
                    ephy0.c = 1;
                    Object object2 = icpu.c(gmcd0, ephy0);
                    return object2 == object1 ? object1 : object2;
                label_41:
                    ibnx.b(object0);
                    return object0;
                }
                catch(IllegalStateException illegalStateException0) {
                    return ibnx.a(illegalStateException0);
                }
                catch(iapn iapn0) {
                    return ibnx.a(iapn0);
                }
            }
            case 1: {
                goto label_41;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(String s, ibrl ibrl0) {
        ephz ephz0;
        if((ibrl0 instanceof ephz)) {
            ephz0 = (ephz)ibrl0;
            int v = ephz0.c;
            if((v & 0x80000000) == 0) {
                ephz0 = new ephz(this, ibrl0);
            }
            else {
                ephz0.c = v - 0x80000000;
            }
        }
        else {
            ephz0 = new ephz(this, ibrl0);
        }
        Object object0 = ephz0.a;
        Object object1 = ibrx.a;
        switch(ephz0.c) {
            case 0: {
                ibnx.b(object0);
                hatj hatj0 = hatj.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hatj0).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hatj hatj1 = (hatj)hftp0.b_message;
                s.getClass();
                hatj1.b = s;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                if(!this.e.isDone()) {
                    this.e.cancel(true);
                }
                hatt hatt0 = (hatt)this.d().q(cmlp.a, ckvl.b);
                iakr iakr0 = hatt0.a;
                gRPCMethodDescriptor iaoj0 = hatu.b;
                if(iaoj0 == null) {
                    synchronized(hatu.class) {
                        iaoj0 = hatu.b;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.maps.places.v1.Places", "AutocompletePlaces");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)hatj0));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)hatp.a));
                            gRPCMethodDescriptor iaoj1 = iaog0.build();
                            hatu.b = iaoj1;
                            iaoj0 = iaoj1;
                        }
                    }
                }
                gmcd gmcd0 = glzd.f(ibjw.a(iakr0.a(iaoj0, hatt0.b), ((hatj)hftv0)), new ephu(new epht()), this.a);
                this.e = gmcd0;
                try {
                    ephz0.c = 1;
                    Object object2 = icpu.c(gmcd0, ephz0);
                    return object2 == object1 ? object1 : object2;
                label_53:
                    ibnx.b(object0);
                    return object0;
                }
                catch(iapn iapn0) {
                    return ibnx.a(iapn0);
                }
            }
            case 1: {
                goto label_53;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final hatt d() {
        if(this.c == null) {
            fhbw fhbw0 = new fhbw();
            fhbw0.a(new haty());
            iakr iakr0 = cmma.g(-1, 0x10C00, this.f, fhbw0).a(haug.g);
            hatt hatt0 = (hatt)((hatt)hatt.f(new hats(), iakr0)).p(new iakw[]{fhbu.b(this.f, fhbw0)});
            ephp ephp0 = new ephp();
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            ephp0.b(context0);
            gpir gpir0 = ephp0.a().a();
            this.c = (hatt)hatt0.q(gpji.g, gpir0);
        }
        hatt hatt1 = this.c;
        if(hatt1 != null) {
            return hatt1;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

