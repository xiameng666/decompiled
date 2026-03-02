import android.util.Log;
import j..util.Objects;

final class fdra extends fdrc {
    final fdrb a;
    final fdwh b;

    public fdra(fdrb fdrb0, fdwh fdwh0) {
        this.b = fdwh0;
        Objects.requireNonNull(fdrb0);
        this.a = fdrb0;
        super(fdrb0.b);
    }

    @Override  // fdrc
    public final void a() {
        fdro fdro0 = (fdro)this.a.b.d.a(this.a.a);
        if(fdro0 != null) {
            try {
                this.g = fdro0;
                fdwh fdwh0 = this.b;
                if(fdwh0 == fdro0.t) {
                    if(fdro0.e == 1) {
                        fdro0.t = null;
                        ffhh ffhh0 = fdro0.v;
                        if(ffhh0 != null) {
                            ffhh0.a(15, null, fdro0.h);
                            fdro0.v = null;
                            Log.w("ChannelStateMachine", "Received timeout event for request that we weren\'t expecting");
                            return;
                        }
                        Log.w("ChannelStateMachine", "Bad state: CONNECTION_STATE_OPEN_SENT but no callbacks to set");
                        throw new fdrn();
                    }
                    Log.w("ChannelStateMachine", "Bad state: OPEN_SENT timed out, but not in CONNECTION_STATE_OPEN_SENT");
                    throw new fdrn();
                }
                if(fdwh0 != fdro0.u) {
                    Log.w("ChannelStateMachine", "Received timeout event for request that we weren\'t expecting");
                    return;
                }
                fdny.a(fdnn.a);
                Log.w("ChannelStateMachine", "Sending data timed out. Closing channel");
                fdro0.u = null;
                fdro0.f(4, 0);
                fdro0.e(4, 0);
                fdro0.s(0);
                throw fdro0.q(4, 0);
            }
            catch(fdrm fdrm0) {
                this.c(fdrm0.a);
            }
        }
    }
}

