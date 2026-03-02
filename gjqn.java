import j..util.DesugarCollections;
import java.util.List;

public final class gjqn {
    public final ProtoLiteBuilder a;

    public gjqn(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjwt a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjwt)hftv0;
    }

    public final void b(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjwt gjwt0 = (gjwt)hftp0.b_message;
        gjwt0.b |= 8;
        gjwt0.g = v;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjwt gjwt0 = (gjwt)hftp0.b_message;
        s.getClass();
        gjwt0.b |= 1;
        gjwt0.c = s;
    }

    public final void d(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjwt gjwt0 = (gjwt)hftp0.b_message;
        gjwt0.b |= 2;
        gjwt0.e = v;
    }

    public final void e(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjwt gjwt0 = (gjwt)hftp0.b_message;
        gjwt0.b |= 16;
        gjwt0.h = v;
    }

    public final void f(Iterable iterable0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjwt gjwt0 = (gjwt)hftp0.b_message;
        hfuo hfuo0 = gjwt0.d;
        if(!hfuo0.c()) {
            gjwt0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gjwt0.d);
    }

    public final void g() {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjwt gjwt0 = (gjwt)hftp0.b_message;
        gjwt0.b |= 0x40;
        gjwt0.j = true;
    }

    public final void h() {
        List list0 = DesugarCollections.unmodifiableList(((gjwt)this.a.b_message).d);
        ibuq.e(list0, "getPollingFramesList(...)");
        new hfxu(list0);
    }
}

