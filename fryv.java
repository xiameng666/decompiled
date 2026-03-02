import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

public class fryv {
    public final CharSequence a(Context context0) {
        ibuq.f(context0, "context");
        if((this instanceof fryu)) {
            return ((fryu)this).a;
        }
        if((this instanceof fryt)) {
            return ((fryt)this).a;
        }
        if((this instanceof fryr)) {
            CharSequence charSequence0 = context0.getString(((fryr)this).a);
            ibuq.e(charSequence0, "getString(...)");
            return charSequence0;
        }
        if((this instanceof frys)) {
            Object[] arr_object = ((frys)this).b;
            ArrayList arrayList0 = new ArrayList(arr_object.length);
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                if((object0 instanceof fryv)) {
                    object0 = ((fryv)object0).a(context0);
                }
                arrayList0.add(object0);
            }
            Object[] arr_object1 = arrayList0.toArray(new Object[0]);
            Object[] arr_object2 = Arrays.copyOf(arr_object1, arr_object1.length);
            CharSequence charSequence1 = context0.getString(((frys)this).a, arr_object2);
            ibuq.c(charSequence1);
            return charSequence1;
        }
        if((this instanceof fryq)) {
            return ((fryq)this).a;
        }
        throw new ibnq();
    }
}

