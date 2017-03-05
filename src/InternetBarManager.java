
public class InternetBarManager {
	private InternetBarService mListener;
	
	public void registerObserver(InternetBarService listner) {
		mListener = listner;
	}
	
	public void unregisterObserver() {
		mListener = null;
	}
	
	public void recharge(int money) {
		if (mListener != null) {
			mListener.onRecharge(money);
		}
	}

}
