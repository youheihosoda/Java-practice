package extend.phone;

public interface Phone {
    final int MAX_NUMBER_DIGITS = 11;
    void call(String number);
    
    default void power0ff() {
    	System.out.println("電話を切ります。");
    }
}

