import android.content.Context;
import com.google.android.gms.backup.internal.RestoreOperationSpan;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class aqiq extends cjtm {
    private static final baun a;
    private final asba b;
    private final aqjv c;
    private final aqys d;
    private final String e;

    static {
        aqiq.a = aqql.a("GetRestoreTimespan");
    }

    public aqiq(aqjv aqjv0, aqys aqys0, String s, asba asba0, azug azug0) {
        super(201, "GetRestoreTimespan", azug0);
        this.c = aqjv0;
        this.d = aqys0;
        this.e = s;
        this.b = asba0;
    }

    private static final RestoreOperationSpan b() {
        return new RestoreOperationSpan(aqhn.a.c, aqhn.a.d);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        RestoreOperationSpan restoreOperationSpan0;
        String s = this.e;
        aqiq.a.j("Getting the restore timespan for package: %s", new Object[]{s});
        try {
            if(!hqlt.a.o().F().b.contains(s) && hqlt.B()) {
                aqhn aqhn0 = (aqhn)((glyq)glzd.f(this.c.a.a(), new aqju(s), gmap.a)).u();
                aqys aqys0 = this.d;
                long v = aqhn0.c;
                long v1 = aqhn0.d;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gies.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gies)hftv0).b |= 1;
                ((gies)hftv0).c = v;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gies gies0 = (gies)hftp0.b_message;
                gies0.b |= 2;
                gies0.d = v1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gida.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s.getClass();
                ((gida)hftv1).b |= 1;
                ((gida)hftv1).c = s;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gida gida0 = (gida)hftp1.b_message;
                gies gies1 = (gies)hftp0.N_build();
                gies1.getClass();
                gida0.d = gies1;
                gida0.b |= 2;
                ProtoLiteBuilder hftp2 = aqra.b();
                gida gida1 = (gida)hftp1.N_build();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ghys ghys0 = (ghys)hftp2.b_message;
                gida1.getClass();
                ghys0.an = gida1;
                ghys0.d |= 0x8000;
                aqys0.x(hftp2, ghyr.aA, 0);
                restoreOperationSpan0 = new RestoreOperationSpan(aqhn0.c, aqhn0.d);
            }
            else {
                restoreOperationSpan0 = aqiq.b();
            }
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aa);
            this.b.a(restoreOperationSpan0, apiMetadata0);
        }
        catch(ExecutionException executionException0) {
            aqiq.a.f("Unable to execute GetRestoreTimespan operation for package: %s, error: %s", new Object[]{this.e, executionException0});
            this.j(Status.d);
        }
        catch(InterruptedException interruptedException0) {
            aqiq.a.f("GetRestoreTimespan operation interrupted for package: %s, error: %s", new Object[]{this.e, interruptedException0});
            this.j(Status.c);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        aqiq.a.f("Failure, status=", new Object[]{status0.toString()});
        RestoreOperationSpan restoreOperationSpan0 = aqiq.b();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aa);
        this.b.a(restoreOperationSpan0, apiMetadata0);
    }
}

