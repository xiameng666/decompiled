import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.location.reporting.service.DispatchingChimeraService;

public final class fxsr implements Runnable {
    public final DispatchingChimeraService a;

    public fxsr(DispatchingChimeraService dispatchingChimeraService0) {
        this.a = dispatchingChimeraService0;
    }

    @Override
    public final void run() {
        fxtk fxtk0;
        fxqn fxqn0;
        LevelDb levelDb0;
        DispatchingChimeraService dispatchingChimeraService0 = this.a;
        Context context0 = ModuleManager.requireSubmoduleContext(dispatchingChimeraService0, "location_history");
        try {
            for(int v = 0; v < 3; ++v) {
                String s = new String[]{"gcore_ulr_ActivityDetection.db", "gcore_ulr_ApiMetadata.db", "gcore_ulr_UlrLocation.db"}[v];
                if(context0.deleteDatabase(s)) {
                    fxqw.c("GCoreUlr", "Deleted database \'" + s + "\'");
                }
            }
            fxqo fxqo0 = new fxqo(fxtt.a(context0).f());
            try {
                levelDb0 = fxqn.k(context0);
                if(levelDb0.toString().equals("LevelDB[]")) {
                    fxqw.f("Created NoOpLevelDb");
                }
            }
            catch(LevelDbCorruptionException levelDbCorruptionException0) {
                fxqw.d(5, "datastore corrupted");
                throw levelDbCorruptionException0;
            }
            fxqn0 = new fxqn(levelDb0, fxqo0, context0);
        }
        catch(LevelDbException levelDbException0) {
            fxqw.g("Error opening datastoreGrpc", levelDbException0);
            fxtk0 = null;
            goto label_26;
        }
        if(humo.e()) {
            context0 = ModuleManager.requireSubmoduleContext(context0, "location_history");
        }
        fxtk0 = new fxtk(context0, fxqn0, dispatchingChimeraService0);
    label_26:
        dispatchingChimeraService0.b = fxtk0;
    }
}

