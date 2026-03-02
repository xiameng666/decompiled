import org.xmlpull.v1.XmlPullParser;

public final class bwty extends Exception {
    public bwty(String s, XmlPullParser xmlPullParser0, String s1) {
        super("From " + s + ": " + xmlPullParser0.getPositionDescription() + ": " + s1);
    }

    public bwty(String s, XmlPullParser xmlPullParser0, String s1, Throwable throwable0) {
        super("From " + s + ": " + xmlPullParser0.getPositionDescription() + ": " + s1, throwable0);
    }
}

