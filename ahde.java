import j..util.function.BiFunction.-CC;
import java.security.KeyPair;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class ahde implements BiFunction {
    public final BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        ECPoint eCPoint0 = ((ECPublicKey)((KeyPair)object1).getPublic()).getW();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgjk.a).v_newBuilder();
        ByteString hfsf0 = ByteString.A(((String)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hgjk)hftv0).b |= 1;
        ((hgjk)hftv0).e = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgjk)hftp0.b_message).f = 1;
        ((hgjk)hftp0.b_message).b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgjl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hgjl)hftp1.b_message).c = 1;
        ((hgjl)hftp1.b_message).b |= 1;
        ByteString hfsf1 = ByteString.copyFrom(eCPoint0.getAffineX().toByteArray());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hgjl hgjl0 = (hgjl)hftp1.b_message;
        hgjl0.b |= 2;
        hgjl0.d = hfsf1;
        ByteString hfsf2 = ByteString.copyFrom(eCPoint0.getAffineY().toByteArray());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hgjl hgjl1 = (hgjl)hftp1.b_message;
        hgjl1.b |= 4;
        hgjl1.e = hfsf2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjk hgjk0 = (hgjk)hftp0.b_message;
        hgjl hgjl2 = (hgjl)hftp1.N_build();
        hgjl2.getClass();
        hgjk0.d = hgjl2;
        hgjk0.c = 4;
        return (hgjk)hftp0.N_build();
    }
}

