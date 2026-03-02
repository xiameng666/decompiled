import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.internal.RpcResponse;
import j..util.Objects;

final class ffiq extends ffee {
    final String c;
    final String d;
    final byte[] e;
    final fdiy f;
    final fdpl g;
    final MessageOptions h;
    final fflv i;

    public ffiq(fflv fflv0, String s, String s1, String s2, byte[] arr_b, fdiy fdiy0, fdpl fdpl0, MessageOptions messageOptions0) {
        this.c = s1;
        this.d = s2;
        this.e = arr_b;
        this.f = fdiy0;
        this.g = fdpl0;
        this.h = messageOptions0;
        Objects.requireNonNull(fflv0);
        this.i = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        try {
            String s = this.d;
            byte[] arr_b = this.e;
            fdiy fdiy0 = this.f;
            fflv fflv0 = this.i;
            String s1 = fflv0.u(this.c);
            if(s1 != null) {
                ffip ffip0 = new ffip(this, s, fdiy0);
                if(fflv0.m.g(this.g, s1, s, arr_b, ffip0, null, this.h) == -1) {
                    try {
                        fdiy0.S(new RpcResponse(4000, -1, new byte[0]));
                    }
                    catch(RemoteException unused_ex) {
                        Log.e("WearableService", "Failed to deliver TARGET_NODE_NOT_CONNECTED back to the sender app");
                    }
                }
            }
        }
        catch(RuntimeException runtimeException0) {
            Log.e("WearableService", "sendRequest: exception during processing: node " + this.c + ", path " + this.d + ", data " + (this.e == null ? "null" : Integer.toString(this.e.length)), runtimeException0);
            RpcResponse rpcResponse0 = new RpcResponse(8, -1, new byte[0]);
            this.f.S(rpcResponse0);
        }
    }
}

