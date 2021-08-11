package practice;

public interface Flying {
	void fly();
	default void power0ff() {
		System.out.println("飛んでいる場合は落下します。");
	}

}
