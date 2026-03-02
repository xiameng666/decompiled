import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import j..util.Map.-EL;
import j..util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.TWR;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class fdqk implements fduj, fduo, fehg, ffmj {
    public static final AtomicReference a;
    public final Context b;
    public final PackageManager c;
    public final fdqj d;
    public final boolean e;
    public final ffei f;
    public final AtomicReference g;
    public final AtomicReference h;
    public final fdwp i;
    public final List j;
    public final fdye k;
    public final frli l;
    private static final Charset m;
    private static final Uri n;
    private final fdpl o;
    private final felo p;
    private final Object q;
    private Map r;
    private final Set s;

    static {
        fdqk.m = Charset.forName("UTF-8");
        fdqk.n = Uri.parse("wear:/capabilities/");
        fdqk.a = new AtomicReference();
    }

    public fdqk(Context context0, fdpl fdpl0, fdye fdye0, boolean z, ffei ffei0, felo felo0) {
        fdqj fdqj0 = new fdqj(context0);
        super();
        this.g = new AtomicReference();
        this.h = new AtomicReference();
        this.i = new fdwp(true);
        this.q = new Object();
        this.r = new HashMap();
        this.s = ggog.l();
        this.j = new CopyOnWriteArrayList();
        gftb.check(context0);
        this.b = context0;
        gftb.check(fdpl0);
        this.o = fdpl0;
        gftb.check(fdye0);
        this.k = fdye0;
        this.d = fdqj0;
        this.c = context0.getPackageManager();
        this.e = z;
        this.f = ffei0;
        this.p = felo0;
        frie frie0 = frif.a();
        frce frce0 = new frce(context0);
        frce0.d("wearable");
        frce0.e("capability_service.pb");
        frie0.f(frce0.a());
        frie0.e(((MessageLite)fesq.a));
        frif frif0 = frie0.a();
        this.l = cjtb.a.a(frif0);
    }

    static boolean A(String s) {
        return s != null && s.startsWith("/capabilities/");
    }

    public final boolean B() {
        return this.e || hzut.a.b().b();
    }

    public final boolean C(fdpl fdpl0, String s, String s1) {
        Uri uri0 = fdqk.g(fdpl0, s, s1).build();
        try {
            fdva fdva0 = (fdva)((fdvl)this.g.get()).j(this.o, uri0, false).u();
            gftb.check(fdva0);
            return fdva0.a > 0;
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            Log.w("CapabilityService", "removeCapability: the request was canceled");
            return false;
        }
        catch(ExecutionException executionException0) {
            Log.w("CapabilityService", "removeCapability: failed with unexpected exception, ", executionException0);
            return false;
        }
    }

    public final Map D(int v) {
        int v1;
        Map map0 = new HashMap();
        boolean z = hzya.e();
        try(Cursor cursor0 = this.H(this.k.a().a)) {
            cursor0.moveToFirst();
            while(true) {
                if(cursor0.isAfterLast()) {
                    break;
                }
                fduq fduq0 = fdur.f(cursor0);
                fdpl fdpl0 = fdqk.j(fduq0);
                v1 = z ? fdqk.S(fdqk.R(fduq0.b)) : 2;
                if(v1 == v) {
                    HashSet hashSet0 = ggog.h(new fdqh[]{new fdqh(fdqk.N(fduq0), fdpl0, fdqk.q(fduq0), fdqk.l(fduq0.b), v1)});
                    if(map0.containsKey(fdpl0)) {
                        hashSet0.addAll(((Collection)map0.get(fdpl0)));
                    }
                    map0.put(fdpl0, hashSet0);
                }
            }
        }
        return map0;
    }

    public final Set E(fdpl fdpl0, String s, int v) {
        int v1;
        Set set0 = new HashSet();
        boolean z = hzya.e();
        try(Cursor cursor0 = this.d(fdpl0, s)) {
            cursor0.moveToFirst();
            while(true) {
                if(cursor0.isAfterLast()) {
                    break;
                }
                fduq fduq0 = fdur.f(cursor0);
                String s1 = fdqk.q(fduq0);
                fdqi fdqi0 = fdqk.l(fduq0.b);
                v1 = z ? fdqk.S(fdqk.R(fduq0.b)) : 2;
                if(v1 == v || v == 1) {
                    set0.add(new fdqh(s, fdpl0, s1, fdqi0, v1));
                    s = s;
                    fdpl0 = fdpl0;
                }
            }
        }
        return set0;
    }

    public final void F() {
        HashSet hashSet0 = ggog.h(new File[]{(hrnt.i() ? new File(ccsb.a.a("/product/etc/static_wear_capabilities.xml")) : new File("/product/etc/static_wear_capabilities.xml")), (hrnt.i() ? new File(ccsb.a.a("/system/etc/static_wear_capabilities.xml")) : new File("/system/etc/static_wear_capabilities.xml")), (hrnt.i() ? new File(ccsb.a.a("/system_ext/etc/static_wear_capabilities.xml")) : new File("/system_ext/etc/static_wear_capabilities.xml")), (hrnt.i() ? new File(ccsb.a.a("/vendor/etc/static_wear_capabilities.xml")) : new File("/vendor/etc/static_wear_capabilities.xml"))});
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        new Thread(new fdqb(this, countDownLatch0, hashSet0, new CountDownLatch(1)), "CapabilityServiceInit").start();
        try {
            countDownLatch0.await();
        }
        catch(InterruptedException interruptedException0) {
            Log.e("CapabilityService", "Service interrupted waiting for initialization thread to start.", interruptedException0);
        }
    }

    static final ggeo G(Set set0) {
        XmlPullParser xmlPullParser0;
        HashMap hashMap0 = new HashMap();
        try {
            xmlPullParser0 = XmlPullParserFactory.newInstance().newPullParser();
        }
        catch(XmlPullParserException xmlPullParserException0) {
            Log.e("CapabilityService", "Error creating an XmlPullParser: ", xmlPullParserException0);
            return ggnf.a;
        }
        for(Object object0: set0) {
            fdqk.T(hashMap0, ((File)object0), xmlPullParser0);
        }
        return ggeo.k(hashMap0);
    }

    private final Cursor H(String s) {
        Uri.Builder uri$Builder0 = fdqk.n.buildUpon();
        uri$Builder0.authority(s);
        Uri uri0 = uri$Builder0.build();
        return ((fdvl)this.g.get()).d(this.o, uri0);
    }

    private final Cursor I(fdpl fdpl0, String s, String s1) {
        Uri uri0 = fdqk.g(fdpl0, s1, s).build();
        return ((fdvl)this.g.get()).c(this.o, uri0);
    }

    private final fdyo J(String s, boolean z, boolean z1) {
        fdyo fdyo0 = ((fdxu)this.h.get()).m(s);
        int v = 1;
        fdyo fdyo1 = fdyo0 == null ? new fdyo(new fdxn(s, s), true) : new fdyo(new fdxn(fdyo0.a.a, fdyo0.a.b), fdyo0.f);
        if(!this.s.contains(s)) {
            v = s.equals(this.k.a().a) ? 0 : 0x7FFFFFFF;
        }
        fdyo1.b = v;
        return fdqk.Q(fdyo1, s, z, z1);
    }

    private final fdyo K(String s, boolean z, boolean z1) {
        return fdqk.Q(((fdxu)this.h.get()).m(s), s, z, z1);
    }

    private final ggeo L() {
        if(!hzys.c()) {
            return ggnf.a;
        }
        return hzut.a.b().c() ? this.p.c() : this.p.d();
    }

    private final gmcd M(fdqh fdqh0) {
        Uri uri0 = fdqk.g(fdqh0.b, fdqh0.a, fdqh0.c).build();
        fdun fdun0 = new fdun(uri0.getHost(), uri0.getPath());
        if(fdqh0.e == 3) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fesn.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fesn)hftp0.b_message).c = 2;
            ((fesn)hftp0.b_message).b |= 1;
            byte[] arr_b = ((fesn)hftp0.N_build()).toBytesArray();
            fdun0.e = glwl.d(new byte[][]{fdqh0.d.c.getBytes(fdqk.m), arr_b});
            return ((fdvl)this.g.get()).o(this.o, fdun0);
        }
        fdun0.e = fdqh0.d.c.getBytes(fdqk.m);
        return ((fdvl)this.g.get()).o(this.o, fdun0);
    }

    private static String N(fduq fduq0) {
        return fduq0.b.c.getHost();
    }

    private static boolean O(fdpl fdpl0, String s, String s1, ggeo ggeo0) {
        ffbk ffbk0;
        if(!ggeo0.containsKey(s)) {
            return true;
        }
        for(Object object0: ((ffaz)ggeo0.get(s)).b) {
            ffbk0 = (ffbk)object0;
            if(!Objects.equals(ffbk0.c, fdpl0.b)) {
                continue;
            }
            goto label_9;
        }
        ffbk0 = null;
    label_9:
        if(ffbk0 == null) {
            ffmn.e("CapabilityService", "This package is not allowed to communicate on this restricted node. NodeId: %s, AppKey: %s", new Object[]{s, fdpl0});
            return false;
        }
        if((ffbk0.b & 4) != 0) {
            for(Object object1: (ffbk0.e == null ? feyb.a : ffbk0.e).b) {
                if(Objects.equals(((feya)object1).c, s1)) {
                    ffmn.e("CapabilityService", "This capability meets the restrictions to communicate on this restricted node. NodeId: %s, AppKey: %s, Capability: %s", new Object[]{s, fdpl0, s1});
                    return true;
                }
            }
            ffmn.e("CapabilityService", "This capability does not meet the restrictions to communicate on this restricted node. NodeId: %s, AppKey: %s, Capability: %s", new Object[]{s, fdpl0, s1});
            return false;
        }
        ffmn.e("CapabilityService", "Restrictions allow all capabilities on this restricted node. NodeId: %s, AppKey: %s, Capability: %s", new Object[]{s, fdpl0, s1});
        return true;
    }

    private final void P(Set set0, int v) {
        int v1;
        HashMap hashMap0 = new HashMap();
        boolean z = hzya.e();
        for(Object object0: set0) {
            try(Cursor cursor0 = this.H(((String)object0))) {
                cursor0.moveToFirst();
                while(true) {
                    if(cursor0.isAfterLast()) {
                        break;
                    }
                    fduq fduq0 = fdur.f(cursor0);
                    fdpl fdpl0 = fdqk.j(fduq0);
                    String s = fdqk.q(fduq0);
                    v1 = z ? fdqk.S(fdqk.R(fduq0.b)) : 2;
                    if(v1 == v) {
                        Set set1 = (Set)hashMap0.get(fdpl0);
                        if(set1 == null) {
                            set1 = new HashSet();
                            hashMap0.put(fdpl0, set1);
                        }
                        set1.add(s);
                    }
                }
            }
        }
        for(Object object1: hashMap0.entrySet()) {
            fdpl fdpl1 = (fdpl)((Map.Entry)object1).getKey();
            for(Object object2: ((Set)((Map.Entry)object1).getValue())) {
                this.y(fdpl1, ((String)object2));
            }
        }
    }

    private static final fdyo Q(fdyo fdyo0, String s, boolean z, boolean z1) {
        if(fdyo0 == null) {
            if(z1) {
                return null;
            }
            fdyo fdyo1 = new fdyo(new fdxn(s, s), false);
            fdyo1.b = 0x7FFFFFFF;
            return fdyo1;
        }
        return (!z || fdyo0.b != 0) && (!z1 || fdyo0.b != 0x7FFFFFFF) ? fdyo0 : null;
    }

    private static final fesn R(fdun fdun0) {
        byte[] arr_b = fdun0.e;
        if(arr_b != null && hzya.e() && (fdun0.e != null && fdun0.e.length > 1)) {
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, 1, arr_b.length);
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fesn.a), arr_b1, 0, arr_b1.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                return (fesn)hftv0;
            }
            catch(hfur hfur0) {
                Log.e("CapabilityService", "Unable to parse capability data bytes", hfur0);
            }
        }
        return null;
    }

    private static final int S(fesn fesn0) {
        if(fesn0 != null) {
            switch(fesm.a(fesn0.c)) {
                case 3: {
                    break;
                }
                case 4: {
                    return 3;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }

    private static final void T(Map map0, File file0, XmlPullParser xmlPullParser0) {
        if(Log.isLoggable("CapabilityService", 3)) {
            Log.d("CapabilityService", "Loading static wear capabilities from capability config file: " + file0.getPath());
        }
        try(BufferedReader bufferedReader0 = new BufferedReader(new FileReader(file0))) {
            xmlPullParser0.setInput(bufferedReader0);
            int v = xmlPullParser0.getEventType();
            String s = null;
            while(true) {
                switch(v) {
                    case 1: {
                        return;
                    }
                    case 2: {
                        if(xmlPullParser0.getName().equals("package")) {
                            s = xmlPullParser0.getAttributeValue(null, "name");
                            if(!map0.containsKey(s)) {
                                map0.put(s, new HashSet());
                            }
                        }
                        else if(xmlPullParser0.getName().equals("capability")) {
                            String s1 = xmlPullParser0.getAttributeValue(null, "name");
                            if(s != null && map0.containsKey(s)) {
                                ((Set)map0.get(s)).add(s1);
                            }
                        }
                        break;
                    }
                }
                v = xmlPullParser0.next();
            }
        }
        catch(FileNotFoundException fileNotFoundException0) {
            Log.e("CapabilityService", "Static capabilities config file not found: ", fileNotFoundException0);
        }
        catch(IOException | XmlPullParserException exception0) {
            Log.e("CapabilityService", "Error parsing the XML file: ", exception0);
        }
    }

    private static final void U(Map map0, Map map1, Set set0) {
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            fdyo fdyo0 = (fdyo)map1.get(map$Entry0.getKey());
            if(fdyo0 == null) {
                set0.add(((String)map$Entry0.getKey()));
            }
            else {
                fdyo fdyo1 = (fdyo)map$Entry0.getValue();
                if(!fdyo1.equals(fdyo0) || fdyo1.b != fdyo0.b) {
                    set0.add(((String)map$Entry0.getKey()));
                }
            }
        }
    }

    public final int a(fdqh fdqh0) {
        int v;
        try(fdwo fdwo0 = this.i.a(fdqh0.b.b)) {
            String s = this.k.a().a;
            try(Cursor cursor0 = this.I(fdqh0.b, fdqh0.c, s)) {
                if(cursor0.moveToFirst() && (fdqk.l(fdur.f(cursor0).b) == fdqi.a || fdqh0.d == fdqi.b)) {
                    return 4006;
                }
                try {
                    v = 8;
                    if(this.M(fdqh0).get() != null) {
                        return 0;
                    }
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    Log.w("CapabilityService", "setCapability: the request was canceled");
                }
                catch(ExecutionException executionException0) {
                    Log.w("CapabilityService", "setCapability: failed with unexpected exception, ", executionException0);
                }
            }
        }
        return v;
    }

    public final int b(fdpl fdpl0, fdqi fdqi0, String s) {
        return this.a(new fdqh(this.k.a().a, fdpl0, s, fdqi0, 2));
    }

    public final int c(fdpl fdpl0, fdqi fdqi0, String s) {
        try(fdwo fdwo0 = this.i.a(fdpl0.b)) {
            fdye fdye0 = this.k;
            try(Cursor cursor0 = this.I(fdpl0, s, fdye0.a().a)) {
                if(!cursor0.moveToFirst() || fdqk.l(fdur.f(cursor0).b) != fdqi0) {
                    return 4007;
                }
                return this.C(fdpl0, fdye0.a().a, s) ? 0 : 8;
            }
        }
    }

    public final Cursor d(fdpl fdpl0, String s) {
        Uri uri0 = fdqk.f(fdpl0, s).build();
        return ((fdvl)this.g.get()).d(this.o, uri0);
    }

    static Uri.Builder f(fdpl fdpl0, String s) {
        Uri.Builder uri$Builder0 = fdqk.h(fdpl0.b, s);
        uri$Builder0.appendPath(fdpl0.d);
        return uri$Builder0;
    }

    static Uri.Builder g(fdpl fdpl0, String s, String s1) {
        Uri.Builder uri$Builder0 = fdqk.f(fdpl0, s);
        uri$Builder0.appendPath(Uri.encode(s1));
        return uri$Builder0;
    }

    static Uri.Builder h(String s, String s1) {
        Uri.Builder uri$Builder0 = fdqk.n.buildUpon();
        if(s1 != null) {
            uri$Builder0.authority(s1);
        }
        uri$Builder0.appendPath(s);
        return uri$Builder0;
    }

    static fdpl i(Uri uri0) {
        List list0 = uri0.getPathSegments();
        return fdpl.a(((String)list0.get(1)), ((String)list0.get(2)));
    }

    static fdpl j(fduq fduq0) {
        return fdqk.i(fduq0.b.c);
    }

    public final fdpl k(String s) {
        try {
            return fdpn.a(this.b, s);
        }
        catch(IllegalArgumentException unused_ex) {
            Log.e("CapabilityService", dlbc.c(s, "Could not generate AppKey for package \"", "\""));
            return null;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.e("CapabilityService", dlbc.c(s, "Could not find package \"", "\""));
            return null;
        }
    }

    public static fdqi l(fdun fdun0) {
        byte[] arr_b = fdun0.e;
        if(arr_b != null && arr_b.length != 0) {
            String s = new String(arr_b, 0, 1, fdqk.m);
            fdqi fdqi0 = fdqi.a;
            if(fdqi0.c.equals(s)) {
                return fdqi0;
            }
            fdqi fdqi1 = fdqi.b;
            if(fdqi1.c.equals(s)) {
                return fdqi1;
            }
            Log.w("CapabilityService", String.format("Unknown capability type \"%s\". Defaulting to dynamic.", s));
            return fdqi1;
        }
        return fdqi.b;
    }

    public static fdqk m() {
        return (fdqk)fdqk.a.get();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        String s6;
        String s4;
        Iterator iterator2;
        int v;
        TreeMap treeMap0;
        bbpd0.b();
        bbpd0.println("Capabilities:");
        bbpd0.b();
        if(this.B()) {
            try {
                fesq fesq0 = (fesq)this.l.a().get();
                bbpd0.println("Initialization state: " + ((fesp.a(fesq0.c) == 0 ? 1 : fesp.a(fesq0.c)) - 1));
                bbpd0.println("Build fingerprint: " + fesq0.d);
            }
            catch(ExecutionException | InterruptedException unused_ex) {
                bbpd0.println("Failed to retrieve capability service initialization status");
            }
        }
        treeMap0 = new TreeMap();
        fdqc fdqc0 = new fdqc();
        fdqd fdqd0 = new fdqd();
        try(Cursor cursor0 = ((fdvl)this.g.get()).d(this.o, fdqk.n)) {
            cursor0.moveToFirst();
            while(true) {
                if(cursor0.isAfterLast()) {
                    break;
                }
                fduq fduq0 = fdur.f(cursor0);
                String s = fdqk.N(fduq0);
                fdyo fdyo0 = this.K(s, false, false);
                String s1 = fdqk.q(fduq0);
                fdqi fdqi0 = fdqk.l(fduq0.b);
                fdpl fdpl0 = fdqk.j(fduq0);
                v = hzya.e() ? fdqk.S(fdqk.R(fduq0.b)) : 2;
                fdqh fdqh0 = new fdqh(s, fdpl0, s1, fdqi0, v);
                ((SortedMap)Map.-EL.computeIfAbsent(((SortedMap)Map.-EL.computeIfAbsent(treeMap0, fdpl0, new fdqe(fdqc0))), fdyo0, new fdqf(fdqd0))).put(s1, fdqh0);
            }
        }
        boolean z2 = hzys.a.b().c();
        ggeo ggeo0 = z2 ? this.L() : ggnf.a;
        Iterator iterator0 = treeMap0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            fdpl fdpl1 = (fdpl)((Map.Entry)object0).getKey();
            bbpd0.format("App <%1$s, %2$s>:\n", new Object[]{ffmr.a(fdpl1.b), fdpl1.d});
            bbpd0.b();
            for(Object object1: ((SortedMap)((Map.Entry)object0).getValue()).entrySet()) {
                fdyo fdyo1 = (fdyo)((Map.Entry)object1).getKey();
                String s2 = fdxu.w(this.e, z1, fdyo1) ? String.format("\"%s\" ", fdyo1.a.b) : "";
                String s3 = fdyo1.a.a;
                int v1 = fdyo1.b;
                if(v1 == 0) {
                    iterator2 = iterator0;
                    s4 = "local";
                }
                else if(v1 == 0x7FFFFFFF) {
                    iterator2 = iterator0;
                    s4 = "unreachable";
                }
                else {
                    iterator2 = iterator0;
                    s4 = String.format(Locale.US, "%d hops", ((int)fdyo1.b));
                }
                bbpd0.format("Node %1$s %2$s(%3$s, isWatch: %4$b):\n", new Object[]{s3, s2, s4, Boolean.valueOf(fdyo1.f)});
                bbpd0.b();
                for(Object object2: ((SortedMap)((Map.Entry)object1).getValue()).entrySet()) {
                    fdqh fdqh1 = (fdqh)((Map.Entry)object2).getValue();
                    String s5 = !z2 || fdqk.O(fdpl1, s3, ((String)((Map.Entry)object2).getKey()), ggeo0) ? fdqh1.d.d : fdqh1.d.e;
                    if(hzya.e() && fdqh1.e == 3) {
                        int v2 = this.J(s3, false, false).b;
                        if(v2 == 0) {
                            s6 = "local";
                        }
                        else {
                            s6 = v2 == 0x7FFFFFFF ? "unreachable" : "reachable";
                        }
                        bbpd0.format("%1$s %2$s (%3$s)\n", new Object[]{s5, fdqh1.c, s6});
                    }
                    else {
                        bbpd0.format("%1$s %2$s\n", new Object[]{s5, fdqh1.c});
                    }
                }
                bbpd0.a();
                iterator0 = iterator2;
            }
            bbpd0.a();
        }
        bbpd0.a();
        bbpd0.a();
    }

    static String n(Uri uri0) {
        return Uri.decode(uri0.getLastPathSegment());
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            String s = fdqk.N(fduq0);
            if(!this.k.a().a.equals(s)) {
                if(fdqk.A(fduq0.b.b)) {
                    if(fduq0.c || ((fdxu)this.h.get()).k(s)) {
                        String s1 = fdqk.q(fduq0);
                        fdpl fdpl0 = fdqk.j(fduq0);
                        ggeo ggeo0 = this.L();
                        if(fdqk.O(fdpl0, s, s1, ggeo0)) {
                            this.y(fdpl0, s1);
                        }
                        else if(Log.isLoggable("CapabilityService", 3)) {
                            Log.d("CapabilityService", String.format("Notification not sent since the capability does not comply with filters of the restricted node: (%s, %s, %s, %s)", fdpl0, s1, s, ffcz.b(((ffaz)ggeo0.get(s)))));
                        }
                    }
                    else if(Log.isLoggable("CapabilityService", 3)) {
                        Log.d("CapabilityService", a.a(s, "onDataItemChanged - node not connected (", "), skipping"));
                    }
                }
                else if(Log.isLoggable("CapabilityService", 3)) {
                    Log.d("CapabilityService", "onDataItemChanged - not capability, skipping");
                }
            }
            else if(Log.isLoggable("CapabilityService", 3)) {
                Log.d("CapabilityService", "onDataItemChanged - local node, skipping");
            }
        }
    }

    @Override  // fduj
    public final void p(Collection collection0) {
        Set set0;
        HashMap hashMap0 = new HashMap();
        for(Object object0: collection0) {
            hashMap0.put(((fdyo)object0).a.a, ((fdyo)object0));
        }
        ffmn.e("CapabilityService", "handlePeerConnectionChange(...)", new Object[0]);
        synchronized(this.q) {
            Map map0 = this.r;
            if(map0.isEmpty()) {
                set0 = hashMap0.keySet();
            }
            else if(hashMap0.isEmpty()) {
                set0 = map0.keySet();
            }
            else {
                HashSet hashSet0 = new HashSet();
                fdqk.U(map0, hashMap0, hashSet0);
                fdqk.U(hashMap0, map0, hashSet0);
                set0 = hashSet0;
            }
            this.r = hashMap0;
        }
        if(set0.isEmpty()) {
            return;
        }
        this.P(set0, 2);
    }

    public static String q(fduq fduq0) {
        return fdqk.n(fduq0.b.c);
    }

    @Override  // fduj
    public final void r(fdxn fdxn0, int v, boolean z) {
    }

    @Override  // fduj
    public final void s(fdxn fdxn0) {
    }

    final List t(fdpl fdpl0, Map map0, gfsx gfsx0) {
        Set set0;
        gged_interceptors gged0;
        List list0 = new ArrayList();
        try(fdwo fdwo0 = this.i.a(fdpl0.b)) {
            HashSet hashSet0 = new HashSet();
            ffei ffei0 = this.f;
            String s = fdpl0.c;
            if(ffei0.j(s)) {
                if(ffei0.b) {
                    ggdy ggdy0 = new ggdy();
                    ggdy0.k(ffei0.c);
                    ggdy0.k(ffei0.d);
                    gged0 = ggdy0.h();
                }
                else {
                    gged0 = null;
                }
                if(gged0 == null) {
                    hashSet0.addAll(this.d.a(s, gfsx0));
                }
                else {
                    ggqk ggqk0 = gged0.E();
                    while(true) {
                        if(!ggqk0.hasNext()) {
                            break;
                        }
                        Object object0 = ggqk0.next();
                        hashSet0.addAll(this.d.a(((String)object0), gfsx0));
                    }
                    fdpl0 = ffei0.b(fdpl0);
                }
            }
            else {
                hashSet0.addAll(this.d.a(s, gfsx0));
            }
            if(map0 == null) {
                set0 = this.E(fdpl0, this.k.a().a, 2);
            }
            else {
                set0 = (Set)map0.get(fdpl0);
                if(set0 == null) {
                    set0 = new HashSet();
                }
            }
            HashSet hashSet1 = new HashSet(hashSet0);
            HashSet hashSet2 = new HashSet();
            Iterator iterator0 = set0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                fdqh fdqh0 = (fdqh)object1;
                if(fdqh0.d == fdqi.a) {
                    String s1 = fdqh0.c;
                    if(hashSet0.contains(s1)) {
                        hashSet1.remove(s1);
                    }
                    else {
                        hashSet2.add(s1);
                    }
                }
            }
            if(!hashSet0.isEmpty() || !hashSet1.isEmpty() || !hashSet2.isEmpty()) {
                ffmn.a("CapabilityService", "handleAppAddedOrChanged(%s): %d static capabilities; removing %s, adding %s", new Object[]{fdpl0, hashSet0.size(), hashSet2, hashSet1});
                String s2 = this.k.a().a;
                Iterator iterator1 = hashSet2.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object2 = iterator1.next();
                    this.C(fdpl0, s2, ((String)object2));
                }
                Iterator iterator2 = hashSet1.iterator();
                while(true) {
                    if(!iterator2.hasNext()) {
                        break;
                    }
                    Object object3 = iterator2.next();
                    list0.add(glzd.f(this.M(new fdqh(s2, fdpl0, ((String)object3), fdqi.a, 2)), new fdqg(((String)object3)), gmap.a));
                }
            }
        }
        return list0;
    }

    public final Map u(fdpl fdpl0, String s, int v) {
        fdyo fdyo0;
        Map map0 = new HashMap();
        Cursor cursor0 = s == null ? this.d(fdpl0, null) : this.I(fdpl0, s, null);
        ggeo ggeo0 = this.L();
        try {
            cursor0.moveToFirst();
            while(!cursor0.isAfterLast()) {
                fduq fduq0 = fdur.f(cursor0);
                String s1 = fdqk.N(fduq0);
                String s2 = fdqk.N(fduq0);
                if(hzya.e()) {
                    fesn fesn0 = fdqk.R(fduq0.b);
                    if(fesn0 != null && fesm.a(fesn0.c) == 4) {
                        fdyo0 = this.J(s2, true, v == 1);
                        goto label_20;
                    }
                    else if(fesn0 != null) {
                        switch(fesm.a(fesn0.c)) {
                            case 0: {
                                fdyo0 = fdqk.Q(null, s2, true, v == 1);
                                goto label_20;
                            }
                            case 3: {
                                break;
                            }
                            default: {
                                fdyo0 = fdqk.Q(null, s2, true, v == 1);
                                goto label_20;
                            }
                        }
                    }
                }
                fdyo0 = this.K(s2, true, v == 1);
            label_20:
                if(fdyo0 == null) {
                }
                else if(ffgp.h().c(fdpl0, s1)) {
                    String s3 = fdqk.q(fduq0);
                    if(fdqk.O(fdpl0, s1, s3, ggeo0)) {
                        Set set0 = (Set)map0.get(s3);
                        if(set0 == null) {
                            set0 = new HashSet();
                            map0.put(s3, set0);
                        }
                        set0.add(fdyo0);
                    }
                }
                else {
                    if(!Log.isLoggable("CapabilityService", 3)) {
                        continue;
                    }
                    Log.d("CapabilityService", "Not reporting capability " + s + " for node " + s1 + " and appKey " + fdpl0 + " as the node is migrating");
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }

    public final Set v(fdpl fdpl0, String s, int v) {
        Set set0 = (Set)this.u(fdpl0, s, v).get(s);
        return set0 == null ? new HashSet() : set0;
    }

    public final void w(fdpl fdpl0) {
        try {
            ((glyq)gmbu.e(this.t(fdpl0, null, gfqx.a))).u();
        }
        catch(ExecutionException | InterruptedException exception0) {
            Log.w("CapabilityService", "handleAppAddedOrChangedAsync: failed with unexpected exception, ", exception0);
        }
    }

    public final void x(String s) {
        if(this.f.j(s)) {
            ffmn.e("CapabilityService", "handlePackageRemoved(%s) with home app package name, skipping...", new Object[]{ffmr.a(s)});
            return;
        }
        ffmn.e("CapabilityService", "handlePackageRemoved(%s)", new Object[]{ffmr.a(s)});
        if(TextUtils.isEmpty(s)) {
            if(Log.isLoggable("CapabilityService", 5)) {
                Log.w("CapabilityService", "handlePackageRemoved with empty package name");
            }
            return;
        }
        try(fdwo fdwo0 = this.i.a(s)) {
            Uri uri0 = fdqk.h(s, this.k.a().a).build();
            try {
                gftb.check(((fdva)((fdvl)this.g.get()).j(this.o, uri0, true).u()));
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                Log.w("CapabilityService", "removePackageCapabilitiesForNode: the request was canceled");
            }
            catch(ExecutionException executionException0) {
                Log.w("CapabilityService", "removePackageCapabilitiesForNode: failed with unexpected exception, ", executionException0);
            }
        }
    }

    public final void y(fdpl fdpl0, String s) {
        Set set0 = this.v(fdpl0, s, 1);
        if(Log.isLoggable("CapabilityService", 2)) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: set0) {
                arrayList0.add("[" + ((fdyo)object0).a.b + ", " + ((fdyo)object0).a.a + "]");
            }
            Collections.sort(arrayList0);
            Log.v("CapabilityService", String.format("notifyConnectedCapabilityChanged: (%s, %s, %s)", fdpl0, s, arrayList0));
        }
        fduh fduh0 = new fduh(s, set0);
        for(Object object1: this.j) {
            ffgm ffgm0 = ((fffy)object1).a;
            String s1 = fduh0.b;
            fdpl fdpl1 = ffgm0.F.a(fdpl0, s1);
            if(Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", a.X(fdpl1, s1, "onConnectedCapabilityChanged: ", ", "));
            }
            ffgm0.j(fdpl1, new fffx(((fffy)object1), new Intent("com.google.android.gms.wearable.CAPABILITY_CHANGED", fdzj.b("", s1)).setPackage(fdpl1.c), ffel.a(s1, fduh0.a), fduh0));
        }
    }

    @Override  // fehg
    public final void z(String s, fehf fehf0) {
        if(!hzya.e()) {
            ffmn.f("CapabilityService", "OffloadFeature disabled skipping: nodeId[%s] connectionEvent[%s]", new Object[]{s, fehf0});
            return;
        }
        if(fehf0 == fehf.c) {
            ffmn.d("CapabilityService", "processing connection event: nodeId[%s] connectionEvent[%s]", new Object[]{s, fehf0});
            this.s.add(s);
            this.P(new ggoh(s), 3);
            return;
        }
        if(fehf0 == fehf.d) {
            ffmn.d("CapabilityService", "processing connection event: nodeId[%s] connectionEvent[%s]", new Object[]{s, fehf0});
            this.s.remove(s);
            this.P(new ggoh(s), 3);
            return;
        }
        ffmn.a("CapabilityService", "skipping connection event: nodeId[%s] connectionEvent[%s]", new Object[]{s, fehf0});
    }
}

