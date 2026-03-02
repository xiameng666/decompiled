import android.content.Context;
import android.os.UserHandle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public final class fcok {
    public final faik a;
    public final List b;
    public final AtomicReference c;
    private final aqqk d;
    private final gmcg e;

    public fcok(aqqk aqqk0, faik faik0, gmcg gmcg0) {
        this.b = new CopyOnWriteArrayList();
        this.c = new AtomicReference();
        this.d = aqqk0;
        this.a = faik0;
        this.e = gmcg0;
    }

    public static fcok a(Context context0) {
        return new fcok(new aqqk(context0), faih.a(context0), new bblp(1, 9));
    }

    public final void b(Consumer consumer0) {
        evql evql0 = this.a.cp();
        fcog fcog0 = new fcog(consumer0);
        evql0.y(this.e, fcog0);
    }

    public final void c(giay giay0, int v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giaz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giaz)hftv0).c = giay0.g;
        ((giaz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giaz)hftv1).b |= 4;
        ((giaz)hftv1).e = v1;
        if(v != 0) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giaz)hftp0.b_message).d = v - 1;
            ((giaz)hftp0.b_message).b |= 2;
        }
        ProtoLiteBuilder hftp1 = fcok.e();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        giaz giaz0 = (giaz)hftp0.N_build();
        giaz0.getClass();
        ghys0.y = giaz0;
        ghys0.b |= 0x800000;
        this.g(hftp1, ghyr.s);
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gibc)hftp0.b_message).c = v - 1;
        ((gibc)hftp0.b_message).b |= 1;
        gibc gibc0 = (gibc)hftp0.N_build();
        ProtoLiteBuilder hftp1 = fcok.e();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gibc0.getClass();
        ghys0.B = gibc0;
        ghys0.b |= 0x80000000;
        this.g(hftp1, ghyr.A);
    }

    public static ProtoLiteBuilder e() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        int v = UserHandle.myUserId();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        ghys0.b |= 2;
        ghys0.f = v;
        return hftp0;
    }

    public final void f(ProtoLiteBuilder hftp0, ghyr ghyr0) {
        int v = glwy.a(hqlt.f());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        ghys0.b |= 0x200000;
        ghys0.w = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghys)hftp0.b_message).O = 0;
        ((ghys)hftp0.b_message).c |= 0x40000;
        ghys ghys1 = (ghys)hftp0.N_build();
        this.d.a(ghys1, ghyr0);
    }

    public final void g(ProtoLiteBuilder hftp0, ghyr ghyr0) {
        this.b(new fcoi(this, hftp0, ghyr0));
    }
}

