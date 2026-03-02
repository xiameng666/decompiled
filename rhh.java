import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import j..time.Instant;
import j..time.OffsetDateTime;
import j..time.format.DateTimeParseException;
import j..util.Objects;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public final class rhh {
    private String a;
    private final Context b;
    private final String c;
    private final URL d;
    private final String e;
    private final String f;
    private final int g;
    private final int h;
    private final String i;
    private final String j;
    private final rgw k;
    private final String l;
    private final rha m;
    private final String n;

    public rhh() {
        this.a = "";
    }

    public rhh(Context context0, String s, URL uRL0, String s1, String s2, int v, int v1, String s3, String s4, rgw rgw0, String s5, rha rha0, String s6) {
        this.a = "";
        this.b = context0;
        this.c = s;
        this.d = uRL0;
        this.e = s1;
        this.f = s2;
        this.g = v;
        this.h = v1;
        this.i = s3;
        this.j = s4;
        this.k = rgw0;
        this.l = s5;
        this.m = rha0;
        this.n = s6;
    }

    public final rhx a(rhw rhw0) {
        String s3;
        Objects.requireNonNull(rhw0);
        rhc rhc0 = rhd.a();
        rhc0.h(this.c);
        rhc0.m(this.l);
        rhc0.c(this.i);
        rhc0.d(this.j);
        rhc0.g(this.h);
        String s = this.n;
        if(!TextUtils.isEmpty(s)) {
            rhc0.b(s);
        }
        String s1 = this.f;
        if(!TextUtils.isEmpty(s1)) {
            rhc0.l(s1);
        }
        else if(TextUtils.isEmpty(this.a)) {
            String s2 = this.e;
            if(!TextUtils.isEmpty(s2)) {
                rhc0.e(s2);
            }
        }
        else {
            rhc0.e(this.a);
        }
        rhd rhd0 = rhc0.a();
        rgy rgy0 = rgz.a();
        rgy0.n("AcquireTemporaryToken");
        rgy0.o(rhw0.b);
        rgy0.e(rhw0.c);
        rgz rgz0 = rgy0.a();
        try {
            gftb.check(this.m);
            s3 = this.m.b(rhw0.a, rhd0, rgz0);
        }
        catch(rhb rhb0) {
            Log.w("Ts43", "acquireTemporaryToken: Failed to perform ODSA operation. e=".concat(rhb0.toString()));
            throw rhb0;
        }
        rid rid0 = new rid(s3);
        rhy rhy0 = new rhy();
        rhy0.e = "";
        rhy0.f = Instant.EPOCH;
        rhy0.b(ggna.a);
        try {
            String s4 = rid0.a(gged_interceptors.l("APPLICATION"), "OperationResult");
            rhy0.a(-1);
            if(!TextUtils.isEmpty(s4)) {
                int v = s4.hashCode();
                if(v != 49) {
                    switch(v) {
                        case 0xBDF1: {
                            if(s4.equals("100")) {
                                rhy0.a(100);
                            }
                            break;
                        }
                        case 0xBDF2: {
                            if(s4.equals("101")) {
                                rhy0.a(101);
                            }
                            break;
                        }
                        case 0xBDF3: {
                            if(s4.equals("102")) {
                                rhy0.a(102);
                            }
                            break;
                        }
                        case 0xBDF4: {
                            if(s4.equals("103")) {
                                rhy0.a(103);
                            }
                            break;
                        }
                        case 0xBDF5: {
                            if(s4.equals("104")) {
                                rhy0.a(104);
                            }
                        }
                    }
                }
                else if(s4.equals("1")) {
                    rhy0.a(1);
                }
            }
            String s5 = rid0.a(gged_interceptors.l("APPLICATION"), "GeneralErrorURL");
            if(!TextUtils.isEmpty(s5)) {
                rhy0.b = new URL(s5);
            }
            String s6 = rid0.a(gged_interceptors.l("APPLICATION"), "GeneralErrorUserData");
            if(!TextUtils.isEmpty(s6)) {
                rhy0.c = s6;
            }
            String s7 = rid0.a(gged_interceptors.l("APPLICATION"), "GeneralErrorText");
            if(!TextUtils.isEmpty(s7)) {
                rhy0.d = s7;
            }
            String s8 = rid0.a(gged_interceptors.l("TOKEN"), "token");
            if(!TextUtils.isEmpty(s8)) {
                this.a = s8;
            }
        }
        catch(MalformedURLException unused_ex) {
            throw new rhb(0x20, "AcquireTemporaryTokenResponse: Malformed URL ".concat(String.valueOf(s3)));
        }
        rhy0.b(gged_interceptors.i(Arrays.asList(gfta.b(rid0.a(gged_interceptors.l("APPLICATION"), "OperationTargets")).split("\\s*,\\s*"))));
        String s9 = rid0.a(gged_interceptors.l("APPLICATION"), "TemporaryToken");
        if(s9 == null) {
            throw new rhb(60, "temporary token is not available.");
        }
        rhy0.e = s9;
        String s10 = rid0.a(gged_interceptors.l("APPLICATION"), "TemporaryTokenExpiry");
        if(s10 != null) {
            try {
                rhy0.f = OffsetDateTime.parse(s10).toInstant();
            }
            catch(DateTimeParseException unused_ex) {
                Log.w("Ts43", "Failed to parse temporaryTokenExpiry: ".concat(s10));
            }
            if(rhy0.h == 1) {
                String s11 = rhy0.e;
                if(s11 != null) {
                    gged_interceptors gged0 = rhy0.g;
                    if(gged0 != null) {
                        return new rhx(rhy0.a, rhy0.b, rhy0.c, rhy0.d, s11, rhy0.f, gged0);
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(rhy0.h == 0) {
                stringBuilder0.append(" operationResult");
            }
            if(rhy0.e == null) {
                stringBuilder0.append(" temporaryToken");
            }
            if(rhy0.g == null) {
                stringBuilder0.append(" operationTargets");
            }
            throw new IllegalStateException("Missing required properties:".concat(stringBuilder0.toString()));
        }
        Log.w("Ts43", "Failed to find a temporaryTokenExpiry");
        throw new rhb(60, "temporary token didn\'t have required expiry.");
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof rhh) && this.b.equals(((rhh)object0).b) && this.c.equals(((rhh)object0).c) && this.d.equals(((rhh)object0).d) && this.e.equals(((rhh)object0).e) && this.f.equals(((rhh)object0).f) && this.g == ((rhh)object0).g && this.h == ((rhh)object0).h && this.i.equals(((rhh)object0).i) && this.j.equals(((rhh)object0).j)) {
            rgw rgw0 = this.k;
            if(rgw0 != null) {
                if(rgw0.equals(((rhh)object0).k)) {
                label_8:
                    if(this.l.equals(((rhh)object0).l)) {
                        rha rha0 = this.m;
                        if(rha0 == null) {
                            return ((rhh)object0).m == null ? this.n.equals(((rhh)object0).n) : false;
                        }
                        return rha0.equals(((rhh)object0).m) ? this.n.equals(((rhh)object0).n) : false;
                    }
                }
            }
            else if(((rhh)object0).k == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g) * 1000003 ^ this.h) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.j.hashCode()) * 1000003 ^ (this.k == null ? 0 : this.k.hashCode())) * 1000003 ^ this.l.hashCode()) * 1000003;
        rha rha0 = this.m;
        if(rha0 != null) {
            v = rha0.hashCode();
        }
        return this.n.hashCode() ^ (v1 ^ v) * 1000003;
    }

    @Override
    public final String toString() {
        return "Ts43Operation{context=" + this.b + ", entitlementVersion=" + this.c + ", entitlementServerAddress=" + this.d + ", initialAuthToken=" + this.e + ", temporaryToken=" + this.f + ", slotIndex=" + this.g + ", configurationVersion=" + this.h + ", appName=" + this.i + ", appVersion=" + this.j + ", carrierConfig=" + this.k + ", imei=" + this.l + ", serviceEntitlement=" + this.m + ", acceptContentType=" + this.n + "}";
    }
}

