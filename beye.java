import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class beye {
    private static final bboh a;
    private final bdbm b;
    private final beih c;

    static {
        beye.a = bboh.b("PWMImportRepository", bbcu.cX);
    }

    public beye(bdbm bdbm0, beih beih0) {
        ibuq.f(beih0, "passwordDataRepository");
        super();
        this.b = bdbm0;
        this.c = beih0;
    }

    public final Object a(ibrl ibrl0) {
        beyb beyb0;
        if((ibrl0 instanceof beyb)) {
            beyb0 = (beyb)ibrl0;
            int v = beyb0.c;
            if((v & 0x80000000) == 0) {
                beyb0 = new beyb(this, ibrl0);
            }
            else {
                beyb0.c = v - 0x80000000;
            }
        }
        else {
            beyb0 = new beyb(this, ibrl0);
        }
        Object object0 = beyb0.a;
        Object object1 = ibrx.a;
        switch(beyb0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.b.c();
                beyb0.c = 1;
                object0 = ictn.b(evql0, beyb0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return object0;
    }

    public final Object b(bewh bewh0, ibrl ibrl0) {
        beyc beyc0;
        if((ibrl0 instanceof beyc)) {
            beyc0 = (beyc)ibrl0;
            int v = beyc0.c;
            if((v & 0x80000000) == 0) {
                beyc0 = new beyc(this, ibrl0);
            }
            else {
                beyc0.c = v - 0x80000000;
            }
        }
        else {
            beyc0 = new beyc(this, ibrl0);
        }
        Object object0 = beyc0.a;
        Object object1 = ibrx.a;
        switch(beyc0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bdbm bdbm0 = this.b;
                    long v1 = bgnf.a();
                    heqd heqd0 = heqc.a(((ProtoLiteMessage)heqb.a).v_newBuilder());
                    heqd0.f(bewh0.c);
                    heqd0.h(bedx.a(bewh0.a).toString());
                    heqd0.e(bewh0.a.toString());
                    String s = bewh0.b;
                    if(s != null) {
                        heqd0.j(s);
                    }
                    String s1 = bewh0.d;
                    if(s1 != null) {
                        hepy hepy0 = (hepy)((ProtoLiteMessage)heqa.a).v_newBuilder();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hepz.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hepz hepz0 = (hepz)hftp0.b_message;
                        hepz0.b |= 2;
                        hepz0.d = s1;
                        long v2 = bgnf.a();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hepz hepz1 = (hepz)hftp0.b_message;
                        hepz1.b |= 4;
                        hepz1.e = v2;
                        hepy0.a(((hepz)hftp0.N_build()));
                        heqa heqa0 = (heqa)((ProtoLiteBuilder)hepy0).N_build();
                        ibuq.e(heqa0, "createDefaultNotes(...)");
                        heqd0.d(heqa0);
                    }
                    heqd0.b(v1);
                    heqd0.c(v1);
                    evql evql0 = bdbm0.e(((MessageLite)heqd0.a()));
                    beyc0.c = 1;
                    return ictn.b(evql0, beyc0) != object1 ? Boolean.valueOf(true) : object1;
                label_49:
                    ibnx.b(object0);
                    return Boolean.valueOf(true);
                }
                catch(Exception exception0) {
                    goto label_52;
                }
            }
            case 1: {
                goto label_49;
            label_52:
                if((exception0 instanceof aztb)) {
                    return Boolean.valueOf(false);
                }
                throw exception0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(List list0, ibrl ibrl0) {
        Object object5;
        Object object4;
        aztb aztb1;
        Object object2;
        ArrayList arrayList1;
        ArrayList arrayList0;
        beyd beyd0;
        if((ibrl0 instanceof beyd)) {
            beyd0 = (beyd)ibrl0;
            int v = beyd0.g;
            if((v & 0x80000000) == 0) {
                beyd0 = new beyd(this, ibrl0);
            }
            else {
                beyd0.g = v - 0x80000000;
            }
        }
        else {
            beyd0 = new beyd(this, ibrl0);
        }
        Object object0 = beyd0.e;
        Object object1 = ibrx.a;
        switch(beyd0.g) {
            case 0: {
                ibnx.b(object0);
                arrayList0 = new ArrayList();
                arrayList1 = new ArrayList();
                object2 = list0.iterator();
                goto label_27;
            }
            case 1: {
                Object object3 = beyd0.d;
                object2 = beyd0.c;
                arrayList1 = (ArrayList)beyd0.b;
                arrayList0 = (ArrayList)beyd0.a;
                ibnx.b(object0);
                while(true) {
                    if(((Boolean)object0).booleanValue()) {
                        arrayList0.add(object3);
                    }
                    else {
                        arrayList1.add(object3);
                    }
                label_27:
                    if(!((Iterator)object2).hasNext()) {
                        break;
                    }
                    object3 = ((Iterator)object2).next();
                    beyd0.a = arrayList0;
                    beyd0.b = arrayList1;
                    beyd0.c = object2;
                    beyd0.d = object3;
                    beyd0.g = 1;
                    object0 = this.b(((bewh)object3), beyd0);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                ibns ibns0 = new ibns(arrayList0, arrayList1);
                List list1 = (List)ibns0.a;
                List list2 = (List)ibns0.b;
                try {
                    evql evql0 = this.c.f();
                    beyd0.a = list1;
                    beyd0.b = list2;
                    beyd0.c = null;
                    beyd0.d = null;
                    beyd0.g = 2;
                    return ictn.b(evql0, beyd0) != object1 ? new beya(list1, list2) : object1;
                }
                catch(aztb aztb0) {
                    aztb1 = aztb0;
                    object4 = list2;
                    object5 = list1;
                    a.ae(beye.a.j(), "Requesting data after import failed.", aztb1);
                    return new beya(((List)object5), ((List)object4));
                }
                return new beya(list1, list2);
            }
            case 2: {
                try {
                    object4 = beyd0.b;
                    object5 = beyd0.a;
                    ibnx.b(object0);
                    return new beya(((List)object5), ((List)object4));
                }
                catch(aztb aztb1) {
                }
                a.ae(beye.a.j(), "Requesting data after import failed.", aztb1);
                return new beya(((List)object5), ((List)object4));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

