import android.content.Context;
import java.util.concurrent.ExecutionException;

public final class dxfi implements dnqb {
    public ibrt a;
    public dxfs b;
    public fhwb c;
    public edtc d;
    private static final bboh e;
    private dxff f;

    static {
        dxfi.e = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        Integer integer0;
        fhwb fhwb0;
        hwpy.d();
        if(hwpy.c()) {
            this.d();
            this.c();
            if(hwpv.c()) {
                try {
                    fhwb0 = null;
                    ibrt ibrt0 = this.a;
                    if(ibrt0 == null) {
                        ibuq.j("coroutineContext");
                        ibrt0 = null;
                    }
                    integer0 = (Integer)icpu.e(iccl.b(ibrt0), new dxfh(this, null)).get();
                }
                catch(InterruptedException interruptedException0) {
                    ((ggtj)dxfi.e.j()).B("Attempting to warm up PIA for Pix was interrupted", interruptedException0);
                    integer0 = (int)1;
                }
                catch(ExecutionException executionException0) {
                    ((ggtj)dxfi.e.j()).B("Attempting to warm up PIA for Pix failed to execute", executionException0);
                    integer0 = (int)1;
                }
                ibuq.c(integer0);
                int v = integer0.intValue();
                fhwb fhwb1 = this.c;
                if(fhwb1 == null) {
                    ibuq.j("semanticLogger");
                }
                else {
                    fhwb0 = fhwb1;
                }
                fhvz fhvz0 = fhwa.a(0x40BA1);
                fhvz0.c(fhwp.c());
                gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                gjir gjir0 = gjiq.a(((ProtoLiteMessage)gjcj.a).v_newBuilder());
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjci.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjci gjci0 = (gjci)hftp0.b_message;
                gjci0.b |= 1;
                gjci0.c = v == 0;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((gjci)hftv0), "value");
                ProtoLiteBuilder hftp1 = gjir0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjcj gjcj0 = (gjcj)hftp1.b_message;
                ((gjci)hftv0).getClass();
                gjcj0.c = (gjci)hftv0;
                gjcj0.b = 2;
                gjca0.e(gjir0.a());
                fhvz0.b(fsdn.a(gjca0.a()));
                fhwb0.a(fhvz0.a());
                return v;
            }
        }
        return 2;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        hwpy.d();
        if(hwpy.c()) {
            this.d();
            this.c();
            if(hwpv.c() && context0 != null) {
                clkn clkn0 = new clkn();
                clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
                clkn0.e(0L, 1L);
                clkn0.q("pix.risk.oneoff.init");
                clko clko0 = clkn0.a();
                cljp.a(context0).f(clko0);
                clks clks0 = new clks();
                clks0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
                clks0.q("pix.risk.init");
                clks0.l(true);
                clks0.a = clkz.o;
                clks0.v(2);
                clla clla0 = clks0.a();
                cljp.a(context0).f(clla0);
            }
        }
    }

    public final void c() {
        if(this.d != null) {
            return;
        }
        ibuq.j("pixStateProvider");
    }

    private final void d() {
        if(this.f == null) {
            this.f = new dxff();
        }
        dxff dxff0 = this.f;
        if(dxff0 != null) {
            dxff0.inject(this);
        }
    }
}

