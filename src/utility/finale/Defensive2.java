package utility.finale;

public class Defensive2 {

	private Defensive1 def1;

	public Defensive1 getDef1() {
		Defensive1 deff = new Defensive1();
		deff.setA(def1.getA());
		deff.setB(def1.getB());
		return deff;
	}

	public Defensive2(Defensive1 def1)
	{
		Defensive1 deff = new Defensive1();
		deff.setA(def1.getA());
		deff.setB(def1.getB());
		this.def1 = deff;
	}

	@Override
	public String toString() {
		return "Defensive2 [def1=" + def1 + "]";
	}

	
}
