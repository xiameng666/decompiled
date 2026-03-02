import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine.Builder.LibraryLoader;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;

public abstract class ifxv extends ICronetEngineBuilder {
    static final int a;
    protected final ifye b;
    public final Context c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ifxs j;
    public String k;
    public boolean l;
    private static final Pattern m;
    private final List n;
    private final List o;
    private final ifyb p;

    static {
        ifxv.m = Pattern.compile("^[0-9\\.]*$");
        ifxv.a = igap.a();
    }

    public ifxv(Context context0, ifyb ifyb0) {
        this.n = new LinkedList();
        this.o = new LinkedList();
        long v = SystemClock.uptimeMillis();
        Context context1 = context0.getApplicationContext();
        this.c = context1;
        this.p = ifyb0;
        this.b = ifyf.a(context1, ifyb0);
        try {
            this.g = true;
            this.h = true;
            this.i = false;
            this.a(0);
            this.l = false;
            this.d = true;
        }
        catch(Throwable throwable0) {
            this.f(v, false);
            throw throwable0;
        }
        this.f(v, true);
    }

    public final void a(int v) {
        ifxs ifxs0;
        switch(v) {
            case 0: {
                ifxs0 = ifxs.a;
                break;
            }
            case 1: {
                ifxs0 = ifxs.d;
                break;
            }
            case 2: {
                ifxs0 = ifxs.c;
                break;
            }
            case 3: {
                ifxs0 = ifxs.b;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
        }
        if(ifxs0.e == 1 && this.f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.j = ifxs0;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder addPublicKeyPins(String s, Set set0, boolean z, Date date0) {
        this.c(s, set0, date0);
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder addQuicHint(String s, int v, int v1) {
        this.d(s);
        return this;
    }

    public final void b(String s) {
        if(!new File(s).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f = s;
    }

    public final void c(String s, Set set0, Date date0) {
        Objects.requireNonNull(s, "The hostname cannot be null.");
        Objects.requireNonNull(set0, "The set of SHA256 pins cannot be null.");
        Objects.requireNonNull(date0, "The pin expiration date cannot be null.");
        if(ifxv.m.matcher(s).matches()) {
            throw new IllegalArgumentException(a.a(s, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if(s.length() > 0xFF) {
            throw new IllegalArgumentException(a.a(s, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            IDN.toASCII(s, 2);
        }
        catch(IllegalArgumentException unused_ex) {
            throw new IllegalArgumentException(a.a(s, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: set0) {
            if(((byte[])object0) == null || ((byte[])object0).length != 0x20) {
                throw new IllegalArgumentException("Public key pin is invalid");
            }
            hashMap0.put(Base64.encodeToString(((byte[])object0), 0), ((byte[])object0));
            continue;
        }
        byte[][] arr2_b = (byte[][])hashMap0.values().toArray(new byte[hashMap0.size()][]);
        ifxt ifxt0 = new ifxt();
        this.o.add(ifxt0);
    }

    public final void d(String s) {
        if(s.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: " + s);
        }
        ifxu ifxu0 = new ifxu();
        this.n.add(ifxu0);
    }

    public static final void e(ProxyOptions proxyOptions0) {
        if(proxyOptions0 != null) {
            if(igap.a() < 38) {
                throw new AssertionError(String.format("This should have not been created: the Cronet API being used has an ApiLevel of %s, but setProxyOptions was added in ApiLevel %s", igap.a(), ((int)38)));
            }
            if(((ProxyOptions)Objects.requireNonNull(proxyOptions0)).getProxyList().isEmpty()) {
                throw new AssertionError("The list of proxies should never be empty, this is checked in the API layer");
            }
        }
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableHttpCache(int v, long v1) {
        this.a(v);
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    private final void f(long v, boolean z) {
        if(ifxv.a >= 30) {
            return;
        }
        ifya ifya0 = new ifya();
        ifya0.d = Boolean.valueOf(false);
        try {
            ifya0.h = 2;
            ifya0.g = Process.myUid();
            ifya0.f = new ifyd("140.0.7289.0");
            ifya0.c = this.p;
            ifya0.e = new ifyd("140.0.7289.0");
            ifya0.a = this.getLogCronetInitializationRef();
            ifya0.d = Boolean.valueOf(z);
        }
        finally {
            ifya0.b = (int)(SystemClock.uptimeMillis() - v);
            this.b.b(ifya0);
        }
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        int v1;
        StringBuilder stringBuilder0 = new StringBuilder();
        Context context0 = this.c;
        stringBuilder0.append("com.google.android.gms");
        stringBuilder0.append('/');
        synchronized(igao.a) {
            v1 = igao.b;
            if(v1 == 0) {
                PackageManager packageManager0 = context0.getPackageManager();
                try {
                    v1 = packageManager0.getPackageInfo("com.google.android.gms", 0).versionCode;
                    igao.b = v1;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
        }
        stringBuilder0.append(v1);
        stringBuilder0.append(" (Linux; U; Android ");
        stringBuilder0.append(Build.VERSION.RELEASE);
        stringBuilder0.append("; ");
        stringBuilder0.append(Locale.getDefault().toString());
        String s = Build.MODEL;
        if(s.length() > 0) {
            stringBuilder0.append("; ");
            stringBuilder0.append(s);
        }
        String s1 = Build.ID;
        if(s1.length() > 0) {
            stringBuilder0.append("; Build/");
            stringBuilder0.append(s1);
        }
        stringBuilder0.append("; Cronet/");
        stringBuilder0.append("140.0.7289.0");
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet0 = new HashSet();
        hashSet0.add(Integer.valueOf(4));
        return DesugarCollections.unmodifiableSet(hashSet0);
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setExperimentalOptions(String s) {
        this.k = s;
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader cronetEngine$Builder$LibraryLoader0) {
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setProxyOptions(ProxyOptions proxyOptions0) {
        ifxv.e(proxyOptions0);
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setStoragePath(String s) {
        this.b(s);
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setThreadPriority(int v) {
        return this;
    }

    @Override  // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setUserAgent(String s) {
        this.e = s;
        return this;
    }
}

