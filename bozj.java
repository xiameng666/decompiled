import android.content.Context;
import com.google.android.gms.findmydevice.spot.LocationReportRequest;
import com.google.android.gms.findmydevice.spot.LocationReportResponse;
import com.google.android.gms.findmydevice.spot.ScanResult;
import dagger.Reusable;
import java.util.concurrent.Executor;

@Reusable
public final class bozj implements bpnj {
    public static final LocationReportResponse a;
    public final bpbb b;
    private final Context c;
    private final fqxe d;
    private final Executor e;

    static {
        bboh.b("LocationReportOp", bbcu.eD);
        bozj.a = new LocationReportResponse();
    }

    public bozj(Context context0, fqxe fqxe0, bpbb bpbb0, Executor executor0) {
        this.c = context0;
        this.d = fqxe0;
        this.b = bpbb0;
        this.e = executor0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        if(bpya.a(this.c)) {
            ScanResult[] arr_scanResult = ((LocationReportRequest)object0).a;
            if(arr_scanResult != null && arr_scanResult.length != 0) {
                switch(((LocationReportRequest)object0).b) {
                    case 1: {
                        return gdta.g(this.d.f()).i(new bozg(this, haea.b, ((LocationReportRequest)object0)), this.e).h(new bozh(), gmap.a);
                    }
                    case 2: {
                        return gdta.g(this.d.f()).i(new bozg(this, haea.c, ((LocationReportRequest)object0)), this.e).h(new bozh(), gmap.a);
                    }
                    case 3: {
                        return gdta.g(this.d.f()).i(new bozg(this, haea.k, ((LocationReportRequest)object0)), this.e).h(new bozh(), gmap.a);
                    }
                    default: {
                        return gdta.g(this.d.f()).i(new bozg(this, haea.a, ((LocationReportRequest)object0)), this.e).h(new bozh(), gmap.a);
                    }
                }
            }
            return gmbu.i(bozj.a);
        }
        cjuh cjuh0 = new cjuh(13, "Failed handling location report: location services are disabled.");
        cjuh0.b = true;
        throw cjuh0;
    }
}

