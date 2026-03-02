import com.google.android.gms.pay.ProtoSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

public final class dxki implements ibts {
    public final dxkp a;

    public dxki(dxkp dxkp0) {
        this.a = dxkp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dmjp dmjp0;
        ibuq.f(((ProtoSafeParcelable)object0), "protoSafeParcelable");
        byte[] arr_b = ((ProtoSafeParcelable)object0).a;
        dxkp dxkp0 = this.a;
        if(arr_b == null) {
            dmjp0 = dmjp.a;
            ibuq.c(dmjp0);
        }
        else {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dmjp.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                dmjp0 = (dmjp)hftv0;
                ibuq.c(dmjp0);
            }
            catch(hfur hfur0) {
                a.ae(dxkp0.h.i(), "Could not parse serialized DigitalCarKeys.", hfur0);
                dmjp0 = dmjp.a;
                ibuq.c(dmjp0);
            }
        }
        hfuo hfuo0 = dmjp0.b;
        ibuq.e(hfuo0, "getDigitalCarKeyList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        for(Object object1: hfuo0) {
            ibuq.c(((dmjo)object1));
            arrayList0.add(new dogv(dxkp0.a, ((dmjo)object1)));
        }
        Object object2 = new ArrayList();
        for(Object object3: arrayList0) {
            if(((dogv)object3).b != gtlk.b) {
                ((Collection)object2).add(object3);
            }
        }
        return object2;
    }
}

