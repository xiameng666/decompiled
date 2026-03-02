import com.google.android.gms.wearable.internal.NodeParcelable;

public final class etli {
    public final hjxg a;
    public final dpfi b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final gtmu h;
    public final boolean i;

    public etli(hjxg hjxg0, NodeParcelable nodeParcelable0, dpfi dpfi0, boolean z) {
        ibuq.f(hjxg0, "ppDevice");
        String s1;
        boolean z3;
        gtmu gtmu0;
        super();
        boolean z1 = false;
        boolean z2 = (hjxg0.b & 0x100) != 0;
        this.f = z2;
        String s = null;
        if(z2) {
            if(nodeParcelable0 != null || dpfi0 != null || hjxg0.j) {
                throw new RuntimeException("TapAndPayDevice cannot have wearNode or fitbitDeviceInfo when the device is a supervised P11");
            }
            nodeParcelable0 = null;
            dpfi0 = null;
        }
        if(nodeParcelable0 != null && dpfi0 != null) {
            throw new RuntimeException("TapAndPayDevice cannot have more than one of wearNode or fitbitDeviceInfo");
        }
        this.a = hjxg0;
        this.b = dpfi0;
        if(nodeParcelable0 != null) {
            s = nodeParcelable0.a;
        }
        this.c = s;
        if(hjxg0.j) {
            gtmu0 = gtmu.b;
        }
        else if(z2 || nodeParcelable0 != null) {
            gtmu0 = gtmu.d;
        }
        else if(dpfi0 != null) {
            gtmu0 = gtmu.c;
        }
        else {
            gtmu0 = gtmu.b(hjxg0.h) == null ? gtmu.e : gtmu.b(hjxg0.h);
            ibuq.e(gtmu0, "getDevicePlatform(...)");
        }
        this.h = gtmu0;
        switch(gtmu0.ordinal()) {
            case 1: {
                z3 = true;
                break;
            }
            case 2: {
                ibuq.c(dpfi0);
                z3 = dpfi0.i;
                break;
            }
            case 3: {
                if(z2) {
                    z3 = true;
                }
                else {
                    ibuq.c(nodeParcelable0);
                    z3 = nodeParcelable0.d;
                }
                break;
            }
            default: {
                z3 = false;
            }
        }
        this.d = z3;
        switch(gtmu0.ordinal()) {
            case 1: {
                s1 = hjxg0.f;
                ibuq.e(s1, "getDisplayName(...)");
                break;
            }
            case 2: {
                ibuq.c(dpfi0);
                s1 = dpfi0.b;
                ibuq.e(s1, "getName(...)");
                break;
            }
            case 3: {
                if(z2) {
                    s1 = hjxg0.f;
                }
                else {
                    ibuq.c(nodeParcelable0);
                    s1 = nodeParcelable0.b;
                }
                ibuq.e(s1, "getDisplayName(...)");
                break;
            }
            default: {
                s1 = hjxg0.f;
                ibuq.e(s1, "getDisplayName(...)");
            }
        }
        this.e = s1;
        if(gtmu0 == gtmu.d || gtmu0 == gtmu.c) {
            z1 = true;
        }
        this.g = z1;
        this.i = z;
    }
}

