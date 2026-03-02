import android.os.Bundle;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class blwd extends du {
    public static final bboh a;
    public blwe ag;
    public SourceStartDirectTransferOptions b;
    public DataInputStream c;
    public DataOutputStream d;

    static {
        blwd.a = bnaa.f("AuthenticatorController");
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setRetainInstance(true);
        this.ag = (blwe)new lso(((xnz)this.requireContext())).a(blwe.class);
    }
}

