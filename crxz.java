import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;

public final class crxz extends bbln {
    private final LinkedBlockingQueue a;
    private final bakc b;

    public crxz(LinkedBlockingQueue linkedBlockingQueue0) {
        super(10);
        this.a = linkedBlockingQueue0;
        this.b = new bakc(AppContextProvider.a(), "mdp-stats-data", false, null);
    }

    @Override
    public final void run() {
        try {
            while(true) {
                Pair pair0 = (Pair)this.a.take();
                if(pair0 != null) {
                    long v = this.b.getLong(((String)pair0.first), 0L);
                    SharedPreferences.Editor sharedPreferences$Editor0 = this.b.edit();
                    sharedPreferences$Editor0.putLong(((String)pair0.first), v + ((long)(((Long)pair0.second))));
                    sharedPreferences$Editor0.apply();
                }
            }
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            Level level0 = cslm.h();
            ChimeraPeriodicUpdaterService.a.g(level0).x("Interrupted, exiting");
        }
        catch(bakb bakb0) {
            a.ae(ChimeraPeriodicUpdaterService.a.j(), "SharedPreferences failed to apply StatsUpdater changes.", bakb0);
        }
    }
}

