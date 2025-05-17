package algorithm.withOOP.FKP;

public class Itemvalues {
	private int object;
	private int profit;
	private int weight;
	
	public Itemvalues(int object, int profit, int weight) {
		this.object = object;
		this.profit = profit;
		this.weight = weight;
	}
	public int getObject() {
		return object;
	}
	public void setObject(int object) {
		this.object = object;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Itemvalues [object=" + object + ", profit=" + profit + ", weight=" + weight + "]";
	}
}
