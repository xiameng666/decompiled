final class azjw {
    public static azii a(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)azii.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (azii)hftv0;
        }
        catch(hfur hfur0) {
            throw new azjv("Invalid AggregateValue bytes", hfur0);
        }
    }

    public static azki b(String s) {
        if(s.isEmpty()) {
            return new azki(glww.a);
        }
        glwv glwv0 = new glwv(10);
        for(Object object0: gfud.e(',').l(s)) {
            glwv0.b(Integer.parseInt(((String)object0)));
        }
        return new azki(glwv0.a());
    }
}

