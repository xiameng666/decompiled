import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;

public final class eglk extends cjtm {
    private final egyo a;
    private final efzc b;
    private final String c;

    public eglk(efzc efzc0, Context context0, String s, azug azug0) {
        egyo egyo0 = egyo.d(context0);
        super(0xD0, "GetBackupAndSyncOptInState", azug0);
        this.c = s;
        this.a = egyo0;
        this.b = efzc0;
    }

    private static void b(giou giou0) {
        efpr.a().c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        BackupAndSyncOptInState backupAndSyncOptInState0;
        giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).c = 3;
        boolean z = true;
        ((gioy)giou0.b_message).b |= 1;
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        String s = this.c;
        int v = eglj.c(s);
        ((gioy)giou0.b_message).e = v - 1;
        ((gioy)giou0.b_message).b |= 4;
        boolean z1 = hxba.g();
        boolean z2 = eglj.a(s);
        boolean z3 = eglj.b(s);
        if(!z2 && !z3) {
            if(z1) {
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 0;
                ((gioy)giou0.b_message).b |= 2;
                eglk.b(giou0);
            }
            throw new cjuh(10, String.format("Inelegibile calling package: %s", this.c));
        }
        try {
            try {
                hxba hxba0 = hxba.a;
                if(!hxba0.e().t() || v == 2 || hxba.h() && hwyp.p()) {
                    efzc efzc0 = this.b;
                    Status status0 = Status.b;
                    if(hxba0.e().C() && z3 && !z2) {
                        backupAndSyncOptInState0 = this.a.b();
                        if(backupAndSyncOptInState0.c == 5) {
                            backupAndSyncOptInState0 = new BackupAndSyncOptInState(backupAndSyncOptInState0.a, backupAndSyncOptInState0.b, 3, backupAndSyncOptInState0.d);
                        }
                    }
                    else {
                        backupAndSyncOptInState0 = this.a.b();
                    }
                    efzc0.i(status0, backupAndSyncOptInState0, cckf.d(bbdp.dW));
                    if(z1) {
                        goto label_35;
                    }
                }
                else {
                    goto label_56;
                }
                goto label_82;
            }
            catch(Exception exception0) {
                z = z1;
                goto label_72;
            }
            try {
            label_35:
                if(hxba.j() && hxba0.e().P() && z2) {
                    if(!giou0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giou0).ensureMutable();
                    }
                    gioy gioy0 = (gioy)giou0.b_message;
                    s.getClass();
                    gioy0.b |= 0x20;
                    gioy0.h = s;
                }
                else if(hxba.k() && hxba0.e().O() && z3) {
                    if(!giou0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)giou0).ensureMutable();
                    }
                    gioy gioy1 = (gioy)giou0.b_message;
                    s.getClass();
                    gioy1.b |= 0x20;
                    gioy1.h = s;
                }
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 1;
                ((gioy)giou0.b_message).b |= 2;
                eglk.b(giou0);
                goto label_82;
            }
            catch(Exception exception0) {
                goto label_72;
            }
            try {
            label_56:
                BackupAndSyncOptInState backupAndSyncOptInState1 = new BackupAndSyncOptInState(null, new int[0], 4, new String[0]);
                ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
                this.b.i(Status.b, backupAndSyncOptInState1, apiMetadata0);
                goto label_63;
            }
            catch(Exception exception0) {
            }
        }
        catch(Throwable throwable0) {
            ((ProtoLiteBuilder)giou0).N_build();
            throw throwable0;
        }
        z = z1;
        goto label_72;
    label_63:
        if(z1) {
            try {
                efpr efpr0 = efpr.a();
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 1;
                ((gioy)giou0.b_message).b |= 2;
                efpr0.c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
            }
            catch(Exception exception0) {
                try {
                label_72:
                    if(z) {
                        if(!giou0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)giou0).ensureMutable();
                        }
                        ((gioy)giou0.b_message).d = 0;
                        ((gioy)giou0.b_message).b |= 2;
                        eglk.b(giou0);
                    }
                    throw exception0;
                }
                catch(Throwable throwable0) {
                    ((ProtoLiteBuilder)giou0).N_build();
                    throw throwable0;
                }
            }
            catch(Throwable throwable0) {
                ((ProtoLiteBuilder)giou0).N_build();
                throw throwable0;
            }
        }
    label_82:
        ((ProtoLiteBuilder)giou0).N_build();
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.i(status0, null, ApiMetadata.b);
    }
}

