import android.text.TextUtils;

public final class rcg {
    public static final rch a(String s, boolean z, int v) {
        boolean z1 = !TextUtils.isEmpty(null) || !TextUtils.isEmpty(s);
        boolean z2 = TextUtils.isEmpty(null);
        if(z1 && !z2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if(!z && !z1 && z2) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        rch rch0 = new rch();
        rch0.a = s;
        rch0.b = v;
        return rch0;
    }
}

