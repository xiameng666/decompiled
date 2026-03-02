import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.NotifyCardTapEventRequest;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public final class ebvx extends ebav {
    public final donp a;
    public boolean b;
    public ebst c;
    public bbng d;
    public etgl e;
    private static final bboh f;
    private final NotifyCardTapEventRequest g;
    private final long h;

    static {
        ebvx.f = bboh.b("Pay", bbcu.cZ);
    }

    public ebvx(NotifyCardTapEventRequest notifyCardTapEventRequest0, String s, donp donp0, azug azug0) {
        ibuq.f(notifyCardTapEventRequest0, "request");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        ibuq.f(notifyCardTapEventRequest0, "request");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("NotifyCardTapEvent", s, azug0);
        this.g = notifyCardTapEventRequest0;
        this.a = donp0;
        this.h = System.currentTimeMillis();
        this.b = true;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        ibuq.f(context0, "context");
    }

    public final Object c(Context context0, ibrl ibrl0) {
        Object object9;
        long v9;
        Object object8;
        Object object7;
        Object object6;
        Object object4;
        dyev dyev4;
        dygn dygn0;
        dyiy dyiy5;
        dyix dyix5;
        Iterator iterator1;
        dygm dygm5;
        boolean z1;
        int v4;
        evql evql1;
        ebvv ebvv1;
        ibsm ibsm1;
        long v3;
        ibrx ibrx1;
        ibsm ibsm0;
        ebvv ebvv0;
        if((ibrl0 instanceof ebvv)) {
            ebvv0 = (ebvv)ibrl0;
            int v = ebvv0.f;
            if((v & 0x80000000) == 0) {
                ebvv0 = new ebvv(this, ibrl0);
            }
            else {
                ebvv0.f = v - 0x80000000;
            }
        }
        else {
            ebvv0 = new ebvv(this, ibrl0);
        }
        Object object0 = ebvv0.d;
        ibrx ibrx0 = ibrx.a;
        int v1 = ebvv0.f;
        switch(v1) {
            case 0: {
                ibnx.b(object0);
                domv domv0 = domu.a(AppContextProvider.a());
                Preconditions.b(domv0);
                new ebnw(domv0).inject(this);
                this.e();
                long v2 = System.currentTimeMillis();
                if(hwrz.a.f().j()) {
                    ibsm0 = ebvt.a;
                    ibrx1 = ibrx0;
                    v3 = v2;
                }
                else {
                    boolean z = this.b;
                    ibuq.f(context0, "context");
                    ibuq.f(this.j, "packageName");
                    hfuo hfuo0 = hwit.a.b().a().b;
                    ibrx1 = ibrx0;
                    ibuq.e(hfuo0, "getConfigsList(...)");
                    v3 = v2;
                    ibxn ibxn0 = new ibxn(new ibxo(new ibxm(ibpo.aA(hfuo0), true, new ebsv(this.j, context0)), new ebsw(z), ibye.a));
                    if(ibxn0.hasNext()) {
                        Object object1 = ibxn0.next();
                        if(ibxn0.hasNext()) {
                            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                            linkedHashSet0.add(object1);
                            while(ibxn0.hasNext()) {
                                Object object2 = ibxn0.next();
                                linkedHashSet0.add(object2);
                            }
                            ibsm0 = linkedHashSet0;
                        }
                        else {
                            ibsm0 = ibqg.b(object1);
                        }
                    }
                    else {
                        ibsm0 = ibpu.a;
                    }
                }
                if(ibsm0.isEmpty()) {
                    return new Status(8, "Caller not authorized");
                }
                evql evql0 = this.d().j();
                try {
                    dyev dyev0 = dyev.a;
                    ibuq.e(dyev0, "getDefaultInstance(...)");
                    String s = this.g.a == null ? "" : this.g.a;
                    ibuq.f(dyev0, "<this>");
                    try {
                        gpzt gpzt0 = gpzv.b(s).i();
                        ibuq.f(dyev0, "<this>");
                        try {
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dyev0).jf(5, null);
                            ibuq.e(hftp0, "newBuilderForType(...)");
                            String[] arr_s = {"felicaCardTapEvent", "octopusCardTapEvent", "felicaCardTapInitialEvent"};
                            if(ibxv.g(new ibym(ibpg.T(arr_s), new ftqc(gpzt0))) > 1) {
                                throw new hfur("Only one of " + ibpg.an(arr_s, ", ", null, null, null, 62) + " should be present");
                            }
                            gpzq gpzq0 = gpzt0.c("felicaCardTapEvent");
                            if(gpzq0 == null) {
                                ibsm1 = ibsm0;
                                ebvv1 = ebvv0;
                                evql1 = evql0;
                            }
                            else if((gpzq0 instanceof gpzs)) {
                                ibsm1 = ibsm0;
                                ebvv1 = ebvv0;
                                evql1 = evql0;
                            }
                            else {
                                ibuq.e(dygm.a, "getDefaultInstance(...)");
                                gpzt gpzt1 = gpzq0.i();
                                ibuq.f(dygm.a, "<this>");
                                ibsm1 = ibsm0;
                                evql1 = evql0;
                                try {
                                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dygm.a).jf(5, null);
                                    ibuq.e(hftp1, "newBuilderForType(...)");
                                    gpzq gpzq1 = gpzt1.c("serviceId");
                                    if(gpzq1 != null && !(gpzq1 instanceof gpzs)) {
                                        String s1 = ftqd.c(gpzq1);
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        dygm dygm0 = (dygm)hftp1.b_message;
                                        s1.getClass();
                                        dygm0.b = s1;
                                    }
                                    gpzq gpzq2 = gpzt1.c("cardId");
                                    if(gpzq2 != null && !(gpzq2 instanceof gpzs)) {
                                        ByteString hfsf0 = ftqd.a(gpzq2);
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        ((dygm)hftp1.b_message).c = hfsf0;
                                    }
                                    gpzq gpzq3 = gpzt1.c("cardNo");
                                    if(gpzq3 != null && !(gpzq3 instanceof gpzs)) {
                                        ByteString hfsf1 = ftqd.a(gpzq3);
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        ((dygm)hftp1.b_message).d = hfsf1;
                                    }
                                    gpzq gpzq4 = gpzt1.c("tapType");
                                    if(gpzq4 == null || (gpzq4 instanceof gpzs)) {
                                        ebvv1 = ebvv0;
                                    }
                                    else {
                                        switch(gpzq4.d()) {
                                            case "ENTER_NO_PAYMENT": {
                                                v4 = 8;
                                                break;
                                            }
                                            case "ENTER_ONLY": {
                                                v4 = 7;
                                                break;
                                            }
                                            case "ENTER_PAYMENT": {
                                                v4 = 9;
                                                break;
                                            }
                                            case "ENTER_TOPUP": {
                                                v4 = 10;
                                                break;
                                            }
                                            case "EXIT_NO_PAYMENT": {
                                                v4 = 11;
                                                break;
                                            }
                                            case "EXIT_PAYMENT": {
                                                v4 = 12;
                                                break;
                                            }
                                            case "EXIT_TOPUP": {
                                                v4 = 13;
                                                break;
                                            }
                                            case "PAYMENT": {
                                                v4 = 3;
                                                break;
                                            }
                                            case "TAPPED": {
                                                v4 = 6;
                                                break;
                                            }
                                            case "TAP_TYPE_UNKNOWN": {
                                                v4 = 2;
                                                break;
                                            }
                                            case "TOPUP": {
                                                v4 = 4;
                                                break;
                                            }
                                            case "TOPUP_SPECIAL": {
                                                v4 = 5;
                                                break;
                                            }
                                            case "UNRECOGNIZED": {
                                                v4 = 1;
                                                break;
                                            }
                                            default: {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        dygm dygm1 = (dygm)hftp1.b_message;
                                        ebvv1 = ebvv0;
                                        if(v4 == 1) {
                                            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                                        }
                                        dygm1.e = v4 - 2;
                                    }
                                    gpzq gpzq5 = gpzt1.c("amount");
                                    if(gpzq5 != null && !(gpzq5 instanceof gpzs)) {
                                        String s2 = ftqd.c(gpzq5);
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        dygm dygm2 = (dygm)hftp1.b_message;
                                        s2.getClass();
                                        dygm2.f = s2;
                                    }
                                    gpzq gpzq6 = gpzt1.c("newBalance");
                                    if(gpzq6 != null && !(gpzq6 instanceof gpzs)) {
                                        String s3 = ftqd.c(gpzq6);
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        dygm dygm3 = (dygm)hftp1.b_message;
                                        s3.getClass();
                                        dygm3.g = s3;
                                    }
                                    gpzq gpzq7 = gpzt1.c("currencyCode");
                                    if(gpzq7 != null && !(gpzq7 instanceof gpzs)) {
                                        String s4 = ftqd.c(gpzq7);
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        dygm dygm4 = (dygm)hftp1.b_message;
                                        s4.getClass();
                                        dygm4.h = s4;
                                    }
                                    gpzq gpzq8 = gpzt1.c("optedInToRenderTiNotification");
                                    if(gpzq8 != null && !(gpzq8 instanceof gpzs)) {
                                        if(gpzq8.d().equals("true")) {
                                            z1 = true;
                                        }
                                        else {
                                            if(!gpzq8.d().equals("false")) {
                                                Objects.toString(gpzq8);
                                                throw new hfur("Invalid bool value: " + gpzq8.toString());
                                            }
                                            z1 = false;
                                        }
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        ((dygm)hftp1.b_message).i = z1;
                                    }
                                    dygm5 = (dygm)hftp1.N_build();
                                }
                                catch(Exception exception2) {
                                    if((exception2 instanceof hfur)) {
                                        throw exception2;
                                    }
                                    throw new hfur(exception2);
                                }
                                ibuq.e(dygm5, "convertExceptionCall(...)");
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                dyev dyev1 = (dyev)hftp0.b_message;
                                dygm5.getClass();
                                dyev1.c = dygm5;
                                dyev1.b = 1;
                            }
                            gpzq gpzq9 = gpzt0.c("octopusCardTapEvent");
                            if(gpzq9 != null && !(gpzq9 instanceof gpzs)) {
                                ibuq.e(dyiy.a, "getDefaultInstance(...)");
                                gpzt gpzt2 = gpzq9.i();
                                ibuq.f(dyiy.a, "<this>");
                                try {
                                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)dyiy.a).jf(5, null);
                                    ibuq.e(hftp2, "newBuilderForType(...)");
                                    gpzq gpzq10 = gpzt2.c("cardId");
                                    if(gpzq10 != null && !(gpzq10 instanceof gpzs)) {
                                        String s5 = ftqd.c(gpzq10);
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        dyiy dyiy0 = (dyiy)hftp2.b_message;
                                        s5.getClass();
                                        dyiy0.b = s5;
                                    }
                                    gpzq gpzq11 = gpzt2.c("balance");
                                    if(gpzq11 != null && !(gpzq11 instanceof gpzs)) {
                                        String s6 = ftqd.c(gpzq11);
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        dyiy dyiy1 = (dyiy)hftp2.b_message;
                                        s6.getClass();
                                        dyiy1.c = s6;
                                    }
                                    gpzq gpzq12 = gpzt2.c("currency");
                                    if(gpzq12 != null && !(gpzq12 instanceof gpzs)) {
                                        String s7 = ftqd.c(gpzq12);
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        dyiy dyiy2 = (dyiy)hftp2.b_message;
                                        s7.getClass();
                                        dyiy2.d = s7;
                                    }
                                    gpzq gpzq13 = gpzt2.c("txnHistoryItemList");
                                    if(gpzq13 != null && !(gpzq13 instanceof gpzs)) {
                                        for(Iterator iterator0 = gpzq13.h().iterator(); iterator0.hasNext(); iterator0 = iterator1) {
                                            Object object3 = iterator0.next();
                                            ibuq.e(dyix.a, "getDefaultInstance(...)");
                                            gpzt gpzt3 = ((gpzq)object3).i();
                                            ibuq.f(dyix.a, "<this>");
                                            try {
                                                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)dyix.a).jf(5, null);
                                                ibuq.e(hftp3, "newBuilderForType(...)");
                                                gpzq gpzq14 = gpzt3.c("amount");
                                                if(gpzq14 != null && !(gpzq14 instanceof gpzs)) {
                                                    String s8 = ftqd.c(gpzq14);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    dyix dyix0 = (dyix)hftp3.b_message;
                                                    s8.getClass();
                                                    iterator1 = iterator0;
                                                    dyix0.b |= 1;
                                                    dyix0.c = s8;
                                                }
                                                else {
                                                    iterator1 = iterator0;
                                                }
                                                gpzq gpzq15 = gpzt3.c("currency");
                                                if(gpzq15 != null && !(gpzq15 instanceof gpzs)) {
                                                    String s9 = ftqd.c(gpzq15);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    dyix dyix1 = (dyix)hftp3.b_message;
                                                    s9.getClass();
                                                    dyix1.b |= 2;
                                                    dyix1.d = s9;
                                                }
                                                gpzq gpzq16 = gpzt3.c("txnDateLong");
                                                if(gpzq16 != null && !(gpzq16 instanceof gpzs)) {
                                                    long v5 = ftqd.b(gpzq16);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ((dyix)hftp3.b_message).e = v5;
                                                }
                                                gpzq gpzq17 = gpzt3.c("txnStartTimeMillis");
                                                if(gpzq17 != null && !(gpzq17 instanceof gpzs)) {
                                                    long v6 = ftqd.b(gpzq17);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ((dyix)hftp3.b_message).f = v6;
                                                }
                                                gpzq gpzq18 = gpzt3.c("txnTimeMillis");
                                                if(gpzq18 != null && !(gpzq18 instanceof gpzs)) {
                                                    long v7 = ftqd.b(gpzq18);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ((dyix)hftp3.b_message).g = v7;
                                                }
                                                gpzq gpzq19 = gpzt3.c("txnType");
                                                if(gpzq19 != null && !(gpzq19 instanceof gpzs)) {
                                                    String s10 = ftqd.c(gpzq19);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    dyix dyix2 = (dyix)hftp3.b_message;
                                                    s10.getClass();
                                                    dyix2.h = s10;
                                                }
                                                gpzq gpzq20 = gpzt3.c("txnDataName");
                                                if(gpzq20 != null && !(gpzq20 instanceof gpzs)) {
                                                    ibuq.e(dyiw.a, "getDefaultInstance(...)");
                                                    gpzt gpzt4 = gpzq20.i();
                                                    dyiw dyiw0 = ftqb.a(dyiw.a, gpzt4);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    dyix dyix3 = (dyix)hftp3.b_message;
                                                    dyiw0.getClass();
                                                    dyix3.i = dyiw0;
                                                    dyix3.b |= 4;
                                                }
                                                gpzq gpzq21 = gpzt3.c("txnTypeDisplayDesc");
                                                if(gpzq21 != null && !(gpzq21 instanceof gpzs)) {
                                                    ibuq.e(dyiw.a, "getDefaultInstance(...)");
                                                    gpzt gpzt5 = gpzq21.i();
                                                    dyiw dyiw1 = ftqb.a(dyiw.a, gpzt5);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    dyix dyix4 = (dyix)hftp3.b_message;
                                                    dyiw1.getClass();
                                                    dyix4.j = dyiw1;
                                                    dyix4.b |= 8;
                                                }
                                                gpzq gpzq22 = gpzt3.c("tsn");
                                                if(gpzq22 != null && !(gpzq22 instanceof gpzs)) {
                                                    long v8 = ftqd.b(gpzq22);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ((dyix)hftp3.b_message).k = v8;
                                                }
                                                dyix5 = (dyix)hftp3.N_build();
                                            }
                                            catch(Exception exception4) {
                                                if((exception4 instanceof hfur)) {
                                                    throw exception4;
                                                }
                                                throw new hfur(exception4);
                                            }
                                            ibuq.e(dyix5, "convertExceptionCall(...)");
                                            if(!hftp2.b_message.isImmutable()) {
                                                hftp2.ensureMutable();
                                            }
                                            dyiy dyiy3 = (dyiy)hftp2.b_message;
                                            dyix5.getClass();
                                            hfuo hfuo1 = dyiy3.e;
                                            if(!hfuo1.c()) {
                                                dyiy3.e = ProtoLiteMessage.E(hfuo1);
                                            }
                                            dyiy3.e.add(dyix5);
                                        }
                                    }
                                    gpzq gpzq23 = gpzt2.c("accountName");
                                    if(gpzq23 != null && !(gpzq23 instanceof gpzs)) {
                                        String s11 = ftqd.c(gpzq23);
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        dyiy dyiy4 = (dyiy)hftp2.b_message;
                                        s11.getClass();
                                        dyiy4.f = s11;
                                    }
                                    dyiy5 = (dyiy)hftp2.N_build();
                                }
                                catch(Exception exception3) {
                                    if((exception3 instanceof hfur)) {
                                        throw exception3;
                                    }
                                    throw new hfur(exception3);
                                }
                                ibuq.e(dyiy5, "convertExceptionCall(...)");
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                dyev dyev2 = (dyev)hftp0.b_message;
                                dyiy5.getClass();
                                dyev2.c = dyiy5;
                                dyev2.b = 3;
                            }
                            gpzq gpzq24 = gpzt0.c("felicaCardTapInitialEvent");
                            if(gpzq24 != null && !(gpzq24 instanceof gpzs)) {
                                ibuq.e(dygn.a, "getDefaultInstance(...)");
                                gpzq24.i();
                                ibuq.f(dygn.a, "<this>");
                                try {
                                    ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)dygn.a).jf(5, null);
                                    ibuq.e(hftp4, "newBuilderForType(...)");
                                    dygn0 = (dygn)hftp4.N_build();
                                }
                                catch(Exception exception5) {
                                    if((exception5 instanceof hfur)) {
                                        throw exception5;
                                    }
                                    throw new hfur(exception5);
                                }
                                ibuq.e(dygn0, "convertExceptionCall(...)");
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                dyev dyev3 = (dyev)hftp0.b_message;
                                dygn0.getClass();
                                dyev3.c = dygn0;
                                dyev3.b = 4;
                            }
                            dyev4 = (dyev)hftp0.N_build();
                        }
                        catch(Exception exception1) {
                            if((exception1 instanceof hfur)) {
                                throw exception1;
                            }
                            throw new hfur(exception1);
                        }
                        ibuq.e(dyev4, "convertExceptionCall(...)");
                    }
                    catch(Exception exception0) {
                        if((exception0 instanceof hfur)) {
                            throw exception0;
                        }
                        throw new hfur(exception0);
                    }
                }
                catch(hfur hfur0) {
                    a.ae(ebvx.f.i(), "Invalid JSON", hfur0);
                    return new Status(8, "Invalid JSON: " + hfur0.getLocalizedMessage());
                }
                ebvv0 = ebvv1;
                ebvv0.a = context0;
                object4 = ibsm1;
                ebvv0.b = object4;
                ebvv0.g = dyev4;
                ebvv0.c = v3;
                ebvv0.f = 1;
                Object object5 = fsdk.a(evql1, ebvv0);
                object6 = ibrx1;
                if(object5 != object6) {
                    object7 = context0;
                    object8 = object5;
                    v9 = v3;
                    goto label_400;
                }
                return object6;
            }
            case 1: {
                v9 = ebvv0.c;
                dyev4 = ebvv0.g;
                object4 = ebvv0.b;
                object7 = ebvv0.a;
                ibnx.b(object0);
                object8 = ((ibnw)object0).a;
                object6 = ibrx0;
            label_400:
                if((object8 instanceof ibnv)) {
                    object8 = null;
                }
                int v10 = dyeu.a(dyev4.b);
                if(v10 != 0) {
                    switch(v10 - 1) {
                        case 0: {
                        label_408:
                            if(!((Collection)object4).contains(dygj.b)) {
                                return new Status(8, "Caller not authorized to act as Felica");
                            }
                            if(((AccountInfo)object8) == null) {
                                return Status.b;
                            }
                            ebtm ebtm0 = new ebtm(((Context)object7), this.d(), ((AccountInfo)object8), this.h, this.j);
                            ebvv0.a = null;
                            ebvv0.b = null;
                            ebvv0.g = null;
                            ebvv0.f = 2;
                            int v11 = dyev4.b;
                            int v12 = dyeu.a(v11);
                            if(v12 != 0) {
                                switch(v12 - 1) {
                                    case 0: {
                                        dygm dygm6 = v11 == 1 ? ((dygm)dyev4.c) : dygm.a;
                                        ibuq.e(dygm6, "getFelicaCardTapEvent(...)");
                                        object9 = ebtm0.d(dygm6, ebvv0);
                                        return object9 == object6 ? object6 : object9;
                                    }
                                    case 2: {
                                        ibuq.e((v11 == 4 ? ((dygn)dyev4.c) : dygn.a), "getFelicaCardTapInitialEvent(...)");
                                        object9 = ebtm0.l(ebvv0);
                                        return object9 == object6 ? object6 : object9;
                                    }
                                    default: {
                                        object9 = new Status(10, "Unknown Felica tap event");
                                        return object9 == object6 ? object6 : object9;
                                    }
                                }
                            }
                            throw null;
                        }
                        case 1: {
                            ebvw ebvw0 = new ebvw(((Collection)object4), ((AccountInfo)object8), this, v9, dyev4, null);
                            ebvv0.a = null;
                            ebvv0.b = null;
                            ebvv0.g = null;
                            ebvv0.f = 3;
                            Object object10 = icbd.a(cclw.d, ebvw0, ebvv0);
                            return object10 == object6 ? object6 : object10;
                        }
                        default: {
                            switch(v10 - 1) {
                                case 2: {
                                    goto label_408;
                                }
                                case 3: {
                                    return new Status(8, "Empty event");
                                }
                                default: {
                                    throw new ibnq();
                                }
                            }
                        }
                    }
                }
                throw null;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                if(v1 != 3) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                ibnx.b(object0);
                return object0;
            }
        }
    }

    public final etgl d() {
        etgl etgl0 = this.e;
        if(etgl0 != null) {
            return etgl0;
        }
        ibuq.j("firstPartyTapAndPayClient");
        return null;
    }

    public final void e() {
        if(this.d != null) {
            return;
        }
        ibuq.j("clock");
    }

    @Override  // cjtm
    public final gmcd fA(Context context0, ExecutorService executorService0) {
        if(context0 == null) {
            return gmbu.h(new IllegalStateException("No Context"));
        }
        if(hwln.d()) {
            ((ggtj)ebvx.f.j()).R("Received call from package %s with content:\n%s", this.j, this.g.a);
        }
        return icpu.e(iccl.b(cclw.a), new ebvu(this, context0, null));
    }

    @Override  // cjtm
    public final void j(Status status0) {
    }

    @Override  // ebav
    public final ExecutorService r() {
        return new bblp(0x7FFFFFFF, 9);
    }
}

