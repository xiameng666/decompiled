import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class dout implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dpfp.a), ((byte[])object0), 0, ((byte[])object0).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        if(((dpfp)hftv0).b == 10) {
            dpfn dpfn0 = (dpfn)((dpfp)hftv0).c;
            return evrg.d(AccountInfo.a(dpfn0.c, dpfn0.b, false));
        }
        return evrg.d(AccountInfo.a(dpfn.a.c, dpfn.a.b, false));
    }
}

