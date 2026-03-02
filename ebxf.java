import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import dagger.internal.Preconditions;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@cmcs(a = cmcr.c)
public final class ebxf extends ebav {
    private static final bboh a;
    private final byte[] b;
    private final donp c;

    static {
        ebxf.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebxf(byte[] arr_b, String s, donp donp0, azug azug0) {
        ibuq.f(arr_b, "requestBytes");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("PerformEmoneyCardOperation", s, azug0);
        this.b = arr_b;
        this.c = donp0;
    }

    @Override  // ebaw
    public final void b(Context context0) {
        dyfv dyfv0;
        ibuq.f(context0, "context");
        dypj dypj0 = null;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfv.a), this.b, 0, this.b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            dyfv0 = (dyfv)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(ebxf.a.i(), "Failed to parse the EmoneyCardOperationRequest", hfur0);
            dyfv0 = null;
        }
        if(dyfv0 == null) {
            this.c.x(eccq.b);
            return;
        }
        int v = dyfu.a(dyfv0.b);
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    ecag ecag0 = new ecag(dyfv0, this.c, this.j, context0);
                    String s = ecag0.b.d;
                    ibuq.e(s, "getAccountName(...)");
                    String s1 = eccr.b(ecag0.e, s);
                    Context context1 = AppContextProvider.a();
                    ibuq.e(context1, "getApplicationContext(...)");
                    ibuq.c(s1);
                    dola dola0 = dlmg.a(context1, s, s1);
                    dmgr dmgr0 = new dmgr(ecag0.d);
                    domv domv0 = domu.a(AppContextProvider.a());
                    Preconditions.b(domv0);
                    done done0 = new done();
                    edop edop0 = new edop();
                    Preconditions.a(domv0, domv.class);
                    Preconditions.a(edop0, edor.class);
                    new ebrf(dola0, dmgr0, done0, domv0, edop0).inject(ecag0);
                    ebst ebst0 = ecag0.c();
                    String s2 = ecag0.b().name;
                    ibuq.e(s2, "name");
                    ebst0.a(s2, 0x31AF0);
                    ecag0.p = (dyof)((ProtoLiteMessage)dyoi.a).v_newBuilder();
                    ecag0.e((ecag0.b.b == 2 ? ((dyoc)ecag0.b.c) : dyoc.a).b.iterator()).d(ecag0.f(), new ecad(ecag0));
                    return;
                }
                case 1: {
                    ebsf ebsf0 = new ebsf(dyfv0, this.c, this.j, context0);
                    String s3 = ebsf0.b.d;
                    ibuq.e(s3, "getAccountName(...)");
                    String s4 = eccr.b(ebsf0.e, s3);
                    Context context2 = AppContextProvider.a();
                    ibuq.e(context2, "getApplicationContext(...)");
                    ibuq.c(s4);
                    dola dola1 = dlmg.a(context2, s3, s4);
                    dmgr dmgr1 = new dmgr(ebsf0.d);
                    domv domv1 = domu.a(AppContextProvider.a());
                    Preconditions.b(domv1);
                    done done1 = new done();
                    edop edop1 = new edop();
                    Preconditions.a(edop1, edor.class);
                    new ebks(dola1, dmgr1, done1, domv1, edop1).inject(ebsf0);
                    ebsf0.r();
                    ebst ebst1 = ebsf0.f();
                    String s5 = ebsf0.a().name;
                    ibuq.e(s5, "name");
                    ebst1.a(s5, 203617);
                    ebsf0.u = (dyfi)((ProtoLiteMessage)dyfl.a).v_newBuilder();
                    ebsf0.j(0L).f(ebsf0.k(), new ebry(ebsf0, System.currentTimeMillis()));
                    return;
                }
                case 2: {
                    ebuf ebuf0 = new ebuf(dyfv0, this.c, context0);
                    dyfv dyfv1 = ebuf0.b;
                    String s6 = dyfv1.d;
                    ibuq.e(s6, "getAccountName(...)");
                    String s7 = eccr.b(ebuf0.d, s6);
                    if(s7 != null) {
                        eblo eblo0 = new eblo();
                        Context context3 = AppContextProvider.a();
                        ibuq.e(context3, "getApplicationContext(...)");
                        eblo0.a = dlmg.a(context3, s6, s7);
                        eblo0.b(domu.a(AppContextProvider.a()));
                        eblo0.c = new done();
                        eblo0.d = new edop();
                        eblo0.b = new dmgr("com.google.android.gms");
                        eblo0.a().inject(ebuf0);
                        fich fich0 = ebuf0.h;
                        if(fich0 == null) {
                            ibuq.j("sloManager");
                            fich0 = null;
                        }
                        ficj ficj0 = fich0.a(1L, TimeUnit.MINUTES);
                        fhwb fhwb0 = ebuf0.g;
                        if(fhwb0 == null) {
                            ibuq.j("semanticLogger");
                            fhwb0 = null;
                        }
                        fhvz fhvz0 = fhwa.a(203501);
                        fhvz0.c(fhwp.b(dyfv1.d));
                        fhvz0.b(ficj0.a());
                        fhwb0.a(fhvz0.a());
                        dypj dypj1 = ebuf0.e;
                        if(dypj1 == null) {
                            ibuq.j("seManager");
                        }
                        else {
                            dypj0 = dypj1;
                        }
                        evql evql0 = dypj0.e();
                        evql0.y(ebuf0.a(), new ebud(new ebuc(ebuf0, ficj0)));
                        evql0.v(ebuf0.a(), new ebue(ebuf0, ficj0));
                        return;
                    }
                    return;
                }
                case 3: {
                    new ebts(dyfv0, this.c, context0).b();
                    return;
                }
                case 4: {
                    ebyv ebyv0 = new ebyv(dyfv0, this.c, this.j, context0);
                    Context context4 = ebyv0.c;
                    dyfv dyfv2 = ebyv0.a;
                    String s8 = eccr.b(context4, dyfv2.d);
                    domv domv2 = domu.a(AppContextProvider.a());
                    Preconditions.b(domv2);
                    new ebqh(domv2).inject(ebyv0);
                    fich fich1 = ebyv0.f;
                    if(fich1 == null) {
                        ibuq.j("sloManager");
                        fich1 = null;
                    }
                    ficj ficj1 = fich1.a(1L, TimeUnit.MINUTES);
                    try {
                        fhwb fhwb1 = ebyv0.e;
                        if(fhwb1 == null) {
                            ibuq.j("semanticLogger");
                            fhwb1 = null;
                        }
                        fhvz fhvz1 = fhwa.a((ebyv0.a() ? 0x3BB62 : 203502));
                        fhvz1.c(fhwp.b(dyfv2.d));
                        fhvz1.b(ficj1.a());
                        fhwb1.a(fhvz1.a());
                        dyke dyke0 = dyfv2.b == 8 ? ((dyke)dyfv2.c) : dyke.a;
                        dymw dymw0 = dyke0.c == null ? dymw.a : dyke0.c;
                        ibuq.e(dymw0, "getProvisionData(...)");
                        ibuq.c(s8);
                        String s9 = ebyv0.d;
                        if(s9 == null) {
                            ibuq.j("environment");
                            s9 = null;
                        }
                        ((glyq)new dycl(s8, s9).d(dymw0)).u();
                        ebwx.a(context4, (ebyv0.a() ? ((long)(dymw0.b == 2 ? ((dyly)dymw0.c) : dyly.a).b.size()) * hwsd.a.E().h() : 0L), false, false, 12);
                        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
                        dyga0.d(dyki.a(((ProtoLiteMessage)dykh.a).v_newBuilder()).a());
                        byte[] arr_b = dyga0.a().toBytesArray();
                        ebyv0.b.b(Status.b, arr_b);
                        ficj1.c(1);
                    }
                    catch(Throwable throwable0) {
                        ibsx.a(ficj1, throwable0);
                        throw throwable0;
                    }
                    ibsx.a(ficj1, null);
                    return;
                }
                case 5: {
                    ebvs ebvs0 = new ebvs(dyfv0, this.c, context0);
                    String s10 = ebvs0.b.d;
                    ibuq.e(s10, "getAccountName(...)");
                    String s11 = eccr.b(ebvs0.d, s10);
                    ebnq ebnq0 = new ebnq();
                    Context context5 = AppContextProvider.a();
                    ibuq.e(context5, "getApplicationContext(...)");
                    ibuq.c(s11);
                    ebnq0.a = dlmg.a(context5, s10, s11);
                    ebnq0.c = new done();
                    ebnq0.d = new edop();
                    ebnq0.b = new dmgr("com.google.android.gms");
                    ebnq0.b(domu.a(AppContextProvider.a()));
                    ebnq0.a().inject(ebvs0);
                    fich fich2 = ebvs0.g;
                    if(fich2 == null) {
                        ibuq.j("sloManager");
                        fich2 = null;
                    }
                    ficj ficj2 = fich2.a(2L, TimeUnit.MINUTES);
                    fhwb fhwb2 = ebvs0.f;
                    if(fhwb2 == null) {
                        ibuq.j("semanticLogger");
                        fhwb2 = null;
                    }
                    fhvz fhvz2 = fhwa.a(203407);
                    fhvz2.c(fhwp.b(s10));
                    fhvz2.b(ficj2.a());
                    fhwb2.a(fhvz2.a());
                    dypj dypj2 = ebvs0.e;
                    if(dypj2 == null) {
                        ibuq.j("seManager");
                    }
                    else {
                        dypj0 = dypj2;
                    }
                    evql evql1 = dypj0.h();
                    evql1.v(ebvs0.a(), new ebvp(ebvs0, ficj2));
                    evql1.y(ebvs0.a(), new ebvr(new ebvq(ebvs0, ficj2)));
                    return;
                }
                case 6: {
                    new ebjl(dyfv0, this.c, context0).c();
                    return;
                }
                case 7: {
                    ebtx ebtx0 = new ebtx(dyfv0, this.c, context0);
                    dyfv dyfv3 = ebtx0.b;
                    String s12 = dyfv3.d;
                    ibuq.e(s12, "getAccountName(...)");
                    String s13 = eccr.b(ebtx0.d, s12);
                    if(s13 != null) {
                        eble eble0 = new eble();
                        Context context6 = AppContextProvider.a();
                        ibuq.e(context6, "getApplicationContext(...)");
                        eble0.a = dlmg.a(context6, s12, s13);
                        eble0.b(domu.a(AppContextProvider.a()));
                        eble0.c = new done();
                        eble0.d = new edop();
                        eble0.b = new dmgr("com.google.android.gms");
                        eble0.a().inject(ebtx0);
                        fich fich3 = ebtx0.h;
                        if(fich3 == null) {
                            ibuq.j("sloManager");
                            fich3 = null;
                        }
                        ficj ficj3 = fich3.a(1L, TimeUnit.MINUTES);
                        fhwb fhwb3 = ebtx0.g;
                        if(fhwb3 == null) {
                            ibuq.j("semanticLogger");
                            fhwb3 = null;
                        }
                        fhvz fhvz3 = fhwa.a(203500);
                        fhvz3.c(fhwp.b(dyfv3.d));
                        fhvz3.b(ficj3.a());
                        fhwb3.a(fhvz3.a());
                        dypj dypj3 = ebtx0.e;
                        if(dypj3 == null) {
                            ibuq.j("seManager");
                        }
                        else {
                            dypj0 = dypj3;
                        }
                        evql evql2 = dypj0.d();
                        evql2.y(ebtx0.a(), new ebtv(new ebtu(ebtx0, ficj3)));
                        evql2.v(ebtx0.a(), new ebtw(ebtx0, ficj3));
                        return;
                    }
                    return;
                }
                case 8: {
                    ebyk ebyk0 = new ebyk(dyfv0, this.c, this.j, context0);
                    String s14 = ebyk0.b.d;
                    ibuq.e(s14, "getAccountName(...)");
                    String s15 = eccr.b(ebyk0.e, s14);
                    Context context7 = AppContextProvider.a();
                    ibuq.e(context7, "getApplicationContext(...)");
                    ibuq.c(s15);
                    dola dola2 = dlmg.a(context7, s14, s15);
                    dmgr dmgr2 = new dmgr(ebyk0.d);
                    domv domv3 = domu.a(AppContextProvider.a());
                    Preconditions.b(domv3);
                    done done2 = new done();
                    edop edop2 = new edop();
                    Preconditions.a(dola2, dola.class);
                    Preconditions.a(dmgr2, dmgr.class);
                    Preconditions.a(done2, domw.class);
                    Preconditions.a(edop2, edor.class);
                    Preconditions.a(domv3, domv.class);
                    new ebpt(dola2, dmgr2, done2, edop2, domv3).inject(ebyk0);
                    ibrt ibrt0 = ebyk0.f;
                    if(ibrt0 == null) {
                        ibuq.j("highSpeedCoroutineContext");
                        ibrt0 = null;
                    }
                    icbb.b(iccl.b(ibrt0), null, null, new ebyj(ebyk0, null), 3);
                    return;
                }
                case 9: {
                    ebtt ebtt0 = new ebtt(dyfv0, this.c, context0);
                    String s16 = ebtt0.a.d;
                    ibuq.e(s16, "getAccountName(...)");
                    String s17 = eccr.b(ebtt0.c, s16);
                    if(s17 != null) {
                        ebky ebky0 = new ebky();
                        Context context8 = AppContextProvider.a();
                        ibuq.e(context8, "getApplicationContext(...)");
                        ebky0.a = dlmg.a(context8, s16, s17);
                        ebky0.b(domu.a(AppContextProvider.a()));
                        ebky0.c = new done();
                        ebky0.d = new edop();
                        ebky0.b = new dmgr("com.google.android.gms");
                        ebky0.a().inject(ebtt0);
                        try {
                            donp donp0 = ebtt0.b;
                            Status status0 = Status.b;
                            dyga dyga1 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
                            dyhb dyhb0 = dyha.a(((ProtoLiteMessage)dygz.a).v_newBuilder());
                            dypj dypj4 = ebtt0.d;
                            if(dypj4 == null) {
                                ibuq.j("seManager");
                            }
                            else {
                                dypj0 = dypj4;
                            }
                            String s18 = dypj0.a().d;
                            ibuq.e(s18, "getSeId(...)");
                            dyhb0.b(s18);
                            dyga1.c(dyhb0.a());
                            donp0.b(status0, dyga1.a().toBytesArray());
                        }
                        catch(InterruptedException interruptedException0) {
                            ebtt0.a(interruptedException0);
                        }
                        catch(ExecutionException executionException0) {
                            ebtt0.a(executionException0);
                        }
                        return;
                    }
                    return;
                }
                case 10: {
                    new ebjh(this.c, this.j, context0).b();
                    return;
                }
                case 11: {
                    ebuw ebuw0 = new ebuw(dyfv0, this.c, this.j, context0);
                    String s19 = ebuw0.b.d;
                    ibuq.e(s19, "getAccountName(...)");
                    String s20 = eccr.b(ebuw0.e, s19);
                    ebms ebms0 = new ebms();
                    ebms0.b(domu.a(AppContextProvider.a()));
                    ebms0.c = new done();
                    ebms0.d = new edop();
                    ebms0.b = new dmgr(ebuw0.d);
                    Context context9 = AppContextProvider.a();
                    ibuq.e(context9, "getApplicationContext(...)");
                    ibuq.c(s20);
                    ebms0.a = dlmg.a(context9, s19, s20);
                    ebms0.a().inject(ebuw0);
                    dypj dypj5 = ebuw0.f;
                    if(dypj5 == null) {
                        ibuq.j("seManager");
                    }
                    else {
                        dypj0 = dypj5;
                    }
                    dypj0.g().b(new ebuu(new ebut(ebuw0))).A(new ebuv(ebuw0));
                    return;
                }
                case 12: {
                    ebvh ebvh0 = new ebvh(dyfv0, this.c, this.j, context0);
                    dyfv dyfv4 = ebvh0.b;
                    String s21 = dyfv4.d;
                    ibuq.e(s21, "getAccountName(...)");
                    String s22 = eccr.b(ebvh0.e, s21);
                    ebnd ebnd0 = new ebnd();
                    Context context10 = AppContextProvider.a();
                    ibuq.e(context10, "getApplicationContext(...)");
                    ibuq.c(s22);
                    ebnd0.a = dlmg.a(context10, s21, s22);
                    ebnd0.b = new dmgr(ebvh0.d);
                    ebnd0.b(domu.a(AppContextProvider.a()));
                    ebnd0.c = new done();
                    ebnd0.d = new edop();
                    ebnd0.a().inject(ebvh0);
                    dyra dyra0 = ebvh0.h;
                    if(dyra0 == null) {
                        ibuq.j("octopusCardManager");
                    }
                    else {
                        dypj0 = dyra0;
                    }
                    dyhn dyhn0 = dyfv4.b == 5 ? ((dyhn)dyfv4.c) : dyhn.a;
                    dyfc dyfc0 = dyfc.b(dyhn0.b) == null ? dyfc.d : dyfc.b(dyhn0.b);
                    ibuq.e(dyfc0, "getFetchMode(...)");
                    evql evql3 = ((dyra)dypj0).d(dyfc0);
                    evql3.y(ebvh0.a(), new ebvf(new ebve(ebvh0, s21)));
                    evql3.v(ebvh0.a(), new ebvg(ebvh0));
                    return;
                }
                case 13: {
                    ebub ebub0 = new ebub(dyfv0, this.c, this.j, context0);
                    dyfv dyfv5 = ebub0.b;
                    String s23 = dyfv5.d;
                    ibuq.e(s23, "getAccountName(...)");
                    String s24 = eccr.b(ebub0.e, s23);
                    eblk eblk0 = new eblk();
                    Context context11 = AppContextProvider.a();
                    ibuq.e(context11, "getApplicationContext(...)");
                    ibuq.c(s24);
                    eblk0.a = dlmg.a(context11, s23, s24);
                    eblk0.b = new dmgr(ebub0.d);
                    eblk0.b(domu.a(AppContextProvider.a()));
                    eblk0.c = new done();
                    eblk0.d = new edop();
                    eblk0.a().inject(ebub0);
                    dyra dyra1 = ebub0.h;
                    if(dyra1 == null) {
                        ibuq.j("octopusCardManager");
                    }
                    else {
                        dypj0 = dyra1;
                    }
                    String s25 = (dyfv5.b == 6 ? ((dyhd)dyfv5.c) : dyhd.a).c;
                    ibuq.e(s25, "getOctopusCardId(...)");
                    dyhd dyhd0 = dyfv5.b == 6 ? ((dyhd)dyfv5.c) : dyhd.a;
                    dyfc dyfc1 = dyfc.b(dyhd0.b) == null ? dyfc.d : dyfc.b(dyhd0.b);
                    ibuq.e(dyfc1, "getFetchMode(...)");
                    evql evql4 = ((dyra)dypj0).b(s25, dyfc1);
                    evql4.y(ebub0.a(), new ebtz(new ebty(ebub0)));
                    evql4.v(ebub0.a(), new ebua(ebub0));
                    return;
                }
                case 14: {
                    ebyo ebyo0 = new ebyo(dyfv0, this.c, this.j, context0);
                    dyfv dyfv6 = ebyo0.b;
                    String s26 = dyfv6.d;
                    ibuq.e(s26, "getAccountName(...)");
                    String s27 = eccr.b(ebyo0.e, s26);
                    Context context12 = AppContextProvider.a();
                    ibuq.e(context12, "getApplicationContext(...)");
                    ibuq.c(s27);
                    dola dola3 = dlmg.a(context12, s26, s27);
                    dmgr dmgr3 = new dmgr(ebyo0.d);
                    domv domv4 = domu.a(AppContextProvider.a());
                    Preconditions.b(domv4);
                    done done3 = new done();
                    edop edop3 = new edop();
                    Preconditions.a(domv4, domv.class);
                    new ebpw(dola3, dmgr3, done3, edop3, domv4).inject(ebyo0);
                    gtni gtni0 = dypl.h(dyna.i);
                    ibuq.e(gtni0, "paySeProtoToTapAndPay(...)");
                    String s28 = (dyfv6.b == 11 ? ((dyjz)dyfv6.c) : dyjz.a).c;
                    ibuq.e(s28, "getOctopusCardId(...)");
                    dypv dypv0 = ebyo0.g;
                    if(dypv0 == null) {
                        ibuq.j("sePrepaidCardRpcClient");
                        dypv0 = null;
                    }
                    int v1 = dyfv6.b;
                    if(((v1 == 11 ? ((dyjz)dyfv6.c) : dyjz.a).b & 1) != 0) {
                        dypj0 = (v1 == 11 ? ((dyjz)dyfv6.c) : dyjz.a).d;
                    }
                    ebyl ebyl0 = new ebyl(ebyo0, s26, s28);
                    dypv0.e(gtni0, s28, ((ByteString)dypj0), new dpud(new ebym(ebyo0, s26, s28), ebyl0));
                    return;
                }
                case 15: {
                    ebxx ebxx0 = new ebxx(dyfv0, this.c, this.j, context0);
                    String s29 = ebxx0.b.d;
                    ibuq.e(s29, "getAccountName(...)");
                    String s30 = eccr.b(ebxx0.e, s29);
                    ebom ebom0 = new ebom();
                    Context context13 = AppContextProvider.a();
                    ibuq.e(context13, "getApplicationContext(...)");
                    ibuq.c(s30);
                    ebom0.a = dlmg.a(context13, s29, s30);
                    ebom0.b = new dmgr(ebxx0.d);
                    ebom0.b(domu.a(AppContextProvider.a()));
                    ebom0.c = new done();
                    ebom0.d = new edop();
                    ebom0.a().inject(ebxx0);
                    dyju dyju0 = ebxx0.b.b == 12 ? ((dyju)ebxx0.b.c) : dyju.a;
                    dylc dylc0 = dyju0.c == null ? dylc.a : dyju0.c;
                    ibuq.e(dylc0, "getCardData(...)");
                    String s31 = dylc0.d;
                    ibuq.e(s31, "getServiceProviderCardId(...)");
                    int v2 = ebxx0.b.b;
                    byte[] arr_b1 = ((v2 == 12 ? ((dyju)ebxx0.b.c) : dyju.a).b & 2) == 0 ? null : (v2 == 12 ? ((dyju)ebxx0.b.c) : dyju.a).d.toByteArray();
                    dyth dyth0 = ebxx0.i;
                    if(dyth0 == null) {
                        ibuq.j("sePrepaidCardTosStateManager");
                        dyth0 = null;
                    }
                    List list0 = ibpo.b(s31);
                    if(dyth0.a(dyna.i, list0, arr_b1)) {
                        fsge fsge0 = ebxx0.l;
                        if(fsge0 == null) {
                            ibuq.j("octopusClient");
                        }
                        else {
                            dypj0 = fsge0;
                        }
                        evql evql5 = ((fsge)dypj0).d(s29, s31, ftps.b);
                        evql5.b(new ebxs(new ebxr(ebxx0, dylc0)));
                        evql5.A(new ebxt(ebxx0, s31));
                        return;
                    }
                    Status status1 = new Status(8, "PERSIST_TOS_FAILURE_AFTER_PROVISION_CARD");
                    ebxx0.c.x(status1);
                    ((ggtj)ebxx.a.j()).x("Failed to mark TOS accepted for the provision card.");
                    return;
                }
                case 16: {
                    new ebjf(dyfv0, this.c, this.j, context0).b();
                    return;
                }
                case 17: {
                    ebvm ebvm0 = new ebvm(dyfv0, this.c, this.j, context0);
                    String s32 = ebvm0.b.d;
                    ibuq.e(s32, "getAccountName(...)");
                    String s33 = eccr.b(ebvm0.d, s32);
                    ebnh ebnh0 = new ebnh();
                    Context context14 = AppContextProvider.a();
                    ibuq.e(context14, "getApplicationContext(...)");
                    ibuq.c(s33);
                    ebnh0.a = dlmg.a(context14, s32, s33);
                    ebnh0.b = new dmgr(ebvm0.c);
                    ebnh0.b(domu.a(AppContextProvider.a()));
                    ebnh0.c = new done();
                    ebnh0.d = new edop();
                    ebnh0.a().inject(ebvm0);
                    dyhu dyhu0 = ebvm0.b.b == 16 ? ((dyhu)ebvm0.b.c) : dyhu.b;
                    dylc dylc1 = dyhu0.d == null ? dylc.a : dyhu0.d;
                    ibuq.e(dylc1, "getCardData(...)");
                    dyng dyng0 = dylc1.h == null ? dyng.a : dylc1.h;
                    dyir dyir0 = dyng0.b == 8 ? ((dyir)dyng0.c) : dyir.a;
                    dyin dyin0 = dyir0.h == null ? dyin.a : dyir0.h;
                    ibuq.e(dyin0, "getCardArtData(...)");
                    List list1 = ibpo.g(new String[]{dyin0.e, dyin0.f, dyin0.g, dyin0.b});
                    if(!(list1 instanceof Collection) || !list1.isEmpty()) {
                        for(Object object0: list1) {
                            ibuq.c(((String)object0));
                            if(((String)object0).length() != 0) {
                                dypv dypv1 = ebvm0.g;
                                if(dypv1 == null) {
                                    ibuq.j("rpcClient");
                                }
                                else {
                                    dypj0 = dypv1;
                                }
                                evql evql6 = ((dypv)dypj0).a(list1);
                                evql6.b(new ebvj(new ebvi(dylc1, ebvm0, dyin0)));
                                evql6.A(new ebvk(ebvm0));
                                return;
                            }
                        }
                    }
                    ebvm0.b();
                    return;
                }
                case 18: {
                    ebwf ebwf0 = new ebwf(dyfv0, this.c, this.j, context0);
                    ebod ebod0 = new ebod();
                    ebod0.b(domu.a(AppContextProvider.a()));
                    ebod0.a = new done();
                    ebod0.a().inject(ebwf0);
                    hfuo hfuo0 = (ebwf0.b.b == 21 ? ((dyjn)ebwf0.b.c) : dyjn.a).b;
                    ibuq.e(hfuo0, "getCardIdsList(...)");
                    ibrt ibrt1 = ebwf0.d;
                    if(ibrt1 == null) {
                        ibuq.j("highSpeedCoroutineContext");
                        ibrt1 = null;
                    }
                    icbb.b(iccl.b(ibrt1), null, null, new ebwd(ebwf0, hfuo0, null), 3);
                    return;
                }
                case 19: 
                case 20: {
                    this.c.x(Status.d);
                    return;
                }
                default: {
                    this.c.x(Status.d);
                    return;
                }
            }
        }
        throw null;
    }

    @Override  // cjtm
    public final void j(Status status0) {
        if(status0 == null) {
            status0 = Status.d;
        }
        this.c.x(status0);
    }
}

