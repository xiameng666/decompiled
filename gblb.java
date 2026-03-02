public final class gblb implements ibts {
    public final String a;

    public gblb(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("\n    SELECT *\n    FROM InstantBuySessionTable\n    WHERE instantBuySessionId = ?\n    ")) {
            owg0.h(1, this.a);
            int v = oqn.b(owg0, "instantBuySessionId");
            int v1 = oqn.b(owg0, "state");
            int v2 = oqn.b(owg0, "lastUpdatedTimeMillis");
            byte[] arr_b = null;
            if(owg0.k()) {
                String s = owg0.d(v);
                if(!owg0.j(v1)) {
                    arr_b = owg0.l(v1);
                }
                ibuq.f(arr_b, "bytes");
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fbbt.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ibuq.e(((fbbt)hftv0), "parseFrom(...)");
                return new gblf(s, ((fbbt)hftv0), owg0.b(v2));
            }
        }
        return null;
    }
}

