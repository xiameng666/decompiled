import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class egnw extends cjtm {
    private final efzc a;
    private final ehid b;
    private final String c;
    private final Uri d;

    public egnw(efzc efzc0, Context context0, String s, Uri uri0, azug azug0) {
        ehid ehid0 = new ehid(context0);
        super(0xD0, "SyncHighResPhoto", azug0);
        this.a = efzc0;
        this.c = s;
        this.d = uri0;
        this.b = ehid0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).c = 5;
        ((gioy)giou0.b_message).b |= 1;
        String s = this.c;
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).e = ehji.a(s) - 1;
        ((gioy)giou0.b_message).b |= 4;
        try {
            this.b.b(this.d);
            this.a.y(Status.b, ApiMetadata.b);
            efpr efpr0 = efpr.a();
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 1;
            ((gioy)giou0.b_message).b |= 2;
            efpr0.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
        }
        catch(cjuh cjuh0) {
            efpr efpr1 = efpr.a();
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 0;
            ((gioy)giou0.b_message).b |= 2;
            efpr1.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
            throw cjuh0;
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.y(status0, ApiMetadata.b);
    }
}

