public class gopc extends Exception {
    @Deprecated
    protected gopc() {
    }

    public gopc(String s) {
        batl.r(s, "Detail message must not be empty");
        super(s);
    }
}

