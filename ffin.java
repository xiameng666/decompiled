import android.util.Log;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import j..util.Objects;

final class ffin extends ffee {
    final fdiy c;
    final byte[] d;
    final String e;
    final String f;
    final fdpl g;
    final MessageOptions h;
    final fflv i;

    public ffin(fflv fflv0, String s, fdiy fdiy0, byte[] arr_b, String s1, String s2, fdpl fdpl0, MessageOptions messageOptions0) {
        this.c = fdiy0;
        this.d = arr_b;
        this.e = s1;
        this.f = s2;
        this.g = fdpl0;
        this.h = messageOptions0;
        Objects.requireNonNull(fflv0);
        this.i = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        SendMessageResponse sendMessageResponse0;
        try {
            fdiy fdiy0 = this.c;
            fflv fflv0 = this.i;
            String s = fflv0.u(this.e);
            if(s == null) {
                sendMessageResponse0 = new SendMessageResponse(4000, -1);
            }
            else {
                int v = fflv0.m.g(this.g, s, this.f, this.d, null, null, this.h);
                sendMessageResponse0 = v == -1 ? new SendMessageResponse(4000, -1) : new SendMessageResponse(0, v);
            }
            fdiy0.R(sendMessageResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "sendMessage: exception during processing: node " + this.e + ", path " + this.f + ", data " + (this.d == null ? "null" : Integer.toString(this.d.length)), exception0);
            SendMessageResponse sendMessageResponse1 = new SendMessageResponse(8, -1);
            this.c.R(sendMessageResponse1);
        }
    }
}

