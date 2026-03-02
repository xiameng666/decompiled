import android.net.Uri;
import android.provider.MediaStore.Files;
import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;

public final class camb extends AbstractProducesMethodProducer {
    private final Producer b;

    public camb(Provider provider0, Provider provider1, Producer producer0) {
        super(provider1, new ProducerToken(camb.class), provider0);
        this.b = Producers.c(producer0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        Uri uri0 = MediaStore.Files.getContentUri("external");
        caon caon0 = new caon();
        caon0.f = 1;
        caon0.c = uri0;
        caon0.d = new String[]{"_id", "media_type"};
        caon0.a = (long)0L;
        return gmbu.i(((caop)object0).a(new caoo(caon0)));
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return this.b.get();
    }
}

