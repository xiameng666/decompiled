import com.google.wear.services.migration.MigrationManager;
import java.util.function.Function;

public final class fcve implements jqv {
    public final fcvh a;
    public final fcvg b;
    public final MigrationManager c;
    public final String d;
    public final Function e;
    public final Object f;

    public fcve(fcvh fcvh0, fcvg fcvg0, MigrationManager migrationManager0, String s, Function function0, Object object0) {
        this.a = fcvh0;
        this.b = fcvg0;
        this.c = migrationManager0;
        this.d = s;
        this.e = function0;
        this.f = object0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        fcvf fcvf0 = new fcvf(this.a, this.d, jqt0, this.e, this.f);
        this.b.a(this.c, this.a.b, fcvf0);
        return "WearServicesRestoreHelper#callMigrationManagerApi (" + this.d + ") future";
    }
}

