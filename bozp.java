import com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadIntentOperation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class bozp implements glzm {
    public final LocationReportUploadIntentOperation a;
    public final List b;
    public final bpjn c;

    public bozp(LocationReportUploadIntentOperation locationReportUploadIntentOperation0, List list0, bpjn bpjn0) {
        this.a = locationReportUploadIntentOperation0;
        this.b = list0;
        this.c = bpjn0;
    }

    @Override  // glzm
    public final gmcd a() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.b) {
            gmcd gmcd0 = (gmcd)object0;
            try {
                gmbu.r(gmcd0);
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                if(!(throwable0 instanceof bpac)) {
                    continue;
                }
                arrayList0.add(((bpac)throwable0).a);
            }
        }
        return this.a.e.a(this.c.b, arrayList0);
    }
}

