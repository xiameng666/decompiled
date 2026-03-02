import android.content.Context;
import android.content.res.Resources;
import android.telephony.SubscriptionManager;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ScheduledExecutorService;

public final class egxn implements lsk {
    private final egvt a;
    private final gmcg b;
    private final ScheduledExecutorService c;
    private final egwa d;
    private final fuoy e;
    private final egrz f;
    private final egrb g;
    private final eghw h;
    private final egsw i;
    private final eguw j;

    public egxn(egrb egrb0, egvt egvt0, gmcg gmcg0, ScheduledExecutorService scheduledExecutorService0, eghw eghw0, egsw egsw0, eguw eguw0, egwa egwa0, fuoy fuoy0, egrz egrz0) {
        this.g = egrb0;
        this.a = egvt0;
        this.b = gmcg0;
        this.c = scheduledExecutorService0;
        this.h = eghw0;
        this.i = egsw0;
        this.j = eguw0;
        this.d = egwa0;
        this.e = fuoy0;
        this.f = egrz0;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        if(class0.isAssignableFrom(eguv.class)) {
            egra egra0 = new egra(this.a, this.b, this.g);
            return (lsb)class0.cast(new eguv(this.f, this.b, egra0, this.a, this.h, this.i, this.j, this.d));
        }
        Resources resources0 = this.f.a.getResources();
        if(class0.isAssignableFrom(egwp.class)) {
            return (lsb)class0.cast(new egwp(resources0, this.e, this.h, this.d));
        }
        if(class0.isAssignableFrom(egvs.class)) {
            return (lsb)class0.cast(new egvs(this.c, this.d));
        }
        if(class0.isAssignableFrom(egvm.class)) {
            return (lsb)class0.cast(new egvm(resources0, this.d));
        }
        throw new IllegalArgumentException("ViewModelFactory cannot create an instance of " + class0);
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        return lsi.c(this, class0);
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }

    public static egxn d(Context context0) {
        efol efol0 = new efol();
        efol0.a = 80;
        efom efom0 = efol0.a();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        egrb egrb0 = new egrb(context0.getApplicationContext(), "com.google.android.gms");
        egvt egvt0 = egvt.a(context0);
        bbll bbll0 = new bbll(1, 9);
        eghw eghw0 = new eghw(fofa.a());
        egsw egsw0 = new egsw(new efzw(context0, efom0));
        ejyn ejyn0 = new ejyn(context0);
        Context context1 = context0.getApplicationContext();
        efol efol1 = new efol();
        efol1.a = 80;
        efol1.b = ModuleManager.get(context0).getCurrentModule().moduleId;
        eguw eguw0 = new eguw(ejyn0, new efpj(context1, efol1.a()));
        Context context2 = context0.getApplicationContext();
        egns egns0 = egnq.a(context0);
        if(!context2.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            return new egxn(egrb0, egvt0, bblp0, bbll0, eghw0, egsw0, eguw0, new egvz(), new fupm(((fupd)((eggo)eggq.a).k.get())), new egrz(context0));
        }
        SubscriptionManager subscriptionManager0 = (SubscriptionManager)context2.getSystemService("telephony_subscription_service");
        if(subscriptionManager0 == null) {
            return new egxn(egrb0, egvt0, bblp0, bbll0, eghw0, egsw0, eguw0, new egvz(), new fupm(((fupd)((eggo)eggq.a).k.get())), new egrz(context0));
        }
        efol efol2 = new efol();
        efol2.a = 80;
        efol2.b = "people";
        return new egxn(egrb0, egvt0, bblp0, bbll0, eghw0, egsw0, eguw0, new egwd(bblp0, subscriptionManager0, new egas(context2, efol2.a()), egns0), new fupm(((fupd)((eggo)eggq.a).k.get())), new egrz(context0));
    }
}

