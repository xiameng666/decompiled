import android.content.Context;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Response;

final class bwqv extends elbp {
    final String a;

    public bwqv(Context context0, bwmx bwmx0, RegisterCorpusInfoCall.Request registerCorpusInfoCall$Request0, bwud bwud0, String s) {
        this.a = s;
        super(context0, bwmx0, registerCorpusInfoCall$Request0, bwud0);
    }

    @Override  // ekyp
    protected final void c(Object object0) {
        if(!((RegisterCorpusInfoCall.Response)object0).a.e()) {
            bwne.i("Failed to register corpus \'%s\':\'%s\'.", this.a, ((RegisterCorpusInfoCall.Response)object0).a);
        }
    }
}

