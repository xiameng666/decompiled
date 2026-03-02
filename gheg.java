import java.util.Set;

abstract class gheg implements ghel {
    protected long a() {
        throw null;
    }

    @Override  // ghel
    public final Set b() {
        return new ghef(this);
    }

    protected final Set c(Set set0, Object object0) {
        ghed ghed0 = new ghed(this, object0);
        ghee ghee0 = new ghee(object0);
        gftb.check(set0);
        return new gheu(set0, ((gful_cronetEngineProvider)ghed0), ((gful_cronetEngineProvider)ghee0));
    }
}

