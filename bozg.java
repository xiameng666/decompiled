import com.google.android.gms.findmydevice.spot.LocationReportRequest;

public final class bozg implements glzn {
    public final bozj a;
    public final haea b;
    public final LocationReportRequest c;

    public bozg(bozj bozj0, haea haea0, LocationReportRequest locationReportRequest0) {
        this.a = bozj0;
        this.b = haea0;
        this.c = locationReportRequest0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boolean z = hsxo.a.d().g();
        haea haea0 = this.b;
        if(z) {
            ciki ciki0 = ciki.v();
            bozi bozi0 = new bozi(haea0, ((fqzl)object0));
            ciki0.j(((ProtoLiteMessage)bnns.a(hadq.b, bozi0)));
        }
        return !bouv.j(((fqzl)object0)) && !bouv.c(((fqzl)object0)) ? gmbx.a : new gdtc(gdtf.c(ggch.k(this.c.a).l(new boze(this.a, haea0)).n())).a(new bozf(), gmap.a);
    }
}

