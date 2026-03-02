import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.Feature;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bdnq {
    private static final bboh a;
    private final ahmb b;
    private final bdmu c;
    private final bbng d;
    private final String e;
    private final Account f;
    private final String g;
    private final aysr h;

    static {
        bdnq.a = bboh.b("PasskeyStorage", bbcu.cX);
    }

    @AssistedInject
    public bdnq(bdzq bdzq0, ahmb ahmb0, bdmu bdmu0, bbng bbng0, @Assisted String s) {
        ibuq.f(s, "accountName");
        super();
        this.b = ahmb0;
        this.c = bdmu0;
        this.d = bbng0;
        this.e = s;
        this.f = new Account(s, "com.google");
        String s1 = beaw.a().toString();
        ibuq.e(s1, "toString(...)");
        this.g = s1;
        ibuq.f(s, "accountName");
        Account account0 = new Account(s, "com.google");
        this.h = ayss.f(bdzq0.a, account0);
    }

    public final Object a(hery hery0, byte[] arr_b, ibrl ibrl0) {
        herx herx0;
        bdnm bdnm0;
        if((ibrl0 instanceof bdnm)) {
            bdnm0 = (bdnm)ibrl0;
            int v = bdnm0.c;
            if((v & 0x80000000) == 0) {
                bdnm0 = new bdnm(this, ibrl0);
            }
            else {
                bdnm0.c = v - 0x80000000;
            }
        }
        else {
            bdnm0 = new bdnm(this, ibrl0);
        }
        Object object0 = bdnm0.a;
        Object object1 = ibrx.a;
        switch(bdnm0.c) {
            case 0: {
                ibnx.b(object0);
                byte[] arr_b1 = (hery0.c == 12 ? ((ByteString)hery0.d) : ByteString.b).toByteArray();
                ibuq.e(arr_b1, "toByteArray(...)");
                bdnm0.d = hery0;
                bdnm0.c = 1;
                object0 = bdmu.b(arr_b1, arr_b, true);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                hery0 = bdnm0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        byte[] arr_b2 = (byte[])object0;
        if(arr_b2 != null) {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)herx.a), arr_b2, 0, arr_b2.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                herx0 = (herx)hftv0;
            }
            catch(hfur unused_ex) {
                ((ggtj)bdnq.a.j()).x("Cannot parse encrypted field");
                return null;
            }
            ibuq.c(herx0);
            byte[] arr_b3 = herx0.c.toByteArray();
            ibuq.e(arr_b3, "toByteArray(...)");
            return bdnq.e(hery0, arr_b3, herx0.d.toByteArray(), herx0.e.toByteArray(), herx0.f.toByteArray(), new Long(herx0.g));
        }
        ((ggtj)bdnq.a.j()).x("Omitting undecryptable passkey");
        return null;
    }

    public final Object b(hery hery0, byte[] arr_b, ibrl ibrl0) {
        bdnn bdnn0;
        if((ibrl0 instanceof bdnn)) {
            bdnn0 = (bdnn)ibrl0;
            int v = bdnn0.c;
            if((v & 0x80000000) == 0) {
                bdnn0 = new bdnn(this, ibrl0);
            }
            else {
                bdnn0.c = v - 0x80000000;
            }
        }
        else {
            bdnn0 = new bdnn(this, ibrl0);
        }
        Object object0 = bdnn0.a;
        Object object1 = ibrx.a;
        switch(bdnn0.c) {
            case 0: {
                ibnx.b(object0);
                byte[] arr_b1 = (hery0.c == 9 ? ((ByteString)hery0.d) : ByteString.b).toByteArray();
                ibuq.e(arr_b1, "toByteArray(...)");
                bdnn0.d = hery0;
                bdnn0.c = 1;
                object0 = bdmu.b(arr_b1, arr_b, false);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                hery0 = bdnn0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((byte[])object0) == null) {
            ((ggtj)bdnq.a.j()).x("Omitting undecryptable passkey");
            return null;
        }
        return bdnq.e(hery0, ((byte[])object0), null, null, null, null);
    }

    // This method was un-flattened
    static Object c(bdnq bdnq0, ibrl ibrl0) {
        int v1;
        bxws bxws0;
        byte[] arr_b;
        Object object3;
        bdnq bdnq2;
        Object object2;
        List list0;
        bdnq bdnq1;
        bdno bdno0;
        if((ibrl0 instanceof bdno)) {
            bdno0 = (bdno)ibrl0;
            int v = bdno0.f;
            if((v & 0x80000000) == 0) {
                bdno0 = new bdno(bdnq0, ibrl0);
            }
            else {
                bdno0.f = v - 0x80000000;
            }
        }
        else {
            bdno0 = new bdno(bdnq0, ibrl0);
        }
        Object object0 = bdno0.d;
        Object object1 = ibrx.a;
    alab1:
        switch(bdno0.f) {
            case 0: {
                ibnx.b(object0);
                try {
                    evql evql0 = bdnq0.h.c(Bundle.EMPTY);
                    bdno0.g = bdnq0;
                    bdno0.f = 1;
                    object0 = ictn.b(evql0, bdno0);
                    if(object0 != object1) {
                        goto label_22;
                    label_20:
                        bdnq0 = bdno0.g;
                        ibnx.b(object0);
                    label_22:
                        gged_interceptors gged0 = (gged_interceptors)object0;
                        goto label_31;
                    }
                    break;
                }
                catch(azuh azuh0) {
                    goto label_25;
                }
                catch(aztb aztb0) {
                    a.ae(bdnq.a.j(), "Error getting passkeys", aztb0);
                    return bdmy.a;
                }
            }
            case 1: {
                goto label_20;
            label_25:
                PendingIntent pendingIntent0 = azuh0.c();
                ibuq.e(pendingIntent0, "getResolution(...)");
                return new bdnb(pendingIntent0);
                try {
                label_31:
                    evql evql1 = bdnq0.b.e(bdnq0.g, bdnq0.f);
                    bdno0.g = bdnq0;
                    bdno0.f = 2;
                    object0 = ictn.b(evql1, bdno0);
                    if(object0 != object1) {
                        bdnq1 = bdnq0;
                        list0 = (List)object0;
                        goto label_41;
                    label_37:
                        bdnq0 = bdno0.g;
                        ibnx.b(object0);
                        bdnq1 = bdnq0;
                        list0 = (List)object0;
                        goto label_41;
                    }
                    break;
                }
                catch(aztb aztb1) {
                    a.ae(bdnq.a.j(), "Error getting passkeys", aztb1);
                    return bdmy.a;
                }
            }
            case 2: {
                goto label_37;
            label_41:
                ((ggtj)bdnq.a.h()).z("Retrieved %s passkeys to export", list0.size());
                if(list0.isEmpty()) {
                    return new bdnc(ibps.a);
                }
                bdno0.g = bdnq1;
                bdno0.a = list0;
                bdno0.f = 3;
                object0 = bdmu.a(bdnq1.c, bdnq1.e, bdno0);
                if(object0 != object1) {
                    goto label_53;
                }
                break;
            }
            case 3: {
                list0 = (List)bdno0.a;
                bdnq1 = bdno0.g;
                ibnx.b(object0);
            label_53:
                if((((bdms)object0) instanceof bdmr)) {
                    ibuq.c(list0);
                    ArrayList arrayList0 = new ArrayList();
                    object2 = list0.iterator();
                    bdnq2 = bdnq1;
                    object3 = arrayList0;
                    arr_b = ((bdmr)(((bdms)object0))).a;
                    goto label_79;
                }
                if((((bdms)object0) instanceof bdmq)) {
                    return new bdnb(((bdmq)(((bdms)object0))).a);
                }
                if((((bdms)object0) instanceof bdmp)) {
                    return bdmz.a;
                }
                throw new ibnq();
            }
            case 4: {
                object2 = bdno0.c;
                object3 = bdno0.b;
                arr_b = (byte[])bdno0.a;
                bdnq2 = bdno0.g;
                goto label_75;
            }
            case 5: {
                object2 = bdno0.c;
                object3 = bdno0.b;
                arr_b = (byte[])bdno0.a;
                bdnq2 = bdno0.g;
                try {
                label_75:
                    ibnx.b(object0);
                    while(true) {
                    label_76:
                        bxws0 = (bxws)object0;
                        break;
                    }
                }
                catch(bdne unused_ex) {
                    throw null;
                }
                while(true) {
                    if(bxws0 != null) {
                        ((Collection)object3).add(bxws0);
                    }
                label_79:
                    if(!((Iterator)object2).hasNext()) {
                        return new bdnc(((List)object3));
                    }
                    Object object4 = ((Iterator)object2).next();
                    hery hery0 = (hery)object4;
                    try {
                        switch(hery0.c) {
                            case 0: {
                                break;
                            }
                            case 9: {
                                v1 = 1;
                                break;
                            }
                            case 12: {
                                v1 = 2;
                                break;
                            }
                            case 19: {
                                v1 = 3;
                                break;
                            }
                            default: {
                                throw null;
                            }
                        }
                        switch(v1 - 1) {
                            case 0: {
                                break;
                            }
                            case 1: {
                                goto label_101;
                            }
                            default: {
                                bxws0 = null;
                                continue;
                            }
                        }
                        ibuq.c(hery0);
                        bdno0.g = bdnq2;
                        bdno0.a = arr_b;
                        bdno0.b = object3;
                        bdno0.c = object2;
                        bdno0.f = 4;
                        object0 = bdnq2.b(hery0, arr_b, bdno0);
                        if(object0 != object1) {
                            goto label_76;
                        label_101:
                            ibuq.c(hery0);
                            bdno0.g = bdnq2;
                            bdno0.a = arr_b;
                            bdno0.b = object3;
                            bdno0.c = object2;
                            bdno0.f = 5;
                            object0 = bdnq2.a(hery0, arr_b, bdno0);
                            if(object0 != object1) {
                                goto label_76;
                            }
                        }
                        break alab1;
                    }
                    catch(bdne unused_ex) {
                        break;
                    }
                }
                throw null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return object1;
        }
        catch(aztb aztb1) {
            a.ae(bdnq.a.j(), "Error getting passkeys", aztb1);
            return bdmy.a;
        }
        return new bdnc(((List)object3));
    }

    static Object d(bdnq bdnq0, List list0, ibrl ibrl0) {
        Object object21;
        Object object20;
        bdnq bdnq7;
        Object object13;
        Object object12;
        Object object11;
        bdnq bdnq5;
        Object object10;
        byte[] arr_b;
        bdnq bdnq4;
        Object object9;
        Object object7;
        List list1;
        bdnq bdnq3;
        Object object2;
        bdnp bdnp0;
        bdnq bdnq1 = bdnq0;
        if((ibrl0 instanceof bdnp)) {
            bdnp0 = (bdnp)ibrl0;
            int v = bdnp0.i;
            if((v & 0x80000000) == 0) {
                bdnp0 = new bdnp(bdnq1, ibrl0);
            }
            else {
                bdnp0.i = v - 0x80000000;
            }
        }
        else {
            bdnp0 = new bdnp(bdnq1, ibrl0);
        }
        Object object0 = bdnp0.g;
        Object object1 = ibrx.a;
        switch(bdnp0.i) {
            case 0: {
                ibnx.b(object0);
                if(list0.isEmpty()) {
                    return new bdnk(ibps.a, ibps.a);
                }
                try {
                    evql evql0 = bdnq1.h.c(Bundle.EMPTY);
                    bdnp0.j = bdnq1;
                    object2 = list0;
                    bdnp0.a = object2;
                    bdnp0.i = 1;
                    object0 = ictn.b(evql0, bdnp0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_30;
                label_25:
                    Object object3 = bdnp0.a;
                    bdnq bdnq2 = bdnp0.j;
                    ibnx.b(object0);
                    object2 = object3;
                    bdnq1 = bdnq2;
                label_30:
                    gged_interceptors gged0 = (gged_interceptors)object0;
                    goto label_39;
                }
                catch(azuh azuh0) {
                    goto label_33;
                }
                catch(aztb aztb0) {
                    a.ae(bdnq.a.j(), "Error getting passkeys", aztb0);
                    return bdnh.a;
                }
            }
            case 1: {
                goto label_25;
            label_33:
                PendingIntent pendingIntent0 = azuh0.c();
                ibuq.e(pendingIntent0, "getResolution(...)");
                return new bdnj(pendingIntent0);
                try {
                label_39:
                    evql evql1 = bdnq1.b.e(bdnq1.g, bdnq1.f);
                    bdnp0.j = bdnq1;
                    bdnp0.a = object2;
                    bdnp0.i = 2;
                    object0 = ictn.b(evql1, bdnp0);
                    if(object0 == object1) {
                        return object1;
                    }
                    bdnq3 = bdnq1;
                    Object object4 = object2;
                    list1 = (List)object0;
                    goto label_52;
                label_48:
                    object4 = bdnp0.a;
                    bdnq3 = bdnp0.j;
                    ibnx.b(object0);
                    list1 = (List)object0;
                    goto label_52;
                }
                catch(aztb aztb1) {
                    a.ae(bdnq.a.j(), "Error getting passkeys", aztb1);
                    return bdnh.a;
                }
            }
            case 2: {
                goto label_48;
            label_52:
                ibuq.c(list1);
                ArrayList arrayList0 = new ArrayList(ibpo.q(list1, 10));
                for(Object object5: list1) {
                    ibuq.c(((hery)object5));
                    ibuq.f(((hery)object5), "<this>");
                    String s = ((hery)object5).g;
                    ibuq.e(s, "getRpId(...)");
                    ByteString hfsf0 = ((hery)object5).h;
                    ibuq.e(hfsf0, "getUserId(...)");
                    arrayList0.add(new bdmw(s, hfsf0));
                }
                Set set0 = ibpo.ay(arrayList0);
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for(Object object6: ((Iterable)object4)) {
                    ibuq.f(((bxws)object6), "<this>");
                    ByteString hfsf1 = bdmx.a(((bxws)object6).d);
                    if(set0.contains(new bdmw(((bxws)object6).c, hfsf1))) {
                        arrayList1.add(object6);
                    }
                    else {
                        arrayList2.add(object6);
                    }
                }
                ibns ibns0 = new ibns(arrayList1, arrayList2);
                List list2 = (List)ibns0.a;
                object7 = (List)ibns0.b;
                if(!list2.isEmpty()) {
                    ((ggtj)bdnq.a.h()).z("%d conflicting passkeys", list2.size());
                }
                if(((List)object7).isEmpty()) {
                    return new bdnk(ibps.a, list2);
                }
                bdnp0.j = bdnq3;
                bdnp0.a = list2;
                bdnp0.b = object7;
                bdnp0.i = 3;
                Object object8 = bdmu.a(bdnq3.c, bdnq3.e, bdnp0);
                if(object8 == object1) {
                    return object1;
                }
                object9 = list2;
                object0 = object8;
                bdnq4 = bdnq3;
                goto label_99;
            }
            case 3: {
                object7 = bdnp0.b;
                object9 = bdnp0.a;
                bdnq4 = bdnp0.j;
                ibnx.b(object0);
            label_99:
                if((((bdms)object0) instanceof bdmr)) {
                    arr_b = ((bdmr)(((bdms)object0))).a;
                    ArrayList arrayList3 = new ArrayList(ibpo.q(((Iterable)object7), 10));
                    object10 = object7;
                    bdnq5 = bdnq4;
                    object11 = ((Iterable)object7).iterator();
                    object12 = object9;
                    object13 = arrayList3;
                    goto label_182;
                }
                if((((bdms)object0) instanceof bdmq)) {
                    return new bdnj(((bdmq)(((bdms)object0))).a);
                }
                if((((bdms)object0) instanceof bdmp)) {
                    return bdng.a;
                }
                throw new ibnq();
            }
            case 4: {
                Object object14 = bdnp0.f;
                bxws bxws0 = bdnp0.k;
                object11 = bdnp0.e;
                Object object15 = bdnp0.d;
                byte[] arr_b1 = (byte[])bdnp0.c;
                Object object16 = bdnp0.b;
                Object object17 = bdnp0.a;
                bdnq bdnq6 = bdnp0.j;
                ibnx.b(object0);
                bxws bxws1 = bxws0;
                object13 = object14;
                bdnq5 = bdnq6;
                while(true) {
                    if(((byte[])object0) == null) {
                        return bdnf.a;
                    }
                    hesa hesa0 = herz.a(((ProtoLiteMessage)hery.a).v_newBuilder());
                    ByteString hfsf2 = bdmx.a(bxws1.a);
                    ProtoLiteBuilder hftp0 = hesa0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery0 = (hery)hftp0.b_message;
                    hery0.b |= 1;
                    hery0.e = hfsf2;
                    ByteString hfsf3 = bdmx.a(bxws1.b);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery1 = (hery)hftp0.b_message;
                    hery1.b |= 2;
                    hery1.f = hfsf3;
                    String s1 = bxws1.c;
                    ibuq.f(s1, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery2 = (hery)hftp0.b_message;
                    s1.getClass();
                    hery2.b |= 4;
                    hery2.g = s1;
                    ByteString hfsf4 = bdmx.a(bxws1.d);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery3 = (hery)hftp0.b_message;
                    hery3.b |= 8;
                    hery3.h = hfsf4;
                    hesa0.c(bxws1.e);
                    hesa0.b(bxws1.f);
                    long v1 = System.currentTimeMillis();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hery hery4 = (hery)hftp0.b_message;
                    hery4.b |= 16;
                    hery4.j = v1;
                    ByteString hfsf5 = bdmx.a(((byte[])object0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hery)hftp0.b_message).c = 12;
                    ((hery)hftp0.b_message).d = hfsf5;
                    Boolean boolean0 = bxws1.m;
                    if(boolean0 != null) {
                        boolean z = boolean0.booleanValue();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hery hery5 = (hery)hftp0.b_message;
                        hery5.b |= 0x80;
                        hery5.m = z;
                    }
                    ((Collection)object13).add(hesa0.a());
                    object13 = object15;
                    arr_b = arr_b1;
                    bdnq5 = bdnq5;
                    object10 = object16;
                    object12 = object17;
                label_182:
                    if(!((Iterator)object11).hasNext()) {
                        bdnq7 = bdnq5;
                        object20 = ((Iterable)object13).iterator();
                        object21 = object13;
                        goto label_260;
                    }
                    Object object18 = ((Iterator)object11).next();
                    bxws1 = (bxws)object18;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)herx.a).v_newBuilder();
                    ibuq.f(hftp1, "builder");
                    ByteString hfsf6 = bdmx.a(bxws1.h);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    herx herx0 = (herx)hftp1.b_message;
                    herx0.b |= 1;
                    herx0.c = hfsf6;
                    byte[] arr_b2 = bxws1.i;
                    if(arr_b2 != null) {
                        ByteString hfsf7 = bdmx.a(arr_b2);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        herx herx1 = (herx)hftp1.b_message;
                        herx1.b |= 2;
                        herx1.d = hfsf7;
                    }
                    byte[] arr_b3 = bxws1.j;
                    if(arr_b3 != null) {
                        ByteString hfsf8 = bdmx.a(arr_b3);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        herx herx2 = (herx)hftp1.b_message;
                        herx2.b |= 4;
                        herx2.e = hfsf8;
                    }
                    byte[] arr_b4 = bxws1.k;
                    if(arr_b4 != null) {
                        ByteString hfsf9 = bdmx.a(arr_b4);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        herx herx3 = (herx)hftp1.b_message;
                        herx3.b |= 8;
                        herx3.f = hfsf9;
                    }
                    Long long0 = bxws1.l;
                    if(long0 != null) {
                        long v2 = long0.longValue();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        herx herx4 = (herx)hftp1.b_message;
                        herx4.b |= 16;
                        herx4.g = v2;
                    }
                    ProtoLiteMessage hftv0 = hftp1.N_build();
                    ibuq.e(hftv0, "build(...)");
                    byte[] arr_b5 = ((herx)hftv0).toBytesArray();
                    bdnp0.j = bdnq5;
                    bdnp0.a = object12;
                    bdnp0.b = object10;
                    bdnp0.c = arr_b;
                    bdnp0.d = object13;
                    bdnp0.e = object11;
                    bdnp0.k = bxws1;
                    bdnp0.f = object13;
                    bdnp0.i = 4;
                    Object object19 = bdmu.c(bdnq5.c, arr_b5, arr_b);
                    if(object19 == object1) {
                        break;
                    }
                    object16 = object10;
                    object17 = object12;
                    arr_b1 = arr_b;
                    object15 = object13;
                    object0 = object19;
                }
                try {
                    return object1;
                }
                catch(aztb aztb1) {
                    a.ae(bdnq.a.j(), "Error getting passkeys", aztb1);
                    return bdnh.a;
                }
                try {
                    bdnq7 = bdnq5;
                    object20 = ((Iterable)object13).iterator();
                    object21 = object13;
                    goto label_260;
                }
                catch(aztb aztb2) {
                    break;
                }
            }
            case 5: {
                object20 = bdnp0.e;
                object13 = bdnp0.d;
                object21 = (List)bdnp0.c;
                object10 = bdnp0.b;
                object12 = bdnp0.a;
                bdnq7 = bdnp0.j;
                try {
                    ibnx.b(object0);
                    while(true) {
                    label_260:
                        if(!((Iterator)object20).hasNext()) {
                            goto label_285;
                        }
                        Object object22 = ((Iterator)object20).next();
                        gftb.z(bdnq7.g, "Null sessionId passed in");
                        gftb.z(((hery)object22), "Must provide a credential to store.");
                        azzc azzc0 = new azzc();
                        azzc0.a = new ahol(((ahow)bdnq7.b), bdnq7.g, bdnq7.f, ((hery)object22));
                        azzc0.d = 0x6BA;
                        azzc0.c = new Feature[]{amju.l};
                        azzd azzd0 = azzc0.a();
                        evql evql2 = ((azts)bdnq7.b).iG(azzd0);
                        bdnp0.j = bdnq7;
                        bdnp0.a = object12;
                        bdnp0.b = object10;
                        bdnp0.c = object21;
                        bdnp0.d = object13;
                        bdnp0.e = object20;
                        bdnp0.k = null;
                        bdnp0.f = null;
                        bdnp0.i = 5;
                        if(ictn.b(evql2, bdnp0) != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(aztb aztb2) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(bdnq.a.j(), "API error saving passkeys", aztb2);
        return bdnh.a;
    label_285:
        ((ggtj)bdnq.a.h()).F("Saved %d passkeys, %d conflicts", ((List)object21).size(), ((List)object12).size());
        return new bdnk(((List)object10), ((List)object12));
    }

    private static final bxws e(hery hery0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, Long long0) {
        byte[] arr_b4 = hery0.e.toByteArray();
        ibuq.e(arr_b4, "toByteArray(...)");
        byte[] arr_b5 = hery0.f.toByteArray();
        ibuq.e(arr_b5, "toByteArray(...)");
        String s = hery0.g;
        ibuq.e(s, "getRpId(...)");
        byte[] arr_b6 = hery0.h.toByteArray();
        ibuq.e(arr_b6, "toByteArray(...)");
        String s1 = hery0.k;
        ibuq.e(s1, "getUserName(...)");
        String s2 = hery0.l;
        ibuq.e(s2, "getUserDisplayName(...)");
        return (hery0.b & 16) == 0 ? new bxws(arr_b4, arr_b5, s, arr_b6, s1, s2, null, arr_b, arr_b1, arr_b2, arr_b3, long0, Boolean.valueOf(hery0.m)) : new bxws(arr_b4, arr_b5, s, arr_b6, s1, s2, ibzw.j(ibzy.i(hery0.j, ibzz.c)), arr_b, arr_b1, arr_b2, arr_b3, long0, Boolean.valueOf(hery0.m));
    }
}

