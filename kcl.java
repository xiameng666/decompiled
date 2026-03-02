import android.os.PersistableBundle;
import android.uwb.RangingSession;

public final class kcl implements Runnable {
    public final kcu a;
    public final hjlg b;

    public kcl(kcu kcu0, hjlg hjlg0) {
        this.a = kcu0;
        this.b = hjlg0;
    }

    @Override
    public final void run() {
        int[] arr_v;
        RangingSession rangingSession0 = this.a.g;
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("bundle_version", 1);
        persistableBundle0.putLong("session_id", this.b.a);
        persistableBundle0.putInt("no_of_ranging_rounds", this.b.b);
        byte[] arr_b = this.b.c;
        if(arr_b == null) {
            arr_v = null;
        }
        else {
            int[] arr_v1 = new int[arr_b.length];
            for(int v = 0; v < arr_b.length; ++v) {
                arr_v1[v] = arr_b[v];
            }
            arr_v = arr_v1;
        }
        persistableBundle0.putIntArray("ranging_round_indexes", arr_v);
        rangingSession0.updateRangingRoundsDtTag(persistableBundle0);
    }
}

