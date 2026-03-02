import android.content.Context;
import com.google.android.libraries.photos.backup.api.AutoBackupState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aquj implements aqtz {
    public static final grnc a;
    public final aqva b;
    private static final baun c;
    private static final grns d;
    private final aqrd e;

    static {
        aquj.c = aqql.a("PhotosAidlBackupApiClient");
        aquj.a = grnc.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        gqtz gqtz0 = gqtz.S;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grns grns0 = (grns)hftp0.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        aquj.d = (grns)hftp0.N_build();
    }

    public aquj(Context context0, aqrd aqrd0) {
        aqvf aqvf0 = aqvf.b(context0, 2);
        super();
        this.e = aqrd0;
        this.b = new aqva(context0, aqvf0);
    }

    @Override  // aqtz
    @Deprecated
    public final String a(aqvd aqvd0) {
        aqua aqua0 = new aqua();
        AutoBackupState autoBackupState0 = (AutoBackupState)this.b.a(aqua0, 3, aqvd0);
        return autoBackupState0 == null ? null : autoBackupState0.a;
    }

    @Override  // aqtz
    public final void b(String s, aqvd aqvd0) {
        this.e(s, grno.c, aqvd0.a);
        if(this.f(aqvd0)) {
            aqud aqud0 = new aqud(aqvd0);
            this.b.a(aqud0, 12, aqvd0);
            return;
        }
        aquc aquc0 = new aquc();
        this.b.a(aquc0, 5, aqvd0);
    }

    @Override  // aqtz
    public final boolean c(String s, aqvd aqvd0) {
        this.e(s, grno.b, aqvd0.a);
        if(this.f(aqvd0)) {
            aque aque0 = new aque(s, aqvd0);
            return this.b.b(aque0, 11, aqvd0);
        }
        aqui aqui0 = new aqui(s);
        return this.b.b(aqui0, 4, aqvd0);
    }

    @Override  // aqtz
    public final void d(String s, aqvd aqvd0) {
        this.e(s, grno.b, aqvd0.a);
        if(this.f(aqvd0)) {
            aqug aqug0 = new aqug(s, aqvd0);
            this.b.a(aqug0, 13, aqvd0);
            return;
        }
        aquf aquf0 = new aquf(s);
        this.b.a(aquf0, 6, aqvd0);
    }

    private final void e(String s, grno grno0, grkh grkh0) {
        try {
            aqrd aqrd0 = this.e;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
            gqub gqub0 = gqub.t;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((grku)hftp0.b_message).c = gqub0.mk;
            ((grku)hftp0.b_message).b |= 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grjl.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((grnp)hftp3.b_message).c = grno0.d;
            ((grnp)hftp3.b_message).b |= 1;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grjl grjl0 = (grjl)hftp2.b_message;
            grnp grnp0 = (grnp)hftp3.N_build();
            grnp0.getClass();
            grjl0.i = grnp0;
            grjl0.b |= 0x100;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkv grkv0 = (grkv)hftp1.b_message;
            grjl grjl1 = (grjl)hftp2.N_build();
            grjl1.getClass();
            grkv0.h = grjl1;
            grkv0.b |= 8;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grku grku0 = (grku)hftp0.b_message;
            grkv grkv1 = (grkv)hftp1.N_build();
            grkv1.getClass();
            grku0.d = grkv1;
            grku0.b |= 2;
            evrg.o(aqrd0.a(s, ((grku)hftp0.N_build()), aquj.d, grkh0), hqhe.b(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aquj.c.n("Unable to log consent on Photos API call", exception0, new Object[0]);
        }
    }

    private final boolean f(aqvd aqvd0) {
        aquh aquh0 = new aquh();
        Integer integer0 = (Integer)this.b.a(aquh0, 10, aqvd0);
        return integer0 != null && ((int)integer0) >= 2;
    }
}

