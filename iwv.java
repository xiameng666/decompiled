import android.text.Editable;
import android.text.Html.TagHandler;
import org.xml.sax.XMLReader;

public final class iwv implements Html.TagHandler {
    @Override  // android.text.Html$TagHandler
    public final void handleTag(boolean z, String s, Editable editable0, XMLReader xMLReader0) {
        if(xMLReader0 != null && editable0 != null && z && ibuq.m(s, "ContentHandlerReplacementTag")) {
            xMLReader0.setContentHandler(new iwn(xMLReader0.getContentHandler(), editable0));
        }
    }
}

