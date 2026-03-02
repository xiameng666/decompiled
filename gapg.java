import android.content.Intent;

public final class gapg implements gamu {
    @Override  // gamu
    public final ganp a(gano gano0) {
        gcrl gcrl0 = gcrh.b(gano0.a.getStringExtra("ecdhPublicKey"), gano0.a.getStringExtra("agreementPartyVInfo"), gano0.a.getByteArrayExtra("ephemeralPrivateKey"));
        Intent intent0 = ganp.e(0);
        intent0.putExtra("cReqSessionKey", gcrl0.a);
        intent0.putExtra("cResSessionKey", gcrl0.b);
        return new ganp(intent0);
    }
}

