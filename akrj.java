import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager.EnforcingUser;
import android.os.UserManager;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.stream.Stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class akrj {
    public static final bboh a;
    public final Context b;
    public final UserManager c;
    public final akrd d;
    private static akrj e;
    private final DevicePolicyManager f;

    static {
        akrj.a = bboh.b("Auth", bbcu.fm);
    }

    private akrj(Context context0) {
        this.b = context0.getApplicationContext();
        Object object0 = context0.getSystemService("device_policy");
        gftb.check(object0);
        this.f = (DevicePolicyManager)object0;
        Object object1 = context0.getSystemService("user");
        gftb.check(object1);
        this.c = (UserManager)object1;
        this.d = akrd.a(context0);
    }

    public final int a(UserHandle userHandle0, PersistableBundle persistableBundle0, PersistableBundle persistableBundle1) {
        ArrayList arrayList0 = new ArrayList();
        String s = Integer.toString(userHandle0.getIdentifier());
        PersistableBundle persistableBundle2 = akrj.b(persistableBundle0, s);
        PersistableBundle persistableBundle3 = akrj.b(persistableBundle1, s);
        bboh bboh0 = akrj.a;
        ((ggtj)bboh0.h()).X("getSystemRestrictionsToBeCleared for %s: prev=%d, curr=%d", s, Integer.valueOf(persistableBundle2.size()), Integer.valueOf(persistableBundle3.size()));
        for(Iterator iterator0 = persistableBundle3.keySet().iterator(); iterator0.hasNext(); iterator0 = iterator0) {
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            int v = persistableBundle3.getInt(s1);
            int v1 = persistableBundle2.getInt(s1);
            ((ggtj)bboh0.h()).ab("restriction %s (%d, %d) iss(curr)=%b iss(prev)=%b isdp(curr)=%b isdp(prev)=%b", s1, Integer.valueOf(v1), Integer.valueOf(v), Boolean.valueOf(akrj.j(v)), Boolean.valueOf(akrj.j(v1)), Boolean.valueOf(akrj.i(v)), Boolean.valueOf(akrj.i(v1)));
            if(v != v1 && (akrj.j(v) && akrj.i(v) && !akrj.j(v1) && akrj.i(v1) || hpwf.a.b().A())) {
                ((ggtj)bboh0.h()).B("Adding restriction %s", s1);
                arrayList0.add(s1);
            }
        }
        hfuo hfuo0 = hpwf.a.b().g().b;
        Stream stream0 = Collection.-EL.stream(arrayList0);
        Objects.requireNonNull(hfuo0);
        gged_interceptors gged0 = (gged_interceptors)stream0.filter(new akri(hfuo0)).collect(ggaf.a);
        ((ggtj)bboh0.h()).z("Clearing %d restrictions", gged0.size());
        UserManager userManager0 = this.c;
        if(!Objects.equals(userHandle0, Process.myUserHandle())) {
            try {
                Object object1 = this.b.createPackageContextAsUser("com.google.android.gms", 0, userHandle0).getSystemService("user");
                gftb.check(object1);
                userManager0 = (UserManager)object1;
            }
            catch(RuntimeException | PackageManager.NameNotFoundException exception0) {
                a.e(akrj.a.i(), "Failed to create context for user %s", userHandle0, exception0);
                return 0;
            }
        }
        int v2 = gged0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            String s2 = (String)gged0.get(v3);
            ((ggtj)akrj.a.h()).R("Clearing user restriction %s for %s", s2, userHandle0);
            userManager0.setUserRestriction(s2, false);
        }
        return gged0.size();
    }

    public static PersistableBundle b(PersistableBundle persistableBundle0, String s) {
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle(s);
        return persistableBundle1 == null ? new PersistableBundle() : persistableBundle1;
    }

    public final PersistableBundle c(UserHandle userHandle0) {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        UserManager userManager0 = this.c;
        for(Object object0: userManager0.getUserRestrictions(userHandle0).keySet()) {
            int v = 0;
            for(Object object1: userManager0.getUserRestrictionSources(((String)object0), userHandle0)) {
                v |= ((UserManager.EnforcingUser)object1).getUserRestrictionSource();
            }
            persistableBundle0.putInt(((String)object0), v);
        }
        return persistableBundle0;
    }

    public final PersistableBundle d(UserHandle userHandle0) {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putPersistableBundle(Integer.toString(userHandle0.getIdentifier()), this.c(userHandle0));
        UserHandle userHandle1 = this.c.getProfileParent(userHandle0);
        if(userHandle1 != null) {
            persistableBundle0.putPersistableBundle(Integer.toString(userHandle1.getIdentifier()), this.c(userHandle1));
        }
        return persistableBundle0;
    }

    public static PersistableBundle e(Context context0, String s) {
        try(FileInputStream fileInputStream0 = context0.openFileInput(s)) {
            return PersistableBundle.readFromStream(fileInputStream0);
        }
    }

    public static akrj f(Context context0) {
        synchronized(akrj.class) {
            if(akrj.e == null) {
                akrj.e = new akrj(context0);
            }
        }
        return akrj.e;
    }

    public final String g() {
        DevicePolicyManager devicePolicyManager0 = this.f;
        ComponentName componentName0 = devicePolicyManager0.getProfileOwner();
        String s = componentName0 == null ? null : componentName0.getPackageName();
        if(s == null) {
            s = devicePolicyManager0.getDeviceOwner();
        }
        return "com.google.android.gms".equals(s) ? null : s;
    }

    public static void h(Context context0, String s, PersistableBundle persistableBundle0) {
        try(FileOutputStream fileOutputStream0 = context0.openFileOutput(s, 0)) {
            persistableBundle0.writeToStream(fileOutputStream0);
        }
    }

    private static boolean i(int v) {
        return (v & 6) != 0;
    }

    private static boolean j(int v) {
        return (v & 1) == 1;
    }
}

