import com.google.android.gms.udc.UdcCacheResponse.UdcSetting;

final class eznq {
    public final UdcCacheResponse.UdcSetting a;
    public final boolean b;
    public final int c;

    public eznq(hffv hffv0) {
        this.a = eznr.b(eztq.a(hffv0.c), (hffv0.d ? 2 : 3), true);
        this.b = hffv0.f;
        this.c = eztq.a(hffv0.c);
    }

    public eznq(hfqj hfqj0) {
        int v = hfqj0.c;
        int v1 = hfqv.a(hfqj0.e);
        boolean z = true;
        if(v1 == 0) {
            v1 = 1;
        }
        this.a = eznr.b(v, v1 - 1, (hfqj0.b & 8) != 0 && (hfqj0.f == null ? hfqg.a : hfqj0.f).e);
        this.c = hfqj0.c;
        if((hfqj0.b & 8) == 0 || !(hfqj0.f == null ? hfqg.a : hfqj0.f).c) {
            z = false;
        }
        this.b = z;
    }
}

