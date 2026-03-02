import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.people.contactssync.model.BackupSyncUserAction;
import com.google.android.gms.people.contactssync.model.RecordBackupSyncUserActionResponse;
import java.io.UnsupportedEncodingException;

public final class eglr extends cjtm {
    private static final ggeo a;
    private final efzc b;
    private final String c;
    private final BackupSyncUserAction d;

    static {
        eglr.a = ggeo.p(Integer.valueOf(1), egpf.b, Integer.valueOf(2), egpf.c, Integer.valueOf(3), egpf.d, Integer.valueOf(4), egpf.e, Integer.valueOf(5), egpf.f);
    }

    public eglr(efzc efzc0, String s, BackupSyncUserAction backupSyncUserAction0, azug azug0) {
        super(0xD0, "RecordBackupSyncUserAction", azug0);
        this.c = s;
        this.b = efzc0;
        this.d = backupSyncUserAction0;
    }

    private static void b(giou giou0) {
        efpr.a().c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        byte[] arr_b1;
        gfsx gfsx0;
        if(!hwxo.a.b().h()) {
            throw new cjuh(10, "The RecordBackupSyncUserAction API has been disabled");
        }
        giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).c = 9;
        ((gioy)giou0.b_message).b |= 1;
        String s = this.c;
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).e = eglj.c(s) - 1;
        ((gioy)giou0.b_message).b |= 4;
        if(!eglj.a(s)) {
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 0;
            ((gioy)giou0.b_message).b |= 2;
            eglr.b(giou0);
            throw new cjuh(10, String.format("Inelegibile calling package: %s", this.c));
        }
        if(!hwxy.a.b().d() && (this.d != null && this.d.b == 5)) {
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 0;
            ((gioy)giou0.b_message).b |= 2;
            eglr.b(giou0);
            throw new cjuh(10, "Passive user action is not supported");
        }
        try {
            efzc efzc0 = this.b;
            Status status0 = Status.b;
            BackupSyncUserAction backupSyncUserAction0 = this.d;
            try {
                egzd egzd0 = egzd.c(context0);
                if(hwxo.c()) {
                    if(hwxv.a.b().a() && backupSyncUserAction0.a == null) {
                        throw new cjuh(8, "The suggestion ID cannot be null.");
                    }
                    egyt egyt0 = egyt.a();
                    String s1 = backupSyncUserAction0.a;
                    gfsx0 = gfsx.l(((egpd)egyt0.a.get(s1)));
                    if(hwxo.a.b().i()) {
                        if(gfsx0.i()) {
                            if(!giou0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)giou0).ensureMutable();
                            }
                            ((gioy)giou0.b_message).f = 1;
                            ((gioy)giou0.b_message).b |= 8;
                        }
                        else {
                            if(!giou0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)giou0).ensureMutable();
                            }
                            ((gioy)giou0.b_message).f = 2;
                            ((gioy)giou0.b_message).b |= 8;
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)egpd.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            egpd egpd0 = (egpd)hftp0.b_message;
                            s1.getClass();
                            egpd0.b |= 1;
                            egpd0.c = s1;
                            gfsx0 = gfsx.m(((egpd)hftp0.N_build()));
                        }
                    }
                }
                else {
                    String s2 = backupSyncUserAction0.a;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gioq.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gioq)hftp1.b_message).c = 2;
                    ((gioq)hftp1.b_message).b |= 1;
                    if(s2 == null) {
                        if(hwxy.d()) {
                            egig.b("FSA2_SuggestionStorage", "key cannot be null.");
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gioq)hftp1.b_message).d = 2;
                            ((gioq)hftp1.b_message).b |= 2;
                            egzd.g(hftp1);
                        }
                        gfsx0 = gfqx.a;
                    }
                    else {
                        synchronized(egzd0) {
                            byte[] arr_b = egzd.f(s2);
                            arr_b1 = egyv0.a.get(arr_b);
                        }
                        if(arr_b1 == null) {
                            if(hwxy.d()) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((gioq)hftp1.b_message).d = 1;
                                ((gioq)hftp1.b_message).b |= 2;
                                egzd.g(hftp1);
                            }
                            gfsx0 = gfqx.a;
                        }
                        else {
                            if(hwxy.d()) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp1.b_message;
                                ((gioq)hftv0).d = 1;
                                ((gioq)hftv0).b |= 2;
                                if(!hftv0.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                gioq gioq0 = (gioq)hftp1.b_message;
                                gioq0.b |= 4;
                                gioq0.e = 1;
                                egzd.g(hftp1);
                            }
                            gfsx0 = egzd.d(arr_b1);
                        }
                    }
                }
                if(!gfsx0.i()) {
                    throw new cjuh(8, "The suggestion that user acted doesn\'t exist.");
                }
                String s3 = backupSyncUserAction0.a;
                egpd egpd1 = (egpd)gfsx0.d();
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)egpd1).jf(5, null);
                hftp2.X(((ProtoLiteMessage)egpd1));
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)egpg.a).v_newBuilder();
                egpf egpf0 = (egpf)eglr.a.get(Integer.valueOf(backupSyncUserAction0.b));
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((egpg)hftp3.b_message).c = egpf0.g;
                ((egpg)hftp3.b_message).b |= 1;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                egpd egpd2 = (egpd)hftp2.b_message;
                egpg egpg0 = (egpg)hftp3.N_build();
                egpg0.getClass();
                egpd2.d = egpg0;
                egpd2.b |= 2;
                egzd0.b(s3, ((egpd)hftp2.N_build()));
                if(!giou0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)giou0).ensureMutable();
                }
                ((gioy)giou0.b_message).d = 1;
                ((gioy)giou0.b_message).b |= 2;
                eglr.b(giou0);
            }
            catch(LevelDbException levelDbException0) {
                egig.d("RecordBackupSyncUserActionOperation", "LevelDbException: %s", new Object[]{levelDbException0.toString()});
                if(hwxo.a.b().j()) {
                    throw new cjuh(13, "Error opening level db.");
                }
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                egig.d("RecordBackupSyncUserActionOperation", "UnsupportedEncodingException: %s", new Object[]{unsupportedEncodingException0.toString()});
                throw new cjuh(13, "UnsupportedEncodingException.");
            }
            catch(hfur hfur0) {
                egig.d("RecordBackupSyncUserActionOperation", "InvalidProtocolBufferException: %s", new Object[]{hfur0.toString()});
                throw new cjuh(13, "InvalidProtocolBufferException.");
            }
            efzc0.w(status0, new RecordBackupSyncUserActionResponse(), cckf.d(bbdp.dW));
        }
        catch(SecurityException securityException0) {
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 0;
            ((gioy)giou0.b_message).b |= 2;
            eglr.b(giou0);
            throw new cjuh(8, a.ab(securityException0, "Error when reading contact count."));
        }
        catch(Exception exception0) {
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 0;
            ((gioy)giou0.b_message).b |= 2;
            eglr.b(giou0);
            throw exception0;
        }
        finally {
            ((ProtoLiteBuilder)giou0).N_build();
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.w(status0, null, ApiMetadata.b);
    }
}

