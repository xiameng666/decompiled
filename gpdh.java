import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;

public final class gpdh implements gpcy, gpda {
    public final JsonWriter a;
    private final Map b;
    private final Map c;
    private final gpcx d;
    private final boolean e;

    public gpdh(Writer writer0, Map map0, Map map1, gpcx gpcx0, boolean z) {
        this.a = new JsonWriter(writer0);
        this.b = map0;
        this.c = map1;
        this.d = gpcx0;
        this.e = z;
    }

    @Override  // gpcy
    public final void a(gpcw gpcw0, Object object0) {
        this.f(gpcw0.a, object0);
    }

    @Override  // gpda
    public final void b(String s) {
        this.d(s);
    }

    @Override  // gpda
    public final void c(boolean z) {
        this.a.value(z);
    }

    public final void d(String s) {
        this.a.value(s);
    }

    final void e(gpcx gpcx0, Object object0) {
        this.a.beginObject();
        gpcx0.a(object0, this);
        this.a.endObject();
    }

    public final void f(String s, Object object0) {
        if(this.e) {
            if(object0 == null) {
                return;
            }
            this.a.name(s);
            this.g(object0);
            return;
        }
        JsonWriter jsonWriter0 = this.a;
        jsonWriter0.name(s);
        if(object0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        this.g(object0);
    }

    public final void g(Object object0) {
        if(object0 == null) {
            this.a.nullValue();
            return;
        }
        if((object0 instanceof Number)) {
            this.a.value(((Number)object0));
            return;
        }
        if(object0.getClass().isArray()) {
            if((object0 instanceof byte[])) {
                String s = Base64.encodeToString(((byte[])object0), 2);
                this.a.value(s);
                return;
            }
            JsonWriter jsonWriter0 = this.a;
            jsonWriter0.beginArray();
            int v = 0;
            if((object0 instanceof int[])) {
                while(v < ((int[])object0).length) {
                    jsonWriter0.value(((long)((int[])object0)[v]));
                    ++v;
                }
            }
            else if((object0 instanceof long[])) {
                while(v < ((long[])object0).length) {
                    jsonWriter0.value(((long[])object0)[v]);
                    ++v;
                }
            }
            else if((object0 instanceof double[])) {
                while(v < ((double[])object0).length) {
                    jsonWriter0.value(((double[])object0)[v]);
                    ++v;
                }
            }
            else if((object0 instanceof boolean[])) {
                while(v < ((boolean[])object0).length) {
                    jsonWriter0.value(((boolean[])object0)[v]);
                    ++v;
                }
            }
            else if((object0 instanceof Number[])) {
                while(v < ((Number[])object0).length) {
                    this.g(((Number[])object0)[v]);
                    ++v;
                }
            }
            else {
                while(v < ((Object[])object0).length) {
                    this.g(((Object[])object0)[v]);
                    ++v;
                }
            }
            jsonWriter0.endArray();
            return;
        }
        if((object0 instanceof Collection)) {
            JsonWriter jsonWriter1 = this.a;
            jsonWriter1.beginArray();
            for(Object object1: ((Collection)object0)) {
                this.g(object1);
            }
            jsonWriter1.endArray();
            return;
        }
        if((object0 instanceof Map)) {
            this.a.beginObject();
            for(Object object2: ((Map)object0).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                Object object3 = map$Entry0.getKey();
                try {
                    this.f(((String)object3), map$Entry0.getValue());
                }
                catch(ClassCastException classCastException0) {
                    throw new gpcu(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", object3, object3.getClass()), classCastException0);
                }
            }
            this.a.endObject();
            return;
        }
        Class class0 = object0.getClass();
        gpcx gpcx0 = (gpcx)this.b.get(class0);
        if(gpcx0 != null) {
            this.e(gpcx0, object0);
            return;
        }
        Class class1 = object0.getClass();
        gpcz gpcz0 = (gpcz)this.c.get(class1);
        if(gpcz0 != null) {
            gpcz0.a(object0, this);
            return;
        }
        if((object0 instanceof Enum)) {
            if((object0 instanceof gpdi)) {
                int v1 = ((gpdi)object0).a();
                this.a.value(((long)v1));
                return;
            }
            this.d(((Enum)object0).name());
            return;
        }
        this.e(this.d, object0);
    }
}

