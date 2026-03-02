import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;

@Deprecated
public final class egll extends cjtm {
    private final egyq a;
    private final egys b;
    private final efzc c;
    private final String d;

    public egll(efzc efzc0, Context context0, String s, azug azug0) {
        egyq egyq0 = new egyq(context0);
        egys egys0 = new egys(context0);
        super(0xD0, "GetBackupAndSyncSuggestion", azug0);
        this.d = s;
        this.a = egyq0;
        this.b = egys0;
        this.c = efzc0;
    }

    private static final void b(giou giou0) {
        efpr.a().c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).c = 4;
        boolean z = true;
        ((gioy)giou0.b_message).b |= 1;
        String s = this.d;
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
                egll.b(giou0);
            }
            throw new cjuh(10, String.format("Ineligible calling package: %s", s));
        }
        try {
            int v1 = !hwzg.f() || !hwzg.a.c().i() ? this.b.b() : this.b.a();
            BackupAndSyncSuggestion backupAndSyncSuggestion0 = new BackupAndSyncSuggestion(this.a.g(), v1);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
            this.c.j(Status.b, backupAndSyncSuggestion0, apiMetadata0);
        }
        catch(Exception exception0) {
            z = z1;
            goto label_37;
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
                egll.b(giou0);
                return;
            }
            catch(Exception exception0) {
            }
        label_37:
            if(z) {
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 0;
                ((gioy)giou0.b_message).b |= 2;
                egll.b(giou0);
            }
            if((exception0 instanceof SecurityException)) {
                throw new cjuh(8, a.ab(exception0, "Error when reading contact count."));
            }
            throw exception0;
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.j(status0, null, ApiMetadata.b);
    }
}

