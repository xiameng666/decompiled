import android.content.Intent;
import java.nio.charset.StandardCharsets;

final class dwgj extends ibsl implements ibtw {
    int a;
    final dwgo b;
    final gged_interceptors c;
    final gged_interceptors d;

    public dwgj(dwgo dwgo0, gged_interceptors gged0, gged_interceptors gged1, ibrl ibrl0) {
        this.b = dwgo0;
        this.c = gged0;
        this.d = gged1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwgj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwgj(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                if(dvkx.d()) {
                    this.a = 1;
                    object0 = this.b.e(this.c, this);
                    if(object0 != object1) {
                        goto label_9;
                    }
                    return object1;
                }
                break;
            }
            case 1: {
            label_9:
                if(((Boolean)object0).booleanValue()) {
                    dwgo dwgo0 = this.b;
                    gjzy gjzy0 = gjzy.b;
                    fhvz fhvz0 = fhwa.a(0x403D0);
                    fhvz0.c(fhwp.b(dwgo0.c));
                    gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                    gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjzz.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    ibuq.f(gjzy0, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjzz)hftp0.b_message).c = gjzy0.c;
                    ((gjzz)hftp0.b_message).b |= 1;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    ibuq.f(((gjzz)hftv0), "value");
                    ProtoLiteBuilder hftp1 = gjzs0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gkbe gkbe0 = (gkbe)hftp1.b_message;
                    ((gjzz)hftv0).getClass();
                    gkbe0.t = (gjzz)hftv0;
                    gkbe0.b |= 0x20000;
                    gjca0.f(gjzs0.a());
                    String s = dwgo0.j.a();
                    gjca0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
                    fhvz0.b(douc.a(gjca0.a()));
                    fhwa fhwa0 = fhvz0.a();
                    dwgo0.i.a(fhwa0);
                    dwgo0.j();
                    icck icck0 = lsc.a(dwgo0);
                    frxf[] arr_frxf = new frxf[1];
                    Intent intent0 = dlnf.aX("Can\'t add pass", "Aadhaar cards are not supported for saving as Wallet passes.\n\nPlease scan a different document.").setFlags(0x6000000);
                    ibuq.e(intent0, "setFlags(...)");
                    arr_frxf[0] = new frxg(intent0);
                    dwgo0.l(icck0, arr_frxf);
                    return ibom.a;
                }
                break;
            }
            default: {
                return ibom.a;
            }
        }
        this.a = 2;
        return this.b.h(this.d, this) == object1 ? object1 : ibom.a;
    }
}

