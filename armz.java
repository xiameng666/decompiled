import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public final class armz implements gful_cronetEngineProvider {
    public final arnb a;
    public final HandshakeData b;

    public armz(arnb arnb0, HandshakeData handshakeData0) {
        this.a = arnb0;
        this.b = handshakeData0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        azzc azzc0 = new azzc();
        azzc0.a = new equv(this.a.b, this.b);
        azzc0.c = new Feature[]{epvj.a};
        azzc0.d = 0x50FE;
        azzd azzd0 = azzc0.a();
        return this.a.b.jn(azzd0);
    }
}

