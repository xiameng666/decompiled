import android.widget.EditText;
import com.google.android.gms.significantplaces.settings.ConfirmPlaceChimeraActivity;

final class epis extends ibsl implements ibtw {
    int a;
    final String b;
    final ConfirmPlaceChimeraActivity c;
    final int d;
    final String e;
    final EditText f;
    final String g;
    final String h;
    final double i;
    final double j;

    public epis(String s, ConfirmPlaceChimeraActivity confirmPlaceChimeraActivity0, int v, String s1, EditText editText0, String s2, String s3, double f, double f1, ibrl ibrl0) {
        this.b = s;
        this.c = confirmPlaceChimeraActivity0;
        this.d = v;
        this.e = s1;
        this.f = editText0;
        this.g = s2;
        this.h = s3;
        this.i = f;
        this.j = f1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epis)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epis(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.b;
            String s1 = this.h;
            int v1 = this.d;
            epom epom0 = epom.a;
            epni epni0 = epnh.a(((ProtoLiteMessage)epng.a).v_newBuilder());
            epni0.g(this.e);
            epni0.d(this.f.getText().toString());
            epni0.c(this.g);
            hjil hjil0 = hjik.a(((ProtoLiteMessage)hjij.a).v_newBuilder());
            hjil0.b(this.i);
            hjil0.c(this.j);
            epni0.e(hjil0.a());
            epni0.h(((float)hydt.b()));
            if(s != null) {
                epni0.b(s);
            }
            if(s1 != null) {
                epni0.f(s1);
            }
            epnf epnf0 = epnf.b(v1) == null ? epnf.a : epnf.b(v1);
            ibuq.f(epnf0, "value");
            ProtoLiteBuilder hftp0 = epni0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            epng epng0 = (epng)hftp0.b_message;
            epng0.j = epnf0.a();
            epng0.b |= 0x80;
            epng epng1 = epni0.a();
            this.a = 1;
            if(epom0.a(epng1, this) == object1) {
                return object1;
            }
        }
        new ccmp().a((this.b == null ? bbdg.wA : bbdg.wz));
        int v2 = gkwe.a(this.d) == 0 ? 1 : gkwe.a(this.d);
        cihq cihq0 = cihq.v();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
        gixx gixx0 = gixx.B;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gixy)hftp1.b_message).d = gixx0.H;
        ((gixy)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkwh.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkwf.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gkwf)hftp3.b_message).c = v2 - 1;
        ((gkwf)hftp3.b_message).b |= 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkwh gkwh0 = (gkwh)hftp2.b_message;
        gkwf gkwf0 = (gkwf)hftp3.N_build();
        gkwf0.getClass();
        gkwh0.d = gkwf0;
        gkwh0.b |= 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixy gixy0 = (gixy)hftp1.b_message;
        gkwh gkwh1 = (gkwh)hftp2.N_build();
        gkwh1.getClass();
        gixy0.E = gkwh1;
        gixy0.b |= 0x8000000;
        cihq0.c(hftp1.N_build()).a();
        ((ggtj)epit.a.h()).B("added significant place: %s", this.e);
        this.c.setResult(-1);
        epil.b(this.c);
        return ibom.a;
    }
}

