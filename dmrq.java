import android.content.Context;
import android.content.Intent;

public final class dmrq implements evqk {
    public final dmsn a;

    public dmrq(dmsn dmsn0) {
        this.a = dmsn0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        int v = ((hkgq)object0).b;
        int v1 = hkgp.a(v);
        if(v1 != 0) {
            dmsn dmsn0 = this.a;
            switch(v1 - 1) {
                case 2: {
                    byte[] arr_b = (v == 2 ? ((ByteString)((hkgq)object0).c) : ByteString.b).toByteArray();
                    Context context0 = dmsn0.c.requireContext();
                    Intent intent0 = dmsn0.f.a(context0, arr_b);
                    dmsn0.c.startActivityForResult(intent0, 302);
                    return evrg.d(null);
                }
                case 3: {
                    return v == 3 ? dmsn0.c(((ByteString)((hkgq)object0).c).toByteArray()) : dmsn0.c(ByteString.b.toByteArray());
                }
                default: {
                    int v2 = hkgp.a(v);
                    if(v2 != 0) {
                        throw new IllegalStateException("Unknown action token: " + (v2 - 1));
                    }
                    throw null;
                }
            }
        }
        throw null;
    }
}

