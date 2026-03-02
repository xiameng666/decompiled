import java.util.List;
import java.util.TimeZone;

public final class dwia implements dwky {
    public final dwif a;
    public final dpue b;

    public dwia(dwif dwif0, dpue dpue0) {
        this.a = dwif0;
        this.b = dpue0;
    }

    @Override  // dwky
    public final void a(String s, List list0) {
        int v = this.a.c.get();
        dvgb dvgb0 = this.a.a;
        dwib dwib0 = new dwib(this.a, v, this.b);
        dpud dpud0 = new dpud(new dwic(this.a, v, this.b), dwib0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guyi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guyi guyi0 = (guyi)hftp0.b_message;
        s.getClass();
        guyi0.c = s;
        guxk guxk0 = (guxk)((ProtoLiteMessage)guxl.a).v_newBuilder();
        guxk0.a(list0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guyi guyi1 = (guyi)hftp0.b_message;
        guxl guxl0 = (guxl)((ProtoLiteBuilder)guxk0).N_build();
        guxl0.getClass();
        guyi1.d = guxl0;
        guyi1.b |= 1;
        String s1 = TimeZone.getDefault().getID();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guyi guyi2 = (guyi)hftp0.b_message;
        s1.getClass();
        guyi2.e = s1;
        guyi guyi3 = (guyi)hftp0.N_build();
        dptv.l(dvgb0.b, dpuj.cw, ((MessageLite)guyi3), ((MessageLite)guyj.a), dpud0);
    }
}

