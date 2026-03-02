import java.util.ArrayList;
import java.util.List;

public final class eqmf {
    public final gjna a;
    public final List b;

    public eqmf(gjna gjna0) {
        this.b = new ArrayList(0);
        gftb.check(gjna0);
        this.a = gjna0;
    }

    public final gjnb a() {
        gjna gjna0 = this.a;
        if(!gjna0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjna0).ensureMutable();
        }
        ((gjnb)gjna0.b_message).e = hfty.a;
        gjna0.a(this.b);
        return (gjnb)((ProtoLiteBuilder)gjna0).N_build();
    }

    public final void b(boolean z) {
        gjna gjna0 = this.a;
        if(!gjna0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjna0).ensureMutable();
        }
        gjnb gjnb0 = (gjnb)gjna0.b_message;
        gjnb0.b |= 1;
        gjnb0.c = z;
    }
}

