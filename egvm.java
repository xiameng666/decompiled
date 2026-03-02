import android.content.res.Resources;
import com.google.android.gms.people.contactssync.model.ImportSimContactsSuggestion;

final class egvm extends lsb {
    public static final bboh a;
    public final Resources b;
    public final egwa c;
    public ImportSimContactsSuggestion d;
    public int e;
    public boolean f;
    public int g;
    public final lqi h;

    static {
        egvm.a = bboh.b("SimListVM", bbcu.f);
    }

    public egvm(Resources resources0, egwa egwa0) {
        this.f = false;
        this.g = -1;
        this.h = new lqi(egvl.a());
        this.b = resources0;
        this.c = egwa0;
    }

    public final egvl a() {
        egvl egvl0 = (egvl)this.h.ij();
        return egvl0 == null ? egvl.a() : egvl0;
    }
}

