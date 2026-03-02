import android.content.ContentProviderOperation;
import android.os.TransactionTooLargeException;
import java.util.ArrayList;
import java.util.Map;

public final class ehbn {
    public static void a(ehbp ehbp0, ArrayList arrayList0, ArrayList arrayList1, Map map0, int v, int v1, ehim ehim0) {
        if(v >= v1) {
            return;
        }
        int v2 = ehbr.a(arrayList1, v, v1);
        if(v2 < 0) {
            egig.b("FSA2_CP2OpBatchSplitter", "TransactionTooLarge at smallest batch.");
            ehbn.d(ehim0);
            return;
        }
        ehbn.b(ehbp0, arrayList0, arrayList1, map0, v, v2 + 1, ehim0);
        ehbn.b(ehbp0, arrayList0, arrayList1, map0, v2 + 1, v1, ehim0);
    }

    private static void b(ehbp ehbp0, ArrayList arrayList0, ArrayList arrayList1, Map map0, int v, int v1, ehim ehim0) {
        if(v < v1) {
            try {
                ehbp0.c(ehbo.d(arrayList0, v, v1, map0));
            }
            catch(TransactionTooLargeException transactionTooLargeException0) {
                egig.f("FSA2_CP2OpBatchSplitter", "TransactionTooLarge temporary for batch %d after splitting", v1 - v);
                if(ehbr.a(arrayList1, v, v1) < 0) {
                    egig.c("FSA2_CP2OpBatchSplitter", "TransactionTooLargeException at smallest batch", transactionTooLargeException0);
                    ehbn.d(ehim0);
                    return;
                }
                if(hxai.a.b().a()) {
                    ehbn.c(ehbp0, arrayList0, map0, v, v1, ehim0);
                    return;
                }
                ehbn.a(ehbp0, arrayList0, arrayList1, map0, v, v1, ehim0);
            }
        }
    }

    private static void c(ehbp ehbp0, ArrayList arrayList0, Map map0, int v, int v1, ehim ehim0) {
        int v2 = v;
        while(v < v1) {
            if(((ContentProviderOperation)arrayList0.get(v)).isYieldAllowed() || v + 1 == v1) {
                try {
                    ehbp0.c(ehbo.d(arrayList0, v2, v + 1, map0));
                    v2 = v + 1;
                }
                catch(TransactionTooLargeException transactionTooLargeException0) {
                    egig.c("FSA2_CP2OpBatchSplitter", "TransactionTooLarge at a smallest batch", transactionTooLargeException0);
                    ehbn.d(ehim0);
                }
            }
            ++v;
        }
    }

    private static void d(ehim ehim0) {
        ++((ehiv)ehim0).a.stats.numIoExceptions;
        ehim0.h(girk.a, gjgi.a, true, 2, 1);
        TransactionTooLargeException transactionTooLargeException0 = new TransactionTooLargeException();
        ehim0.r(gjgi.a, girk.a, "TransactionTooLargeException", transactionTooLargeException0);
    }
}

