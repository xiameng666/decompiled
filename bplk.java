import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class bplk implements glzn {
    public final bplr a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final gfsx e;
    public final ChangeFindMyDeviceSettingsRequest f;
    public final int g;

    public bplk(bplr bplr0, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, int v, gfsx gfsx3, ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0) {
        this.a = bplr0;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
        this.g = v;
        this.e = gfsx3;
        this.f = changeFindMyDeviceSettingsRequest0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boolean z = this.b.i() && !((Boolean)this.b.d()).booleanValue();
        gfsx gfsx0 = this.c;
        boolean z1 = gfsx0.i() && ((gtas)gfsx0.d()).equals(gtas.a);
        if(((Boolean)object0).booleanValue()) {
            int v = this.g;
            gfsx gfsx1 = this.d;
            if(gfsx1.i() || z || z1) {
                goto label_9;
            }
            if(v == 7) {
                v = 7;
            label_9:
                gfsx gfsx2 = this.e;
                bplr bplr0 = this.a;
                if(!z && v != 7) {
                    gfsx2 = gfqx.a;
                }
                if(!z1 && v != 7) {
                    gfsx0 = gfqx.a;
                }
                return gdta.g(bplr0.d.q(gfsx1, gfsx2, gfsx0)).i(new fqub(new bpli(bplr0, this.f, gfsx1, z, z1)), bplr0.i).i(new bplj(bplr0), bplr0.i);
            }
        }
        return gmbu.i(((Boolean)object0));
    }
}

