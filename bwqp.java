import android.content.Context;
import com.google.android.gms.search.corpora.RequestIndexingCall.Request;
import com.google.android.gms.search.corpora.RequestIndexingCall.Response;

final class bwqp extends elbt {
    final String a;

    public bwqp(Context context0, bwzn bwzn0, bwut bwut0, bwvg bwvg0, bwrc bwrc0, RequestIndexingCall.Request requestIndexingCall$Request0, bwud bwud0, String s) {
        this.a = s;
        super(context0, bwzn0, bwut0, bwvg0, bwrc0, requestIndexingCall$Request0, bwud0);
    }

    @Override  // ekyp
    protected final void c(Object object0) {
        if(!((RequestIndexingCall.Response)object0).a.e()) {
            bwne.i("Request indexing failed for corpus \'%s\':\'%s\'.", this.a, ((RequestIndexingCall.Response)object0).a);
        }
    }
}

