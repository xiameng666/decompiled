import android.adservices.measurement.MeasurementManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class crqx extends crlv {
    public static final String[] a;
    private static final String[] b;
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private ojj f;
    private Boolean g;
    private Integer h;

    static {
        crqx.b = new String[]{"firebase_", "google_", "ga_"};
        crqx.a = new String[]{"_err"};
    }

    public crqx(crkt crkt0) {
        super(crkt0);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    final String A() {
        byte[] arr_b = new byte[16];
        this.E().nextBytes(arr_b);
        return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
    }

    public final String B(String s, int v, boolean z) {
        if(s == null) {
            return null;
        }
        if(s.codePointCount(0, s.length()) > v) {
            return z ? s.substring(0, s.offsetByCodePoints(0, v)) + "..." : null;
        }
        return s;
    }

    public final URL C(long v, String s, String s1, long v1, String s2) {
        try {
            batl.q(s1);
            batl.q(s);
            String s3 = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", v, this.k()), s1, s, v1);
            if(s.equals(this.am().H("debug.deferred.deeplink"))) {
                s3 = s3 + "&ddl_test=1";
            }
            if(!s2.isEmpty()) {
                if(s2.charAt(0) != 38) {
                    s3 = s3 + "&";
                }
                s3 = s3 + s2;
            }
            return new URL(s3);
        }
        catch(MalformedURLException | IllegalArgumentException exception0) {
            this.aJ().c.b("Failed to create BOW URL for Deferred Deep Link. exception", exception0.getMessage());
            return null;
        }
    }

    static MessageDigest D() {
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                if(messageDigest0 != null) {
                    return messageDigest0;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return null;
    }

    final SecureRandom E() {
        this.n();
        if(this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    final void F(Bundle bundle0, long v) {
        long v1 = bundle0.getLong("_et");
        if(v1 != 0L) {
            this.aJ().f.b("Params already contained engagement", Long.valueOf(v1));
        }
        bundle0.putLong("_et", v + v1);
    }

    final void G(Bundle bundle0, int v, String s, Object object0) {
        if(this.N(bundle0, v)) {
            bundle0.putString("_ev", this.B(s, 40, true));
            if(object0 != null && ((object0 instanceof String) || (object0 instanceof CharSequence))) {
                bundle0.putLong("_el", ((long)object0.toString().length()));
            }
        }
    }

    public static void H(crns crns0, Bundle bundle0, boolean z) {
        if(bundle0 != null && crns0 != null) {
            if(bundle0.containsKey("_sc") && !z) {
                z = false;
                goto label_16;
            }
            String s = crns0.a;
            if(s == null) {
                bundle0.remove("_sn");
            }
            else {
                bundle0.putString("_sn", s);
            }
            String s1 = crns0.b;
            if(s1 == null) {
                bundle0.remove("_sc");
            }
            else {
                bundle0.putString("_sc", s1);
            }
            bundle0.putLong("_si", crns0.c);
            return;
        }
    label_16:
        if(bundle0 != null && crns0 == null && z) {
            bundle0.remove("_sn");
            bundle0.remove("_sc");
            bundle0.remove("_si");
        }
    }

    final void I(Bundle bundle0, Bundle bundle1) {
        if(bundle1 != null) {
            for(Object object0: bundle1.keySet()) {
                String s = (String)object0;
                if(!bundle0.containsKey(s)) {
                    this.aq().L(bundle0, s, bundle1.get(s));
                }
            }
        }
    }

    final void J(crjj crjj0, int v) {
        Bundle bundle0 = crjj0.e;
        int v1 = 0;
        boolean z = false;
        for(Object object0: new TreeSet(bundle0.keySet())) {
            String s = (String)object0;
            if(crqx.ad(s)) {
                ++v1;
                if(v1 > v) {
                    if(!this.am().t(crif.aO) || !z) {
                        this.aJ().e.c(a.f(v, "Event can\'t contain more than ", " params"), this.ao().c(crjj0.a), this.ao().b(bundle0));
                        this.N(bundle0, 5);
                    }
                    bundle0.remove(s);
                    z = true;
                }
            }
        }
    }

    final void K(crqw crqw0, String s, int v, String s1, String s2, int v1) {
        Bundle bundle0 = new Bundle();
        this.N(bundle0, v);
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
            bundle0.putString(s1, s2);
        }
        if(v == 2 || v == 6 || v == 7) {
            bundle0.putLong("_el", ((long)v1));
        }
        crqw0.a(s, "_err", bundle0);
    }

    final void L(Bundle bundle0, String s, Object object0) {
        if(bundle0 != null) {
            if((object0 instanceof Long)) {
                bundle0.putLong(s, ((Long)object0).longValue());
                return;
            }
            if((object0 instanceof String)) {
                bundle0.putString(s, String.valueOf(object0));
                return;
            }
            if((object0 instanceof Double)) {
                bundle0.putDouble(s, ((Double)object0).doubleValue());
                return;
            }
            if((object0 instanceof Bundle[])) {
                bundle0.putParcelableArray(s, ((Bundle[])object0));
                return;
            }
            if(s != null) {
                String s1 = object0 == null ? null : object0.getClass().getSimpleName();
                this.aJ().h.c("Not putting event parameter. Invalid value type. name, type", this.ao().d(s), s1);
            }
        }
    }

    final void M(String s, String s1, String s2, Bundle bundle0, List list0, boolean z) {
        int v4;
        int v2;
        List list1 = list0;
        if(bundle0 != null) {
            int v = this.am().aq().at(231100000) ? 35 : 0;
            int v1 = 0;
            boolean z1 = false;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s3 = (String)object0;
                if(list1 != null && list1.contains(s3)) {
                    v2 = 0;
                }
                else {
                    int v3 = z ? 0 : this.g(s3);
                    v2 = v3 == 0 ? this.d(s3) : v3;
                }
                switch(v2) {
                    case 0: {
                        if(crqx.ai(bundle0.get(s3))) {
                            this.aJ().h.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s1, s2, s3);
                            v4 = 22;
                        }
                        else {
                            v4 = this.a(s, s1, s3, bundle0.get(s3), bundle0, list1, z, false);
                        }
                        if(v4 != 0 && !"_ev".equals(s3)) {
                            this.G(bundle0, v4, s3, bundle0.get(s3));
                            bundle0.remove(s3);
                        }
                        else if(crqx.ad(s3) && !crqx.P(s3, crmd.d)) {
                            ++v1;
                            if(!this.at(231100000)) {
                                this.aJ().e.c("Item array not supported on client\'s version of Google Play Services (Android Only)", this.ao().c(s1), this.ao().b(bundle0));
                                this.N(bundle0, 23);
                                bundle0.remove(s3);
                            }
                            else if(v1 > v) {
                                if(!this.am().t(crif.aO) || !z1) {
                                    this.aJ().e.c(a.f(v, "Item can\'t contain more than ", " item-scoped custom params"), this.ao().c(s1), this.ao().b(bundle0));
                                }
                                this.N(bundle0, 28);
                                bundle0.remove(s3);
                                list1 = list0;
                                z1 = true;
                                continue;
                            }
                        }
                        break;
                    }
                    case 3: {
                        this.G(bundle0, 3, s3, s3);
                        bundle0.remove(s3);
                        break;
                    }
                    default: {
                        this.G(bundle0, v2, s3, null);
                        bundle0.remove(s3);
                    }
                }
                list1 = list0;
            }
        }
    }

    final boolean N(Bundle bundle0, int v) {
        if(bundle0 != null && bundle0.getLong("_err") == 0L) {
            bundle0.putLong("_err", ((long)v));
            return true;
        }
        return false;
    }

    final boolean O(String s) {
        String s1 = (String)crif.ak.a();
        return s1.equals("*") || Arrays.asList(s1.split(",")).contains(s);
    }

    public static boolean P(String s, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(Objects.equals(s, arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    final boolean Q(String s) {
        if(!TextUtils.isEmpty(s)) {
            batl.s(s);
            if(!s.matches("^1:\\d+:android:[a-f0-9]+$")) {
                this.aJ().e.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", crji.a(s));
                return false;
            }
            return true;
        }
        this.aJ().e.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    final boolean R(String s, int v, String s1) {
        if(s1 == null) {
            this.aJ().e.b("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.codePointCount(0, s1.length()) > v) {
            this.aJ().e.d("Name is too long. Type, maximum supported length, name", s, Integer.valueOf(v), s1);
            return false;
        }
        return true;
    }

    final boolean S(String s, String[] arr_s, String s1) {
        return this.T(s, arr_s, null, s1);
    }

    final boolean T(String s, String[] arr_s, String[] arr_s1, String s1) {
        if(s1 == null) {
            this.aJ().e.b("Name is required and can\'t be null. Type", s);
            return false;
        }
        String[] arr_s2 = crqx.b;
        for(int v = 0; v < 3; ++v) {
            if(s1.startsWith(arr_s2[v])) {
                this.aJ().e.c("Name starts with reserved prefix. Type, name", s, s1);
                return false;
            }
        }
        if(arr_s != null && crqx.P(s1, arr_s) && (arr_s1 == null || !crqx.P(s1, arr_s1))) {
            this.aJ().e.c("Name is reserved. Type, name", s, s1);
            return false;
        }
        return true;
    }

    final boolean U(String s, String s1, int v, Object object0) {
        if(object0 == null) {
            return true;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Float) && !(object0 instanceof Integer) && !(object0 instanceof Byte) && !(object0 instanceof Short) && !(object0 instanceof Boolean) && !(object0 instanceof Double)) {
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                return false;
            }
            String s2 = object0.toString();
            if(s2.codePointCount(0, s2.length()) > v) {
                this.aJ().h.d("Value is too long; discarded. Value kind, name, value length", s, s1, Integer.valueOf(s2.length()));
                return false;
            }
        }
        return true;
    }

    final boolean V(String s, String s1) {
        if(s1 == null) {
            this.aJ().e.b("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            this.aJ().e.b("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v) && v != 0x5F) {
            this.aJ().e.c("Name must start with a letter or _ (underscore). Type, name", s, s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.aJ().e.c("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    final boolean W(String s, String s1) {
        if(s1 == null) {
            this.aJ().e.b("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            this.aJ().e.b("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v)) {
            this.aJ().e.c("Name must start with a letter. Type, name", s, s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.aJ().e.c("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    final boolean X() {
        Integer integer0;
        boolean z;
        if(this.g == null) {
            ojj ojj0 = this.x();
            if(ojj0 == null) {
                return false;
            }
            gmcd gmcd0 = ojj0.b();
            try {
                z = true;
                integer0 = (Integer)gmcd0.get(10000L, TimeUnit.MILLISECONDS);
            }
            catch(CancellationException | ExecutionException | InterruptedException | TimeoutException exception0) {
                integer0 = null;
                this.aJ().f.b("Measurement manager api exception", exception0);
                this.g = Boolean.valueOf(false);
                this.aJ().k.b("Measurement manager api status result", integer0);
                return this.g.booleanValue();
            }
            if(integer0 == null || ((int)integer0) != 1) {
                z = false;
            }
            this.g = Boolean.valueOf(z);
            this.aJ().k.b("Measurement manager api status result", integer0);
        }
        return this.g.booleanValue();
    }

    final boolean Y(String s) {
        this.n();
        if(bbsr.b(this.aj()).a(s) == 0) {
            return true;
        }
        this.aJ().j.b("Permission not granted", s);
        return false;
    }

    final boolean Z(String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            return true;
        }
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        String s2 = this.am().p();
        if(this.al().a && s2.equals("com.google.android.gms")) {
            this.aJ().k.a("Debug mode not permitted on service");
            return false;
        }
        return s2.equals(s);
    }

    final int a(String s, String s1, String s2, Object object0, Bundle bundle0, List list0, boolean z, boolean z1) {
        int v1;
        int v;
        this.n();
        if(crqx.ai(object0)) {
            if(!z1) {
                return 21;
            }
            if(!crqx.P(s2, crmd.c)) {
                return 20;
            }
            croz croz0 = this.y.n();
            croz0.n();
            croz0.a();
            if(croz0.F() && croz0.aq().k() < 200900) {
                return 25;
            }
            if((object0 instanceof Parcelable[])) {
                v = ((Parcelable[])object0).length;
                goto label_15;
            }
            else if((object0 instanceof ArrayList)) {
                v = ((ArrayList)object0).size();
            label_15:
                if(v > 200) {
                    this.aJ().h.d("Parameter array is too long; discarded. Value kind, name, array length", "param", s2, Integer.valueOf(v));
                    v1 = 17;
                    if(!(object0 instanceof Parcelable[])) {
                        if((object0 instanceof ArrayList) && ((ArrayList)object0).size() > 200) {
                            bundle0.putParcelableArrayList(s2, new ArrayList(((ArrayList)object0).subList(0, 200)));
                        }
                    }
                    else if(((Parcelable[])object0).length > 200) {
                        bundle0.putParcelableArray(s2, ((Parcelable[])Arrays.copyOf(((Parcelable[])object0), 200)));
                    }
                }
                else {
                    v1 = 0;
                }
            }
            else {
                v1 = 0;
            }
        }
        else {
            v1 = 0;
        }
        if(!this.U("param", s2, (crqx.ac(s1) || crqx.ac(s2) ? this.am().c(null, false) : this.am().b(null, false)), object0)) {
            if(z1) {
                if((object0 instanceof Bundle)) {
                    this.M(s, s1, s2, ((Bundle)object0), list0, z);
                    return v1;
                }
                if((object0 instanceof Parcelable[])) {
                    for(int v2 = 0; v2 < ((Parcelable[])object0).length; ++v2) {
                        Parcelable parcelable0 = ((Parcelable[])object0)[v2];
                        if(!(parcelable0 instanceof Bundle)) {
                            this.aJ().h.c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable0.getClass(), s2);
                            return 4;
                        }
                        this.M(s, s1, s2, ((Bundle)parcelable0), list0, z);
                    }
                    return v1;
                }
                if((object0 instanceof ArrayList)) {
                    int v3 = ((ArrayList)object0).size();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        Object object1 = ((ArrayList)object0).get(v4);
                        if(!(object1 instanceof Bundle)) {
                            crjg crjg0 = this.aJ().h;
                            Class class0 = object1 == null ? "null" : object1.getClass();
                            crjg0.c("All ArrayList elements must be of type Bundle. Value type, name", class0, s2);
                            return 4;
                        }
                        this.M(s, s1, s2, ((Bundle)object1), list0, z);
                    }
                    return v1;
                }
            }
            return 4;
        }
        return v1;
    }

    @Override  // crlv
    protected final void aL() {
        this.n();
        SecureRandom secureRandom0 = new SecureRandom();
        long v = secureRandom0.nextLong();
        if(v == 0L) {
            v = secureRandom0.nextLong();
            if(v == 0L) {
                this.aJ().f.a("Utils falling back to Random for random id");
            }
        }
        this.d.set(v);
    }

    final boolean aa(Context context0, String s) {
        X500Principal x500Principal0 = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo0 = bbsr.b(context0).e(s, 0x40);
            if(packageInfo0 != null && packageInfo0.signatures != null && packageInfo0.signatures.length > 0) {
                Signature signature0 = packageInfo0.signatures[0];
                return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature0.toByteArray()))).getSubjectX500Principal().equals(x500Principal0);
            }
        }
        catch(CertificateException certificateException0) {
            this.aJ().c.b("Error obtaining certificate", certificateException0);
            return true;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.aJ().c.b("Package name not found", packageManager$NameNotFoundException0);
            return true;
        }
        return true;
    }

    final boolean ab() {
        this.n();
        return this.r() == 1L;
    }

    static boolean ac(String s) {
        return !TextUtils.isEmpty(s) && s.startsWith("_");
    }

    static boolean ad(String s) {
        batl.q(s);
        return s.charAt(0) != 0x5F || s.equals("_ep");
    }

    static boolean ae(Context context0) {
        batl.s(context0);
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ActivityInfo activityInfo0 = packageManager0.getReceiverInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if(activityInfo0 != null) {
                return activityInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    final boolean af(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            batl.s(s);
            return !s.equals(s1);
        }
        return false;
    }

    final byte[] ag(Parcelable parcelable0) {
        byte[] arr_b;
        if(parcelable0 == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcelable0.writeToParcel(parcel0, 0);
            arr_b = parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
        return arr_b;
    }

    final EventParcel ah(String s, String s1, Bundle bundle0, String s2, long v, boolean z) {
        if(TextUtils.isEmpty(s1)) {
            return null;
        }
        if(this.c(s1) == 0) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            bundle1.putString("_o", s2);
            Bundle bundle2 = this.w(s, s1, bundle1, Collections.singletonList("_o"), true);
            if(z) {
                bundle2 = this.aw(bundle2);
            }
            batl.s(bundle2);
            return new EventParcel(s1, new EventParams(bundle2), s2, v, 0L);
        }
        this.aJ().c.b("Invalid conditional property event name", this.ao().e(s1));
        throw new IllegalArgumentException();
    }

    static final boolean ai(Object object0) {
        return (object0 instanceof Parcelable[]) || (object0 instanceof ArrayList) || (object0 instanceof Bundle);
    }

    public final boolean at(int v) {
        Boolean boolean0 = this.y.n().c;
        return this.k() >= v / 1000 ? true : boolean0 != null && !boolean0.booleanValue();
    }

    static boolean au(Context context0) {
        batl.s(context0);
        return crqx.ax(context0);
    }

    public final void av(crqw crqw0, int v, String s, int v1) {
        this.K(crqw0, null, v, "_ev", s, v1);
    }

    final Bundle aw(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Object object1 = this.y(s, bundle0.get(s));
                if(object1 == null) {
                    this.aJ().h.b("Param value can\'t be null", this.ao().d(s));
                }
                else {
                    this.L(bundle1, s, object1);
                }
            }
        }
        return bundle1;
    }

    static boolean ax(Context context0) {
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementJobService"), 0);
            if(serviceInfo0 != null) {
                return serviceInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    private final int ay(String s) {
        if("_ldl".equals(s)) {
            return 0x800;
        }
        if("_id".equals(s)) {
            return 0x100;
        }
        return "_lgclid".equals(s) ? 100 : 36;
    }

    private final Object az(int v, Object object0, boolean z, boolean z1) {
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Double)) {
            if((object0 instanceof Integer)) {
                return (long)(((int)(((Integer)object0))));
            }
            if((object0 instanceof Byte)) {
                return (long)(((byte)(((Byte)object0))));
            }
            if((object0 instanceof Short)) {
                return (long)(((short)(((Short)object0))));
            }
            if((object0 instanceof Boolean)) {
                return ((Boolean)object0).booleanValue() ? ((long)1L) : ((long)0L);
            }
            if((object0 instanceof Float)) {
                return ((Float)object0).doubleValue();
            }
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                if(z1 && ((object0 instanceof Bundle[]) || (object0 instanceof Parcelable[]))) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v1 = 0; v1 < ((Parcelable[])object0).length; ++v1) {
                        Parcelable parcelable0 = ((Parcelable[])object0)[v1];
                        if((parcelable0 instanceof Bundle)) {
                            Bundle bundle0 = this.aw(((Bundle)parcelable0));
                            if(!bundle0.isEmpty()) {
                                arrayList0.add(bundle0);
                            }
                        }
                    }
                    return arrayList0.toArray(new Bundle[arrayList0.size()]);
                }
                return null;
            }
            return this.B(object0.toString(), v, z);
        }
        return object0;
    }

    public final int b(String s, Object object0) {
        return ("_ldl".equals(s) ? this.U("user property referrer", s, this.ay(s), object0) : this.U("user property", s, this.ay(s), object0)) ? 0 : 7;
    }

    final int c(String s) {
        if(!this.V("event", s)) {
            return 2;
        }
        if(!this.T("event", crmc.a, crmc.b, s)) {
            return 13;
        }
        return this.R("event", 40, s) ? 0 : 2;
    }

    final int d(String s) {
        if(!this.V("event param", s)) {
            return 3;
        }
        if(!this.S("event param", null, s)) {
            return 14;
        }
        return this.R("event param", 40, s) ? 0 : 3;
    }

    @Override  // crlv
    protected final boolean e() {
        return true;
    }

    final int g(String s) {
        if(!this.W("event param", s)) {
            return 3;
        }
        if(!this.S("event param", null, s)) {
            return 14;
        }
        return this.R("event param", 40, s) ? 0 : 3;
    }

    public final int i(String s) {
        if(!this.V("user property", s)) {
            return 6;
        }
        if(!this.S("user property", crme.a, s)) {
            return 15;
        }
        return this.R("user property", 24, s) ? 0 : 6;
    }

    final int j() {
        return SdkExtensions.getExtensionVersion(30) <= 3 ? 0 : SdkExtensions.getExtensionVersion(1000000);
    }

    public final int k() {
        if(this.h == null) {
            this.h = (int)(azqk.a(this.aj()) / 1000);
        }
        return (int)this.h;
    }

    final long r() {
        long v;
        this.n();
        this.m();
        if(!this.O(this.y.d().u())) {
            return 0L;
        }
        if(SdkExtensions.getExtensionVersion(30) < 4) {
            v = 8L;
        }
        else {
            v = this.j() >= ((int)(((Integer)crif.ae.a()))) ? 0L : 16L;
        }
        if(!this.Y("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            v |= 2L;
        }
        if(v == 0L && !this.X()) {
            v = 0x40L;
        }
        return v == 0L ? 1L : v;
    }

    static long s(byte[] arr_b) {
        batl.s(arr_b);
        int v = 0;
        batl.l(arr_b.length > 0);
        int v1 = arr_b.length - 1;
        long v2 = 0L;
        while(v1 >= 0 && v1 >= arr_b.length - 8) {
            v2 += (((long)arr_b[v1]) & 0xFFL) << v;
            v += 8;
            --v1;
        }
        return v2;
    }

    public final long t() {
        int v;
        AtomicLong atomicLong0 = this.d;
        if(atomicLong0.get() == 0L) {
            synchronized(atomicLong0) {
                v = this.e + 1;
                this.e = v;
            }
            return new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong() + ((long)v);
        }
        AtomicLong atomicLong1 = this.d;
        synchronized(atomicLong1) {
            atomicLong1.compareAndSet(-1L, 1L);
        }
        return atomicLong1.getAndIncrement();
    }

    public final long u(long v, long v1) {
        return (v + v1 * 60000L) / 86400000L;
    }

    final Bundle v(Uri uri0) {
        String s8;
        String s7;
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        if(uri0 != null) {
            try {
                if(uri0.isHierarchical()) {
                    s = uri0.getQueryParameter("utm_campaign");
                    s1 = uri0.getQueryParameter("utm_source");
                    s2 = uri0.getQueryParameter("utm_medium");
                    s3 = uri0.getQueryParameter("gclid");
                    s4 = uri0.getQueryParameter("gbraid");
                    s5 = uri0.getQueryParameter("utm_id");
                    s6 = uri0.getQueryParameter("dclid");
                    s7 = uri0.getQueryParameter("srsltid");
                    s8 = uri0.getQueryParameter("sfmc_id");
                }
                else {
                    s = null;
                    s1 = null;
                    s2 = null;
                    s3 = null;
                    s4 = null;
                    s5 = null;
                    s6 = null;
                    s7 = null;
                    s8 = null;
                }
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
                this.aJ().f.b("Install referrer url isn\'t a hierarchical URI", unsupportedOperationException0);
                return null;
            }
            if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3) && TextUtils.isEmpty(s4) && TextUtils.isEmpty(s5) && TextUtils.isEmpty(s6) && TextUtils.isEmpty(s7) && TextUtils.isEmpty(s8)) {
                return null;
            }
            Bundle bundle0 = new Bundle();
            if(!TextUtils.isEmpty(s)) {
                bundle0.putString("campaign", s);
            }
            if(!TextUtils.isEmpty(s1)) {
                bundle0.putString("source", s1);
            }
            if(!TextUtils.isEmpty(s2)) {
                bundle0.putString("medium", s2);
            }
            if(!TextUtils.isEmpty(s3)) {
                bundle0.putString("gclid", s3);
            }
            if(!TextUtils.isEmpty(s4)) {
                bundle0.putString("gbraid", s4);
            }
            String s9 = uri0.getQueryParameter("gad_source");
            if(!TextUtils.isEmpty(s9)) {
                bundle0.putString("gad_source", s9);
            }
            String s10 = uri0.getQueryParameter("utm_term");
            if(!TextUtils.isEmpty(s10)) {
                bundle0.putString("term", s10);
            }
            String s11 = uri0.getQueryParameter("utm_content");
            if(!TextUtils.isEmpty(s11)) {
                bundle0.putString("content", s11);
            }
            String s12 = uri0.getQueryParameter("aclid");
            if(!TextUtils.isEmpty(s12)) {
                bundle0.putString("aclid", s12);
            }
            String s13 = uri0.getQueryParameter("cp1");
            if(!TextUtils.isEmpty(s13)) {
                bundle0.putString("cp1", s13);
            }
            String s14 = uri0.getQueryParameter("anid");
            if(!TextUtils.isEmpty(s14)) {
                bundle0.putString("anid", s14);
            }
            if(!TextUtils.isEmpty(s5)) {
                bundle0.putString("campaign_id", s5);
            }
            if(!TextUtils.isEmpty(s6)) {
                bundle0.putString("dclid", s6);
            }
            String s15 = uri0.getQueryParameter("utm_source_platform");
            if(!TextUtils.isEmpty(s15)) {
                bundle0.putString("source_platform", s15);
            }
            String s16 = uri0.getQueryParameter("utm_creative_format");
            if(!TextUtils.isEmpty(s16)) {
                bundle0.putString("creative_format", s16);
            }
            String s17 = uri0.getQueryParameter("utm_marketing_tactic");
            if(!TextUtils.isEmpty(s17)) {
                bundle0.putString("marketing_tactic", s17);
            }
            if(!TextUtils.isEmpty(s7)) {
                bundle0.putString("srsltid", s7);
            }
            if(!TextUtils.isEmpty(s8)) {
                bundle0.putString("sfmc_id", s8);
            }
            for(Object object0: uri0.getQueryParameterNames()) {
                String s18 = (String)object0;
                if(s18.startsWith("gad_")) {
                    String s19 = uri0.getQueryParameter(s18);
                    if(!TextUtils.isEmpty(s19)) {
                        bundle0.putString(s18, s19);
                    }
                }
            }
            return bundle0;
        }
        return null;
    }

    final Bundle w(String s, String s1, Bundle bundle0, List list0, boolean z) {
        int v2;
        List list1 = list0;
        boolean z1 = crqx.P(s1, crmc.d);
        if(bundle0 != null) {
            Bundle bundle1 = new Bundle(bundle0);
            int v = this.am().aq().at(201500000) ? 100 : 25;
            int v1 = 0;
            boolean z2 = false;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s2 = (String)object0;
                if(list1 != null && list1.contains(s2)) {
                    v2 = 0;
                }
                else {
                    int v3 = z ? 0 : this.g(s2);
                    v2 = v3 == 0 ? this.d(s2) : v3;
                }
                switch(v2) {
                    case 0: {
                        int v4 = this.a(s, s1, s2, bundle0.get(s2), bundle1, list1, z, z1);
                        if(v4 == 17) {
                            this.G(bundle1, 17, s2, Boolean.valueOf(false));
                        }
                        else if(v4 != 0 && !"_ev".equals(s2)) {
                            this.G(bundle1, v4, (v4 == 21 ? s1 : s2), bundle0.get(s2));
                            bundle1.remove(s2);
                            break;
                        }
                        if(crqx.ad(s2)) {
                            ++v1;
                            if(v1 > v) {
                                if(!this.am().t(crif.aO) || !z2) {
                                    this.aJ().e.c(a.f(v, "Event can\'t contain more than ", " params"), this.ao().c(s1), this.ao().b(bundle0));
                                }
                                this.N(bundle1, 5);
                                bundle1.remove(s2);
                                list1 = list0;
                                z2 = true;
                                continue;
                            }
                        }
                        break;
                    }
                    case 3: {
                        this.G(bundle1, 3, s2, s2);
                        bundle1.remove(s2);
                        break;
                    }
                    default: {
                        this.G(bundle1, v2, s2, null);
                        bundle1.remove(s2);
                    }
                }
                list1 = list0;
            }
            return bundle1;
        }
        return null;
    }

    final ojj x() {
        Object object1;
        if(this.f == null) {
            Context context0 = this.aj();
            ibuq.f(context0, "context");
            ibuq.f(context0, "context");
            oiw.a();
            oji oji0 = null;
            if(oiw.a() >= 5) {
                ibuq.f(context0, "context");
                Object object0 = context0.getSystemService(MeasurementManager.class);
                ibuq.e(object0, "getSystemService(...)");
                object1 = new ojp(((MeasurementManager)object0));
            }
            else {
                object1 = oiw.b() < 9 ? null : oix.a(context0, new ojl(context0));
            }
            if(object1 != null) {
                oji0 = new oji(((ojm)object1));
            }
            this.f = oji0;
        }
        return this.f;
    }

    final Object y(String s, Object object0) {
        if("_ev".equals(s)) {
            return this.az(this.am().c(null, false), object0, true, true);
        }
        return crqx.ac(s) ? this.az(this.am().c(null, false), object0, false, true) : this.az(this.am().b(null, false), object0, false, true);
    }

    public final Object z(String s, Object object0) {
        return "_ldl".equals(s) ? this.az(this.ay(s), object0, true, false) : this.az(this.ay(s), object0, false, false);
    }
}

