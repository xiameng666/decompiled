import android.content.res.AssetManager;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

public final class qpk {
    public final qpu a;
    public final Map b;
    public final Map c;
    public final AssetManager d;
    public String e;

    public qpk(Drawable.Callback drawable$Callback0) {
        this.a = new qpu();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = ".ttf";
        if(!(drawable$Callback0 instanceof View)) {
            qtq.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View)drawable$Callback0).getContext().getAssets();
    }
}

