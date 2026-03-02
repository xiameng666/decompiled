import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import j..util.Objects;

public final class acop extends acoq {
    final acor a;
    private final String j;
    private final String k;
    private final String l;

    public acop(acor acor0, Context context0, bcqx bcqx0, hobg hobg0, boolean z, Bundle bundle0, bcqh bcqh0, String s, String s1, String s2) {
        Objects.requireNonNull(acor0);
        this.a = acor0;
        super(acor0, context0, bcqx0, hobg0, z, 2, bundle0, bcqh0);
        this.j = s;
        this.k = s1;
        this.l = s2;
    }

    @Override  // acoq
    protected final void b() {
        bbvl.h();
        Context context0 = this.b;
        byte[] arr_b = this.a.i;
        Intent intent0 = bbvl.b(context0, this.a.f, this.c, this.d, this.e, this.f);
        intent0.putExtra("eventmanager.audit_token", arr_b);
        intent0.putExtra("eventmanager.gaia_access_token", this.j);
        intent0.putExtra("eventmanager.consent_variant", this.k);
        intent0.putExtra("eventmanager.consent_trigger", this.l);
        context0.startService(intent0);
    }
}

