import com.google.android.gms.auth.proximity.exo.ExoChimeraService;
import java.util.concurrent.ExecutionException;

public final class albm implements Runnable {
    public final ExoChimeraService a;
    public final gmcd b;
    public final String c;
    public final String d;

    public albm(ExoChimeraService exoChimeraService0, gmcd gmcd0, String s, String s1) {
        this.a = exoChimeraService0;
        this.b = gmcd0;
        this.c = s;
        this.d = s1;
    }

    @Override
    public final void run() {
        try {
            String s = this.d;
            aldk aldk0 = (aldk)gmbu.r(this.b);
            String s1 = this.c;
            ExoChimeraService exoChimeraService0 = this.a;
            if(aldk0 == aldk.a) {
                exoChimeraService0.c(s1);
                return;
            }
            boolean z = aldk0 == aldk.c;
            Boolean boolean0 = Boolean.valueOf(z);
            ExoChimeraService.a.h("Found exo association pref %s", new Object[]{boolean0});
            boolean0.getClass();
            alao alao0 = (alao)exoChimeraService0.e.b.get(s);
            if(alao0 != null) {
                alao0.a(z, s1);
            }
            if(hpzc.a.b().l()) {
                exoChimeraService0.c(s1);
            }
        }
        catch(ExecutionException executionException0) {
            ExoChimeraService.a.n("Failed to load exo association cache", executionException0, new Object[0]);
        }
    }
}

