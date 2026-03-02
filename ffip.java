import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.RpcResponse;
import j..util.Objects;

final class ffip implements ffeq {
    final String a;
    final fdiy b;
    final ffiq c;

    public ffip(ffiq ffiq0, String s, fdiy fdiy0) {
        this.a = s;
        this.b = fdiy0;
        Objects.requireNonNull(ffiq0);
        this.c = ffiq0;
        super();
    }

    @Override  // ffeq
    public final void a(int v, byte[] arr_b) {
        ffmn.e("WearableService", "sendResponse: %s; %s", new Object[]{this.c.i.e, this.a});
        try {
            RpcResponse rpcResponse0 = new RpcResponse(0, v, arr_b);
            this.b.S(rpcResponse0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WearableService", String.format("Failed to deliver response back to the sender app. %s; %s", this.c.i.e, this.a), remoteException0);
        }
    }

    @Override  // ffeq
    public final void b(int v) {
        ffmn.e("WearableService", "sendTimeout: %s; %s", new Object[]{this.c.i.e, this.a});
        try {
            RpcResponse rpcResponse0 = new RpcResponse(15, -1, new byte[0]);
            this.b.S(rpcResponse0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WearableService", String.format("Failed to deliver request timeout back to the sender app. %s; %s", this.c.i.e, this.a), remoteException0);
        }
    }
}

