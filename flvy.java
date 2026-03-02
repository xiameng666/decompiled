import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

public final class flvy {
    public final Context a;
    final BroadcastReceiver b;
    public iakr c;
    public final gpgz d;

    public flvy(Context context0, gpgz gpgz0) {
        this.c = null;
        this.a = context0;
        flvx flvx0 = new flvx(this);
        this.b = flvx0;
        if(gpgz0 == null) {
            String s = iadu.d();
            int v = (int)iadu.b();
            flbj.e("StubFactory", a.p(v, s, "tachyonHostName = ", " and tachyonPortNumber = "));
            ibgx ibgx0 = new ibgx(s, v);
            flvk.a(ibgx0);
            flbj.a("OkHttpChannelBuilder", "Using Spatula header keyless authentication.");
            ibgx0.g(new iakw[]{new flcj(context0)});
            this.c = ibgx0.a();
            context0.registerReceiver(flvx0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.d = gpgz0;
    }

    public final flve a(ibjo ibjo0) {
        String s = iadu.d();
        int v = (int)iadu.b();
        gpjk gpjk0 = new gpjk();
        iakw[] arr_iakw = {new flcj(this.a)};
        return new flve(ibjo0.q(gpho.a, s + ":" + v).q(gpji.g, gpjk0).p(arr_iakw));
    }

    public final gmcd b() {
        return this.d == null ? gmbu.i(new flve(hnpz.a(this.c))) : gmbu.i(this.a(hnpz.a(this.d.a(hnyh.i))));
    }

    public final gmcd c() {
        return this.d == null ? gmbu.i(new flve(hnqy.a(this.c))) : gmbu.i(this.a(hnqy.a(this.d.a(hnyv.k))));
    }

    public final gmcd d() {
        return this.d == null ? gmbu.i(new flve(hntk.a(this.c))) : gmbu.i(this.a(hntk.a(this.d.a(hnza.f))));
    }

    public final gmcd e() {
        return this.d == null ? gmbu.i(new flve(hnvo.a(this.c))) : gmbu.i(this.a(hnvo.a(this.d.a(hnzn.n))));
    }

    public final gmcd f() {
        return this.d == null ? gmbu.i(new flve(hnvr.a(this.c))) : gmbu.i(this.a(hnvr.a(this.d.a(hoat.G))));
    }
}

