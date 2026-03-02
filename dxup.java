import android.os.Parcelable;
import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dxup implements eflx {
    public static final gged_interceptors a;
    public final du b;
    private final dmgi c;

    static {
        dxup.a = gged_interceptors.l(Integer.valueOf(1020));
    }

    public dxup(du du0, dmgi dmgi0) {
        this.b = du0;
        this.c = dmgi0;
    }

    public final void a(hagp hagp0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hagq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hagq hagq0 = (hagq)hftp1.b_message;
        hagq0.b = hagp0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hagq hagq1 = (hagq)hftp1.N_build();
        hagq1.getClass();
        hapr0.am = hagq1;
        hapr0.d |= 0x100;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.c.b(hapr1);
    }

    public final void b(String s, Parcelable parcelable0) {
        eflw eflw0 = new eflw();
        eflw0.a = 1020;
        eflw0.c = s;
        eflw0.d = this.b.getString(0x7F150870);  // string:common_got_it "Got it"
        eflw0.e = this.b.getString(0x7F1507F2);  // string:common_cancel "Cancel"
        eflw0.j = parcelable0;
        eflz eflz0 = eflw0.a();
        eflz0.setTargetFragment(this.b, 1020);
        fm fm0 = this.b.getFragmentManager();
        gftb.check(fm0);
        eflz0.I(fm0, null);
        this.a(hagp.j);
    }

    @Override  // eflx
    public final void g(int v, int v1, Parcelable parcelable0) {
        if(v1 == 1020) {
            if(v != -1) {
                goto label_8;
            }
            this.a(hagp.h);
            if((parcelable0 instanceof ProtoSafeParcelable)) {
                du du0 = this.b;
                if((du0 instanceof dxut)) {
                    ((dxut)du0).Z(((gtum)ftqe.c(((ProtoSafeParcelable)parcelable0), ((MessageLite)gtum.a))));
                    return;
                label_8:
                    this.a(hagp.i);
                }
            }
        }
    }
}

