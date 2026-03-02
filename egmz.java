import android.content.Context;
import android.util.ArrayMap;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;
import com.google.android.gms.people.contactssync.model.ImportSimContactsSuggestion;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class egmz extends cjtm {
    private static final bboh a;
    private final GetImportSimContactsSuggestionsRequest b;
    private final egns c;
    private final egnv d;
    private final egna e;
    private final efzc f;
    private final int g;

    static {
        egmz.a = bboh.b("GetImportSimSuggestionsOp", bbcu.f);
    }

    public egmz(Context context0, baqr baqr0, efzc efzc0, GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest0, egns egns0, egnv egnv0, egna egna0, azug azug0) {
        super(5, "GetImportSimContactsSuggestionOperation", azug0);
        this.f = efzc0;
        this.b = getImportSimContactsSuggestionsRequest0;
        this.c = egns0;
        this.d = egnv0;
        this.e = egna0;
        this.g = egno.a(context0, baqr0, new String[]{"android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE"});
    }

    private final List b(Set set0, Set set1) {
        ArrayList arrayList0 = new ArrayList();
        ArrayMap arrayMap0 = new ArrayMap();
        bxe bxe0 = new bxe(((bxf)set0));
        while(bxe0.hasNext()) {
            Object object0 = bxe0.next();
            egnt egnt0 = (egnt)object0;
            try {
                List list0 = this.c.a(egnt0);
                arrayList0.addAll(list0);
                arrayMap0.put(egnt0, Integer.valueOf(((ggna)list0).c));
            }
            catch(RuntimeException runtimeException0) {
                egmz.c("Failed to load contacts from SIM");
                throw new cjuh(8, "Failed to load contacts from SIM", null, runtimeException0);
            }
        }
        try {
            this.d.c(arrayList0);
        }
        catch(RuntimeException runtimeException1) {
            egmz.c("Failed to find existing raw contacts");
            throw new cjuh(8, "Failed to find existing raw contacts", null, runtimeException1);
        }
        List list1 = new ArrayList();
        for(Object object1: arrayMap0.entrySet()) {
            egnt egnt1 = (egnt)((Map.Entry)object1).getKey();
            int v = (int)(((Integer)((Map.Entry)object1).getValue()));
            BitSet bitSet0 = (BitSet)((egnu)this.d).c.get(egnt1);
            int v1 = bitSet0 == null ? 0 : bitSet0.cardinality();
            BitSet bitSet1 = (BitSet)((egnu)this.d).c.get(egnt1);
            BitSet bitSet2 = bitSet1 == null ? new BitSet(0) : ((BitSet)bitSet1.clone());
            int v2 = v - v1 <= 0 || egnt1.b != 1 || (!egmz.e(this.b) || set1.contains(Integer.valueOf(egnt1.a))) ? 1 : 3;
            list1.add(new ImportSimContactsSuggestion(this.b.a, egnt1.a, egnt1.b, v1, v, v2, false, bitSet2));
        }
        return list1;
    }

    private static void c(String s) {
        ((ggtj)egmz.a.i()).x(s);
    }

    private static void d(String s) {
        ((ggtj)egmz.a.j()).x(s);
    }

    private static final boolean e(GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest0) {
        return "com.google".equals(getImportSimContactsSuggestionsRequest0.a.b());
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        List list1;
        Set set0;
        if(this.g == 0) {
            GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest0 = this.b;
            if(getImportSimContactsSuggestionsRequest0.b) {
                if(egmz.e(getImportSimContactsSuggestionsRequest0)) {
                    if(getImportSimContactsSuggestionsRequest0.b(1)) {
                        getImportSimContactsSuggestionsRequest0 = GetImportSimContactsSuggestionsRequest.a(getImportSimContactsSuggestionsRequest0.a);
                        goto label_11;
                    }
                    egmz.d("Imports are only recommended for EF_ADN.");
                    throw new cjuh(10, "Imports are only recommended for EF_ADN.");
                }
                egmz.d("Imports are only recommended for google accounts.");
                throw new cjuh(10, "Imports are only recommended for google accounts.");
            }
            try {
            label_11:
                set0 = (Set)this.e.a().get();
            }
            catch(InterruptedException | ExecutionException exception0) {
                egmz.c("Failed to load recent imports");
                throw new cjuh(8, "Failed to load recent imports", null, exception0);
            }
            bxf bxf0 = new bxf();
            for(Object object0: ((egnr)this.c).b()) {
                egnt egnt0 = (egnt)object0;
                if(getImportSimContactsSuggestionsRequest0.b(egnt0.b)) {
                    bxf0.add(egnt0);
                }
            }
            if(getImportSimContactsSuggestionsRequest0.b) {
                bxe bxe0 = new bxe(bxf0);
                while(bxe0.hasNext()) {
                    Object object1 = bxe0.next();
                    if(set0.contains(Integer.valueOf(((egnt)object1).a))) {
                        bxe0.remove();
                    }
                }
                List list0 = this.b(bxf0, set0);
                list1 = new ArrayList(list0.size());
                for(Object object2: list0) {
                    ImportSimContactsSuggestion importSimContactsSuggestion0 = (ImportSimContactsSuggestion)object2;
                    if(importSimContactsSuggestion0.f == 3) {
                        list1.add(importSimContactsSuggestion0);
                    }
                }
            }
            else {
                list1 = this.b(bxf0, set0);
            }
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dW);
            this.f.n(Status.b, list1, apiMetadata0);
            return;
        }
        egmz.d("Missing required permissions");
        throw new cjuh(17, "Missing required permissions");
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.f.n(status0, ggna.a, ApiMetadata.b);
    }
}

