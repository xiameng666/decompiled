import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class egln extends cjtm {
    private final egyo a;
    private final efzc b;
    private final String c;

    public egln(efzc efzc0, Context context0, String s, azug azug0) {
        egyo egyo0 = egyo.d(context0);
        super(0xD0, "OptOutBackupAndSync", azug0);
        this.a = egyo0;
        this.b = efzc0;
        this.c = s;
    }

    private static void b(giou giou0) {
        efpr.a().c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).c = 2;
        boolean z = true;
        ((gioy)giou0.b_message).b |= 1;
        String s = this.c;
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).e = eglj.c(s) - 1;
        ((gioy)giou0.b_message).b |= 4;
        boolean z1 = hxba.g();
        if(!eglj.a(s)) {
            if(z1) {
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 0;
                ((gioy)giou0.b_message).b |= 2;
                egln.b(giou0);
            }
            throw new cjuh(10, String.format("Inelegibile calling package: %s", s));
        }
        try {
            this.a.h();
        }
        catch(Exception exception0) {
            z = z1;
            goto label_34;
        }
        finally {
            ((ProtoLiteBuilder)giou0).N_build();
        }
        if(z1) {
            try {
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 1;
                ((gioy)giou0.b_message).b |= 2;
                egln.b(giou0);
                goto label_41;
            }
            catch(Exception exception0) {
            }
        label_34:
            if(z) {
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 0;
                ((gioy)giou0.b_message).b |= 2;
                egln.b(giou0);
            }
            throw exception0;
        }
    label_41:
        this.b.v(Status.b, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.v(status0, ApiMetadata.b);
    }
}

