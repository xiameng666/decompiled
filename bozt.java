import com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadIntentOperation;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class bozt implements glzn {
    public final LocationReportUploadIntentOperation a;
    public final bpjn b;
    public final List c;
    public final bhmw d;
    public final String e;

    public bozt(LocationReportUploadIntentOperation locationReportUploadIntentOperation0, bpjn bpjn0, List list0, bhmw bhmw0, String s) {
        this.a = locationReportUploadIntentOperation0;
        this.b = bpjn0;
        this.c = list0;
        this.d = bhmw0;
        this.e = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ggqj ggqj1;
        LocationReportUploadIntentOperation locationReportUploadIntentOperation0;
        bozt bozt0 = this;
        bpjn bpjn0 = bozt0.b;
        ArrayList arrayList0 = new ArrayList(((ggnf)bpjn0.a).d);
        ggqj ggqj0 = bpjn0.a.v().om();
        int v = 0;
        int v1 = 0;
        while(true) {
            locationReportUploadIntentOperation0 = bozt0.a;
            if(!ggqj0.hasNext()) {
                break;
            }
            String s = bozt0.e;
            List list0 = bozt0.c;
            Object object1 = ggqj0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            gfsx gfsx0 = (gfsx)map$Entry0.getKey();
            if(!gfsx0.i()) {
            label_22:
                if(bouv.c(((fqzl)object0))) {
                label_23:
                    gtcd gtcd0 = (gtcd)map$Entry0.getValue();
                    gmcd gmcd0 = locationReportUploadIntentOperation0.a(gtcd0, new ArrayDeque(list0));
                    boolean z = gfsx0.i();
                    int v3 = gtcd0.c.size();
                    int v4 = bouv.e(((fqzl)object0)) ^ 1;
                    gdta gdta0 = gdta.g(gmcd0);
                    bozx bozx0 = new bozx(gfsx0, ((boolean)v4), s, v3);
                    ggqj1 = ggqj0;
                    gdta gdta1 = gdta0.f(Throwable.class, bozx0, gmap.a).i(new bozy(locationReportUploadIntentOperation0, z, v3, gfsx0, s, ((boolean)v4), bozt0.d), locationReportUploadIntentOperation0.h);
                    bozz bozz0 = new bozz(z, gfsx0);
                    arrayList0.add(gdta1.f(Throwable.class, bozz0, gmap.a));
                    goto label_36;
                }
            }
            else if(bouv.j(((fqzl)object0)) && list0.contains(gfsx0.d())) {
                if(((long)v1) == hsxv.a.y().K()) {
                    int v2 = ((gtcd)map$Entry0.getValue()).c.size();
                    LocationReportUploadIntentOperation.d(hadw.b, s, hadu.c, v2);
                    ++v;
                    continue;
                }
                else {
                    ++v1;
                    goto label_23;
                }
                goto label_22;
            }
            ggqj1 = ggqj0;
        label_36:
            bozt0 = this;
            ggqj0 = ggqj1;
        }
        if(!hsxo.e()) {
            bozn bozn0 = new bozn(v, v1);
            locationReportUploadIntentOperation0.f.a(bozn0);
        }
        return hsxl.i() ? gdtd.g(arrayList0).b(new bozp(locationReportUploadIntentOperation0, arrayList0, bpjn0), locationReportUploadIntentOperation0.h) : gdtd.g(arrayList0).a(new bozo(), gmap.a);
    }
}

