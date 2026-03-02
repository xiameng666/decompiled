import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;

public final class bmdl implements azys {
    public final bmdz a;
    public final KeyCreationRequestOptions b;

    public bmdl(bmdz bmdz0, KeyCreationRequestOptions keyCreationRequestOptions0) {
        this.a = bmdz0;
        this.b = keyCreationRequestOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmcv bmcv0 = (bmcv)object0;
        bmdt bmdt0 = new bmdt(this.a, ((evqp)object1));
        bmcy bmcy0 = (bmcy)bmcv0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmcv0.r);
        bmcy0.c(bmdt0, this.b, apiMetadata0);
    }
}

