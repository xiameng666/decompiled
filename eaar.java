public final class eaar implements evpo {
    public final eabb a;

    public eaar(eabb eabb0) {
        this.a = eabb0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        byte[] arr_b = (byte[])evql0.j();
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        dyex dyex0 = ((dyfy)hftv0).b == 12 ? ((dyex)((dyfy)hftv0).c) : dyex.a;
        dyim dyim0 = dyex0.c == null ? dyim.a : dyex0.c;
        dyil dyil0 = dyil.b(dyim0.c) == null ? dyil.i : dyil.b(dyim0.c);
        eabb eabb0 = this.a;
        if(dyil0.ordinal() != 5 && dyil0.ordinal() != 6) {
            dzdk dzdk0 = new dzdk(new dzzs(dzsj.a(dyil0).toString()));
            eabb0.p.l(dzdk0);
            return null;
        }
        eabb0.g();
        return null;
    }
}

