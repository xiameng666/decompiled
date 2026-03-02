import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Callable;

public final class fupi implements Callable {
    public final fupl a;

    public fupi(fupl fupl0) {
        this.a = fupl0;
    }

    @Override
    public final Object call() {
        Object object2;
        hhco hhco0;
        IOException iOException1;
        InputStream inputStream1;
        InputStream inputStream0 = null;
        try {
            inputStream1 = this.a.b.getResources().openRawResource(0x7F140222);  // raw:monogram_data_pb
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            inputStream1 = null;
            goto label_12;
        }
        catch(Throwable throwable0) {
            ghjp.a(inputStream0);
            throw throwable0;
        }
        try {
            try {
                hhco0 = (hhco)((Parser)((ProtoLiteMessage)hhco.a).jf(7, null)).k(inputStream1);
                goto label_20;
            }
            catch(IOException iOException1) {
            }
        label_12:
            ((ggsc)((ggsc)((ggsc)fupl.a.i()).s(iOException1)).ar(19012)).x("Error reading config, using defaults.");
            hhco0 = hhco.a;
        }
        catch(Throwable throwable1) {
            inputStream0 = inputStream1;
            throwable0 = throwable1;
            ghjp.a(inputStream0);
            throw throwable0;
        }
    label_20:
        ghjp.a(inputStream1);
        Map map0 = DesugarCollections.unmodifiableMap(hhco0.b);
        Object object0 = new bzs(map0.size());
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            String s = (String)map$Entry0.getKey();
            String s1 = ((String)map$Entry0.getValue()).isEmpty() ? s : ((String)map$Entry0.getValue());
            char[] arr_c = s.toCharArray();
            fupk fupk0 = null;
            for(int v = 0; v < arr_c.length; ++v) {
                int v1 = arr_c[v];
                if(fupk0 == null) {
                    object2 = object0;
                }
                else {
                    if(fupk0.b == null) {
                        fupk0.b = new bzs();
                    }
                    object2 = fupk0.b;
                }
                Character character0 = Character.valueOf(((char)v1));
                fupk fupk1 = (fupk)((bzs)object2).get(character0);
                if(fupk1 == null) {
                    fupk1 = new fupk();
                    ((bzs)object2).put(character0, fupk1);
                }
                fupk0 = fupk1;
            }
            fupk0.a = s1;
        }
        return object0;
    }
}

