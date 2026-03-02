import android.util.Log;
import j..util.Objects;
import java.nio.ByteBuffer;

final class fdqn extends fdrc {
    final String a;
    final feyf b;
    final fdri c;

    public fdqn(fdri fdri0, String s, feyf feyf0) {
        this.a = s;
        this.b = feyf0;
        Objects.requireNonNull(fdri0);
        this.c = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelDataAckRequest(%s, request)", this.a));
        }
        feyf feyf0 = this.b;
        fdro fdro0 = (fdro)this.c.d.b(this.a, (feyf0.c == null ? feyg.a : feyf0.c).c, ((boolean)((feyf0.c == null ? feyg.a : feyf0.c).d ^ 1)));
        if(fdro0 == null) {
            fdny.a(fdnn.e);
            Log.w("ChannelManager", "Incoming request for inactive channel: data ack");
            return;
        }
        try {
            this.g = fdro0;
            if(fdro0.e != 2 && fdro0.e != 3) {
                throw new fdrn();
            }
            feyg feyg0 = feyf0.c;
            long v = fdro0.j;
            if((feyg0 == null ? feyg.a : feyg0).e > v) {
                throw new fdrn();
            }
            if(fdro0.f == 7) {
                if(feyg0 == null) {
                    feyg0 = feyg.a;
                }
                if(feyg0.e == v) {
                    if(fdro0.u != null && fdro0.u.a()) {
                        ++fdro0.j;
                        if(feyf0.d) {
                            if(fdro0.e == 3) {
                                if(fdro0.l != null) {
                                    fdro0.f(3, fdro0.q);
                                }
                                fdro0.s(fdro0.q);
                                throw fdro0.q(3, fdro0.q);
                            }
                            if(fdro0.l != null) {
                                Log.i("ChannelStateMachine", "Remote node closed input stream before all data was sent");
                                fdro0.f(0, 0);
                                fdro0.l = null;
                            }
                            fdro0.l(8);
                        }
                        else {
                            ByteBuffer byteBuffer0 = fdro0.p;
                            if(byteBuffer0 != null) {
                                byteBuffer0.clear();
                            }
                            fdro0.c.d(fdro0.l, ffdk.b);
                            fdro0.l(6);
                        }
                    }
                    fdro0.u = null;
                }
            }
        }
        catch(fdrm fdrm0) {
            this.c(fdrm0.a);
        }
    }
}

