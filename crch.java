import j..util.Objects;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class crch {
    public BitSet a;
    private boolean b;
    private crsx c;
    private BitSet d;
    private Map e;
    private Map f;

    public crch(crcm crcm0) {
        Objects.requireNonNull(crcm0);
        super();
        this.b = true;
        this.a = new BitSet();
        this.d = new BitSet();
        this.e = new bxd();
        this.f = new bxd();
    }

    public crch(crcm crcm0, crsx crsx0, BitSet bitSet0, BitSet bitSet1, Map map0, Map map1) {
        Objects.requireNonNull(crcm0);
        super();
        this.a = bitSet0;
        this.d = bitSet1;
        this.e = map0;
        this.f = new bxd();
        for(Object object0: map1.keySet()) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(((Long)map1.get(((Integer)object0))));
            this.f.put(((Integer)object0), arrayList0);
        }
        this.b = false;
        this.c = crsx0;
    }

    final crsf a(int v) {
        List list0;
        Iterable iterable0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crsf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((crsf)hftv0).b |= 1;
        ((crsf)hftv0).c = v;
        boolean z = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((crsf)hftv1).b |= 8;
        ((crsf)hftv1).f = z;
        crsx crsx0 = this.c;
        if(crsx0 != null) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((crsf)hftp0.b_message).e = crsx0;
            ((crsf)hftp0.b_message).b |= 4;
        }
        crsw crsw0 = (crsw)((ProtoLiteMessage)crsx.a).v_newBuilder();
        crsw0.k(crqt.r(this.a));
        crsw0.m(crqt.r(this.d));
        Map map0 = this.e;
        if(map0 == null) {
            iterable0 = null;
        }
        else {
            ArrayList arrayList0 = new ArrayList(((bzs)map0).d_num);
            for(Object object0: this.e.keySet()) {
                int v1 = (int)(((Integer)object0));
                Long long0 = (Long)this.e.get(((Integer)object0));
                if(long0 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crsm.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    crsm crsm0 = (crsm)hftp1.b_message;
                    crsm0.b |= 1;
                    crsm0.c = v1;
                    long v2 = (long)long0;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    crsm crsm1 = (crsm)hftp1.b_message;
                    crsm1.b |= 2;
                    crsm1.d = v2;
                    arrayList0.add(((crsm)hftp1.N_build()));
                }
            }
            iterable0 = arrayList0;
        }
        if(iterable0 != null) {
            crsw0.a(iterable0);
        }
        Map map1 = this.f;
        if(map1 == null) {
            list0 = Collections.EMPTY_LIST;
        }
        else {
            ArrayList arrayList1 = new ArrayList(((bzs)map1).d_num);
            for(Object object1: this.f.keySet()) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)crsy.a).v_newBuilder();
                int v3 = (int)(((Integer)object1));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                crsy crsy0 = (crsy)hftp2.b_message;
                crsy0.b |= 1;
                crsy0.c = v3;
                List list1 = (List)this.f.get(((Integer)object1));
                if(list1 != null) {
                    Collections.sort(list1);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    crsy crsy1 = (crsy)hftp2.b_message;
                    hfui hfui0 = crsy1.d;
                    if(!hfui0.c()) {
                        crsy1.d = ProtoLiteMessage.D(hfui0);
                    }
                    hfrj.E(list1, crsy1.d);
                }
                arrayList1.add(((crsy)hftp2.N_build()));
            }
            list0 = arrayList1;
        }
        crsw0.l(list0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crsf crsf0 = (crsf)hftp0.b_message;
        crsx crsx1 = (crsx)((ProtoLiteBuilder)crsw0).N_build();
        crsx1.getClass();
        crsf0.d = crsx1;
        crsf0.b |= 2;
        return (crsf)hftp0.N_build();
    }

    final void b(crck crck0) {
        int v = crck0.a();
        if(crck0.d != null) {
            this.d.set(v, true);
        }
        Boolean boolean0 = crck0.e;
        if(boolean0 != null) {
            this.a.set(v, boolean0.booleanValue());
        }
        if(crck0.f != null) {
            Integer integer0 = v;
            Long long0 = (Long)this.e.get(integer0);
            long v1 = ((long)crck0.f) / 1000L;
            if(long0 == null || v1 > ((long)long0)) {
                this.e.put(integer0, Long.valueOf(v1));
            }
        }
        if(crck0.g != null) {
            Integer integer1 = v;
            List list0 = (List)this.f.get(integer1);
            if(list0 == null) {
                list0 = new ArrayList();
                this.f.put(integer1, list0);
            }
            if(crck0.b()) {
                list0.clear();
            }
            list0.add(Long.valueOf(((long)crck0.g) / 1000L));
        }
    }
}

