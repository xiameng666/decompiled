import android.os.ParcelFileDescriptor;
import android.util.Log;
import j..util.Objects;
import java.nio.ByteBuffer;

final class fdqm extends fdrc {
    final String a;
    final feyh b;
    final fdri c;

    public fdqm(fdri fdri0, String s, feyh feyh0) {
        this.a = s;
        this.b = feyh0;
        Objects.requireNonNull(fdri0);
        this.c = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelDataRequest(%s, request)", this.a));
        }
        feyh feyh0 = this.b;
        fdro fdro0 = (fdro)this.c.d.b(this.a, (feyh0.c == null ? feyg.a : feyh0.c).c, ((boolean)((feyh0.c == null ? feyg.a : feyh0.c).d ^ 1)));
        if(fdro0 == null) {
            fdny.a(fdnn.d);
            Log.w("ChannelManager", "Incoming request for inactive channel: data");
            return;
        }
        this.g = fdro0;
        if(fdro0.e != 2 && fdro0.e != 3) {
            throw new fdrn();
        }
        switch(fdro0.g) {
            case 9: {
                if((feyh0.c == null ? feyg.a : feyh0.c).e == fdro0.i) {
                    if(feyh0.d.size() <= 0x10000) {
                        if(fdro0.n == null) {
                            fdro0.n = ByteBuffer.allocate(0x10000);
                        }
                        fdro0.n.clear();
                        fdro0.n.put(feyh0.d.toByteArray());
                        fdro0.n.flip();
                        if(feyh0.e) {
                            fdro0.o = true;
                        }
                        ParcelFileDescriptor parcelFileDescriptor0 = fdro0.k;
                        if(parcelFileDescriptor0 != null) {
                            fdro0.c.d(parcelFileDescriptor0, ffdk.c);
                        }
                        fdro0.k(10);
                        return;
                    }
                    Log.w("ChannelStateMachine", "Received payload longer than max buffer size");
                    throw new fdrn();
                }
                return;
            }
            case 10: {
                if((feyh0.c == null ? feyg.a : feyh0.c).e > fdro0.i) {
                    Log.w("ChannelStateMachine", "Received new data packet before ACK of last one.");
                    throw new fdrn();
                }
                return;
            }
            case 11: {
                fdny.a(fdnn.f);
                if(!hzuw.a.b().a() || fdro0.e != 3 || fdro0.f != 7) {
                    throw new fdrn();
                }
                fdny.a(fdnn.g);
                Log.w("ChannelStateMachine", "Received data packet while channel closing and waiting for sender ACK, ignoring.");
            }
        }
    }
}

