public class InvalidDivisor extends Exception {
    String msg;
    InvalidDivisor(String msg) {
        super(msg);
        this.msg = msg;
    }
    @Override public String toString() {
        return this.msg;
    }
}
