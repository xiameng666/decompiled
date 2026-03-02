import android.net.Uri;
import android.util.ArraySet;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class dcnn {
    public int a;
    public float b;
    public String c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final Set j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public List r;
    public Long s;

    public dcnn(int v) {
        this.i = 0;
        this.j = new ArraySet();
        this.r = new ArrayList();
        this.s = null;
        this.a = v;
        this.d = true;
        this.h = false;
        this.k = System.currentTimeMillis();
    }

    public final TransferMetadata a() {
        int v = this.a;
        float f = this.b;
        String s = this.c;
        boolean z = this.d;
        if(v != 1004 && v != 0x3FA && v != 1020 && v != 0x401) {
            switch(v) {
                case 1006: 
                case 1007: 
                case 0x3F0: 
                case 1009: 
                case 1010: 
                case 0x3F3: {
                    break;
                }
                default: {
                    return v == 0x3F5 || v == 0x3F6 || v == 0x3F7 ? new TransferMetadata(v, f, s, z, true, this.e, this.f, this.k, this.g, this.i, gged_interceptors.i(this.j), this.s, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r) : new TransferMetadata(v, f, s, z, false, this.e, this.f, this.k, this.g, this.i, gged_interceptors.i(this.j), this.s, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
                }
            }
        }
        return new TransferMetadata(v, f, s, z, true, this.e, this.f, this.k, this.g, this.i, gged_interceptors.i(this.j), this.s, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final void b(Uri uri0) {
        this.r.add(uri0);
    }

    public final void c(Collection collection0) {
        this.j.clear();
        this.j.addAll(collection0);
    }

    public final void d() {
        this.d = false;
    }

    public final void e(float f) {
        batl.c(Float.compare(f, 0.0f) >= 0 && f <= 100.0f, "Progress must be within 0 and 100");
        this.b = f;
    }
}

