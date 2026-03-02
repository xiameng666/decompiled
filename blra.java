import com.google.android.gms.auth.cryptauth.SignedBlob;

public final class blra implements evqf {
    public final evql a;
    public final bmhg b;
    public final blrk c;

    public blra(evql evql0, blrk blrk0, bmhg bmhg0) {
        this.a = evql0;
        this.c = blrk0;
        this.b = bmhg0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        SignedBlob signedBlob0 = (SignedBlob)object0;
        byte[] arr_b = ((SignedBlob)this.a.j()).b;
        this.c.b(arr_b, this.b);
    }
}

