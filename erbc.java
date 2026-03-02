import android.os.PersistableBundle;

public final class erbc implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        if(!persistableBundle0.containsKey("shared_secret")) {
            throw new IllegalStateException("Missing shared_secret");
        }
        if(!persistableBundle0.containsKey("has_rebooted")) {
            throw new IllegalStateException("Missing has_rebooted");
        }
        if(!persistableBundle0.containsKey("use_launcher")) {
            throw new IllegalStateException("Missing use_launcher");
        }
        if(persistableBundle0.containsKey("is_os_migration")) {
            return new erbd(persistableBundle0.getString("shared_secret"), persistableBundle0.getBoolean("has_rebooted"), persistableBundle0.getBoolean("use_launcher"), persistableBundle0.getBoolean("is_os_migration"));
        }
        throw new IllegalStateException("Missing is_os_migration");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

