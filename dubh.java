import j..util.Collection.-EL;
import j..util.stream.Stream;

public final class dubh {
    public static hjzr a(byte[] arr_b) {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hjzr.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (hjzr)hftv0;
    }

    public static Stream b(hkbc hkbc0) {
        return Collection.-EL.stream(hkbc0.c).filter(new dubd()).flatMap(new dube()).filter(new dubf()).map(new dubg());
    }
}

