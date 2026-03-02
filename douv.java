import com.google.android.gms.pay.main.PayChimeraActivity;

public final class douv implements evqk {
    public final long a;

    public douv(long v) {
        this.a = v;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        hftc hftc0 = hftc.a();
        boolean z = false;
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dpfp.a), ((byte[])object0), 0, ((byte[])object0).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        if(((dpfp)hftv0).b == 14) {
            z = ((Boolean)((dpfp)hftv0).c).booleanValue();
        }
        ((ggtj)((ggtj)PayChimeraActivity.j.h()).ar(0x24FB)).M("Wallet on Fitbit in GW4 migration status [device: %d]: %s", this.a, z);
        return evrg.d(Boolean.valueOf(z));
    }
}

