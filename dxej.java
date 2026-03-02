import java.io.IOException;

public final class dxej implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        fszb fszb0;
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fszd.a), ((byte[])object0), 0, ((byte[])object0).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        if(((fszd)hftv0).b == 1) {
            fszc fszc0 = (fszc)((fszd)hftv0).c;
            switch(fszc0.b) {
                case 0: {
                    fszb0 = fszb.a;
                    break;
                }
                case 1: {
                    fszb0 = fszb.b;
                    break;
                }
                case 2: {
                    fszb0 = fszb.c;
                    break;
                }
                case 3: {
                    fszb0 = fszb.d;
                    break;
                }
                case 4: {
                    fszb0 = fszb.e;
                    break;
                }
                default: {
                    fszb0 = null;
                }
            }
            if(fszb0 == null) {
                fszb0 = fszb.f;
            }
            int v = fszb0.ordinal();
            switch(v) {
                case 0: {
                    throw new IllegalArgumentException("Unknown");
                }
                case 1: {
                    throw new IllegalArgumentException("Unimplemented");
                }
                case 2: {
                    throw new IOException();
                }
                case 3: {
                    throw new dpuk((fszc0.c == null ? gtli.a : fszc0.c));
                }
                case 4: {
                    throw new IllegalArgumentException("Feature is not enabled");
                }
                default: {
                    if(v != 5) {
                        return evrg.d(((fszd)hftv0));
                    }
                    throw new IllegalArgumentException("Unknown");
                }
            }
        }
        return evrg.d(((fszd)hftv0));
    }
}

