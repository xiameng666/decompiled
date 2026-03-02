import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import java.util.concurrent.ExecutionException;

public final class calw {
    public static final bboh a;

    static {
        calw.a = bboh.b("GmscoreIpa", bbcu.ee);
    }

    public static final int a(String s, elfg elfg0) {
        abwe abwe0 = new abwe();
        abwe0.a = 3;
        abwe0.c();
        abwe0.b = new STSortSpec("(GET_NUM _DOC_SCORE)");
        abwe0.c = "MediastoreDailyDiff";
        QuerySpecification querySpecification0 = abwe0.a();
        evql evql0 = elfg0.b("(QT \"\")", "com.google.android.gms", new String[]{s}, 0, 1, querySpecification0);
        try {
            return ((SearchResults)evrg.n(evql0)).m;
        }
        catch(ExecutionException | InterruptedException exception0) {
            if((exception0.getCause() instanceof aztb)) {
                ((ggtj)calw.a.j()).B("Query failed: %s", (exception0.getCause() == null || exception0.getCause().getMessage() == null ? "" : exception0.getCause().getMessage()));
            }
            return -1;
        }
    }
}

