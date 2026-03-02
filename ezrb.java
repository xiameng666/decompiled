import android.content.pm.Signature;
import java.util.List;

final class ezrb extends ibsl implements ibtw {
    Object a;
    int b;
    final ezrc c;
    final ezmc d;

    public ezrb(ezrc ezrc0, ezmc ezmc0, ibrl ibrl0) {
        this.c = ezrc0;
        this.d = ezmc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ezrb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ezrb(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                List list0 = ibpo.g(new afj[]{new afj("com.google.android.apps.pixel.psi", new Signature("9311c8d7198d1be7a7fc1152c8c300921a904858f5aebc787f9cecc5e41468fa").toByteArray()), new afj("com.google.android.apps.pixel.psi", new Signature("d439bedff4c060a637ffc07c33ea9fa04a091165c40ee883717c2a89bd5a908f").toByteArray())});
                this.b = 1;
                if(this.c.b.c(list0, this) != object1) {
                    goto label_11;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_11:
                this.b = 2;
                object0 = this.c.b.b(this.c.a, this);
                if(object0 != object1) {
                    goto label_16;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
            label_16:
                byte[] arr_b = this.d.toBytesArray();
                this.a = (byte[])object0;
                this.b = 3;
                if(this.c.b.d(this.c.a, arr_b, this) != object1) {
                    object2 = (byte[])object0;
                label_21:
                    if(object2 != null) {
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ezmc.a), ((byte[])object2), 0, ((byte[])object2).length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        return (ezmc)hftv0;
                    }
                    return null;
                }
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                goto label_21;
            }
        }
        return object1;
    }
}

