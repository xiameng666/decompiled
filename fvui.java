import java.util.Locale;

public class fvui {
    public final int a;
    public final int b;
    public final int c;

    public fvui(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public float a() {
        return -Infinityf;
    }

    public float b() {
        return 0.5f;
    }

    public float c() {
        return -1.0f;
    }

    public int d() {
        return 0x80000000;
    }

    public final fvuh e() {
        fvuh fvuh0 = new fvuh(this.a, this.b, this.c);
        fvuh0.b(this.a(), this.c());
        fvuh0.c("");
        fvuh0.a = this.d();
        fvuh0.b = "";
        fvuh0.c = this.b();
        return fvuh0;
    }

    // String Decryptor: 2 succeeded, 0 failed
    public String f() {
        return "";
    }

    // String Decryptor: 2 succeeded, 0 failed
    public String g() {
        return "";
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Position [latE7=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", lngE7=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", acc=");
        stringBuilder0.append(this.c);
        stringBuilder0.append("mm");
        if(this.h()) {
            stringBuilder0.append(", elevationWgs84M=");
            stringBuilder0.append(this.a());
        }
        if(this.m()) {
            stringBuilder0.append(", verticalAccuracyMeters=");
            stringBuilder0.append(String.format(Locale.US, "%.1f", this.c()));
        }
        if(this.k()) {
            stringBuilder0.append(", levelId=");
            stringBuilder0.append("");
        }
        if(this.l()) {
            stringBuilder0.append(", levelNumberE3=");
            stringBuilder0.append(this.d());
        }
        if(this.i()) {
            stringBuilder0.append(", floorLabel=");
            stringBuilder0.append("");
        }
        if(this.j()) {
            stringBuilder0.append(", indoorProbability=");
            stringBuilder0.append(String.format(Locale.US, "%.2f", this.b()));
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

