import com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import j..util.DesugarCollections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bxxi implements ibts {
    public final String a;
    public final List b;
    public final ClearRegistryRequest c;
    public final ibuz d;

    public bxxi(String s, List list0, ClearRegistryRequest clearRegistryRequest0, ibuz ibuz0) {
        this.a = s;
        this.b = list0;
        this.c = clearRegistryRequest0;
        this.d = ibuz0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s = bxvn.a(this.a, this.b);
        if(s == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if(((byfr)object0) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((byfr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((byfr)object0))));
        byft byft0 = byfs.a(hftp0);
        if(byft0.b().containsKey(s)) {
            ibuz ibuz0 = this.d;
            ClearRegistryRequest clearRegistryRequest0 = this.c;
            boolean z = true;
            if(clearRegistryRequest0.a) {
                ibuz0.a = true;
                byft0.b();
                byft0.d(s);
                return byft0.a();
            }
            ClearRegistryRequest.ClearTypedRegistryOption clearRegistryRequest$ClearTypedRegistryOption0 = clearRegistryRequest0.b;
            if(clearRegistryRequest$ClearTypedRegistryOption0 != null) {
                byfo byfo0 = (byfo)DesugarCollections.unmodifiableMap(((byfr)object0).b).get(s);
                if(byfo0 != null) {
                    boolean z1 = clearRegistryRequest$ClearTypedRegistryOption0.a;
                    if(z1) {
                        if(!DesugarCollections.unmodifiableMap(byfo0.d).containsKey(clearRegistryRequest$ClearTypedRegistryOption0.b) && !DesugarCollections.unmodifiableMap(byfo0.e).containsKey(clearRegistryRequest$ClearTypedRegistryOption0.b)) {
                            z = false;
                        }
                        ibuz0.a = z;
                    }
                    else {
                        if(clearRegistryRequest$ClearTypedRegistryOption0.c) {
                            ibuz0.a = ibuz0.a || DesugarCollections.unmodifiableMap(byfo0.d).containsKey(clearRegistryRequest$ClearTypedRegistryOption0.b);
                        }
                        List list0 = clearRegistryRequest$ClearTypedRegistryOption0.d;
                        if(!list0.isEmpty()) {
                            if(!ibuz0.a) {
                                byfl byfl0 = (byfl)DesugarCollections.unmodifiableMap(byfo0.e).get(clearRegistryRequest$ClearTypedRegistryOption0.b);
                                if(byfl0 == null) {
                                    z = false;
                                }
                                else {
                                    Map map0 = DesugarCollections.unmodifiableMap(byfl0.c);
                                    if(map0 == null) {
                                        z = false;
                                    }
                                    else {
                                        Set set0 = map0.keySet();
                                        if(set0 == null || ibpo.av(set0, list0).isEmpty()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                            ibuz0.a = z;
                        }
                    }
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)byfo0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)byfo0));
                    byfx byfx0 = byfw.a(hftp1);
                    if(z1 || clearRegistryRequest$ClearTypedRegistryOption0.c) {
                        byfx0.d();
                        String s1 = clearRegistryRequest$ClearTypedRegistryOption0.b;
                        ibuq.f(s1, "key");
                        ProtoLiteBuilder hftp2 = byfx0.a;
                        s1.getClass();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((byfo)hftp2.b_message).b().remove(s1);
                    }
                    if(z1) {
                        byfx0.b();
                        byfx0.f(clearRegistryRequest$ClearTypedRegistryOption0.b);
                    }
                    else {
                        List list1 = clearRegistryRequest$ClearTypedRegistryOption0.d;
                        if(!list1.isEmpty()) {
                            Map map1 = DesugarCollections.unmodifiableMap(byfo0.e);
                            String s2 = clearRegistryRequest$ClearTypedRegistryOption0.b;
                            byfl byfl1 = (byfl)map1.get(s2);
                            if(byfl1 != null) {
                                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)byfl1).jf(5, null);
                                hftp3.X(((ProtoLiteMessage)byfl1));
                                byfv byfv0 = byfu.a(hftp3);
                                for(Object object1: list1) {
                                    Integer integer0 = (Integer)DesugarCollections.unmodifiableMap(byfl1.c).get(((String)object1));
                                    if(integer0 != null) {
                                        byfv0.b();
                                        byfv0.d(integer0.intValue());
                                    }
                                    byfv0.c();
                                    ibuq.f(((String)object1), "key");
                                    ProtoLiteBuilder hftp4 = byfv0.a;
                                    ((String)object1).getClass();
                                    if(!hftp4.b_message.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    ((byfl)hftp4.b_message).c().remove(((String)object1));
                                }
                                byfl byfl2 = byfv0.a();
                                if(DesugarCollections.unmodifiableMap(byfl2.b).isEmpty()) {
                                    byfx0.b();
                                    byfx0.f(s2);
                                }
                                else {
                                    byfx0.b();
                                    byfx0.e(s2, byfl2);
                                }
                            }
                        }
                    }
                    byfo byfo1 = byfx0.a();
                    if(DesugarCollections.unmodifiableMap(byfo1.d).isEmpty() && DesugarCollections.unmodifiableMap(byfo1.e).isEmpty()) {
                        byft0.b();
                        byft0.d(s);
                        return byft0.a();
                    }
                    byft0.b();
                    byft0.c(s, byfo1);
                }
            }
        }
        return byft0.a();
    }
}

