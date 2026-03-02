import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class stu {
    public static boolean a(srb srb0, svt svt0, ssy ssy0, srs srs0) {
        srt srt0;
        boolean z = srb0.f(svt0);
        boolean z1 = srb0.f(srb0.b());
        switch(srs0.ordinal()) {
            case 0: {
                srt0 = svt0.a();
                break;
            }
            case 1: {
                srt0 = svt0.b();
                break;
            }
            default: {
                throw sxf.g("BUG: Unhandled access type (not GET or PUT)");
            }
        }
        Integer integer0 = ssy0.a();
        Map map0 = srt0.a;
        List list0 = map0.containsKey(integer0) ? DesugarCollections.unmodifiableList(((srv)map0.get(Integer.valueOf(ssy0.a()))).b) : new ArrayList();
        int v = 0;
        ssf ssf0 = ssf.b;
        sxd sxd0 = srb0.c.d;
        sxd sxd1 = sxd.a((sxd0.d() ? ((sqv)sxd0.b()).a : null));
        svt svt1 = srb0.a();
        for(Object object0: list0) {
            sss sss0 = (sss)object0;
            if((sss0 instanceof ssh)) {
                if(((ssh)sss0).c) {
                    sxd sxd2 = (((ssh)sss0).b ? svt1 : svt0).h(((ssh)sss0).a);
                    if(sxd2.d() && ((ssc)((svu)sxd2.b()).m).d()) {
                        ssc ssc0 = (ssc)((svu)sxd2.b()).m;
                        if(!((ssc)((svu)sxd2.b()).m).k()) {
                            goto label_28;
                        }
                    }
                    else {
                        goto label_28;
                    }
                }
                else {
                label_28:
                    if(!sxd1.d()) {
                        continue;
                    }
                    ssh ssh0 = (ssh)sxd1.b();
                    if((z1 || ssh0.b ? 1 : 0) == (((ssh)sss0).b || z ? 1 : 0) && ssh0.a == ((ssh)sss0).a) {
                        v = 1;
                        break;
                    }
                    continue;
                }
                v = 1;
                break;
            }
        }
        for(Object object1: list0) {
            sss sss1 = (sss)object1;
            if((sss1 instanceof ssf)) {
                int v1 = ((ssf)sss1).d;
                if(v1 == ssf0.d || v1 == ssf.c.d) {
                    return v | 1;
                }
            }
        }
        return v;
    }
}

