import android.util.Log;
import j..util.Objects;

final class fdqw extends fdrc {
    final String a;
    final feye b;
    final fdri c;

    public fdqw(fdri fdri0, String s, feye feye0) {
        this.a = s;
        this.b = feye0;
        Objects.requireNonNull(fdri0);
        this.c = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelOpenAck(%s, request)", this.a));
        }
        String s = this.a;
        fdro fdro0 = (fdro)this.c.d.b(s, this.b.d, ((boolean)(this.b.e ^ 1)));
        if(fdro0 == null) {
            fdny.a(fdnn.b);
            Log.w("ChannelManager", "Incoming request for inactive channel: open ack");
            return;
        }
        this.g = fdro0;
        fdrq fdrq0 = fdro0.a;
        String s1 = fdrq0.a;
        if(s.equals(s1)) {
            int v = fdro0.e;
            switch(v) {
                case 0: {
                    throw new fdrn();
                }
                case 1: {
                    if(fdro0.v != null) {
                        fdwh fdwh0 = fdro0.t;
                        if(fdwh0 != null) {
                            if(!fdwh0.a()) {
                                Log.i("ChannelStateMachine", "Received OPEN_ACK but request already timed out.");
                                return;
                            }
                            fdro0.t = null;
                            fdro0.v.a(0, fdrq0, fdro0.h);
                            fdro0.v = null;
                            fdro0.j(2);
                            return;
                        }
                        Log.w("ChannelStateMachine", "Bad state: CONNECTION_STATE_OPEN_SENT but no entry in retransmission queue");
                        throw new fdrn();
                    }
                    Log.w("ChannelStateMachine", "Bad state: CONNECTION_STATE_OPEN_SENT but no callbacks to set");
                    throw new fdrn();
                }
                default: {
                    if(v != 3 && v != 4) {
                        return;
                    }
                    throw new fdrn();
                }
            }
        }
        Log.w("ChannelManager", String.format("Got OPEN_ACK from wrong node for channel %s. Expected node %s, got %s", fdrq0, s1, s));
    }
}

