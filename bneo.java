import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

public final class bneo implements blym {
    private final Context a;

    public bneo(Context context0) {
        gftb.check(context0);
        this.a = context0;
    }

    @Override  // blym
    public final blyl a(bnae bnae0, bnem bnem0, blxu blxu0, bner bner0, bnao bnao0) {
        return new bnep(this.a, bnae0, bnem0, blxu0, bner0, bnao0, blyn.a);
    }

    @Override  // blym
    public final blyl b(bnae bnae0, bnem bnem0, blxu blxu0, bmzh bmzh0, RequestOptions requestOptions0, bmbu bmbu0, bmov bmov0, boolean z, bner bner0, bnaj bnaj0) {
        bnao bnao0 = bnaj0 == null ? bnao.g : bnaj0.i();
        Context context0 = this.a;
        bnem bnem1 = bmzh0 == null ? bnem0 : bmzh0;
        blyl blyl0 = new bnep(context0, bnae0, bnem1, blxu0, bner0, bnao0, blyn.a);
        ((bnep)blyl0).a(requestOptions0, bmbu0, bmov0, z, bmzh0);
        return blyl0;
    }
}

