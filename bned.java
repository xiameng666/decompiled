import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

public final class bned implements blym {
    private final Context a;
    private final blyx b;

    public bned(Context context0, blyx blyx0) {
        gftb.check(context0);
        this.a = context0;
        gftb.check(blyx0);
        this.b = blyx0;
    }

    @Override  // blym
    public final blyl a(bnae bnae0, bnem bnem0, blxu blxu0, bner bner0, bnao bnao0) {
        return new bnef(this.a, bnae0, bnem0, blxu0, bner0, this.b, bnao0);
    }

    @Override  // blym
    public final blyl b(bnae bnae0, bnem bnem0, blxu blxu0, bmzh bmzh0, RequestOptions requestOptions0, bmbu bmbu0, bmov bmov0, boolean z, bner bner0, bnaj bnaj0) {
        if(bnaj0 != null) {
            bnao bnao0 = bnaj0.i();
            return new bnef(this.a, bnae0, bnem0, blxu0, bner0, this.b, bnao0);
        }
        return new bnef(this.a, bnae0, bnem0, blxu0, bner0, this.b, bnao.g);
    }
}

