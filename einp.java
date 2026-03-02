import j..util.Objects;

public final class einp implements azye {
    final byte[] a;

    public einp(eipz eipz0, byte[] arr_b) {
        this.a = arr_b;
        Objects.requireNonNull(eipz0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        boolean z = false;
        try {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fppb.a), this.a, 0, this.a.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            fppb fppb0 = (fppb)hftv0;
        }
        catch(hfur unused_ex) {
            return;
        }
        for(Object object1: ((fppv)object0).b.f) {
            fpoj fpoj0 = (fpoj)object1;
            if(fpos.a.a(fppb0.b) && !z) {
                ((fppv)object0).a.a();
                z = true;
            }
        }
    }

    @Override  // azye
    public final void b() {
    }
}

