import android.content.Context;

public final class dogv implements dohd, dohf {
    public final dmjo a;
    public final gtlk b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final Context h;
    private final String i;

    public dogv(Context context0, dmjo dmjo0) {
        ibuq.f(context0, "context");
        String s4;
        String s3;
        ibuq.f(dmjo0, "digitalCarKey");
        super();
        this.h = context0;
        this.a = dmjo0;
        String s = dmjo0.c;
        ibuq.e(s, "getKeyId(...)");
        this.i = s;
        gtlj gtlj0 = dmjo0.j == null ? gtlj.a : dmjo0.j;
        gtlk gtlk0 = gtlk.b(gtlj0.b) == null ? gtlk.e : gtlk.b(gtlj0.b);
        ibuq.e(gtlk0, "getSurfacingState(...)");
        this.b = gtlk0;
        String s1 = dmjo0.h;
        ibuq.e(s1, "getVehicleBrand(...)");
        if(s1.length() > 0) {
            String s2 = dmjo0.g;
            ibuq.e(s2, "getVehicleModel(...)");
            if(s2.length() > 0) {
                s3 = context0.getString(0x7F151CEB, new Object[]{dmjo0.h, dmjo0.g});  // string:pay_digital_car_key_label "%1$s %2$s"
                ibuq.c(s3);
            }
            else {
                s3 = "Digital car key";
                ibuq.c("Digital car key");
            }
        }
        else {
            s3 = "Digital car key";
            ibuq.c("Digital car key");
        }
        this.c = s3;
        switch(dmjo0.f) {
            case "STATUS_ACTIVE": {
                s4 = this.j(s3);
                break;
            }
            case "STATUS_INACTIVE_TRACKED": {
                s4 = this.j(s3);
                break;
            }
            case "STATUS_REMOTE_TERMINATION_REQUESTED": {
                s4 = "Pending deletion";
                ibuq.e("Pending deletion", "getString(...)");
                break;
            }
            case "STATUS_SUPENDED": {
                s4 = "Suspended";
                ibuq.e("Suspended", "getString(...)");
                break;
            }
            case "STATUS_TERMINATED": {
                s4 = "Access removed";
                ibuq.e("Access removed", "getString(...)");
                break;
            }
            default: {
                s4 = "Not set up";
                ibuq.e("Not set up", "getString(...)");
            }
        }
        this.d = s4;
        this.e = ibuq.m(dmjo0.f, "STATUS_SUPENDED");
        this.f = ibuq.m(dmjo0.f, "STATUS_REMOTE_TERMINATION_REQUESTED");
        this.g = ibuq.m(dmjo0.f, "STATUS_UNTRACKED") || ibuq.m(dmjo0.f, "STATUS_RESTORED");
    }

    @Override  // edxb
    public final int a(edxb edxb0) {
        return dohc.a(edxb0);
    }

    @Override  // edxb
    public final int b() {
        return 12;
    }

    @Override  // edxb
    public final long c() {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // edxb
    public final String d() {
        return this.i;
    }

    @Override  // edxb
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dogv)) {
            return false;
        }
        return ibuq.m(this.h, ((dogv)object0).h) ? ibuq.m(this.a, ((dogv)object0).a) : false;
    }

    @Override  // dohf
    public final int f() {
        return 0x7F080B11;  // drawable:quantum_gm_ic_car_rental_vd_theme_24
    }

    @Override  // edxb
    public final boolean g(edxb edxb0) {
        return edxa.a(this, edxb0);
    }

    @Override  // dohf
    public final String h() {
        return this.d;
    }

    @Override
    public final int hashCode() {
        int v = this.h.hashCode() * 0x1F;
        dmjo dmjo0 = this.a;
        if(((ProtoLiteMessage)dmjo0).isImmutable()) {
            return v + ((ProtoLiteMessage)dmjo0).s();
        }
        int v1 = dmjo0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)dmjo0).s();
            dmjo0.memoizedHashCode = v1;
        }
        return v + v1;
    }

    @Override  // dohf
    public final String i() {
        return this.c;
    }

    public final String j(String s) {
        String s2;
        ibuq.f(s, "title");
        dmjo dmjo0 = this.a;
        String s1 = dmjo0.l;
        ibuq.e(s1, "getNickname(...)");
        if(s1.length() > 0) {
            s2 = dmjo0.l;
        }
        else {
            s2 = ibuq.m(s, "Digital car key") ? "" : "Digital car key";
        }
        ibuq.c(s2);
        return s2;
    }

    @Override  // dohd
    public final long k() {
        return 0L;
    }

    @Override  // dohd
    public final boolean l() {
        return false;
    }

    @Override
    public final String toString() {
        return "DigitalCarKeyItem(context=" + this.h + ", digitalCarKey=" + this.a + ")";
    }
}

