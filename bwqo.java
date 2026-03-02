import android.content.Context;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Response;
import j..util.Objects;

final class bwqo extends elbp {
    final String a;
    final bwsa b;
    final CorpusStatus c;
    final bwmx d;
    final bwqt e;
    final int f;

    public bwqo(bwqt bwqt0, Context context0, bwmx bwmx0, RegisterCorpusInfoCall.Request registerCorpusInfoCall$Request0, bwud bwud0, String s, bwsa bwsa0, CorpusStatus corpusStatus0, bwmx bwmx1, int v) {
        this.a = s;
        this.b = bwsa0;
        this.c = corpusStatus0;
        this.d = bwmx1;
        this.f = v;
        Objects.requireNonNull(bwqt0);
        this.e = bwqt0;
        super(context0, bwmx0, registerCorpusInfoCall$Request0, bwud0);
    }

    @Override  // ekyp
    protected final void c(Object object0) {
        if(!((RegisterCorpusInfoCall.Response)object0).a.e()) {
            bwne.i("Failed to register corpus \'%s\':\'%s\'.", this.a, ((RegisterCorpusInfoCall.Response)object0).a);
            return;
        }
        bwud bwud0 = this.o;
        bwqt.o(this.e.getWritableDatabase(), this.b, bwud0, this.c, this.d, this.f);
    }
}

