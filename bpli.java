import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class bpli implements glzn {
    public final bplr a;
    public final ChangeFindMyDeviceSettingsRequest b;
    public final gfsx c;
    public final boolean d;
    public final boolean e;

    public bpli(bplr bplr0, ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0, gfsx gfsx0, boolean z, boolean z1) {
        this.a = bplr0;
        this.b = changeFindMyDeviceSettingsRequest0;
        this.c = gfsx0;
        this.d = z;
        this.e = z1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        bplr bplr0 = this.a;
        if(this.b.d && ((fqxd)object0).b()) {
            bplh bplh0 = new bplh(((fqxd)object0));
            bplr0.g.a(bplh0);
        }
        boolean z = this.c.i() && !((Boolean)this.c.d()).booleanValue();
        if(this.d || this.e || z) {
            bplr0.e.b();
            if(hsxo.f()) {
                return bplr0.f.a();
            }
            return hsww.q() ? bplr0.d.d() : gmbx.a;
        }
        return gmbx.a;
    }
}

