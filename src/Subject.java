public interface Subject {
	public void registerObservers(Observer fan);
	public void removeObservers(Observer fan);
	public void notifyObservers();
}
