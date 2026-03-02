import j..util.Objects;
import java.io.File;
import java.io.IOException;

final class arjd extends arkp {
    final hkyj a;
    final arjh b;

    public arjd(arjh arjh0, arin arin0, hkyj hkyj0, hkyj hkyj1) {
        this.a = hkyj1;
        Objects.requireNonNull(arjh0);
        this.b = arjh0;
        super(arin0, hkyj0);
    }

    @Override  // arkq
    protected final void d() {
        arjh.p.m("ItemRequest stream expectation failed.", new Object[0]);
        this.b.l(2, "ItemRequest stream expectation failed.", false);
    }

    @Override  // arkp
    protected final MessageLite e(byte[] arr_b) {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ascb.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (ascb)hftv0;
    }

    @Override  // arkp
    protected final void f(MessageLite hfvm0) {
        arjh arjh0 = this.b;
        ascb ascb0 = (ascb)hfvm0;
        if(!arjh0.y || ((Boolean)arjh0.g.mr()).booleanValue() && !this.a.equals(hkyj.c)) {
            arjh.p.m("The protocol is using USB medium. Skipping file payload transfer.", new Object[0]);
        }
        else if(!((Boolean)arjh0.f.mr()).booleanValue()) {
            arjh.p.m("The protocol is Wi-fi D2D but file payload feature is disabled by flag.", new Object[0]);
        }
        else {
            if((ascb0.b & 4) != 0 && ascb0.e) {
                try {
                    File file0 = arjh0.s.a((ascb0.c == null ? asbk.a : ascb0.c)).a((ascb0.d == null ? asby.a : ascb0.d));
                    if(file0.length() == 0L) {
                        arjh.p.m("The length of the file is 0. Proceeding with stream payload for item: %s.", new Object[]{(ascb0.d == null ? asby.a : ascb0.d).e});
                        arjh0.u(ascb0, hkyj.c);
                        return;
                    }
                    arjh0.e.l(file0, new ariu(ascb0));
                }
                catch(IOException unused_ex) {
                    arjh.p.h("file request failed, processing with stream request for item: " + (ascb0.d == null ? asby.a : ascb0.d).e, new Object[0]);
                    arjh0.u(ascb0, hkyj.c);
                }
                return;
            }
            arjh.p.m("Skipping file payload feature for flavor: %s.", new Object[]{aqhj.a((ascb0.c == null ? asbk.a : ascb0.c))});
        }
        this.b.u(ascb0, this.a);
    }
}

