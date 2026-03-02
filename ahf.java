import android.app.appsearch.AppSearchResult;
import android.app.appsearch.SearchSpec;
import j..util.function.Consumer.-CC;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public final class ahf implements Consumer {
    public final ahj a;
    public final jqz b;
    public final aga c;
    public final String d;

    public ahf(ahj ahj0, jqz jqz0, aga aga0) {
        this.a = ahj0;
        this.b = jqz0;
        this.c = aga0;
        this.d = "";
    }

    @Override
    public final void accept(Object object0) {
        AppSearchResult appSearchResult0 = (AppSearchResult)object0;
        boolean z = appSearchResult0.isSuccess();
        ahj ahj0 = this.a;
        jqz jqz0 = this.b;
        aga aga0 = this.c;
        String s = this.d;
        if(!z) {
            jqz0.h(new ags(appSearchResult0.getResultCode(), appSearchResult0.getErrorMessage()));
            return;
        }
        try {
            Set set0 = (Set)appSearchResult0.getResultValue();
            List list0 = aga0.a();
            for(int v = 0; v < list0.size(); ++v) {
                if(set0.contains(list0.get(v))) {
                    SearchSpec searchSpec0 = aid.a(ahj0.c, aga0);
                    ahc ahc0 = new ahc(jqz0);
                    ahj0.a.remove(s, searchSpec0, ahj0.b, ahc0);
                    return;
                }
            }
            jqz0.g(null);
        }
        catch(Throwable throwable0) {
            jqz0.h(throwable0);
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

