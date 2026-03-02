import android.util.StatsEvent.Builder;
import android.util.StatsEvent;
import android.util.StatsLog;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.List;

public final class bxzl {
    public static final long a() {
        return bxzm.c.nextLong();
    }

    public static final bxzm b() {
        return (bxzm)bxzm.b.a();
    }

    public static final void c(long v, int v1, bxzg bxzg0) {
        ibuq.f(bxzg0, "status");
        if(bxzl.b() != null) {
            ibuq.f(bxzg0, "status");
            bxzi.b(0x33B63, v, v1, bxzg0.f);
        }
    }

    public static final void d(long v, int v1, bxzh bxzh0, CreateCredentialRequest createCredentialRequest0, boolean z) {
        ibuq.f(bxzh0, "status");
        ibuq.f(createCredentialRequest0, "request");
        if(bxzl.b() != null) {
            int v2 = bxzm.a(createCredentialRequest0.a);
            StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
            statsEvent$Builder0.setAtomId(0x33B5F);
            statsEvent$Builder0.writeLong(v);
            statsEvent$Builder0.writeInt(v1);
            statsEvent$Builder0.addBooleanAnnotation(1, true);
            statsEvent$Builder0.writeInt(bxzh0.i);
            statsEvent$Builder0.writeInt(v2);
            statsEvent$Builder0.writeBoolean(z);
            statsEvent$Builder0.usePooledBuffer();
            StatsLog.write(statsEvent$Builder0.build());
        }
    }

    public static final void e(long v, int v1, bxzn bxzn0, GetCredentialRequest getCredentialRequest0) {
        ibuq.f(bxzn0, "status");
        ibuq.f(getCredentialRequest0, "request");
        if(bxzl.b() != null) {
            bxzi.b(211805, v, v1, bxzn0.f);
            for(Object object0: getCredentialRequest0.a) {
                bxzi.a(211806, v, bxzm.a(((CredentialOption)object0).a));
            }
        }
    }

    public static final void f(long v, int v1, bxzo bxzo0) {
        ibuq.f(bxzo0, "status");
        if(bxzl.b() != null) {
            bxzi.b(211810, v, v1, bxzo0.f);
        }
    }

    public static final void g(long v, int v1, bxzq bxzq0, bxzp bxzp0) {
        ibuq.f(bxzq0, "registryApiType");
        ibuq.f(bxzp0, "status");
        if(bxzl.b() != null) {
            StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
            statsEvent$Builder0.setAtomId(0x33B60);
            statsEvent$Builder0.writeLong(v);
            statsEvent$Builder0.writeInt(v1);
            statsEvent$Builder0.addBooleanAnnotation(1, true);
            statsEvent$Builder0.writeInt(bxzq0.e);
            statsEvent$Builder0.writeInt(bxzp0.g);
            statsEvent$Builder0.usePooledBuffer();
            StatsLog.write(statsEvent$Builder0.build());
        }
    }

    public static final void h(long v, byaj byaj0, List list0, String s, int v1) {
        ibuq.f(byaj0, "requestType");
        ibuq.f(list0, "credentialTypes");
        if(bxzl.b() != null) {
            int v2 = byaj0.ordinal();
            int v3 = 1;
            if(v2 != 0) {
                switch(v2) {
                    case 1: {
                        v3 = 2;
                        break;
                    }
                    case 2: {
                        v3 = 3;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
            StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
            statsEvent$Builder0.setAtomId(211801);
            statsEvent$Builder0.writeLong(v);
            statsEvent$Builder0.writeInt(v3);
            statsEvent$Builder0.writeString(s);
            statsEvent$Builder0.writeInt(v1);
            statsEvent$Builder0.usePooledBuffer();
            StatsLog.write(statsEvent$Builder0.build());
            for(Object object0: list0) {
                bxzi.a(211804, v, ((bxzj)object0).e);
            }
        }
    }

    public static final void i(long v, byah byah0) {
        int v1;
        ibuq.f(byah0, "status");
        if(bxzl.b() != null) {
            ibuq.f(byah0, "status");
            switch(byah0.ordinal()) {
                case 0: {
                    v1 = 0;
                    break;
                }
                case 1: {
                    v1 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                    break;
                }
                case 3: {
                    v1 = 3;
                    break;
                }
                case 4: {
                    v1 = 4;
                    break;
                }
                case 5: {
                    v1 = 5;
                    break;
                }
                case 6: {
                    v1 = 6;
                    break;
                }
                case 7: {
                    v1 = 7;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            bxzi.a(211803, v, v1);
        }
    }

    public static void j(long v, int v1, bxzh bxzh0, CreateCredentialRequest createCredentialRequest0) {
        bxzl.d(v, v1, bxzh0, createCredentialRequest0, false);
    }
}

