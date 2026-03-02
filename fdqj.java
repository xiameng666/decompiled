import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class fdqj {
    final Context a;
    ggeo b;
    int c;
    int d;

    public fdqj(Context context0) {
        this.a = context0;
    }

    public final Set a(String s, gfsx gfsx0) {
        if(hzut.c()) {
            gfsx gfsx1 = this.b != null && this.b.containsKey(s) && gfsx0.i() && (((ApplicationInfo)gfsx0.d()).flags & 0x81) == 1 ? gfsx.m(((Set)this.b.get(s))) : gfqx.a;
            if(gfsx1.i()) {
                ++this.c;
                return gfsx1.d();
            }
        }
        ++this.d;
        return this.b(s);
    }

    final Set b(String s) {
        String s1;
        Resources resources0;
        try {
            resources0 = this.a.getPackageManager().getResourcesForApplication(s);
            s1 = ffmq.a(resources0, s);
        }
        catch(PackageManager.NameNotFoundException | NullPointerException unused_ex) {
            if(Log.isLoggable("CapabilityService", 5)) {
                Log.w("CapabilityService", dlbc.c(s, "Could not get resources for package \"", "\". Returning an empty capability set."));
            }
            return Collections.EMPTY_SET;
        }
        int v = resources0.getIdentifier("android_wear_capabilities", "array", s1);
        if(v != 0) {
            try {
                String[] arr_s = resources0.getStringArray(v);
                if(arr_s != null && arr_s.length > 0) {
                    return new HashSet(Arrays.asList(arr_s));
                }
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                if(Log.isLoggable("CapabilityService", 6)) {
                    Log.e("CapabilityService", "Attempt to get resource for existing id (" + v + ") failed in package \'" + ffmr.a(s) + "\' (resource package \'" + s1 + "\'): " + resources$NotFoundException0.getMessage());
                }
            }
        }
        return Collections.EMPTY_SET;
    }
}

