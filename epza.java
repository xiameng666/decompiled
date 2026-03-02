import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.data.FolsomDataPayload;
import com.google.android.gms.smartdevice.d2d.data.FolsomSecurityDomainAndKeys;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class epza {
    public static final baun a;
    public final Context b;

    static {
        epza.a = new erqc(new String[]{"D2D", "FolsomDataTransferController"});
    }

    public epza(Context context0) {
        this.b = context0;
    }

    public final gmcd a(epzc epzc0, epzc epzc1, BootstrapConfigurations bootstrapConfigurations0) {
        if(bootstrapConfigurations0 != null) {
            boolean z = epzc0.b(16);
            epza.a.d("Target has support: " + z, new Object[0]);
            if(z) {
                ArrayList arrayList0 = bootstrapConfigurations0.g;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    epzc1.c(15, true);
                    return this.b(arrayList0);
                }
            }
        }
        return null;
    }

    public final gmcd b(ArrayList arrayList0) {
        return new bblp(1, 9).e(new epyy(this, arrayList0));
    }

    public final gmcd c(List list0, List list1) {
        if(list0 != null && !list0.isEmpty() && list1 != null && !list1.isEmpty()) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: list1) {
                hashSet0.add(((Account)object0).name);
            }
            return new bblp(1, 9).e(() -> {
                int v = 0;
                for(Object object0: list0) {
                    FolsomDataPayload folsomDataPayload0 = (FolsomDataPayload)object0;
                    String s = folsomDataPayload0.b;
                    if(hashSet0.contains(s)) {
                        ++v;
                        ArrayList arrayList0 = folsomDataPayload0.c;
                        int v1 = arrayList0.size();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            FolsomSecurityDomainAndKeys folsomSecurityDomainAndKeys0 = (FolsomSecurityDomainAndKeys)arrayList0.get(v2);
                            String s1 = folsomSecurityDomainAndKeys0.b;
                            ArrayList arrayList1 = new ArrayList(folsomSecurityDomainAndKeys0.c.size());
                            ArrayList arrayList2 = folsomSecurityDomainAndKeys0.c;
                            int v3 = arrayList2.size();
                            for(int v4 = 0; v4 < v3; ++v4) {
                                arrayList1.add(((SharedKey)bauc.c(((String)arrayList2.get(v4)), SharedKey.CREATOR)));
                            }
                            evql evql0 = epza.e(this.b, s1).jD(s, arrayList1);
                            try {
                                evrg.o(evql0, hyhu.b(), TimeUnit.SECONDS);
                            }
                            catch(ExecutionException executionException0) {
                                Throwable throwable0 = executionException0.getCause();
                                if(throwable0 != null) {
                                    executionException0 = throwable0;
                                }
                                epza.a.n("Unable to store the key material", executionException0, new Object[0]);
                            }
                            catch(TimeoutException timeoutException0) {
                                Object[] arr_object = {hyhu.b()};
                                epza.a.n("Operation is not finished after %s seconds. Break out", timeoutException0, arr_object);
                            }
                            catch(InterruptedException unused_ex) {
                                epza.a.m("Interrupted during key storage", new Object[0]);
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
                return v;
            });
        }
        return null;
    }

    static azts e(Context context0, String s) {
        ajqo ajqo0 = new ajqo();
        ajqo0.a = s;
        ajqo0.f = 1;
        return new azts(context0, ajqo0.a());
    }

    public static final Object f(evql evql0, String s) {
        try {
            return evrg.o(evql0, hyhu.b(), TimeUnit.SECONDS);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 != null) {
                executionException0 = throwable0;
            }
            epza.a.n("Failed to get result for %s", executionException0, new Object[]{s});
            return null;
        }
        catch(InterruptedException unused_ex) {
            epza.a.m("Interrupted when waiting a result for %s", new Object[]{s});
            Thread.currentThread().interrupt();
            return null;
        }
        catch(TimeoutException unused_ex) {
            Object[] arr_object = {s, hyhu.b()};
            epza.a.m("Failed to get result for %s within %s seconds", arr_object);
            return null;
        }
    }
}

