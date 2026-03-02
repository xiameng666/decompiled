import android.content.Intent;

public final class gaph implements gamu {
    @Override  // gamu
    public final ganp a(gano gano0) {
        String s = gcrh.c(gano0.a.getByteArrayExtra("plainText"), gano0.a.getStringExtra("keyId"), gano0.a.getStringExtra("initializationVector"), gano0.a.getByteArrayExtra("cReqSessionKey"));
        Intent intent0 = ganp.e(0);
        intent0.putExtra("encryptionValue", s);
        return new ganp(intent0);
    }
}

