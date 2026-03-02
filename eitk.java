import jeb.synthetic.TWR;

public final class eitk {
    public String a;
    public final String b;
    public static final int c;

    static {
        bboh.b("UnregisterOperation", bbcu.al);
    }

    public eitk(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    static int a(eioo eioo0, String s, String s1) {
        int v = eioo0.c("DELETE FROM ApplicationStates WHERE packageName = ?").g(new Object[]{s}).b() + eioo0.c("DELETE FROM LogSources WHERE packageName = ?").g(new Object[]{s}).b() + eioo0.c("DELETE FROM WeakExperimentIds WHERE packageName = ?").g(new Object[]{s}).e().b() + eioo0.c("DELETE FROM ExperimentTokens WHERE packageName = ?").g(new Object[]{s}).b() + eioo0.c("DELETE FROM Flags WHERE packageName = ?").g(new Object[]{s}).b() + eioo0.c("DELETE FROM FlagOverrides WHERE packageName = ?").g(new Object[]{s}).b() + eioo0.c("DELETE FROM ApplicationTags WHERE packageName = ?").g(new Object[]{s}).b() + eioo0.c("DELETE FROM CrossLoggedExperimentTokens WHERE toPackageName = ?1 OR fromPackageName = ?1").g(new Object[]{s}).b();
        if(s1 == null) {
            eiok eiok0 = ((eioh)eioo0).g("SELECT androidPackageName FROM Packages WHERE packageName = ?").h(new Object[]{s}).i();
            if(eiok0 != null) {
                try {
                    s1 = eiok0.g(0);
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(eiok0, throwable0);
                    throw throwable0;
                }
            }
            if(eiok0 != null) {
                eiok0.close();
            }
        }
        int v1 = v + eioo0.c("DELETE FROM Packages WHERE packageName = ?").g(new Object[]{s}).b();
        if(s1 != null) {
            v1 += eioo0.c("DELETE FROM StorageInfos\nWHERE androidPackageName = ?1\nAND NOT (SELECT EXISTS(\n  SELECT packageName FROM Packages WHERE androidPackageName = ?1)\n)\n").g(new Object[]{s1}).b();
        }
        if(v1 > 0) {
            eioo0.c("DELETE FROM RequestTags").d();
        }
        return v1;
    }

    static void b(eiox eiox0, eiop eiop0, String s) {
        if(hxln.d()) {
            eirf.a.b(eiox0, eiop0, s);
            eiop0.c("DELETE FROM config_packages WHERE name = ?1;").g(new Object[]{s}).d();
            return;
        }
        if(eiop0.c("DELETE FROM config_packages WHERE name = ?1;").g(new Object[]{s}).b() > 0) {
            eirf.a.e();
        }
    }

    public static void c(eiop eiop0) {
        int v = eiop0.c("DELETE FROM ApplicationStates WHERE packageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b() + eiop0.c("DELETE FROM LogSources WHERE packageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b() + eiop0.c("DELETE FROM WeakExperimentIds WHERE packageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").e().b() + eiop0.c("DELETE FROM ExperimentTokens WHERE packageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b() + eiop0.c("DELETE FROM Flags WHERE packageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b() + eiop0.c("DELETE FROM FlagOverrides WHERE packageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b() + eiop0.c("DELETE FROM ApplicationTags WHERE packageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b() + eiop0.c("DELETE FROM Packages WHERE packageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b() + eiop0.c("DELETE FROM CrossLoggedExperimentTokens WHERE toPackageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs) OR fromPackageName IN (SELECT temp_deleted_pkgs.packageName FROM temp_deleted_pkgs)").b();
        if(v > 0) {
            eiop0.c("DELETE FROM RequestTags").d();
        }
        if(v > 0 && !hxln.d()) {
            eirf.a.e();
        }
    }
}

