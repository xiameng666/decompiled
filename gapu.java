import android.content.Intent;

public final class gapu implements gamu {
    @Override  // gamu
    public final ganp a(gano gano0) {
        gcri gcri0 = gcrh.a();
        Intent intent0 = ganp.e(0);
        intent0.putExtra("ephemeralPublicKey", gcri0.b);
        intent0.putExtra("ephemeralPrivateKey", gcri0.a);
        return new ganp(intent0);
    }
}

