import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class czzi {
    public bhnd a;
    public final Context b;
    private final ExecutorService c;

    public czzi(Context context0) {
        this.a = null;
        this.b = context0;
        gmcg gmcg0 = cuui.c(2);
        this.c = gmcg0;
        gmcg0.execute(new czzf(this, context0));
    }

    public static ggeo a(String s) {
        ggek ggek0 = new ggek();
        ggek0.i("APP_NAME", "Nearby");
        ggek0.i("ID", s);
        return ggek0.g();
    }

    public final String b(String s) {
        gmcu gmcu0 = new gmcu();
        czzg czzg0 = new czzg(this, gmcu0, s);
        this.c.execute(czzg0);
        return (String)cuuc.h("DroidGuard.getResult", gmcu0, hvog.aG());
    }

    public static String c(Context context0, String s) {
        ggeo ggeo0 = czzi.a(s);
        gmcu gmcu0 = new gmcu();
        new czzh(gmcu0, context0, ggeo0).start();
        return (String)cuuc.h("DroidGuard.getResult", gmcu0, hvog.aG());
    }

    public final void d() {
        bhnd bhnd0 = this.a;
        if(bhnd0 != null) {
            bhnd0.close();
        }
        cuui.h(this.c, "NC_DroidGuard.executor");
    }
}

