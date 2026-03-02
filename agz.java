import android.app.appsearch.AppSearchResult;
import android.app.appsearch.SearchResult;
import android.os.Build.VERSION;
import j..util.function.Consumer.-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public final class agz implements Consumer {
    public final aha a;
    public final jqz b;

    public agz(aha aha0, jqz jqz0) {
        this.a = aha0;
        this.b = jqz0;
    }

    @Override
    public final void accept(Object object0) {
        bxf bxf0;
        boolean z = ((AppSearchResult)object0).isSuccess();
        jqz jqz0 = this.b;
        if(z) {
            aha aha0 = this.a;
            List list0 = (List)((AppSearchResult)object0).getResultValue();
            ArrayList arrayList0 = new ArrayList(list0.size());
            aga aga0 = aha0.a;
            Map map0 = aga0.e();
            boolean z1 = Build.VERSION.SDK_INT < 34 && aii.a(aha0.b) < 340800000L && !map0.isEmpty();
            for(int v = 0; v < list0.size(); ++v) {
                if((Build.VERSION.SDK_INT == 0x1F || Build.VERSION.SDK_INT == 0x20) && v == 0) {
                    if(!aga0.a().isEmpty() && !aga0.a().contains(((SearchResult)list0.get(0)).getGenericDocument().getNamespace())) {
                        jqz0.g(Collections.EMPTY_LIST);
                        return;
                    }
                    v = 0;
                }
                afx afx0 = ahz.a(((SearchResult)list0.get(v)));
                if(z1) {
                    afa afa0 = afx0.a();
                    aez aez0 = new aez(afa0);
                    List list1 = (List)map0.get(afa0.m());
                    List list2 = (List)map0.get("*");
                    if(list1 == null) {
                        bxf0 = list2 == null ? null : new bxf(list2);
                    }
                    else {
                        bxf0 = new bxf(list1);
                    }
                    if(bxf0 != null) {
                        for(Object object1: afa0.o()) {
                            String s = (String)object1;
                            afa afa1 = afa0.g(s);
                            if(afa1 != null) {
                                aha0.b(aez0, afa1, s, bxf0);
                            }
                            else if(!bxf0.contains(s)) {
                                aez0.f(s);
                            }
                        }
                    }
                    afs afs0 = new afs(afx0);
                    afs0.e(aez0.e());
                    List list3 = afx0.b();
                    if(!list3.isEmpty()) {
                        afs0.b();
                        afs0.a.clear();
                    }
                    for(Object object2: list3) {
                        afu afu0 = (afu)object2;
                        if(list1 != null && list1.contains(afu0.a) || list2 != null && list2.contains(afu0.a)) {
                            afs0.d(new aft(afu0).a());
                        }
                    }
                    arrayList0.add(afs0.a());
                }
                else {
                    arrayList0.add(afx0);
                }
            }
            jqz0.g(arrayList0);
            return;
        }
        jqz0.h(new ags(((AppSearchResult)object0).getResultCode(), ((AppSearchResult)object0).getErrorMessage()));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

