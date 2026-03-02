import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public final class eivr {
    private final SharedPreferences a;

    public eivr(Context context0) {
        this.a = context0.getSharedPreferences("platform_prefs", 0);
    }

    final String a(eivu eivu0, String s) {
        if(eivu0.f) {
            if(eivu0.e) {
                s = "_boot_" + s;
            }
            return this.a.getString(s, null);
        }
        return this.a.getString(eivu0.a + "." + s, null);
    }

    static String b(Set set0) {
        return new gfss(":").b(set0);
    }

    static TreeSet c(String s) {
        TreeSet treeSet0 = new TreeSet();
        if(!gfta.c(s)) {
            StringTokenizer stringTokenizer0 = new StringTokenizer(s, ":");
            while(stringTokenizer0.hasMoreTokens()) {
                treeSet0.add(stringTokenizer0.nextToken());
            }
        }
        return treeSet0;
    }

    final void d(eivu eivu0, String s, String s1) {
        if(eivu0.f) {
            if(eivu0.e) {
                s = "_boot_" + s;
            }
            this.f(s, s1);
            return;
        }
        this.f(eivu0.a + "." + s, s1);
    }

    final void e(int v, String s, String s1, String s2) {
        if(s == null) {
            if(v - 1 != 0) {
                this.f("_boot_" + s1, s2);
                return;
            }
            this.f(s1, s2);
            return;
        }
        this.f(a.r(s1, s, "."), s2);
    }

    private final void f(String s, String s1) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
        sharedPreferences$Editor0.putString(s, s1);
        sharedPreferences$Editor0.commit();
    }
}

