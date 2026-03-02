import android.accounts.Account;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public final class bwuv {
    public static String a(String s) {
        Pair pair0;
        String[] arr_s = s.split("/");
        if(arr_s.length < 3) {
            pair0 = null;
        }
        else {
            String s1 = Uri.decode(arr_s[arr_s.length - 2]);
            String s2 = Uri.decode(arr_s[arr_s.length - 1]);
            ArrayList arrayList0 = new ArrayList(arr_s.length - 2);
            for(int v1 = 0; v1 < arr_s.length - 2; ++v1) {
                String s3 = arr_s[v1];
                if(s3 != null) {
                    arrayList0.add(s3);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            Iterator iterator0 = arrayList0.iterator();
            if(iterator0.hasNext()) {
                while(true) {
                    Object object0 = iterator0.next();
                    stringBuilder0.append(((CharSequence)object0));
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    stringBuilder0.append("/");
                }
            }
            pair0 = new Pair(stringBuilder0.toString(), new Account(s2, s1));
        }
        if(pair0 == null) {
            return s;
        }
        String s4 = "X";
        String s5 = (String)pair0.first;
        String s6 = Uri.encode(((Account)pair0.second).type);
        int v2 = ((Account)pair0.second).name.length();
        if(v2 < 0) {
            throw new IllegalArgumentException("count is negative: " + v2);
        }
        switch(v2) {
            case 0: {
                s4 = "";
                break;
            }
            case 1: {
                break;
            }
            default: {
                StringBuilder stringBuilder1 = new StringBuilder(v2);
                for(int v = 0; v < v2; ++v) {
                    stringBuilder1.append("X");
                }
                return a.au(stringBuilder1.toString(), s6, s5, "/", "/");
            }
        }
        return a.au(s4, s6, s5, "/", "/");
    }

    public static final void b(PackageInfo packageInfo0, boolean z, bwuc bwuc0, Account[] arr_account, boolean z1, bwmj bwmj0) {
        RegisterCorpusInfo registerCorpusInfo3;
        Iterator iterator2;
        bwtv[] arr_bwtv;
        boolean z4;
        boolean z2 = packageInfo0.applicationInfo.metaData != null && packageInfo0.applicationInfo.metaData.containsKey("com.google.android.gms.appdatasearch") || "com.google.android.gms".equals(packageInfo0.packageName);
        bwua bwua0 = bwuc0.f(packageInfo0.packageName);
        boolean z3 = bwua0 != null && !bwua0.y();
        if(((Boolean)bwvu.e.b()).booleanValue()) {
            String s = packageInfo0.packageName;
            z4 = !bbmt.e(huar.a.d().C().split(","), s);
        }
        else {
            z4 = false;
        }
        if(z2 && !z3 && !z4) {
            bwua bwua1 = bwuc0.e(packageInfo0.packageName);
            if(!z && !bwua1.z() && !bwua1.b.equals("com.google.android.gms") && (!z1 || !bwua1.t())) {
                bwne.p("updateResources: up to date:%s", bwua1);
                return;
            }
            bwne.l("updateResources: need to parse %s", bwua1);
            bwtz bwtz0 = bwuv.e(packageInfo0.applicationInfo, bwuc0);
            if(bwtz0 != null) {
                try {
                    bwua1.o(null);
                    String s1 = bwua1.b;
                    bwtw bwtw0 = bwtz0.a(s1);
                    int v = 0;
                    while(true) {
                        arr_bwtv = bwtw0.a;
                        if(v >= arr_bwtv.length) {
                            goto label_47;
                        }
                        if(arr_bwtv[v].b) {
                            break;
                        }
                        ++v;
                    }
                    bxax bxax0 = bwua1.d;
                    Object object0 = bxax0.h;
                    synchronized(object0) {
                        bwpo bwpo0 = bxax0.l(s1);
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)bwpo0));
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        if(!((bwpo)hftv0).m) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            bwpo bwpo1 = (bwpo)hftp0.b_message;
                            bwpo1.b |= 0x400;
                            bwpo1.m = true;
                            bxax0.A(s1, ((bwpo)hftp0.N_build()));
                        }
                    }
                    goto label_63;
                label_47:
                    bxax bxax1 = bwua1.d;
                    Object object1 = bxax1.h;
                    synchronized(object1) {
                        bwpo bwpo2 = bxax1.l(s1);
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpo2).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)bwpo2));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        bwpo bwpo3 = (bwpo)hftp1.b_message;
                        bwpo3.b &= 0xFFFFFBFF;
                        bwpo3.m = false;
                        bxax1.A(s1, ((bwpo)hftp1.N_build()));
                    }
                label_63:
                    Set set0 = bwuv.h(bwuc0).a(bwuc0.g(packageInfo0.applicationInfo));
                    ArrayList arrayList0 = new ArrayList();
                    for(int v3 = 0; v3 < arr_bwtv.length; ++v3) {
                        bwtv bwtv0 = arr_bwtv[v3];
                        if(bwtv0.b) {
                            RegisterCorpusInfo registerCorpusInfo0 = bwtv0.a;
                            String s2 = bwnb.m(registerCorpusInfo0);
                            if(s2 != null) {
                                throw new bwvo(s2);
                            }
                            if(arr_account != null) {
                                for(int v4 = 0; v4 < arr_account.length; ++v4) {
                                    RegisterCorpusInfo registerCorpusInfo1 = registerCorpusInfo0.a(arr_account[v4]);
                                    if(bwnb.m(registerCorpusInfo1) == null) {
                                        arrayList0.add(registerCorpusInfo1);
                                    }
                                    else {
                                        bwne.f("Account exceeds length limits");
                                    }
                                }
                            }
                        }
                        else {
                            arrayList0.add(bwtv0.a);
                        }
                    }
                    Iterator iterator0 = arrayList0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            for(Object object2: set0) {
                                bwuv.i(bwua1, ((String)object2), bwmj0);
                            }
                            if(!"com.google.android.gms".equals(bwua1.b)) {
                                GlobalSearchApplicationInfo globalSearchApplicationInfo0 = bwtw0.b;
                                if(globalSearchApplicationInfo0 == null) {
                                    bwuv.g(bwua1);
                                }
                                else {
                                    bwne.r("Setting GSAI for %s: %s", bwua1, globalSearchApplicationInfo0);
                                    try {
                                        bwua1.m(new bwuw(globalSearchApplicationInfo0, 2, packageInfo0.lastUpdateTime));
                                    }
                                    catch(bwvo unused_ex) {
                                        throw new bwvq("Could not set GSAI from resources");
                                    }
                                }
                            }
                            bwua1.q();
                            return;
                        }
                        Object object3 = iterator0.next();
                        RegisterCorpusInfo registerCorpusInfo2 = (RegisterCorpusInfo)object3;
                        if(bwvu.b()) {
                            Resources resources0 = bwua1.d();
                            Resources resources1 = bwuc0.a.b.getResources();
                            if(resources0 == null) {
                                iterator2 = iterator0;
                                bwne.u("Package %s Corpus %s Version %s failed appdatasearch-corpus-whitelist", new Object[]{s1, bwuv.a(registerCorpusInfo2.a), registerCorpusInfo2.b});
                                goto label_150;
                            }
                            else {
                                String s3 = registerCorpusInfo2.a;
                                Account account0 = registerCorpusInfo2.g;
                                String s4 = s1 + "-" + s3;
                                if(account0 == null) {
                                label_125:
                                    iterator2 = iterator0;
                                }
                                else {
                                    iterator2 = iterator0;
                                    String s5 = "/" + Uri.encode(account0.type) + "/" + Uri.encode(account0.name);
                                    if(s3.endsWith(s5)) {
                                        s4 = s1 + "-" + s3.substring(0, s3.length() - s5.length());
                                        goto label_126;
                                    }
                                    else {
                                        registerCorpusInfo3 = null;
                                        goto label_129;
                                    }
                                    goto label_125;
                                }
                            label_126:
                                registerCorpusInfo3 = (RegisterCorpusInfo)bwuu.a.get(s4);
                                if(registerCorpusInfo3 != null && account0 != null) {
                                    registerCorpusInfo3 = registerCorpusInfo3.a(account0);
                                }
                            label_129:
                                if(registerCorpusInfo3 == null || registerCorpusInfo3.j != registerCorpusInfo2.j || registerCorpusInfo3.k != registerCorpusInfo2.k || registerCorpusInfo3.f != registerCorpusInfo2.f || !bata.b(registerCorpusInfo3.a, s3) || !bata.b(registerCorpusInfo3.b, registerCorpusInfo2.b) || !bata.b(registerCorpusInfo3.c, registerCorpusInfo2.c) || !bata.b(registerCorpusInfo3.g, account0) || !bata.b(registerCorpusInfo3.i, registerCorpusInfo2.i) || !Arrays.equals(registerCorpusInfo3.d, registerCorpusInfo2.d) || !bwuu.a(registerCorpusInfo3.e, resources1, registerCorpusInfo2.e, resources0, (!"com.android.chrome".equals(s1) && !"com.android.chrome.beta".equals(s1) && !"com.android.chrome.dev".equals(s1) || !"omnibox".equals(s3) ? -1 : abvx.a("icon")))) {
                                    bwne.u("Package %s Corpus %s Version %s failed appdatasearch-corpus-whitelist", new Object[]{s1, bwuv.a(registerCorpusInfo2.a), registerCorpusInfo2.b});
                                    goto label_150;
                                }
                            }
                        }
                        else {
                            iterator2 = iterator0;
                        }
                        set0.remove(registerCorpusInfo2.a);
                        try {
                            bwud bwud0 = bwuc0.g(packageInfo0.applicationInfo);
                            long v5 = packageInfo0.lastUpdateTime;
                            bwmx bwmx0 = bwmj0.a;
                            if(!bwmx0.s && bwud0.e.equals("com.google.android.gms")) {
                                bwne.s("Skipping register from self resource");
                            }
                            else {
                                String s6 = bwnb.m(registerCorpusInfo2);
                                if(s6 != null) {
                                    throw new bwvo(s6);
                                }
                                try {
                                    bwmx0.H(bwud0, new bwuw(registerCorpusInfo2, 2, v5));
                                }
                                catch(bwvr | SecurityException exception0) {
                                    bwne.j(exception0, "Failed to register corpus from %s resources", new Object[]{bwud0.e});
                                }
                            }
                        }
                        catch(bwvo bwvo1) {
                            throw new bwvo("From " + packageInfo0.packageName + " resources: problem with corpus " + bwuv.a(registerCorpusInfo2.a) + ": " + bwvo1.getMessage());
                        }
                    label_150:
                        iterator0 = iterator2;
                    }
                }
                catch(bwty bwty0) {
                    bwne.j(bwty0, "Error parsing xml.", new Object[0]);
                    bwua1.o((bwty0.getMessage() == null ? "Error parsing xml." : bwty0.getMessage()));
                }
                catch(bwvo bwvo0) {
                    bwne.j(bwvo0, "Error from Icing client.", new Object[0]);
                    bwua1.o((bwvo0.getMessage() == null ? "Error from Icing client." : bwvo0.getMessage()));
                }
            }
        }
        else {
            if(!z2) {
                bwne.p("Package %s has no appdatasearch metadata", packageInfo0.packageName);
            }
            else if(z3) {
                bwne.p("Package %s is not allowed to use icing", packageInfo0.packageName);
            }
            else {
                bwne.t("Package %s targets Android P and isn\'t allowed to use AppDataSearch indexing API", packageInfo0.packageName);
            }
            if(bwua0 != null) {
                bwua0.o(null);
                bwne.b("updateResources: resources removed:%s", bwua0);
                bwuv.g(bwua0);
                for(Object object4: bwuv.h(bwuc0).a(bwuc0.g(packageInfo0.applicationInfo))) {
                    bwuv.i(bwua0, ((String)object4), bwmj0);
                }
                bwua0.q();
            }
        }
    }

    public static final void c(boolean z, bwuc bwuc0, Account[] arr_account, boolean z1, bwmj bwmj0) {
        for(Object object0: bwuc0.l()) {
            String s = (String)object0;
            if(!bwuv.d(s, z, bwuc0, arr_account, z1, bwmj0)) {
                bwne.b("Package %s no longer installed", s);
                bwmj0.a(s);
            }
            z = z;
            bwuc0 = bwuc0;
            arr_account = arr_account;
            z1 = z1;
            bwmj0 = bwmj0;
        }
    }

    public static final boolean d(String s, boolean z, bwuc bwuc0, Account[] arr_account, boolean z1, bwmj bwmj0) {
        try {
            PackageInfo packageInfo0 = bwuc0.a.c.getPackageInfo(s, 0x80);
            if(packageInfo0.applicationInfo.enabled) {
                bwuv.b(packageInfo0, z, bwuc0, arr_account, z1, bwmj0);
                return true;
            }
            bwne.p("Package %s is disabled", packageInfo0.packageName);
            bwmj0.a(packageInfo0.packageName);
            return true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return false;
        }
    }

    protected static final bwtz e(ApplicationInfo applicationInfo0, bwuc bwuc0) {
        if(applicationInfo0.packageName == null) {
            bwne.f("null packageName in ApplicationInfo, bailing");
            return null;
        }
        Context context0 = bwuc0.a.b;
        if("com.google.android.gms".equals(applicationInfo0.packageName)) {
            try {
                return new bwtz(applicationInfo0, context0, context0.getResources().getXml(0x7F190005));  // xml:appdatasearch
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                bwne.j(resources$NotFoundException0, "Failed to load resources for GmsCore", new Object[0]);
                return null;
            }
        }
        try {
            context0 = context0.createPackageContext(applicationInfo0.packageName, 0);
        }
        catch(PackageManager.NameNotFoundException | Resources.NotFoundException | SecurityException exception0) {
            bwne.j(exception0, "Failed to get context for %s", new Object[]{applicationInfo0.packageName});
            return null;
        }
        XmlResourceParser xmlResourceParser0 = applicationInfo0.loadXmlMetaData(bwuc0.a.c, "com.google.android.gms.appdatasearch");
        if(xmlResourceParser0 != null) {
            return new bwtz(applicationInfo0, context0, xmlResourceParser0);
        }
        bwne.i("Failed to read %s meta data from %s; could not create XML parser", "com.google.android.gms.appdatasearch", applicationInfo0.packageName);
        return null;
    }

    public static final boolean f(String s, bwuc bwuc0, Account[] arr_account, bwmj bwmj0) {
        return bwuv.d(s, false, bwuc0, arr_account, false, bwmj0);
    }

    private static final void g(bwua bwua0) {
        if(bwua0.e().a() == 2) {
            bwne.p("Clearing GSAI for %s; no longer in resources", bwua0);
            try {
                bwua0.m(new bwuw(null, 2, 0L));
            }
            catch(bwvo unused_ex) {
                throw new bwvq("Could not clear GSAI");
            }
        }
    }

    private static final bwmm h(bwuc bwuc0) {
        return bwuc0.a.d;
    }

    private static final void i(bwua bwua0, String s, bwmj bwmj0) {
        bwmx bwmx0 = bwmj0.a;
        if(!bwmx0.s && bwua0.b.equals("com.google.android.gms")) {
            bwne.s("Skipping unregister from self resource");
            return;
        }
        String s1 = bwua0.b;
        bwne.r("unregisterFromResources: %s corpus %s", s1, s);
        bwmx0.c.c(2);
        bwvl bwvl0 = new bwvl(s1, s);
        bwuw bwuw0 = bwmx0.f().k(bwvl0);
        if(bwuw0 == null) {
            bwne.i("Request to unregister non-existent resources corpus %s from package %s", s, s1);
            return;
        }
        batl.l(bwuw0.a() == 2);
        if(!bwmx0.L(bwvl0, bwua0)) {
            bwne.g("Failed to unregister corpus from client %s", s1);
        }
    }
}

