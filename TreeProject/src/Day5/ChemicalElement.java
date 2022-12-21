package Day5;


public class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	ChemicalElement left;
	ChemicalElement right;
	
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}

	public ChemicalElement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}

	@Override
	public int compareTo(ChemicalElement o) 
	{
		System.out.println("Comparing "+atomicNumber +" with "+o.atomicNumber);
		return (Integer.compare(atomicNumber, o.atomicNumber));
		
	}
	
}
