import android.content.Context;
import android.content.Intent;

public final class bsam implements clij {
    @Override  // clij
    public final clif a(Context context0, Intent intent0, int v) {
        bsal bsal0 = new bsal(this, context0);
        Intent intent1 = new Intent(intent0);
        brvu brvu0 = bsag.c();
        intent1.putExtra("gms_trace_fired_alarms_ALARM_SOURCE", (brvu0 == null || (brvu0.b & 4) == 0 ? "unknown" : (brvu0.e == null ? brvv.a : brvu0.e).c));
        return new bsan(bsal0, intent1, v);
    }
}

