import com.google.android.gms.trustagent.activeunlock.common.data.communication.WearConnectionInfo;

public final class eydx implements ibts {
    public final eyea a;
    public final WearConnectionInfo b;
    public final icbr c;

    public eydx(eyea eyea0, WearConnectionInfo wearConnectionInfo0, icbr icbr0) {
        this.a = eyea0;
        this.b = wearConnectionInfo0;
        this.c = icbr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        byte[] arr_b = ((fceu)object0) == null ? null : ((fceu)object0).c();
        icbr icbr0 = this.c;
        eyea eyea0 = this.a;
        if(arr_b == null) {
            ((ggtj)eyea0.a.j()).B("No data item retrieved for device with nodeId %s", this.b.a);
            icbr0.V(null);
            return ibom.a;
        }
        try {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)exlu.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            icbr0.V(((exlu)hftv0));
        }
        catch(hfur hfur0) {
            a.ae(eyea0.a.j(), "Failed to parse DeviceInfo from data item", hfur0);
            icbr0.V(null);
        }
        return ibom.a;
    }
}

