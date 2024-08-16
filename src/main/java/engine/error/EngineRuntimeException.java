package engine.error;

public class EngineRuntimeException extends RuntimeException {

    public EngineRuntimeException() {super();}

    public EngineRuntimeException(String s) {
        super(s);
    }

    public EngineRuntimeException(Exception e) {
        super(e);
    }
}
