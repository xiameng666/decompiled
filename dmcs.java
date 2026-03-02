import android.accounts.Account;
import com.google.android.gms.pay.GetTransactionsResponse;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.Transaction;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..time.Duration;
import j..time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;

public final class dmcs {
    private static final String a;
    private static final Duration b;
    private final Account c;
    private final dvjf d;
    private final bboh e;
    private final Instant f;
    private final azts g;

    static {
        hwrt.d();
        dmcs.a = hwrt.a.b().b();
        hwrt.d();
        Duration duration0 = Duration.ofHours(hwrt.a.b().a());
        ibuq.e(duration0, "ofHours(...)");
        dmcs.b = duration0;
    }

    public dmcs(Account account0, azts azts0, dvjf dvjf0) {
        this.c = account0;
        this.g = azts0;
        this.d = dvjf0;
        this.e = bboh.b("Pay", bbcu.cZ);
        Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis()).minus(dmcs.b);
        ibuq.e(instant0, "minus(...)");
        this.f = instant0;
    }

    public final Integer a() {
        ArrayList arrayList2;
        hknp hknp1;
        ArrayList arrayList1;
        hwrt.d();
        if(hwrt.c()) {
            try {
                Object object0 = evrg.n(this.g.aD(this.c, ibps.a, 1));
                ibuq.e(object0, "await(...)");
                Transaction[] arr_transaction = ((GetTransactionsResponse)object0).a;
                ibuq.e(arr_transaction, "getTransactions(...)");
                ArrayList arrayList0 = new ArrayList();
                int v = 0;
                while(true) {
                    if(v >= arr_transaction.length) {
                        arrayList1 = new ArrayList();
                        for(Object object1: arrayList0) {
                            hknp hknp0 = (hknp)object1;
                            if((hknp0.h == null ? hfwn.a : hknp0.h).b >= this.f.getEpochSecond() && hknp0.y) {
                                String s = hknp0.m;
                                ibuq.e(s, "getDisplayName(...)");
                                String s1 = s.toUpperCase(Locale.ROOT);
                                ibuq.e(s1, "toUpperCase(...)");
                                if(ibzk.G(s1, "SANIFAIR") && (hknl.b(hknp0.q) == null ? hknl.i : hknl.b(hknp0.q)) == hknl.c) {
                                    arrayList1.add(object1);
                                }
                            }
                        }
                        goto label_44;
                    }
                    Transaction transaction0 = arr_transaction[v];
                    try {
                        byte[] arr_b = transaction0.a;
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hknp.b), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        hknp1 = (hknp)hftv0;
                    }
                    catch(hfur hfur0) {
                        ((ggtj)((ggtj)this.e.h()).s(hfur0)).x("Failed to parse core transaction");
                        hknp1 = null;
                    }
                    if(hknp1 != null) {
                        arrayList0.add(hknp1);
                    }
                    ++v;
                }
            }
            catch(dmhl dmhl0) {
                a.ae(this.e.h(), "Failed to fetch Sanifair TnP transactions: PaySQLiteException", dmhl0);
            }
            catch(ExecutionException executionException0) {
                a.ae(this.e.h(), "Failed to fetch Sanifair TnP transactions: ExecutionException", executionException0);
            }
            arrayList1 = null;
        label_44:
            if(arrayList1 != null) {
                if(arrayList1.isEmpty()) {
                    return (int)0;
                }
                hwrt.d();
                if(!hwrt.a.b().d()) {
                    return arrayList1.size();
                }
                try {
                    PassFilter passFilter0 = new PassFilter();
                    passFilter0.e = new String[]{dmcs.a};
                    Object object2 = this.d.a(passFilter0).first;
                    ibuq.e(object2, "first");
                    arrayList2 = new ArrayList();
                    Iterator iterator1 = ((List)object2).iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            goto label_71;
                        }
                        Object object3 = iterator1.next();
                        if(((Valuable)object3).l.b >= this.f.getEpochSecond()) {
                            arrayList2.add(object3);
                        }
                    }
                }
                catch(eaqz eaqz0) {
                    a.ae(this.e.h(), "Failed to fetch Sanifair valuables because of missing encryption key", eaqz0);
                }
                catch(earn earn0) {
                    a.ae(this.e.h(), "Failed to fetch Sanifair valuables because of storage key exception", earn0);
                }
                catch(dmhl dmhl1) {
                    a.ae(this.e.h(), "Failed to fetch Sanifair valuables because of database exception", dmhl1);
                }
                arrayList2 = null;
            label_71:
                if(arrayList2 != null) {
                    Iterator iterator2 = arrayList1.iterator();
                    if(!iterator2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object object4 = iterator2.next();
                    hfwn hfwn0 = ((hknp)object4).h;
                    if(hfwn0 == null) {
                        hfwn0 = hfwn.a;
                    }
                    long v1 = hfwn0.b;
                    while(iterator2.hasNext()) {
                        Object object5 = iterator2.next();
                        hfwn hfwn1 = ((hknp)object5).h;
                        if(hfwn1 == null) {
                            hfwn1 = hfwn.a;
                        }
                        long v2 = hfwn1.b;
                        if(v1 > v2) {
                            v1 = v2;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object6: arrayList2) {
                        if(((Valuable)object6).l.b >= v1) {
                            arrayList3.add(object6);
                        }
                    }
                    ((ggtj)this.e.h()).z("Number of transactions: %d", arrayList1.size());
                    ((ggtj)this.e.h()).z("Number of vouchers: %d", arrayList3.size());
                    return Math.max(arrayList1.size() - arrayList3.size(), 0);
                }
            }
        }
        return null;
    }
}

