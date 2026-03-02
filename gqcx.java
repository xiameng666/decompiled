import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

public final class gqcx implements gqae {
    private final gqbc a;

    public gqcx(gqbc gqbc0) {
        this.a = gqbc0;
    }

    @Override  // gqae
    public final gqad a(gpzl gpzl0, TypeToken typeToken0) {
        Type type0 = typeToken0.getType();
        Class class0 = typeToken0.getRawType();
        if(!Map.class.isAssignableFrom(class0)) {
            return null;
        }
        if(Properties.class.isAssignableFrom(class0)) {
            return String.class == Boolean.TYPE || String.class == Boolean.class ? new gqcw(this, new gqdl(gpzl0, gqeq.f, String.class), new gqdl(gpzl0, gpzl0.a(TypeToken.get(String.class)), String.class), this.a.a(typeToken0, false)) : new gqcw(this, new gqdl(gpzl0, gpzl0.a(TypeToken.get(String.class)), String.class), new gqdl(gpzl0, gpzl0.a(TypeToken.get(String.class)), String.class), this.a.a(typeToken0, false));
        }
        Type type1 = gqbi.d(type0, class0, Map.class);
        if((type1 instanceof ParameterizedType)) {
            ((ParameterizedType)type1).getActualTypeArguments();
        }
        return class1 == Boolean.TYPE || class1 == Boolean.class ? new gqcw(this, new gqdl(gpzl0, gqeq.f, class1), new gqdl(gpzl0, gpzl0.a(TypeToken.get(class2)), class2), this.a.a(typeToken0, false)) : new gqcw(this, new gqdl(gpzl0, gpzl0.a(TypeToken.get(class1)), class1), new gqdl(gpzl0, gpzl0.a(TypeToken.get(class2)), class2), this.a.a(typeToken0, false));
    }
}

