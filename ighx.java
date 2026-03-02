import java.io.DataInput;
import java.util.Arrays;

final class ighx {
    final ighv a;
    final String b;
    final int c;

    public ighx(ighv ighv0, String s, int v) {
        this.a = ighv0;
        this.b = s;
        this.c = v;
    }

    public final long a(long v, int v1, int v2) {
        ighv ighv0 = this.a;
        int v3 = ighv0.a;
        if(v3 == 0x77) {
            v1 += v2;
        }
        else if(v3 != 0x73) {
            v1 = 0;
        }
        long v4 = v + ((long)v1);
        igev igev0 = igev.F;
        int v5 = ighv0.b;
        long v6 = igev0.z.l(v4, v5);
        long v7 = igev0.j.l(v6, 0);
        int v8 = ighv0.f;
        long v9 = ighv0.a(igev0, igev0.j.g(v7, Math.min(v8, 0x5265BFF)));
        if(ighv0.d != 0) {
            v9 = ighv0.c(igev0, v9);
            if(v9 <= v4) {
                long v10 = igev0.A.g(v9, 1);
                v9 = ighv0.c(igev0, ighv0.a(igev0, igev0.z.l(v10, v5)));
            }
        }
        else if(v9 <= v4) {
            v9 = ighv0.a(igev0, igev0.A.g(v9, 1));
        }
        long v11 = igev0.j.l(v9, 0);
        return igev0.j.g(v11, v8) - ((long)v1);
    }

    public final long b(long v, int v1, int v2) {
        ighv ighv0 = this.a;
        int v3 = ighv0.a;
        if(v3 == 0x77) {
            v1 += v2;
        }
        else if(v3 != 0x73) {
            v1 = 0;
        }
        long v4 = v + ((long)v1);
        igev igev0 = igev.F;
        int v5 = ighv0.b;
        long v6 = igev0.z.l(v4, v5);
        long v7 = igev0.j.l(v6, 0);
        int v8 = ighv0.f;
        long v9 = ighv0.b(igev0, igev0.j.g(v7, v8));
        if(ighv0.d != 0) {
            v9 = ighv0.c(igev0, v9);
            if(v9 >= v4) {
                long v10 = igev0.A.g(v9, -1);
                v9 = ighv0.c(igev0, ighv0.b(igev0, igev0.z.l(v10, v5)));
            }
        }
        else if(v9 >= v4) {
            v9 = ighv0.b(igev0, igev0.A.g(v9, -1));
        }
        long v11 = igev0.j.l(v9, 0);
        return igev0.j.g(v11, v8) - ((long)v1);
    }

    static ighx c(DataInput dataInput0) {
        return new ighx(new ighv(((char)dataInput0.readUnsignedByte()), dataInput0.readUnsignedByte(), dataInput0.readByte(), dataInput0.readUnsignedByte(), dataInput0.readBoolean(), ((int)ighy.a(dataInput0))), dataInput0.readUTF(), ((int)ighy.a(dataInput0)));
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ighx) && this.c == ((ighx)object0).c && this.b.equals(((ighx)object0).b) && this.a.equals(((ighx)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.c), this.b, this.a});
    }

    @Override
    public final String toString() {
        return this.a.toString() + " named " + this.b + " at " + this.c;
    }
}

