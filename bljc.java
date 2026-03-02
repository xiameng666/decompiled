import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;
import com.google.android.gms.fido.credentialstore.KeyData;
import com.google.android.gms.fido.credentialstore.KeyMetadata;
import j..util.Objects;
import java.security.KeyPair;

final class bljc implements evpo {
    final KeyCreationRequestOptions a;
    final byte[] b;
    final KeyPair c;
    final byte[] d;
    final byte[] e;
    final long f;

    public bljc(bljg bljg0, KeyCreationRequestOptions keyCreationRequestOptions0, byte[] arr_b, KeyPair keyPair0, byte[] arr_b1, byte[] arr_b2, long v) {
        this.a = keyCreationRequestOptions0;
        this.b = arr_b;
        this.c = keyPair0;
        this.d = arr_b1;
        this.e = arr_b2;
        this.f = v;
        Objects.requireNonNull(bljg0);
        super();
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        KeyMetadata keyMetadata0 = new KeyMetadata(this.a.e, this.a.f, this.a.g, false, null);
        byte[] arr_b = this.c.getPublic().getEncoded();
        return KeyData.b(this.b, arr_b, this.d, this.e, keyMetadata0, this.a.h, this.a.i, this.f);
    }
}

