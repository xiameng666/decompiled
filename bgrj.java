import j..util.Optional;

public final class bgrj implements bgrl {
    public final bbng a;
    private final bgqg b;

    static {
        bgrz.a("throtV");
    }

    public bgrj(bbng bbng0, bgqg bgqg0) {
        this.a = bbng0;
        this.b = bgqg0;
    }

    @Override  // bgrl
    public final void a(hguc hguc0, ProtoLiteBuilder hftp0) {
        if(((hgug)hftp0.b_message).l) {
            if((hguc0.b & 8) != 0) {
                Optional optional0 = this.b.e((hguc0.h == null ? hgtw.a : hguc0.h).b).map(new bgri(this, hguc0));
                if(optional0.isPresent() && ((Boolean)optional0.get()).booleanValue()) {
                    boolean z = hsbn.a.e().t();
                    bgrz.b(hguc0);
                    if(!z) {
                        throw new bgrk(12);
                    }
                }
            }
            else if(this.b.d((hguc0.c == null ? hgtu.a : hguc0.c)).isPresent()) {
                throw new bgrk(16);
            }
        }
    }
}

