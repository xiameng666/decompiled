import android.content.Context;
import android.content.Intent;
import com.google.android.gms.findmydevice.spot.OwnersLocationReportRequest;
import com.google.android.gms.findmydevice.spot.ScanResult;

public final class bpcp implements glzn {
    public final bpcs a;
    public final OwnersLocationReportRequest b;

    public bpcp(bpcs bpcs0, OwnersLocationReportRequest ownersLocationReportRequest0) {
        this.a = bpcs0;
        this.b = ownersLocationReportRequest0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(hsxo.g()) {
            ciki ciki0 = ciki.v();
            bpcr bpcr0 = new bpcr(((fqzl)object0));
            ciki0.j(((ProtoLiteMessage)bnns.a(hadq.b, bpcr0)));
        }
        if(!bouv.j(((fqzl)object0))) {
            return gmbx.a;
        }
        bpcs bpcs0 = this.a;
        if(hsxl.h()) {
            Context context0 = bpcs0.b;
            Intent intent0 = boxr.b(context0);
            if(intent0 != null) {
                context0.startService(intent0);
            }
        }
        ScanResult scanResult0 = this.b.b;
        gfsx gfsx0 = gfsx.m(this.b.a);
        return bpcs0.c.a(scanResult0, gfsx0, haea.d);
    }
}

