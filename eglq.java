import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;

public final class eglq extends cjtm {
    private static final ggeo a;
    private final efzc b;
    private final String c;
    private final GetBackupSyncSuggestionRequest d;

    static {
        eglq.a = ggeo.p(Integer.valueOf(0), gjfg.a, Integer.valueOf(1), gjfg.b, Integer.valueOf(2), gjfg.c, Integer.valueOf(3), gjfg.d, Integer.valueOf(4), gjfg.e);
    }

    public eglq(efzc efzc0, String s, GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest0, azug azug0) {
        super(0xD0, "GetBackupSyncSuggestion", azug0);
        this.c = s;
        this.b = efzc0;
        this.d = getBackupSyncSuggestionRequest0;
    }

    private static final void b(giou giou0) {
        efpr.a().c(((gioy)((ProtoLiteBuilder)giou0).N_build()));
    }

    private static ProtoLiteBuilder c(int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giot.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giot)hftv0).b |= 2;
        ((giot)hftv0).d = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        giot giot0 = (giot)hftp0.b_message;
        giot0.b |= 4;
        giot0.e = v1;
        return hftp0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hwxo.a.b().f()) {
            throw new cjuh(10, "The GetBackupSyncSuggestion API has been disabled");
        }
        giou giou0 = (giou)((ProtoLiteMessage)gioy.a).v_newBuilder();
        if(!giou0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giou0).ensureMutable();
        }
        ((gioy)giou0.b_message).c = 8;
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
            eglq.b(giou0);
            throw new cjuh(10, String.format("Inelegibile calling package: %s", this.c));
        }
        try {
            egyo egyo0 = egyo.d(context0);
            egyq egyq0 = new egyq(context0);
            egys egys0 = new egys(context0);
            ehjc ehjc0 = new ehjc(cchj.b(context0));
            GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest0 = this.d;
            GetBackupSyncSuggestionResponse getBackupSyncSuggestionResponse0 = eglp.a(getBackupSyncSuggestionRequest0, context0, egyq0, egys0, ehjc0, egyo0);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
            this.b.k(Status.b, getBackupSyncSuggestionResponse0, apiMetadata0);
            gjfg gjfg0 = (gjfg)eglq.a.getOrDefault(Integer.valueOf(getBackupSyncSuggestionResponse0.a), gjfg.a);
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 1;
            ((gioy)giou0.b_message).b |= 2;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giot.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((giot)hftv0).c = gjfg0.f;
            ((giot)hftv0).b |= 1;
            int v1 = getBackupSyncSuggestionRequest0.a;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((giot)hftv1).b |= 2;
            ((giot)hftv1).d = v1;
            int v2 = getBackupSyncSuggestionRequest0.b;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            giot giot0 = (giot)hftp0.b_message;
            giot0.b |= 4;
            giot0.e = v2;
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            gioy gioy0 = (gioy)giou0.b_message;
            giot giot1 = (giot)hftp0.N_build();
            giot1.getClass();
            gioy0.g = giot1;
            gioy0.b |= 16;
            eglq.b(giou0);
        }
        catch(SecurityException securityException0) {
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 0;
            ((gioy)giou0.b_message).b |= 2;
            ProtoLiteBuilder hftp1 = eglq.c(this.d.a, this.d.b);
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            gioy gioy1 = (gioy)giou0.b_message;
            giot giot2 = (giot)hftp1.N_build();
            giot2.getClass();
            gioy1.g = giot2;
            gioy1.b |= 16;
            eglq.b(giou0);
            throw new cjuh(8, a.ab(securityException0, "Error when reading contact count."));
        }
        catch(eglw | eglv exception1) {
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 6;
            ((gioy)giou0.b_message).b |= 2;
            ProtoLiteBuilder hftp2 = eglq.c(this.d.a, this.d.b);
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            gioy gioy2 = (gioy)giou0.b_message;
            giot giot3 = (giot)hftp2.N_build();
            giot3.getClass();
            gioy2.g = giot3;
            gioy2.b |= 16;
            eglq.b(giou0);
            throw new cjuh(8, a.ab(exception1, "Error when making recommendations."));
        }
        catch(Exception exception0) {
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            ((gioy)giou0.b_message).d = 0;
            ((gioy)giou0.b_message).b |= 2;
            ProtoLiteBuilder hftp3 = eglq.c(this.d.a, this.d.b);
            if(!giou0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giou0).ensureMutable();
            }
            gioy gioy3 = (gioy)giou0.b_message;
            giot giot4 = (giot)hftp3.N_build();
            giot4.getClass();
            gioy3.g = giot4;
            gioy3.b |= 16;
            eglq.b(giou0);
            throw exception0;
        }
        finally {
            ((ProtoLiteBuilder)giou0).N_build();
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.k(status0, null, ApiMetadata.b);
    }
}

