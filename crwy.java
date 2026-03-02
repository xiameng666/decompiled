import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class crwy {
    public static final Set a;
    public static final bboh b;
    public final Map c;
    public final Context d;
    public crwx e;
    private final SharedPreferences f;

    static {
        crwy.a = new HashSet();
        int[] arr_v = crug.c();
        int v = 0;
        while(v < 2) {
            int v1 = arr_v[v];
            String s = crug.a(v1);
            if(v1 == 0) {
                throw null;
            }
            crwy.a.add(s);
            ++v;
            continue;
        }
        crwy.b = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crwy() {
        Context context0 = AppContextProvider.a();
        super();
        this.e = new crwx();
        this.d = context0;
        this.f = context0.getSharedPreferences("com.googles.android.gms.mobiledataplan", 0);
        this.c = new HashMap();
        for(Object object0: crwy.a) {
            HashSet hashSet0 = new HashSet();
            Set set0 = this.f.getStringSet(((String)object0), hashSet0);
            this.c.put(((String)object0), set0);
        }
    }

    public final Status a() {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.f.edit();
        for(Object object0: crwy.a) {
            sharedPreferences$Editor0.putStringSet(((String)object0), ((Set)this.c.get(((String)object0))));
        }
        if(!sharedPreferences$Editor0.commit()) {
            ((ggtj)crwy.b.j()).x("Commit MobileDataPlan event listener packages failed");
            return new Status(27016, "Save MobileDataPlan event listener failed");
        }
        return Status.b;
    }

    public final void b() {
        for(Object object0: crwy.a) {
            HashSet hashSet0 = new HashSet();
            Set set0 = this.f.getStringSet(((String)object0), hashSet0);
            this.c.put(((String)object0), set0);
        }
    }
}

