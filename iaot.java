import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iaot {
    private final boolean a;
    private final int b;
    private final int c;
    private final iauh d;

    public iaot() {
        throw null;
    }

    public iaot(boolean z, iauh iauh0) {
        this.a = z;
        this.b = 5;
        this.c = 5;
        gftb.z(iauh0, "autoLoadBalancerFactory");
        this.d = iauh0;
    }

    public final iaoo a(Map map0) {
        ibbq ibbq0;
        ibet ibet0;
        Object object3;
        iaoo iaoo1;
        iaoo iaoo0;
        List list1;
        iauh iauh0;
        ibbo ibbo0 = null;
        try {
            iauh0 = this.d;
            if(map0 == null) {
                goto label_27;
            }
            else {
                goto label_3;
            }
            goto label_28;
        }
        catch(RuntimeException runtimeException0) {
            return new iaoo(iapk.d.f("failed to parse service config").e(runtimeException0));
        }
        try {
        label_3:
            ArrayList arrayList0 = new ArrayList();
            if(map0.containsKey("loadBalancingConfig")) {
                arrayList0.addAll(iazm.g(map0, "loadBalancingConfig"));
            }
            if(arrayList0.isEmpty()) {
                String s = iazm.e(map0, "loadBalancingPolicy");
                if(s != null) {
                    arrayList0.add(Collections.singletonMap(s.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
                }
            }
            List list0 = DesugarCollections.unmodifiableList(arrayList0);
            if(list0 == null) {
                list1 = null;
                goto label_28;
            label_27:
                list1 = null;
            }
            else {
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: list0) {
                    Map map1 = (Map)object0;
                    if(map1.size() != 1) {
                        throw new RuntimeException("There are " + map1.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map1);
                    }
                    Object object1 = map1.entrySet().iterator().next();
                    String s1 = (String)((Map.Entry)object1).getKey();
                    arrayList1.add(new ibff(s1, iazm.i(map1, s1)));
                }
                list1 = DesugarCollections.unmodifiableList(arrayList1);
            }
        label_28:
            if(list1 != null && !list1.isEmpty()) {
                iani iani0 = iauh0.a;
                ArrayList arrayList2 = new ArrayList();
                for(Object object2: list1) {
                    ibff ibff0 = (ibff)object2;
                    String s2 = ibff0.a;
                    iang iang0 = iani0.a(s2);
                    if(iang0 == null) {
                        arrayList2.add(s2);
                        continue;
                    }
                    if(!arrayList2.isEmpty()) {
                        Level level0 = Level.FINEST;
                        Logger.getLogger(ibfh.class.getName()).logp(level0, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList2);
                    }
                    iaoo0 = iang0.b(ibff0.b);
                    if(iaoo0.a == null) {
                        iaoo0 = new iaoo(new ibfg(iang0, iaoo0.b));
                    }
                    goto label_54;
                }
                iaoo1 = new iaoo(iapk.d.f(a.b(arrayList2, "None of ", " specified by Service Config are available.")));
                iaoo0 = iaoo1;
            }
            else {
                goto label_53;
            }
            goto label_54;
        }
        catch(RuntimeException runtimeException1) {
        }
        try {
            iaoo1 = new iaoo(iapk.d.f("can\'t parse load balancer configuration").e(runtimeException1));
            iaoo0 = iaoo1;
            goto label_54;
        label_53:
            iaoo0 = null;
        label_54:
            if(iaoo0 == null) {
                object3 = null;
            }
            else {
                iapk iapk0 = iaoo0.a;
                if(iapk0 != null) {
                    return new iaoo(iapk0);
                }
                object3 = iaoo0.b;
            }
            boolean z = this.a;
            int v = this.b;
            int v1 = this.c;
            if(z && map0 != null) {
                Map map2 = iazm.i(map0, "retryThrottling");
                if(map2 == null) {
                    ibet0 = null;
                }
                else {
                    float f = iazm.b(map2, "maxTokens").floatValue();
                    float f1 = iazm.b(map2, "tokenRatio").floatValue();
                    gftb.r(f > 0.0f, "maxToken should be greater than zero");
                    gftb.r(f1 > 0.0f, "tokenRatio should be greater than zero");
                    ibet0 = new ibet(f, f1);
                }
            }
            else {
                ibet0 = null;
            }
            HashMap hashMap0 = new HashMap();
            HashMap hashMap1 = new HashMap();
            Map map3 = map0 == null ? null : iazm.i(map0, "healthCheckConfig");
            List list2 = iazm.g(map0, "methodConfig");
            if(list2 == null) {
                ibbq0 = new ibbq(null, hashMap0, hashMap1, ibet0, object3, map3);
                return new iaoo(ibbq0);
            }
            Iterator iterator2 = list2.iterator();
            while(true) {
            label_84:
                if(!iterator2.hasNext()) {
                    ibbq0 = new ibbq(ibbo0, hashMap0, hashMap1, ibet0, object3, map3);
                    return new iaoo(ibbq0);
                }
                Object object4 = iterator2.next();
                ibbo ibbo1 = new ibbo(((Map)object4), z, v, v1);
                List list3 = iazm.g(((Map)object4), "name");
                if(list3 != null && !list3.isEmpty()) {
                    for(Object object5: list3) {
                        String s3 = iazm.e(((Map)object5), "service");
                        String s4 = iazm.e(((Map)object5), "method");
                        if(gfta.c(s3)) {
                            gftb.f(gfta.c(s4), "missing service name for method %s", s4);
                            gftb.f(ibbo0 == null, "Duplicate default method config in service config %s", map0);
                            ibbo0 = ibbo1;
                        }
                        else if(gfta.c(s4)) {
                            gftb.f(((boolean)(hashMap1.containsKey(s3) ^ 1)), "Duplicate service %s", s3);
                            hashMap1.put(s3, ibbo1);
                        }
                        else {
                            String s5 = gRPCMethodDescriptor.generateFullMethodName(s3, s4);
                            gftb.f(((boolean)(hashMap0.containsKey(s5) ^ 1)), "Duplicate method name %s", s5);
                            hashMap0.put(s5, ibbo1);
                        }
                    }
                }
            }
        }
        catch(RuntimeException runtimeException0) {
            return new iaoo(iapk.d.f("failed to parse service config").e(runtimeException0));
        }
        goto label_84;
    }
}

