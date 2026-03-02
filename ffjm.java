import android.util.Log;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import j..util.Objects;

final class ffjm extends ffee {
    final String c;
    final String d;
    final fdiy e;
    final fflv f;

    public ffjm(fflv fflv0, String s, String s1, fdiy fdiy0) {
        this.c = s;
        this.d = s1;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("openChannel");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdri fdri0 = this.f.l;
            fdpl fdpl0 = this.f.e;
            String s = this.c;
            String s1 = this.d;
            ffhh ffhh0 = new ffhh(this.e);
            feyi feyi0 = feyi.a;
            if(Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", String.format("Posting createChannel(%s, %s, %s, callbacks)", fdpl0.b, s, s1));
            }
            batl.t(fdpl0, "appKey");
            batl.t(s, "nodeId");
            batl.t(s1, "path");
            fdri0.b(new fdqo(fdri0, fdpl0, s, s1, ffhh0, feyi0));
        }
        catch(RuntimeException runtimeException0) {
            Log.w("WearableService", "openChannel: exception during processing", runtimeException0);
            OpenChannelResponse openChannelResponse0 = new OpenChannelResponse(8, null);
            this.e.N(openChannelResponse0);
        }
    }
}

