import java.util.List;
import java.util.TimeZone;

public final class dwik implements dwky {
    public final dwil a;
    public final dpue b;

    public dwik(dwil dwil0, dpue dpue0) {
        this.a = dwil0;
        this.b = dpue0;
    }

    @Override  // dwky
    public final void a(String s, List list0) {
        dvgi dvgi0 = this.a.a;
        dwii dwii0 = new dwii(this.a, this.b);
        dpud dpud0 = new dpud(new dwij(this.a, this.b), dwii0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guzj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guzj guzj0 = (guzj)hftp0.b_message;
        s.getClass();
        guzj0.c = s;
        guxk guxk0 = (guxk)((ProtoLiteMessage)guxl.a).v_newBuilder();
        guxk0.a(list0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guzj guzj1 = (guzj)hftp0.b_message;
        guxl guxl0 = (guxl)((ProtoLiteBuilder)guxk0).N_build();
        guxl0.getClass();
        guzj1.d = guxl0;
        guzj1.b |= 1;
        String s1 = TimeZone.getDefault().getID();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guzj guzj2 = (guzj)hftp0.b_message;
        s1.getClass();
        guzj2.e = s1;
        guzj guzj3 = (guzj)hftp0.N_build();
        dptv.l(dvgi0.b, dpuj.cE, ((MessageLite)guzj3), ((MessageLite)guzk.a), dpud0);
    }
}

