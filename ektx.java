import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import com.google.android.gms.scheduler.modeltasks.ModelTaskService;
import j..time.Clock;
import j..time.Instant;
import j..time.LocalTime;
import j..time.ZonedDateTime;
import j..time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ektx extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final ModelTaskService f;
    final cllr g;

    public ektx(ModelTaskService modelTaskService0, cllr cllr0, ibrl ibrl0) {
        this.f = modelTaskService0;
        this.g = cllr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ektx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ektx(this.f, this.g, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        int v20;
        Object object10;
        Object object9;
        Object object8;
        ekul ekul6;
        Object object6;
        Iterator iterator0;
        Object object5;
        Object object4;
        Object object1 = ibrx.a;
        switch(this.e) {
            case 0: {
                ibnx.b(object0);
                if(hrwk.d()) {
                    ((ggtj)this.f.a.h()).x("Stopping all model tasks");
                    this.e = 1;
                    if(ektw.a.b(this) != object1) {
                        return new Integer(0);
                    }
                }
                else {
                    ggtj ggtj0 = (ggtj)this.f.a.h();
                    object4 = this.g.a;
                    ggtj0.B("Running ModelTask %s", object4);
                    this.a = object4;
                    this.e = 2;
                    object5 = ektr.a.a(this);
                    if(object5 != object1) {
                        iterator0 = ((List)object5).iterator();
                        goto label_27;
                    }
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                return new Integer(0);
            }
            case 2: {
                object4 = this.a;
                ibnx.b(object0);
                object5 = object0;
                iterator0 = ((List)object5).iterator();
                while(true) {
                label_27:
                    object6 = null;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    object6 = iterator0.next();
                    ekub ekub0 = ((ekug)object6).c;
                    if(ekub0 == null) {
                        ekub0 = ekub.a;
                    }
                    if(ibuq.m(ekub0.d, object4)) {
                        break;
                    }
                }
                Bundle bundle0 = this.g.b;
                Bundle bundle1 = bundle0 == null ? null : bundle0.getBundle("taskMetadata");
                if(((ekug)object6) != null && bundle1 != null) {
                    Bundle bundle2 = bundle1.getBundle("constraintsStaged");
                    ibuq.c(bundle2);
                    ektz ektz0 = ektz.a;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ektz0).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ekud.a).v_newBuilder();
                    int v = bundle2.getInt("csbstart", 0);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ekud ekud0 = (ekud)hftp1.b_message;
                    ekud0.b |= 1;
                    ekud0.c = v;
                    int v1 = bundle2.getInt("csbend", 100);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ekud ekud1 = (ekud)hftp1.b_message;
                    ekud1.b |= 2;
                    ekud1.d = v1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ektz ektz1 = (ektz)hftp0.b_message;
                    ekud ekud2 = (ekud)hftp1.N_build();
                    ekud2.getClass();
                    ektz1.c = ekud2;
                    ektz1.b |= 1;
                    ekty ekty0 = ekty.a;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ekty0).v_newBuilder();
                    ibuq.e(hftp2, "newBuilder(...)");
                    int v2 = bundle2.getInt("csbnetwork", -1);
                    if(v2 != -1) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ekty ekty1 = (ekty)hftp2.b_message;
                        ekty1.b |= 1;
                        ekty1.c = v2;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ektz ektz2 = (ektz)hftp0.b_message;
                        ekty ekty2 = (ekty)hftp2.N_build();
                        ekty2.getClass();
                        ektz2.d = ekty2;
                        ektz2.b |= 2;
                    }
                    int v3 = bundle2.getInt("csbcharging", -1);
                    if(v3 != -1) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ekty ekty3 = (ekty)hftp2.b_message;
                        ekty3.b |= 2;
                        ekty3.d = v3;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ektz ektz3 = (ektz)hftp0.b_message;
                        ekty ekty4 = (ekty)hftp2.N_build();
                        ekty4.getClass();
                        ektz3.d = ekty4;
                        ektz3.b |= 2;
                    }
                    int v4 = bundle2.getInt("csbidleness", -1);
                    if(v4 != -1) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ekty ekty5 = (ekty)hftp2.b_message;
                        ekty5.b |= 4;
                        ekty5.e = v4;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ektz ektz4 = (ektz)hftp0.b_message;
                        ekty ekty6 = (ekty)hftp2.N_build();
                        ekty6.getClass();
                        ektz4.d = ekty6;
                        ektz4.b |= 2;
                    }
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ekul.a).v_newBuilder();
                    int v5 = bundle1.getInt("pCount");
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ekul ekul0 = (ekul)hftp3.b_message;
                    ekul0.b |= 2;
                    ekul0.d = v5;
                    int v6 = bundle1.getInt("constraintStage");
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ekul ekul1 = (ekul)hftp3.b_message;
                    ekul1.b |= 4;
                    ekul1.e = v6;
                    long v7 = bundle1.getLong("scheduleTimeTs");
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ekul ekul2 = (ekul)hftp3.b_message;
                    ekul2.b |= 8;
                    ekul2.f = v7;
                    long v8 = bundle1.getLong("firstWindowStart");
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ekul ekul3 = (ekul)hftp3.b_message;
                    ekul3.b |= 16;
                    ekul3.g = v8;
                    long v9 = bundle1.getLong("periodMillis");
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ekul ekul4 = (ekul)hftp3.b_message;
                    ekul4.b |= 0x20;
                    ekul4.h = v9;
                    boolean z = bundle1.getBoolean("isLastStage");
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp3.b_message;
                    ((ekul)hftv0).b |= 0x40;
                    ((ekul)hftv0).i = z;
                    if(!hftv0.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ekul ekul5 = (ekul)hftp3.b_message;
                    ektz ektz5 = (ektz)hftp0.N_build();
                    ektz5.getClass();
                    ekul5.c = ektz5;
                    ekul5.b |= 1;
                    ProtoLiteMessage hftv1 = hftp3.N_build();
                    ibuq.e(hftv1, "build(...)");
                    ekul6 = (ekul)hftv1;
                    ekqx ekqx0 = new ekqx(AppContextProvider.a());
                    ekxh ekxh0 = ekxh.a(AppContextProvider.a());
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)ekue.a).v_newBuilder();
                    boolean z1 = ekqx0.c();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ekue ekue0 = (ekue)hftp4.b_message;
                    ekue0.b |= 0x40;
                    ekue0.i = z1;
                    boolean z2 = ((Boolean)ekxh0.a.f(Boolean.valueOf(false))).booleanValue();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ekue ekue1 = (ekue)hftp4.b_message;
                    ekue1.b |= 16;
                    ekue1.g = z2;
                    int v10 = ((Number)ekxh0.b.f(Integer.valueOf(-1))).intValue();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp4.b_message;
                    ((ekue)hftv2).b |= 0x20;
                    ((ekue)hftv2).h = v10;
                    if(!hftv2.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ekue ekue2 = (ekue)hftp4.b_message;
                    ekue2.b |= 1;
                    ekue2.c = 2;
                    Object object7 = AppContextProvider.a().getSystemService("connectivity");
                    ibuq.d(object7, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    Network network0 = ((ConnectivityManager)object7).getActiveNetwork();
                    if(network0 != null) {
                        NetworkCapabilities networkCapabilities0 = ((ConnectivityManager)object7).getNetworkCapabilities(network0);
                        if(networkCapabilities0 != null) {
                            if(networkCapabilities0.hasTransport(0)) {
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ekue ekue3 = (ekue)hftp4.b_message;
                                ekue3.b |= 2;
                                ekue3.d = true;
                            }
                            if(networkCapabilities0.hasTransport(1)) {
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ekue ekue4 = (ekue)hftp4.b_message;
                                ekue4.b |= 4;
                                ekue4.e = true;
                            }
                            if(networkCapabilities0.hasTransport(2)) {
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ekue ekue5 = (ekue)hftp4.b_message;
                                ekue5.b |= 8;
                                ekue5.f = true;
                            }
                            if(networkCapabilities0.hasCapability(12) && networkCapabilities0.hasCapability(16)) {
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ekue ekue6 = (ekue)hftp4.b_message;
                                ekue6.b |= 1;
                                ekue6.c = 0;
                            }
                            if(networkCapabilities0.hasCapability(11)) {
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ekue ekue7 = (ekue)hftp4.b_message;
                                ekue7.b |= 1;
                                ekue7.c = 1;
                            }
                        }
                    }
                    ProtoLiteMessage hftv3 = hftp4.N_build();
                    ibuq.e(hftv3, "build(...)");
                    Instant instant0 = Instant.now();
                    ibuq.e(instant0, "now(...)");
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)ekuf.a).v_newBuilder();
                    long v11 = instant0.toEpochMilli();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ekuf ekuf0 = (ekuf)hftp5.b_message;
                    ekuf0.b |= 1;
                    ekuf0.c = v11;
                    LocalTime localTime0 = ZonedDateTime.ofInstant(instant0, Clock.systemDefaultZone().getZone()).toLocalTime();
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hjio.a).v_newBuilder();
                    int v12 = localTime0.getHour();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((hjio)hftp6.b_message).b = v12;
                    int v13 = localTime0.getMinute();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((hjio)hftp6.b_message).c = v13;
                    int v14 = localTime0.getSecond();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((hjio)hftp6.b_message).d = v14;
                    int v15 = localTime0.getNano();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((hjio)hftp6.b_message).e = v15;
                    hjio hjio0 = (hjio)hftp6.N_build();
                    ibuq.e(hjio0, "let(...)");
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ekuf ekuf1 = (ekuf)hftp5.b_message;
                    hjio0.getClass();
                    ekuf1.d = hjio0;
                    ekuf1.b |= 2;
                    Instant instant1 = Instant.ofEpochMilli(ekul6.g).plusMillis(((long)ekul6.d) * ekul6.h);
                    ibuq.e(instant1, "plusMillis(...)");
                    Instant instant2 = instant1.plusMillis(ekul6.h);
                    ibuq.e(instant2, "plusMillis(...)");
                    boolean z3 = instant0.isAfter(instant2);
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp5.b_message;
                    ((ekuf)hftv4).b |= 4;
                    ((ekuf)hftv4).e = z3;
                    int v16 = ekul6.e;
                    if(!hftv4.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp5.b_message;
                    ((ekuf)hftv5).b |= 8;
                    ((ekuf)hftv5).f = v16;
                    ektz ektz6 = ekul6.c == null ? ektz0 : ekul6.c;
                    ekty ekty7 = ektz6.d == null ? ekty0 : ektz6.d;
                    if(!hftv5.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp5.b_message;
                    ekty7.getClass();
                    ((ekuf)hftv6).g = ekty7;
                    ((ekuf)hftv6).b |= 16;
                    int v17 = ekul6.d;
                    if(!hftv6.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ekuf ekuf2 = (ekuf)hftp5.b_message;
                    ekuf2.b |= 0x20;
                    ekuf2.h = v17;
                    Instant instant3 = Instant.ofEpochMilli(ekul6.g).plusMillis(ekul6.h * ((long)ekul6.d));
                    ibuq.e(instant3, "plusMillis(...)");
                    long v18 = instant3.until(instant0, ChronoUnit.MINUTES) / 30L;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ekuf ekuf3 = (ekuf)hftp5.b_message;
                    ekuf3.b |= 0x40;
                    ekuf3.i = v18;
                    ProtoLiteMessage hftv7 = hftp5.N_build();
                    ibuq.e(hftv7, "build(...)");
                    ekty ekty8 = (ekul6.c == null ? ektz0 : ekul6.c).d;
                    if(ekty8 != null) {
                        ekty0 = ekty8;
                    }
                    ibuq.e(ekty0, "getConstraints(...)");
                    int v19 = ekty0.c;
                    switch(v19) {
                        case 0: {
                            switch(((ekue)hftv3).c) {
                                case 0: 
                                case 1: {
                                    goto label_304;
                                }
                                default: {
                                    goto label_305;
                                }
                            }
                        }
                        case 2: {
                        label_304:
                            if(ekty0.d == 1 && !((ekue)hftv3).g || ekty0.e == 1 && ((ekue)hftv3).i) {
                            label_305:
                                object8 = ((ekuf)hftv7).e ? ekui.d : ekui.c;
                            }
                            else {
                                object8 = ekui.b;
                            }
                            break;
                        }
                        default: {
                            if(v19 != 1 || ((ekue)hftv3).c == 1) {
                                goto label_304;
                            }
                            else {
                                goto label_305;
                            }
                        }
                    }
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)ekuj.a).v_newBuilder();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ProtoLiteMessage hftv8 = hftp7.b_message;
                    ((ekuj)hftv8).c = object8.e;
                    ((ekuj)hftv8).b |= 1;
                    if(!hftv8.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ProtoLiteMessage hftv9 = hftp7.b_message;
                    ((ekue)hftv3).getClass();
                    ((ekuj)hftv9).d = (ekue)hftv3;
                    ((ekuj)hftv9).b |= 2;
                    if(!hftv9.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ekuj ekuj0 = (ekuj)hftp7.b_message;
                    ((ekuf)hftv7).getClass();
                    ekuj0.e = (ekuf)hftv7;
                    ekuj0.b |= 4;
                    ProtoLiteMessage hftv10 = hftp7.N_build();
                    ibuq.e(hftv10, "build(...)");
                    ProtoLiteBuilder hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ekug)object6))).jf(5, null);
                    hftp8.X(((ProtoLiteMessage)(((ekug)object6))));
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    ekug ekug0 = (ekug)hftp8.b_message;
                    ((ekuj)hftv10).getClass();
                    hfuo hfuo0 = ekug0.e;
                    if(!hfuo0.c()) {
                        ekug0.e = ProtoLiteMessage.E(hfuo0);
                    }
                    ekug0.e.add(((ekuj)hftv10));
                    ProtoLiteMessage hftv11 = hftp8.N_build();
                    ibuq.e(hftv11, "build(...)");
                    List list0 = ibpo.at(((List)object5));
                    list0.remove(((ekug)object6));
                    list0.add(((ekug)hftv11));
                    this.a = object4;
                    this.b = ekul6;
                    this.c = object8;
                    this.d = (ekug)hftv11;
                    this.e = 4;
                    if(ektr.b(list0, this) != object1) {
                        object9 = object4;
                        object10 = (ekug)hftv11;
                        goto label_368;
                    }
                }
                else {
                    ((ggtj)this.f.a.j()).B("ModelTask not found: %s", object4);
                    this.a = null;
                    this.e = 3;
                    if(ektw.a.b(this) != object1) {
                        return new Integer(2);
                    }
                }
                break;
            }
            case 3: {
                ibnx.b(object0);
                return new Integer(2);
            }
            case 4: {
                object10 = this.d;
                Object object11 = this.c;
                ekul6 = (ekul)this.b;
                object9 = this.a;
                ibnx.b(object0);
                object8 = object11;
            label_368:
                hfuo hfuo1 = ((ekug)object10).e;
                ibuq.e(hfuo1, "getRunsList(...)");
                ekui ekui0 = ekui.b(((ekuj)ibpo.W(hfuo1)).c);
                if(ekui0 == null) {
                    ekui0 = ekui.a;
                }
                if(ekui0 != ekui.c) {
                    ekub ekub1 = ((ekug)object10).c;
                    if(ekub1 == null) {
                        ekub1 = ekub.a;
                    }
                    if(ekub1.f - 1 == ekul6.d || hrwk.a.c().e()) {
                        hfuo hfuo2 = ((ekug)object10).e;
                        ibuq.e(hfuo2, "getRunsList(...)");
                        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo2, 10));
                        for(Iterator iterator1 = hfuo2.iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                            Object object12 = iterator1.next();
                            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)glmm.a).v_newBuilder();
                            ekui ekui1 = ekui.b(((ekuj)object12).c);
                            if(ekui1 == null) {
                                ekui1 = ekui.a;
                            }
                            ibuq.e(ekui1, "getRunOutcome(...)");
                            ibuq.f(ekui1, "<this>");
                            switch(ekui1.ordinal()) {
                                case 0: {
                                    v20 = 1;
                                    break;
                                }
                                case 1: {
                                    v20 = 2;
                                    break;
                                }
                                case 2: {
                                    v20 = 3;
                                    break;
                                }
                                case 3: {
                                    v20 = 4;
                                    break;
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            ((glmm)hftp9.b_message).c = v20 - 1;
                            ((glmm)hftp9.b_message).b |= 1;
                            ekuf ekuf4 = ((ekuj)object12).e;
                            if(ekuf4 == null) {
                                ekuf4 = ekuf.a;
                            }
                            ibuq.e(ekuf4, "getExecutionStats(...)");
                            ibuq.f(ekuf4, "<this>");
                            ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)glmj.a).v_newBuilder();
                            long v21 = ekuf4.c;
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            glmj glmj0 = (glmj)hftp10.b_message;
                            glmj0.b |= 1;
                            glmj0.c = v21;
                            hjio hjio1 = ekuf4.d == null ? hjio.a : ekuf4.d;
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            ProtoLiteMessage hftv12 = hftp10.b_message;
                            hjio1.getClass();
                            ((glmj)hftv12).d = hjio1;
                            ((glmj)hftv12).b |= 2;
                            boolean z4 = ekuf4.e;
                            if(!hftv12.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            ProtoLiteMessage hftv13 = hftp10.b_message;
                            ((glmj)hftv13).b |= 4;
                            ((glmj)hftv13).e = z4;
                            int v22 = ekuf4.f;
                            if(!hftv13.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            glmj glmj1 = (glmj)hftp10.b_message;
                            glmj1.b |= 8;
                            glmj1.f = v22;
                            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)glmh.a).v_newBuilder();
                            int v23 = (ekuf4.g == null ? ekty.a : ekuf4.g).c;
                            if(!hftp11.b_message.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            ProtoLiteMessage hftv14 = hftp11.b_message;
                            ((glmh)hftv14).b |= 1;
                            ((glmh)hftv14).c = v23;
                            int v24 = (ekuf4.g == null ? ekty.a : ekuf4.g).d;
                            if(!hftv14.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            ProtoLiteMessage hftv15 = hftp11.b_message;
                            ((glmh)hftv15).b |= 2;
                            ((glmh)hftv15).d = v24;
                            int v25 = (ekuf4.g == null ? ekty.a : ekuf4.g).e;
                            if(!hftv15.isImmutable()) {
                                hftp11.ensureMutable();
                            }
                            glmh glmh0 = (glmh)hftp11.b_message;
                            glmh0.b |= 4;
                            glmh0.e = v25;
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            glmj glmj2 = (glmj)hftp10.b_message;
                            glmh glmh1 = (glmh)hftp11.N_build();
                            glmh1.getClass();
                            glmj2.g = glmh1;
                            glmj2.b |= 16;
                            int v26 = ekuf4.h;
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            ProtoLiteMessage hftv16 = hftp10.b_message;
                            ((glmj)hftv16).b |= 0x20;
                            ((glmj)hftv16).h = v26;
                            long v27 = ekuf4.i;
                            if(!hftv16.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            glmj glmj3 = (glmj)hftp10.b_message;
                            glmj3.b |= 0x40;
                            glmj3.i = v27;
                            ProtoLiteMessage hftv17 = hftp10.N_build();
                            ibuq.e(hftv17, "build(...)");
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            glmm glmm0 = (glmm)hftp9.b_message;
                            ((glmj)hftv17).getClass();
                            glmm0.e = (glmj)hftv17;
                            glmm0.b |= 4;
                            ekue ekue8 = ((ekuj)object12).d;
                            if(ekue8 == null) {
                                ekue8 = ekue.a;
                            }
                            ibuq.e(ekue8, "getState(...)");
                            ibuq.f(ekue8, "<this>");
                            long v28 = ekue8.d ? 1L : 0L;
                            if(ekue8.e) {
                                v28 |= 2L;
                            }
                            if(ekue8.f) {
                                v28 |= 4L;
                            }
                            ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)glmi.a).v_newBuilder();
                            int v29 = ekue8.c;
                            if(!hftp12.b_message.isImmutable()) {
                                hftp12.ensureMutable();
                            }
                            ProtoLiteMessage hftv18 = hftp12.b_message;
                            ((glmi)hftv18).b |= 1;
                            ((glmi)hftv18).c = v29;
                            boolean z5 = ekue8.g;
                            if(!hftv18.isImmutable()) {
                                hftp12.ensureMutable();
                            }
                            ProtoLiteMessage hftv19 = hftp12.b_message;
                            ((glmi)hftv19).b |= 4;
                            ((glmi)hftv19).e = z5;
                            boolean z6 = ekue8.i;
                            if(!hftv19.isImmutable()) {
                                hftp12.ensureMutable();
                            }
                            ProtoLiteMessage hftv20 = hftp12.b_message;
                            ((glmi)hftv20).b |= 16;
                            ((glmi)hftv20).f = z6;
                            if(!hftv20.isImmutable()) {
                                hftp12.ensureMutable();
                            }
                            glmi glmi0 = (glmi)hftp12.b_message;
                            glmi0.b |= 2;
                            glmi0.d = v28;
                            ProtoLiteMessage hftv21 = hftp12.N_build();
                            ibuq.e(hftv21, "build(...)");
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            glmm glmm1 = (glmm)hftp9.b_message;
                            ((glmi)hftv21).getClass();
                            glmm1.d = (glmi)hftv21;
                            glmm1.b |= 2;
                            arrayList0.add(((glmm)hftp9.N_build()));
                        }
                        ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)glmk.a).v_newBuilder();
                        ekub ekub2 = ((ekug)object10).c;
                        if(ekub2 == null) {
                            ekub2 = ekub.a;
                        }
                        String s = ekub2.d;
                        if(!hftp13.b_message.isImmutable()) {
                            hftp13.ensureMutable();
                        }
                        ProtoLiteMessage hftv22 = hftp13.b_message;
                        s.getClass();
                        ((glmk)hftv22).b |= 1;
                        ((glmk)hftv22).c = s;
                        long v30 = ((ekug)object10).d;
                        if(!hftv22.isImmutable()) {
                            hftp13.ensureMutable();
                        }
                        ProtoLiteMessage hftv23 = hftp13.b_message;
                        ((glmk)hftv23).b |= 2;
                        ((glmk)hftv23).d = v30;
                        if(!hftv23.isImmutable()) {
                            hftp13.ensureMutable();
                        }
                        glmk glmk0 = (glmk)hftp13.b_message;
                        hfuo hfuo3 = glmk0.e;
                        if(!hfuo3.c()) {
                            glmk0.e = ProtoLiteMessage.E(hfuo3);
                        }
                        hfrj.E(arrayList0, glmk0.e);
                        ProtoLiteMessage hftv24 = hftp13.N_build();
                        ibuq.e(hftv24, "build(...)");
                        chws chws0 = chws.v();
                        glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
                        ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)glmn.a).v_newBuilder();
                        if(!hftp14.b_message.isImmutable()) {
                            hftp14.ensureMutable();
                        }
                        glmn glmn0 = (glmn)hftp14.b_message;
                        ((glmk)hftv24).getClass();
                        glmn0.c = (glmk)hftv24;
                        glmn0.b |= 1;
                        if(!glil0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)glil0).ensureMutable();
                        }
                        glim glim0 = (glim)glil0.b_message;
                        glmn glmn1 = (glmn)hftp14.N_build();
                        glmn1.getClass();
                        hfuo hfuo4 = glim0.am;
                        if(!hfuo4.c()) {
                            glim0.am = ProtoLiteMessage.E(hfuo4);
                        }
                        glim0.am.add(glmn1);
                        chws0.j(((ProtoLiteBuilder)glil0).N_build());
                    }
                }
                this.a = object9;
                this.b = object8;
                this.c = null;
                this.d = null;
                this.e = 5;
                if(ektw.a.b(this) != object1) {
                    object2 = object8;
                    object3 = object9;
                    ((ggtj)this.f.a.h()).R("ModelTask: %s execution complete with runOutcome: %s", object3, object2);
                    return new Integer(0);
                }
                break;
            }
            default: {
                object2 = (ekui)this.b;
                object3 = this.a;
                ibnx.b(object0);
                ((ggtj)this.f.a.h()).R("ModelTask: %s execution complete with runOutcome: %s", object3, object2);
                return new Integer(0);
            }
        }
        return object1;
    }
}

