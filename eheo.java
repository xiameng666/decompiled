import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

public final class eheo extends ehel {
    public eheo(Context context0, ehfu ehfu0, ehco ehco0, ehab ehab0, ehim ehim0, ehfj ehfj0) {
        super(context0, girk.d, ehfu0, ehab0, ehim0, ehco0, ehfj0);
    }

    @Override  // ehel
    protected final void e(egzv egzv0, List list0) {
        throw new UnsupportedOperationException("Filtering invalid group membership before delete requests is not supported");
    }

    @Override  // ehel
    protected final void f(egzv egzv0) {
        String s = egzv0.a;
        if(TextUtils.isEmpty(s)) {
            egig.b("FSA2_ContactSyncGrpc", "@deleteContact: bailing out upon missing contact ID");
            return;
        }
        this.f.g(Arrays.asList(new String[]{s}), "FSA_deletePeople");
        this.b(egzv0);
    }

    public final int i(List list0) {
        egzv egzv0;
        try {
            if(list0.size() == 1) {
                if(ehhz.d(((egzv)list0.get(0)).m, ((egzv)list0.get(0)).f)) {
                    ehim ehim0 = this.e;
                    ++((ehiv)ehim0).a.stats.numParseExceptions;
                    ehim0.h(this.a, gjgi.b, false, 8, 1);
                    return 0;
                }
                egzv0 = (egzv)list0.get(0);
                goto label_7;
            }
            goto label_12;
        }
        catch(ArrayStoreException | acse | JSONException | ehfd | iapl exception0) {
            goto label_39;
        }
        try {
        label_7:
            eheo.j(egzv0);
            goto label_12;
        }
        catch(iapl iapl0) {
            try {
                this.e.h(girk.d, gjgi.b, false, 9, 1);
                throw iapl0;
            label_12:
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    arrayList0.add(((egzv)object0).a);
                }
                ehco ehco0 = this.f;
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: arrayList0) {
                    String s = (String)object1;
                    if(TextUtils.isEmpty(s)) {
                        egig.b("FSA2_ContactSyncGrpc", "@deleteContact: bailing out upon missing contact ID");
                    }
                    else {
                        arrayList1.add(s);
                    }
                }
                ehco0.g(arrayList1, "FSA_bulkDeletePeople");
                for(Object object2: list0) {
                    egzv egzv1 = (egzv)object2;
                    if(!TextUtils.isEmpty(egzv1.a)) {
                        this.b(egzv1);
                    }
                }
                return list0.size();
            }
            catch(ArrayStoreException | acse | JSONException | ehfd | iapl exception0) {
                goto label_39;
            }
        }
        catch(ArrayStoreException | acse | JSONException | ehfd exception0) {
        label_39:
            if((exception0 instanceof iapl)) {
                girk girk0 = this.a;
                eggf eggf0 = eheo.a(girk0);
                switch(this.g.c(eggf0, ((iapl)exception0).a.t.r, ((iapl)exception0).a.u) - 1) {
                    case 1: {
                        this.c(list0);
                        this.e.h(girk0, gjgi.b, false, 3, list0.size());
                        return list0.size();
                    }
                    case 5: {
                        goto label_50;
                    }
                }
                if(list0.size() == 1 && ehhz.e(exception0)) {
                    this.c.b(((egzv)list0.get(0)));
                    this.d.f();
                    goto label_54;
                label_50:
                    if(list0.size() == 1 && ehhz.e(exception0)) {
                        this.c.b(((egzv)list0.get(0)));
                        this.d.f();
                    }
                    return 0;
                }
            }
        label_54:
            if(ehfl.a(false, gjgi.b, this.a, exception0, this.e, list0.size()) == girk.d) {
                this.c(list0);
                return list0.size();
            }
            return 0;
        }
    }

    public static void j(egzv egzv0) {
        String s = egzv0.a;
        if(gfta.c(s)) {
            return;
        }
        try {
            Long.parseLong(s, 16);
        }
        catch(NumberFormatException unused_ex) {
            throw new iapl(iaph.d.a().f("Request contains an invalid argument."));
        }
    }
}

