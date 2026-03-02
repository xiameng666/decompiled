import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;

public final class eglm extends cjtm {
    private final egyo a;
    private final efzc b;
    private final String c;
    private final String d;
    private final BackupAndSyncOptInOptions e;

    public eglm(efzc efzc0, Context context0, String s, BackupAndSyncOptInOptions backupAndSyncOptInOptions0, String s1, azug azug0) {
        egyo egyo0 = egyo.d(context0);
        super(0xD0, "OptInBackupAndSync", azug0);
        this.b = efzc0;
        this.a = egyo0;
        this.c = s;
        this.e = backupAndSyncOptInOptions0;
        this.d = s1;
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
        int v = 1;
        ((gioy)giou0.b_message).c = 1;
        ((gioy)giou0.b_message).b |= 1;
        String s = this.d;
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).e = eglj.c(s) - 1;
        ((gioy)giou0.b_message).b |= 4;
        if(hwzg.f() && this.e.c) {
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).c = 22;
            ((gioy)giou0.b_message).b |= 1;
        }
        boolean z = hxba.g();
        if(!eglj.a(s)) {
            if(z) {
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 0;
                ((gioy)giou0.b_message).b |= 2;
                eglm.b(giou0);
            }
            throw new cjuh(10, String.format("Inelegibile calling package: %s", s));
        }
        try {
            this.a.g(this.c, this.e);
        }
        catch(cjuh cjuh0) {
            goto label_39;
        }
        finally {
            ((ProtoLiteBuilder)giou0).N_build();
        }
        if(z) {
            try {
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 1;
                ((gioy)giou0.b_message).b |= 2;
                eglm.b(giou0);
                goto label_48;
            }
            catch(cjuh cjuh0) {
                z = true;
            }
        label_39:
            if(z) {
                if(cjuh0.a_OperationException.i == 4) {
                    v = 4;
                }
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = v - 1;
                ((gioy)giou0.b_message).b |= 2;
                eglm.b(giou0);
            }
            throw cjuh0;
        }
    label_48:
        this.b.q(Status.b, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.q(status0, ApiMetadata.b);
    }
}

