import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;

public final class eaej extends dokz implements fshb {
    public eaca a;
    private eagu b;
    private boolean c;

    @Override  // fshb
    public final int kd() {
        return hwle.e() ? 1 : 3;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        new dzuz(new dzpy(this), doly0).inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.b = dzpw.c(this.getArguments());
        if(bundle0 != null) {
            this.c = true;
        }
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        eagw eagw0 = eagv.a(((ProtoLiteMessage)eagu.a).v_newBuilder());
        eagu eagu0 = this.b;
        eaca eaca0 = null;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
        ibuq.e(dyna0, "getServiceProvider(...)");
        eagw0.d(dyna0);
        eagu eagu1 = eagw0.a();
        if(this.c) {
            eaca eaca1 = this.a;
            if(eaca1 == null) {
                ibuq.j("provisionFlowHelper");
            }
            else {
                eaca0 = eaca1;
            }
            eaca0.f(new eabt(), eagu1);
            return;
        }
        this.c = true;
        eagu eagu2 = this.b;
        if(eagu2 == null) {
            ibuq.j("provisionData");
            eagu2 = null;
        }
        if((eagt.b(eagu2.d) == null ? eagt.k : eagt.b(eagu2.d)).ordinal() != 4) {
            eagu eagu3 = this.b;
            if(eagu3 == null) {
                ibuq.j("provisionData");
            }
            else {
                eaca0 = eagu3;
            }
            String s = String.format("Can not identify the external for user purpose %s", Arrays.copyOf(new Object[]{(eagt.b(eaca0.d) == null ? eagt.k : eagt.b(eaca0.d)).name()}, 1));
            ibuq.e(s, "format(...)");
            throw new IllegalStateException(s);
        }
        Context context0 = this.requireContext();
        eagu eagu4 = this.b;
        if(eagu4 == null) {
            ibuq.j("provisionData");
            eagu4 = null;
        }
        this.startActivity(frxe.a(context0, ((String)dzdl.a((dyna.b(eagu4.c) == null ? dyna.k : dyna.b(eagu4.c))).e.get()), "android.intent.action.VIEW", null, null).setFlags(0x10000000));
    }
}

