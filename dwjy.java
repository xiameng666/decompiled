import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dwjy implements ibts {
    public final dwkl a;
    public final guxv b;

    public dwjy(dwkl dwkl0, guxv guxv0) {
        this.a = dwkl0;
        this.b = guxv0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ProtoSafeParcelable protoSafeParcelable0 = (ProtoSafeParcelable)object0;
        gves gves0 = gver.a(((ProtoLiteMessage)gveu.a).v_newBuilder());
        guxp guxp0 = this.b.c == null ? guxp.a : this.b.c;
        ibuq.e(guxp0, "getGenericCard(...)");
        ibuq.f(guxp0, "value");
        ProtoLiteBuilder hftp0 = gves0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gveu gveu0 = (gveu)hftp0.b_message;
        guxp0.getClass();
        gveu0.c = guxp0;
        gveu0.b = 8;
        Valuable valuable0 = dvoo.a(gves0.e(), false);
        this.a.h.l(valuable0);
        return ibom.a;
    }
}

