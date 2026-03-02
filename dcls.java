import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class dcls {
    public long a;
    public String b;
    public Uri c;
    public int d;
    public Bundle e;
    public List f;
    public List g;
    public List h;
    public List i;
    public List j;
    public boolean k;
    public String l;
    public boolean m;
    public String n;
    public PendingIntent o;
    public boolean p;
    public String q;
    public int r;
    public boolean s;
    public int t;
    public String u;
    public boolean v;
    public int w;
    public ParcelByteArray x;
    public List y;
    private static long z;

    static {
    }

    public dcls() {
        this.a = -1L;
        this.d = 1;
        this.e = new Bundle();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.r = 0;
        this.t = 0;
        this.w = 0;
    }

    public final ShareTarget a() {
        batl.c(((boolean)(TextUtils.isEmpty(this.b) ^ 1)), "ShareTarget deviceName must not be null or empty.");
        if(this.a == -1L) {
            this.a = dcls.e();
        }
        if(this.y == null) {
            this.y = new ArrayList(Arrays.asList(new Integer[]{((int)1), ((int)2), ((int)3), ((int)4)}));
        }
        return new ShareTarget(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.i, this.r, this.s, this.j, this.t, this.u, this.v, this.w, this.x, 500, this.y);
    }

    public final void b() {
        this.m = true;
    }

    public final void c() {
        this.m = false;
    }

    public final void d(Long long0) {
        this.a = (long)long0;
    }

    private static long e() {
        long v;
        synchronized(dcls.class) {
            v = dcls.z;
            dcls.z = 1L + v;
        }
        return v;
    }
}

