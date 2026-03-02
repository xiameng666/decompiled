import com.google.android.gms.nearby.connection.UwbSenderInfo;
import java.util.Arrays;

public final class dfso {
    public final dftl a;
    public final int b;
    public final long c;
    public final UwbSenderInfo[] d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final boolean k;

    public dfso(dftl dftl0, int v, long v1, UwbSenderInfo[] arr_uwbSenderInfo, int v2, boolean z, boolean z1, boolean z2, int v3, boolean z3, boolean z4) {
        this.b = v;
        this.a = dftl0;
        this.c = v1;
        this.d = arr_uwbSenderInfo;
        this.e = v2;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.j = v3;
        this.i = z3;
        this.k = z4;
    }

    public final dfsn a() {
        dfsn dfsn0 = new dfsn();
        dfsn0.g = this.b;
        dfsn0.a = this.a;
        dfsn0.h = this.c;
        dfsn0.b = this.e;
        dfsn0.c = this.f;
        dfsn0.d = this.g;
        dfsn0.e = this.h;
        UwbSenderInfo[] arr_uwbSenderInfo = this.d;
        if(arr_uwbSenderInfo != null) {
            dfsn0.i = Arrays.asList(arr_uwbSenderInfo);
        }
        dfsn0.j = this.j;
        dfsn0.f = this.i;
        dfsn0.k = this.k;
        return dfsn0;
    }
}

