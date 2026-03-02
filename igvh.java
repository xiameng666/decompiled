import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class igvh {
    public boolean a;
    public boolean b;
    public List c;
    public int[] d;
    public int e;
    private int f;
    private int g;
    private int h;

    public igvh(igvo igvo0, int v, int v1) {
        this.c = new ArrayList();
        byte[] arr_b = igvo0.a;
        int v2 = 1;
        boolean z = (arr_b[1] & 0x20) == 0x20;
        this.a = z;
        this.b = (arr_b[1] & 16) == 16;
        this.f = arr_b[1] & 15;
        int v4 = z ? v - 1 : v;
        for(int v5 = 0; v5 < v4; ++v5) {
            this.c.add(new igvf(arr_b, v5 * 5 + 2));
        }
        if(v4 < v) {
            this.c.add(new igvl(arr_b, v4 * 5 + 2));
        }
        int v6 = 2;
        while(v6 < v1) {
            v6 += v6;
            ++v2;
        }
        this.d = new int[v1 - 3];
        int v7 = v * 5 + 2 << 3;
        for(int v3 = 0; v3 < v1 - 3; ++v3) {
            this.d[v3] = igvq.b(arr_b, v7, v2);
            v7 += v2;
        }
        if(v7 % 8 != 0) {
            v7 = (v7 + 8) / 8;
        }
        this.e = arr_b[v7] & 0xFF;
        int v8 = arr_b[v7 + 1];
        this.g = v8 >> 4 & 15;
        this.h = v8 & 15;
    }

    final int a() {
        return this.a ? this.c.size() : 0;
    }

    public final int b(int v) {
        int v1 = 0;
        while(v > 0) {
            int[] arr_v = this.d;
            if(v > arr_v.length) {
                break;
            }
            int v2 = arr_v[v - 1];
            if(v == v2) {
                break;
            }
            if(v1 > arr_v.length) {
                throw new Exception("Invalid SCT.");
            }
            ++v1;
            v = v2;
            continue;
        }
        int v3 = this.d.length;
        if(v == v3 + 1) {
            return 2;
        }
        return v == v3 + 2 ? 3 : 1;
    }

    @Override
    public final String toString() {
        String s = String.format(Locale.UK, "Log Present: %b, Blocked: %b, DirFormat: %d\r\n", Boolean.valueOf(this.a), Boolean.valueOf(this.b), ((int)this.f)) + String.format(Locale.UK, "DirEnts: %d\r\n", this.c.size());
        for(Object object0: this.c) {
            s = s + String.format(Locale.UK, "IPEDirEnt[%d] = %s\r\n", ((int)1), ((igve)object0).toString());
        }
        String s1 = s + "SCT = ";
        for(int v = 0; v < this.d.length; ++v) {
            s1 = s1 + String.format(Locale.UK, "%d, ", ((int)this.d[v]));
        }
        return s1 + String.format(Locale.UK, "DirSeq#: %d, KID: %d, INS#: %d\r\n", ((int)this.e), ((int)this.g), ((int)this.h));
    }
}

