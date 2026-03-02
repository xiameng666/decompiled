import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfui implements Comparable {
    public final ShareTarget a;
    public final String b;
    public final byte[] c;
    public cumn d;

    public dfui(ShareTarget shareTarget0, String s, byte[] arr_b) {
        this.a = shareTarget0;
        this.b = s;
        this.c = arr_b;
    }

    public final void a() {
        cumn cumn0 = this.d;
        if(cumn0 == null) {
            return;
        }
        cumn0.b();
        this.d = null;
    }

    @Override
    public final int compareTo(Object object0) {
        ShareTarget shareTarget0 = ((dfui)object0).a;
        ShareTarget shareTarget1 = this.a;
        boolean z = shareTarget1.n;
        if(z != shareTarget0.n) {
            return z ? -1 : 1;
        }
        boolean z1 = shareTarget1.h;
        if(z1 != shareTarget0.h) {
            return z1 ? -1 : 1;
        }
        return shareTarget1.b.compareTo(shareTarget0.b);
    }
}

