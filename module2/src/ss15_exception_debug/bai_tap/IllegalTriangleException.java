package ss15_exception_debug.bai_tap;

public class IllegalTriangleException extends Exception{

    @Override
    public String getMessage() {
        return "Sai điều kiện của tam giác";
    }
}
