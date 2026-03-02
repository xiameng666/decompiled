import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class zmm implements icih {
    final zms a;

    public zmm(zms zms0) {
        this.a = zms0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        grym grym0;
        String s2;
        String s = ((zmo)object0).a;
        List list0 = ((zmo)object0).b;
        if(s.length() != 0) {
            try {
                zms zms0 = this.a;
                long v = System.currentTimeMillis();
                String s1 = aaus.b().toLanguageTag();
                ibuq.e(s1, "toLanguageTag(...)");
                boolean z = cchl.d();
                int v1 = zms0.k.a();
                zjp zjp0 = zms0.g;
                fhrt fhrt0 = zms0.c;
                if(!aaua.c(((zjt)zjp0).c)) {
                    throw new iapl(iapk.j);
                }
                gryl gryl0 = gryl.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gryl0).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gryk.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gryk gryk0 = (gryk)hftp1.b_message;
                gryk0.b |= 1;
                gryk0.c = s;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gryl gryl1 = (gryl)hftp0.b_message;
                gryk gryk1 = (gryk)hftp1.N_build();
                gryk1.getClass();
                gryl1.d = gryk1;
                gryl1.b |= 2;
                grxq grxq0 = ((zjt)zjp0).c(fhrt0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                grxq0.getClass();
                ((gryl)hftv0).c = grxq0;
                ((gryl)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gryl gryl2 = (gryl)hftp0.b_message;
                hfuo hfuo0 = gryl2.e;
                if(!hfuo0.c()) {
                    gryl2.e = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list0, gryl2.e);
                gryl gryl3 = (gryl)hftp0.N_build();
                baqr baqr0 = ((zjt)zjp0).b();
                long v2 = SystemClock.elapsedRealtime();
                try {
                    zec zec0 = new zec(((zlo)((zjt)zjp0).e).a(), cmlp.a, cjxq.c);
                    if(zec.b == null) {
                        ibjh ibjh0 = new ibjh(((MessageLite)gryl0));
                        ibjh ibjh1 = new ibjh(((MessageLite)grym.a));
                        zec.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/Search", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                    }
                    s2 = s1;
                    grym0 = (grym)zec0.d.callUnaryWithAuth(zec.b, baqr0, gryl3, ((long)zec.a), TimeUnit.MILLISECONDS, zec0.e);
                    ((zjt)zjp0).f("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/Search", "Search", zjt.b, v2);
                }
                catch(Exception exception0) {
                    ((zjt)zjp0).e("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/Search", "Search", zjt.b, v2, exception0);
                    throw exception0;
                }
                hfuo hfuo1 = grym0.b;
                ibuq.e(hfuo1, "getAdditionalResourcesList(...)");
                ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo1, 10));
                for(Iterator iterator0 = hfuo1.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                    Object object1 = iterator0.next();
                    ibuq.c(((grxr)object1));
                    zho zho0 = new zho(((grxr)object1), v);
                    arrayList0.add(new zkx(zms0.d.b, s2, (zho0.a.e == null ? grxw.a : zho0.a.e), z, fhrt0.a, v1, zho0));
                    fhrt0 = fhrt0;
                    s2 = s2;
                }
                zmr zmr0 = new zmr(zms0, arrayList0, null);
                icbb.b(zms0.h, null, null, zmr0, 3);
                zms0.f.e(arrayList0);
                ibuq.c(grym0);
                zmq zmq0 = new zmq(zms0, s, grym0, null);
                icbb.b(zms0.h, null, null, zmq0, 3);
            }
            catch(acse acse0) {
                zms.b.g("Backend search failed", acse0, new Object[0]);
                this.a.e(s, acse0);
            }
            catch(iapl iapl0) {
                zms.b.g("Backend search failed", iapl0, new Object[0]);
                this.a.e(s, iapl0);
            }
            return ibom.a;
        }
        return ibom.a;
    }
}

