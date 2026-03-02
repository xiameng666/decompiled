import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.gms.appdatasearch.SearchResults;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class bwvw {
    public static final SearchResults a(bwpi bwpi0, bwpm bwpm0, boolean z, bwvv[] arr_bwvv) {
        int v10;
        Bundle bundle2;
        Bundle[] arr_bundle3;
        bwvv[] arr_bwvv1 = arr_bwvv;
        int v = arr_bwvv1.length;
        String[] arr_s = new String[v];
        Bundle[] arr_bundle = new Bundle[v];
        Bundle[] arr_bundle1 = new Bundle[v];
        Bundle[] arr_bundle2 = new Bundle[v];
        SparseIntArray sparseIntArray0 = new SparseIntArray(v);
        int v1 = 0;
        int v2 = 0;
        while(v1 < arr_bwvv1.length) {
            bwnq bwnq0 = arr_bwvv1[v1].a;
            arr_s[v1] = bwnq0.f + "-" + bwnq0.d;
            bwpl bwpl0 = (bwpl)bwpm0.e.get(v1);
            Bundle bundle0 = new Bundle();
            Bundle bundle1 = new Bundle();
            for(int v3 = 0; v3 < bwnq0.l.size(); ++v3) {
                String s = abvx.b(((bwpw)bwnq0.l.get(v3)).c);
                if(((bwpj)bwpl0.b.get(v3)).b.size() != 0) {
                    bundle0.putIntArray(s, glwy.n(((bwpj)bwpl0.b.get(v3)).b));
                }
                bundle1.putByteArray(s, ((bwpj)bwpl0.b.get(v3)).c.toByteArray());
            }
            Pair pair0 = Pair.create(bundle0, bundle1);
            arr_bundle[v1] = (Bundle)pair0.first;
            arr_bundle1[v1] = (Bundle)pair0.second;
            sparseIntArray0.put(bwnq0.c, v1);
            bwoz bwoz0 = (bwoz)bwpi0.c.get(v1);
            bwpl bwpl1 = (bwpl)bwpm0.e.get(v1);
            if(bwoz0.d.isEmpty()) {
                arr_bundle3 = arr_bundle2;
                bundle2 = null;
            }
            else {
                int v4 = bwoz0.e.size();
                if(bwpl1.b.size() < bwoz0.d.size() + v4) {
                    bwne.h("Wanted %d annotation-only sections plus %d universal sections, but only got %d sections", new Object[]{bwoz0.d.size(), v4, bwpl1.b.size()});
                    arr_bundle3 = arr_bundle2;
                    bundle2 = null;
                }
                else {
                    Bundle bundle3 = new Bundle();
                    int v5 = 0;
                    while(v5 < bwoz0.d.size()) {
                        int v6 = ((bwpg)bwoz0.d.get(v5)).c;
                        byte[] arr_b = abwq.a(((bwpj)bwpl1.b.get(v5 + v4)));
                        if(arr_b != null) {
                            bundle3.putByteArray(((bwlo)bwnq0.k.get(v6)).d, arr_b);
                        }
                        ++v5;
                        arr_bundle2 = arr_bundle2;
                        bwoz0 = bwoz0;
                    }
                    arr_bundle3 = arr_bundle2;
                    bundle2 = bundle3;
                }
            }
            if(bundle2 != null && !bundle2.isEmpty()) {
                arr_bundle3[v1] = bundle2;
                v2 = 1;
            }
            ++v1;
            arr_bwvv1 = arr_bwvv;
            arr_bundle2 = arr_bundle3;
        }
        int[] arr_v = new int[bwpm0.d.size()];
        for(int v7 = 0; v7 < bwpm0.c; ++v7) {
            arr_v[v7] = sparseIntArray0.get(bwpm0.d.d(v7));
        }
        byte[] arr_b1 = (bwpm0.b & 16) == 0 ? null : (bwpm0.i == null ? bwkm.a : bwpm0.i).toBytesArray();
        double[] arr_f = bwpm0.c <= 0 || bwpm0.j.size() != 0 ? glwp.d(bwpm0.j) : null;
        int v8 = bwpm0.c;
        long[] arr_v1 = new long[v8];
        long[] arr_v2 = new long[v8];
        for(int v9 = 0; true; ++v9) {
            v10 = bwpm0.c;
            if(v9 >= v10) {
                break;
            }
            arr_v1[v9] = TimeUnit.SECONDS.toMillis(((long)bwpm0.k.d(v9)));
            arr_v2[v9] = TimeUnit.SECONDS.toMillis(((long)bwpm0.l.d(v9)));
        }
        int[] arr_v3 = glwy.n(bwpm0.g);
        byte[] arr_b2 = bwpm0.h.toByteArray();
        int v11 = bwpm0.f;
        int[] arr_v4 = glwy.n(bwpm0.p);
        byte[] arr_b3 = bwpm0.q.toByteArray();
        Bundle bundle4 = new Bundle();
        UserHandle[] arr_userHandle = new UserHandle[v];
        Arrays.fill(arr_userHandle, 0, v, Process.myUserHandle());
        bundle4.putParcelableArray("USER_HANDLE_ARRAYS_KEY", arr_userHandle);
        return new SearchResults(v10, arr_v, arr_s, arr_v3, arr_b2, null, arr_bundle, arr_bundle1, arr_b1, arr_f, bundle4, v11, arr_v1, arr_v2, (1 == v2 ? arr_bundle2 : null), arr_v4, arr_b3, z);
    }
}

