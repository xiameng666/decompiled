import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import androidx.activity.result.ActivityResult;

public final class bxpt implements acn {
    public final bxpx a;

    public bxpt(bxpx bxpx0) {
        this.a = bxpx0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        bxpx bxpx0 = this.a;
        ValueCallback valueCallback0 = bxpx0.d;
        if(valueCallback0 == null) {
            return;
        }
        Intent intent0 = ((ActivityResult)object0).b;
        if(intent0 == null) {
            valueCallback0.onReceiveValue(null);
        }
        else {
            valueCallback0.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(((ActivityResult)object0).a, intent0));
        }
        bxpx0.d = null;
    }
}

