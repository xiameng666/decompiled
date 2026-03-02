import android.accounts.Account;
import android.util.Pair;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.fido.credentialstore.KeyData;
import com.google.android.gms.fido.credentialstore.KeyMetadata;
import java.util.concurrent.ExecutionException;

public final class blkd implements gfsi {
    public final blkk a;
    public final ggeo b;

    public blkd(blkk blkk0, ggeo ggeo0) {
        this.a = blkk0;
        this.b = ggeo0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        KeyMetadata keyMetadata0;
        Pair pair0 = (Pair)object0;
        Account account0 = (Account)((Pair)pair0.first).first;
        String s = (String)((Pair)pair0.first).second;
        boolean z = this.b.containsKey(account0.name);
        blkk blkk0 = this.a;
        boolean z1 = z && ((String)this.b.get(account0.name)).equals(s);
        try {
            byte[] arr_b = ((KeyHandleResult)pair0.second).b;
            bmcs bmcs0 = bliu.a(blkk0.c, arr_b);
            if(z1) {
                gmcd gmcd0 = blkk0.d.g(account0.name, 0x40);
                gmcd gmcd1 = blkk0.d.b(account0.name);
                gmcd gmcd2 = gmbu.b(new gmcd[]{gmcd0, gmcd1}).a(new blki(gmcd1, gmcd0), gmap.a);
                try {
                    keyMetadata0 = (KeyMetadata)((glyq)gmcd2).u();
                }
                catch(ExecutionException | InterruptedException exception0) {
                    bxly bxly0 = new bxly();
                    bxly0.c = exception0;
                    bxly0.a = 8;
                    bxly0.b = "Failed to get Owner metadata.";
                    throw bxly0.a();
                }
            }
            else {
                keyMetadata0 = null;
            }
            return KeyData.a(bmcs0.f, arr_b, account0, z1, keyMetadata0);
        }
        catch(bxma bxma0) {
            throw new gmdd(bxma0);
        }
    }
}

