import android.os.Bundle;
import androidx.appsearch.safeparcel.GenericDocumentParcel;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class afx extends ajk {
    final GenericDocumentParcel a;
    final List b;
    public final String c;
    public final String d;
    public final double e;
    public final List f;
    public final List g;
    final Bundle h;
    private afa i;
    private List j;

    public afx(GenericDocumentParcel genericDocumentParcel0, List list0, String s, String s1, double f, List list1, List list2, Bundle bundle0) {
        kay.i(genericDocumentParcel0);
        this.a = genericDocumentParcel0;
        kay.i(list0);
        this.b = list0;
        this.c = s;
        this.d = s1;
        this.e = f;
        kay.i(list1);
        this.f = DesugarCollections.unmodifiableList(list1);
        this.g = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        if(bundle0 != null) {
            this.h = bundle0;
            return;
        }
        this.h = Bundle.EMPTY;
    }

    public final afa a() {
        if(this.i == null) {
            this.i = new afa(this.a);
        }
        return this.i;
    }

    public final List b() {
        if(this.j == null) {
            List list0 = this.b;
            this.j = new ArrayList(list0.size());
            for(int v = 0; v < list0.size(); ++v) {
                afu afu0 = (afu)list0.get(v);
                afa afa0 = this.a();
                kay.i(afa0);
                afu0.e = afa0;
                kay.i(afa0);
                List list1 = this.j;
                if(list1 != null) {
                    list1.add(afu0);
                }
            }
            this.j = DesugarCollections.unmodifiableList(this.j);
        }
        List list2 = this.j;
        kay.i(list2);
        return list2;
    }
}

