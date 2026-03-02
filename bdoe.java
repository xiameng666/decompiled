import android.app.PendingIntent;
import android.net.Uri;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bdoe {
    private static final bboh a;
    private final bgog b;
    private final bdcd c;

    static {
        bdoe.a = bboh.b("PasswordStorage", bbcu.cX);
    }

    @AssistedInject
    public bdoe(bdbt bdbt0, @Assisted String s, bgog bgog0) {
        ibuq.f(s, "accountName");
        super();
        this.b = bgog0;
        this.c = bdbt0.a(s);
    }

    static Object a(bdoe bdoe0, ibrl ibrl0) {
        gged_interceptors gged0;
        bdoc bdoc0;
        if((ibrl0 instanceof bdoc)) {
            bdoc0 = (bdoc)ibrl0;
            int v = bdoc0.c;
            if((v & 0x80000000) == 0) {
                bdoc0 = new bdoc(bdoe0, ibrl0);
            }
            else {
                bdoc0.c = v - 0x80000000;
            }
        }
        else {
            bdoc0 = new bdoc(bdoe0, ibrl0);
        }
        Object object0 = bdoc0.a;
        Object object1 = ibrx.a;
        switch(bdoc0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    evql evql0 = bdoe0.c.c();
                    bdoc0.c = 1;
                    object0 = ictn.b(evql0, bdoc0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                    gged0 = (gged_interceptors)object0;
                    goto label_29;
                }
                catch(azuh azuh0) {
                    break;
                }
                catch(aztb aztb0) {
                    a.ae(bdoe.a.j(), "Error retrieving passwords", aztb0);
                    return bdnu.a;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        PendingIntent pendingIntent0 = azuh0.c();
        ibuq.e(pendingIntent0, "getResolution(...)");
        return new bdnw(pendingIntent0);
    label_29:
        ibuq.c(gged0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: gged0) {
            if(!((heqb)object2).l) {
                arrayList0.add(object2);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object3: arrayList0) {
            String s = ((heqb)object3).q;
            ibuq.e(s, "getFederationUrl(...)");
            if(s.length() == 0) {
                arrayList1.add(object3);
            }
        }
        ((ggtj)bdoe.a.h()).F("Retrieved %s passwords, exporting %s", gged0.size(), arrayList1.size());
        ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList1, 10));
        for(Object object4: arrayList1) {
            heqb heqb0 = (heqb)object4;
            ibuq.c(heqb0);
            ibuq.f(heqb0, "<this>");
            String[] arr_s = {heqb0.e, heqb0.f, heqb0.g, heqb0.h, heqb0.d};
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-1");
            ibuq.e(messageDigest0, "getInstance(...)");
            messageDigest0.update(((MessageLite)bdkc.b).toBytesArray());
            for(int v1 = 0; v1 < 5; ++v1) {
                if(v1 > 0) {
                    messageDigest0.update(bdkc.a);
                }
                String s1 = Uri.encode(arr_s[v1], "!$&\'()*+,-./;=@_~ ");
                ibuq.e(s1, "encode(...)");
                byte[] arr_b = ibzk.Q(s1, " ", "%20").getBytes(ibyo.a);
                ibuq.e(arr_b, "getBytes(...)");
                messageDigest0.update(arr_b);
            }
            byte[] arr_b1 = messageDigest0.digest();
            ibuq.e(arr_b1, "digest(...)");
            String s2 = heqb0.d;
            ibuq.e(s2, "getSignonRealm(...)");
            String s3 = heqb0.e;
            ibuq.e(s3, "getOrigin(...)");
            String s4 = (heqb0.b & 0x20) == 0 ? null : heqb0.g;
            String s5 = heqb0.i;
            ibuq.e(s5, "getPasswordValue(...)");
            Long long0 = (heqb0.b & 0x400) == 0 ? null : new Long(bdnt.a(heqb0.k));
            Long long1 = (heqb0.b & 0x80000) == 0 ? null : new Long(bdnt.a(heqb0.t));
            hfuo hfuo0 = (heqb0.u == null ? heqa.a : heqb0.u).b;
            ibuq.e(hfuo0, "getNoteList(...)");
            ArrayList arrayList3 = new ArrayList(ibpo.q(hfuo0, 10));
            for(Object object5: hfuo0) {
                String s6 = ((hepz)object5).d;
                ibuq.e(s6, "getValue(...)");
                arrayList3.add(s6);
            }
            arrayList2.add(new bxwt(arr_b1, s2, s3, s4, s5, long0, long1, arrayList3));
        }
        return new bdnv(arrayList2);
    }

    static Object b(bdoe bdoe0, List list0, ibrl ibrl0) {
        Object object7;
        List list5;
        List list4;
        gged_interceptors gged0;
        Map map0;
        bdod bdod0;
        bdoe bdoe1 = bdoe0;
        if((ibrl0 instanceof bdod)) {
            bdod0 = (bdod)ibrl0;
            int v = bdod0.f;
            if((v & 0x80000000) == 0) {
                bdod0 = new bdod(bdoe1, ibrl0);
            }
            else {
                bdod0.f = v - 0x80000000;
            }
        }
        else {
            bdod0 = new bdod(bdoe1, ibrl0);
        }
        Object object0 = bdod0.d;
        Object object1 = ibrx.a;
        switch(bdod0.f) {
            case 0: {
                ibnx.b(object0);
                map0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
                for(Object object2: list0) {
                    bxwt bxwt0 = (bxwt)object2;
                    long v1 = bgnf.b(System.currentTimeMillis());
                    heqd heqd0 = heqc.a(((ProtoLiteMessage)heqb.a).v_newBuilder());
                    heqd0.g(0);
                    heqd0.i(6);
                    heqd0.e(bxwt0.c);
                    heqd0.h(bxwt0.b);
                    String s = bxwt0.d;
                    if(s != null) {
                        heqd0.j(s);
                    }
                    heqd0.f(bxwt0.e);
                    heqd0.b(v1);
                    heqd0.c(v1);
                    heqf heqf0 = heqe.a(((hepy)((ProtoLiteMessage)heqa.a).v_newBuilder()));
                    heqf0.c();
                    ArrayList arrayList0 = new ArrayList(ibpo.q(bxwt0.h, 10));
                    for(Object object3: bxwt0.h) {
                        heqh heqh0 = heqg.a(((ProtoLiteMessage)hepz.a).v_newBuilder());
                        heqh0.c(((String)object3));
                        Long long0 = bxwt0.f;
                        if(long0 != null) {
                            long0.longValue();
                            heqh0.b(bgnf.b(System.currentTimeMillis()));
                        }
                        arrayList0.add(heqh0.a());
                    }
                    hepy hepy0 = heqf0.a;
                    if(!hepy0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hepy0).ensureMutable();
                    }
                    heqa heqa0 = (heqa)hepy0.b_message;
                    heqa0.b();
                    hfrj.E(arrayList0, heqa0.b);
                    heqd0.d(heqf0.a());
                    map0.put(heqd0.a(), object2);
                }
                try {
                    evql evql0 = bdoe1.c.c();
                    bdod0.a = bdoe1;
                    bdod0.b = map0;
                    bdod0.f = 1;
                    object0 = ictn.b(evql0, bdod0);
                    if(object0 != object1) {
                        goto label_67;
                    }
                    return object1;
                }
                catch(azuh azuh0) {
                    goto label_70;
                }
                catch(aztb aztb0) {
                    a.ae(bdoe.a.j(), "API error getting existing passwords", aztb0);
                    return bdny.a;
                }
                goto label_67;
            }
            case 1: {
                Map map1 = (Map)bdod0.b;
                bdoe bdoe2 = (bdoe)bdod0.a;
                try {
                    ibnx.b(object0);
                    map0 = map1;
                    bdoe1 = bdoe2;
                label_67:
                    gged0 = (gged_interceptors)object0;
                }
                catch(azuh azuh0) {
                label_70:
                    PendingIntent pendingIntent0 = azuh0.c();
                    ibuq.e(pendingIntent0, "getResolution(...)");
                    return new bdoa(pendingIntent0);
                }
                catch(aztb aztb0) {
                    a.ae(bdoe.a.j(), "API error getting existing passwords", aztb0);
                    return bdny.a;
                }
                List list1 = ibpo.ar(map0.keySet());
                ibuq.c(gged0);
                bgod bgod0 = bgog.a(list1, gged0);
                List list2 = bgod0.a;
                Map map2 = bgod0.b;
                List list3 = new ArrayList(ibpo.q(list2, 10));
                for(Object object4: list2) {
                    list3.add(((bxwt)ibpz.g(map0, ((heqb)object4))));
                }
                Set set0 = map2.keySet();
                Object object5 = new ArrayList(ibpo.q(set0, 10));
                for(Object object6: set0) {
                    ((Collection)object5).add(((bxwt)ibpz.g(map0, ((heqb)object6))));
                }
                if(!list2.isEmpty()) {
                    try {
                        gged_interceptors gged1 = ggdx.a(list2);
                        evql evql1 = bdoe1.c.f(gged1);
                        bdod0.a = list2;
                        bdod0.b = list3;
                        bdod0.c = object5;
                        bdod0.f = 2;
                        object0 = ictn.b(evql1, bdod0);
                        if(object0 == object1) {
                            return object1;
                        }
                        list4 = list2;
                        list5 = list3;
                        object7 = object5;
                        goto label_113;
                    }
                    catch(azuh azuh1) {
                        break;
                    }
                    catch(aztb aztb1) {
                        a.ae(bdoe.a.j(), "API error saving passwords", aztb1);
                        return bdny.a;
                    }
                }
                return new bdnz(list3, ((List)object5));
            }
            case 2: {
                object7 = bdod0.c;
                list5 = (List)bdod0.b;
                list4 = (List)bdod0.a;
                try {
                    ibnx.b(object0);
                label_113:
                    Void void0 = (Void)object0;
                    goto label_122;
                }
                catch(azuh azuh1) {
                    break;
                }
                catch(aztb aztb1) {
                    a.ae(bdoe.a.j(), "API error saving passwords", aztb1);
                    return bdny.a;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        PendingIntent pendingIntent1 = azuh1.c();
        ibuq.e(pendingIntent1, "getResolution(...)");
        return new bdoa(pendingIntent1);
    label_122:
        ((ggtj)bdoe.a.h()).F("Saved %d passwords, %d conflicts", list4.size(), ((List)object7).size());
        return new bdnz(list5, ((List)object7));
    }
}

