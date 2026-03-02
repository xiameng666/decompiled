import android.net.Uri;

public final class bgrh implements bgrl {
    @Override  // bgrl
    public final void a(hguc hguc0, ProtoLiteBuilder hftp0) {
        if(hguc0.i.isEmpty()) {
            throw new bgrk(15);
        }
        String s = hguc0.i.startsWith("https://") || hguc0.i.startsWith("http://") ? hguc0.i : "https://www.google.com/search?" + hguc0.i;
        if(!((hgug)hftp0.b_message).j.isEmpty()) {
            s = Uri.parse(s).buildUpon().appendQueryParameter("hl", ((hgug)hftp0.b_message).j).build().toString();
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgug hgug0 = (hgug)hftp0.b_message;
        s.getClass();
        hgug0.d = s;
    }
}

