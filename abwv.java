import com.google.android.gms.appdatasearch.SearchResults;
import j..util.Objects;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class abwv implements Iterator {
    protected int a;
    public abwt b;
    public final Map[] c;
    final SearchResults d;

    public abwv(SearchResults searchResults0) {
        Objects.requireNonNull(searchResults0);
        this.d = searchResults0;
        super();
        Map[] arr_map = null;
        if(!searchResults0.a()) {
            String[] arr_s = searchResults0.i;
            if(arr_s != null) {
                arr_map = new Map[arr_s.length];
            }
        }
        this.c = arr_map;
    }

    public final abwu a() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        abwu abwu0 = new abwu(this.d, this.a, this);
        ++this.a;
        return abwu0;
    }

    @Override
    public final boolean hasNext() {
        return !this.d.a() && this.a < this.d.g;
    }

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

