import j..util.Objects;
import java.util.HashSet;
import java.util.Iterator;

final class crcj extends crck {
    final crcm a;
    private final crrf h;

    public crcj(crcm crcm0, String s, int v, crrf crrf0) {
        Objects.requireNonNull(crcm0);
        this.a = crcm0;
        super(s, v);
        this.h = crrf0;
    }

    @Override  // crck
    public final int a() {
        return this.h.c;
    }

    @Override  // crck
    public final boolean b() {
        return false;
    }

    final boolean c(crso crso0, long v, crdn crdn0, boolean z) {
        Iterator iterator1;
        HashSet hashSet0;
        Boolean boolean1;
        Boolean boolean4;
        String s;
        crrf crrf0 = this.h;
        long v1 = crrf0.i ? crdn0.e : v;
        crcm crcm0 = this.a;
        if(crcm0.aJ().j(2)) {
            crcm0.aJ().k.d("Evaluating filter. audience, filter, event", Integer.valueOf(this.c), ((crrf0.b & 1) == 0 ? null : ((int)crrf0.c)), crcm0.ao().c(crrf0.d));
            crjg crjg0 = crcm0.aJ().k;
            crqt crqt0 = crcm0.aw();
            if(crrf0 == null) {
                s = "null";
            }
            else {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("\nevent_filter {\n");
                if((crrf0.b & 1) != 0) {
                    crqt.I(stringBuilder0, 0, "filter_id", Integer.valueOf(crrf0.c));
                }
                crqt.I(stringBuilder0, 0, "event_name", crqt0.ao().c(crrf0.d));
                String s1 = crqt.E(crrf0.g, crrf0.h, crrf0.i);
                if(!s1.isEmpty()) {
                    crqt.I(stringBuilder0, 0, "filter_type", s1);
                }
                if((crrf0.b & 8) != 0) {
                    crqt.M(stringBuilder0, 1, "event_count_filter", (crrf0.f == null ? crrj.a : crrf0.f));
                }
                if(crrf0.e.size() > 0) {
                    stringBuilder0.append("  filters {\n");
                    for(Object object0: crrf0.e) {
                        crqt0.t(stringBuilder0, 2, ((crrg)object0));
                    }
                }
                crqt.B(stringBuilder0, 1);
                stringBuilder0.append("}\n}\n");
                s = stringBuilder0.toString();
            }
            crjg0.b("Filter definition", s);
        }
        int v2 = crrf0.b;
        if((v2 & 1) != 0 && crrf0.c <= 0x100) {
            boolean z1 = crrf0.g || crrf0.h || crrf0.i;
            if(z && !z1) {
                crcm0.aJ().k.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.c), ((crrf0.b & 1) == 0 ? null : ((int)crrf0.c)));
                return true;
            }
            String s2 = crso0.d;
            if((v2 & 8) == 0) {
                hashSet0 = new HashSet();
                iterator1 = crrf0.e.iterator();
            label_51:
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    if(((crrg)object1).f.isEmpty()) {
                        crcm0.aJ().f.b("null or empty param name in filter. event", crcm0.ao().c(s2));
                        boolean1 = null;
                        goto label_131;
                    }
                    hashSet0.add(((crrg)object1).f);
                }
                bxd bxd0 = new bxd();
                for(Object object2: crso0.c) {
                    crsq crsq0 = (crsq)object2;
                    if(!hashSet0.contains(crsq0.c)) {
                        continue;
                    }
                    int v3 = crsq0.b;
                    if((v3 & 4) != 0) {
                        bxd0.put(crsq0.c, Long.valueOf(crsq0.e));
                        continue;
                    }
                    if((v3 & 16) != 0) {
                        bxd0.put(crsq0.c, Double.valueOf(crsq0.g));
                        continue;
                    }
                    if((v3 & 2) != 0) {
                        bxd0.put(crsq0.c, crsq0.d);
                        continue;
                    }
                    crjg crjg1 = crcm0.aJ().f;
                    String s3 = crcm0.ao().d(crsq0.c);
                    crjg1.c("Unknown value for param. event, param", crcm0.ao().c(s2), s3);
                    boolean1 = null;
                    goto label_131;
                }
                for(Object object3: crrf0.e) {
                    crrg crrg0 = (crrg)object3;
                    boolean z2 = (crrg0.b & 4) != 0 && crrg0.e;
                    String s4 = crrg0.f;
                    if(s4.isEmpty()) {
                        crcm0.aJ().f.b("Event has empty param name. event", crcm0.ao().c(s2));
                    }
                    else {
                        Object object4 = bxd0.get(s4);
                        if((object4 instanceof Long)) {
                            if((crrg0.b & 2) != 0) {
                                Boolean boolean2 = crcj.g(((Long)object4).longValue(), (crrg0.d == null ? crrj.a : crrg0.d));
                                if(boolean2 == null) {
                                    boolean1 = null;
                                    goto label_131;
                                }
                                if(boolean2.booleanValue() != z2) {
                                    continue;
                                }
                                boolean1 = Boolean.valueOf(false);
                                goto label_131;
                            }
                            crcm0.aJ().f.c("No number filter for long param. event, param", crcm0.ao().c(s2), crcm0.ao().d(s4));
                            boolean1 = null;
                            goto label_131;
                        }
                        if((object4 instanceof Double)) {
                            if((crrg0.b & 2) != 0) {
                                Boolean boolean3 = crcj.f(((Double)object4).doubleValue(), (crrg0.d == null ? crrj.a : crrg0.d));
                                if(boolean3 == null) {
                                    boolean1 = null;
                                    goto label_131;
                                }
                                if(boolean3.booleanValue() != z2) {
                                    continue;
                                }
                                boolean1 = Boolean.valueOf(false);
                                goto label_131;
                            }
                            crcm0.aJ().f.c("No number filter for double param. event, param", crcm0.ao().c(s2), crcm0.ao().d(s4));
                            boolean1 = null;
                            goto label_131;
                        }
                        if(!(object4 instanceof String)) {
                            goto label_123;
                        }
                        int v4 = crrg0.b;
                        if((v4 & 1) == 0) {
                            if((v4 & 2) == 0) {
                                crcm0.aJ().f.c("No filter for String param. event, param", crcm0.ao().c(s2), crcm0.ao().d(s4));
                                boolean1 = null;
                                goto label_131;
                            }
                            if(!crqt.x(((String)object4))) {
                                crcm0.aJ().f.c("Invalid param value for number filter. event, param", crcm0.ao().c(s2), crcm0.ao().d(s4));
                                boolean1 = null;
                                goto label_131;
                            }
                            boolean4 = crcj.h(((String)object4), (crrg0.d == null ? crrj.a : crrg0.d));
                        }
                        else {
                            boolean4 = crcj.e(((String)object4), (crrg0.c == null ? crrn.a : crrg0.c), crcm0.aJ());
                        }
                        if(boolean4 == null) {
                            boolean1 = null;
                            goto label_131;
                        }
                        if(boolean4.booleanValue() != z2) {
                            continue;
                        }
                        boolean1 = Boolean.valueOf(false);
                        goto label_131;
                    }
                    boolean1 = null;
                    goto label_131;
                label_123:
                    if(object4 == null) {
                        crcm0.aJ().k.c("Missing param for filter. event, param", crcm0.ao().c(s2), crcm0.ao().d(s4));
                        boolean1 = Boolean.valueOf(false);
                    }
                    else {
                        crcm0.aJ().f.c("Unknown param type. event, param", crcm0.ao().c(s2), crcm0.ao().d(s4));
                        boolean1 = null;
                    }
                    goto label_131;
                }
                boolean1 = Boolean.valueOf(true);
            }
            else {
                Boolean boolean0 = crcj.g(v1, (crrf0.f == null ? crrj.a : crrf0.f));
                if(boolean0 == null) {
                    boolean1 = null;
                }
                else if(!boolean0.booleanValue()) {
                    boolean1 = Boolean.valueOf(false);
                }
                else {
                    hashSet0 = new HashSet();
                    iterator1 = crrf0.e.iterator();
                    goto label_51;
                }
            }
        label_131:
            crjg crjg2 = crcm0.aJ().k;
            String s5 = boolean1 == null ? "null" : boolean1;
            crjg2.b("Event filter result", s5);
            if(boolean1 == null) {
                return false;
            }
            Boolean boolean5 = Boolean.valueOf(true);
            this.d = boolean5;
            if(!boolean1.booleanValue()) {
                return true;
            }
            this.e = boolean5;
            if(z1 && (crso0.b & 2) != 0) {
                Long long0 = (long)crso0.e;
                if(crrf0.h) {
                    this.g = long0;
                    return true;
                }
                this.f = long0;
            }
            return true;
        }
        crcm0.aJ().f.c("Invalid event filter ID. appId, id", crji.a(this.b), String.valueOf(((crrf0.b & 1) == 0 ? null : ((int)crrf0.c))));
        return false;
    }
}

