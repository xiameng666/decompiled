import android.database.sqlite.SQLiteException;
import java.util.HashMap;
import java.util.Map;

public final class eiue {
    private static final bboh a;

    static {
        eiue.a = bboh.b("PkgMappingForNotify", bbcu.al);
    }

    public static Map a(eiog eiog0, ggfp ggfp0) {
        eiod eiod0 = eiog0.f() ? ((eioh)eiog0).g("SELECT config_packages.name, android_packages.name\nFROM config_packages\nINNER JOIN android_packages USING (android_package_id);\n").d() : ((eioh)eiog0).g("SELECT packageName, androidPackageName FROM Packages").d();
        try(eioe eioe0 = eiod0.f()) {
            Map map0 = new HashMap();
            while(true) {
                if(!eioe0.b()) {
                    break;
                }
                String s = eioe0.h(0);
                String s1 = eioe0.h(1);
                if(ggfp0.contains(s)) {
                    eiqu.a(map0, s1, s);
                }
            }
            return map0;
        }
        catch(SQLiteException sQLiteException0) {
            a.ae(eiue.a.i(), "Unable to get android package mapping.", sQLiteException0);
            return new HashMap();
        }
    }
}

