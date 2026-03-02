import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class atny extends atnu {
    public final long b;
    public final String c;
    public final Set d;
    public ProtoLiteBuilder e;

    public atny(Context context0, long v, int v1) {
        super(context0, v1);
        this.e = null;
        this.c = UUID.randomUUID().toString();
        this.b = v;
        this.d = new HashSet();
    }

    public final atnx b(Context context0, String s, boolean z) {
        return new atnx(this, context0, s, this.a, z);
    }

    public final void c(String s) {
        if(atnz.b && this.e == null) {
            ((ggtj)atnz.a.i()).x("recordActualRestoredPackage() called before any restore response received");
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gibe gibe0 = (gibe)hftp0.b_message;
        s.getClass();
        gibe0.b |= 1;
        gibe0.c = s;
        gibe gibe1 = (gibe)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.e;
        gibf gibf0 = ((ghys)hftp1.b_message).h;
        if(gibf0 == null) {
            gibf0 = gibf.a;
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gibf0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gibf0));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gibf gibf1 = (gibf)hftp2.b_message;
        gibe1.getClass();
        hfuo hfuo0 = gibf1.e;
        if(!hfuo0.c()) {
            gibf1.e = ProtoLiteMessage.E(hfuo0);
        }
        gibf1.e.add(gibe1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gibf gibf2 = (gibf)hftp2.N_build();
        gibf2.getClass();
        ghys0.h = gibf2;
        ghys0.b |= 0x20;
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = this.e;
        if(hftp0 != null) {
            this.a(hftp0, ghyr.c);
            this.d.remove(this.e);
        }
        ProtoLiteBuilder hftp1 = aqra.b();
        this.e = hftp1;
        String s = this.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        s.getClass();
        ghys0.b |= 1;
        ghys0.e = s;
        ProtoLiteBuilder hftp2 = this.e;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gibf.a).v_newBuilder();
        long v1 = this.b;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((gibf)hftv0).b |= 2;
        ((gibf)hftv0).d = v1;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        gibf gibf0 = (gibf)hftp3.b_message;
        gibf0.b |= 1;
        gibf0.c = v;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ghys ghys1 = (ghys)hftp2.b_message;
        gibf gibf1 = (gibf)hftp3.N_build();
        gibf1.getClass();
        ghys1.h = gibf1;
        ghys1.b |= 0x20;
        this.d.add(this.e);
    }
}

