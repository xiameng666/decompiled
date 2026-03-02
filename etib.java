import android.content.Context;
import java.io.IOException;

public final class etib {
    public static final bboh a;

    static {
        etib.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public static final boolean a(String s, gjwg gjwg0, Context context0) {
        if(azql.c(context0).g(s)) {
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            gjwh.b(((gjwh)gjwg0.b_message));
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            gjwh gjwh0 = (gjwh)gjwg0.b_message;
            gjwh0.b |= 8;
            gjwh0.f = true;
            return true;
        }
        if(hyse.e()) {
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            gjwh gjwh1 = (gjwh)gjwg0.b_message;
            gjwh1.b |= 1;
            gjwh1.c = false;
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            gjwh gjwh2 = (gjwh)gjwg0.b_message;
            gjwh2.b |= 8;
            gjwh2.f = true;
            return true;
        }
        if(!gjwg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjwg0).ensureMutable();
        }
        gjwh gjwh3 = (gjwh)gjwg0.b_message;
        gjwh3.b |= 1;
        gjwh3.c = true;
        try {
            boolean z = hypp.d() ? ((gtow)ethf.a(context0, gged_interceptors.l(s), gjwg0).b.get(0)).b : ethf.b(context0, s, gjwg0).b;
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            gjwh gjwh4 = (gjwh)gjwg0.b_message;
            gjwh4.b |= 8;
            gjwh4.f = z;
            if(!z) {
                ((ggtj)etib.a.h()).x("verifyIssuerPackage - using server allowlist - returning false");
            }
            return z;
        }
        catch(IOException iOException0) {
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            gjwh gjwh5 = (gjwh)gjwg0.b_message;
            gjwh5.b |= 8;
            gjwh5.f = false;
            throw iOException0;
        }
        catch(ettj | eshj | cjuh exception0) {
            if(!gjwg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjwg0).ensureMutable();
            }
            gjwh gjwh6 = (gjwh)gjwg0.b_message;
            gjwh6.b |= 8;
            gjwh6.f = false;
            a.ae(etib.a.h(), "verifyIssuerPackage - failed to get verdict when checking server allowlist - returning false.", exception0);
            return false;
        }
    }
}

