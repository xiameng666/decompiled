import android.content.Context;
import j..util.DesugarCollections;
import java.util.Map;

public final class arue {
    public final arto a;
    public final Context b;
    public final baun c;
    public final ggeo d;

    public arue(Context context0) {
        this.c = new aqql(new String[]{"ManagerServiceState"});
        this.d = ggeo.l(aqfx.i.name(), "com.google.android.gms");
        this.b = context0;
        this.a = arto.a(context0);
    }

    public final void a(String s, int v, float f) {
        arto arto0 = this.a;
        artu artu0 = arto0.b();
        Map map0 = DesugarCollections.unmodifiableMap(artu0.c);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)artp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((artp)hftv0).b |= 1;
        ((artp)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        artp artp0 = (artp)hftp1.b_message;
        artp0.b |= 2;
        artp0.d = f;
        artp artp1 = (artp)hftp1.N_build();
        if(map0.containsKey(s)) {
            arts arts0 = (arts)map0.get(s);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)arts.a).w(((ProtoLiteMessage)arts0));
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            arts.b(((arts)hftp2.b_message));
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            arts arts1 = (arts)hftp2.b_message;
            artp1.getClass();
            arts1.i = artp1;
            arts1.b |= 0x40;
            hftp0.cS(s, ((arts)hftp2.N_build()));
        }
        else {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)arts.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            arts.b(((arts)hftp3.b_message));
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            arts arts2 = (arts)hftp3.b_message;
            artp1.getClass();
            arts2.i = artp1;
            arts2.b |= 0x40;
            hftp0.cS(s, ((arts)hftp3.N_build()));
        }
        arto0.c(((artu)hftp0.N_build()));
    }

    final void b(String s, boolean z, int v, float f) {
        ProtoLiteBuilder hftp2;
        int v1;
        arto arto0 = this.a;
        artu artu0 = arto0.b();
        Map map0 = DesugarCollections.unmodifiableMap(artu0.c);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)artp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((artp)hftv0).b |= 1;
        ((artp)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        artp artp0 = (artp)hftp1.b_message;
        artp0.b |= 2;
        artp0.d = f;
        artp artp1 = (artp)hftp1.N_build();
        if(map0.containsKey(s)) {
            arts arts0 = (arts)map0.get(s);
            v1 = arts0.h;
            hftp2 = ((ProtoLiteMessage)arts.a).w(((ProtoLiteMessage)arts0));
        }
        else {
            hftp2 = ((ProtoLiteMessage)arts.a).v_newBuilder();
            v1 = 0;
        }
        if(!z) {
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            arts arts1 = (arts)hftp2.b_message;
            arts1.b |= 0x20;
            arts1.h = v1 + 1;
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((arts)hftv1).b |= 1;
        ((arts)hftv1).c = z;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        arts arts2 = (arts)hftp2.b_message;
        artp1.getClass();
        arts2.i = artp1;
        arts2.b |= 0x40;
        hftp0.cS(s, ((arts)hftp2.N_build()));
        arto0.c(((artu)hftp0.N_build()));
    }

    public final void c(String s, int v) {
        arto arto0 = this.a;
        artu artu0 = arto0.b();
        Map map0 = DesugarCollections.unmodifiableMap(artu0.c);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu0));
        if(map0.containsKey(s)) {
            arts arts0 = (arts)map0.get(s);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arts.a).w(((ProtoLiteMessage)arts0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((arts)hftp1.b_message).f = v - 1;
            ((arts)hftp1.b_message).b |= 8;
            hftp0.cS(s, ((arts)hftp1.N_build()));
        }
        else {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)arts.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((arts)hftp2.b_message).f = v - 1;
            ((arts)hftp2.b_message).b |= 8;
            hftp0.cS(s, ((arts)hftp2.N_build()));
        }
        arto0.c(((artu)hftp0.N_build()));
    }
}

