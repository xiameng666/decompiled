import android.content.Context;
import android.content.Intent;

public final class gapx extends gaok {
    public gapx(gamx gamx0) {
        super(gamx0);
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        gapv gapv0;
        ibuq.f(gano0, "actionRequest");
        Context context0 = this.d().a;
        ibuq.f(gano0, "<this>");
        Intent intent0 = gano0.a;
        hcyl hcyl0 = hcyl.b(intent0.getIntExtra("requestType", 0));
        gavm.b(hcyl0, "BE_PIA_07", null, 12);
        ibuq.f(context0, "appContext");
        if(hcyl0 == hcyl.d) {
            gapv0 = new gapv(new azts(context0, null));
        }
        else if(hcyl0 == hcyl.c) {
            gapv0 = new garb(context0);
        }
        else {
            gaxl.a();
            gapv0 = hzlv.l() ? new garb(context0) : new gapc(context0);
        }
        gamx gamx0 = this.d();
        ibuq.f(gano0, "<this>");
        long v = intent0.getLongExtra("cloudProjectNumber", 0L);
        ibuq.f(gano0, "<this>");
        String s = intent0.getStringExtra("nonce");
        gavm.b(s, "BE_PIA_02", null, 12);
        gaqa gaqa0 = gapv0.a(gamx0, v, s);
        if((gaqa0 instanceof gapz)) {
            ganp ganp0 = new ganp(ganp.e(0));
            ibuq.f(((gapz)gaqa0).a, "value");
            ganp0.a.putExtra("integrity_token", ((gapz)gaqa0).a);
            return ganp0;
        }
        if((gaqa0 instanceof gapy)) {
            return new ganp(ganp.d(((gapy)gaqa0).a));
        }
        throw new ibnq();
    }
}

