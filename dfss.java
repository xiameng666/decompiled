import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

public final class dfss {
    public final dgyn a;
    public final Map b;
    private static final Map c;
    private final dcpn d;

    static {
        dfss.c = ibpz.i(new ibns[]{new ibns(((int)0x3F0), dhcs.c), new ibns(((int)1010), dhcs.e), new ibns(((int)1009), dhcs.a), new ibns(((int)0x3F5), dhcs.d), new ibns(((int)0x3F6), dhcs.f), new ibns(((int)0x3FA), dhcs.b)});
    }

    public dfss(dcpn dcpn0) {
        ibuq.f(dcpn0, "analyticsLogger");
        dgyp dgyp0 = dgym.a();
        ibuq.f(dcpn0, "analyticsLogger");
        ibuq.f(dgyp0, "internalEventLogger");
        super();
        this.d = dcpn0;
        this.a = dgyp0;
        this.b = new LinkedHashMap();
    }

    public final void a(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        ibuq.f(transferMetadata0, "transferMetadata");
        Integer integer0 = (int)1005;
        if(shareTarget0.f) {
            String s = dfsr.b(shareTarget0);
            int v = transferMetadata0.a;
            switch(v) {
                case 1002: {
                    dhcm dhcm0 = new dhcm(shareTarget0.a, s, this.d.i);
                    this.a.a(dhcm0);
                    dgzc dgzc0 = new dgzc(s, false, false, shareTarget0.d, false, true);
                    this.a.a(dgzc0);
                    return;
                }
                case 1005: {
                    Map map0 = this.b;
                    if(!map0.containsKey(shareTarget0)) {
                        map0.put(shareTarget0, integer0);
                        dgyb dgyb0 = new dgyb(s, shareTarget0.e());
                        this.a.a(dgyb0);
                        return;
                    }
                    break;
                }
                case 1006: {
                    this.b.remove(shareTarget0);
                    gyqi gyqi0 = dcpt.v(shareTarget0.e());
                    ibuq.c(gyqi0);
                    dgxz dgxz0 = new dgxz(s, dfsr.a(gyqi0), gyzg.b, transferMetadata0.o, 3);
                    this.a.a(dgxz0);
                    return;
                }
                default: {
                    if(transferMetadata0.e) {
                        Integer integer1 = (Integer)this.b.remove(shareTarget0);
                        if(integer1 != null) {
                            integer1.intValue();
                            this.a.a(new dgxz(s, 0L, (v == 1009 ? gyzg.c : gyzg.d), transferMetadata0.o, 3));
                        }
                    }
                }
            }
        }
        else {
            String s1 = dfsr.b(shareTarget0);
            int v1 = transferMetadata0.a;
            switch(v1) {
                case 1003: {
                    gyqi gyqi1 = dcpt.v(shareTarget0.e());
                    ibuq.c(gyqi1);
                    dhbs dhbs0 = new dhbs(s1, dfsr.a(gyqi1));
                    this.a.a(dhbs0);
                    dhdb dhdb0 = new dhdb(s1, true);
                    this.a.a(dhdb0);
                    return;
                }
                case 1005: {
                    Map map3 = this.b;
                    if(!map3.containsKey(shareTarget0)) {
                        map3.put(shareTarget0, integer0);
                        dhcu dhcu2 = new dhcu(s1, shareTarget0.e());
                        this.a.a(dhcu2);
                    }
                    break;
                }
                default: {
                    if(v1 == 1006) {
                        Map map2 = this.b;
                        if(!map2.containsKey(shareTarget0)) {
                            map2.put(shareTarget0, integer0);
                            dhcu dhcu1 = new dhcu(s1, shareTarget0.e());
                            this.a.a(dhcu1);
                        }
                        Integer integer2 = (Integer)map2.remove(shareTarget0);
                        if(integer2 != null) {
                            integer2.intValue();
                            dhcp dhcp0 = new dhcp(s1, transferMetadata0.o, 3);
                            this.a.a(dhcp0);
                        }
                    }
                    else if(transferMetadata0.e) {
                        Map map1 = this.b;
                        if(!map1.containsKey(shareTarget0)) {
                            dhcu dhcu0 = new dhcu(s1, shareTarget0.e());
                            this.a.a(dhcu0);
                        }
                        map1.remove(shareTarget0);
                        dhcs dhcs0 = (dhcs)dfss.c.get(Integer.valueOf(v1));
                        if(dhcs0 == null) {
                            dhcs0 = dhcs.g;
                        }
                        dhcr dhcr0 = new dhcr(s1, dhcs0, transferMetadata0.o, 3);
                        this.a.a(dhcr0);
                    }
                }
            }
        }
    }
}

