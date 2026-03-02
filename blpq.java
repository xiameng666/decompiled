import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.fido.credentialstore.KeyMetadata;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class blpq extends blpl {
    public static final bboh b;
    public final byte[] c;
    public final byte[] d;
    public ByteString e;
    public boolean f;
    public SharedKey g;
    public String h;
    private final Context i;
    private final KeyMetadata j;
    private final Account k;
    private final byte[] l;
    private final boolean m;
    private final long n;
    private final PublicKey o;

    static {
        blpq.b = bnaa.e("SyncedKeyCryptoObject");
    }

    public blpq(Context context0, byte[] arr_b, PublicKey publicKey0, byte[] arr_b1, byte[] arr_b2, KeyMetadata keyMetadata0, Account account0, boolean z, long v) {
        super(null);
        gftb.checkTrue((arr_b1 == null ? 1 : 0) != (arr_b2 == null ? 1 : 0));
        this.i = context0.getApplicationContext();
        this.c = arr_b;
        this.o = publicKey0;
        this.j = keyMetadata0;
        this.k = account0;
        this.d = arr_b1;
        this.l = arr_b2;
        this.m = z;
        this.n = v;
        this.f = false;
    }

    @Override  // blpl
    public final long a() {
        return this.n;
    }

    @Override  // blpi
    public final gfsx b() {
        return gfsx.m(this.j);
    }

    @Override  // blpl
    public final gfsx c() {
        return gfsx.l(this.e);
    }

    @Override  // blpl
    public final gfsx e() {
        return gfsx.m(this.k);
    }

    @Override  // blpi
    public final gmcd f() {
        return gmbu.i(Long.valueOf(0L));
    }

    @Override  // blpl
    public final gmcd g(byte[] arr_b) {
        return this.s(arr_b, true);
    }

    @Override  // blpi
    public final PublicKey h() {
        this.o.getClass();
        return this.o;
    }

    @Override  // blpl
    public final void i() {
        SharedKey sharedKey0;
        Pair pair0;
        List list0;
        if(!this.o()) {
            return;
        }
        if(hsvs.a.c().c()) {
            String s = this.k.name;
            batl.j();
            gmcd gmcd0 = fhra.b(this.u(this.i).jx(s));
            try {
                list0 = (List)((glyq)gmcd0).u();
                if(list0.isEmpty()) {
                    bxly bxly0 = new bxly();
                    bxly0.a = 8;
                    bxly0.b = "No shared keys available.";
                    throw bxly0.a();
                }
            }
            catch(ExecutionException | InterruptedException exception0) {
                bxly bxly1 = new bxly();
                bxly1.c = exception0;
                bxly1.a = 8;
                bxly1.b = "Error getting shared keys.";
                throw bxly1.a();
            }
            this.g = (SharedKey)gggq.p(list0);
            List list1 = ggia.h(list0, new blpm());
            try {
                this.t(((byte[])gggq.p(list1)));
                return;
            }
            catch(bxma unused_ex) {
                byte[] arr_b = this.d;
                Throwable throwable0 = null;
                if(arr_b == null) {
                    byte[] arr_b1 = this.l;
                    gftb.check(arr_b1);
                    int v1 = list1.size();
                    while(true) {
                        --v1;
                        if(v1 < 0) {
                            goto label_50;
                        }
                        try {
                            pair0 = blpr.a(((byte[])list1.get(v1)), arr_b1);
                        }
                        catch(bxma throwable0) {
                            continue;
                        }
                        break;
                    }
                    this.a = (PrivateKey)pair0.first;
                    this.e = ((herx)pair0.second).d;
                }
                else {
                    int v = list1.size();
                    while(true) {
                        --v;
                        if(v < 0) {
                            break;
                        }
                        try {
                            this.a = blpr.b(blpr.c(((byte[])list1.get(v)), arr_b, blpr.a));
                            this.f = true;
                            return;
                        }
                        catch(bxma throwable0) {
                        }
                    }
                    bxly bxly2 = new bxly();
                    bxly2.c = throwable0;
                    bxly2.a = 8;
                    bxly2.b = "Failed to decode any decrypted protobuf.";
                    throw bxly2.a();
                }
                this.f = true;
                return;
            label_50:
                bxly bxly3 = new bxly();
                bxly3.c = throwable0;
                bxly3.a = 8;
                bxly3.b = "Failed to decode any decrypted protobuf.";
                throw bxly3.a();
            }
        }
        String s1 = this.k.name;
        gmcd gmcd1 = fhra.b(this.u(this.i).jx(s1));
        try {
            List list2 = (List)((glyq)gmcd1).u();
            if(list2.isEmpty()) {
                bxly bxly4 = new bxly();
                bxly4.a = 8;
                bxly4.b = "No shared keys available.";
                throw bxly4.a();
            }
            sharedKey0 = (SharedKey)gggq.p(list2);
        }
        catch(ExecutionException | InterruptedException exception1) {
            bxly bxly5 = new bxly();
            bxly5.c = exception1;
            bxly5.a = 8;
            bxly5.b = "Error getting shared keys.";
            throw bxly5.a();
        }
        this.t(blpr.d(sharedKey0.b));
    }

    @Override  // blpl
    public final void j() {
        this.i();
        super.j();
    }

    @Override  // blpi
    public final boolean k() {
        return false;
    }

    @Override  // blpi
    public final boolean l() {
        return false;
    }

    @Override  // blpi
    public final boolean n() {
        return true;
    }

    @Override  // blpl
    public final boolean o() {
        return this.a == null;
    }

    @Override  // blpi
    public final boolean p() {
        return this.m;
    }

    @Override  // blpi
    public final boolean q() {
        return false;
    }

    @Override  // blpi
    public final byte[] r() {
        return this.c;
    }

    public final gmcd s(byte[] arr_b, boolean z) {
        gmcd gmcd0 = super.g(arr_b);
        gmbu.t(gmcd0, new blpo(this, z), gmap.a);
        return gmcd0;
    }

    private final void t(byte[] arr_b) {
        byte[] arr_b1 = this.d;
        if(arr_b1 != null) {
            this.a = blpr.b(blpr.c(arr_b, arr_b1, blpr.a));
            return;
        }
        gftb.check(this.l);
        Pair pair0 = blpr.a(arr_b, this.l);
        this.a = (PrivateKey)pair0.first;
        this.e = ((herx)pair0.second).d;
    }

    private final azts u(Context context0) {
        ajqo ajqo0 = new ajqo();
        ajqo0.a = "hw_protected";
        if(!TextUtils.isEmpty(this.h) && hsvd.i()) {
            ajqo0.e = this.h;
        }
        return new azts(context0, ajqo0.a());
    }
}

