import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class azek implements gful_cronetEngineProvider {
    final azem a;

    public azek(azem azem0) {
        Objects.requireNonNull(azem0);
        this.a = azem0;
        super();
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        int v1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlqc.a).v_newBuilder();
        try {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)this.a.a.getSystemService("connectivity");
            if(connectivityManager0 != null) {
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                if(networkInfo0 != null) {
                    int v = hlqb.a(networkInfo0.getType());
                    if(v != 0) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hlqc)hftp0.b_message).c = v - 2;
                        ((hlqc)hftp0.b_message).b |= 1;
                    }
                    v1 = networkInfo0.getSubtype();
                    if(v1 == -1) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hlqc)hftp0.b_message).d = 100;
                        ((hlqc)hftp0.b_message).b |= 2;
                        return (hlqc)hftp0.N_build();
                    }
                    int v2 = hlpz.a(v1);
                    if(v2 != 0) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hlqc)hftp0.b_message).d = v2 - 1;
                        ((hlqc)hftp0.b_message).b |= 2;
                        return (hlqc)hftp0.N_build();
                    }
                    goto label_25;
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
        return (hlqc)hftp0.N_build();
        try {
            try {
            label_25:
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                hfsn hfsn0 = new hfsn(byteArrayOutputStream0, 0x1000);
                ((CodedOutputStream)hfsn0).writeInt32(2, v1);
                ((CodedOutputStream)hfsn0).flush();
                hftp0.y(byteArrayOutputStream0.toByteArray());
                return (hlqc)hftp0.N_build();
            }
            catch(IOException iOException0) {
                throw new AssertionError(iOException0);
            }
        }
        catch(SecurityException unused_ex) {
            return (hlqc)hftp0.N_build();
        }
    }
}

