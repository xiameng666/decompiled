import android.database.Cursor;
import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;
import java.util.concurrent.Executor;
import jeb.synthetic.TWR;

public final class calz extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Producer d;
    private final Producer e;
    private final Producer f;
    private final Provider g;
    private final Provider h;

    public calz(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Producer producer2, Producer producer3, Producer producer4, Provider provider2, Provider provider3) {
        super(provider1, new ProducerToken(calz.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = Producers.c(producer2);
        this.e = Producers.c(producer3);
        this.f = Producers.c(producer4);
        this.g = provider2;
        this.h = provider3;
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        gmcd gmcd6;
        gmcd gmcd5;
        gmcd gmcd4;
        caoh caoh1;
        int v3;
        gmcd gmcd3;
        gmcd gmcd2;
        gmcd gmcd1;
        gmcd gmcd0;
        caod caod0;
        caoh caoh0;
        int v;
        Boolean boolean0 = Boolean.valueOf(false);
        Cursor cursor0 = (Cursor)((List)object0).get(0);
        Boolean boolean1 = Boolean.valueOf(true);
        Cursor cursor1 = (Cursor)((List)object0).get(1);
        gopj gopj0 = (gopj)((List)object0).get(2);
        Executor executor0 = (Executor)((List)object0).get(3);
        capf capf0 = (capf)((List)object0).get(4);
        boolean z = huhz.a.h().K();
        Provider provider0 = this.h;
        if(z) {
            canh canh0 = new canh(8);
            canh0.f();
            capc capc0 = null;
            caot caot0 = ((camk)this.g).a().a(Long.valueOf(0L), null);
            if(caot0 != null && cursor1 != null) {
                try {
                    if(!caot0.a.isClosed() && !cursor1.isClosed() && (caot0.a() != 0 || cursor1.getCount() != 0)) {
                        v = cursor1.getColumnIndex("_ID");
                        caoh0 = new caoh(gopj0, executor0, capf0, canh0);
                        ((camj)provider0).a();
                        caod0 = new caod(gopj0, executor0, capf0, canh0);
                        if(caot0.a() != 0 || cursor1.getCount() <= 0) {
                            if(caot0.a() <= 0 || cursor1.getCount() != 0) {
                                cursor1.moveToFirst();
                                while(true) {
                                    boolean z1 = true;
                                label_24:
                                    if(!caot0.e() || cursor1.isAfterLast()) {
                                        break;
                                    }
                                    if(z1) {
                                        capc0 = (capc)caot0.d();
                                    }
                                    if(capc0 == null) {
                                        goto label_24;
                                    }
                                    long v1 = cursor1.getLong(v);
                                    canr canr0 = new canr(v1);
                                    int v2 = Long.compare(capc0.g.longValue(), v1);
                                    if(v2 == 0) {
                                        cursor1.moveToNext();
                                        continue;
                                    }
                                    if(v2 >= 0) {
                                        caod0.c(capc0);
                                        ((ggtj)caly.a.h()).x("Media file added to Icing during mediastore batch indexing.");
                                        continue;
                                    }
                                    caoh0.c(canr0);
                                    cursor1.moveToNext();
                                    ((ggtj)caly.a.h()).x("Media file deleted from Icing during mediastore batch indexing.");
                                    z1 = false;
                                    goto label_24;
                                }
                                if(!caot0.e() && !cursor1.isAfterLast()) {
                                    ((ggtj)caly.a.h()).x("Deleting media files from Icing during mediastore batch indexing");
                                    caly.b(cursor1, v, caoh0);
                                }
                                else if(caot0.e() && cursor1.isAfterLast()) {
                                    caly.a(caot0, caod0);
                                    ((ggtj)caly.a.h()).x("Adding media files from Icing during mediastore batch indexing");
                                }
                                gmcd0 = gmbu.b(new gmcd[]{caod0.a(), caoh0.a()}).a(new calx(), executor0);
                                goto label_51;
                            }
                            goto label_54;
                        }
                        goto label_60;
                    }
                    goto label_67;
                }
                catch(Throwable throwable0) {
                    goto label_70;
                }
                try {
                label_51:
                    caot0.close();
                }
                catch(Throwable throwable1) {
                    goto label_75;
                }
                cursor1.close();
                return gmcd0;
                try {
                label_54:
                    ((ggtj)caly.a.j()).z("Adding %d media files to Icing during mediastore batch indexing", cursor1.getCount());
                    caly.a(caot0, caod0);
                    gmcd1 = caod0.a();
                }
                catch(Throwable throwable0) {
                    goto label_70;
                }
                try {
                    caot0.close();
                }
                catch(Throwable throwable1) {
                    goto label_75;
                }
                cursor1.close();
                return gmcd1;
                try {
                label_60:
                    cursor1.moveToFirst();
                    ((ggtj)caly.a.j()).z("Removing %d media files from Icing during mediastore batch indexing", cursor1.getCount());
                    caly.b(cursor1, v, caoh0);
                    gmcd2 = caoh0.a();
                }
                catch(Throwable throwable0) {
                    goto label_70;
                }
                try {
                    caot0.close();
                }
                catch(Throwable throwable1) {
                    goto label_75;
                }
                cursor1.close();
                return gmcd2;
                try {
                label_67:
                    gmcd3 = gmbu.i(boolean1);
                    goto label_72;
                }
                catch(Throwable throwable0) {
                    try {
                    label_70:
                        TWR.safeClose$NT(caot0, throwable0);
                        throw throwable0;
                    label_72:
                        caot0.close();
                        goto label_77;
                    }
                    catch(Throwable throwable1) {
                    }
                }
            label_75:
                TWR.safeClose$NT(cursor1, throwable1);
                throw throwable1;
            label_77:
                cursor1.close();
                return gmcd3;
            }
            return gmbu.i(boolean0);
        }
        if(cursor0 != null && cursor1 != null) {
            canh canh1 = new canh(4);
            canh1.f();
            try {
                if(!cursor0.isClosed() && !cursor1.isClosed() && (cursor0.getCount() != 0 || cursor1.getCount() != 0)) {
                    v3 = cursor1.getColumnIndex("_ID");
                    int v4 = cursor0.getColumnIndex("_id");
                    int v5 = cursor1.getColumnIndex("MEDIA_TYPE");
                    caoh1 = new caoh(gopj0, executor0, capf0, canh1);
                    if(cursor0.getCount() != 0 || cursor1.getCount() <= 0) {
                        if(cursor0.getCount() > 0) {
                            cursor1.getCount();
                        }
                        cursor0.moveToFirst();
                        cursor1.moveToFirst();
                        while(!cursor0.isAfterLast() && !cursor1.isAfterLast()) {
                            long v6 = cursor0.getLong(v4);
                            long v7 = cursor1.getLong(v3);
                            cursor1.getInt(v5);
                            canr canr1 = new canr(v7);
                            int v8 = Long.compare(v6, v7);
                            if(v8 == 0) {
                                cursor0.moveToNext();
                                cursor1.moveToNext();
                            }
                            else if(v8 < 0) {
                                caoh1.c(canr1);
                                cursor1.moveToNext();
                            }
                            else {
                                cursor0.moveToNext();
                            }
                            if(cursor0.isAfterLast() && !cursor1.isAfterLast()) {
                                caly.b(cursor1, v3, caoh1);
                                break;
                            }
                            if(!cursor0.isAfterLast() && cursor1.isAfterLast()) {
                                break;
                            }
                        }
                        gmcd4 = caoh1.a();
                        goto label_113;
                    }
                    goto label_116;
                }
                goto label_122;
            }
            catch(Throwable throwable2) {
                goto label_125;
            }
            try {
            label_113:
                cursor1.close();
            }
            catch(Throwable throwable3) {
                goto label_130;
            }
            cursor0.close();
            return gmcd4;
            try {
            label_116:
                cursor1.moveToFirst();
                caly.b(cursor1, v3, caoh1);
                gmcd5 = caoh1.a();
            }
            catch(Throwable throwable2) {
                goto label_125;
            }
            try {
                cursor1.close();
            }
            catch(Throwable throwable3) {
                goto label_130;
            }
            cursor0.close();
            return gmcd5;
            try {
            label_122:
                gmcd6 = gmbu.i(boolean1);
                goto label_127;
            }
            catch(Throwable throwable2) {
                try {
                label_125:
                    TWR.safeClose$NT(cursor1, throwable2);
                    throw throwable2;
                label_127:
                    cursor1.close();
                    goto label_132;
                }
                catch(Throwable throwable3) {
                }
            }
        label_130:
            TWR.safeClose$NT(cursor0, throwable3);
            throw throwable3;
        label_132:
            cursor0.close();
            return gmcd6;
        }
        return gmbu.i(boolean0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get()});
    }
}

