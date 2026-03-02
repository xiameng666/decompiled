import android.util.Log;
import android.util.Pair;
import com.google.android.gms.wearable.internal.GetRestoreStateRequest;
import com.google.android.gms.wearable.internal.GetRestoreStateResponse;
import java.util.Map;

public final class ffgx implements fflt {
    public final fflv a;
    public final GetRestoreStateRequest b;
    public final fdiy c;
    public final String d;

    public ffgx(fflv fflv0, GetRestoreStateRequest getRestoreStateRequest0, fdiy fdiy0) {
        this.a = fflv0;
        this.b = getRestoreStateRequest0;
        this.c = fdiy0;
        this.d = "getRestoreState";
    }

    @Override  // fflt
    public final void a() {
        fdiy fdiy0;
        try {
            fdiy0 = this.c;
            fcmj fcmj0 = this.a.E;
            batl.s(fcmj0);
            String s = this.b.a;
            fcmj.a.j("Get restore state, node id %s", new Object[]{s});
            Map map0 = fcmj0.f;
            if(map0.containsKey(s)) {
                Map map1 = fcmj0.g;
                if(map1.containsKey(s)) {
                    Integer integer0 = (Integer)map0.get(s);
                    gftb.check(integer0);
                    byte[] arr_b = (byte[])map1.get(s);
                    gftb.check(arr_b);
                    Pair pair0 = new Pair(integer0, arr_b);
                    fdiy0.K(new GetRestoreStateResponse(0, ((int)(((Integer)pair0.first))), ((byte[])pair0.second)));
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid nodeId: " + s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.e("WearableService", this.d + " failed", illegalArgumentException0);
            fdiy0.K(new GetRestoreStateResponse(8, 0, new byte[0]));
        }
    }
}

