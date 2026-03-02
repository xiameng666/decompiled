import com.google.android.gms.appdatasearch.SuggestionResults;
import j..util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class abxd implements Iterator {
    final SuggestionResults a;
    private int b;

    public abxd(SuggestionResults suggestionResults0) {
        Objects.requireNonNull(suggestionResults0);
        this.a = suggestionResults0;
        super();
        this.b = 0;
    }

    @Override
    public final boolean hasNext() {
        String[] arr_s = this.a.b;
        return arr_s == null ? false : this.b < arr_s.length;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ++this.b;
        return new abxc(this.a);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

